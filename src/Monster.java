public class Monster {
    Player p = new Player();
    private String Name;
    private int hp;
    private int atk;


    private int kcount;

    public int getkcount() {
        return kcount;
    }



    public Monster(int hp, int atk) {
        this.hp = hp;
        this.atk = atk;
        kcount=1;
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
            hp = 200;
            atk = 30;
        } else if (rand == 2) {
            Name = "Goblin";
            hp = 100;
            atk = 30;
        } else {
            Name = "Troll";
            hp = 500;
            atk = 5;
        }
        this.Name = Name;
        return Name;
    }


    public void combat(int damage) {

        if (isAlive()) {
            hp = hp - damage;
            System.out.println("You hit " + Name + " for " + damage + " Damage!");
        }

        if(!isAlive()){
            int rand = (int) (Math.random() * 10);
            p.setcoin(rand);
            System.out.println("You killed " + Name);
            System.out.println("You got " + rand + " coins!");
            System.out.println("You got " + rand + " coins!");
            kcount++;
            }

        }




}



