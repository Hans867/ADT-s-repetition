package ADTsAndRepetition.D;

public class Square implements Comparable<Square> {

    private int height;

    private int width;

    public Square(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int perimeter(){
        return (height + width) * 2;
    }

    @Override
    public int compareTo(Square other) {

        int thisPerimeter = this.perimeter();
        int otherPerimeter = other.perimeter();

        if (thisPerimeter > otherPerimeter) {
            return -1;
        } else if (thisPerimeter == otherPerimeter) {
            return 0;
        } else return 1;

    }

    @Override
    public String toString() {
        return "Square{" +
                "height='" + height + '\'' +
                ", width='" + width + '\'' +
                '}';
    }
}
