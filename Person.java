abstract class Person {
    private String name;
    protected Person(String name ) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Student extends Person {
    public Student(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Student stu = new Student("Mickey");
        System.out.println(stu.getName());
        stu.setName("Super Mouse");
        System.out.println(stu.getName());
    }
}