class Carro extends Veiculo {
    private int km;

    public Carro(String marca, String modelo, int ano, double preco, int km) {
        super(marca, modelo, ano, preco);
        this.km = km;
    }

    public int getKm() {
        return km;
    }

    public String getInfo() {
        return super.getInfo() + "\nQuilometragem: " + km;
    }
}