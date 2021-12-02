package  pratica.domain ;

import  java.io.Serializable ;
import  java.util.Objects ;

import  javax.persistence.EmbeddedId ;
import  javax.persistence.Entity ;

@Entidade
public  class  ItemPedido  implementa  Serializable {
	private  static  final  long serialVersionUID =  1L ;
	
	@EmbeddedId
	 id ItemPedidoPK privado =  novo  ItemPedidoPK (); // id é atributo composto, então utiliza-se @Embeddable na classe ItemPedidoPK
	
	 desconto duplo privado ;
	 quantidade inteira privada ;
	 Duplo preco privado ;
	
	public  ItemPedido () {
	}

	public  ItemPedido ( Pedido  pedido , Produto  produto , Double  desconto , Integer  quantidade , Double  preco ) {
		super ();
		id . setPedido (pedido);
		id . setProduto (produto);
		isso . desconto = desconto;
		isso . quantidade = quantidade;
		isso . preco = preco;
	}

	 Pedido  getPedido público () {
		id de retorno . getPedido ();
	}
	
	public  Produto  getProduto () {
		id de retorno . getProduto ();
	}
	
	public  ItemPedidoPK  getId () {
		return id;
	}

	public  void  setId ( ItemPedidoPK  id ) {
		isso . id = id;
	}

	public  Double  getDesconto () {
		return desconto;
	}

	public  void  setDesconto ( Double  desconto ) {
		isso . desconto = desconto;
	}

	public  Integer  getQuantidade () {
		quantidade de retorno ;
	}

	public  void  setQuantidade ( quantidade Integer  ) {
		isso . quantidade = quantidade;
	}

	public  Double  getPreco () {
		return preco;
	}

	public  void  setPreco ( Double  preco ) {
		isso . preco = preco;
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
		ItemPedido outro = ( ItemPedido ) obj;
		retornar  objetos . igual (id, outro . id);
	}
	

}