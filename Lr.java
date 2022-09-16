import java.util.Scanner;

 class Lr {
    public static void main(String...s) {
        int a,b,c,large,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st no");
        a=sc.nextInt();
        System.out.println("enter 2nd no");
        b=sc.nextInt();
        System.out.println("enter 3rd no");
        c=sc.nextInt();
        temp=a>b?a:b;
        large=c>temp?c:temp;
        System.out.println("the largest no is:"+large);
    }
    
}
