public class Main {
    public static void main(String[] args) {
        DistributoreBenzina distributore = new DistributoreBenzina(1.5);
        Automobile auto = new Automobile(50);
        Motocicletta moto = new Motocicletta(10);

        distributore.rifornisci(100);
        System.out.println("Deposito del distributore: " + distributore.getDeposito());

        distributore.vendiAuto(10, auto);
        System.out.println("Deposito del distributore: " + distributore.getDeposito());
        System.out.println("Serbatoio dell'auto: " + auto.getSerbatoio());

        distributore.aggiorna(1.6);
        System.out.println("Prezzo della benzina: " + distributore.getEuroPerLitro());

        distributore.vendiMoto(20, moto);
        System.out.println("Deposito del distributore: " + distributore.getDeposito());
        System.out.println("Serbatoio della moto: " + moto.getSerbatoio());
    }
}