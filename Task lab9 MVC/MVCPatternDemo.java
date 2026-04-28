public class MVCPatternDemo {
    public static void main(String[] args) {

        Employee emp = new Employee(1, "Shrouk", "shrouk@email.com");

        EmployeeView view = new EmployeeView();

        EmployeeController controller = new EmployeeController(emp, view);

        controller.view();

        System.out.println("----- After Update -----");

        controller.setEmployeeName("Ali");
        controller.setEmployeeEmail("ali@email.com");

        controller.view();
    }

}
