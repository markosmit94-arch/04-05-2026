public class Main {

    public static void main(String[] args) {

        byte a=5;
        int b=55;
        long l=5L;
        float f=55.5f;
        double d=55.5;
        char c='a';
        boolean g=true;

        int ivo=13;
        int maja=17;
        int perica=22;

        double prosjek=(double)(ivo+maja+perica)/3;
        System.out.println("prosjek = "+prosjek);
        System.out.println("Matematicka konstanta PI = " + Math.PI);

        int kvadrat=(int)Math.pow(a,2);
        System.out.println("kvadrat = "+kvadrat);
        int kvadrat2=(int)Math.pow(b,2);
        System.out.println("kvadrat2 = "+kvadrat2);

        double korijen=Math.sqrt(b);
        System.out.println("korijen = "+korijen);

        int potencija=(int)Math.pow(b,3);
        System.out.println("potencija = "+potencija);

        if(b>25){

            System.out.println("\nBroj " + b + " veci je od 25");
        }

        else if(b<25){

            System.out.println("\nBroj " + b + " manji je od 25");
        }

        else System.out.println("\nBroj " + b + " je jednak 25");

        int ocjena=3;

        if(ocjena==1){

            System.out.println("Nedovoljan");
        }
        else if(ocjena==2){

            System.out.println("Dovoljan");
        }
        else if(ocjena==3){

            System.out.println("Dobar");
        }
        else if(ocjena==4){

            System.out.println("Vrlo Dobar");
        }
        else if(ocjena==5){

            System.out.println("Odličan");
        }
        else System.out.println("Krivo unosena ocjena");

        char spol='m';
    }
}
