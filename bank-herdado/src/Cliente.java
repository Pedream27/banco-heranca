
public class Cliente  implements Autetica{
	
	
	private ControladorAutentica control;
	
	public Cliente() {
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
}
