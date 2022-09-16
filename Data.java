import java.util.Scanner;

public class Data {
    int r1,r2,r3,r4;
    int weight;
    Data(int weight,int r1,int r2,int r3,int r4)
    {
        this.weight=weight;
        this.r1=r1;
        this.r2=r2;
        this.r3=r3;
        this.r4=r4;
    }
}
class Calculation extends Data
{
   double x,wm,ww;
    double result;
    Calculation(int weight,int r1,int r2,int r3,int r4)
    {
        super(weight,r1,r2,r3,r4);
    }

    void calculate()
    {
        x=(double)weight/(r1+r2);
        
        wm=x*r1;
        ww=x*r2;
        result =(double)((wm*r4)-(ww*r3))/r3;
        System.out.println("The amount of water to be added"+result);
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int weight=sc.nextInt();
        int r1=sc.nextInt();
        int r2=sc.nextInt();
        int r3=sc.nextInt();
        int r4=sc.nextInt();
        
        Calculation c =new Calculation(weight,r1,r2,r3,r4);
        c.calculate();
    }
    
}

