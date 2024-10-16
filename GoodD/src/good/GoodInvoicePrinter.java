package good;

import test.ComplexInvoice;
import test.Invoice;

public class GoodInvoicePrinter implements GoodInvoicePrinter_I{
    @Override
    public void print(Invoice invoice) {
        System.out.println("Printing invoice " + invoice);
    }
}