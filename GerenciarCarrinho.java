

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarCarrinho  {
    Scanner leia = new Scanner(System.in);
        public static List<Compra> listCompras = new ArrayList<>();
    public static List<Produto> listProduto = new ArrayList<>();
    public static List<ProdutoFisico> listProdutoFisico = new ArrayList<>();
    
public static  void main(String[] args){
    int opcao = 0;
    GerenciarCarrinho c = new GerenciarCarrinho();
    do{
         System.out.println("<============Gerenciar compraas de produtos no carrinho =========>");
         System.out.println("Digite 1 para adcionar um produto  ao carrinho:\n");
         System.out.println("Digite 3 para remover um produto do carrinho:\n");
         System.out.println("Digite 4 exibir todas as compras realizadas:\n");
          System.out.println("Digite 7 para exibir os gastos realizaedos com a compra:\n");
         System.out.println("Digite 9 para sair do sistema");
         opcao = Integer.parseInt(c.leia.nextLine());
 switch(opcao) {
     case 1:
         c.execAdicionarCarrinho();
         break;
     case 4:
         c.execExibirCompras();
         break;
     case 3:
         c. execRemoverProduto();
         break;
     case 7:
         c.execVisualiazarGasto();
         break;
  
     
     case 9:
            System.out.println("Programa encerrado com sucesso!");
            System.out.println("Obrigado pela participação!");
            System.out.println("<===============>");
			break;
			default:
			System.out.println("Opcao invalida");
    
        
    }
    
}while(opcao != 9);    
    

}




    public  void execAdicionarCarrinho() {
      
   System.out.println("<===========ADICIONE UM PRODUTO AO CARRINHO==========================>");
   System.out.println("Informe o  nome do produto que gostaria de comprar:");
   String nome = (leia.nextLine());
   System.out.println("Informe o valor a ser pago pelo produto:");
   double preco = Double.parseDouble(leia.nextLine());
   System.out.println("Informe a quantidade que deseja levar:");
   Integer  unidade = Integer.parseInt(leia.nextLine());
   System.out.println("<==========================Produto adcionado ao carrinho com sucesso!====================================>");
   Compra compras = new Compra(nome,preco,unidade);
   listCompras.add(compras);
                
         
    }
    
    
    public void execExibirCompras(){
        System.out.println("Essas são as compras realizadas pelo cliente:");
        for(Compra compras : listCompras){
            	compras.ExibirInformaçoes();
        }
    }
    
    public void execRemoverProduto(){
        System.out.println("Informe o nome do produto a ser removido:");
        String nome = (leia.nextLine());
         Compra produtoRemover = null;
        for (Compra compras: listCompras) {
            if (compras.getNome().equals(nome)) {
                produtoRemover = compras;
                break;
            }
        }
        
        if (produtoRemover != null) {
            listCompras.remove(produtoRemover);
            System.out.println("Produto removido com sucesso!");
        }
       
       
        
    }
    
       public void execVisualiazarGasto(){
            double totalGasto= 0;
            int totalProdutoDigital = 0;
            int  totalEstoque = 0;
            for(Compra compras:listCompras){
            totalGasto= totalGasto + compras.getPreco();
        }
        System.out.println("Seu gasto total na compra foi:" + totalGasto);
        System.out.println("<==========================================>");
        
          
    }       
      
}




