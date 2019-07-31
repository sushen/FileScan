package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        File file = new File("pg60020.txt");
        Scanner fileScanner = new Scanner(file);
        System.out.println(fileScanner);

        int word = 0;
        while (fileScanner.hasNextLine()){
            String line = fileScanner.nextLine();
            word += line.split(" ").length;

        }
        System.out.println(word);


    }
}
