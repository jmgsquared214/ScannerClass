package scannerclass;

import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * Created by Jamie M. Greene on 2/17/2017.
 */

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        scan.close();
        System.out.println("Hello World.");
        System.out.println(inputString);

    }
}

