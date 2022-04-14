import java.util.*;

class Main {
  public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     String parola_input;
    System.out.println("Dammi la parola");
     parola_input  = scn.next();
     LettereInglese.contlettere(parola_input);
     
  }
}

class LettereInglese {
  
	public static void contlettere  (String parola_input){
     int cont=0;
    
     int lung = parola_input.length();
    for (int i = 0 ; i < lung; i++) {    
       if (parola_input.charAt(i) == 'J' || parola_input.charAt(i) == 'j') cont ++;
       else if (parola_input.charAt(i) == 'K' || parola_input.charAt(i) == 'k') cont ++;
            else  if (parola_input.charAt(i) == 'X' || parola_input.charAt(i) == 'x') cont ++;
                  else  if (parola_input.charAt(i) == 'Y' || parola_input.charAt(i) == 'y') cont ++;
                        else  if (parola_input.charAt(i) == 'W' || parola_input.charAt(i) == 'w') cont ++;
		} 
     if (cont>0) System.out.println("Ci sono " + cont + " Carattere  inglese in questa parola");
      else System.out.println("Non ci sono Carattere  inglese in questa parola");
	}
}