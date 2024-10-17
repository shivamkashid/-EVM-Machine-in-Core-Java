import java.util.Scanner;
public class election {
    static int bjp, congress, aap, mns, sena, nota ; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("****    VOTTING MASHINE    ****");
        System.out.println();
        System.out.println("Enter the count of voters");
        int count = sc.nextInt();
        for(int i=1;i<=count;i++){
            System.out.println();
            System.out.println("1.bjp 2.congress 3.aap 4.mns 5.sena 6.nota");
            System.out.println("Enter an option: ");
            int option = sc.nextInt();
            System.out.println();

            switch(option){
                case 1: bjp++; System.out.println("SAPKA SATH SABKA VIKAS"); break;
                case 2: congress++; System.out.println("BHARAT JODO"); break;
                case 3: aap++; System.out.println("APP KA EK VOTE MUJE AAZAD KAR SAKTA HII"); break;
                case 4: mns++; System.out.println("JAI MAHARASHTRA"); break;
                case 5: sena++; System.out.println("ASLI SENA AMCHICH"); break;
                case 6: nota++; System.out.println("YOU ARE EDUCATED"); break;
                default:System.out.println("WRONG OPTION ENTERED"); i--;

            }
            
        }
        if (bjp > congress && bjp>aap && bjp>mns && bjp>sena && bjp>nota){
            System.out.println(" BJP HAS WON THE ELECTION WITH "+ bjp + " VOTES"); 
        }
        else if (congress > bjp && congress>aap && congress>mns && congress>sena && congress>nota){
            System.out.println(" CONGRESS HAS WON THE ELECTION WITH  "+ congress + " VOTES"); 
        }
        else if (aap  > congress && aap >bjp && aap >mns && aap >sena && aap >nota){
            System.out.println(" AAP HAS WON THE ELECTION WITH "+ aap  + " VOTES"); 
        }
        else if (mns > congress && mns>aap &&mns>bjp &&mns>sena && mns>nota){
            System.out.println(" MNS HAS WON THE ELECTION WITH "+ mns + " VOTES"); 
        }
        else if (sena > congress && sena>aap && sena>mns && sena>bjp && sena>nota){
            System.out.println(" SENA HAS WON THE ELECTION WITH "+ sena + " VOTES"); 
        }
        else  {
            System.out.println(" NOTA WITH "+ nota + " VOTES"); 
        }

        
    }
    
}
