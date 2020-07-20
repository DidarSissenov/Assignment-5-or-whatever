public class AngryDuck extends WaterFowl implements Teleport{

     public AngryDuck(String name, String primaryColor) {
          super(name, primaryColor);
          super.name = name;
          super.primaryColor = primaryColor;
     }


     public void teleport() {
          X = (int)(( Math.random() * (999 - 501 + 1) + 501));
          Y = (int)(( Math.random() * (999 - 1 + 1) + 1));
          getPosition = X + " " + Y ;
     }
     
     public String getPosition()
     {
       return getPosition;
     }
}