package application;

 import java.io.IOException;
 import java.io.InputStream;
 import java.io.OutputStream;
 import java.net.Socket;

 public class User {
  // ��Ʈ��ũ �󿡼� ����� �� �ְ� ������ִ� ����
 Socket socket;

  public User(Socket socket) { 
   this.socket = socket;
   // �ݺ������� �޼��� �ޱ�
  receive();
  }
  // �޼��� ���� �޼ҵ�
 public void receive() {
   Runnable thread = new Runnable() {
    @Override
    public void run() {
     try {
      // �ݺ������� ������ �ޱ� ���� while ���
     while(true) {
       // ���� ������ ���� inputStream ��ü
      InputStream in = socket.getInputStream();
       byte[] buffer = new byte[4096];
       //�޼����� ũ��
      int length = in.read(buffer);
       while(length==-1) throw new IOException();

       //������ ������ ������� �ּ����� ���, Thread �̸� ���
      System.out.println("[�޼��� ���� ����]"+socket.getRemoteSocketAddress()
       +" : "+Thread.currentThread().getName());

       //���޹��� ���� �ѱ۵� ���� �� �� �ֵ��� UTF-8 ����
      String message = new String(buffer,0,length,"UTF-8");
       // ���޹��� �޼����� �ٸ� Ŭ���̾�Ʈ�鿡�� ���� �� �ֵ��� �������
      for(User user:Main.user) {
        user.send(message);
       }

      }
     } catch (Exception e) { 
      try {
       System.out.println("[�޼��� ���� ����]"+socket.getRemoteSocketAddress()
       +" : "+Thread.currentThread().getName());
      } catch (Exception e2) {
       e2.printStackTrace();
      }

     }
    }
   };
   // �����Լ��� �ִ� threadpool�� ����
  // threadpool�� ������� �ϳ��� thread ���
  Main.threadPool.submit(thread);
   
  }
  // �޼��� ���� �޼ҵ�
 public void send(String message) {
   Runnable thread = new Runnable() {
    @Override
    public void run() {
     try {
      OutputStream out = socket.getOutputStream();
      byte[] buffer = message.getBytes("UTF-8");
      //���ۿ� ��� ������ �������� �������� ����
     out.write(buffer);
      out.flush();
     } catch (Exception e) {
      try {
       System.out.println("[�޼��� �ۼ��� ����]"+socket.getRemoteSocketAddress()
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

  // ������

}


 
