public class Printer {
    private int pages;
    private  int toner;

    public Printer(int pages){
        this.pages = pages;
        this.toner = 100;
    }

    public int getPages(){
        return this.pages;
    }


    public int getToner(){
        return this.toner;
    }


    public void print(int new_pages, int copies) {
        int paper = new_pages * copies;
        if (pages >= paper){
            this.pages -= paper;
            this.toner -= paper;
        }
    }

    public void refill(){
        this.pages = 100;
    }
}
