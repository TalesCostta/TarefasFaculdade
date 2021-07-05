#include <stdio.h>
#include <stdlib.h>
#define MAX 10 // tamanho máximo da pilha

// declaração dos ponteiros
int *base, *p_tam, pilha[MAX];

// função que insere elementos na pilha, basta passar o elemento
void inserir(char crt)
{
    // verifica se a piha está cheia
    if(*p_tam == MAX)
    {
        printf("\nNao foi possivel inserir o elemento!");
        printf("\nA pilha esta cheia!\n\n");
        return;
    }
    /*
        O incremento de ponteiro faz o ponteiro apontar para a próxima
        posição de memória do próximo elemento do seu tipo base
    */
    base++;
    *p_tam = *p_tam + 1; // incremento do tamanho, o "*" trabalha com conteúdo
    *base = crt; // guarda o valor no endereço apontado pelo ponteiro base
}

// função que retira elementos da pilha
void retirar()
{
    base--; // decrementa o ponteiro base
    *p_tam = *p_tam - 1; // decrementa o tamanho
}


// função principal
int main(int argc, char *argv[])
{
    int tam = 0;
    char crt;
    int cont1 = 0;
    p_tam = &tam; // aponta para o endereço de tam
    base = pilha; // base aponta para o endereço da base do vetor pilha

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
