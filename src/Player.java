public class Player {

Monster m = new Monster(1,1);


    private int HP;
    private int maxHP;
    private int atk;
    private int lvl;

    private int coins;

    private String Character;

    private int numPotions;

    public Player() {

    }

    public Player(int maxHP, int atk, int lvl, int numPotions) {
        this.maxHP = maxHP;
        this.atk = atk;
        this.lvl = lvl;
        this.numPotions = numPotions;

    }

    public void heal() {
        if (numPotions > 0) {
            numPotions--;
            HP = maxHP;
        } else {
            System.out.println("You don't have enough potions ");
            System.out.println("You can go to shop to buy them ");
        }

    }

    public int getATK() {
        return atk;
    }

    public int getLvl() {
        return lvl;
    }

    public int getNumPotions() {
        return numPotions;
    }

    public int getcoin() {
        return coins;
    }
    public void changecoins(int con){
        coins+=con;
    }

    public void setcoin(int coin) {
        coins =coins;
    }


    public int getHp() {
        return HP;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int setHP(int hp) {
        HP = hp;
        return HP;
    }


    public boolean isAlive() {
        if (HP <= 0) {
            return false;
        } else {
            return true;
        }

    }

    public void Character(String choice) {
        String Character = " ";
        if (choice.equals("1")) {
            Character = "Charles";
            maxHP = 300;
            atk = 50;
            System.out.println("You have chosen Charles!");
        }
        if (choice.equals("2")) {
            Character = "Misty";
            maxHP = 250;
            atk = 70;
            System.out.println("You have chosen Misty!");
        }
        if (choice.equals("3")) {
            Character = "Roan";
            maxHP = 150;
            atk = 250;
            System.out.println("You have chosen Roan!");
        }
        this.Character = Character;
    }

    public void combat(int damage,int count,int num) {



        if(count==3){
            if(num==3){
                System.out.println("Troll Hits You really Hard! You get Stunned!");
                System.out.println("You take " + damage*2 + " Damage!");
                System.out.println("You got hit! You take " + damage + " Damage!");
                HP = HP - damage*2;
                HP = HP - damage;
            } if (num==2){
                System.out.println("Goblin furiously stabs you");
                System.out.println("You got hit! You take " + damage/2 + " Damage!");
                System.out.println("You got hit! You take " + damage/2 + " Damage!");
                System.out.println("You got hit! You take " + damage/2 + " Damage!");
                HP = HP - damage/2;
                HP = HP - damage/2;
                HP = HP - damage/2;

            } else if (num==3){
                System.out.println("Orc screams in rage! You get knocked back by the roar!");
                System.out.println("You knocked back and you take " + damage/3 + " Damage!");
                System.out.println("You get up and see Orc has healed!");
                m.changeHp(300);
            }
        }else{
            HP = HP - damage;
            System.out.println("You got hit! You take " + damage + " Damage!");
        }

    }

    public void lvlup() {
            lvl += 1;
            maxHP += 15;
            atk += 5;
            System.out.println("You leveled up! Your stats increase");

    }

    public void buypotion() {
            numPotions++;
            coins = coins - 5;
            System.out.println("you bought a potion. \nYou have " + numPotions + " potions\n You have " + getcoin() + " coins.");

    }
}
