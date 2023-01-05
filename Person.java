public class Person {
    private String fullName;
    private int age;
    public void talk(String name1, String name2){
        System.out.println(name1 + " and " + name2 + " are talking");
    }
    public void talk(String name){
        System.out.println(name + " is talking");
    }
    public void move(String name){
        System.out.println(name + " is moving");
    }
    public String getFullName(){
        return this.fullName;
    }
    public int getAge(){
        return this.age;
    }
    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public Person(){
        this.fullName = "Student ";
        this.age = 17;
    }
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
}
