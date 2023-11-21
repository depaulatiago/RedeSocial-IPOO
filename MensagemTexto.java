import java.util.List;
/**
 * Escreva uma descrição da classe MensagemTexto aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MensagemTexto extends Mensagem {
    private String texto;
    
    public MensagemTexto(String autor, String texto) {
        super(autor);
        this.texto = texto;
    }
    
    public void imprimirTexto(){
        System.out.println(autor + " escreveu: " + texto);
        imprimir();
    }
}
