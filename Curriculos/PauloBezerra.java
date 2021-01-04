/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ember.curriculo_java;

import java.text.SimpleDateFormat;

/* @author Paulo.Bezerra
 */
public class PauloBezerra {

    private String Contato(String info) {

        if (info.equals("nome")) {

            return "Paulo Henrique Bezerra";

        } else if (info.equals("idade")) {

            return String.valueOf("30");

        } else if (info.equals("nascimento")) {

            String nascimento = new SimpleDateFormat("dd-MM-yyyy").format("29-01-1990");

            return nascimento;

        } else if (info.equals("endereco")) {

            return "Rua Michel Alexandre Mutran · São Paulo, CEP 04835-060";

        } else if (info.equals("telefones")) {

            return "Cel: (11) 98199-7228";

        } else if (info.equals("email")) {

            return "paulo.henriqueb@me.com";

        } else if (info.equals("github")) {

            return "https://phbrazil.github.io/PauloBezerra";

        } else if (info.equals("portfolio")) {

            return "https://www.pauloportfolio.com";
        }
        return "";
    }

    private String Sobre() {
        String sobre = "Paulo é Analista de Dados, Programador Fullstack Java, \n"
                + "fundador da 9ember e cofundador da Cyber Oficina, \n"
                + "com experiência profissional de quase 10 anos na área de T.I, \n"
                + "sendo 5 deles em implantação de sistemas em Java Web/Dektop com \n"
                + "banco de dados MySQL/PostgreSQL e servidores Tomcat/JBoss, \n"
                + "criação e alteração de relatórios de análise de performance e \n"
                + "gerencial no ramo logístico (MIS), com manipulação de dados \n"
                + "extraídos de base SQL. Possui também grande conhecimento em HTML, \n"
                + "Javascript, CSS, Bootstrap, Git, Maven, Servidores Linux e \n"
                + "Virtualização Azure. Possui também ampla experiência com o pacote Office, \n"
                + "especialmente com Excel o qual possui conhecimento em criação, manutenção \n"
                + "e automação de templates de indicadores de desempenho. \n"
                + "Atuou por mais de 1 ano como assistente administrativo na \n"
                + "Deloitte, por 6 meses como analista de suporte na Nestlé, atuou de \n"
                + "2014 a 2018 no Suporte da Ernst & Young atuando também na área de \n"
                + "gerenciamento de indicadores de performance e atualmente é Analista de \n"
                + "Dados na MCI Brasil responsável pelo gerenciamento de todos os dados de \n"
                + "projetos e comerciais.\n";
        return sobre;
    }

