/*
Dichiarare l’interfaccia “IFigura” con il valore di “pigreco ”
e i metodi “perimetro() ” e “area() ” . Dichiarare la classe
astratta Figura che implementa IFigura completando il
metodo perimetro() e non il metodo area(). Figura
aggiunge il campo pubblico intero nLati, il costruttore che
assegna la lunghezza di un lato al campo “lato1” e il
metodo “getNLati()” e gli altri setter e getter.
Deriva da Figura e codifica le classi concrete
TriangoloScaleno (aggiungi lato2 e lato3),
TriangoloEquilatero, Quadrato, Rettangolo, Pentagono
 */
package figura;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     Triangolo.test();
     TriangoloEquilatero.test();
     TriangoloScaleno.test();
     Quadrato.test();
     Rettangolo.test();
     Pentagono.test();
    }
    
}
