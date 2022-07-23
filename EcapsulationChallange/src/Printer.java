public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private Boolean isDuplex;

    public Printer(int tonerLevel, Boolean isDuplex) {

        if(tonerLevel >- 1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else{
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.numberOfPagesPrinted = 0;
    }

    public int addToner(int tonerAmount)
    {
        if(tonerLevel > 0 && tonerLevel <= 100) {
            if(this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;

        }else{
            return -1;
        }
    }

    public int PrintPage(int pages)
    {
        int pagesToPrint = pages;

        if(this.isDuplex){
            pagesToPrint /= 2 + (pages % 2);
            System.out.println("printing in duplex mode");
        }
        return this.numberOfPagesPrinted += pagesToPrint;
    }

    public int getNumberOfPagesPrinted()
    {
        return numberOfPagesPrinted;
    }
}
