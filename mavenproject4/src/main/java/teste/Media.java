/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 * Classe para calcular a media de uma aluno e sua situação
 *
 * @author felipe Ferreira
 * @since 07/12/2024 at 16:31
 */
public class Media {

    private String nome;
    private Double n1, n2, n3, n4, soma;

    Media(String nome, Double n1, Double n2, Double n3, Double n4) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
    }

    /**
     * Metodo para calcular a media do aluno recebendo as 4 notas dele bimestral
     *
     * @param n1 - PRIMEIRA NOTA
     * @param n2 - SEGUNDA NOTA
     * @param n3 - TERCEIRA NOTA
     * @param n4 - QUARTA NOTA
     * @return RETORNA A SOMATORIA DA MEDIA
     * @throws ArithmeticException
     */
    public Double calcularMedia(Double n1, Double n2, Double n3, Double n4) throws ArithmeticException {

        try {
            return soma = (n1 + n2 + n3 + n4) / 4;
        } catch (ArithmeticException e) {
            return 0.00;
        }
    }

    /**
     * Metodo para verificar a situação do aluno
     *
     * @return A condiçao, se foi aprovado ou nao
     * @throws ArithmeticException
     */
    public String situacao() {

        try {
            if (soma >= 60.00) {
                return "Parabens, " + this.nome + ", voce foi aprovado! ";

            } else {
                return ("Voce," + this.nome + ", foi reprovado! ");
            }
        } catch (ArithmeticException e) {

        }
        return "Esse foi o resultado desse ano! ";

    }

}