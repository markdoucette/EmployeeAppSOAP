
package ca.bcit.a00057006ws.employee.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ca.bcit.a00057006ws.employee.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddEmployeeRequest_QNAME = new QName("http://www.bcit.ca/a00057006ws/employee/types/", "AddEmployeeRequest");
    private final static QName _GetEmployeesResponse_QNAME = new QName("http://www.bcit.ca/a00057006ws/employee/types/", "GetEmployeesResponse");
    private final static QName _GetEmployeesRequest_QNAME = new QName("http://www.bcit.ca/a00057006ws/employee/types/", "GetEmployeesRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ca.bcit.a00057006ws.employee.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEmployeeByIdResponse }
     * 
     */
    public GetEmployeeByIdResponse createGetEmployeeByIdResponse() {
        return new GetEmployeeByIdResponse();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link GetEmployeeByIdRequest }
     * 
     */
    public GetEmployeeByIdRequest createGetEmployeeByIdRequest() {
        return new GetEmployeeByIdRequest();
    }

    /**
     * Create an instance of {@link RemoveEmployeeByIdRequest }
     * 
     */
    public RemoveEmployeeByIdRequest createRemoveEmployeeByIdRequest() {
        return new RemoveEmployeeByIdRequest();
    }

    /**
     * Create an instance of {@link EmployeeListType }
     * 
     */
    public EmployeeListType createEmployeeListType() {
        return new EmployeeListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bcit.ca/a00057006ws/employee/types/", name = "AddEmployeeRequest")
    public JAXBElement<Employee> createAddEmployeeRequest(Employee value) {
        return new JAXBElement<Employee>(_AddEmployeeRequest_QNAME, Employee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bcit.ca/a00057006ws/employee/types/", name = "GetEmployeesResponse")
    public JAXBElement<EmployeeListType> createGetEmployeesResponse(EmployeeListType value) {
        return new JAXBElement<EmployeeListType>(_GetEmployeesResponse_QNAME, EmployeeListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.bcit.ca/a00057006ws/employee/types/", name = "GetEmployeesRequest")
    public JAXBElement<Object> createGetEmployeesRequest(Object value) {
        return new JAXBElement<Object>(_GetEmployeesRequest_QNAME, Object.class, null, value);
    }

}
