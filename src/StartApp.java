
private int x = 0;
private int y = 0;
private int z = 0;

static class Positions {
    private final static long xPos = 40;
    private final static long yPos = 40;
    private final static long zPos = 40;

    public long x() {
        return xPos / 2;
    }

    public long y() {
        return yPos / 2;
    }

    public long z() {
        return zPos / 2;
    }
}

void main() {

    Positions posPos = new Positions();


    x += (((5 * 2) + (int)posPos.x() / 2) + 5) * (int)posPos.x() / 2;
    y += (((5 * 2) + (int)posPos.y() / 2) + 5) * (int)posPos.y() / 2;
    z += (((5 * 2) + (int)posPos.z() / 2) + 5) * (int)posPos.z() / 2;

    int randomX = randomNumbers((float) x);
    int randomY = randomNumbers((float) y);
    int randomZ = randomNumbers((float) z);
    ElementsColor el = new ElementsColor();

    Scanner scan = scanMe();
    System.out.print("Enter Option [Hex | Dec]: ");
    var option = scan.nextLine();
    if (option.equals("Dec")) {
        el.getColorX((float) randomX);
        el.getColorY((float) randomY);
        el.getColorZ((float) randomZ);
    }

    if (option.equals("Hex")) {
        System.out.printf("#%s%s%s",
                Integer.toString(randomX, 16),
                Integer.toString(randomY, 16),
                Integer.toString(randomZ, 16)
        );
    }

    else if (option.equals("Other")) {
        el.getColorX((float) randomX);
        el.getColorY((float) randomY);
        el.getColorZ((float) randomZ);

        System.out.printf("#%s%s%s",
                Integer.toString(randomX, 16),
                Integer.toString(randomY, 16),
                Integer.toString(randomZ, 16)
        );
    }
}

Scanner scanMe() {
    return new Scanner(System.in);
}

interface RandomElementsColor { }

static class ElementsColor implements RandomElementsColor {

    void getColorX(float x) {
        System.out.printf("R: %d\n", (int) x);
    }

    void getColorY(float x) {
        System.out.printf("G: %d\n", (int) x);
    }

    void getColorZ(float x) {
        System.out.printf("B: %d\n", (int) x);
    }
}

int randomNumbers(float x) {

    Random r = new Random();
    return r.nextInt((int) x);
}