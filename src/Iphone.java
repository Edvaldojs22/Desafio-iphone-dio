public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();

//        reprodutor.tocar();
//        reprodutor.pausar();
//        reprodutor.selecionarMusica();

        AparelhoTelefonico telefone = new AparelhoTelefonico();

        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioDeVoz();

        NavegadorInternet navegador = new NavegadorInternet();

        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
