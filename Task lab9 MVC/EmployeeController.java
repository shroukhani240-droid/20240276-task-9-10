public class EmployeeController {
    private Employee e;
    private EmployeeView ev;

    public EmployeeController(Employee e, EmployeeView ev) {
        this.e = e;
        this.ev = ev;
    }

    public void setEmployeeId(int id) {
        e.setId(id);
    }

    public void setEmployeeName(String name) {
        e.setName(name);
    }

    public void setEmployeeEmail(String email) {
        e.setEmail(email);
    }

    public int getEmployeeId() {
        return e.getId();
    }

    public String getEmployeeName() {
        return e.getName();
    }

    public String getEmployeeEmail() {
        return e.getEmail();
    }

    public void view() {
        ev.printEmployeeDetails(e);
    }

}