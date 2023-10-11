package IPhone.NavegadorInternet;

public class Safari implements NavegadorInternet {
    private String paginaAtual = "";

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
        paginaAtual = url;
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Abrindo uma nova aba com a página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página atual: " + paginaAtual);
    }
}
