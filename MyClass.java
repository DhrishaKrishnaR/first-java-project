
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Calendar;
import java.util.regex.Pattern; 
import java.io.IOException; 
class MyClass
{
    public static void main(String[] args)
    {
        try {
            File Obj = new File("D:\\Dhrisha Krishna\\Filedata.txt");
            Scanner sc = new Scanner(Obj);
            while (sc.hasNextLine()) 
            {
                String data = sc.nextLine();
                String[] splited = data.split(" ");
                String regex="[7-9]{1}[0-9]{9}";
                if(Pattern.matches(regex,splited[1]))
                {
                	String fileName = splited[0] + ".txt";
                	File files = new File(fileName);
                    files.createNewFile();
                    FileWriter Writer = new FileWriter(fileName);
                    Calendar cal=Calendar.getInstance();
                    Writer.write(cal.getTime()+"\n");
                    Writer.close();
    
                }
            }  
            sc.close();
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}
