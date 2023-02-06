package PatternPrograms;

public class StartTrianglePattern {
    public static void main(String[] args) {
        // 1st triangle
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //2nd Triangle
        System.out.println("<-------------------------->");
        for (int i = 0; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("<-------------------------->");
        // 3rd Triangle
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 0; i <= 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
