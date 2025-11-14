#include <iostream>
#include <cstdlib>
using namespace std;

int main (){

    //int *p; // CRIAR UM PONTEIRO SEM ATRIBUIR VALOR, AO ESCREVER ELE NA TELA, ELE VAI MOSTRAR O ENDEREÇO DE MEMORIA
    //p = NULL; // AO FAZER ISSO, ATRIBUINDO UM VALOR NULO, ENTAO AO PRINTAR NA TELA, ELE VAI MOSTRAR UM VALOR 0;

    ///cout << p;

    /*int x = 10;
    int *p;
    p = &x;

    cout << &x << endl;
    cout << *p;*/

    /*int y = 20;
    int *p1, *p2, x = 10;
    p1 = &x;
    p2 = &y;
    p2++;

    if (p1 == p2){
        cout << "Os ponteiros estao na mesma posicao" <<endl;

    } else {
        cout << "Os ponteiros estao em posicao diferentes! " << endl;

    }

    if (p2 > p1){
        cout << "O ponteiro p2 esta a frente de p1! " << endl;

    } else if (p1 > p2) {
        cout << "O Ponteiro p1 esta a frente de p2! " << endl;
    } else {
        cout << "o PONTEIRO ESTAO NA MESMA POSICAO! " << endl;


    }
    cout << p1 << "\n" << p2 << endl;
    cout << *p1 << "\n" << *p2;*/

   /* void *pg;
    int *p, v = 10;

    p = &v;
    pg = &v;

    cout << "Endereco em pg " << pg << endl;
    pg = &p;
    cout << "Endereco em  pg " << pg << endl;
    pg = p;
    cout << "Enderco em pg" << pg << endl;*/


    /*void *pg;
    int v = 10;
    pg = &v;

    //cout << *pg; erro, poi esta tentando escrever o dado que tem no V, precisa fazer um casting
    cout << *(int*)pg;*/

    /*int *i;
    char *c;
    i = (int*) malloc (200); // cria um array i de 50 inteiros (4 bytes cada)
    c = (char*) malloc (200); //cria um array de c de 200 caracter (1 bytes cada)
*/

    int *p = (int*) malloc (5 * sizeof(int));
    if (p == NULL){
        cout << "Erro: Memoria insuficiente!";
        exit(1);
    }

    for (int i = 0; i < 5; i++){
        cout << "Informe o valor de p( " << i << ")";
        cin >> p[i];
    }

    for (int i = 0; i < 5; i++){
        cout << i << endl;
    }
    free(p);
 }