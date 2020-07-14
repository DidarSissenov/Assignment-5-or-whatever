public class CuriousBunny extends Animal{

     public CuriousBunny(String name, String primaryColor){
          super(name, primaryColor);
          super.name = name;
          super.primaryColor = primaryColor;
     }

     public void hop() {
          if(health>0) {
               System.out.println(name + " is hopping");
          }else {
               System.out.println(name + " is Dead ");
          }
     }
}
