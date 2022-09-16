class StaticFinalVariable 
{ 
    static final int a = 5;
} 
class MainClass 
{ 
    public static void main(String args[]) 
    { 
        StaticFinalVariable object = new StaticFinalVariable();
        System.out.println("Value of static final variable = "+ StaticFinalVariable.a);
        
        
    } 
}