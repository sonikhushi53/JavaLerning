package oops;

public class PeramitrizedCons {

    int i ;

    PeramitrizedCons(int i){
        this.i = i;
        // return;
        // return this; // can't return a value
    }
    
    public static void main(String[] args) {
        PeramitrizedCons p = new PeramitrizedCons(98);
    }
}
