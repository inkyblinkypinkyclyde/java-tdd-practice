public class Printer {
    private String name;
    private int paper;
    private int toner;
    public Printer(String name, int paper, int toner){
        this.name = name;
        this.paper = paper;
        this.toner = toner;
    }

    public String getName() {
        return name;
    }

    public int getPaper() {
        return paper;
    }

    public int getToner() {
        return toner;
    }

    public void print(int pages, int sheets) {
        int volumeTaken = pages*sheets;
        if ((volumeTaken < paper) && (volumeTaken<toner)){
            paper = paper - volumeTaken;
            toner = toner - volumeTaken;
        }
    }
}
