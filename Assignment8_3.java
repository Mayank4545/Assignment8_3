import java.io.*;

public class Assignment8_3 {

	public static void main(String [] args) {

        // File to read from.
        String fileName = "C:\\Users\\Mayank\\Desktop\\file.txt";
        // File to write
        String fileWrite = "C:\\Users\\Mayank\\Desktop\\file_new.txt";

        try {
            
            byte[] buffer = new byte[100];

            // Read the file
            FileInputStream inputStream = 
                new FileInputStream(fileName);

            while((inputStream.read(buffer)) != -1) {
                // Convert to String so we can display it.
                System.out.println(new String(buffer));
                
                //Write to the new file
                FileWriter fileWriter =
                    new FileWriter(fileWrite);

                
                @SuppressWarnings("resource")
				BufferedWriter bufferedWriter =
                    new BufferedWriter(fileWriter);

                
                bufferedWriter.write(new String(buffer));
                bufferedWriter.close();
            }   

            //close file
            inputStream.close();        

        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");
            
        }
    }
	
}
