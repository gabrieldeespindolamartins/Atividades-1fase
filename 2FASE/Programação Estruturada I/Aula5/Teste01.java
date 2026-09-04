public class Teste01 {

    public static void main(String[] args) {
        double  n = Teclado.leDouble("Digita n: ");
        double media = Teclado.leDouble("Digita media: ");
        double x = Teclado.leDouble("Digita x: ");
        double y = Teclado.leDouble("Digita y: ");
        double z = Teclado.leDouble("Digita z: ");
        float raiz;
        int r = 0;

        if (n > 0){
            raiz = (float)Math.sqrt(n);
            System.out.println("Raiz: " + raiz);    
        }

        if (media >= 6.0){
            System.out.println("Aprovado");
        } else {
            System.out.println("Precisa de grau C");
        }

        
        if (x > y){
            if (x > y){
                if (y != z){
                    r = 1;
                }
            }
        }


    }   
   

    
}   
