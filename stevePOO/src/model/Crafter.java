package model;

public class Crafter {
    private String material;
    private int durabilidade;
    private int forca;

    public Crafter(String material, int durabilidade, int forca) {
        if (durabilidade <= 0 || forca <= 0) {
            System.out.println("Erro: Durabilidade menor/igual a zero.");
        }

        this.material = material;
        this.durabilidade = durabilidade;
        this.forca = forca;
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

    @Override
    public String toString() {
        return "Picareta de " + material + ", (Durabilidade: " + durabilidade + ", Força: " + forca + ")";
    }

}
