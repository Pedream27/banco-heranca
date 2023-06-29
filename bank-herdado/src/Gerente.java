public class Gerente extends Funcionario implements Autetica{
	
	
	private ControladorAutentica control;
	
	public Gerente () {
		this.control = new ControladorAutentica();
		
	}

	@Override
	public boolean autentica(int senha) {
		return control.autentica(senha);
	}
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario();
	}

	public void setSenha(int senha) {
		this.control.setSenha(senha);
	}

	

}
