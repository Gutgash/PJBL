import java.util.ArrayList;
public class Marketplace {
    private ArrayList<Rifles> rifles;
    private ArrayList<Shotguns> shotguns;
    private float valorCompra;
    private float valorRifles;
    private float valorShotguns;

    public Marketplace(){
        rifles = new ArrayList<>();
        shotguns = new ArrayList<>();
        this.valorCompra = 0f;
    }
    public void addRifle(Rifles rifle){
        rifles.add(rifle);
        System.out.println("A arma " + rifle.getNomeA() + " com a skin " + rifle.getNomeS() + " foi adcionado com sucesso!");
    }
    public void addShotgun(Shotguns shotgun){
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
    public void calculaShotguns(){
        for (var shotgun: shotguns){
            valorShotguns += shotgun.getPreco();
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
    public void caixaFinal(){
        if(rifles.size() !=0 ){
            float total = rifles.get(0).getPreco()*rifles.size();
            System.out.println("O valor total dos rifles é de " + valorRifles);
        }
        if(shotguns.size() != 0){
            float total = shotguns.get(0).getPreco()*shotguns.size();
            System.out.println("O valor total das shotguns é de " + valorShotguns);
        }
        System.out.println("Valor total de tudo é: " + valorCompra);
    }
}
