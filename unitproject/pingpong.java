import processing.core.PApplet;

public class PingPong extends PApplet {
    
    Ball ball;
    Paddle leftPaddle, rightPaddle;
    int winScore = 5;
    int scoreL = 0, scoreR = 0;

    public void settings() {
        size(500, 500);
    }

    public void setup() {
        ball = new Ball(this, width / 2, height / 2, 50, 50, 3, 2);
        leftPaddle = new Paddle(this, 40, height / 2, 30, 100, 5, color(0, 255, 0));
        rightPaddle = new Paddle(this, width - 40, height / 2, 30, 100, 5, color(255, 255, 0));
        
        textSize(30);
        textAlign(CENTER, CENTER);
        rectMode(CENTER);
    }

    public void draw() {
        background(0);
        
        ball.update();
        ball.display();
        ball.checkWallCollision();
        ball.checkPaddleCollision(leftPaddle, rightPaddle, this);

        leftPaddle.update();
        rightPaddle.update();

        leftPaddle.display();
        rightPaddle.display();
        
        drawScores();
        checkGameOver();
    }

    void drawScores() {
        fill(255);
        text(scoreL, 100, 50);
        text(scoreR, width - 100, 50);
    }

    void checkGameOver() {
        if (scoreL == winScore) {
            gameOver("Green wins!", leftPaddle.paddleColor);
        } else if (scoreR == winScore) {
            gameOver("Yellow wins!", rightPaddle.paddleColor);
        }
    }

    void gameOver(String winnerText, int c) {
        ball.stop();
        
        fill(255);
        text("Game over", width / 2, height / 3 - 40);
        text("Click to play again", width / 2, height / 3 + 40);
        fill(c);
        text(winnerText, width / 2, height / 3);
        
        if (mousePressed) {
            scoreL = 0;
            scoreR = 0;
            setup();
        }
    }

    public void keyPressed() {
        leftPaddle.handleKeyPress(key, keyCode, true);
        rightPaddle.handleKeyPress(key, keyCode, true);
    }

    public void keyReleased() {
        leftPaddle.handleKeyPress(key, keyCode, false);
        rightPaddle.handleKeyPress(key, keyCode, false);
    }

    public static void main(String[] args) {
        PApplet.main("PingPong");
    }
}
