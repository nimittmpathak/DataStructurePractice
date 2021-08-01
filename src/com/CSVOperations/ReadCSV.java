package com.CSVOperations;
import java.io.File;
import java.util.*;
import java.util.Scanner;

public class ReadCSV {
    public static void main(String args[]){
        //
        List<List<String>> records = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File("C:\\Nimitt\\Programming\\Javas\\DataStructurePractice\\src\\com\\CSVOperations\\test.csv"));){
            while(scanner.hasNextLine()){
                records.add(getRecodFromLine(scanner.nextLine()));
            }
            
        }
        catch (Exception e){
            System.out.println(e);
        }
        int count=0;
        for(String item : records.get(count)){
            System.out.println(item);
            count++;
        }
        System.out.print(records);
    }

    public static List<String> getRecodFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try(Scanner rowScanner = new Scanner(line)){
            rowScanner.useDelimiter(",");
            while (rowScanner.hasNext()){
                values.add(rowScanner.next());
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return values;
    }
}
