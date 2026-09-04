public class TesteFormas {
    public static void main(String[] args) {
        // Podemos tratar objetos de classes diferentes de forma genérica
        // por meio do tipo da interface que elas implementam
        Forma retangulo = new Retangulo(5, 3);
        Forma circulo = new Circulo(4);

        System.out.println("--- Retangulo ---");
        System.out.println("Area: " + retangulo.calcularArea());
        System.out.println("Perimetro: " + retangulo.calcularPerimetro());

        System.out.println("--- Circulo ---");
        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Perimetro: " + circulo.calcularPerimetro());

        // Um array do tipo Forma pode guardar objetos de qualquer classe que implemente a interface
        Forma[] formas = { retangulo, circulo };
        double areaTotal = 0;
        for (Forma f : formas) {
            areaTotal += f.calcularArea();
        }
        System.out.println("--- Total ---");
        System.out.println("Area total das formas: " + areaTotal);
    }
}
