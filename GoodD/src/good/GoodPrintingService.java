package good;

import test.Invoice;

public class GoodPrintingService {

    private GoodInvoicePrinter_I invoicePrinter;

    public GoodPrintingService(GoodInvoicePrinter_I invoicePrinter) {
        this.invoicePrinter = invoicePrinter;
    }

    public void print(Invoice invoice) {
        invoicePrinter.print(invoice);
    }
}