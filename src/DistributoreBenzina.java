public class DistributoreBenzina {
    private double deposito;
    private double euroPerLitro;

    public DistributoreBenzina(double unPrezzoPerLitro) {
        deposito = 0;
        euroPerLitro = unPrezzoPerLitro;
    }

    public void rifornisci(double unaQuantita) {
        deposito += unaQuantita;
    }

    public void vendiAuto(double euro, Automobile unAutomobile) {
        double litriVenduti = euro / euroPerLitro;
        if (litriVenduti <= deposito) {
            deposito -= litriVenduti;
            unAutomobile.rifornisci(litriVenduti);
        } else {
            System.out.println("Non c'è abbastanza benzina nel deposito.");
        }
    }

    public void vendiMoto(double euro, Motocicletta unaMotocicletta) {
        double litriVenduti = euro / euroPerLitro;
        if (litriVenduti <= deposito) {
            deposito -= litriVenduti;
            unaMotocicletta.rifornisci(litriVenduti);
        } else {
            System.out.println("Non c'è abbastanza benzina nel deposito.");
        }
    }

    public void aggiorna(double unPrezzoPerLitro) {
        euroPerLitro = unPrezzoPerLitro;
    }


    public double getDeposito() {
        return deposito;
    }

    public double getEuroPerLitro() {
        return euroPerLitro;
    }

}