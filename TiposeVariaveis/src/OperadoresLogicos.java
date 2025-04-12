

public class OperadoresLogicos {
public static void main(String[] args) {
//operadores logicos em Java
    // o operador de igual '=' serve para associar/atribuir valores e se usado '==' serve para comparar valores

   /*  String nome = "Jose";
    int idade=20;
    double peso= 70.3;
    char sexo = 'm';
    boolean doadorOrgao = false;*/
    //Nascimento dataNascimento = new Nascimento();
//operadores aritiméticos são; +(adição),_9subtração,*(multiplicação),/(Divisão)
    /*double soma = 10.5 + 15.7;
    int subtração= 113 - 15;
    int divisao = 15 / 3;
    int modulo =18 % 3;
    double resultado = (10*7)+(20/4);*/

//o operdor de adição também é ultilizado para concatenação de variaveis de tipo texto como Strings
   /*  String contatenacao="?";
    contatenacao = 1+1+1+"1";
    System.out.println(contatenacao);
    contatenacao = 1+"1"+1+1;
    System.out.println(contatenacao);
    contatenacao = 1+"1"+1+"1";
    System.out.println(contatenacao);
    contatenacao = "1"+(1+1+1);
    System.out.println(contatenacao);*/
    //apartir do momento que a linguagem detecta um caracter no meio de um numero ele comça a concatenar,mas se colocado entre-parenteses ele entende q o valor ta em evidencia,que nem a regra que é ensinado na escola de resolver as parenteses primeiro

//Operadores Unários

    //(+)torna valores positivo(numeros sõa positivos por padrão,mesmo sem ele)
   
    //(-)torna valores negativos,nega um numero ou expressão aritmética
    //int numero = 10;//exemplo
    //numero = -numero;
    //System.out.println(numero);//-10
    //para fazer o valor voltar a ser positivo faze-se=x*-1
    //numero =numero *-1;
    //System.out.println(numero);
    //(++)incrementa um valor em uma unidade
    //int numero2=20;
    //numero2++;idem numero=numero+1
    //funciona da mesma forma para decrementar usando '--'
    //System.out.println(++numero2);//21
    //System.out.println(numero2);//21
    //(--)Decrementa uma valor em uma unidade
    //(!)operador de negação,nega valores em expressões logicas como booleana
    /*boolean variavel = true;
    variavel = !variavel;
    System.out.println(variavel);*/
//Operador ternário
    //ele é representado pelos simbolos ':'  e '?'
    //ultilizado na seguinte estrutura de sintaxe:
    //<Expressão condicional> '?' =<Caso condição seja true>':'=<Caso condição seja false>

        /*int a, b;
        a = 5;
        b = 6;
        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);*/

//Operadores relacionais
//sempre é feito da esquerda para a direita
    //(==)verifica se uma varuavel é igual à outra
    //(!=)verirfica se uma variavel é diferente da outra
    //(>)verifica se uma variavel é maior do que a outra
    //(>=)verifica se uma variavel é maior ou igual a outra
    //(<)verifica se uma variavel é menor do que a outra
    //(<=)erifica se uma variavel é menor ou igual a outra
    /*String nomeum="jose";
    String nomedois= new String("jose");
    System.out.println(nomeum.equals(nomedois));
    
    
    //== compara conteudo de variaveis como numeros
    //equals é usado para comparar objetos





    int numer1 =1;
    int numer2 =2;

    boolean simNao=numer1==numer2;
    if (numer1<numer2){
        System.out.println("a nossa condição é valida");
    }
    System.out.println("igual a "+simNao);

    simNao=numer1!=numer2;

    System.out.println("diferente de "+simNao);

    simNao=numer1>numer2;

    System.out.println("maior que "+simNao);

    simNao=numer1>=numer2;

    System.out.println("maior ou igual "+simNao);

    simNao=numer1<numer2;

    System.out.println("menor "+simNao);

    simNao=numer1<=numer2;

    System.out.println("menor ou igual "+simNao);
*/

//Operadores Lógicos
//"&&" = "e/and"
//"||" = "ou/or"

    /*boolean condicao1=true;
    
    boolean condicao2=true;

    if(condicao1||condicao2){
        System.out.println("uma das condições é verdadeira");//"||" seria o "ou/or" da tabela verdade
        }
        if(condicao1&& (7>4)){
            System.out.println("as duas condições são verdadeiras");//"&&" seria o "e/and" da tabela verdade
            }
        System.out.println("fim");*/

        
    }
}
