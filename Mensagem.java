import java.util.ArrayList;

public class Mensagem {
    public String autor;
    private long horaPostagem;
    private int curtidas;
    private ArrayList<String> comentarios;

    public Mensagem(String autor) { 
        this.autor = autor;
        this.horaPostagem = horaPostagem;
        curtidas = 0;
        horaPostagem = System.currentTimeMillis();
        comentarios = new ArrayList<>();
    }

    public void adicionarCurtida(){
        curtidas++;
    }
    
    public void descurtir(){
        curtidas--;
    }
    
    public void comentar(String comentario){
        comentarios.add(comentario);
    }
    
    public void adicionarComentario(String comentario){
        comentarios.add(comentario);
    }
    
    public void imprimir(){
        System.out.println(getTextoTempo());
        System.out.println(curtidas + " pessoas curtiram isso!");
        System.out.println("Comentarios");
        
        for (String comentario : comentarios) {
            System.out.println(comentario);
        }
    }
    private String getTextoTempo() {
        long tempoAtual = System.currentTimeMillis();
        long diferenca = (tempoAtual - horaPostagem);
        long diferencaSeg = diferenca/1000;
        long diferencaMin = diferencaSeg/60;
        if (diferencaMin < 1) {
                return "Há " + diferencaSeg + " segundos";
        }
        else {
                return "Há " + diferencaMin + " minutos";
        }
    }

}