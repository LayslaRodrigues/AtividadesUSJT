//1. Escreva um programa que obtém o salário de uma pessoa e diz se ela está ganhando pelo menos o salário mínimo.//

import java.util.Scanner;
public class exercicio1 {
public static void main(String[] args) {
int salário =
System.out.printIn(“Insira seu salário: ”);

if (salário < R$1.200) {
System.out.printIn(“Abaixo do salário mínimo”);
}

else

if (salário > R$1.200) {
System.out.printIn(“Se trata de um salário

mínimo”);
}
}

//2. Escreva um programa que obtém a idade de uma pessoa e diz se ela é maior, segundo a legislação brasileira. Escreva uma versão com if/else e outra com o operador ternário.

import javax.swing.JOptionPane;
public class exercicio2 {
public static void main(String[] args) {
int idade =
Integer.parseInt(JOptionPane.showInpuDialog(“Qual sua idade?”));
String Maioridade;
if(idade >= 18 ? “Maioridade Plena” : “Não há Maioridade
Plena”;
JOptionPane.showMessageDialog(null, Maioridade);
}
}

import javax.swing.JOptionPane;
public class exercicio2.parte2 {
public static void main(String[] args) {
int idade =
Integer.parseInt(JOptionPane.showInpuDialog(“Qual sua idade?”));
if (idade >= 18) {
JOptionPane.showMessageDialog(null,”Maioridade Plena”);
}
else {
JOptionPane.showMessageDialog(null,”Não há Maioridade Plena”);
}
}
}
