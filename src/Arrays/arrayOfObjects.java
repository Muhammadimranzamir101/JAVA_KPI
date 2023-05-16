package Arrays;

public class arrayOfObjects {
    public static void main(String[] args) {
        Person[] peopleArray = {
                new Person("Shariq", 25),
                new Person("Hammad", 30),
                new Person("Imran", 22)
        };

        System.out.println(peopleArray[0].getName());
        System.out.println(peopleArray[1].getAge());

        peopleArray[2].setName("Farhad");
        System.out.println(peopleArray[2].getName());
    }
}

class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
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
}
