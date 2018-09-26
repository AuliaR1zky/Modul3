package modultiga;

/**
 *
 * @author Kiki Aulia
 */
class B extends A {
    private int b;
    public void setB (int nilai) {
        b = nilai;
    }
    public int getB() {
        return b;
    }
    public void tampilkanNilai() {
        super.tampilkanNilai();
        System.out.println("Nilai B: " + getB());
    }
}
