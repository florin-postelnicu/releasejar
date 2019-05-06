package mypackage01;
/*
Reading an Ordinary Text File : use FileReader and wrap it in a BufferReader
 */

import java.io.*;

public class ReadingOrdinaryTextFilesJava {

    public static void main(String[] args) {
        //The name of the file to open
        //You need to know the name of the file and the path

        String filename = "C:\\Users\\postelnicu\\IdeaProjects\\FlorinJavaProject\\src\\mypackage01\\temporarytext01.txt";

        //*********Starting Reading from the file********
        //This will reference one line at a time

        String line = null; //Read on line at a time, so you need to create and initialize the var line

        try{
            // FileReader reads next files in the default encoding.
            FileReader fileReader = new FileReader(filename);// create an object fileReader

            // Always wrap FileReader in BufferReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);// Create the bufferedReader wrapper
                                                                            // for fileReader
            while((line = bufferedReader.readLine())!= null){// Begin reading the file,
                                                             // one line at a time, until finishing it.
                System.out.println(line);// print out the lines, or do something with the data
            }
            // Always close files
            bufferedReader.close();//close the file when finish reading it

        }catch(IOException ex){
            System.out.println("unable to open file :" + filename);// complete the try-catch bloc
                                                                   // k with the treatment of the errors
            //or we could do this:
            // ex.printStackTrace();


        }
    }
}
