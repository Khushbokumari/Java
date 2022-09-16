class Wrap
{  
    private int i;  
    Test(){}  
    Test(int i)
    {  
        this.i=i;  
    }  
    public int getValue()
    {  
        return i;  
    }  
    public void setValue(int i)
    {  
        this.i=i;  
    }  
    
     
    public String toString() {  
      return Integer.toString(i);  
    }  
}  
//Testing the custom wrapper class  
 class WrapperClassExample
{  
    public static void main(String[] args)
    {  
        Test i = new Test(10);  
        System.out.println(i);  
    }
}  