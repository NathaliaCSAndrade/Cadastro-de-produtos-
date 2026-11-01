
package service;

import model.Produto;
import java.util.ArrayList;
import java.util.List;


public class CadastroProdutos {
    private List<Produto> produtos = new ArrayList<Produto>();
    
    public List<Produto> getProdutos() {
        return produtos;
    }
    
    public void cadastrar(int cod, String nome, String desc, double preco, int qtd){
        for (Produto prod: produtos){
            if (cod==prod.getCodigo()){
                return;
            }
        }
        Produto p = new Produto();
        p.setCodigo(cod);
        p.setNome(nome);
        p.setDescricao(desc);
        if (preco>=0){
            p.setPreco(preco);
        }
        else{
            p.setPreco(0);
        }
        if (qtd>=0){
            p.setQuantidade(qtd);
        }
        else{
            p.setQuantidade(0);
        }
        produtos.add(p);
    }
    
    public Produto localizar(int cod){
        for (Produto p: produtos){
            if (cod==p.getCodigo()){
                return p;
            }
        }
        return null;
    }
    
    public String[] listar(){
        String[] nomes = new String[produtos.size()];
        int i= 0;
        for (Produto p: produtos){
            nomes[i]= ("  Código: " + p.getCodigo() + "  Nome: " + p.getNome() + "  Descrição: " + p.getDescricao() + "  Preço: " + p.getPreco() + "  Quantidade: " + p.getQuantidade());
            i++;
        }
        return nomes;
    }
    
    public void atualizar(int cod, String nome, String desc, double preco, int qtd){
        for (Produto p: produtos){
            if (cod==p.getCodigo()){
                p.setNome(nome);
                p.setDescricao(desc);
                if (preco>=0){
                    p.setPreco(preco);
                }
                else{
                    p.setPreco(0);
                }
                if (qtd>=0){
                    p.setQuantidade(qtd);
                }
                else{
                    p.setQuantidade(0);
                }
            }
        }
    }
    
    public void remover(int cod){
        for (Produto p: produtos){
            if (cod==p.getCodigo()){
                produtos.remove(p);
            }
        }
    }
}
