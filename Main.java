public class Main {
    public static void main(String[] args) {

        Employee rishabh = new Employee("Rishabh", "24/04/2005",
                "17/06/2028");
        System.out.println(rishabh);
        System.out.println("Age = " + rishabh.getAge());
        System.out.println("Pay = " + rishabh.collectPay());

        SalariedEmployee ashutosh = new SalariedEmployee("Ashutosh", "06/01/2005",
                "21/06/2028", 35000);
        System.out.println(ashutosh);
        System.out.println("Ashutosh's Paycheck = $" + ashutosh.collectPay());

        ashutosh.retire();
        System.out.println("Ashutosh's Pension = $" + ashutosh.collectPay());

        HourlyEmployee ashish = new HourlyEmployee("Ashish", "19/01/2003",
                "25/06/2028", 15);
        System.out.println(ashish);
        System.out.println("Ashish's Paycheck = $" + ashish.collectPay());
        System.out.println("Ashish's Holiday Pay = $" + ashish.getDoublePay());
    }
}