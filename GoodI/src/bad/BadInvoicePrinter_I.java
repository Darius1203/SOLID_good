package bad;

import test.ComplexInvoice;
import test.Invoice;

public interface BadInvoicePrinter_I {

    void print(Invoice invoice);

    void printComplexInvoice(ComplexInvoice complexInvoice);

    void someOtherPrintMethod(Invoice invoice);

}