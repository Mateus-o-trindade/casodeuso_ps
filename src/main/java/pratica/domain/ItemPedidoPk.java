package  pratica.domain ;

import  javax.persistence.Embeddable ;
import  javax.persistence.JoinColumn ;
import  javax.persistence.ManyToOne ;

@Embeddable
public  class  ItemPedidoPK  implementa  Serializable {
	private  static  final  long serialVersionUID =  1L ;
	
	@ManyToOne
	@JoinColumn ( name = " pedido_id " )
	 Pedido pedido privado ;
	
	@ManyToOne
	@JoinColumn ( name = " produto_id " )
	private  Produto produto;
	
	 Pedido  getPedido público () {
		retorno pedido;
	}
	public  void  setPedido ( Pedido  pedido ) {
		isso . pedido = pedido;
	}
	public  Produto  getProduto () {
		return produto;
	}
	public  void  setProduto ( Produto  produto ) {
		isso . produto = produto;
	}
	@Sobrepor
	public  int  hashCode () {
		retornar  objetos . hash (pedido, produto);
	}
	@Sobrepor
	public  boolean  equals ( Object  obj ) {
		if ( this  == obj)
			return  true ;
		if (obj ==  null )
			return  false ;
		if (getClass () ! = obj . getClass ())
			return  false ;
		ItemPedidoPK outro = ( ItemPedidoPK ) obj;
		retornar  objetos . é igual a (pedido, outro . pedido) &&  Objetos . é igual a (produto, outro . produto);
	}
	
	

}