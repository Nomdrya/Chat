import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by raymo on 5/29/2017.
 */
public class Ecouteurmsg implements Runnable{
    Socket aecouter;
    public Ecouteurmsg(Socket aecouter){
        this.aecouter= aecouter;
    }



    @Override
    public void run() {
        try {
            BufferedReader r = new BufferedReader(
                    new InputStreamReader(aecouter.getInputStream()));
            while (true) {
                String msgrecu = r.readLine();
                System.out.println(msgrecu);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
