package Stream;

import java.util.*;
import java.util.stream.Collectors;

class Employee{

       public String EmpName;
       public  int Salary;

        Employee(String EmpName, int Salary)
        {
            this.EmpName = EmpName;
            this.Salary = Salary;
        }

    public String getEmpName() {
        return EmpName;
    }

    public int getSalary() {
        return Salary;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String toString(){
        return "EmployeName:" + EmpName +  ",employe salary : " + Salary;
    }
}

public class StreamInteger {

    public static void main(String[] args)
    {

        HashMap<String,Employee> userobj = new HashMap<>();

        Employee employee1 = new Employee("Shreyansh",80000);
        Employee employee2 = new Employee("Naman",90000);


        userobj.put("empID1",employee1);
        userobj.put("empID2",employee2);

        System.out.println(userobj);



//        List<String> list = Arrays.asList("shreyansh","java");
//
//        List<String> newArray = list.stream().filter(s -> s.contains("h"))
//                .collect(Collectors.toList());
//
//        System.out.println(newArray);
//
//        List<Integer> list1 = new ArrayList<>(Arrays.asList(2, 13, 14, 5, 6));
//
//        List<Integer> newlist = list1.stream().filter(s->s%2 == 0).
//                            collect(Collectors.toList());
//
//        System.out.println(newlist);
//
//        List<Integer> startWithOne = list1.stream()
//                .map(s -> s + "")
//                .filter(s -> s.startsWith("1"))
//                .map(Integer::parseInt).collect(Collectors.toList());
//                startWithOne.forEach(System.out::println);

//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
//
//        List<Integer> newlist1 =  myList.stream().distinct().collect(Collectors.toList());

//        List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
//
//               int value = myList1.stream().distinct().findFirst()
//                .orElse(-1);
//
//               System.out.println(value);
//
//        List<Integer> Array = Arrays.asList(10,20,30);
//
////      int value =  Array.stream().max(Comparator.naturalOrder()).get();
//        int value = Array.stream().max(Integer::compare).get();
//
//      System.out.print(value);

       //1.Find the maximum value in the List<Integer>.
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int max = numbers.stream().max(Integer::compare).get();
        System.out.println(max);

        //2.Given List<Employee>, Find employee with higest salary.

        List<Employee>  employees = Arrays.asList(
                            new Employee("John", 8000),
                            new Employee("shreyansh",10000),
                            new Employee("rohan",15000)
        );

        Optional<Employee> maxsalary = employees.stream()
                        .max(Comparator.comparingInt(Employee::getSalary));
        maxsalary.ifPresent(System.out::println);

        //5. How to sort List<Employee> by salary
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .collect(Collectors.toList());

        System.out.println(sortedEmployees);

        //6. Given List<Employee>, Return Map with Employee Name and Salary
        Map<String, Integer> employeeSalaryMap = employees.stream()
                .collect(Collectors
                        .toMap(Employee::getEmpName, Employee::getSalary));

                System.out.println(employeeSalaryMap);

        //3.Given List<String>, Return String concatenating all Strings of List.
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        String result = words.stream()
                .collect(Collectors.joining(", "));

        //4.Group List<Integer> by their evenness. (even or odd)

        List<Integer> num = Arrays.asList(1,2,3,4,5,6);

        Map<Boolean, List<Integer>> evenodd = num.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));

        System.out.println(evenodd);

        //7.Given List<Employee>, Remove Employee with same Name from the List.

        Set<String> seenNames = new HashSet<>();
        List<Employee> uniqueEmployees = employees.stream()
                .filter(emp -> seenNames.add(emp.getEmpName()))
                .collect(Collectors.toList());
        System.out.println( "Seen" + uniqueEmployees);
    }
}
