import java.util.Scanner;
class Factorial
     {
         void result()
         { int fact=1,n;
           while(n>0)
           {
               fact=fact*n;
               System.out.println("the factorial is:"+fact);

           }
        }
           void result()
           {
               int a,b;
               System.out.println("the power of num is :"+(Math.pow(a,b)));

           }
        
           void result()
           {
               int cost,l,b;
               System.out.println("total cost of boundary:"+(cost*(2*l*b)));

           }
        }
        class Run
        {
            public static void main(String args[])
            {
                int n,c,d,l,b;
                Factorial s=new Factorial();
                Scanner G=new Scanner(System.in);
                n=G.nextInt();
                s.result(n);
                  c=G.nextInt();
                  d=G.nextInt();
                  s.result(c,d);
                    l=G.nextInt();
                    b=G.nextInt();
                    obj.result(l,b);


                
            }
        }

        