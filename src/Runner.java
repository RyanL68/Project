import java.util.Scanner;
public class Runner{
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Player p = new Player(1,1,1,1,3,10);
    Monster m = new Monster(0,0,0);
    Shop s = new Shop();
    System.out.println("Welcome to Ryan's rpg Game");
    System.out.println("You can choose your adventure as one of these characters \n1. Charles\nCharles is a knight with high defence and normal attack damage\n2. Misty\nMisty is an archer with high damage but lacks in defence \n3. Roan\nRoan is a mage. He is a glass canon.\nenter 1 2 or 3 to select ur character.");
    String cho = scan.nextLine();
    p.Character(cho);
    System.out.println("You start you adventure down a single path....");

    p.setHP(100);
    while(p.isAlive()){
        String choice ="";
        System.out.println("0.stats");
        System.out.println("1.shop");
        System.out.println("2.foward");
        System.out.println("3.potions");
        System.out.println("4.coins");
        System.out.println("5.Heal");
        System.out.println("please put 0-5 to choose an option");
        choice=scan.nextLine();

        if(choice.equals("0")){
            System.out.println("lvl: "+p.getLvl());
           System.out.println("HP: "+p.getHp());
           System.out.println("ATK: "+p.getATK());
           System.out.println("Def:"+p.getDef());
            System.out.println("potions: "+p.getNumPotions());
            System.out.println("coins: "+p.getcoin());
        }
        if(choice.equals("1")){
            s.list();
            String temp = "N";
            s.buy(p.getcoin(), temp);
        }
        if(choice.equals("2")){
            int chg=0;
            String Name=m.BName();
            System.out.println("You meet a wild "+Name);
            System.out.println("Fight? Y N");
            String fight = scan.nextLine();
            if(fight.equalsIgnoreCase("Y")){

            }
            else if (fight.equalsIgnoreCase("N")){
                System.out.println("You run away..."+Name+" hits you for "+m.getAtk()+" damage");
                p.setHP(p.getHp()-m.getAtk());
            }

        }


    }
}
}
