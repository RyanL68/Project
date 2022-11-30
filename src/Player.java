public class Player {

    private int HP;
    private int maxHP;
    private int atk;
    private int def;
    private int lvl;

    private int coins;

    private String Character;

    private int numPotions;

    public Player(int maxHP,int atk,int def,int lvl,int numPotions){
        this.maxHP=maxHP;
        this.atk=atk;
        this.def=def;
        this.lvl=lvl;
        this.numPotions=numPotions;

    }

    public void heal(){
        if(numPotions > 0){
            numPotions--;
            HP = maxHP;
        }
    }
    public int getATK(){
        return atk;
    }
    public int getDef(){
        return def;
    }

    public int getLvl(){
        return lvl;
    }
    public int getNumPotions(){
        return numPotions;
    }
    public int getcoin(){
        return coins;
    }
    public int setcoin(int coins,int ccoin){
        this.coins=coins;
        coins=+ccoin;
        return coins;
    }


    public int getHp(){
        return HP;
    }
    public int getMaxHP(){
        return maxHP;
    }

    public void setHP(int hp){
        HP = hp;
    }

    public void changeHP(){
    maxHP = maxHP+15;
    }
    public void changeAttack(){
        atk=atk+5;
    }
    public void changelvl(){
        lvl=lvl+1;
    }

    public boolean isAlive(){
        if(HP > 0){
            return true;
        }else{
            return false;
        }

    }
    public void Character(String choice){
        String Character = " ";
        this.Character=Character;
        if(choice.equals("1")){
            Character="Charles";
            maxHP=300;
            atk=50;
            def=60;
            System.out.println("You have chosen Charles!");
            coins=10;
        }
        if(choice.equals("2")){
            Character="Misty";
            maxHP=250;
            atk=70;
            def=10;
            coins=10;
            System.out.println("You have chosen Misty!");
        }
        if (choice.equals("3")){
            Character="Roan";
            maxHP=150;
            atk=250;
            def=5;
            coins=10;
            System.out.println("You have chosen Roan!");
        }
    }
    public void combat(int damage){
        HP=HP-damage;
        System.out.println("You got hit! You take "+damage+" Damage!");
    }

    public void buypotion(){
        numPotions++;
        coins=coins-5;
        System.out.println("you bought a potion. \nYou have "+numPotions+" potions\n You have "+getcoin()+" coins.");
    }
}
