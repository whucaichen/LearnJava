package com.chance.tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Chance on 16/09/20.
 */
class FileServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(10006);
            Socket s = ss.accept();

            BufferedReader bufIn = new BufferedReader(new InputStreamReader(
                    s.getInputStream()));
            PrintWriter out = new PrintWriter(new FileWriter("test1.txt"), true);
            String line = null;
            while ((line = bufIn.readLine()) != null) {
                if ("over".equals(line))
                    break;
                out.println(line);
            }
            PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
            pw.println("上传成功");

            out.close();
            s.close();
            ss.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
