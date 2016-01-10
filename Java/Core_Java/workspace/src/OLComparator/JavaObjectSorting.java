package OLComparator;
import java.util.Arrays;

public class JavaObjectSorting {
 
    /**
     * This class shows how to sort custom objects array/list
     * implementing Comparable and Comparator interfaces
     * @param args
     */
    public static void main(String[] args) {
 
        //sorting custom object array
        Employee[] empArr = new Employee[4];
        empArr[0] = new Employee(10, "Mikey", 25, 10000);
        empArr[1] = new Employee(20, "Arun", 29, 20000);
        empArr[2] = new Employee(5, "Lisa", 35, 5000);
        empArr[3] = new Employee(1, "Pankaj", 32, 50000);
         
        System.out.println("***********************");
        for (Employee i: empArr){
        	System.out.println(i);
        }
        
        
        System.out.println("***********************\n\n");
        //sorting employees array using Comparable interface implementation
        Arrays.sort(empArr);
        for (Employee i: empArr){
        	System.out.println(i);
        }
        System.out.println("***********************\n\n");
         
        //sort employees array using Comparator by Salary
        Arrays.sort(empArr, Employee.SalaryComparator);
        for (Employee i: empArr){
        	System.out.println(i);
        }
        System.out.println("***********************\n\n");
        //sort employees array using Comparator by Age
        Arrays.sort(empArr, Employee.AgeComparator);
        for (Employee i: empArr){
        	System.out.println(i);
        }
        System.out.println("***********************\n\n");
        //sort employees array using Comparator by Name
        Arrays.sort(empArr, Employee.NameComparator);
        for (Employee i: empArr){
        	System.out.println(i);
        }
        System.out.println("***********************\n\n");
        //Employees list sorted by ID and then name using Comparator class
        empArr[0] = new Employee(1, "Mikey", 25, 10000);
        Arrays.sort(empArr, new EmployeeComparatorByIdAndName());
        for (Employee i: empArr){
        	System.out.println(i);
        }
    }
 
}