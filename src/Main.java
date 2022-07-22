import br.com.dio.desafio.Bootcamp;
import br.com.dio.desafio.Curso;
import br.com.dio.desafio.Dev;
import br.com.dio.desafio.Mentoria;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);


        Dev devAvelanis = new Dev();
        System.out.println("--------------Avelanis-----------------");
        devAvelanis.setNome("Avelanis");
        devAvelanis.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos incritos" + devAvelanis.getConteudosInscritos());
        devAvelanis.progredir();
        System.out.println("--Progrediu--");
        System.out.println("Conteúdos incritos" + devAvelanis.getConteudosInscritos());
        System.out.println("Conteúdos concluídos " + devAvelanis.getConteudosConcluidos());
        System.out.println("XP: " + devAvelanis.calcularTotalXp());

        Dev devThyaga = new Dev();
        System.out.println("--------------Thyaga-----------------");
        devThyaga.setNome("Thyaga");
        devThyaga.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" + devThyaga.getConteudosInscritos());
        devThyaga.progredir();
        System.out.println("--Progrediu--");
        System.out.println("Conteúdos inscritos" + devThyaga.getConteudosInscritos());
        System.out.println("Conteúdos concluídos " + devThyaga.getConteudosConcluidos());
        System.out.println("XP: " + devThyaga.calcularTotalXp());


    }

}
