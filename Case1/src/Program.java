public class Program {
    public static void main(String[] args) throws Exception {
        
        // Livro 1 - Core Java 2

        System.out.println("\nLIVRO 01");

        Livro livro1 = new Livro();

        livro1.codigo = "1598FHK";
        livro1.titulo = "Core Java 2";
        livro1.isbn = "0130819336";
        livro1.ano = 2005;

        livro1.autores = new String[2];
        livro1.autores[0] = "Cay S. Horstmann";
        livro1.autores[1] = "Gary Cornell";

        System.out.format("\nCodigo: %s \nTitulo: %s \nISBN: %s \nAno: %d ", livro1.codigo,
        livro1.titulo, livro1.isbn, livro1.ano 
        );

        System.out.print("\nAutores: ");
        for (String autor : livro1.autores){
            System.out.format("%s\n", autor);
        }

        System.out.println("\n======================================================================\n");

    }
}
