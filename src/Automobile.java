public class Automobile {
    private double serbatoio;
    private double capacitaSerbatoio;

    public Automobile(double unaCapacitaSerbatoio) {
        serbatoio = 0;
        capacitaSerbatoio = unaCapacitaSerbatoio;
    }

    public void rifornisci(double unaQuantita) {
        if (serbatoio + unaQuantita <= capacitaSerbatoio) {
            serbatoio += unaQuantita;
        } else {
            System.out.println("Il serbatoio è pieno.");
        }
    }

    public double getSerbatoio() {
        return serbatoio;
    }
}