package OrientaçãoObejtos;

public class PersonagemMagico {

    String nome;
    int nivelEnergia;
    String poderMagico;

    HabilidadeEspecial habilidade;

// como o objeto sera instanciado ou criado
    public PersonagemMagico(String nome, int nivelEnergia,String poderMagico) {
        this.nome = nome;
        this.nivelEnergia = nivelEnergia;
        this.poderMagico = poderMagico;
    }

    public PersonagemMagico(){}
}
