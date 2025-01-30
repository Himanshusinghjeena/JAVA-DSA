public class Basics {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.setColor("green");
        System.out.println(p.getColor());
        p.setColor("Red");
        System.out.println(p.getColor());
        p.setTipSize(6);
        System.out.println(p.getTipSize());
    }
}

class Pen{
   private String color;
   private int tipSize;

   String getColor(){
    return this.color;
   }

   int getTipSize(){
    return this.tipSize;
   }

    void setColor(String color){
        this.color=color;
    }

    void setTipSize(int tipSize){
        this.tipSize=tipSize;
    }

}