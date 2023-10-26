public class Persegi extends Bangundatar{
    public Persegi(double P,double L){
        super(P,L);
    }

    public double Luas(){
        return getP()*getP();
    }
    public double Keliling(){
        return 4*getP();
    }
}
