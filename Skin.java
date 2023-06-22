public abstract class Skin {
    private String nomeS;
    private String cor1;
    private String cor2;
    private String cor3;
    private String cor4;
    private float preco;

    public Skin(String nomeS, String cor1, String cor2, String cor3, String cor4, float preco){
        this.nomeS = nomeS;
        this.cor1 = cor1;
        this.cor2 = cor2;
        this.cor3 = cor3;
        this.cor4 = cor4;
        this.preco = preco;
    }
    public abstract String getNomeA();
    public String getNomeS(){
        return nomeS;
    }
    public float getPreco(){
        return preco;
    }
    public float promoMercadoNoturno(float k){
        return getPreco()*k;
    }
}
