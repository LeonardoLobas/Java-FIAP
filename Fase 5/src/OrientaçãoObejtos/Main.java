package OrientaçãoObejtos;

public class Main {

    public static void main(String[] args) {

        //Criando um objeto do tipo Personagem Mágico mago = instancia new = estou instanciando
        PersonagemMagico mago = new PersonagemMagico( "Gandalf", 100,"Magia");


        //Exibindo valores dos atributos do objeto
        System.out.println(mago.nome + " Energia: " + mago.nivelEnergia + " Poder: " + mago.poderMagico);

        PersonagemMagico elfo = new PersonagemMagico( "Legolas",50,"Arqueira");

        System.out.println(elfo.nome + " Energia: " + elfo.nivelEnergia + " Poder: " + elfo.poderMagico);
    }
}