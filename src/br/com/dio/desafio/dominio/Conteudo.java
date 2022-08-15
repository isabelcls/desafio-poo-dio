package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

/*
 1- Esta é uma classe mãe. O intutito de criar essa classe é poder iniciar os atributos titulo e descrição r criar um metodo calcular XP p que as classes filhos utilizem esses p/ simplificar o código e evitar repetição
 2- Criar uma constante padrão que todo conteudo já vai ser criado com o Xp padrão com o valor 10
 3- A palavra reservada final define/representa uma constante
 4- Static quer dizer que vai poder acessar o Xp padrão fora da classe conteudo
 5- Quem vai poder ter acesso a constante Xp vai ser os filhos de conteudo porque está protected
 6- O método abstract significa que as classes filhas, as classes que extenderem de conteúdo vão ser obrigadas a implementar uma lógica nesse método. Obs a classe tbm tem que ser abstrata

*/
