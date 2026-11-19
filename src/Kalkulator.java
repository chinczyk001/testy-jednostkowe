public class Kalkulator {
    public static int suma(int a, int b){
        return a+b;
    }
    public static double podziel(double a, double b){
        return a/b;
    }

    public static boolean czyPierwsza(int liczba){
        if(liczba == 1){
            return false;
        }
        if(liczba == 2){
            return true;
        }
        int pierwiastek =1;
        while (pierwiastek*pierwiastek<liczba){
            pierwiastek++;
        }
       for(int i =2;i<=pierwiastek; i++){
            if(liczba%i==0)
                return false;
        }
        return true;
    }
}
