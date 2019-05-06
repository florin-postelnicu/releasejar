package mypackage01;
/*
o write a text file in Java use FileWrite instead of FileReader, and BufferedOutputWriter
*/

import java.io.*;
public class WritingTextFilesJava {

    public static void main(String[] args) {

        // The name of the file to write on
        String fileName = "writetext.txt";

        try {
            // Assume default encoding
            FileWriter fileWriter = new FileWriter(fileName);

            //Always wrap the FileWriter in the BufferedWriter
            BufferedWriter buffereedWriter = new BufferedWriter(fileWriter);
            // Note that write() does not automatically
            // append a new line character

            buffereedWriter.write("Hey! That;s the 1st attempt,");
            buffereedWriter.newLine();
            buffereedWriter.write("My name is  芙罗琳");
            buffereedWriter.newLine();
            buffereedWriter.write(" It's pronunciation is (Fú luó lín ");
            buffereedWriter.newLine();
            buffereedWriter.write("So, this is a text written to ");
            buffereedWriter.newLine();
            buffereedWriter.write("the new file !");
            buffereedWriter.newLine();

            // Always close the file
            buffereedWriter.close();


        }catch (IOException ex){
            System.out.println("Error writing to the file '" + fileName + "'");
        }
    }
}
