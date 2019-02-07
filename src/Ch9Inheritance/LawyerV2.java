package Ch9Inheritance;

public class LawyerV2 extends EmployeeV2 {

    public int getVacationDays(){
        return 15;
    }

    public String getVacationForm(){
        return "Lawyers use the pink form.";
    }

    public void sue(){
        System.out.println("I'll see you in court!");
    }

}
