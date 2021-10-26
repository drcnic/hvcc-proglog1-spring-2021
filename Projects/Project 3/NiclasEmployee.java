public class NiclasEmployee {
    private String  idNumber;
    private String  name;
    private String  email;
    private char    level;
    private double  salary;
    private boolean bonus;

    public NiclasEmployee() {
        this.idNumber = null;
        this.name = null;
        this.level = 'Z';
        this.salary = 0;
        this.bonus = false;
    }

    public NiclasEmployee(String idNumber, String name, char level, double salary, boolean bonus) {
        this.idNumber = idNumber;
        this.name = name;
        this.level = level;
        this.salary = salary;
        this.bonus = bonus;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLevel(char level) {
        this.level = level;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(boolean bonus) {
        this.bonus = bonus;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public char getLevel() {
        return this.level;
    }

    public double getSalary() {
        return this.salary;
    }

    public boolean getBonus() {
        return this.bonus;
    }

    public void display() {
        NiclasRunEmployee.makeLine(50);
        String level = "";
        switch(this.level) {
            case 'A':
                level = "Executive";
                break;
            case 'B':
                level = "Associate";
                break;
            case 'C':
                level = "Assistant";
                break;
            case 'D':
                level = "Intern";
            default:
        }

        System.out.printf("Employee:\t%s\n", this.name);
        System.out.printf("Position:\t%s\n", level);
        System.out.printf("Salary:\t\t$%,.2f\n", this.salary);
        System.out.printf("Email Address:\t%s\n", this.email);
        System.out.printf("Bonus:\t\t%b\n", this.bonus);
    }
}