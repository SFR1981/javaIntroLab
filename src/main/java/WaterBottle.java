public class WaterBottle {
    private int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public void drink() {
        volume -= 10;
    }

    public int getVolume(){
        return volume;
    }

}

