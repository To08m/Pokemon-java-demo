import java.util.Scanner;
import java.util.Random;

public class pokedemo_main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        move hydropump = new move("Hydro Pump", 5,10);
        move surf = new move("Surf", 20,7);
        move icebeam = new move("Ice Beam",15,9);
        move crunch = new move("Crunch", 20, 7);
        mon mon1 = new mon("Blastoise",hydropump,surf,icebeam,crunch,type.WATER,100);

        move flamethrower = new move("Flame Thrower",15,9);
        move fly = new move("Fly",15, 7);
        move fireblast = new move("Fire Blast",5,10);
        mon mon2 = new mon("Charizard", flamethrower,fly,fireblast,crunch,type.FIRE,90);

        boolean cont = true;
        Random random = new Random();
        int rand = random.nextInt(4)+1;

        System.out.println("Trainer wants to battle");//out of while
        System.out.println("Trainer sends out "+mon2.getName());
        System.out.println("Go "+mon1.getName());

        while(cont){
            System.out.println(mon1.getName()+" : "+mon1.getHp()+"HP   vs   "+mon2.getName()+" : "+mon2.getHp()+"HP");
            boolean isMove = false;
            int thismove = 0;
            while(isMove == false) {
                System.out.println("What will " + mon1.getName() + " do?");
                mon1.tostring();
                String input = scan.next();
                switch (input) {
                    case "1":
                        if(mon1.getMove1().enuffPP() == false){
                            System.out.println("There is no more pp left for that move!!!");
                        }
                        else {
                            thismove = 1;
                            isMove = true;
                        }
                        break;
                    case "2":
                        if(mon1.getMove2().enuffPP() == false){
                            System.out.println("There is no more pp left for that move!!!");
                        }
                        else {
                            thismove = 2;
                            isMove = true;
                        }
                        break;
                    case "3":
                        if(mon1.getMove3().enuffPP() == false){
                            System.out.println("There is no more pp left for that move!!!");
                        }
                        else {
                            thismove = 3;
                            isMove = true;
                        }
                        break;
                    case "4":
                        if(mon1.getMove4().enuffPP() == false){
                            System.out.println("There is no more pp left for that move!!!");
                        }
                        else {
                            thismove = 4;
                            isMove = true;
                        }
                        break;
                    default:
                        System.out.println("Please enter a number which is associated with a move");
                        break;
                }
            }
            int dam;
            switch(thismove) {
                case 1:
                    if(mon1.getMove1().enuffPP() == false){
                        System.out.println("There is no more pp left for that move!!!");
                    }
                    else {
                        System.out.println(mon1.getName() + " used " + mon1.getMove1().getName());
                        if (mon2.getHp() < mon1.getMove1().getPower()) {
                            mon2.setHp(0);
                        } else {
                            mon2.battleCalc(mon1.getMove1().getPower());
                        }
                        mon1.getMove1().setPp(mon1.getMove1().getPp() - 1);
                    }
                    break;
                case 2:
                    System.out.println(mon1.getName()+" used " + mon1.getMove2().getName());
                    if(mon2.getHp() < mon1.getMove2().getPower()){
                        mon2.setHp(0);
                    }
                    else{
                        mon2.setHp(mon2.getHp()-mon1.getMove2().getPower());
                    }
                    mon1.getMove2().setPp(mon1.getMove2().getPp()-1);
                    break;
                case 3:
                    System.out.println(mon1.getName()+" used " + mon1.getMove3().getName());
                    if(mon2.getHp() < mon1.getMove3().getPower()){
                        mon2.setHp(0);
                    }
                    else{
                        mon2.setHp(mon2.getHp()-mon1.getMove3().getPower());
                    }
                    mon1.getMove3().setPp(mon1.getMove3().getPp()-1);
                    break;
                case 4:
                    System.out.println(mon1.getName()+" used " + mon1.getMove4().getName());
                    if(mon2.getHp() < mon1.getMove3().getPower()){
                        mon2.setHp(0);
                    }
                    else{
                        mon2.setHp(mon2.getHp()-mon1.getMove4().getPower());
                    }
                    mon1.getMove4().setPp(mon1.getMove4().getPp()-1);
                    break;
                default:
                    break;
            }
            if(mon2.getHp() <= 0){
                System.out.println(mon1.getName()+" : "+mon1.getHp()+"HP   vs   "+mon2.getName()+" : "+mon2.getHp()+"HP");
                System.out.println(mon2.getName()+" faints...");
                System.out.println(mon1.getName()+" wins!");
                return;
            }
            //make sure that the random value is for a move with enough pp
            rand = random.nextInt(4)+1;

            switch(rand) {
                case 1:
                    System.out.println(mon2.getName() + " used " + mon2.getMove1().getName());
                    if(mon1.getHp() < mon2.getMove1().getPower()){
                        mon1.setHp(0);
                    }
                    else{
                        mon1.setHp(mon1.getHp()-mon2.getMove1().getPower());
                    }
                    mon2.getMove1().setPp(mon1.getMove1().getPp()-1);
                    break;
                case 2:
                    System.out.println(mon2.getName() + " used " + mon2.getMove2().getName());
                    if(mon1.getHp() < mon2.getMove2().getPower()){
                        mon1.setHp(0);
                    }
                    else{
                        mon1.setHp(mon1.getHp()-mon2.getMove2().getPower());
                    }
                    mon2.getMove2().setPp(mon1.getMove2().getPp()-1);
                    break;
                case 3:
                    System.out.println(mon2.getName() + " used " + mon2.getMove3().getName());
                    if(mon1.getHp() < mon2.getMove3().getPower()){
                        mon1.setHp(0);
                    }
                    else{
                        mon1.setHp(mon1.getHp()-mon2.getMove3().getPower());
                    }
                    mon2.getMove3().setPp(mon1.getMove3().getPp()-1);
                    break;
                case 4:
                    System.out.println(mon2.getName() + " used " + mon2.getMove4().getName());
                    if(mon1.getHp() < mon2.getMove4().getPower()){
                        mon1.setHp(0);
                    }
                    else{
                        mon1.setHp(mon1.getHp()-mon2.getMove4().getPower());
                    }
                    mon2.getMove4().setPp(mon1.getMove4().getPp()-1);
                    break;
                default:
                    break;
            }
            if(mon1.getHp() <= 0){
                System.out.println(mon1.getName()+" : "+mon1.getHp()+"HP   vs   "+mon2.getName()+" : "+mon2.getHp()+"HP");
                System.out.println(mon1.getName()+" faints...");
                System.out.println(mon2.getName()+" wins!");
                return;
            }
        }
    }
}

