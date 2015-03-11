package ca.bcit.a00057006ws.services;

import ca.bcit.a00057006ws.employee.types.*;
import ca.bcit.a00057006ws.employee.xml.EmployeeServicePort;
import ca.bcit.a00057006ws.jpa.data.EmployeeFacade;

import javax.jws.WebService;
import java.util.List;

/**
 * Employee Service implementation
 */
@WebService(endpointInterface = "ca.bcit.a00057006ws.employee.xml.EmployeeServicePort")
public class EmployeeServices implements EmployeeServicePort {
    @Override
    public GetEmployeeByIdResponse getEmployeeById(GetEmployeeByIdRequest getEmployeeRequest) {
        GetEmployeeByIdResponse empResponse = new GetEmployeeByIdResponse();
        String empId = getEmployeeRequest.getId();

        EmployeeFacade employeeFacade = EmployeeFacade.getInstance();

        Employee employee = employeeFacade.getEmployeeById(empId);
        empResponse.setValidEmployee(employee);
        return empResponse;
    }

    @Override
    public void addEmployee(Employee addEmployeeRequest) {

        Employee emp = new Employee();
        emp.setId(addEmployeeRequest.getId());
        emp.setFirstName(addEmployeeRequest.getFirstName());
        emp.setLastName((addEmployeeRequest.getLastName()));
        emp.setDateOfBirth(addEmployeeRequest.getDateOfBirth());

        EmployeeFacade employeeFacade = EmployeeFacade.getInstance();
        employeeFacade.addEmployee(emp);
    }

    @Override
    public void removeEmployee(RemoveEmployeeByIdRequest removeEmployeeRequest) {
        String empId = removeEmployeeRequest.getId();

        EmployeeFacade employeeFacade = EmployeeFacade.getInstance();
        employeeFacade.removeEmployeeById(empId);
    }

    @Override
    public EmployeeListType getEmployees(Object getEmployeesRequest) {
        EmployeeListType empList = new EmployeeListType();
        EmployeeFacade employeeFacade = EmployeeFacade.getInstance();
        List<Employee> employees = employeeFacade.getEmployees();
        empList.setEmployee(employees);
        return empList;
    }

}
