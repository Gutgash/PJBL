public class Main {
    public static void main(String[] args){
        Rifles rifle = new Rifles("Vandal", "Chronovoid", "Azul", "Vermelho", "Verde", "Rosa", 60f);
        Rifles rifle1 = new Rifles("Vandal", "Sublime", "Azul", "Vermelho", "Verde", "Rosa", 40f);
        Rifles rifle2 = new Rifles("Phantom", "Sublime", "Azul", "Vermelho", "Verde", "Rosa", 30f);
        Rifles rifle3 = new Rifles("Phantom", "Onim", "Azul", "Vermelho", "Verde", "Rosa", 80f);
        Shotguns shotgun = new Shotguns("Bucky", "Sublime", "Azul", "Vermelho", "Verde", "Rosa", 80f);
        Shotguns shotgun1 = new Shotguns("Bucky", "Chronovoid", "Azul", "Vermelho", "Verde", "Rosa", 80f);
        Shotguns shotgun2 = new Shotguns("Judge", "Grafite", "Azul", "Vermelho", "Verde", "Rosa", 80f);
        Shotguns shotgun3 = new Shotguns("Judge", "Valorant Masters", "Azul", "Vermelho", "Verde", "Rosa", 80f);
        Marketplace marketplace = new Marketplace();
        marketplace.addRifle(rifle);
        marketplace.addRifle(rifle1);
        marketplace.addRifle(rifle2);
        marketplace.addRifle(rifle3);
        marketplace.addShotgun(shotgun);
        marketplace.addShotgun(shotgun1);
        marketplace.addShotgun(shotgun2);
        marketplace.addShotgun(shotgun3);
        marketplace.calculaRifles();
        marketplace.calculaValorCompra();
        marketplace.caixaFinal();
}
}
