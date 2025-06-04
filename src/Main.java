public class Main {
    public static void main(String[] args) {
        //Número1
        ListaDuplamenteEncadeada listaSimpsons = new ListaDuplamenteEncadeada();
        String homer = "Homer";
        String marge = "Marge";
        listaSimpsons.inserir(homer);
        listaSimpsons.inserir(marge);
        listaSimpsons.exibir();

        //Número2
        listaSimpsons.limpar();
        listaSimpsons.exibir();

        //Número3
        String bart = "Bart";
        String moll = "Moll";
        listaSimpsons.inserir(homer);
        listaSimpsons.inserirEm(0, bart);
        listaSimpsons.inserirEm(1, moll);
        listaSimpsons.exibir();

        //Número4
        listaSimpsons.limpar();

        //Número5
        String lisa = "Lisa";
        listaSimpsons.inserir(homer);
        listaSimpsons.inserir(bart);
        listaSimpsons.inserirEm(0, lisa);
        listaSimpsons.exibir();
        listaSimpsons.exibirTamanho();

        //Número6
        listaSimpsons.limpar();
        listaSimpsons.exibir();

        //Número7
        String maggie = "Maggie";
        listaSimpsons.inserir(homer);
        listaSimpsons.inserir(maggie);
        listaSimpsons.inserirEm(0, bart);
        listaSimpsons.inserirEm(1, marge);
        listaSimpsons.exibir();
        listaSimpsons.verificacaoString(lisa);

        //Número8
        listaSimpsons.limpar();

        //Número9
        listaSimpsons.inserir(homer);
        listaSimpsons.inserir(bart);
        listaSimpsons.exibir();
        listaSimpsons.exibirTamanho();

        //Número10
        listaSimpsons.verificacaoString(marge);
        listaSimpsons.verificacaoString(homer);
        listaSimpsons.verificacaoString(bart);
        listaSimpsons.verificacaoString(maggie);

        //Número11
        listaSimpsons.limpar();

        //Número12
        String nedFlanders = "Ned Flanders";
        String srBurns = "Sr. Burns";
        listaSimpsons.inserirEm(0, homer);
        listaSimpsons.inserirEm(0, bart);
        listaSimpsons.inserirEm(1, marge);
        listaSimpsons.inserirEm(1, maggie);
        listaSimpsons.inserirEm(0, nedFlanders);
        listaSimpsons.inserir(srBurns);
        listaSimpsons.exibir();

        //Número13
        listaSimpsons.remover(srBurns);
        listaSimpsons.exibir();

        //Número14
        listaSimpsons.removerEm(1);
        listaSimpsons.exibir();
        listaSimpsons.exibirTamanho();

        //Número15
        listaSimpsons.verificacaoString(marge);
        listaSimpsons.verificacaoString(homer);
        listaSimpsons.verificacaoString(bart);
        listaSimpsons.verificacaoString(maggie);
        listaSimpsons.exibir();
        listaSimpsons.exibirTamanho();

        //Número16
        listaSimpsons.removerEm(0);
        listaSimpsons.exibir();
        listaSimpsons.exibirTamanho();

        //Número17
        listaSimpsons.verificacaoString(marge);
        listaSimpsons.verificacaoString(homer);
        listaSimpsons.verificacaoString(bart);
        listaSimpsons.verificacaoString(maggie);
        listaSimpsons.exibirTamanho();

        //Número18
        listaSimpsons.limpar();
        listaSimpsons.exibir();
    }
}