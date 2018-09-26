package modultiga;

/**
 *
 * @author Kiki Aulia
 */
public class Gajah extends Hewan {
    public static void testClassMethod() {
        System.out.println("The Class Method in hewan...");
    }
    //Meng over ride method pd class hewan
    public void testInstanceMethod() {
        System.out.println("The Instance Method in hewan...");
    }
    public static void main(String [] args) {
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();;
        myHewan.testInstanceMethod();
    }
    }

