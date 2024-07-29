package es3;

public class ContoCorrente {

    final int maxMovimenti = 50;
    protected String movimenti;
    int nMovimenti;
    double saldo;
    String titolare;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        this.nMovimenti = 0;
    }

    public void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti) {
            // verifico se il saldo è negativo dopo il prelievo
            if (saldo - x < 0) {
                throw new BancaException("il conto è in rosso");
            }
            saldo -= x;
        } else {

            saldo -= x + 0.50;
        }
        nMovimenti++;
    }


    public double restituisciSaldo() {
        return saldo;
    }
}