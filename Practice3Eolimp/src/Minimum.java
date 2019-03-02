import  java.util.Scanner;
import java.util.Stack;

public class Minimum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(" ");
        Scanner scan = new Scanner(System.in);


        Stack<Long > st = new Stack<>();

        long n = 0;
        long a = 0;
        long b = 0;
        long c = 0;
        long x0 = 0;

        long res = 0;

        while(scan.hasNext())
        {

            n = scan.nextLong();
            a = scan.nextLong();
            b = scan.nextLong();
            c = scan.nextLong();
            x0 = scan.nextLong();


            kostya();

        }
        
        private void kostya()
        {
            for(int i = 0;i < n;i++)
            {
                x0 = (a * x0 * x0 + b * x0 + c) / 100 % 1000000;


                if (x0 % 5 < 2)
                {
                    if (!st.empty())
                    {
                        st.pop();
                        if (!st.empty()) res += st.lastElement();
                    }
                }
                else
                {
                    if (st.empty()) st.push(x0);
                    else st.push(Math.min(x0, st.lastElement()));
                    res += st.lastElement();
                }
             }
            System.out.println(res);
        }


            }



    }

}
