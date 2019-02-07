package Ch9Inheritance;

public class LegalSecretary {

    public int getHours() {
        return 40;
    }

    public double getSalary() {
        return 45000.0;
    }

    public int getVacationDays() {
        return 10;
    }

    public String getVacationForm() {
        return "yellow";
    }

    public void prepareDocuments(){
        System.out.println("I am preparing all of the documents for the next case");
    }
}
