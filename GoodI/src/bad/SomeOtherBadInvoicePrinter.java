package bad;

import test.ComplexInvoice;
import test.Invoice;

public class SomeOtherBadInvoicePrinter implements BadInvoicePrinter_I {

    @Override
    public void print(Invoice invoice) {
        // not needed here
    }

    @Override
    public void printComplexInvoice(ComplexInvoice complexInvoice) {
        // nope
    }

    @Override
    public void someOtherPrintMethod(Invoice invoice) {
        System.out.println("Printing the invoice in a totally different way "
                + invoice);
    }
}