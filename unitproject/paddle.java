//
// Ball.java
//


import processing.core.*;


public class paddle
{
    private PApplet p; // reference to main PApplet
    private int x; 
    private int y; 
    private int w;
    private int h;
}
    
    public paddle(PApplet p)
    {
        this.p = p;
        int paddleXL, paddleYL, paddleW, paddleZ, paddleK; 
        int paddleXR, paddleYR; 
        boolean upL, downL; 
        boolean upR, downR; 
        
        int colorL = color (0,255);
        int colorR = color (255,255,0); 
    }
    
    public void setup() 
    {
        x = width / 2;
        y = height / 2;
        w = 50; 
        z = 50;   
        speedX = 3; 
        speedY = 2;
    
        
        // Paddle setup
        paddleXL = 40;
        paddleYL = height / 2;
        
        paddleXR = width - 40;
        paddleYR = height / 2;
        paddleW = 30;
        paddleZ = 100;
        paddleK = 5;
    }

    public void draw() 
    {
        background(0);  // Clear the screen (black background)
        
        drawCircle(); 
        moveCircle();
        bounceOff();
        
        movePaddle();
        drawPaddles();
        

    }

    // Draw paddles
    void drawPaddles() 
    {
        fill(colorL);
        rect(paddleXL, paddleYL, paddleW, paddleZ);  // Left paddle
        fill(colorR);
        rect(paddleXR, paddleYR, paddleW, paddleZ);  // Right paddle
    }

    // Move paddles based on key input
    void movePaddle() 
    { 
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
    
}


    