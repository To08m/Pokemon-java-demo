public class move {
    private String name;
    private int pp;
    private int ppmax;
    private int power;

    public move(String name, int pp, int power){
        this.name = name;
        this.pp = pp;
        this.ppmax = pp;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public int getPpmax(){
        return ppmax;
    }
}
