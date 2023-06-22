import java.util.ArrayList;
public class Marketplace {
    private ArrayList<Skin> rifles;
    private ArrayList<Skin> shotguns;
    private float valorCompra;
    private float valorCompraPromo;
    private float valorRifles;
    private float valorShotguns;
    private float valorRiflesPromo;
    private float valorShotgunsPromo;

    public Marketplace extends caixaFinal(){
        rifles = new ArrayList<>();
        shotguns = new ArrayList<>();
        this.valorCompra = 0f;
    }
    public void addRifle(Skin rifle){
        rifles.add(rifle);
        System.out.println("A arma " + rifle.getNomeA() + " com a skin " + rifle.getNomeS() + " foi adcionado com sucesso!");
    }
    public void addShotgun(Skin shotgun){
        shotguns.add(shotgun);
        System.out.println("A arma " + shotgun.getNomeA() + " com a skin " + shotgun.getNomeS() + " foi adcionado com sucesso!");
    }
    public float getValorRifles(){
        return valorRifles;
    }
    public float getValorShotguns(){
        return valorShotguns;
    }
    public void calculaRifles(){
        for (var rifle: rifles){
            valorRifles += rifle.getPreco();
        }
    }
    public void calculaRiflesPromo(){
        for (var rifle: rifles){
            valorRiflesPromo += rifle.promoMercadoNoturno(1);
        }
    }
    public void calculaShotguns(){
        for (var shotgun: shotguns){
            valorShotguns += shotgun.getPreco();
        }
    }
    public void calculaShotgunsPromo(){
        for (var shotgun: shotguns){
            valorShotgunsPromo += shotgun.promoMercadoNoturno(1);
        }
    }
    public void calculaValorCompra(){
        for (var rifle: rifles){
            valorCompra += rifle.getPreco();
        }
        for (var shotgun: shotguns){
            valorCompra += shotgun.getPreco();
        }
    }
    public void calculaValorPromo(){
        for (var rifle: rifles){
            valorCompraPromo += rifle.promoMercadoNoturno(1);
        }
        for (var shotgun: shotguns){
            valorCompraPromo += shotgun.promoMercadoNoturno(1);
        }
    }
        System.out.println("Valor total de tudo é: " + valorCompra);
        System.out.println("Valor total das promoçoes é: " + valorCompraPromo);
    }
}
