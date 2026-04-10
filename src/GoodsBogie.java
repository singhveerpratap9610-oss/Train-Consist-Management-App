class GoodsBogie {

    String type;   // Cylindrical, Rectangular
    String cargo;  // Petroleum, Coal, etc.

    public GoodsBogie(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) {

        try {
            // Rule: Rectangular cannot carry Petroleum
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo! Rectangular bogie cannot carry Petroleum");
            }

            this.cargo = cargo;
            System.out.println("Cargo assigned successfully: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed for " + type + " bogie\n");
        }
    }

    @Override
    public String toString() {
        return type + " Bogie carrying " + (cargo != null ? cargo : "No Cargo");
    }
}