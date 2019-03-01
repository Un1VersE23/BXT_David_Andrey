import java.util.Scanner;

public class Sphere {

static Scanner scan = new Scanner(System.in);
    static Scanner scan2 = new Scanner(System.in);
    static int colors[];

    static int calculate(int n)
    {
        int maxValue = 0;
         colors = new int[9];

       for(int i = 0;i<n;i++)
       {

           int nextColor = scan2.nextInt();
           colors[nextColor-1] = colors[nextColor-1] + 1 ;
          // System.out.println("array"+nextColor);
           for(int j=0;j<colors.length;j++){
              // System.out.println(colors[j]);
           }
       }
       for( int i = 0; i < colors.length; i ++)
       {
           if(colors[i] > maxValue)
           {
               maxValue = colors[i];
           }
       }
       // System.out.println(n +" "+ maxValue);
        return n - maxValue;
    }

    public static void main(String args[]) {
        while (scan.hasNext())
        {
            int enteredNumber = scan.nextInt();
            System.out.println(calculate(enteredNumber ));

        }
    }
}
