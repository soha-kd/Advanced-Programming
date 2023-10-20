package com.company;

import java.io.*;
import java.util.ArrayList;

public class FileException {
    private final ArrayList<String> str = new ArrayList<>();

    public void getStrings(String filePath) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                str.add(line);
            }
            throw new EOFException("End");
        } catch (FileNotFoundException fn) {
            System.out.println("Error-File Not Found");
        } catch (EOFException EOF) {
            System.out.println("Done reading file");
        } catch (IOException ioe) {
            System.out.println("Problem reading file " + ioe.getMessage());
        }
    }


    public void getStrings() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("./examples.txt"))) {
            String line;
            bufferedReader.close();
            while ((line = bufferedReader.readLine()) != null) {
                str.add(line);
            }
            throw new EOFException("End");
        } catch (FileNotFoundException fn) {
            System.out.println("Error - File Not Found");
        } catch (EOFException EOF) {
            System.out.println("Done reading file");
        } catch (IOException ioe) {
            System.out.println("Problem in reading the file " + ioe.getMessage());
        }
    }


    public ArrayList<String> returnStr() {
        return this.str;
    }
}
