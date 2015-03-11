package ca.bcit.a00057006ws.services;

import ca.bcit.a00057006ws.employee.types.Employee;
import ca.bcit.a00057006ws.employee.types.GetEmployeeByIdRequest;
import ca.bcit.a00057006ws.employee.types.GetEmployeeByIdResponse;
import ca.bcit.a00057006ws.employee.xml.EmployeeServicePort;
import ca.bcit.a00057006ws.jpa.data.EmployeeFacade;

import javax.jws.WebService;

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
}
