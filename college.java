Interface college
{
void study();
}
Interface school
{
void study();
}
class Certificate implements college,school
{
public void study()
{
System.out.println("marks got 588 out of 600");
}
public static void main(String...s)
{
Certificate c=new Certificate();
c.study();
}
} 