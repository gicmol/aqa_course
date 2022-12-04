package src;

public class Engineers {
    String firstName;
    String surname;
    String jobTitle;
    int salary;

    public Engineers(String firstName, String surname, String jobTitle, int salary) {
        this.firstName = firstName;
        this.surname = surname;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Engineer's name - " + firstName + "\nEngineer's surname - " + surname +"\nEngineer's jobTitle - " + jobTitle +"\nEngineer's salary - " + salary);
    }
}