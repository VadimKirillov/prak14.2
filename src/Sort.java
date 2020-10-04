public class Sort {
    Student[] students = {
            new Student("Иванов",18,241,4.2),
            new Student("Кузнецов",23, 123,4.6),
            new Student("Воробьёв",19,154,3.7),
            new Student("Петров",21,278,5.0)
    };

    public boolean sort(){
        boolean a = false;
        Student student = new Student("Воробьёв",19,154,3.7);
        for (Student student1 : students){
            if (student1.equals(student)){
                a = true;
            }
        }

        return a;
    }

}