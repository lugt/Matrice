package Matrice.Alpha.Cellular;

/**
 * Created by Frapo on 2017/1/20.
 */
public class Body {
    public Dendrite[] D;
    public Axon A;
    public Axon[] Extra_A;
    public Body(){
        D = new Dendrite[100];
        A = new Axon();
    }
}
