
public class Adiministrator extends Funcionario implements Autetica{
	
	private ControladorAutentica control;
	
	public Adiministrator() {
		this.control = new ControladorAutentica();
	}
	
	@Override
	public void setSenha(int senha) {
		this.control.setSenha(senha);
		
	}
	
	@Override
	public boolean autentica(int senha) {
		return control.autentica(senha);
				}

	public double getBonificacao() {
	
		return 50;
	}

}
