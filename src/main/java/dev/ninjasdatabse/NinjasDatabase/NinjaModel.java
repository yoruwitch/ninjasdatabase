package dev.ninjasdatabse.NinjasDatabase;

import jakarta.persistence.*;

// Entity transforma uma classe em uma entidade do BD

//obs: precisei colocar get e set pra id nessa versão
@Entity

@Table(name = "tb_ninja_creation")
public class NinjaModel {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // -> como o ID será gerado, nesse caso é numérico
    private Long id;
    private String name;
    private String email;
    private int age;

    //lembrar que getters e setter é pra ajudar na proteção dos atributos de uma classe

    public NinjaModel(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public NinjaModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
