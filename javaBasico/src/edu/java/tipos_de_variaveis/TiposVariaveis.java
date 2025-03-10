package edu.java.tipos_de_variaveis;

public class TiposVariaveis {
    public static void main(String[] args) {
        // Declaracao: tipo nomeVariavel atribuicaoDeValorOpcional

        // byte | memoria: 1 byte | valor maximo: 128
        byte anoFabricacao = 10;

        // short | memoria: 2 bytes | valor maximo: 32.768
        short ano = 2025;

        // int | memoria: 4 bytes | valor maximo: 2.147.483.648
        int idade = 20;

        // long | memoria: 8 bytes | valor maximo: 9.223.372.036.854.775.808
        long idadeFabrica = 1980l;

        // float | memoria: 4 bytes | valor maximo: 3,4028E + 38
        float mediaSalario = 2075.99f;

        // double | memoria: 8 bytes | valor maximo: 1.7976E + 308
        double salarioMinimo = 1400.75;

        // String
        String nome = "eduardo";

        // modificando valor das variaveis
        idade = 21;

        // conversao de variaveis
        ano = (short) idade;

        // variavel constante: variavel para não midificar = final
        final double VALOR_DE_PI = 3.14;
    }
}
