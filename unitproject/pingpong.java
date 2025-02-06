

    public void draw() {
        background(0);

        ball.update();
        ball.draw();
        ball.bounceOffWalls();
        ball.checkPaddleCollision(leftPaddle);
        ball.checkPaddleCollision(rightPaddle);

        leftPaddle.move();
        leftPaddle.draw();
        rightPaddle.move();
        rightPaddle.draw();

        leftPaddle.restrict();
        rightPaddle.restrict();

        displayScores();
        checkGameOver();
    }

    public void displayScores() {
        fill(255);
        text(scoreL, 100, 50);
        text(scoreR, width - 100, 50);
    }

    public void checkGameOver() {
        if (scoreL == winScore) {
            gameOver("Green wins!", leftPaddle.getColor());
        }
        if (scoreR == winScore) {
            gameOver("Yellow wins!", rightPaddle.getColor());
        }
    }

    public void gameOver(String text, int c) {
        ball.setSpeed(0, 0);
        fill(255);
        text("Game over", width / 2, height / 3 - 40);
        text("Click to play again", width / 2, height / 3 + 40);
        fill(c);
        text(text, width / 2, height / 3);

        if (mousePressed) {
            scoreL = 0;
            scoreR = 0;
            ball.setSpeed(3, 2);
        }
    }

    public void keyPressed() {
        if (key == 'w' || key == 'W') {
            leftPaddle.setUp(true);
        }
        if (key == 's' || key == 'S') {
            leftPaddle.setDown(true);
        }
        if (keyCode == DOWN) {
            rightPaddle.setDown(true);
        }
        if (keyCode == UP) {
            rightPaddle.setUp(true);
        }
    }

    public void keyReleased() {
        if (key == 'w' || key == 'W') {
            leftPaddle.setUp(false);
        }
        if (key == 's' || key == 'S') {
            leftPaddle.setDown(false);
        }
        if (keyCode == DOWN) {
            rightPaddle.setDown(false);
        }
        if (keyCode == UP) {
            rightPaddle.setUp(false);
        }
    }

    public static void main(String[] args) {
        PApplet.main("PingPong");
    }
}

import processing.core.*;  

public class pingpong extends PApplet {
    
    //Ball wnd Paddle Variables
    Ball ball
    Paddle leftPaddle, rightPaddle; 
    
    // Colors 
    int colorL = color(0, 255, 0);  // Left paddle color
    int colorR = color(255, 255, 0);  // Right paddle color
    
    // Score and Game Settings
    int scoreL = 0;
    int scoreR = 0;
    int winScore = 5;
    
    public void settings() {
        size(500, 500);  // Set the canvas size
    }
        
    public void setup() 
    {
        ball = new Ball(width / 2, height / 2, 50, 50, 3, 2);
        leftPaddle = new Paddle(40, height / 2, 30, 100, 5, color(0, 255, 0));
        rightPaddle = new Paddle(width - 40, height / 2, 30, 100, 5, color(255, 255, 0));
        textSize(30);
        textAlign(CENTER, CENTER);
        rectMode(CENTER);
        textSize(30);
        textAlign(CENTER, CENTER);
        rectMode(CENTER);
        
    }

    public void draw() {
        background(0);  // Clear the screen (black background)
        
        drawCircle(); 
        moveCircle();
        bounceOff();
        
        movePaddle();
        drawPaddles();
        restrictPaddle();
        contactPaddle();
        
        scores();
        gameOver();
    }

    // Draw paddles
    void drawPaddles() {
        fill(colorL);
        rect(paddleXL, paddleYL, paddleW, paddleZ);  // Left paddle
        fill(colorR);
        rect(paddleXR, paddleYR, paddleW, paddleZ);  // Right paddle
    }

    // Move paddles based on key input
    void movePaddle() { 
        if(upL) { 
            paddleYL = paddleYL + paddleK;
        }
        if(downL) { 
            paddleYL = paddleYL - paddleK;
        }
        if(upR) { 
            paddleYR = paddleYR + paddleK;
        }
        if(downR) { 
            paddleYR = paddleYR - paddleK;
        }
    }

    // Restrict paddles within the window boundaries
    void restrictPaddle() {
        if (paddleYL - paddleZ / 2 < 0) {
            paddleYL = paddleYL + paddleK;
        }
        if (paddleYL + paddleZ / 2 > height) {
            paddleYL = paddleYL - paddleK;
        }
        if (paddleYR - paddleZ / 2 < 0) {
            paddleYR = paddleYR + paddleK;
        }
        if (paddleYR + paddleZ / 2 > height) {
            paddleYR = paddleYR - paddleK;
        }
    }

    // Handle ball and paddle collision
    void contactPaddle() {
        // Left paddle collision
        if (x - w / 2 < paddleXL + paddleW / 2 && y - z / 2 < paddleYL + paddleZ / 2 && y + z / 2 > paddleYL - paddleZ / 2) { 
            if(speedX < 0) {
                speedX = -speedX;
            }
        }
        // Right paddle collision
        else if (x + w / 2 > paddleXR - paddleW / 2 && y - z / 2 < paddleYR + paddleZ / 2 && y + z / 2 > paddleYR - paddleZ / 2) {
            if(speedX > 0){
                speedX = -speedX;
            }
        }
    }

    // Draw the ball (circle)
    void drawCircle() {
        fill(255, 0, 0);
        ellipse(x, y, w, z);
    }

    // Move the ball
    void moveCircle() {
        x = x + speedX;
        y = y + speedY;
    }

    // Check if the ball hits the walls and update score
    void bounceOff() {
        if (x > width - w / 2) {
            setup();
            speedX = -speedX;
            scoreL = scoreL + 1;
        } else if (x < 0 + w / 2) { 
            setup();
            scoreR = scoreR + 1;    
        }
        if (y > height - z / 2) { 
            speedY = -speedY;
        }
        else if (y < 0 + z / 2) { 
            speedY = -speedY;
        }
    }

    // Display the score
    void scores() {
        fill(255);
        text(scoreL, 100, 50);
        text(scoreR, width - 100, 50);
    }

    // Check for game over and display message
    void gameOver() {
        if(scoreL == winScore) {
            gameOverPage("Green wins!", colorL);
        }
        
        if(scoreR == winScore) {
            gameOverPage("Yellow wins!", colorR);
        }
    }

    // Display the game over screen and allow restart
    void gameOverPage(String text, int c) {
        speedX = 0;
        speedY = 0;
        
        fill(255);
        text("Game over", width / 2, height / 3 - 40);
        text("Click to play again", width / 2, height / 3 + 40);
        fill(c);
        text(text, width / 2, height / 3);
        
        if(mousePressed) {
            scoreR = 0;
            scoreL = 0;
            speedX = 2;
            speedY = 3;
        } 
    }

    // Handle key press events for paddles
    public void keyPressed() {
        if(key == 'w' || key == 'W') { 
            downL = true;
        }
        if(key == 's' || key == 'S') { 
            upL = true;
        }
        if(keyCode == DOWN) { 
            upR = true;
        }
        if(keyCode == UP) { 
            downR = true;
        }
    }

    // Handle key release events for paddles
    public void keyReleased() {
        if(key == 'w' || key == 'W') { 
            downL = false;
        }
        if(key == 's' || key == 'S') { 
            upL = false;
        }
        if(keyCode == DOWN) { 
            upR = false;
        }
        if(keyCode == UP) { 
            downR = false;
        }
    }

    // Main method to run the sketch
    public static void main(String[] args) {
        PApplet.main("pingpong");
    }
}

