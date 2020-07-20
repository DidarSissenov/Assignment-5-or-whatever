public class Main {

    public static void main(String[] args) {
         LoudGoose goosie = new LoudGoose("Goosie", "Green");
         AngryDuck duck1 = new AngryDuck("Drake", "White");
         HappyPig pigasus = new HappyPig("PigAsus", "Pink");
         CuriousBunny banan = new CuriousBunny("Banan", "Yellow");
//Goose
         goosie.setName("Goosie");
         goosie.setPrimaryColor("Green");
         goosie.swim();
         goosie.fly();
         System.out.println(goosie.getPrimaryColor());
         System.out.println(goosie.getName());
         System.out.println(goosie.getHealth() + " hp left");
         System.out.println("----------------------------------");
//Duck
         duck1.setName("Drake");
         duck1.fly();
         duck1.fly();
         duck1.land();
         duck1.hit();
         duck1.hit();
         duck1.hit();
         duck1.land();
         duck1.hit();
         duck1.fly();
         duck1.swim();
         System.out.println(duck1.getName());
         System.out.println(duck1.getPrimaryColor());
         System.out.println("----------------------------------");
//Pig
         pigasus.setName("PigAsus");
         System.out.println(pigasus.getName());
         pigasus.sleep();
         pigasus.roll();
         pigasus.hit();
         pigasus.hit();
         System.out.println(pigasus.getHealth()+" hp left");
         pigasus.hit();
         pigasus.hit();
         pigasus.roll();
         System.out.println(pigasus.toString());
         System.out.println("----------------------------------");
//Bunny
         banan.setName("Banan");
         banan.hop();
         banan.hit();
         System.out.println(banan.getHealth()+ " hp left");
         System.out.println(banan.getPrimaryColor());
         banan.hit();
         System.out.println(banan.getName()+ " doesn't want to play anymore");
         System.out.println(Animal.getCount()+" Animals are alive");
//Teleport
         System.out.println("----------------------------------");
         banan.teleport();
         System.out.println(banan.getName() + " at " + banan.getPosition());

         duck1.teleport();
         System.out.println(duck1.getName() + " at " + duck1.getPosition());
         
    }
}
