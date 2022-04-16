package test;

import java.io.*;
import java.net.URISyntaxException;


public class Hellow {

    public static void main(String[] args) throws URISyntaxException, IOException {
        File f= new File(Hellow.class.getClassLoader().getResource("test/test").toURI());
        //File f= new File("test1");
        BufferedReader br = new BufferedReader(new FileReader(f));
        System.out.println(br.readLine());
        br.close();
    }
}
