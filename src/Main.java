import br.com.bootcamp.models.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java", "Descrição curso java", 8);

        Curso curso2 = new Curso("Curso JavaScript", "Descrição JavaScript", 4);

        Mentoria mentoria = new Mentoria("Mentoria Java", "Descrição mentoria java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp de Java");
        bootcamp.setDescricao("Descrição bootcamp de java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMat = new Dev();
        devMat.setNome("Matheus");
        devMat.increverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos"+devMat.getConteudosInscritos());

        devMat.progredirPorNome(mentoria);
        System.out.println("Conteudos inscritos"+devMat.getConteudosInscritos());
        System.out.println("Conteudos concluidos"+devMat.getConteudosConcluidos());

        System.out.println("Total XP: "+devMat.calcularTotalXP());


}
}