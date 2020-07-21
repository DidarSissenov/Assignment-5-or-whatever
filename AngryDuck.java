public class AngryDuck extends WaterFowl implements Teleport {

     protected int killCount;

     public AngryDuck(String name, String primaryColor, int killCount) {
          super(name, primaryColor);
          super.name = name;
          super.primaryColor = primaryColor;
          this.killCount = killCount;
          getPosition = X + " " + Y;
     }

     public void teleport() {
          X = (int) ((Math.random() * (999 - 501 + 1) + 501));
          Y = (int) ((Math.random() * (999 - 1 + 1) + 1));
          getPosition = X + " " + Y;
     }

     public String getPosition() {
          return getPosition;
     }

     public int getKillCount() {
          return killCount;
     }

     public void attacker() {
          int objectHealth = health;
          if (!(name.equals("AngryDuck")) && health > 0 && objectHealth > 0) {
               if (objectHealth == 1) {
                    this.killCount++;
               }
               objectHealth = objectHealth - 1;
               System.out.println("AngryDuck attack " + name + " " + this.killCount + " times.");
          } else {
               System.out.println("AngryDuck can't attack " + name + ".");
          }
     }
}
