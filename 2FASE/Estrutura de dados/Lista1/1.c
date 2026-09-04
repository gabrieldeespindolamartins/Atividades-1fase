
#include <stdio.h>

int main() 
{
    float vetor[7];
    int i;

    for (i = 0; i < 7; i++) {
        printf("Insira a temperatura máxima do dia %d: ", i+1);
        scanf("%f", &vetor[i]);
    }

    printf("Exibição da temperatura máxima de cada dia semana \n");

    for (i = 0; i < 7; i++) {
        printf("Dia  %d: %f \n", i + 1, vetor[i]);
    }

    return 0;
}
