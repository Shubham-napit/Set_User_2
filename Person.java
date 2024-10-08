public class Person implements Comparable<Person>{

    private String name;
    private int age;
    private String Address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        Address = address;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", Address=" + Address + "]";
    }

    @Override
    public int compareTo(Person o) {
        return 0; 
    }

}