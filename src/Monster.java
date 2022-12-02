import javax.management.StringValueExp;

public class Monster {

    private String Name;
    private int hp;
    private int atk;



    public Monster(int hp, int atk) {
        this.hp = hp;
        this.atk = atk;


    }
    public Monster(){

    }

    public boolean isAlive() {
        if (hp <= 0) {
            return false;
        } else {
            return true;
        }

    }



    public int changeHp(int change){
        hp+=change;
        return hp;
    }
    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }



    public String BName(int num) {
        String Name = " ";

        if (num== 1) {
            Name = "Orc";
            hp = 600;
            atk = 60;
        } else if (num== 2) {
            Name = "Goblin";
            hp = 400;
            atk = 50;
        } else {
            Name = "Troll";
            hp = 1000;
            atk = 20;
        }
        this.Name = Name;
        return Name;
    }




    public void combat(int damage) {

        if (isAlive()) {
            hp = hp - damage;
            System.out.println("You hit " + Name + " for " + damage + " Damage!");

        }


        }



}



