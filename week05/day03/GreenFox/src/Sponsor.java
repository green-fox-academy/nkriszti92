public class Sponsor extends Person {
    String company = "Google";
    int hiredStudents = 0;

    public Sponsor() {

    }

    @Override
    public void introduce(){
        System.out.println("Hi, I'm " + name + ", a " + age + " years old " + gender + " who represents " + company +
                " and hired " + hiredStudents + "students so far.");
    }

    public void hire(){
        hiredStudents += 1;
    }

    @Override
    public void getGoal(){
        System.out.println("Hire brilliant junior software developers.");
    }

    public Sponsor(String name, int age, String gender, String company) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.hiredStudents = 0;
    }
}
