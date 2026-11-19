public class Szyfr {
    public static String szyfrujCezarem(String tekst, int klucz){
        String zaszyfrowane = "";
        klucz = klucz%26;
        for(int i = 0;i<tekst.length();i++) {
            char literka = tekst.charAt(i);
            if (literka == ' ') {
                zaszyfrowane = zaszyfrowane + " ";
            } else {
                int kodPrzesuniety = (int) literka + klucz;
                if(kodPrzesuniety>(int)'z'){
                    kodPrzesuniety = kodPrzesuniety-26;
                }
                else if(kodPrzesuniety < (int)'a'){
                    kodPrzesuniety = kodPrzesuniety+26;
                }
                zaszyfrowane = zaszyfrowane + (char) kodPrzesuniety;
            }
        }
        return zaszyfrowane;
    }
}
