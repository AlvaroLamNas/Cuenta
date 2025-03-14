package Principal;

public class Cuenta {
	private String numero;
    private float saldo;

    // Constructor de la clase Cuenta
    public Cuenta(String numCta, float saldoCta) {
        // Número de la cuenta bancaria
        // Saldo de la cuenta bancaria en euros
        this.numero = numCta;
        this.saldo = saldoCta;
    }

    // Método para obtener el número de cuenta
    public String getNumero() {
        return numero;
    }

    // Método para obtener el saldo de la cuenta
    public float getSaldo() {
        return saldo;
    }

    // Método para asignar el número de cuenta
    public void setNumero(String numCta) {
        this.numero = numCta;
    }

    // Método para asignar el saldo de la cuenta
    public void setSaldo(float saldoCta) {
        this.saldo = saldoCta;
    }

    // Método para ingresar dinero en la cuenta
    public void ingresarDinero(float importe) {
        this.saldo += importe;
    }

    // Método para extraer dinero de la cuenta
    public void extraerDinero(float importe) {
    	if ((this.saldo - importe) < 0) {
    		throw new java.lang.ArithmeticException("Saldo negativo");
    	}else {
    		this.saldo -= importe;
    	}
    }

    // Método para mostrar los datos de la cuenta
    public void mostrarCuenta() {
        System.out.println("N° cuenta: " + getNumero());
        System.out.println("Saldo: " + getSaldo() + " €");
    }
    
    //NuevaEdicion
    //hffjhfjh
}
