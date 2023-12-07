package javamm;

@SuppressWarnings("all")
public class SpiralPath_soluzione {
  /**
   * Dato un numero dispari positivo n, la matrice associata ad n e' la
   * matrice bidimensionale di dimensione nxn, riempita con i numeri da
   * 1 a nxn a partire dall'elemento in alto a sinistra e procedendo da
   * sinistra verso destra e dall'alto verso il basso. Ad esempio,
   * la matrice associata a 3 e' la seguente matrice:
   * 
   *   1 2 3
   *   4 5 6
   *   7 8 9
   * 
   * mentre la matrice associata a 5 e' la seguente matrice:
   * 
   *   1  2  3  4  5
   *   6  7  8  9 10
   *  11 12 13 14 15
   *  16 17 18 19 20
   *  21 22 23 24 25
   * 
   * La visita a spirale della matrice associata a n consiste nel visitare,
   * una e una sola volta, tutti gli elementi della matrice partendo
   * dall'elemento "al centro" e proseguendo secondo una spirale in senso
   * antiorario, ossia avanzando nel seguente ordine: in alto, a sinistra,
   * in basso e a destra, il numero di volte necessario per ciascuna direzione,
   * e ricominciando. Ad esempio, la visita a spirale della matrice associata a 3
   * visita i suoi elementi secondo il seguente ordine:
   * 
   * 5 2 1 4 7 8 9 6 3
   * 
   * mentre la visita a spirale della matrice associata a 5 visita i suoi elementi
   * secondo il seguente ordine:
   * 
   * 13 8 7 12 17 18 19 14 9 4 3 2 1 6 11 16 21 22 23 24 25 20 15 10 5
   * 
   * Scrivere un metodo, chiamato spiralPath, che dato in input un numero
   * dispari positivo e dato un numero positivo i tale che 1<=i<=nxn,
   * restituisca l'elemento della matrice associata ad n che viene
   * visitato per i-esimo durante la visita a spirale della matrice stessa.
   * 
   * ESEMPI
   * Input: 3, 2
   * Output: 2
   * 
   * Input: 3, 5
   * Output: 7
   * 
   * Input: 3, 8
   * Output: 6
   * 
   * Input: 5, 2
   * Output: 8
   * 
   * Input: 5, 8
   * Output: 14
   * 
   * Input: 5, 15
   * Output: 11
   */
  public static int spiralPath(int n, int i) {
    int[][] matrice = new int[n][n];
    int a = 1;
    for (int u = 0; (u < n); u++) {
      for (int j = 0; (j < n); j++) {
        {
          matrice[u][j] = a;
          a++;
        }
      }
    }
    int b = 1;
    int giro = 0;
    int riga = (n / 2);
    int colonna = (n / 2);
    while ((giro < n)) {
      {
        for (int u = 0; (u <= giro); u++) {
          {
            if ((b == i)) {
              return matrice[riga][colonna];
            }
            riga--;
            b++;
          }
        }
        for (int u = 0; (u <= giro); u++) {
          {
            if ((b == i)) {
              return matrice[riga][colonna];
            }
            colonna--;
            b++;
          }
        }
        giro++;
        for (int u = 0; (u <= giro); u++) {
          {
            if ((b == i)) {
              return matrice[riga][colonna];
            }
            riga++;
            b++;
          }
        }
        for (int u = 0; (u <= giro); u++) {
          {
            if ((b == i)) {
              return matrice[riga][colonna];
            }
            colonna++;
            b++;
          }
        }
        giro++;
      }
    }
    for (int u = 0; (u <= n); u++) {
      {
        if ((b == i)) {
          return matrice[riga][colonna];
        }
        riga--;
        b++;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
  }
}
