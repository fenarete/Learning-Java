public class Main {
    public static void main (String[] args){
        var employee = new Employee();
        employee.setBaseSalary = -1;
        employee.setHourlyRate = 20;
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}
