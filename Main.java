package unitests;
import com.company.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        List<String> list= new ArrayList<>();
        list.add("Red");
        list.add("Lime");
        list.add("Blue");
        list.add("White");
        list.add("Black");
        list.add("Yellow");
        System.out.print("enter the path of the image you want to scan the color:");
        String str=Project_code.starts(scanner.nextLine());
        System.out.print("The color is:"+str);
    }
}
