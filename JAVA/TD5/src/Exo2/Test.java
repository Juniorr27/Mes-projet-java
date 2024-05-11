package Exo2;

public class Test {
	 public static void main(String args[]) {
		 InterfaceValeur[] tab=new InterfaceValeur[2]; 
		 tab[0]=new B("rouge"); 
		 tab[1]=new A(5);
		  for(int i=0;i<tab.length;i++) {
			  System.out.println(tab[i]); 
			  System.out.println(tab[i].valeur()); 
			  System.out.println(tab[i].valeurBis());
		  }
	 }
}
