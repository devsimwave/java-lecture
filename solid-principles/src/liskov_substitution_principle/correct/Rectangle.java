package liskov_substitution_principle.correct;

public class Rectangle implements Shape {
    private int height;
    private int width;

    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getArea() {
        return width * height;
    }
}
