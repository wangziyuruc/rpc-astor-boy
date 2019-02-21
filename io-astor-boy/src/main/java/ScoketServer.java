import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ScoketServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(20001);
        Socket client = null;
        client = server.accept();
        //获取Socket的输出流，用来向客户端发送数据
        PrintStream out = new PrintStream(client.getOutputStream());
        //获取Socket的输入流，用来接收从客户端发送过来的数据
        BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
        boolean f =true;
        while (f){
            System.out.println("与客户端建立连接");
            //接收从客户端发送过来的数据
            String str =  buf.readLine();
            if(str == null || "".equals(str)){
                f = false;
            }else{
                if("bye".equals(str)){
                    f = false;
                }else{
                    //将接收到的字符串前面加上echo，发送到对应的客户端
                    out.println("echo:" + str);
                }
            }
        }

    }
}
