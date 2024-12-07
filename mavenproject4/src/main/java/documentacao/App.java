/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documentacao;

import java.util.Scanner;

/**
 *
 * @author felipe
 * @since 07/12/2024 at 16:44
 */

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Informe sua primeira nota: ");
        Double n1 = scan.nextDouble();
        System.out.println("Informe sua segunda nota: ");
        Double n2 = scan.nextDouble();
        System.out.println("Informe sua terceira nota: ");
        Double n3 = scan.nextDouble();
        System.out.println("Informe sua quarta nota: ");
        Double n4 = scan.nextDouble();
        scan.nextLine();
        
        Media me = new Media(nome, n1,n2,n3,n4);
        
        System.out.println("Sua media foi de: " + me.calcularMedia(n1, n2, n3, n4));
        System.out.println(me.situacao());
    }
    
}
