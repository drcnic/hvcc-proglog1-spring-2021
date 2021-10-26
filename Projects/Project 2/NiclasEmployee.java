public class NiclasEmployee {
    private String  idNumber;
    private String  name;
    private char    level;
    private double  salary;
    private boolean bonus;

    public NiclasEmployee() {
        this.idNumber = "";
        this.name = "";
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

    public char getLevel() {
        return this.level;
    }

    public double getSalary() {
        return this.salary;
    }

    public boolean getBonus() {
        return this.bonus;
    }
}