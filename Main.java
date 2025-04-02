package unitests;
import com.company.*;
import java.util.Scanner;
/**
 * Main class to run the program and determine the color from an image.
 */
public class Main {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("enter the path of the image you want to scan the color:");

        // Read the file path from user input and pass it to the Project_code class for processing
        String str=Project_code.findColName(scanner.nextLine());
        
        System.out.print("The color is:"+str);
    }
}
