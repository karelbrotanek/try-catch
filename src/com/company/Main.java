package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("hello"));

            bw.write("line1");
            bw.newLine();
            bw.write("line2");
            bw.newLine();
            bw.write("line3");

            bw.close();

        } catch (IOException e) {
            System.out.println("Unable to write to file...");
            
        }
    }
}
