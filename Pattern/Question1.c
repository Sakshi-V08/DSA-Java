#include <stdio.h>
#include <stdlib.h>



int main() {
    int N;
    scanf("%d", &N);
    int powers[N];

    // Input powers
    for (int i = 0; i < N; i++) {
        scanf("%d", &powers[i]);
    }

    long long ironman_power = 0;
    long long captain_power = 0;

    // Alternately select avengers for Iron Man and Captain America
    for (int i = 0; i < N; i++) {
        if (i % 2 == 0) { // Iron Man's turn
            ironman_power += powers[i];
        } else { // Captain America's turn
            captain_power += powers[i];
        }
    }

    // Calculate the difference in powers
    long long difference = ironman_power - captain_power;

    // Print the difference in powers
    printf("%lld\n", difference);

    return 0;
}
