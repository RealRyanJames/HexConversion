private int x = 0;
private int y = 0;
private int z = 0;

void main() {


    x += (((5 * 2) + 10) + 5) * 10;
    y += (((5 * 2) + 10) + 5) * 10;
    z += (((5 * 2) + 10) + 5) * 10;

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