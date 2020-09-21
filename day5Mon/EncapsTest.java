package day5Mon;
class EncapsulationDemo{
    private String Name;
    private int Age;
    public String getName() {
    	return Name;
    }

    public void setName(String name) {
    	Name = name;
    }

    public int getAge() {
    	return Age;
    }

    public void setAge(int age) {
    	Age = age;
    }
  
}
public class EncapsTest{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setName("Mario");
         obj.setAge(32);
         System.out.println("Employee Name: " + obj.getName());
         System.out.println("Employee SSN: " + obj.getAge());

    } 
}



