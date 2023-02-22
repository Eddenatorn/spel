
 
package spel;

import java.util.Scanner;
import java.util.Random;
public class Spel {

    public static void main(String[] args) {
        
        
        String spelarnamn = "spelare1";
      
        int spelareHP = 100;
        int spelareAnfall = 20;
        int spelareSkydd = 5;
        int fiendeHP = 100;
        int fiendeAnfall = 25;
        int fiendeSkydd = 3;
        
        
        Scanner tang = new Scanner(System.in);
        
        System.out.println("Välkommen till mitt Fighting spel, du kommer att slåss mot olika fiender. Gör dig redo!");
        
      
        int val;
            
            System.out.println("vart vill du gå?");
            System.out.println("1. stranden");
            System.out.println("2. skogen");
            System.out.println("3. staden");
            System.out.println("4. avsluta spelet");
            
            val = tang.nextInt();

          switch (val) {
              case 1:
                  System.out.println("Du har hamnat på stranden och blir anfallen av blob");
                  String fiendenamn1 = "blob";
                   while(true) {
                System.out.println("Vad vill du göra?");
                System.out.println("1. Slåss");
                System.out.println("2. fly");
                System.out.println("3. läka");
                    

                    String input = tang.next();
                    switch (input) {
                        case "1":
                            //spelarens skada på fienden
                            int spelarDMG = spelareAnfall - fiendeSkydd - new Random().nextInt(10);
                            fiendeHP -= spelarDMG;
                            System.out.println(spelarnamn + " Anföll " + fiendenamn1 + " för " + spelarDMG +" skada");
                            System.out.println(spelarnamn + " HP: " + spelareHP + "  " + fiendenamn1 + " HP: " + fiendeHP);
                            if (fiendeHP <=0) {
                                System.out.println("Du eliminerade"+ fiendenamn1);
                                return;
                            }
                            //fiendens skada på spelaren
                            int fiendeDMG = fiendeAnfall - spelareSkydd - new Random().nextInt(10);
                            spelareHP -= fiendeDMG;
                            System.out.println(fiendenamn1 + " Anföll " + spelarnamn + " för " + fiendeDMG + " skada");
                            System.out.println(spelarnamn + " HP: " + spelareHP + "  " + fiendenamn1 + " HP: " + fiendeHP);
                            
                            if (spelareHP <=0){
                                System.out.println("haha du suger och förlorade mot en NPC, SLUT");
                            }
                            break;

                        case "2":
                            //spelarens försök att fly
                            int chansFly = new Random().nextInt(10);
                            if (chansFly >=9) {
                                System.out.println("Du lyckades fly");
                                System.out.println("fegis");
                                return;
                            }else {System.out.println("Du lyckades inte fly och får nu stryk av" + fiendenamn1);
                                System.out.println("sämst");
                                //spelaren blir straffad
                                int skadaStryk = fiendeAnfall - spelareSkydd - new Random().nextInt(5);
                                spelareHP -= skadaStryk;
                                System.out.println(fiendenamn1 + " gav " + spelarnamn + " en örfil för " + skadaStryk + " skada " );
                                System.out.println(spelarnamn + " HP: " + spelareHP + "  " + fiendenamn1 + " HP: " + fiendeHP);
                                if (spelareHP <= 0) {
                                    System.out.println("haha du suger och förlorade mot en NPC, SLUT");
                                    return;
                                }
                            }
                            break;
                        case "3":
                            //spelaren healar/läker
                            int healsumma = new Random().nextInt(20) + 10;
                            spelareHP += healsumma;
                            System.out.println(spelarnamn + " healade sig själv " + healsumma + " och har nu " + spelareHP + " HP ");
                            System.out.println(spelarnamn + " HP: " + spelareHP + "  " + fiendenamn1 + " HP: " + fiendeHP);
                            break;

                        default:
                            System.out.println("fel input, välj mellan 1, 2 och 3.");
               
                    }
                }
            
                  
              case 2:
                  System.out.println("Du har hamnat i skogen och blir anfallen av en drake");
                  String fiendenamn2 = "drake";
                   while(true) {
                       if(spelareHP>100){
                                spelareHP=100;
                            }
                System.out.println("Vad vill du göra?");
                System.out.println("1. Slåss");
                System.out.println("2. fly");
                System.out.println("3. läka");
                    String input = tang.next();
                    switch (input) {
                        case "1":
                            //spelarens skada på fienden
                            int spelarDMG = spelareAnfall - fiendeSkydd - new Random().nextInt(10);
                            fiendeHP -= spelarDMG;
                            System.out.println(spelarnamn + " Anföll" + fiendenamn2 + " för" + spelarDMG +" skada");
                            System.out.println(spelarnamn + " HP: " + spelareHP + "  " + fiendenamn2 + " HP: " + fiendeHP);
                            if (fiendeHP <=0) {
                                System.out.println("Du eliminerade"+ fiendenamn2);
                                return;
                            }
                            //fiendens skada på spelaren
                            int fiendeDMG = fiendeAnfall - spelareSkydd - new Random().nextInt(10);
                            spelareHP -= fiendeDMG;
                            System.out.println(fiendenamn2 + " Anföll " + spelarnamn + " för " + fiendeDMG + " skada");
                            System.out.println(spelarnamn + " HP: " + spelareHP + "  " + fiendenamn2 + " HP: " + fiendeHP);
                            if (spelareHP <=0){
                                System.out.println("haha du suger och förlorade mot en NPC, SLUT");
                            }
                            break;

                        case "2":
                            //spelarens försök att fly
                            int chansFly = new Random().nextInt(10);
                            if (chansFly >=9) {
                                System.out.println("Du lyckades fly");
                                System.out.println("fegis");
                                return;
                            }else {System.out.println("Du lyckades inte fly och får nu stryk av" + fiendenamn2);
                                System.out.println("sämst");
                                //spelaren blir straffad
                                int skadaStryk = fiendeAnfall - spelareSkydd - new Random().nextInt(5);
                                spelareHP -= skadaStryk;
                                System.out.println(fiendenamn2 + " gav " + spelarnamn + " en örfil för " + skadaStryk + " skada " );
                                System.out.println(spelarnamn + " HP: " + spelareHP + "  " + fiendenamn2 + " HP: " + fiendeHP);
                                if (spelareHP <= 0) {
                                    System.out.println("haha du suger och förlorade mot en NPC, SLUT");
                                    return;
                                }
                            }
                            break;
                        case "3":
                            //spelaren healar/läker
                            int healsumma = new Random().nextInt(20) + 10;
                            spelareHP += healsumma;
                            System.out.println(spelarnamn + " healade sig själv " + healsumma + " och har nu " + spelareHP + " HP ");
                            System.out.println(spelarnamn + " HP: " + spelareHP + "  " + fiendenamn2 + " HP: " + fiendeHP);
                            break;

                        default:
                            System.out.println("fel input, välj mellan 1, 2 och 3.");
                break;
                    }
                }
               
                  
              case 3:
                  System.out.println("du har hamnat i skogen och blir anfallen av ett troll");
                  String fiendenamn3 = "troll";
                   while(true) {
                System.out.println("Vad vill du göra?");
                System.out.println("1. Slåss");
                System.out.println("2. fly");
                System.out.println("3. läka");
                    String input = tang.next();
                    switch (input) {
                        case "1":
                            //spelarens skada på fienden
                            int spelarDMG = spelareAnfall - fiendeSkydd - new Random().nextInt(10);
                            fiendeHP -= spelarDMG;
                            System.out.println(spelarnamn + " Anföll" + fiendenamn3 + " för" + spelarDMG +" skada");
                            System.out.println(spelarnamn + " HP: " + spelareHP + "  " + fiendenamn3 + " HP: " + fiendeHP);
                            if (fiendeHP <=0) {
                                System.out.println("Du eliminerade "+ fiendenamn3);
                                return;
                            }
                            //fiendens skada på spelaren
                            int fiendeDMG = fiendeAnfall - spelareSkydd - new Random().nextInt(10);
                            spelareHP -= fiendeDMG;
                            System.out.println(fiendenamn3 + " Anföll " + spelarnamn + " för " + fiendeDMG + " skada");
                            System.out.println(spelarnamn + " HP: " + spelareHP + "  " + fiendenamn3 + " HP: " + fiendeHP);
                            if (spelareHP <=0){
                                System.out.println("haha du suger och förlorade mot en NPC, SLUT");
                            }
                            break;

                        case "2":
                            //spelarens försök att fly
                            int chansFly = new Random().nextInt(10);
                            if (chansFly >=9) {
                                System.out.println("Du lyckades fly");
                                System.out.println("fegis");
                                return;
                            }else {System.out.println("Du lyckades inte fly och får nu stryk av" + fiendenamn3);
                                System.out.println("sämst");
                                //spelaren blir straffad
                                int skadaStryk = fiendeAnfall - spelareSkydd - new Random().nextInt(5);
                                spelareHP -= skadaStryk;
                                System.out.println(fiendenamn3 + " gav " + spelarnamn + " en örfil för " + skadaStryk + " skada " );
                                System.out.println(spelarnamn + " HP: " + spelareHP + "  " + fiendenamn3 + " HP: " + fiendeHP);
                                if (spelareHP <= 0) {
                                    System.out.println("haha du suger och förlorade mot en NPC, SLUT");
                                    return;
                                }
                            }
                            break;
                        case "3":
                            //spelaren healar/läker
                            int healsumma = new Random().nextInt(20) + 10;
                            spelareHP += healsumma;
                            System.out.println(spelarnamn + " healade sig själv " + healsumma + " och har nu " + spelareHP + " HP ");
                            System.out.println(spelarnamn + " HP: " + spelareHP + "  " + fiendenamn3 + " HP: " + fiendeHP);
                            break;

                        default:
                            System.out.println("fel input, välj mellan 1, 2 och 3.");
                break;
                    }
                }
              case 4:
                  System.out.println("adios amigo");
                  break;
                
                  
          
        
               
            }
        }
    }







