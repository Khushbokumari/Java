import java.util.Scanner;
 class Facto
     {
         void result(int n)
         { int fact=1;
           while(n>0)
           {
               fact=fact*n;
               System.out.println("the factorial is:"+fact);

           }
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
            
                
                Scanner sc=new Scanner(System.in);
                Facto k=new Facto();
                int fact=sc.nextInt();
                k.result(fact);
                 int c=sc.nextInt();
                 int d=sc.nextInt();
                  k.result(c,d);
                   int l=sc.nextInt();
                   int b=sc.nextInt();
                    int cost=sc.nextInt();
                    k.result(cost,l,b);


                
            }
        }

        