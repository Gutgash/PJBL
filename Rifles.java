import java.lang.Math;
public class Rifles extends Skin{
    private String nomeA;

    public Rifles(String nomeA, String nomeS, String cor1, String cor2, String cor3, String cor4, float preco){
        super(nomeS, cor1, cor2, cor3, cor4, preco);
        this.nomeA = nomeA;
    }
    public String getNomeA(){
        return nomeA;
    }
}