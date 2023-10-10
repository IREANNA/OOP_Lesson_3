public class Student {
    protected String name;
    protected int age;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "\nStudent  " +
                "Name:" + name + "  " +
                "Age: " + age;
    }
}