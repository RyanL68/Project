import java.util.Scanner;
public class Runner{
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Player p = new Player(1,1,1,1,3);
    Monster m = new Monster(0,0,0);
    int kcount=1;

    System.out.println("Welcome to Ryan's rpg Game");
    System.out.println("You can choose your adventure as one of these characters \n1. Charles\nCharles is a knight with high defence and normal attack damage\n2. Misty\nMisty is an archer with high damage but lacks in defence \n3. Roan\nRoan is a mage. He is a glass canon.\nenter 1 2 or 3 to select ur character.");
    String cho = scan.nextLine();
    p.Character(cho);
    System.out.println("You start you adventure down a single path....");
        int c =p.setcoin(10,0);
        p.setHP(100);
    while(p.isAlive()) {
        String choice = "";
        System.out.println("0.stats");
        System.out.println("1.buy potion");
        System.out.println("2.foward");
        System.out.println("3.heal");
        System.out.println("please put 0-3 to choose an option");
        choice = scan.nextLine();

        if (choice.equals("0")) {
            System.out.println("lvl: " + p.getLvl());
            System.out.println("HP: " + p.getHp() + "/" + p.getMaxHP());
            System.out.println("ATK: " + p.getATK());
            System.out.println("Def:" + p.getDef());
            System.out.println("potions: " + p.getNumPotions());
            System.out.println("coins: " + p.getcoin());
        }
        if (choice.equals("1")) {
            String temp = "N";
            System.out.println("        The store      ");
            System.out.println("Health potions---5 coins");
            System.out.println("Enter Y to buy potion N to exit");
            System.out.println("You have " + p.getcoin() + " coins");
            temp = scan.nextLine();
            if (p.getcoin() >= 5) {
                if (temp.equalsIgnoreCase("Y")) {
                    p.setcoin(p.getcoin(), -5);
                    p.buypotion();
                    System.out.println("Thank you for buying a potion! See you next time");
                } else if (temp.equalsIgnoreCase("N")) {
                    System.out.println("See you next time");
                } else{
                    System.out.println("Please put in a valid input");
                }
            }
        }
        String fight = null;
        if (choice.equals("2")) {
            int chg = 0;
            String Name = m.BName();
            System.out.println("You meet a wild " + Name);
            System.out.println("Fight? Y N");
            fight = scan.nextLine();
            if (fight.equalsIgnoreCase("Y")) {
                System.out.println("You are Now fighting " + Name);
                while (p.isAlive() && m.isAlive()) {
                    int count = 0;
                    String temp2 = "";
                    System.out.println("1.Normal Attack");
                    System.out.println("2.Special Attack");
                    System.out.println("3.Heal");
                    temp2 = scan.nextLine();
                    if (temp2.equals("1")) {
                        m.combat(p.getATK());
                        p.combat(m.getAtk());
                        System.out.println("Your HP: " + p.getHp() + "/" + p.getMaxHP());
                        System.out.println(Name + " HP: " + m.getHp());
                    }
                    if (temp2.equals("2")) {
                        if (count % 2 == 0) {
                            if (cho.equals("1")) {
                                m.combat(p.getATK() * 2);
                                System.out.println("You hit " + Name + " really hard stunning " + Name);
                                System.out.println("You get another hit");
                                m.combat(p.getATK());
                                p.combat(m.getAtk());
                                System.out.println("Your HP: " + p.getHp() + "/" + p.getMaxHP());
                                System.out.println(Name + " HP: " + m.getHp());
                            }
                            if (cho.equals("2")) {
                                System.out.println("You shoot a flurry of arrows at " + Name);
                                m.combat(p.getATK() / 2);
                                m.combat(p.getATK() / 2);
                                m.combat(p.getATK() / 2);
                                m.combat(p.getATK() / 2);
                                p.combat(m.getAtk());
                                System.out.println("Your HP: " + p.getHp() + "/" + p.getMaxHP());
                                System.out.println(Name + " HP: " + m.getHp());

                            }
                            if (cho.equals("3")) {
                                System.out.println("You bombard " + Name + " with fireballs");
                                m.combat(p.getATK() / (2 / 3));
                                m.combat(p.getATK() / (2 / 3));
                                m.combat(p.getATK() / (2 / 3));
                                m.combat(p.getATK() / (2 / 3));
                                p.combat(m.getAtk());
                                System.out.println("Your HP: " + p.getHp() + "/" + p.getMaxHP());
                                System.out.println(Name + " HP: " + m.getHp());
                            }
                        }
                    }
                    if (temp2.equals("3")) {
                        p.heal();
                        System.out.println("Healed to full HP");
                        System.out.println("You have " + p.getNumPotions() + " potions");
                        p.combat(m.getAtk());
                        System.out.println("Your HP: " + p.getHp() + "/" + p.getMaxHP());
                        System.out.println(Name + " HP: " + m.getHp());

                    }
                }
                if(m.getHp()<=0){
                    int rand= (int)(Math.random()*10);
                    System.out.println("You killed"+Name);
                    System.out.println("You got"+rand+"coins!");
                    p.setcoin(p.getcoin(),rand);
                    kcount++;
                    if(kcount % 2 == 0){
                        System.out.print("You level Up!");
                        p.changeAttack();
                        p.changeHP();
                        p.changelvl();


                    }
                }

        } else if (fight.equalsIgnoreCase("N")) {
            System.out.println("You run away..." + Name + " hits you for " + m.getAtk() + " damage");
            p.setHP(p.getHp() - m.getAtk());
        }

    }
        if(choice.equals("3")){
           p.heal();
        }


    }
}
}
