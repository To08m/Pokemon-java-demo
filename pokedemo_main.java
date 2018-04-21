import java.util.Scanner;
import java.util.Random;

public class pokedemo_main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        move hydropump = new move("Hydro Pump", 5,100);
        move surf = new move("Surf", 20,70);
        move icebeam = new move("Ice Beam",15,90);
        move crunch = new move("Crunch", 20, 70);
        mon mon1 = new mon("Blastoise",hydropump,surf,icebeam,crunch,type.WATER,100);

        move flamethrower = new move("Flame Thrower",15,90);
        move fly = new move("Fly",15, 70);
        move fireblast = new move("Fire Blast",5,100);
        mon mon2 = new mon("Charizard", flamethrower,fly,fireblast,crunch,type.FIRE,90);

        boolean cont = true;
        Random random = new Random();
        int rand = random.nextInt(4)+1;

        while(cont){
            System.out.println("Trainer wants to battle");//out of while
            System.out.println("Trainer sends out "+mon2.getName());
            System.out.println("Go "+mon1.getName());
            System.out.println(mon1.getName()+" : "+mon1.getHp()+"HP   vs   "+mon2.getName()+" : "+mon2.getHp()+"HP");
            System.out.println("What will "+mon1.getName()+" do?");
            mon1.tostring();
            int thismove = scan.nextInt();
            switch(thismove) {
                case 1:
                    System.out.println(mon1.getName()+" used " + mon1.getMove1().getName());
                    mon2.setHp(mon2.getHp()-mon1.getMove1().getPower());
                    mon1.getMove1().setPp(mon1.getMove1().getPp()-1);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
            if(mon2.getHp() < 0){
                System.out.println(mon1.getName()+" wins!");
            }
            rand = random.nextInt(4)+1;
            switch(rand) {
                case 1:
                    System.out.println(mon2.getName() + " used   " + mon2.getMove1().getName());
                    mon1.setHp(mon1.getHp()-mon1.getMove1().getPower());
                    mon2.getMove1().setPp(mon1.getMove1().getPp()-1);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }
    }
}

