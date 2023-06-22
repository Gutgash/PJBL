public class caixaFinal() {
    public void caixaFinal() {
        try {
            if (rifles.size() == 0) throw new SemArma("Não há rifles na compra");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (rifles.size() != 0) {
            float total = rifles.get(0).getPreco() * rifles.size();
            System.out.println("O valor total dos rifles é de " + valorRifles);
        }
        if (rifles.size() >= 4) {
            float total = rifles.get(0).getPreco() * rifles.size();
            System.out.println("O valor total dos rifles com o mercado noturno é de " + valorRiflesPromo);
        }
        try {
            if (shotguns.size() == 0) throw new SemArma("Não há shotguns na compra");
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (shotguns.size() != 0) {
            float total = shotguns.get(0).getPreco() * shotguns.size();
            System.out.println("O valor total das shotguns é de " + valorShotguns);
        }
        if (shotguns.size() >= 4) {
            float total = shotguns.get(0).getPreco() * shotguns.size();
            System.out.println("O valor total das shotguns com o mercado noturno é de " + valorShotgunsPromo);
        }
    }
}
