package test;

import bad.BadPrintingService;
import good.GoodInvoicePrinter;
import good.GoodPrintingService;
import good.HtmlInvoicePrinter;

public class DMain {

    public static void main(String[] args) {
        testBadD();
        testGoodD();
    }

    private static void testBadD() {
        Invoice invoice = new Invoice(665);

        BadPrintingService badPrintingService = new BadPrintingService();
        badPrintingService.print(invoice);

        // now what?
        //badPrintingService = new BadPrintingService(new HtmlInvoicePrinter()); // but why!?
        //It doesn't work because of the lack of an interface, and because BadPrintingService is depending on GoodInvoicePrinter, so it is linked to a class, and so it cannot switch to other printers (HtmlInvoicePrinter, for example).
    }

    private static void testGoodD() {
        Invoice invoice = new Invoice(665);

        GoodPrintingService goodPrintingService = new GoodPrintingService(
                new GoodInvoicePrinter());
        goodPrintingService.print(invoice);

        goodPrintingService = new GoodPrintingService(new HtmlInvoicePrinter());
        goodPrintingService.print(invoice);
    }

}