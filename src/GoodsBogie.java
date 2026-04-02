class GoodsBogie {
    String type;   // Cylindrical, Open, Box
    String cargo;  // Petroleum, Coal, Grain

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " Bogie carrying " + cargo;
    }
}