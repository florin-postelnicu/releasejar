package mypackage01;
/*

If you want to read a binary file, or a text file containing 'weird' characters
(ones that your system doesn't deal with by default),
you need to use FileInputStream instead of FileReader. Instead of wrapping FileInputStream in a buffer,
FileInputStream defines a method called read() that lets you fill a buffer with data,
automatically reading just enough bytes to fill the buffer (or less if there aren't that many bytes left to read).
 */

import java.io.*;

public class ReadingBinaryFilesJava {
    public static void main(String[] args) {

        // The name of the file to open
        String fileName ="C:\\Users\\postelnicu\\IdeaProjects\\FlorinJavaProject\\src\\mypackage01\\temporarytext01.txt";

        try {
            // Use this for reading data.
            byte[] buffer = new byte[1000];
            FileInputStream inputStream = new FileInputStream(fileName);

            // read fillsfills buffer with data and returns
            //the number of bytes read(whic may be less
            // than the buffer size, but it will never be more).
            int total = 0;
            int nRead = 0;
            while((nRead = inputStream.read(buffer))!= -1) {

                //Convert to String so we can display it.
                System.out.println(new String(buffer));
                total += nRead;
            }
            //Always close file
            inputStream.close();
            System.out.println("Read "+ total+ " bytes");
        }catch (FileNotFoundException ex) {
            System.out.println("Unable to find file : '"+ fileName +"'");
        }catch(IOException ex) {
            System.out.println("Error reading file  '" + fileName + "'");
            // Or we could have do this:
            // ex.printstackTrace();
        }
    }
}
