import model.Picareta;

public static void main(String[] args) {
    System.out.println("╔══════════════════════════════════════════════════════════╗");
    System.out.println("║   VELHO STEVE - FÁBRICA DE PICARETAS ORIENTADA A OBJETOS ║");
    System.out.println("╚══════════════════════════════════════════════════════════╝");

    Picareta p1 = Picareta.fabricarPicareta("madeira", 50, 0);
    Picareta p2 = Picareta.fabricarPicareta("pedra", 70, 8);
    Picareta p3 = Picareta.fabricarPicareta("cobre", 50, 7);
    Picareta p4 = Picareta.fabricarPicareta("ferro", 80, 12);
    Picareta p5 = Picareta.fabricarPicareta("ouro", 30, 15);
    Picareta p6 = Picareta.fabricarPicareta("diamante", 120, 17);

    System.out.println("\nPicaretas fabricadas:");
    System.out.println("  • " + (p1 != null ? p1.exibeInfo() : "null"));
    System.out.println("  • " + (p2 != null ? p2.exibeInfo() : "null"));
    System.out.println("  • " + (p3 != null ? p3.exibeInfo() : "null"));
    System.out.println("  • " + (p4 != null ? p4.exibeInfo() : "null"));
    System.out.println("  • " + (p5 != null ? p5.exibeInfo() : "null"));
    System.out.println("  • " + (p6 != null ? p6.exibeInfo() : "null"));

    System.out.println("\n  Usando picaretas para minerar...");
    if (p4 != null) {
        p4.minerar(20);
        p4.minerar(40);

        System.out.println("\n Reparando a picareta de ferro...");
        p4.reparar(50);
    }

    System.out.println("\nEstado final das picaretas:");
    System.out.println("  • " + (p1 != null ? p1.exibeInfo() : "null"));
    System.out.println("  • " + (p2 != null ? p2.exibeInfo() : "null"));
    System.out.println("  • " + (p3 != null ? p3.exibeInfo() : "null"));
    System.out.println("  • " + (p4 != null ? p4.exibeInfo() : "null"));
    System.out.println("  • " + (p5 != null ? p5.exibeInfo() : "null"));
    System.out.println("  • " + (p6 != null ? p6.exibeInfo() : "null"));
}