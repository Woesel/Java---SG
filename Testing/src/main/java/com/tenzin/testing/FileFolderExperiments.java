package com.tenzin.testing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Tenzin Woesel Jul 17, 2020
 */
public class FileFolderExperiments {

    public static void main(String[] args) throws IOException {

        File f = new File("Orders\\");
        File[] listFiles = f.listFiles();
        String[] s = f.list();
        String date;

        for (File file : listFiles) {//object type is a file

            date = file.getName().substring(7, 15);
            System.out.println(date);
            String path = file.getPath();
            System.out.println(path);
            Scanner scanner;
            
            scanner = new Scanner(new BufferedReader(new FileReader(file)));
            
            String currentLine;
            scanner.nextLine(); //this skips the first line(header)

            while (scanner.hasNextLine()) {
                currentLine = scanner.nextLine();
                Map<Integer, FMOrder> insideMap = orderMap.get(currentOrder.getOrderDate());
                orderMap.put(currentOrder.getOrderDate(), insideMap);
            }

        }
        }

//        for (int i = 0; i < s.length; i++) {//for a string array //just a string, not a whole file
//            String string = s[i]; //assign the string from the list to another string
//            date = string.substring(7, 15);//make a string called date and only put part of the "string" String
//            System.out.println(date);
//            //need to work with the whole file here...
//            String path = s.getPath();
//            System.out.println(path);
//        }
        Scanner sc = new Scanner(System.in);

        int orderNumber = 1;

        for (int i = 1; i < 10; i += orderNumber) {

            System.out.println(i);

        }

        ArrayList<Integer> list = new ArrayList<>();

        String input = sc.nextLine();

        Pattern aPattern = Pattern.compile("");
        Matcher aMatcher = aPattern.matcher(input);

        System.out.println(aMatcher.toString());

        if (!aMatcher.matches()) {
            System.out.println("Matches");
        } else {
            System.out.println("Doesnt match");
        }

    }

}
