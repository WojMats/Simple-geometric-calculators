class Diamond extends Figure implements Printing {
    private double diagonal1, diagonal2;

    public Diamond(double diagonal1, double diagonal2) throws IllegalArgumentException {
        if (diagonal1 <= 0 || diagonal2 <= 0) {
            throw new IllegalArgumentException("Invalid diamond diagonals");
        }
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double calculateArea() {
        return (diagonal1 * diagonal2) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (Math.sqrt(Math.pow(diagonal1 / 2, 2) + Math.pow(diagonal2 / 2, 2)));
    }

    @Override
    public void print() {
        System.out.println("Diamond:");
        System.out.println("Diagonal 1: " + diagonal1);
        System.out.println("Diagonal 2: " + diagonal2);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
