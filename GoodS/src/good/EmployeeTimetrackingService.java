package good;

public class EmployeeTimetrackingService {
    public void reportHours(GoodEmployee employee) {
        System.out.printf("%s worked %d hours.\n", employee.getName(), employee.getHours());
    }
}
