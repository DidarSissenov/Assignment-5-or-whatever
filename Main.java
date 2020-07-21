public class Main {

    public static void main(String[] args) {
         LoudGoose goosie = new LoudGoose("Goosie", "Green" , 0);
         AngryDuck duck1 = new AngryDuck("Drake", "White" , 0);
         HappyPig pigasus = new HappyPig("PigAsus", "Pink");
         CuriousBunny banan = new CuriousBunny("Banan", "Yellow");

//Teleporter
         System.out.println("----------------------------------");
         System.out.println(banan.getName() + " at " + banan.getPosition());
         banan.teleport();
         System.out.println(banan.getName() + " at " + banan.getPosition());

         System.out.println(duck1.getName() + " at " + duck1.getPosition());
         duck1.teleport();
         System.out.println(duck1.getName() + " at " + duck1.getPosition());

//Attack
         System.out.println("----------------------------------");
         goosie.attacker();
         goosie.getKillCount();

         duck1.attacker();
         duck1.getKillCount();
    }
}
