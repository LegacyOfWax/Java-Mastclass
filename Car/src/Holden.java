class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi --> Start Engine";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi --> Accelerate";
    }

    @Override
    public String brake() {
        return "Mitsubishi --> Break";
    }
}


