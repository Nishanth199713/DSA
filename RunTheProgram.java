import java.io.*;
import java.util.*;

public class RunTheProgram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan= new Scanner(System.in);
        int num=scan.nextInt();
        for(int i=2;i<=num;i++)
        {
            System.out.print(i + " ");
        }
        scan.close();
    }
}