class ThreeDim extends Figure implements Printing {
    private Figure base; // Referencja do podstawy graniastosłupa
    private double height;

    public ThreeDim(Figure base, double height) throws IllegalArgumentException {
        if (height <= 0) {
            throw new IllegalArgumentException("Invalid height for the solid");
        }
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        double baseArea = base.calculateArea();
        double lateralArea = base.calculatePerimeter() * height; // Pole boczne
        return baseArea + 2 * lateralArea; // Pole powierzchni graniastosłupa
    }

    @Override
    double calculatePerimeter() {
        throw new UnsupportedOperationException("not supported");
    }

    @Override
    public void print() {
        System.out.println("Three-dimensional solid:");
        //base.print(); // Wyświetlenie informacji o podstawie
        System.out.println("Height: " + height);
        System.out.println("Surface Area: " + calculateArea());
        System.out.println("Volume: " + calculateVolume());
    }

    // Obliczanie objętości graniastosłupa
    public double calculateVolume() {
        return base.calculateArea() * height;
    }
}
