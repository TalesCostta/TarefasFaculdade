#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>

typedef struct cel {
    char conteudo;
    struct cel *prox;
} celula;

typedef struct pilha {
    struct cel *cabeca;
} pilha;

void empilhar(char c, pilha *p) {
    celula *nova = malloc(sizeof(celula));
    nova->conteudo = c;
    nova->prox = p->cabeca;
    p->cabeca = nova;
}

char desempilhar(pilha *p) {
    celula *pt = p->cabeca;
    char c = pt->conteudo;
    p->cabeca = pt->prox;
    free(pt);
    return c;
}

int main() {
    char frase[150];
    pilha p;
    p.cabeca = NULL;
    printf("Informe a frase: ");
    fgets(frase, 150, stdin);
    for (int i = 0; frase[i] != '\0'; i++) {
        empilhar(frase[i], &p);
    }
    printf("\nInvertida: ");
    while (p.cabeca != NULL) {
        putchar(desempilhar(&p));
    }
    putchar('\n');
    return 0;
}

/*ESTE EXERCICIO E MUITO FACIL*/
/*UM CIENTISTA DA COMPUTAÇAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE*/
/*ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG*/
