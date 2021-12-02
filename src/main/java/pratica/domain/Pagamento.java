Ir para o conteúdo
Pesquise ou pule para ...
Solicitação de pull s
Problemas
Mercado
Explorar
 
@ Mateus-o-trindade 
MariAquinoNunes
/
casodeuso_ps
Público
1
00
Código
Problemas
Solicitações de pull
Ações
Projetos
Wiki
Segurança
Intuições
casodeuso_ps/src/a Principal/Java/pratica/domínio/ Pagamento.java /
@MariAquinoNunes
MariAquinoNunes Instâncias e Repositórios de Pedido e Pagamento
Último commit 2c13c9d anteontem
 História
 1 contribuidor
80 linhas (62 sloc)  1,57 KB
   
package  pratica.domain ;

import  java.io.Serializable ;
import  java.util.Objects ;

import  javax.persistence.Entity ;
import  javax.persistence.Inheritance ;
import  javax.persistence.InheritanceType ;
import  javax.persistence.JoinColumn ;
import  javax.persistence.MapsId ;
import  javax.persistence.OneToOne ;

import  pratica.domain.enums.EstadoPagamento ;

@Entidade
@Inheritance ( strategy  =  InheritanceType . JOINED )
public  abstract  class  Pagamento  implementa  Serializable { // abstract para garantir que objetos do tipo pagamento sejam instanciados
	private  static  final  long serialVersionUID =  1L ;
	 id inteiro privado ;
	private  Integer estado;
	
	@Um a um
	@JoinColumn ( name  =  " pedido_id " )
	@MapsId
	 Pedido pedido privado ;
	
	public  Pagamento () {
	}

	público  Pagamento ( Integer  id , EstadoPagamento  estado , pedido  pedido ) {
		super ();
		isso . id = id;
		isso . estado = estado . getCod ();
		isso . pedido = pedido;
	}

	public  Integer  getId () {
		return id;
	}

	public  void  setId ( ID inteiro  ) {
		isso . id = id;
	}

	public  EstadoPagamento  getEstado () {
		voltar  EstadoPagamento . toEnum (estado);
	}

	public  void  setEstado ( EstadoPagamento  estado ) {
		isso . estado = estado . getCod ();
	}

	 Pedido  getPedido público () {
		retorno pedido;
	}

	public  void  setPedido ( Pedido  pedido ) {
		isso . pedido = pedido;
	}

	@Sobrepor
	public  int  hashCode () {
		retornar  objetos . hash (id);
	}

	@Sobrepor
	public  boolean  equals ( Object  obj ) {
		if ( this  == obj)
			return  true ;
		if (obj ==  null )
			return  false ;
		if (getClass () ! = obj . getClass ())
			return  false ;
		Pagamento other = ( Pagamento ) obj;
		retornar  objetos . igual (id, outro . id);
	}
	
	

}
© 2021 GitHub, Inc.
Termos
Privacidade
Segurança
Status
Docs
Entre em contato com o GitHub
Preços
API
Treinamento
Blog
Cerca de
