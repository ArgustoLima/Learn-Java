package fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // Informações do funcionário

        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 2_234_845_223L;

        float salario = 0.01F;
        double vendasAcumuladas = 2_999_799.01;

        boolean estaDeFerias = false;

        char status = 'A';

        System.out.println(anosDeEmpresa * 365);

        System.out.println(numeroDeVoos / 2);

        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }  
}
