package modultiga;

/**
 *
 * @author Kiki Aulia
 */
class DemoOverride2 {
   public static void min(String [] args) { 
       B obj = new B();
       obj.setA(50);
       obj.setB(150);
       //akan memanggil methodyang terdapat pada kelas B
       obj.tampilkanNilai();
}
}