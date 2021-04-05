//PART 4 UPDATE
package edu.sabana.poob.sabanapayroll;//package sabananominatest;


import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.UUID;

import static java.util.UUID.randomUUID;
import static org.junit.Assert.assertEquals;

public class SabanaNominaTest {
   private final SabanaPayroll sabanaUniversity;
   private final ArrayList<Department> arrTestDepartment;
   private ArrayList<Employee> arrTestEmployee;

   public SabanaNominaTest() {
      arrTestDepartment = new ArrayList<Department>();
      arrTestEmployee = new ArrayList<Employee>();

      UUID uniqueID = randomUUID();
      // Creación y llenado de ArrayList de Empleados
      arrTestEmployee.add(new EmployeebyHours(randomUUID(), "Pedro", "Lozano", uniqueID, 120));
      arrTestEmployee.add(new EmployeebyHours(randomUUID(), "Alicia", "Carmona", uniqueID, 160));
      // ...
      arrTestEmployee.add(new EmployeeSalary(randomUUID(), "Rafael", "Diaz", uniqueID, 5450000.0));
      arrTestEmployee.add(new EmployeeSalary(randomUUID(), "Gloria", "Yepes", uniqueID, 6250000.0));
      // ...

      // Creación y llenado de ArrayList de Departamentos
      arrTestDepartment.add(new Department(uniqueID, "FINANZAS", arrTestEmployee));
      // =============================================================================================
      arrTestEmployee = new ArrayList<Employee>();

      uniqueID = randomUUID();
      // Creación y llenado de ArrayList de Empleados
      arrTestEmployee.add(new EmployeebyHours(randomUUID(), "Pepe", "Cortisona", uniqueID, 213));
      arrTestEmployee.add(new EmployeebyHours(randomUUID(), "Ingrid", "Almanza", uniqueID, 202));
      // ...
      arrTestEmployee.add(new EmployeeSalary(randomUUID(), "Jaime", "Jimenez", uniqueID, 3333000.0));
      arrTestEmployee.add(new EmployeeSalary(randomUUID(), "Katy", "Peña", uniqueID, 1250000.0));
      // ...

      // Creación y llenado de ArrayList de Departamentos
      arrTestDepartment.add(new Department(uniqueID, "VENTAS", arrTestEmployee));
      // =============================================================================================
      arrTestEmployee = new ArrayList<Employee>();

      uniqueID = randomUUID();
      // Creación y llenado de ArrayList de Empleados
      arrTestEmployee.add(new EmployeebyHours(randomUUID(), "Hugo", "Herrera", uniqueID, 130));
      arrTestEmployee.add(new EmployeebyHours(randomUUID(), "Alberto", "Lugo", uniqueID, 170));
      // ...
      arrTestEmployee.add(new EmployeeSalary(randomUUID(), "Julian", "Garcia", uniqueID, 3450000.0));
      arrTestEmployee.add(new EmployeeSalary(randomUUID(), "Kelly", "Pedraza", uniqueID, 2250000.0));
      // ...

      // Creación y llenado de ArrayList de Departamentos
      arrTestDepartment.add(new Department(uniqueID, "REC HUMANOS", arrTestEmployee));
      // =============================================================================================

      sabanaUniversity = new SabanaPayroll(arrTestDepartment);
   }

    // Test para salario de cualquier empleado
    @Test
    public void testSalarioEmpleado() {
        sabanaUniversity.printPayroll();  // Imprime los datos de todos los empleados

        UUID idEmployee = sabanaUniversity.getDeptoByPos(2).getEmployees().get(3).getId();
        double salarioEsperado = 2070000.0;
        System.out.println("\nTest para empleado con UUID: " + idEmployee +
                ", Salario esperado: " + salarioEsperado);

        assertEquals(salarioEsperado, sabanaUniversity.calculateEmployeeSalary(idEmployee), 0);
    }
    
    // Test para salario de todos los empleados de un depto
    @Test
    public void testSalarioDepto() {
        sabanaUniversity.printPayroll();  // Imprime los datos de todos los empleados

        int numDepto = 2;    // Actualizar para el Test
        UUID idDepto = sabanaUniversity.getDeptoByPos(numDepto).getId();
        double salarioEsperado = 18744000.0;
        System.out.println("\nTest para departamento: " + sabanaUniversity.getDeptoByPos(numDepto).getNombre() +
                ", Salario esperado: " + salarioEsperado);

        assertEquals(salarioEsperado, sabanaUniversity.calculateDepartmentSalaries(idDepto), 0);
    }

    // Test para salario de todos los empleados de la Universidad
    @Test
    public void testSalarioSabana() {
        sabanaUniversity.printPayroll();  // Imprime los datos de todos los empleados

        double salarioEsperado = 6.499936E7;
        System.out.println("\nTest para Universidad: , Salario esperado: " + salarioEsperado);

        assertEquals(salarioEsperado, sabanaUniversity.calculateUniversitySalaries(), 0);
    }

    @Test
    public void testdepositToEmployee() {
        sabanaUniversity.printPayroll();  // Imprime los datos de todos los empleados

        UUID idEmployee = sabanaUniversity.getDeptoByPos(2).getEmployees().get(3).getId();
        boolean depositoOK = true;
        System.out.println("\nTest para deposito a empleado con UUID: " + idEmployee +
                ", Resultado depósito: " + depositoOK);

        double valDeposit = 3000;
        assertEquals(depositoOK, sabanaUniversity.depositToEmployee(idEmployee, valDeposit, 'S'));
    }

    @Test
    public void testcalculateEmployeeBalance() {
        sabanaUniversity.printPayroll();  // Imprime los datos de todos los empleados

        UUID idEmployee = sabanaUniversity.getDeptoByPos(2).getEmployees().get(3).getId();

        sabanaUniversity.depositToEmployee(idEmployee,570000, 'C');
        double balanceEsperado = 565000;
        System.out.println("\nTest para calculo balance de empleado con UUID: " + idEmployee +
                ", Balance: " + balanceEsperado);

        assertEquals(balanceEsperado, sabanaUniversity.calculateEmployeeBalance(idEmployee), 0);
    }

    @Test
    public void testcalculateAllEmployeesBalance() {
        sabanaUniversity.printPayroll();  // Imprime los datos de todos los empleados

        UUID idEmployee_1 = sabanaUniversity.getDeptoByPos(1).getEmployees().get(2).getId();
        UUID idEmployee_2 = sabanaUniversity.getDeptoByPos(2).getEmployees().get(3).getId();
        UUID idEmployee_3 = sabanaUniversity.getDeptoByPos(2).getEmployees().get(1).getId();

        sabanaUniversity.depositToEmployee(idEmployee_1,570000, 'C');
        sabanaUniversity.depositToEmployee(idEmployee_2,1E6, 'S');
        sabanaUniversity.depositToEmployee(idEmployee_3,1E6, 'S');
        double valEsperado = 2.561E6;
        assertEquals(valEsperado, sabanaUniversity.calculateAllEmployeesBalance(), 0);
    }

}