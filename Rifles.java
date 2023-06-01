public class Rifles extends Skin{
    public String nomeA;

    public Rifles(String nomeA, String nomeS, String cor1, String cor2, String cor3, String cor4, float preco){
        super(nomeS, cor1, cor2, cor3, cor4, preco);
        this.nomeA = nomeA;
    }
    public String getNomeA(){
        return nomeA;
    }
    public String getNomeS(){
        return nomeS;
    }
    public float getPreco(){
        return preco;
    }

    public float promoMercadoNoturno(float k){
        return preco*k;
    }
}
