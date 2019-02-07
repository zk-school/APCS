package Ch9Inheritance;

public class Lawyer {
    public int getHours() {
        return 40;
    }

    public double getSalary() {
        return 40000.0;
    }

    public int getVacationDays() {
        return 15;
    }

    public String getVacationForm() {
        return "pink";
    }
    public void startLitigation(String name){
        System.out.println("I am suing " + name + "!");
    }

}
