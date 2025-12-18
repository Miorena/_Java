public class Student {
    // Attrinutes
    private String name;
    private int age;
    private double average;

    // Default Constructor
    public Student() {
        this.name = "none";
        this.age = 0;
        this.average = 0.0;
    }

    // Parameterized Constructor
    public Student(String name, int age, double average) {
        this.setName(name);
        this.setAge(age);
        this.setAverage(average);
    }

    // Getters
    public String getName() {return name;}
    public int getAge() {return age;}
    public double getAverage() {return average;}

    // Setters
    public void setName(String name) {this.name = name;}

    public void setAge(int age) {
        if (age >= 0 && age <= 110) {
            this.age = age;
        } else {
            System.out.println("\n> Invalid age !");
        }
    }

    public void setAverage(double average) {
        if (average >= 0.0 && average <= 20.0) {
            this.average = average;
        } else {
            System.out.println("> Invalid average !\n");
        }
    }
}