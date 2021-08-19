package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descriçao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descriçao curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome ("BootCamp Java Developer");
        bootCamp.setDescricao("Descriçao BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootCamp);
        System.out.println("Conteudo Inscristos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("_");
        System.out.println("Conteudo Inscristos Camila" + devCamila.getConteudosInscritos());
        System.out.println("Conteudo Concluidos Camila" + devCamila.getConteudosConcluidos());
        System.out.println("xp:" + devCamila.calcularTotalxp());

        System.out.println("_______");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootCamp);
        System.out.println("Conteudo Inscristos Joao:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("_");
        System.out.println("Conteudo Inscristos Joao:" + devJoao.getConteudosInscritos());
        System.out.println("Conteudo Concluidos Joao:" + devJoao.getConteudosConcluidos());
        System.out.println("xp:" + devJoao.calcularTotalxp());

    }
}
