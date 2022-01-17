import java.io.*;

public class test {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        byte[] buf = new byte[10];
        for( int i=0; i<buf.length; i++ )
        {
            buf[i] = (byte)i;
        }

        try{
            PrintWriter out = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    new FileOutputStream("a.txt")
                            )
                    )
            );
            int i = 123456;
            out.println(i);
            out.close();

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("test.java")
                    )
            );
            String line;
            while( (line=in.readLine()) != null ){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}