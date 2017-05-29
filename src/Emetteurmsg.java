import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by raymo on 5/29/2017.
 */
public class Emetteurmsg implements Runnable {
    Socket emetteur;

    public Emetteurmsg(Socket emetteur) {
        this.emetteur = emetteur;
    }

    @Override
    public void run() {
        Scanner s = new Scanner(System.in);
        PrintWriter p = null;
        try {
            p = new PrintWriter(emetteur.getOutputStream());
            while (true){
                String msg = s.nextLine();
                p.println(msg);
                p.flush();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
