import java.io.*;
import java.util.*;

public class NaturalNumbers2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int num1=scan.nextInt();
        int sum=0;
        for(int i=1;i<=num1;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
        scan.close();
    }
}