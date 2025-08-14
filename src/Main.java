import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Mentoria;
import java.time.LocalDate;
import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Dev;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(7);

        Curso curso2 = new Curso();
        curso2.setTitulo("desenvolvimento api");
        curso2.setDescricao("ensina como criar e utilizar interfaces de programação para permitir a comunicação entre diferentes softwares e sistemas.");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("GFT Start #7 - Java");
        bootcamp.setDescricao("Ganhe os fundamentos necessários para conquistar sua vaga de estágio na GFT! Uma imersão completa no desenvolvimento back-end com Java, desde a sintaxe básica até o desenvolvimento de APIs RESTful, integração com bancos de dados relacionais e NoSQL e cloud computing com AWS.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme");
        devGuilherme.inscreverBootcamp(bootcamp);
        devGuilherme.progredir();
        devGuilherme.progredir();
        devGuilherme.progredir();
        System.out.println("Conteúdos Inscritos Guilherme:" + devGuilherme.getConteudosInscrito());
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Conteúdos Concluídos Guilherme:" + devGuilherme.getConteudosConcluidos());
        System.out.println("XP: " + devGuilherme.CalcularTotalXp());
        System.out.println("-----------------------------------------------------------------------");
        

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscrito());
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.CalcularTotalXp());
        System.out.println("-----------------------------------------------------------------------");
    }
}
