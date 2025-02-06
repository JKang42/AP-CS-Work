import processing.core.PApplet;

public class Paddle {

    // Colors
    int colorL = color(0, 255, 0);  // Left paddle color
    int colorR = color(255, 255, 0);  // Right paddle color
    
    int x, y, width, height, speed;
    int color;
    boolean up, down;

    public Paddle(int x, int y, int width, int height, int speed, int color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.color = color;
    }

    public void move() {
        if (up) {
            y += speed;
        }
        if (down) {
            y -= speed;
        }
    }

    public void draw() {
        fill(color);
        rect(x, y, width, height);
    }

    public void restrict() {
        if (y - height / 2 < 0) {
            y = height / 2;
        }
        if (y + height / 2 > height) {
            y = height - height / 2;
        }
    }

    public void setUp(boolean state) {
        up = state;
    }

    public void setDown(boolean state) {
        down = state;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getColor() {
        return color;
    }
}
