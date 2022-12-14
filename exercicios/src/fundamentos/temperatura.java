package fundamentos;

public class temperatura {
    
    public static void main(String[] args) {
        final int N1 = 32;
        final int N2 = 5;
        final int N3 = 9;
        int f = 90;
        int c = (f - N1) * N2/N3;
        
        System.out.println("Temperatura = " + c + "C°");
    }

}
 