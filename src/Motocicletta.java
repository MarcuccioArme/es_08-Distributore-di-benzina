public class Motocicletta {
    private double serbatoio;
    private double capacitaSerbatoio;

    public Motocicletta(double unaCapacitaSerbatoio) {
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