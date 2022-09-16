class Person
{
    String name;
    String address;
    static final String COUNTRYNAME;
    
    static
    {
        COUNTRYNAME = "India";
    }
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    
    void showData(Person person)
    {
        System.out.println("Name of Person : " + person.getName());
        System.out.println("Address of person : " + person.getAddress());
        System.out.println("Country of person : "+  person.COUNTRYNAME);
    }
    
    public static void main(String arg[])
    {
        Person person1 =  new Person();
        person1.setName("Ram");
        person1.setAddress("India");
        person1.showData(person1);
        
        Person person2 =  new Person();
        person2.setName("John");
        person2.setAddress("USA");
        person2.showData(person2);
    }
}