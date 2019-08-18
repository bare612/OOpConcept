package abstruction;

public abstract class  Smartphone implements phone {

     public String os;

     public abstract  void  touchScreen();
     public void  browsing(){
        System.out.println("Smart phone Browses");
    }
      public abstract void setOperatingSystem();
    public void call() {
        System.out.println("Smart phone calling");
    }

    public void text(String message) {
        System.out.println("Texted: " + message);

    }
}
