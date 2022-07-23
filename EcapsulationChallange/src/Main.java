public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.getNumberOfPagesPrinted());

        int numberOfPagesPrinted = printer.PrintPage(4);
        System.out.println(printer.getNumberOfPagesPrinted());

    }
}