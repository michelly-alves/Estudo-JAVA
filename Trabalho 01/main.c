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

    if (N %2 != 0 || N > 10000)
    {
    printf("Digite novamente a quantidade de sapatos:\n");
    scanf("%d", &N);
    }

    Sapato shoes[N];

    //adquirindo dados dos sapatos junto com verifficações
    int i,j, cont = 0;
    for(i=0;i<N;i++)
    {
        printf("Numero do sapato e lado do sapato(E/D):");
        scanf("%d %s", &shoes[i].M, &shoes[i].C);

        if (shoes[i].M <= 30 || shoes[i].M >=60)
        {
            printf("Numero do sapato e lado do calçado novamente:");
            scanf("%d %s", &shoes[i].M, &shoes[i].C);
        }
        if(shoes[i].C != 'D' && shoes[i].C != 'E')
        {
            printf("Numero do sapato e lado do calçado novamente:");
            scanf("%d %s", &shoes[i].M, &shoes[i].C);
        }
    }

    ///juntando pares
    for(i=0;i<N;i++)
    {
        for(j=0;j<N;j++)
        {
            if(shoes[i].M == shoes[j].M && shoes[i].C != shoes[j].C)
            {
                    cont++;
            }
        }
    }

    printf("Quantidade de pares que podem ser feitos:%d", cont/4);


    return 0;
}
