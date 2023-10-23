public class EmpCaller {

    public static void main(String[] args) {
        EmpSalarySlip ram = new EmpSalarySlip();
        ram.takeInput();
        ram.showEmpDetails();
        double netSal = ram.netSalary();
        System.out.println("Net Salary is : " + netSal);
    }

}