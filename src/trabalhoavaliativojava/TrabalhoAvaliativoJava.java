package trabalhoavaliativojava;
    import java.util.Scanner;
public class TrabalhoAvaliativoJava {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String prgm;
        System.out.println("Programas");
        System.out.print("1 - GEB\n2 - 0 a 900\n3 - Múltiplos ou Não?\n4 - Ordem Crescente ou Descrecente\n"+"5 - Natal de empresa\n6 - Hórario de entrada e Saída\n7 - Média de Sequência\n"+"8 - Lanchonete\n9 - Soma dos N primeiros\nX - Somas dos primos\n");
        System.out.print("Digite o número do programa:");
        prgm = entrada.nextLine();
        char pg = prgm.charAt(0);
        while(pg != 0)
        {
            switch(pg)
            {
                case '0':System.exit(0);
                break;
                case '1':GEB();
                break;
                case '2':NumExtenso();
                break;
                case '3':Multiplos();
                break;
                case '4':OrdemCD();
                break;
                case '5':NatalEmpresa();
                break;
                case '6':HorarioEntradaSaida();
                break;
                case '7':MediaSequencia();
                break;
                case '8':Lanchonete();
                break;
                case '9':SomaNPrimeiros();
                break;
                case 'X':SomaPrimos();
                break;
                default:System.out.print("Erro");
            }
            System.out.print("Digite o número do programa que deseja:");
            prgm = entrada.nextLine();
            pg = prgm.charAt(0);
        }
    }   

    private static void GEB() { 
        Scanner entrada = new Scanner(System.in);
        int i;
        double Alt, PC, GEB;
        String sx;
        System.out.print("Informe seu sexo 'M' ou 'F':");
        sx = entrada.nextLine();
        System.out.print("Informe seu peso em kg:");
        PC = entrada.nextInt();
        System.out.print("Informe sua altura em cm:");
        Alt = entrada.nextDouble();
        System.out.print("Informe sua idade:");
        i = entrada.nextInt();
        if ("M".equals(sx))
        {
            GEB = 66.47 +(13.75 * PC) + (5 * Alt) - (6.76 * i);
            System.out.println(GEB + "kcal/dia.");
        }
        else
            if ("F".equals(sx))
            {
               GEB = 655.1 + (9.56 * PC) + (1.85 * Alt) - (4.67 * i);
               System.out.println(GEB + "kcal/dia.");
            } 
    }

    private static void NumExtenso() {
        Scanner num = new Scanner(System.in);
        int vlr, c,  d, u, j;
        System.out.print("Digite um número de 0 até 999:");
        vlr = num.nextInt();
        c = vlr/100;
        d = vlr % 100/10;
        u = (vlr % 100)%10;
        j = vlr/1;
        if(c==1&&d==0&&u==0)
        {
            System.out.println("cem");
        }
        else 
            if(c==0&&d==0&&u==0)
        {
            System.out.println("zero");
        }
        else
        {
            if(c>=1&&d==0&&u==0)
            {
            switch(c)
            {
            case 1 :System.out.println("Cento ");
            break;
            case 2 : System.out.println("Duzentos ");
            break;
            case 3 : System.out.println("Trezentos ");
            break;
            case 4 : System.out.println("Quatrocentos ");
            break;
            case 5 : System.out.println("Quinhentos ");
            break;
            case 6 : System.out.println("Seiscentos ");
            break;
            case 7 : System.out.println("Setecentos ");
            break;
            case 8 : System.out.println("Oitocentos ");
            break;
            case 9 : System.out.println("Novecentos ");
            break;
            }
            }
            else
                {
                    switch(c)
                    {
                    case 1 : System.out.println("Cento e ");break;
                    case 2 : System.out.println("Duzentos e ");break;
                    case 3 : System.out.println("Trezentos e ");break;
                    case 4 : System.out.println("Quatrocentos e");break;
                    case 5 : System.out.println("Quinhentos e ");break;
                    case 6 : System.out.println("Seiscentos e ");break;
                    case 7 : System.out.println("Setecentos e ");break;
                    case 8 : System.out.println("Oitocentos e ");break;
                    case 9 : System.out.println("Novecentos e ");break;
                    }
                }
        if(d==1)
            {
                switch(u)
                    {
                        case 0 : System.out.println("Dez ");break;
                        case 1 : System.out.println("Onze ");break;
                        case 2 : System.out.println("Doze ");break;
                        case 3 : System.out.println("Treze ");break;
                        case 4 : System.out.println("Quatorze ");break;
                        case 5 : System.out.println("Quinze ");break;
                        case 6 : System.out.println("Dezesseis ");break;
                        case 7 : System.out.println("Dezessete ");break;
                        case 8 : System.out.println("Dezoito ");break;
                        case 9 : System.out.println("Dezenove ");break;
                    }
            }
            else 
            if(d>1)
                {
                    switch (d)
                        {
                            case 2 : System.out.println("Vinte");break;
                            case 3 : System.out.println("Trinta");break;
                            case 4 : System.out.println("Quarenta");break;
                            case 5 : System.out.println("Cinquenta");break;
                            case 6 : System.out.println("Sessenta");break;
                            case 7 : System.out.println("Setenta");break;
                            case 8 : System.out.println("Oitenta");break;
                            case 9 : System.out.println("Noventa");break;
                        }
                        switch (u)
                            {
                                case 1 : System.out.println(" e Um ");break;
                                case 2 : System.out.println(" e Dois ");break;
                                case 3 : System.out.println(" e Tres ");break;
                                case 4 : System.out.println(" e Quatro ");break;
                                case 5 : System.out.println(" e Cinco ");break;
                                case 6 : System.out.println(" e Seis ");break;
                                case 7 : System.out.println(" e Sete ");break;
                                case 8 : System.out.println(" e Oito ");break;
                                case 9 : System.out.println(" e Nove ");break;
                            }
                }
                else
                    {
                        switch (u)
                            {
                                case 1 : System.out.println("Um ");break;
                                case 2 : System.out.println("Dois ");break;
                                case 3 : System.out.println("Tres ");break;
                                case 4 : System.out.println("Quatro ");break;
                                case 5 : System.out.println("Cinco ");break;
                                case 6 : System.out.println("Seis ");break;
                                case 7 : System.out.println("Sete ");break;
                                case 8 : System.out.println("Oito ");break;
                                case 9 : System.out.println("Nove ");break;
                            }
                    }
        }
    }

    private static void Multiplos() {
        Scanner entrada = new Scanner(System.in);
        double a, b;
        System.out.print("Digite um números:");
        a = entrada.nextDouble();
        System.out.print("Digite outro número:");
        b = entrada.nextDouble();
        if (a % b == 0)
        {
            System.out.println("São múltiplos");
        }
        else
            System.out.println("Não são múltiplos");
    }

    private static void OrdemCD() {
        Scanner entrada = new Scanner(System.in);
        int I;
        double a, b, c;
        System.out.println ("Escreva 1 ou 2 para o valor de I: ");
        I = entrada.nextInt();
        System.out.println ("Escreva o valor de a: ");
        a = entrada.nextDouble();
        System.out.println ("Escreva o valor de b: ");
        b = entrada.nextDouble();
        System.out.println ("Escreva o valor de c: ");
        c = entrada.nextDouble();
        
        if(I==1)
        {
            System.out.println (+a +"\n"+b+"\n"+c);
        }
        else
        {
            if(I==2)
            {
                System.out.println (+c +"\n"+b+"\n"+a);
            }
        }
    }

    private static void NatalEmpresa() {
        Scanner entrada = new Scanner(System.in);
        double numE, numF, result, result1;
        System.out.print("Digite o número de horas extras:");
        numE = entrada.nextDouble();
        System.out.print("Digite o número de horas em que o funcionário faltou:");
        numF = entrada.nextDouble();
        result = (numE - (2/3 * numF));
        result1 = numE % 60;
        if(result > 2400)
        {
            System.out.println("Premio de R$500,00"+"  com "+numE+" horas extras"+"  e"+"  com "+numF+" horas-falta");
        }
        else
            if(result >= 1800)
            {
                System.out.println("Premio de R&$400,00"+ "  com "+numE+" horas extras"+"  e"+"  com "+numF+" horas-falta");
            }
        else
            if(result >= 1201)
            {
                System.out.println("Premio de R$300,00"+"  com "+numE+" horas extras"+"  e"+"  com "+numF+" horas-falta");
            }
        else
            if(result >= 600)
            {
                System.out.println("Premio de R$200,00"+"  com "+numE+" horas extras"+"  e"+"  com "+numF+" horas-falta");
            }
        else
            if(result < 600)
            {
                System.out.println("Premino de R$100,00"+"  com "+numE+" horas extras"+"  e"+"  com "+numF+" horas-falta");
            }
    }

    private static void HorarioEntradaSaida() {
        Scanner entrada = new Scanner(System.in);
        double Ht, saida, sdEspecial;
        System.out.print("Digite o horário de entrada 'Oh a 24h':");
        Ht = entrada.nextDouble();
        saida = Ht + 6;
        sdEspecial = saida - 24;
        if(Ht >= 19)
        {
            System.out.println("Horário de saída:"+ sdEspecial + "h");
        }
        else
            if(Ht < 19)
            {
                System.out.println("Horário de saída:"+ saida + "h");
            }
    }

    private static void MediaSequencia() {
        Scanner scann = new Scanner(System.in);
        float i=0;
        float fat=1;
        float a=1;
        while (a>=0)
        {
            System.out.print("Digite um número:");
            a = scann.nextInt();
            fat+=a;
            i++;
        }
        System.out.println(fat/(i-1));     
    }

    private static void Lanchonete() {
        Scanner entrada = new Scanner(System.in);
        String cd;
        int quant;
        double pc;
        System.out.println("(C) Cachorro Quente           R$2");
        System.out.println("(R) Refrigerante              R$2,5");
        System.out.println("(S) Sobremesa                 R$1,5");
        System.out.print("Digite o Codigo do Alimento: ");
        cd = entrada.nextLine();
        System.out.print("Qual é a quantidade que voçê que você deseja? ");
        quant = entrada.nextInt();
        int i = 1;
        double pcn = 0;
        while(i!=0){
            if(null == cd)
            {
                System.out.println("Só aceita os codigos (C, R e S em Maisculo )");
            }

            else
                switch (cd) {
                case "C":
                    pc = 2*quant;
                    System.out.println(quant+ " Refrigerante é R$"+pc);
                    pcn += pc;
                    break;
                case "R":
                    pc = 2.5*quant;
                    System.out.println(quant+ " Refrigerante é R$"+pc);
                    pcn += pc;
                    break;
                case "S":
                    pc = 1.5*quant;
                    System.out.println(quant+ " Refrigerante é R$"+pc);
                    pcn += pc;
                    break;
                default:
                    System.out.println("Só aceita os codigos (C, R e S em Maisculo )");
                    break;
            }
            System.out.print("Digite X para sair ou qualquer letra para continuar: ");
            String ss = entrada.next();           
            if("X".equals(ss))
            {
                System.out.println("O preço total saira R$"+ pcn);
                i = 0;
            }
            else 
            {
                System.out.print("Digite o Codigo do Alimento: ");
                cd = entrada.next();
                System.out.print("Qual é a quantidade que voçê que você deseja? ");
                quant = entrada.nextInt();    
                i = 1;
            }
            System.out.println();
        }        
    }

    private static void SomaNPrimeiros() {
        Scanner entrada = new Scanner(System.in);
        int i, soma, n;
        System.out.print("Digite o valor de n:");
        n = entrada.nextInt();
        soma = 0;
        i = 1;
        while(i <= n)
        {
            soma = soma + i;
            i = i + 1;
        }
        System.out.println("A soma dos primeiros inteiros é:" +soma);
    }

    private static void SomaPrimos() { 
        Scanner entrada = new Scanner(System.in);
        int i, j, somaPrim = 2, quantDiv = 0, n;
        System.out.print("Digite um número:");
        n = entrada.nextInt();
        for(i=3;i<=n;i+=2)
        {
            quantDiv=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    quantDiv++;
                }
                if(quantDiv>2)
                {
                    break;
                }
            }
            if(quantDiv==2)
            {
                somaPrim+=i;
            }
        }
        System.out.println("A soma dos números primos é:"+somaPrim);
    }
}
