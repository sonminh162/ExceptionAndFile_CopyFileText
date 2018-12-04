import java.io.*;

public class Application {
    public static void main(String[] args) {
        try{
            File inFile = new File("D:\\check.txt");
            FileReader fileReader = new FileReader(inFile);
            BufferedReader reader = new BufferedReader(fileReader);

            String contentSaved = null;
            String line = null;
            while((line = reader.readLine()) != null){
                contentSaved = line;
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("D:\\ContentCopy.txt")));
            writer.write(contentSaved);
            writer.close();
            System.out.println("Success...");
        }catch(Exception e ){
            e.printStackTrace();
        }
    }
}
