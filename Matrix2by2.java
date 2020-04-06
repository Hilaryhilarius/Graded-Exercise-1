package matrices;
/**
 *
 * @author Megumi Shirasaki
 */
public class Matrix2by2 {
    float a0;
    float a1;
    float b0;
    float b1;
    Matrix2by2(float a0,float a1, float b0, float b1){
        this.a0 = a0;
        this.a1 = a1;
        this.b0 = b0;
        this.b1 = b1;
        float[][] matrix = {{a0,a1},{b0,b1}};
        System.out.print("⌈" + matrix[0][0] + ", ");
        System.out.println(matrix[1][0] + "⌉");        
        System.out.print("⌊" + matrix[0][1] + ", ");
        System.out.println(""+ matrix[1][1] + "⌋");
    }

    /**
     *
     * @param mat1
     * @param mat2
     * @return
     */
    private static Matrix2by2 add(Matrix2by2 mat1, Matrix2by2 mat2){
        float a0 = mat1.a0 + mat2.a0;
        float a1 = mat1.a1 + mat2.a1;
        float b0 = mat1.b0 + mat2.b0;
        float b1 = mat1.b1 + mat2.b1;
        Matrix2by2 mat3 = new Matrix2by2(a0,a1,b0,b1);
        return mat3;
    }
    
        
    
    public static void main(String[] args){
        Matrix2by2 ff = new Matrix2by2(12,13,14,15);
        Matrix2by2 gg = new Matrix2by2(11,10,9,8);
        add(ff,gg);
    }
}
