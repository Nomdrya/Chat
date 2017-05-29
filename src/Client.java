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

        Thread ecouteur = new Thread(new Ecouteurmsg(socket));
        Thread emetteur = new Thread(new Emetteurmsg(socket));
        ecouteur.start();
        emetteur.start();
    }
}
