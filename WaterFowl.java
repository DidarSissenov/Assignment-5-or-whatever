public abstract class WaterFowl extends Animal{

     public WaterFowl(String name, String primaryColor){
          super(name, primaryColor);
          super.name=name;
          super.primaryColor=primaryColor;
     }

     boolean fly=false;
     public void fly() {
          if (health > 0) {
               if (fly == false) {
                    System.out.println(name + " is Flying");
                    fly = true;
               } else {
                    System.out.println(name + " is already flying ");
               }
          }else{
               System.out.println(name + " is Dead");
          }
     }

      public void land() {
           if (health > 0) {
                if (fly == true) {
                     System.out.println(name + " is Landing");
                     fly = false;
                } else {
                     System.out.println(name + " is already landed ");
                }
           }else{
                System.out.println(name + " is Dead");
           }
      }

     public void swim() {
          if (health >= 0) {
               System.out.println(name + " is Swimming");
          }else{
               System.out.println(name + " is already Dead ");
          }
     }

}
