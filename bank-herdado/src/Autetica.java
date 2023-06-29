

// contrato autetica
 // quem assina esse contrato, precisa implementar
  // metodo setSenha
  // metodo autentica

public abstract interface Autetica  {
   
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha) ;
}
	