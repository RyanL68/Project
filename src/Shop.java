public class Shop {
    Player p = new Player(1,1,1,1,1,1);
    public void list(){
        System.out.println("        The store      ");
        System.out.println("Health potions---5 coins");
        System.out.println("Only thing in the shop..");
        System.out.println("Enter Y to buy potion...");
    }
    public void buy(int coins,String input){
        String choice = input;
        if(p.getcoin()>=5){
            if(choice.equalsIgnoreCase("Y")){
                p.buypotion();
            }else{
                System.out.println("please enter a valid entry");
            }
        }

    }
}
