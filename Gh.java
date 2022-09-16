class StaticFinalVariable 
{ 
    static final int a;
    static
    {
        a = 5;
    }
    static class A
     {
      static class B
      {
       static class C
       {
         //System.out.println("hie");
        }
      }
   }
 }
 
class MainClass 
{ 
    public static void main(String args[]) 
    { 
        StaticFinalVariable object = new StaticFinalVariable();
        System.out.println("Value of static final variable = "+ StaticFinalVariable.a);
        
        
    } 
}