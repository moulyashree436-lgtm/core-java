class PrinterRunner {
public static void main(String[] args) {
Printer.checkPrinterIsOnOrOff();
Printer.turnOnPrinter();
Printer.checkPrinterIsOnOrOff();
int currentPages = Printer.getCurrentPages();
System.out.println("Current Pages Printed : " + currentPages);
System.out.println("INCREASE PAGE");
Print.increasePage();
Print.increasePage();
Print.increasePage();
Print.increasePage();
Print.increasePage();
System.out.println("DECREASE PAGE");
Print.decreasePage();
Print.decreasePage();
Print.decreasePage();
Print.decreasePasge();
Print.decreasePage();
Print.decreasePage();
Print.decreasePage();
}
}