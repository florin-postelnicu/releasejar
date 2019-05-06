package mypackage01;

import java.io.*;

public class ReadAnWritejava {
    public static void main(String[] args) {
        String fileNameRead = "C:\\Users\\postelnicu\\IdeaProjects\\FlorinJavaProject\\src\\mypackage01\\temporarytext01.txt";
        String fileNameWrite = "C:\\Users\\postelnicu\\IdeaProjects\\FlorinJavaProject\\src\\mypackage01\\ReadWriteJava.txt.txt";
        String line = null;

        try{
            FileReader fileReader = new FileReader(fileNameRead);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter(fileNameWrite);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Hey! That;s the 1st attempt,");
            bufferedWriter.newLine();
            bufferedWriter.write("My name is  芙罗琳");
            bufferedWriter.newLine();
            bufferedWriter.write(" It's pronunciation is (Fú luó lín ");
            bufferedWriter.newLine();
            bufferedWriter.write("So, this is a text written to ");
            bufferedWriter.newLine();
            bufferedWriter.write("the new file !");
            bufferedWriter.newLine();

            while((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            bufferedReader.close();

        }catch (IOException ex ){
            ex.printStackTrace();
        }
    }
}
