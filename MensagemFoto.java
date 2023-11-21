
/**
 * Escreva uma descrição da classe MensagemFoto aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MensagemFoto extends Mensagem {
    private String nomeArquivo;
    private String legenda;

    public MensagemFoto(String autor, String nomeArquivo, String legenda) {
        super(autor);
        this.nomeArquivo = nomeArquivo;
        this.legenda = legenda;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public String getLegenda() {
        return legenda;
    }
    
    public void imprimirTexto(){
        System.out.println(autor + " escreveu: " + nomeArquivo + "<legenda: " + legenda + ">");
        imprimir();
    }
}