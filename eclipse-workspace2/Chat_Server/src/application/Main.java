
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

  // ������ Ǯ Ȱ��
 public static ExecutorService threadPool;
  //������ ���� ����
 public static Vector<User> user = new Vector<User>();

  //���� ���� ����
 ServerSocket serverSocket;
  //���� ���� ��ٸ��� �޼ҵ�
 public void startServer(String IP, int port) {
   try {
    serverSocket = new ServerSocket();
    // Ư���� ip��ȣ�� port ��ȣ�� Ư���� Ŭ���̾�Ʈ���� ������ ��ٸ��� ����
   serverSocket.bind(new InetSocketAddress(IP,port));
   } catch (Exception e) {
    e.printStackTrace();
    // ���� ������ �����ִ� ��찡 �ƴ϶��
   if(!serverSocket.isClosed()) {
     stopServer(); // ������ ����
   }
    return;
   }
   Runnable thread = new Runnable() {
    @Override
    public void run() {
     // ����ؼ� ���ο� Ŭ���̾�Ʈ�� ������ �� �ֵ��� 
    while(true) {
      try {
       Socket socket = serverSocket.accept();
       user.add(new User(socket));
       System.out.println("[����� ����]"+socket.getRemoteSocketAddress()
       +" : "+Thread.currentThread().getName());
      } catch (Exception e) {
       // ���� ���Ͽ� ������ ����Ŵ� ������ ���� ��Ű�� break���� Ȱ���� ����
      if(!serverSocket.isClosed()) {
        stopServer();
       }
       break;
      }
     }
    }
   };
   // thread pool �ʱ�ȭ
  threadPool = Executors.newCachedThreadPool();
   // ����ڰ� ������ ���ϴ� �����带 �־��ݴϴ�.
   threadPool.submit(thread);

  }
  // ���� �۵� ���� �޼ҵ�
 public void stopServer() {
   try {
    // ���� �۾����� ��� ���� �ݱ�
   Iterator<User> iterator = user.iterator();
    // ���ڿ��� ����
   while(iterator.hasNext()) {
     User user = iterator.next();
     user.socket.close();
     iterator.remove();
    }
    // ���� ���� ��ü �ݱ�
   if(serverSocket != null &&!serverSocket.isClosed()) {
     serverSocket.close();
    }
    // threadPool ����
   if(threadPool != null && !threadPool.isShutdown()) {
     threadPool.shutdown();
    }
   } catch (Exception e) {
    // TODO: handle exception
   }

  }

  //UI�� ����& ���α׷� ����
 @Override
  public void start(Stage primarStage) {
   // ������ Ʋ�� ���� pan�� ����
  BorderPane root = new BorderPane();
   // ���� padding
   root.setPadding(new Insets(5));
   
   TextArea textArea = new TextArea();
   textArea.setEditable(false);
   textArea.setFont(new Font("�������",15));
   root.setCenter(textArea);
   
   // ����ġ ������ Toggle Button
   Button toggleButton = new Button("�����ϱ�");
   toggleButton.setMaxWidth(Double.MAX_VALUE);
   BorderPane.setMargin(toggleButton, new Insets(1,0,0,0));
   root.setBottom(toggleButton);
   
   // �ڽ��� ���� ����
  String IP ="192.168.241.92";
   int port = 7777;
   
   toggleButton.setOnAction(event->{
    if(toggleButton.getText().equals("�����ϱ�")) {
     startServer(IP,port);
     // textArea�� �ٷ� ����� �� �� ����, runLator�� ���� �Լ��� �̿��� gui ��Ҹ� ����� �� �ֵ��� ��
    Platform.runLater(()->{
      String message = String.format("[���� ����]\n", IP,port);
      textArea.appendText(message);
      toggleButton.setText("�����ϱ�");
     });
    }else {
     stopServer();
     Platform.runLater(()->{
      String message = String.format("[���� ����]\n", IP,port);
      textArea.appendText(message);
      toggleButton.setText("�����ϱ�");
     });
    }
   });
   Scene scene= new Scene(root,500,500);
   primarStage.setTitle("[ ä�� ���� ]");
   primarStage.setOnCloseRequest(event->stopServer());
   primarStage.setScene(scene);
   primarStage.show();
   
  }
  public static void main(String[] args) {
 //  System.out.println(1);
   launch(args);
  }
 }



