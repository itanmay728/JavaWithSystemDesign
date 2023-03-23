class student{
   private int age ;
   private String name;
   public void setAge(int age){
       this.age = age;
   }
    public void setName( String name){
        this.name = name;
    }

    public int getAge(){
       return age;
    }
    public String getName(){
       return name;
    }
   public void show(){
       System.out.println(age + " " + name);
   }


}
public class Main {
    public static void main(String[] args) {

        student obj = new student();

        obj.setName("tanmay");
        obj.setAge(22);
        obj.show();

        student obj1 = new student();
        obj1.setName("Tanmay");
        obj1.setAge(23);
        obj1.show();

        int age = obj.getAge();
        String name = obj.getName();
        System.out.println(age + " " + name);

    }
}