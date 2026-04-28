public class EmployeeView {
    public void printEmployeeDetails(Employee e) {
        System.out.println("Employee Details:");
        System.out.println("ID: " + e.getId());
        System.out.println("Name: " + e.getName());
        System.out.println("Email: " + e.getEmail());
    }
}
