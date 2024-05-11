
package aula7;


public class Aula7 {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];//un vecteur
        l[0] = new Lutador("pretty boy","FRança",31,81.9f,1.75f,11,2,1);
        l[1] = new Lutador("Putsvript","Brasil",29,57.9f,1.68f,14,2,3);
        l[2] = new Lutador("Snap shadow","EUA",30,105.9f,1.81f,12,2,4);
        l[3] = new Lutador("dead code","Brasil",28,81.9f,1.81f,12,2,4);
        l[4] = new Lutador("UFOCabol","Australia",37,119.3f,1.70f,5,4,3);
        l[5] = new Lutador("Nerdeat","EAU",30,105.7f,1.81f,12,2,4);
       // l[0].apresentar();
        //l[2].status();
        
        Luta UECO1 = new Luta();
        UECO1.marcarLuta(l[2],l[5]);
        UECO1.lutar();
        l[2].status();
        
                
    }
   
}
