#include <stdio.h>
#include <stdlib.h>

struct sapato{
    int M;
    char C;
};

typedef struct sapato Sapato;

int main()
{
    //quantidade de sapatos e verifição
    int N;
    printf("Quantidade de sapatos (2<= N <=10000):\n");
    scanf("%d", &N);

    while (N %2 != 0 || N > 10000 || N % 2 != 0)
    {
    printf("Digite novamente a quantidade de sapatos:\n");
    scanf("%d", &N);
    }

    Sapato shoes[N];

    //adquirindo dados dos sapatos junto com verifficações
    int i,j, pares = 0;

    for(i=0;i<N;i++)
    {
        printf("Numero do e lado do sapato(E/D):");
        scanf("%d %c", &shoes[i].M, &shoes[i].C);

        while ((shoes[i].M <= 30 || shoes[i].M >=60) || (shoes[i].C != 'E' && shoes[i].C != 'D'))
        {
            printf("Numero e lado do sapato novamente:");
            scanf("%d %c", &shoes[i].M, &shoes[i].C);
        }

    }
    ///juntando pares
    for(i=0;i<N;i++)
    {
        for(j=0;j<N;j++)
        {
            if(shoes[i].M == shoes[j].M)
            {
                if (shoes[j].C != shoes[i].C)
                pares++;
                break;
            }
        }
    }
    printf("Quantidade de pares que podem ser feitos: %d", pares);

    return 0;
}
