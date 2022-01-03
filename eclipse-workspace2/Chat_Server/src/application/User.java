package application;

 import java.io.IOException;
 import java.io.InputStream;
 import java.io.OutputStream;
 import java.net.Socket;

 public class User {
  // 네트워크 상에서 통신할 수 있게 만들어주는 소켓
 Socket socket;

  public User(Socket socket) { 
   this.socket = socket;
   // 반복적으로 메세지 받기
  receive();
  }
  // 메세지 전달 메소드
 public void receive() {
   Runnable thread = new Runnable() {
    @Override
    public void run() {
     try {
      // 반복적으로 내용을 받기 위해 while 사용
     while(true) {
       // 내용 전달을 위한 inputStream 객체
      InputStream in = socket.getInputStream();
       byte[] buffer = new byte[4096];
       //메세지의 크기
      int length = in.read(buffer);
       while(length==-1) throw new IOException();

       //서버에 접속한 사용자의 주소정보 출력, Thread 이름 출력
      System.out.println("[메세지 수신 성공]"+socket.getRemoteSocketAddress()
       +" : "+Thread.currentThread().getName());

       //전달받은 값을 한글도 포함 할 수 있도록 UTF-8 설정
      String message = new String(buffer,0,length,"UTF-8");
       // 전달받은 메세지를 다른 클라이언트들에게 보낼 수 있도록 만들어줌
      for(User user:Main.user) {
        user.send(message);
       }

      }
     } catch (Exception e) { 
      try {
       System.out.println("[메세지 수신 오류]"+socket.getRemoteSocketAddress()
       +" : "+Thread.currentThread().getName());
      } catch (Exception e2) {
       e2.printStackTrace();
      }

     }
    }
   };
   // 메인함수에 있는 threadpool에 제출
  // threadpool에 만들어진 하나의 thread 등록
  Main.threadPool.submit(thread);
   
  }
  // 메세지 전달 메소드
 public void send(String message) {
   Runnable thread = new Runnable() {
    @Override
    public void run() {
     try {
      OutputStream out = socket.getOutputStream();
      byte[] buffer = message.getBytes("UTF-8");
      //버퍼에 담긴 내용을 서버에서 유저에게 전송
     out.write(buffer);
      out.flush();
     } catch (Exception e) {
      try {
       System.out.println("[메세지 송수신 오류]"+socket.getRemoteSocketAddress()
       +" : "+Thread.currentThread().getName());
       Main.user.remove(this);
       socket.close();
      } catch (Exception e2) {
       e2.printStackTrace();
      }
     }
    }
   };
   Main.threadPool.submit(thread);
  }

  // 생성자

}


 
