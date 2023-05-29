public abstract class Skin {
    private String nome;
    private String corPrimaria;
    private String corSecundaria;
    private float preco;

    public Skin(String nome, String corPrimaria, String corSecundaria, float preco){
        this.nome = nome;
        this.corPrimaria = corPrimaria;
        this.corSecundaria = corSecundaria;
        this.preco = preco;
    }
     public float getPreco(){
        return preco;
    }

}
