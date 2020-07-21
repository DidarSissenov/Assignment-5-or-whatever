/**
 * Auto Generated Java Class.
 */
public class LoudGoose extends WaterFowl implements Attacker{
  
  protected int killCount;
  
  public LoudGoose(String name, String primaryColor, int killCount){
    super(name, primaryColor);
    super.name=name;
    super.primaryColor=primaryColor;
    this.killCount=killCount;
  }
  
  public int getKillCount(){
    return killCount;
  }
  
  public void attacker(){                         //Xiong and Ji designed this method
    int objectHealth = health;
    if(!(name.equals("LoudGoose")) && health>0 && objectHealth>0){
      if(objectHealth==1){
        this.killCount++;
      }
      objectHealth = objectHealth-1;
      System.out.println("LoudGoose attack " + name + " " + this.killCount + " times.");
    }
    else{
      System.out.println("LoudGoose can't attack " + name + ".");
    }
  }
  
}
