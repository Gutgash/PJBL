public class ShotgunModificada extends Shotguns{
    private float precoUpgrade;
    public ShotgunModificada(String nomeA, String nomeS, String cor1, String cor2, String cor3, String cor4, String preco, float precoUpgrade){
        super(nomeS, cor1, cor2, cor3, cor4, preco, precoUpgrade);
        this.precoUpgrade = precoUpgrade;
    }
    @Override
    public float upgradeRadianita(){
        return precoUpgrade = 15f;
    }
}

