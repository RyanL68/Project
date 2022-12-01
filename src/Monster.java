public class Monster {

    private String Name;
    private int hp;
    private int atk;


    private int kcount;

    public int getkcount() {

        return kcount;
    }



    public Monster(int hp, int atk,int kcount) {
        this.hp = hp;
        this.atk = atk;
        this.kcount=kcount;
    }

    public boolean isAlive() {
        if (hp <= 0) {
            return false;
        } else {
            return true;
        }

    }


    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }



    public String BName() {
        String Name = " ";
        int rand = (int) (Math.random() * 4);
        if (rand == 1) {
            Name = "Orc";
            hp = 600;
            atk = 60;
        } else if (rand == 2) {
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
        if (!isAlive()){
            kcount++;
        }

        }



}



