import processing.core.PApplet;

public class Paddle {
    PApplet p;
    int x, y, width, height, speed;
    int paddleColor;
    boolean movingUp, movingDown;

    Paddle(PApplet p, int x, int y, int width, int height, int speed, int paddleColor) {
        this.p = p;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.paddleColor = paddleColor;
    }

    public void update() {
        if (movingUp && y - height / 2 > 0) {
            y -= speed;
        }
        if (movingDown && y + height / 2 < p.height) {
            y += speed;
        }
    }

    public void display() {
        p.fill(paddleColor);
        p.rect(x, y, width, height);
    }

    public void handleKeyPress(char key, int keyCode, boolean pressed) {
        if (x < p.width / 2) { // Left paddle (W & S)
            if (key == 'w' || key == 'W') movingUp = pressed;
            if (key == 's' || key == 'S') movingDown = pressed;
        } else { // Right paddle (Arrow Keys)
            if (keyCode == p.UP) movingUp = pressed;
            if (keyCode == p.DOWN) movingDown = pressed;
        }
    }
}
