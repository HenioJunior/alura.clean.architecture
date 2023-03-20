package escola;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if(ddd == null || !ddd.matches("[0-9]{2}")) {
            throw new IllegalArgumentException("DDD inválido");
        }
        this.ddd = ddd;
        if(numero == null || !numero.matches("9\\d|[1-9]\\d{8}")) {
            throw new IllegalArgumentException("Número inválido");
        }
        this.numero = numero;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }
}
