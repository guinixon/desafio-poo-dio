package br.com.dio.dominio;
import java.util.Set;
import java.util.Optional;
import java.util.LinkedHashSet;


public class Dev {
    private String nome;
    private Set<Conteudo> ConteudosInscrito = new LinkedHashSet<>();
    private Set<Conteudo> ConteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.ConteudosInscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.ConteudosInscrito.stream().findFirst();
        if(conteudo.isPresent()){
            this.ConteudosConcluidos.add(conteudo.get());
            this.ConteudosInscrito.remove(conteudo.get());
        }
        else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double CalcularTotalXp(){
        return this.ConteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    public Dev() {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set<Conteudo> getConteudosInscrito() {
        return ConteudosInscrito;
    }
    public void setConteudosInscrito(Set<Conteudo> conteudosInscrito) {
        ConteudosInscrito = conteudosInscrito;
    }
    public Set<Conteudo> getConteudosConcluidos() {
        return ConteudosConcluidos;
    }
    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        ConteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((ConteudosInscrito == null) ? 0 : ConteudosInscrito.hashCode());
        result = prime * result + ((ConteudosConcluidos == null) ? 0 : ConteudosConcluidos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (ConteudosInscrito == null) {
            if (other.ConteudosInscrito != null)
                return false;
        } else if (!ConteudosInscrito.equals(other.ConteudosInscrito))
            return false;
        if (ConteudosConcluidos == null) {
            if (other.ConteudosConcluidos != null)
                return false;
        } else if (!ConteudosConcluidos.equals(other.ConteudosConcluidos))
            return false;
        return true;
    }

    



}