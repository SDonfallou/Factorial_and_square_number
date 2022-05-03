import java.util.*;

class Main {
  public static void main(String[] args) {

     String parola_input = LettereInglese.parola_dato();
     LettereInglese.contlettere(parola_input);
     
  }
}

class LettereInglese {
  
	public static void contlettere  (String parola_input){
     int cont=0;
    
     int lung = parola_input.length();

    char lettere_inglese [] = {'j','k','x','y','w'};
      for (int i =0; i<lung; i++){
        for (int j=0; j<lettere_inglese.length; j++){
          if (parola_input.toLowerCase().charAt(i)==lettere_inglese[j] ) cont ++;
        }
      }
      
     if (cont>0) System.out.println("Ci sono " + cont + " Carattere  inglese in questa parola");
      else System.out.println("Non ci sono Carattere  inglese in questa parola");
	}

  public static String parola_dato() {
      Scanner scn = new Scanner(System.in);
     String parola_interno;
     System.out.println("Dammi la parola");
     parola_interno  = scn.nextLine();
    return parola_interno;
  }
}
