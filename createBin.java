import java.io.*;

public class createBin {
    public static void main( String[] args ) {
        String str = "qwertyuiop23AbjksdfAGFHF\nasdfjklasdf3";
        try {
            ObjectOutputStream out = new ObjectOutputStream
                ( new FileOutputStream( "secret.dat" ) );
            out.writeObject(str);
            out.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
