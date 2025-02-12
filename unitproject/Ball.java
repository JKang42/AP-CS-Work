import processing.core.PApplet;

public class Ball {
    PApplet p;
    int x, y, w, h, speedX, speedY;

    Ball(PApplet p, int x, int y, int w, int h, int speedX, int speedY) {
        this.p = p;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public void update() {
        x += speedX;
        y += speedY;
    }

    public void display() {
        p.fill(255, 0, 0);
        p.ellipse(x, y, w, h);
    }

    public void checkWallCollision() {
        if (y > p.height - h / 2 || y < h / 2) {
            speedY = -speedY;
        }
    }

    public void checkPaddleCollision(Paddle leftPaddle, Paddle rightPaddle, PingPong game) {
        if (x - w / 2 < leftPaddle.x + leftPaddle.width / 2 && 
            y > leftPaddle.y - leftPaddle.height / 2 && 
            y < leftPaddle.y + leftPaddle.height / 2) {
            
            if (speedX < 0) {
                speedX = -speedX;
            }
        } 
        else if (x + w / 2 > rightPaddle.x - rightPaddle.width / 2 && 
                 y > rightPaddle.y - rightPaddle.height / 2 && 
                 y < rightPaddle.y + rightPaddle.height / 2) {
            
            if (speedX > 0) {
                speedX = -speedX;
            }
        }

        if (x > p.width - w / 2) {
            game.scoreL++;
            reset();
        } else if (x < w / 2) {
            game.scoreR++;
            reset();
        }
    }

    public void stop() {
        speedX = 0;
        speedY = 0;
    }

    public void reset() {
        x = p.width / 2;
        y = p.height / 2;
        speedX = (speedX > 0) ? -3 : 3;
        speedY = (speedY > 0) ? -2 : 2;
    }
}
