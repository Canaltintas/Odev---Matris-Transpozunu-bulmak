import java.util.Scanner;

public class Main {
    static <matris> void createMatris(int a, int b){
        int[][] matris = new int[a][b];
        for (int i=0;i< matris.length;i++){
            for (int j=0;j< matris[i].length;j++){
                matris[i][j]=(int) (Math.random()*10);
            }
        }
        System.out.println("------------Matris------------");
        for (int[] i:matris){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("------------Transpoz------------");
        transpoz(matris,b,a);


    }
    static void transpoz(int[][] matris,int a,int b){
        int[][] array=new int[a][b];
        for (int i=0;i < array.length;i++){
            for (int j=0;j < array[i].length;j++){
                array[i][j]= matris[j][i];
            }
        }
        for (int[] i:array){
            for (int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }



    }
    public static void main(String[] args) {
        int a,b;
        Scanner input =new Scanner(System.in);
        System.out.println("Oluşturulacak Matrisinin Sınırlarını Giriniz : ");
        a=input.nextInt();
        b=input.nextInt();
        createMatris(a,b);

    }
}
