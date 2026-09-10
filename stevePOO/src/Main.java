import model.Crafter;

public static void main(String[] args) {


    //Teste craft das picaretas

    try {
        Crafter p1 = new Crafter("Cobre", 25, 2);
        System.out.println(p1);

        Crafter p2 = new Crafter("Ferro", 50, 4);
        System.out.println(p2);

        Crafter p3 = new Crafter("Diamante", 100, 8);
        System.out.println(p3);

        System.out.println("Picaretas Criadas");

    } catch (IllegalArgumentException e) {
        System.err.println("Erro ao criar objeto: " + e.getMessage());
    } finally {
        System.out.println("Fechando a mesa de trabalho...");
    }



    //Teste mineração de blocos



}