package good;

public class EmployeePaymentService {
    private EmployeeAdditionalPaymentService additionalPaymentService;

    public EmployeePaymentService(EmployeeAdditionalPaymentService additionalPaymentService) {
        this.additionalPaymentService = additionalPaymentService;
    }

    public int calculatePay(GoodEmployee employee) {
        int basePay;
        switch (employee.getStatus()) {
            case "A":
                basePay = 1;
                break;
            case "B":
                basePay = 2;
                break;
            default:
                basePay = 0;
        }

        int additionalPay = additionalPaymentService.calculateAdditionalPay(employee);
        return basePay + additionalPay;
    }
}

