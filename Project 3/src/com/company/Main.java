package com.company;

public class Main {

    public static void main(String[] args) {

        //wrong input
        try {
            String example2 = "advanceProject123+thirdOne";
            for (int i = 0; i < example2.length(); i++) {
                FormatException.checker(example2.charAt(i));
            }
            System.out.println(FormatException.returnIntake());
        } catch (Exception e) {
            System.out.println("Error in Input");
        } //throws an exception if a characters is not in the set { 'a'..'z', '0'..'9', 'A'..'Z' }.
        System.out.println("--------------------------------------------------------------------------------------------");
        FileException F = new FileException();

        F.getStrings("./examples.txt");
        for (String line : F.returnStr())
        {
            System.out.println(line);
        }
        System.out.println("--------------------------------------------------------------------------------------------");
        F.getStrings("./wrongExample.txt");
        System.out.println("-------------------------------------------------------------------------------------------- ");
        F.getStrings();
        //reads an array of String from a file and catches in order: FileNotFoundException (handled by
        //printing “Error—file not found”), EOFException (handled by printing “Done reading file”),
        // and IOException (handled by printing “Problem reading file”+ e.getmessage).

    }
}
