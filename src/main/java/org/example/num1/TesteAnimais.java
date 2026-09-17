package org.example.num1;

import java.util.ArrayList;
import java.util.List;

public class TesteAnimais {
    public List<Animal> lista = new ArrayList<>();
    public void criarAnimais(){
        final Gato gato1 = new Gato("Diogenes");
        final Cachorro cachorro1 = new Cachorro("Pipa");
        final Animal animal1 = new Animal("Aloísio");
        this.adicionarAnimalNaLista(gato1);
        this.adicionarAnimalNaLista(cachorro1);
        this.adicionarAnimalNaLista(animal1);
    }
    public void adicionarAnimalNaLista(Animal animal){
         this.lista.add(animal);
    }
    public void testar(){
        this.criarAnimais();
    }
    public void TestarSom(){
        testar();
        for (int i = 0; i < this.lista.toArray().length; i++) {
            var barulho = this.lista.get(i).emitirSom();
            System.out.println(barulho);
        }
    }
}
