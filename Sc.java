import java.util.Scanner;
 class Factorial
     {
         void result(int n)
         { int fact=1;
           while(n!=0)
           {
               fact=fact*n;
               n--;
            }

               System.out.println("the factorial is:"+fact);

           }
        
           void result(int a,int b)
           {
            
               
               System.out.println("the power of num is :"+(Math.pow(a,b)));

           }
        
           void result(int cost,int l,int b)
           {
               
               System.out.println("total cost of boundary:"+(cost*(2*l*b)));

           }
        }
        class Test
        {
            public static void main(String args[])
            {
                Scanner G=new Scanner(System.in);
                int j,c,d;
                System.out.println("enter no");
                j=G.nextInt();
                Factorial s=new Factorial();
                s.result(j);
                System.out.println("enter two nos");
                  c=G.nextInt();
                  d=G.nextInt();
                  s.result(c,d);
                  int cost,l,b;
                  System.out.println("enter cost");
                  cost=G.nextInt();
                  System.out.println("enter length");
                    l=G.nextInt();
                    System.out.println("enter breadth");
                    b=G.nextInt();
                    s.result(cost,l,b);


                
            }
        }

        