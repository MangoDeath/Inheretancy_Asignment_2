package models;
public class Student extends Person {
    private double gpa;
    public Student(){}
    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa=gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    @Override
    public double getPayAmount(){
        if(gpa>2.67){
            return 36660;
        }
        else return 0;
    }
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

}
