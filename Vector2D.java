/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectors;

/**
 *
 * @author mshir
 */
public class Vector2D {
    float x;
    float y;
    Vector2D(float x, float y){
        this.x = x;
        this.y = y;
        System.out.println("(" + this.x + "," + this.y + ")");
    }
    private static Vector2D add(Vector2D a, Vector2D b){
        float xComp = a.x + b.x;
        float yComp = a.y + b.y;
        Vector2D c = new Vector2D(xComp,yComp);
        return c;
    }
    private static float dotProduct(Vector2D a, Vector2D b){
        float xComp = a.x * b.x;
        float yComp = a.y * b.y;
        float prod = xComp + yComp;
        return prod;
    }
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Vector2D v = new Vector2D(3,10);
        Vector2D w = new Vector2D(2,4);
        add(v,w);
        System.out.println(dotProduct(v,w));
        
            
        }
    
    
}
