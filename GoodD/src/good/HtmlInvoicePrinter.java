package good;

import test.Invoice;

public class HtmlInvoicePrinter implements GoodInvoicePrinter_I {

    @Override
    public void print(Invoice invoice) {
        System.out.println("Printing invoice in HTML format: " + invoice);
    }
}