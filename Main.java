import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        Skin vandal = new Rifles("Chronovoid","Azul", "Verde", 60);
        Skin phantom = new Rifles("Sublime", "Dourado","Vermelho", 50);
        Skin bucky = new Shotguns("Sublime", "Dourado","Branco", 70);
        Skin shorty = new Shotguns("Chronovoid","Roxo", "Azul", 90);
    }
    private float valorCompra = 0f;
    public ArrayList<Skins> skins;
    public void calculaCompra(){
        for (var skin: skins)
            valorCompra += skin.getPreco();
    }

}
