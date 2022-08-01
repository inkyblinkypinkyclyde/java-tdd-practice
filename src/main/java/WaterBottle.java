public class WaterBottle {
    private String name;
    private int volume;
    public WaterBottle(String name){
        this.name = name;
        this.volume = 100;
    }

    public String getName(){
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void drink() {
        volume = volume - 10;
    }

    public void empty() {
        volume = 0;
    }

    public void fill() {
        volume = 100;
    }
}

