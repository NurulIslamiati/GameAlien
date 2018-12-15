package nnn;

import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;

public class Misil extends Lingkaran{
    
    Arah arah = Arah.DEFAULT;//arah gerakan misil

    public Misil(Canvas canvas, float cx, float cy, float radius, float speed, Arah arah, Color color) {
        this.canvas = canvas;
        this.cx = cx;
        this.cy = cy;
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.arah = arah;
    }    

    Misil(Canvas canvas, float cx, float cy, float radiusMisil, float speedMisil, Object DOWN, Color BLACK) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void update(){
        if(arah.equals(Arah.UP)){
            this.moveUp();
        }else if(arah.equals(Arah.DOWN)){
            this.moveDown();
        }
        
    }
    
}
