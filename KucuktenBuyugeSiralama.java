import java.util.Scanner;
public class KucuktenBuyugeSiralama {
    public static void main(String[] args){
        int sayi1,sayi2,sayi3;
        Scanner input = new Scanner(System.in);

    
        System.out.println("Lütfen 3 tane sayı girininiz:");
        sayi1 = input.nextInt();
        sayi2 = input.nextInt();
        sayi3 = input.nextInt();
        
        if(sayi1>sayi2){
            if(sayi2>sayi3){
                System.out.print(sayi1+ ">"+ sayi2+ ">" +sayi3);
            }else{
                System.out.print(sayi1+ ">"+ sayi3+ ">" +sayi2);
            }
        }else if(sayi2>sayi3){
            if(sayi3>sayi1){
                System.out.print(sayi2+ ">"+ sayi3+ ">" +sayi1);
            }else if(sayi1>sayi3){
                System.out.print(sayi2+ ">"+ sayi1+ ">" +sayi3);
            }
        }
        else if (sayi3>sayi1){
            if(sayi2>sayi1){
                System.out.print(sayi3+ ">"+ sayi2+ ">" +sayi1);
            }else if(sayi1>sayi2){
                System.out.print(sayi3+ ">"+ sayi1+ ">" +sayi2);
            }
        }


    }
    
}