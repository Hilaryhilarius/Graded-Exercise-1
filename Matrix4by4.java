package matrices4by4;

/**
 *
 * @author mshir
 */
public class Matrix4by4 {
    public static void main(String[] args){
        Matrix4by4 woof = new Matrix4by4(0,1,0,4,0,1,2,0,5,0,0,3,4,0,2,0);
        Matrix4by4 arf = new Matrix4by4(0,1,0,3,1,1,2,0,5,0,0,3,4,0,2,0);
        multbymat(woof,arf);
    }
    float a0;float a1;float a2;float a3;
    float b0;float b1;float b2;float b3;
    float c0;float c1;float c2;float c3;
    float d0;float d1;float d2;float d3;
    Matrix4by4(float a0,float a1,float a2,float a3, 
            float b0, float b1, float b2, float b3, 
            float c0, float c1, float c2, float c3,
            float d0, float d1, float d2, float d3){
        this.a0 = a0;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.b0 = b0;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.c0 = c0;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.d0 = d0;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        float[][] matrix = {{a0,a1,a2,a3},{b0,b1,b2,b3},{c0,c1,c2,c3},{d0,d1,d2,d3}};
        System.out.print("⌈" + matrix[0][0] + " ");
        System.out.print(matrix[1][0] + " ");
        System.out.print(matrix[2][0] + " ");
        System.out.println(matrix[3][0] + "⌉");
        
        System.out.print("|" + matrix[0][1] + " ");
        System.out.print(matrix[1][1] + " ");
        System.out.print(matrix[2][1] + " ");
        System.out.println(matrix[3][1] + "|");
        
        System.out.print("|" + matrix[0][2] + " ");
        System.out.print(matrix[1][2] + " ");
        System.out.print(matrix[2][2] + " ");
        System.out.println(matrix[3][2] + "|");
        
        System.out.print("⌊" + matrix[0][3] + " ");
        System.out.print(matrix[1][3] + " ");
        System.out.print(matrix[2][3] + " ");
        System.out.println(matrix[3][3] + "⌋");
    }
    public static Matrix4by4 multbyint(Matrix4by4 p, float q){
        float a0 = p.a0 * q;
        float a1 = p.a1 * q;
        float a2 = p.a2 * q;
        float a3 = p.a3 * q;
        
        float b0 = p.b0 * q;
        float b1 = p.b1 * q;
        float b2 = p.b2 * q;
        float b3 = p.b3 * q;
        
        float c0 = p.c0 * q;
        float c1 = p.c1 * q;
        float c2 = p.c2 * q;
        float c3 = p.c3 * q;
        
        float d0 = p.d0 * q;
        float d1 = p.d1 * q;
        float d2 = p.d2 * q;
        float d3 = p.d3 * q;
        
        Matrix4by4 r = new Matrix4by4(a0,a1,a2,a3,b0,b1,b2,b3,c0,c1,c2,c3,d0,d1,d2,d3);
        return r;
    }
    public static Matrix4by4 multbymat(Matrix4by4 p, Matrix4by4 q){
        float a0 = p.a0 * q.a0 + p.b0 * q.a1 + p.c0 *q.a2 + p.d0 * q.a3;
        float a1 = p.a1 * q.a0 + p.b1 * q.a1 + p.c1 *q.a2 + p.d1 * q.a3;
        float a2 = p.a2 * q.a0 + p.b2 * q.a1 + p.c2 *q.a2 + p.d2 * q.a3;
        float a3 = p.a3 * q.a0 + p.b3 * q.a1 + p.c3 *q.a2 + p.d3 * q.a3;
        
        float b0 = p.a0 * q.b0 + p.b0 * q.b1 + p.c0 *q.b2 + p.d0 * q.b3;
        float b1 = p.a1 * q.b0 + p.b1 * q.b1 + p.c1 *q.b2 + p.d1 * q.b3;
        float b2 = p.a2 * q.b0 + p.b2 * q.b1 + p.c2 *q.b2 + p.d2 * q.b3;
        float b3 = p.a3 * q.b0 + p.b3 * q.b1 + p.c3 *q.b2 + p.d3 * q.b3;
        
        float c0 = p.a0 * q.c0 + p.b0 * q.c1 + p.c0 *q.c2 + p.d0 * q.c3;
        float c1 = p.a1 * q.c0 + p.b1 * q.c1 + p.c1 *q.c2 + p.d1 * q.c3;
        float c2 = p.a2 * q.c0 + p.b2 * q.c1 + p.c2 *q.c2 + p.d2 * q.c3;
        float c3 = p.a3 * q.c0 + p.b3 * q.c1 + p.c3 *q.c2 + p.d3 * q.c3;
        
        float d0 = p.a0 * q.d0 + p.b0 * q.d1 + p.c0 *q.d2 + p.d0 * q.d3;
        float d1 = p.a1 * q.d0 + p.b1 * q.d1 + p.c1 *q.d2 + p.d1 * q.d3;
        float d2 = p.a2 * q.d0 + p.b2 * q.d1 + p.c2 *q.d2 + p.d2 * q.d3;
        float d3 = p.a3 * q.d0 + p.b3 * q.d1 + p.c3 *q.d2 + p.d3 * q.d3;
        Matrix4by4 w = new Matrix4by4(a0,a1,a2,a3,b0,b1,b2,b3,c0,c1,c2,c3,d0,d1,d2,d3);
        return w;
    }
}
