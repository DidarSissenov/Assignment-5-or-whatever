public class HappyPig extends Animal{

     public HappyPig(String name, String primaryColor){
          super(name, primaryColor);
          super.name = name;
          super.primaryColor = primaryColor;
     }

     public void sleep() {
          if(health>0) {
               System.out.println(name + " is Sleeping");
          }else {
               System.out.println(name + " id Dead ");
          }
     }
     public void roll() {
          if (health >0) {
               System.out.println(name + " is rolling");
          } else {
               System.out.println(name + " i Dead ");
          }
     }

     @Override
     public String toString() {
          return super.toString();
     }
}
