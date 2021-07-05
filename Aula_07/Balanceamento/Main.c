#include <stdio.h>
#include <stdlib.h>
#define MAX 10 // tamanho m�ximo da pilha

// declara��o dos ponteiros
int *base, *p_tam, pilha[MAX];

// fun��o que insere elementos na pilha, basta passar o elemento
void inserir(char crt)
{
    // verifica se a piha est� cheia
    if(*p_tam == MAX)
    {
        printf("\nNao foi possivel inserir o elemento!");
        printf("\nA pilha esta cheia!\n\n");
        return;
    }
    /*
        O incremento de ponteiro faz o ponteiro apontar para a pr�xima
        posi��o de mem�ria do pr�ximo elemento do seu tipo base
    */
    base++;
    *p_tam = *p_tam + 1; // incremento do tamanho, o "*" trabalha com conte�do
    *base = crt; // guarda o valor no endere�o apontado pelo ponteiro base
}

// fun��o que retira elementos da pilha
void retirar()
{
    base--; // decrementa o ponteiro base
    *p_tam = *p_tam - 1; // decrementa o tamanho
}


// fun��o principal
int main(int argc, char *argv[])
{
    int tam = 0;
    char crt;
    int cont1 = 0;
    p_tam = &tam; // aponta para o endere�o de tam
    base = pilha; // base aponta para o endere�o da base do vetor pilha

    do{
        printf("\nDigite o parentesis: (- para sair) \n");
        scanf("%s", &crt);
        if(crt == '('){
            inserir(crt);
            cont1+=1;

        }else if(crt == ')'){
            retirar();
            cont1-=1;
        }

    }while(crt != '-');

    if(cont1 == 0){
        printf("Balanceada");
    }else{
        printf("Nao esta balanceada!");
    }
    return 0;
}
