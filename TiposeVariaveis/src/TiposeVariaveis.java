public class TiposeVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 =(short) numeroNormal ;//uso de cast na pratica,

        int numero = 5;
        numero =10;
        System.out.println(numero);
//'final' junto com a convenção de nome(em caixa alta) faz com que o valor atribuido  à variavel não possa ser alterado
        final double VALOR_DE_PI =3.14;
 
        byte b =-128 ;//ate 127 positivo
        short s =-32768; //ate 32767
        int i =-2147483648;//ate 2147483647
        long l=-9223372036854770000l;// ate 9223372036854770000l (precisa-se colocar o 'l'no final)
        double pi =3.14;//trabalha mais precisamente com decimais extensos
        float centavos =5.50f;//trabalha com decimal  
        char a = 'a';// armazena caracteres,e vai até 65535 char é indicado por aspas simples ->''
        boolean  c = false; //retorna se o valor é true(verdadeiro) ou false (falso) 



}
}