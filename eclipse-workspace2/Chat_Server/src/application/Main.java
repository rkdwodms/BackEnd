
package application;
 import java.net.InetSocketAddress;
 import java.net.ServerSocket;
 import java.net.Socket;
 import java.util.Iterator;
 import java.util.Vector;
 import java.util.concurrent.ExecutorService;
 import java.util.concurrent.Executors;

 import javafx.application.Application;
 import javafx.application.Platform;
 import javafx.geometry.Insets;
 import javafx.scene.Scene;
 import javafx.scene.control.Button;
 import javafx.scene.control.TextArea;
 import javafx.scene.layout.BorderPane;
 import javafx.scene.text.Font;
 import javafx.stage.Stage;

 public class Main extends Application {

  // 쓰레드 풀 활용
 public static ExecutorService threadPool;
  //접속한 유저 관리
 public static Vector<User> user = new Vector<User>();

  //서버 소켓 생성
 ServerSocket serverSocket;
  //유저 연결 기다리는 메소드
 public void startServer(String IP, int port) {
   try {
    serverSocket = new ServerSocket();
    // 특정한 ip번호와 port 번호로 특정한 클라이언트에게 접속을 기다리게 해줌
   serverSocket.bind(new InetSocketAddress(IP,port));
   } catch (Exception e) {
    e.printStackTrace();
    // 서버 소켓이 닫혀있는 경우가 아니라면
   if(!serverSocket.isClosed()) {
     stopServer(); // 서버를 종료
   }
    return;
   }
   Runnable thread = new Runnable() {
    @Override
    public void run() {
     // 계속해서 새로운 클라이언트가 접속할 수 있도록 
    while(true) {
      try {
       Socket socket = serverSocket.accept();
       user.add(new User(socket));
       System.out.println("[사용자 접속]"+socket.getRemoteSocketAddress()
       +" : "+Thread.currentThread().getName());
      } catch (Exception e) {
       // 서버 소켓에 문제가 생긴거니 서버를 종료 시키고 break문을 활용해 종료
      if(!serverSocket.isClosed()) {
        stopServer();
       }
       break;
      }
     }
    }
   };
   // thread pool 초기화
  threadPool = Executors.newCachedThreadPool();
   // 사용자가 접속을 원하는 스레드를 넣어줍니다.
   threadPool.submit(thread);

  }
  // 서버 작동 중지 메소드
 public void stopServer() {
   try {
    // 현재 작업중인 모든 소켓 닫기
   Iterator<User> iterator = user.iterator();
    // 각자에게 접근
   while(iterator.hasNext()) {
     User user = iterator.next();
     user.socket.close();
     iterator.remove();
    }
    // 서버 소켓 객체 닫기
   if(serverSocket != null &&!serverSocket.isClosed()) {
     serverSocket.close();
    }
    // threadPool 종료
   if(threadPool != null && !threadPool.isShutdown()) {
     threadPool.shutdown();
    }
   } catch (Exception e) {
    // TODO: handle exception
   }

  }

  //UI를 생성& 프로그램 동작
 @Override
  public void start(Stage primarStage) {
   // 디자인 틀을 담을 pan을 생성
  BorderPane root = new BorderPane();
   // 내부 padding
   root.setPadding(new Insets(5));
   
   TextArea textArea = new TextArea();
   textArea.setEditable(false);
   textArea.setFont(new Font("나눔고딕",15));
   root.setCenter(textArea);
   
   // 스위치 역할의 Toggle Button
   Button toggleButton = new Button("시작하기");
   toggleButton.setMaxWidth(Double.MAX_VALUE);
   BorderPane.setMargin(toggleButton, new Insets(1,0,0,0));
   root.setBottom(toggleButton);
   
   // 자신의 로컬 서버
  String IP ="192.168.241.92";
   int port = 7777;
   
   toggleButton.setOnAction(event->{
    if(toggleButton.getText().equals("시작하기")) {
     startServer(IP,port);
     // textArea에 바로 출력을 할 수 없음, runLator와 같은 함수를 이용해 gui 요소를 출력할 수 있도록 함
    Platform.runLater(()->{
      String message = String.format("[서버 시작]\n", IP,port);
      textArea.appendText(message);
      toggleButton.setText("종료하기");
     });
    }else {
     stopServer();
     Platform.runLater(()->{
      String message = String.format("[서버 종료]\n", IP,port);
      textArea.appendText(message);
      toggleButton.setText("시작하기");
     });
    }
   });
   Scene scene= new Scene(root,500,500);
   primarStage.setTitle("[ 채팅 서버 ]");
   primarStage.setOnCloseRequest(event->stopServer());
   primarStage.setScene(scene);
   primarStage.show();
   
  }
  public static void main(String[] args) {
 //  System.out.println(1);
   launch(args);
  }
 }



