package inflearnJava.chap28;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketMain {
    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        Socket socket = null;

        OutputStream outputStream = null;
        DataOutputStream dataOutputStream = null;

        InputStream inputStream = null;
        DataInputStream dataInputStream = null;

        try {

            serverSocket = new ServerSocket(9000);
            System.out.println("클라이언트 맞을 준비 완료~~");

            socket = serverSocket.accept();
            System.out.println("클라이언트 연결!!");
            System.out.println("socket : " + socket);

            inputStream = socket.getInputStream();
            dataInputStream = new DataInputStream(inputStream);

            outputStream = socket.getOutputStream();
            dataOutputStream = new DataOutputStream(outputStream);

            while(true){
                String clientMessage = dataInputStream.readUTF();
                System.out.println("clientMessage : " + clientMessage);

                dataOutputStream.writeUTF("메시지 전송 완료~~~");
                dataOutputStream.flush();

                if(clientMessage.equals("STOP")) break;
            }

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if(socket != null) socket.close();
                if(serverSocket != null) serverSocket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
