import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by raymo on 5/25/2017.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 9999);
        Scanner s = new Scanner(System.in);
        PrintWriter p = new PrintWriter(socket.getOutputStream());
        BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while (true){
            String msgrecu = r.readLine();
            System.out.println(msgrecu);
            String msg = s.nextLine();
            p.println(msg);
            p.flush();

        }
    }
}
