public class CuriousBunny extends Animal implements Teleport{

     public CuriousBunny(String name, String primaryColor){
          super(name, primaryColor);
          super.name = name;
          super.primaryColor = primaryColor;
          getPosition = X + " " + Y;
     }

     public void hop() {
          if(health>0) {
               System.out.println(name + " is hopping");
          }else {
               System.out.println(name + " is Dead ");
          }
     }

     @Override
     public void teleport() {
          X = (int)(( Math.random() * (499 - 1 + 1) + 1));
          Y = (int)(( Math.random() * (999 - 1 + 1) + 1));
          getPosition = X + " " + Y ;
     }
     
     public String getPosition()
     {
       return getPosition;
     }
}
