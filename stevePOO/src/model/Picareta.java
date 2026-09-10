package model;

public class Picareta {
    private String material;
    private int durabilidade;
    private int durabilidadeMaxima;
    private int forca;

    //metodo controla picareta
    public Picareta(String material, int durabilidade, int forca) {
        this.material = material;
        this.forca = forca;
        this.durabilidade = durabilidade;

        switch (material.toLowerCase()) {
            case "madeira":
                this.durabilidadeMaxima = 20;
                break;
            case "pedra":
                this.durabilidadeMaxima = 40;
                break;
            case "cobre":
                this.durabilidadeMaxima = 50;
                break;
            case "ferro":
                this.durabilidadeMaxima = 80;
                break;
            case "ouro":
                this.durabilidadeMaxima = 60;
                break;
            case "diamante":
                this.durabilidadeMaxima = 100;
                break;
            default:
                this.durabilidadeMaxima = 45;
                break;
        }

        if (this.durabilidade > this.durabilidadeMaxima) {
            this.durabilidade = this.durabilidadeMaxima;
        }
    }

    //metodo fabrica picareta
    public static Picareta fabricarPicareta(String material, int durabilidade, int forca) {
        System.out.println("\n=== FABRICANDO PICARETA ===");
        System.out.println("Material: " + material);
        System.out.println("Durabilidade: " + durabilidade);
        System.out.println("Força: " + forca);

        Picareta picareta = new Picareta(material, durabilidade, forca);

        if (!picareta.isValida()) {
            System.out.println("Picareta inválida!");
            return null;
        }

        System.out.println("Picareta de " + material + " fabricada com sucesso!");
        return picareta;
    }

    //metodo valida picartea
    public boolean isValida() {
        return this.durabilidade > 0 && this.forca > 0;
    }

    //metodo mostra informação
    public String exibeInfo() {
        if (!isValida()) {
            return "Picareta inválida!";
        }
        return "Picareta de " + this.material + " (D: " + this.durabilidade + ", F: " + this.forca + ")";
    }

    //metodo minera blocos
    public int minerar(int blocos) {
        System.out.println("\n=== MINERANDO COM PICARETA DE " + this.material.toUpperCase() + " ===");
        System.out.println("Durabilidade atual: " + this.durabilidade);
        System.out.println("Força: " + this.forca);
        System.out.println("Blocos a minerar: " + blocos);

        if (this.durabilidade <= 0) {
            System.out.println("Picareta quebrada!");
            return 0;
        }

        int blocosMinerados = 0;

        for (int i = 0; i < blocos; i++) {
            if (this.durabilidade <= 0) {
                System.out.println(" Picareta quebrou no bloco " + (i + 1));
                break;
            }
            this.durabilidade--;
            blocosMinerados++;
        }

        System.out.println("\nMinerados " + blocosMinerados + " blocos");
        System.out.println("Durabilidade restante: " + this.durabilidade);

        if (this.durabilidade <= 0) {
            System.out.println(" A picareta de " + this.material + " quebrou completamente!");
        }

        return this.durabilidade;
    }

    //metodo repara picareta
    public int reparar(int quantidade) {
        System.out.println("\n=== REPARANDO PICARETA DE " + this.material.toUpperCase() + " ===");
        System.out.println("Durabilidade atual: " + this.durabilidade);
        System.out.println("Quantidade a reparar: " + quantidade);

        this.durabilidade += quantidade;

        if (this.durabilidade > this.durabilidadeMaxima) {
            System.out.println(" Reparo limitado a " + this.durabilidadeMaxima);
            this.durabilidade = this.durabilidadeMaxima;
        }

        System.out.println(" Durabilidade nova: " + this.durabilidade);
        return this.durabilidade;
    }


    //getters
    public String getMaterial() {
        return material;
    }

    public int getDurabilidade() {
        return durabilidade;
    }

    public int getForca() {
        return forca;
    }
}
