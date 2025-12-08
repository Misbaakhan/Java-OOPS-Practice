
public class Encapsulation {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Encapsulation(String name, int age) {
        this.name = name;
        setAge(age);
    }

    @Override
    public String toString() {
        return "Encapsulation [name=" + name + ", age=" + age + "]";
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation("misba", 20);
        System.out.println(e);

    }

}
