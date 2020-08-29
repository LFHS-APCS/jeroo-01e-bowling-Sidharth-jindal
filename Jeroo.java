/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {
    // Put your own methods here
  public void setupBowling(){
  toprow();
  threerow();
  tworow();
  smallrow();
}
public void hopplant(){
  hop();
  plant();
}
public void toprow(){
  hop();
  turn(RIGHT);
  hopplant();
  turn(LEFT);
  hop();
  hopplant();
  hop();
  hopplant();
  hop();
  hopplant();
}
public void threerow(){
  turn(RIGHT);
  hop();
  turn(RIGHT);
  hopplant();
  hop();
  hopplant();
  hop();
  hopplant();
}
public void tworow(){
  turn(LEFT);
  hop();
  turn(LEFT);
  hopplant();
  hop();
  hopplant();
}
public void smallrow(){
  turn(RIGHT);
  hop();
  turn(RIGHT);
  hopplant();
}

    
    
    
    
    
    
    

    // Do NOT touch the following code.
    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
