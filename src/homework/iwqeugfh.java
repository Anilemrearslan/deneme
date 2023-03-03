//package homework;
//
//public class iwqeugfh {
//    public static void main(String[] args) {
//
//
//        boolean condition = true;
//        ArrayList<Employee> employeeList = new ArrayList<>();
//
//        System.out.println("================================");
//        //    Use Employee Class on the Homework 51 and write code where
//        //    It creates Employee Objects unless User choose to stop creating
//        //    employee objects and add all the created Employee object to ArrayList.
//        while (condition){
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Please enter an employee name: ");
//            String name = scan.next();
//            System.out.println("Please enter an employee ID as an integer number: ");
//            int id = scan.nextInt();
//            System.out.println("Please enter an employee salary: ");
//            double salary = scan.nextDouble();
//            Employee employee = new Employee(name, id, salary);
//
//            System.out.println("Would you like to continue or not");
//            System.out.println("Please answer as yes or no: ");
//            String  userCondition = scan.next().toLowerCase();
//
//            employeeList.add(employee);
//
//            if (userCondition.equals("no")){
//                condition = false;
//            }
//
//        }
//
//
//        System.out.println("================================");
//        // sorted employee list with respect to salary
//        System.out.println("Method returns Sorted employee list with respect to salary");
//        ArrayList<Employee> sortedEmployeeList = sortedListOfEmployee(employeeList);
//
//        for (Employee employee:sortedEmployeeList) {
//            System.out.println("Salary of the employee with id "+employee.getEmployeeID()
//                    + " = "+employee.getEmployeeSalary());
//        }
//
//
//        System.out.println("==================================");
//        // ArrayList of String where it contains the Name of Employees
//        System.out.println("Method returns ArrayList of String where it contains the Name of Employees");
//        ArrayList<String> employeeNames = employeeNameList(sortedEmployeeList);
//        System.out.println(employeeNames.toString());
//
//        System.out.println("==================================");
//        // the ArrayList of employee that has even number Employee ID
//        System.out.println("Method returns the ArrayList of employee that has even number Employee ID");
//        ArrayList<Employee> employeesWithEvenNumberId =  employeesIdEvenNumber(sortedEmployeeList);
//        for (Employee employee:sortedEmployeeList) {
//            System.out.println("Employee with id "+employee.getEmployeeID()
//                    + " = "+employee.getEmployeeID());
//        }
//
//
//        System.out.println("==================================");
//        // returns an integer which is the count of employees who has Salary of 50k or more.
//        System.out.println("Method returns an integer which is the count of employees who has Salary of 50k or more.");
//        System.out.println("Number of employess that get salary higher than 50 = "+highSalary(sortedEmployeeList));
//
//
//        System.out.println("==================================");
//        System.out.println("Method returns a double which is Total of Salaries in the List");
//        System.out.println("total salary of all employees = "+totalSalary(sortedEmployeeList));
//
//
//
//        System.out.println("==================================");
//        System.out.println("Method Calculates an Annual Bonus for Employee and Prints the");
//        System.out.println("Employee Name and the Amount of Bonus they will be receiving ( Bonus = 15% of salary");
//        printNameBonus(sortedEmployeeList);
//
//
//        System.out.println("==================================");
//        System.out.println(" Method Swap the employees on the given index and print the");
//        System.out.println("index of swapped employees and their names.");
//        swapIndexAndPrint(sortedEmployeeList, 1,2);
//
//
//
//
//
//    }
//
//
//    //- Write a Method where it takes ArrayList of Employee and returns to
//    // shorted ArrayList of Employee based on the Salary.(Increasing order,
//    // Lowest first and so on)
//    public static ArrayList<Employee> sortedListOfEmployee(ArrayList<Employee>
//                                                                   employeeList){
//
//        double minSalary = employeeList.get(0).getEmployeeSalary();
//        double tempSalary = 0.0;
//        Employee tempEmployee = employeeList.get(0);
//
//        for (int i = 0; i < employeeList.size(); i++) {
//            for (int j = i+1; j < employeeList.size(); j++) {
//                if(employeeList.get(i).getEmployeeSalary() > employeeList.get(j).getEmployeeSalary()){
//
//                    tempEmployee = employeeList.get(i);
//                    employeeList.set(i,employeeList.get(j));
//                    employeeList.set(j,tempEmployee);
//
//                }
//            }
//
//        }
//
//        return employeeList;
//    }
//
//    //- Write a method where It takes arrayList of Employee
//// and Returns to ArrayList of String where it contains the Name of Employees
//    public static ArrayList<String> employeeNameList(ArrayList<Employee> employeeArrayList){
//
//        ArrayList<String> emplyeeNames = new ArrayList<>();
//        for (Employee employee: employeeArrayList) {
//            emplyeeNames.add(employee.getEmployeeName());
//
//        }
//        return emplyeeNames;
//    }
//
//    //- Write a Method where it takes arrayList of Employee and return to
//// the ArrayList of employee that has even Number Employee ID
//
//    public static ArrayList<Employee>
//    employeesIdEvenNumber(ArrayList<Employee> param1){
//
//        ArrayList<Employee> employeesWithEvenNumberId = new ArrayList<>();
//
//        for (Employee employee: param1) {
//            if (employee.getEmployeeID() % 2 == 0){
//
//                employeesWithEvenNumberId.add(employee);}
//        }
//        return employeesWithEvenNumberId;
//
//    }
//
//
//    //- Write a Method Where it takes ArrayList of Employee where it
//    // returns an integer which is the count of employees who has Salary of 50k or more.
//
//    public static int highSalary(ArrayList<Employee> param1){
//        int count = 0;
//        for (Employee employee:param1
//        ) {
//            if(employee.getEmployeeSalary() > 50){
//                count++;
//            }
//
//        }
//        return count;
//    }
//
//    //- Write a Method Where it takes ArrayList of Employee
//    // and Returns a double which is Total of Salaries in the List
//    public static double totalSalary(ArrayList<Employee> param1){
//
//        double total = 0;
//
//        for (Employee employee: param1
//        ) {
//            total = total + employee.getEmployeeSalary();
//        }
//        return total;
//    }
//
////- Write a Method Where it takes ArrayList of Employee,
//    // Calculates an Annual Bonus for Employee and Prints the
//    // Employee Name and the Amount of Bonus they will be receiving ( Bonus = 15% of salary)
//
//    public static void printNameBonus(ArrayList<Employee> param1){
//
//        for (Employee employee: param1
//        ) {
//            double bonus = employee.getEmployeeSalary() * 15.0/ 100.0;
//
//            System.out.println(employee.getEmployeeName() + " will get th bonus: " + bonus);
//
//        }
//    }
//
//    //- Write a Method where it Takes ArrayList of Employee and
//    // 2 integer values where they represent the index,
//    // and Swap the employees on the given index and print the
//    // index of swapped employees and their names.
//
//    public static void swapIndexAndPrint(ArrayList<Employee> param1, int param2, int param3){
//
//        Employee tempEmployee;
//
//        System.out.println("Before swapping");
//        System.out.println("Employee #1: "+ param1.get(param2).getEmployeeName());
//        System.out.println("Employee #2: "+ param1.get(param3).getEmployeeName());
//
//        tempEmployee = param1.get(param2);
//
//        param1.set(param2,param1.get(param3));
//
//        param1.set(param3, tempEmployee);
//
//        System.out.println("After swapping");
//        System.out.println("Employee #1: "+ param1.get(param2).getEmployeeName());
//        System.out.println("Employee #2: "+ param1.get(param3).getEmployeeName());
//
//
//    }
//}
