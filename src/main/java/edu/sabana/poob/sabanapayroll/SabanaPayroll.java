package edu.sabana.poob.sabanapayroll;//package sabananominatest;

import java.util.ArrayList;
import java.util.UUID;

public class SabanaPayroll {
   private static ArrayList<Department> arrDeptos;

   public SabanaPayroll() {
   }
   
   public SabanaPayroll(ArrayList<Department> arrDeptos) {
      this.arrDeptos = arrDeptos;
   }

   public double calculateEmployeeSalary(UUID employeeId) {
      double salary = 0.0;
      boolean hallado = false;
      for (int i = 0; i < arrDeptos.size() && !hallado; i++) {   // recorre ArrayList Department

         for (int j = 0; j < arrDeptos.get(i).getEmployees().size() && !hallado; j++) {   // recorre ArrayList Employee
            if (arrDeptos.get(i).getEmployees().get(j).getId().equals(employeeId)) {
               hallado = true;
               salary = arrDeptos.get(i).getEmployees().get(j).calculateSalary();
            }
         }
      }
      if (!hallado)
         System.out.println("Empleado con UUID: " + employeeId + " no hallado.\n");
      return salary;
   }

   public double calculateDepartmentSalaries(UUID departmentId) {
      double salary = 0.0;
      boolean hallado = false;
      for (int i = 0; i < arrDeptos.size() && !hallado; i++) {   // recorre ArrayList Department

         if (arrDeptos.get(i).getId().equals(departmentId)) {
            hallado = true;
            salary = arrDeptos.get(i).calculateDepartmentSalaries();
         }
      }
      if (!hallado)
         System.out.println("Departamento con UUID: " + departmentId + " no hallado.\n");
      return salary;
   }

   public double calculateUniversitySalaries() {
      double totalSalarios = 0.0;

       for (Department arrDepto : arrDeptos) {
           totalSalarios += arrDepto.calculateDepartmentSalaries();
       }

      return totalSalarios;
   }

   public static String getDepartmentName(UUID id) {
      String deptName = "";
      boolean hallado = false;
      for (int i = 0; i < arrDeptos.size() && !hallado; i++) {   // recorre ArrayList Department

         if (arrDeptos.get(i).getId().equals(id)) {
            hallado = true;
            deptName = arrDeptos.get(i).getNombre();
         }
      }
      if (!hallado)
         System.out.println("Departamento con UUID: " + id + " no hallado.\n");
      return deptName;      
   }

   public Department getDeptoByPos(int n) {
      return arrDeptos.get(n);
   }

   public void printPayroll() {
       for (int i = 0; i < arrDeptos.size(); i++) {
           for (int j = 0; j < arrDeptos.get(i).getEmployees().size(); j++) {
              System.out.println(arrDeptos.get(i).getEmployees().get(j).toString());
           }
       }
   }
}