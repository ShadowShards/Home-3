import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Home {


    public static void main(String[] args) throws IOException {

        long t =System.currentTimeMillis();
    try (FileInputStream in = new FileInputStream("123/2.txt")){
    byte[] arr =new byte[512];
        int x;
    while ((x = in.read(arr)) != -1){
    System.out.println(new String(arr, 0, x ));
    }
    }catch (IOException e){
    e.printStackTrace();
    }

    System.out.println(System.currentTimeMillis() - t);
    }
    }




    class Tet{
        public static void main(String[] args) throws IOException {
            ArrayList<InputStream> ali = new ArrayList<>();
            ali.add(new FileInputStream("123/1.txt"));
            ali.add(new FileInputStream("123/2.txt"));
            ali.add(new FileInputStream("123/3.txt"));
            ali.add(new FileInputStream("123/4.txt"));
            ali.add(new FileInputStream("123/5.txt"));

            SequenceInputStream sis = new SequenceInputStream(Collections.enumeration(ali));
            int x;

            while ((x = sis.read() )!=1){
                System.out.print((char)x);
            }
            sis.close();

        }
    }