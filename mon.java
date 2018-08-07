public class mon {
    private String name;
    private move move1;
    private move move2;
    private move move3;
    private move move4;
    private type type;
    private int hp;

    public mon(String name, move move1, move move2, move move3, move move4, type type, int hp){
        this.name = name;
        this.move1= move1;
        this.move2= move2;
        this.move3= move3;
        this.move4= move4;
        this.type = type;
        this.hp= hp;
    }

    public move getMove1() {
        return move1;
    }

    public move getMove2() {
        return move2;
    }

    public move getMove3() {
        return move3;
    }

    public move getMove4() {
        return move4;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void tostring(){
        System.out.println("1. "+this.getMove1().getName()+" : "+this.getMove1().getPp()+"/"+this.getMove1().getPpmax());
        System.out.println("2. "+this.getMove2().getName()+" : "+this.getMove2().getPp()+"/"+this.getMove2().getPpmax());
        System.out.println("3. "+this.getMove3().getName()+" : "+this.getMove3().getPp()+"/"+this.getMove3().getPpmax());
        System.out.println("4. "+this.getMove4().getName()+" : "+this.getMove4().getPp()+"/"+this.getMove4().getPpmax());
    }

    public void battleCalc(int pow){
        this.setHp(this.getHp()-pow);
    }
}
