package test;

import bad.BadInvoicePrinter;
import bad.BadInvoicePrinter_I;
import bad.SomeOtherBadInvoicePrinter;
import good.GoodInvoicePrinter;
import good.GoodInvoicePrinter_I;
import good.SomeOtherGoodInvoicePrinter;
import good.SomeOtherGoodInvoicePrinter_I;

import java.util.Date;

public class IMain {

    public static void main(String[] args) {
        testBadI();
        testGoodI();
    }

    private static void testBadI() {
        Invoice invoice = new Invoice(-132523);
        ComplexInvoice complexInvoice = new ComplexInvoice(21439, new Date());

        BadInvoicePrinter_I badInvoicePrinter = new BadInvoicePrinter();
        badInvoicePrinter.print(invoice);
        badInvoicePrinter.printComplexInvoice(complexInvoice);
        badInvoicePrinter.someOtherPrintMethod(invoice); //why should I be able to do this?
        //We are not able to do this, because it doesn't respect the Interface Segregation principle.

        BadInvoicePrinter_I someOtherBadInvoicePrinter = new SomeOtherBadInvoicePrinter();
        someOtherBadInvoicePrinter.print(invoice); //why should I be able to do this?
        someOtherBadInvoicePrinter.printComplexInvoice(complexInvoice); //why should I be able to do this?
        //The same as before applies here.
        someOtherBadInvoicePrinter.someOtherPrintMethod(invoice);
    }

    private static void testGoodI() {
        Invoice invoice = new Invoice(423);
        ComplexInvoice complexInvoice = new ComplexInvoice(242, new Date());

        GoodInvoicePrinter_I goodInvoicePrinter = new GoodInvoicePrinter();
        goodInvoicePrinter.print(invoice);
        goodInvoicePrinter.printComplexInvoice(complexInvoice);
        // goodInvoicePrinter.someOtherPrintMethod(invoice); // unavailable! great.


        SomeOtherGoodInvoicePrinter_I someOtherGoodInvoicePrinter = new SomeOtherGoodInvoicePrinter();
        // other 2 methods are unavailable
        someOtherGoodInvoicePrinter.someOtherPrintMethod(invoice);
    }

}