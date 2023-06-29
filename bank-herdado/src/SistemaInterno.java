public class SistemaInterno {

    private int senha = 2222;

    public void autentica(Autetica g) {
        boolean a = g.autentica(this.senha);
        if (a) {
            System.out.println("Pode entra no sistema");
            
        }else{
            System.out.println("Nao pode entra no sistema");
        }
        
    }
    
}