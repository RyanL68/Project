public class Monster {

    private String Name;
    private int hp;
    private int atk;
    private int def;

    public Monster(int hp, int atk, int def) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public int getHp() {
        return hp;
    }

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public String BName(){
        String Name = " ";
        this.Name=Name;
        int rand = (int)(Math.random()*4);
        if(rand==1){
            Name="Orc";
            hp=200;
            atk=30;
            def=10;
        }else if(rand==2){
            Name="Goblin";
            hp=100;
            atk=30;
            def=0;
        }else{
            Name="Troll";
            hp=500;
            atk=5;
            def=20;
        }

        return Name;
    }

    public void combat(int damage){
        System.out.println("You hit "+Name+" for "+damage+" Damage!");
        hp=hp-damage;
    }

    }


