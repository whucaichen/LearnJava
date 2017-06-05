package com.chance.tcp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class FileClient {

    public static void main(String[] args) {
        try {
            Socket s = new Socket("192.168.1.102", 10006);
            BufferedReader bufr = new BufferedReader(new FileReader("test.txt"));
            PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
            String line = null;
            while ((line = bufr.readLine()) != null) {
                pw.println(line);
            }
            pw.print("over");
            BufferedReader bufIn = new BufferedReader(new InputStreamReader(
                    s.getInputStream()));
            String str = bufIn.readLine();
            System.out.println(str);

            bufr.close();
            s.close();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

