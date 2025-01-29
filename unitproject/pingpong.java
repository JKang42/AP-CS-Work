import processing.core.*;  

//need to stop paddle from going out of bounds
//paddle needs to stop ball from passing through it 
//show score 
//class for the paddle & for the ball 

public class pingpong extends PApplet {
    
    // Ball and Paddle Variables
    int x, y, w, z, speedX, speedY;
    int paddleXL, paddleYL, paddleW, paddleZ, paddleK;
    int paddleXR, paddleYR;
    boolean upL, downL; 
    boolean upR, downR;
    
    // Colors
    int colorL = color(0, 255, 0);  // Left paddle color
    int colorR = color(255, 255, 0);  // Right paddle color
    
    // Score and Game Settings
    int scoreL = 0;
    int scoreR = 0;
    int winScore = 5;
    
    public void settings() {
        size(1000, 1000);  // Set the canvas size
    }

    public void setup() {
        x = width / 2;
        y = height / 2;
        w = 50; 
        z = 50;   
        speedX = 3; 
        speedY = 2;
        
        textSize(30);
        textAlign(CENTER, CENTER);
        rectMode(CENTER);
        
        // Paddle setup
        paddleXL = 40;
        paddleYL = height / 2;
        
        paddleXR = width - 40;
        paddleYR = height / 2;
        paddleW = 30;
        paddleZ = 100;
        paddleK = 5;
    }

    public void draw() {
        background(0);  // Clear the screen (black background)
        
        drawCircle(); 
        moveCircle();
        bounceOff();
        
        movePaddle();
        drawPaddles();
        

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
