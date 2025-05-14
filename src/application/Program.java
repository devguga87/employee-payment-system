package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> empregados = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int numberEmployees = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= numberEmployees; i++){
            System.out.printf("Employee #%d data:%n", i);
            System.out.print("Outsourced(y/n)");
            char isOutsourced = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            sc.nextLine();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            sc.nextLine();
            if(isOutsourced == 'n'){
                Employee employee = new Employee(name, hours, valuePerHour);
                empregados.add(employee);
            } else {
                System.out.print("Aditional charge: ");
                Double aditionalCharge = sc.nextDouble();
                sc.nextLine();
                OutsourcedEmployee employee = new OutsourcedEmployee(name,hours, valuePerHour, aditionalCharge);
                empregados.add(employee);
            }
        }

        System.out.println("Payments: ");
        for(Employee e: empregados){
            System.out.println(e.getName() + " - " + " $ " + e.payment());
        }

        sc.close();
    }
}