    private String Experiencia(String empresa) {

        String descricao = "";

        switch (empresa) {
            case "MCI":
                descricao = "ANALISTA DE DADOS Junho 2018 - Dezembro 2020\n\n"
                        + "Atua como Analista de Dados exercendo também a \n"
                        + "função de engenharia dados com a criação de \n"
                        + "ferramenta web desenvolvida especificamente para \n"
                        + "coletar, organizar, analisar e apresentar dashboards e \n"
                        + "insights de forma online e automática, com integração com SAP, \n"
                        + "CRM e outras ferramentas internas.\n";
                break;
            case "EY":
                descricao = "ANALISTA DE SUPORTE PLENO - Junho 2014 - Junho 2018\n\n"
                        + "Atuou de 2014 à 2018 como analista de suporte remoto aos \n"
                        + "sistemas da EY em plataforma Windows, Mac, IOS e Android. \n"
                        + "Foi também responsável por criar, alterar e publicar todos \n"
                        + "relatórios gerenciais e indicadores de performance e desempenho \n"
                        + "em LATAM, desenvolvidos em Excel e VBA, e apresentar junto a \n"
                        + "liderança Global. Foi responsável também por desenvolver, em \n"
                        + "linguagem Java e banco de dados MySQL e PostgreSQL, sistemas internos \n"
                        + "para otimizar e diminuir o tempo de atendimento do Suporte \n"
                        + "visando melhorias de processos.";
                break;

            case "Nestlé":
                descricao = "ANALISTA DE SERVICE DESK - Outubro 2013 - Maio 2014\n\n"
                        + "Atuou com suporte à problemas e solicitações diárias em escritório,\n "
                        + "com pacote Office, acessos a rede ou sistemas específicos, \n"
                        + "dúvidas referentes a processos internos, abertura de chamados de \n"
                        + "alta prioridade devido a demanda do negócio e otimização e melhoria \n"
                        + "de processos.\n";
                break;
            case "Flash Courier":
                descricao = "COORDENADOR DE IMPLANTAÇÃO - Novembro 2008 - Outubro 2013\n\n"
                        + "Atuou como coordenador de implantação e homologador \n"
                        + "de sistemas no ramo logístico atuando com levantamento de \n"
                        + "informações e requisitos junto à clientes e usuários; criação de \n"
                        + "escopos e Wireframes de sistemas a serem implantados ou modificados em \n"
                        + "linguagem Java Web (JSP, Servlets, Hibernate), em servidores Jboss e \n"
                        + "Glassfish em plataformas Linux e Windows com banco de dados MySQL e PostgreSQL; \n"
                        + "homologação dos mesmos garantindo a integridade e funcionalidade do \n"
                        + "que foi solicitado; criação de diagramas de Caso de Uso; criação de DER e MER; \n"
                        + "criação de modelos de relatórios MIS com foco em acompanhamento de performance \n"
                        + "e definição de estratégia";
                break;
            case "Deloitte":
                descricao = "ASSISTENTE ADMINISTRATIVO - Outubro 2006 - Julho 2008\n\n"
                        + "Atuou como office boy interno Menor Aprendiz, \n"
                        + "responsável pelo controle de material geral de escritório e \n"
                        + "auxilio em atividades rotineiras do departamento.";
                break;

        }

        return descricao;
    }

    private boolean Educacao() {
        boolean concluido = true;
        String curso = "Tecnologia em Análise e Desenvolvimento de Sistemas \n"
                + "no Senac São Paulo - Conclusão 2019";
        return concluido;
    }

    private void Cursos() {
        String cursos = "Certificado Análise e Desenvolvimento de Sistemas - Senac\n"
                + "Programador de Sistemas Intermediário - Senac\n"
                + "Big Data Foundation - ITCerts - License 5F5F1BB\n"
                + "InfoSec Foundation - ITCerts - License 5F5F1BC\n"
                + "Cloud Security Foundation - ITCerts - License 5F5F1BD\n"
                + "Data Security Specialist - ITCerts - License 5F5F1BE\n"
                + "ITIL V3 Foundations - License 02345622-01-7N9D\n"
                + "English Language - CNA\n"
                + "COBIT 5 Foundations - Green Treinamentos\n"
                + "Excel Charting - EY University\n"
                + "Excel VBA - EY University\n"
                + "Excel - Nível Avançado - EY University\n"
                + "Lógica em Programação - Impacta\n"
                + "Competência Transversal - Tecnologia da informação e da comunicação - SENAI";

    }

    private String Habilidades() {
        String skills = "Java\n"
                + "JSP"
                + "Servlets"
                + "MYSQL\n"
                + "PostgreSQL\n"
                + "Hibernate"
                + "Spring Boot"
                + "Thymeleaf"
                + "Apache TomEE"
                + "HTML5\n"
                + "CSS3\n"
                + "Bootstrap\n"
                + "jquery"
                + "Ajax"
                + "Git"
                + "GitHub\n"
                + "Linux Servers\n"
                + "Windows Servers\n"
                + "Azure"
                + "GPC"
                + "ETL\n"
                + "MS Excel/VBA\n"
                + "Flutter";
        
        return skills;
    }

    public static void main(String[] args) {
        PauloBezerra paulo = new PauloBezerra();

        System.out.println(paulo.Experiencia("MCI"));

    }
}
