package es3;

public class ContoOnline extends ContoCorrente {

    private double maxPrelievo;

    public ContoOnline(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public String stampaSaldo() {
        return "Titolare: " + super.titolare + " - Saldo: " + super.restituisciSaldo() +
                " - Num movimenti: " + super.nMovimenti + " - Massimo movimenti: " + super.maxMovimenti +
                " - Massimo prelievo possibile: " + maxPrelievo;
    }

    @Override
    public void preleva(double x) throws BancaException {
        if (x > maxPrelievo) {
            throw new BancaException("il prelievo non è disponibile");
        }
        super.preleva(x);
    }

}

