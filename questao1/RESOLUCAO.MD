## CÓDIGO DA QUESTÃO:
```
public class Produto { 
    public String nome;
    private static double preco; 
    final int codigo; 

    public Produto(String nome) { 
        codigo = "A100";
        nome = nome; 
    } 
    public static void aplicarDesconto(double porcentagem) { 
        preco = preco - (preco * (porcentagem / 100));
        System.out.println("Produto: " + nome); 
    } 
        
    public void setCodigo(int novoCodigo) { 
        this.codigo = novoCodigo;
    } 
    public void getPreco() { 
        return preco; 
    } 
    public static void main(String[] args) { 
       Produto p1 = new Produto("Teclado"); 
       p1.preco = 150.0;
       p1.codigo = 500;
       double valor = p1.getPreco();
       System.out.println("Valor: " + valor);
       Produto.aplicarDesconto(10); 
    }
}
```
## ERROS ENCONTRADOS:

1. O atributo **preco** está declarado como _static_, mas cada produto tem um preço.
2. O construtor atribuit uma _String_ ao **codigo** que tem tipo _int_.
3. O método **aplicarDesconto** está declarado como static, mas isso aplicaria um desconto à todos os produtos, além disso ele tenta acessar um atributo de instância: **nome**.
4. O método **setCodigo** atribui um novo valor ao atributo **codigo**, mas ele é um campo _final_ que já foi inicializado e não pode receber um novo valor.
5. O método **getPreco()** está declarado como _void_, mas retorna **preco** que é um atributo do tipo _double_.
6. Na **main**, _p1.codigo_ tenta reatribuir um valor à **preco** que é um campo do tipo _final_
7. Na **main**, _double valor = p1.getPreco();_ está incorreto, pois **getPreco()** é do tipo void, ou seja, não retorna nenhum valor para ser atribuído a uma variável.