import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by raymo on 5/25/2017.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ssock = new ServerSocket(9999);
        Socket socket = ssock.accept();
        System.out.println("Connexion ouverte");

        Thread ecouteur = new Thread(new Ecouteurmsg(socket));
        Thread emetteur = new Thread(new Emetteurmsg(socket));
        ecouteur.start();
        emetteur.start();

    }
}
