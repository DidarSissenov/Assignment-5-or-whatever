public abstract class Animal{

     protected String name, getPosition;
     protected String primaryColor;
     protected int health=3;
     protected static int count;
     protected int X, Y;

     public Animal(String name, String primaryColor){
          this.name=name;
          this.primaryColor=primaryColor;
          count++;
     }


     public void hit() {
          if(health<=0) {
               System.out.println(name + " looks dead ;c");
               count--;
          }else{
               health--;
               System.out.println(name + " is hit");
          }
     }

     public void setName(String name) {
          this.name = name;
     }
     public String getName(){
          return name;
     }

     public void setPrimaryColor(String primaryColor) {
          this.primaryColor = primaryColor;
     }
     public String getPrimaryColor(){
          return primaryColor;
     }

     public int getHealth(){
          return health;
     }
     public static int getCount() {
          return count;
     }

     public String toString() {
          return getName() + ' ' + primaryColor;
     }
}
