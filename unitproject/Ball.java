import processing.core.PApplet;

public class Ball {

    int x, y, w, z, speedX, speedY;

    public Ball(int x, int y, int w, int z, int speedX, int speedY) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.z = z;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public void update() {
        x += speedX;
        y += speedY;
    }

    public void draw() {
        fill(255, 0, 0);
        ellipse(x, y, w, z);
    }

    public void bounceOffWalls() {
        if (x > width - w / 2) {
            resetPosition();
            PingPong.scoreL++;
        } else if (x < 0 + w / 2) {
            resetPosition();
            PingPong.scoreR++;
        }
        if (y > height - z / 2 || y < 0 + z / 2) {
            speedY = -speedY;
        }
    }

    public void checkPaddleCollision(Paddle paddle) {
        if (x - w / 2 < paddle.getX() + paddle.getWidth() / 2 && x + w / 2 > paddle.getX() - paddle.getWidth() / 2 &&
            y - z / 2 < paddle.getY() + paddle.getHeight() / 2 && y + z / 2 > paddle.getY() - paddle.getHeight() / 2) {
            speedX = -speedX;
        }
    }

    public void setSpeed(int speedX, int speedY) {
        this.speedX = speedX;
        this.speedY = speedY;
    }

    private void resetPosition() {
        x = width / 2;
        y = height / 2;
        speedX = -speedX;
    }
}
