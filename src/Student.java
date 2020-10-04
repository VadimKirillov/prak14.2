import java.util.Objects;

class Student implements Comparable <Student>{
    private String name;
    private int age,ID;
    private double gpa;

    public Student(String name, int age, int ID, double gpa) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object k) {//метод сравнения
        if (this == k) return true;
        if (k == null)
            return false;

        Student student = (Student) k;
        return age == student.age &&
                ID == student.ID &&
                Double.compare(student.gpa, gpa) == 0 &&
                name.equals(student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", ID = " + ID +
                ", gpa = " + gpa +
                '}';
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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student o) {
        if (this.getName() == o.getName()){
            return 1;
        }
        else return -1;
    }
}
