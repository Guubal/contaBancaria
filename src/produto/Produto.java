package produto;
import static java.lang.System.out;
public class Produto {
    private String nomeProduto, marcaProduto, categoriaProduto;
    private int codProduto, quantidadeProduto;
    private float precoProduto;

    public Produto(String nomeProduto, String marcaProduto, String categoriaProduto, int codProduto, int quantidadeProduto, float precoProduto) {
        this.nomeProduto = nomeProduto;
        this.marcaProduto = marcaProduto;
        this.categoriaProduto = categoriaProduto;
        this.codProduto = codProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.precoProduto = precoProduto;
    }

    public int quantidadeProduto() {
        return quantidadeProduto;
    }

    public Produto setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
        return this;
    }

    public String nomeProduto() {
        return nomeProduto;
    }

    public Produto setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
        return this;
    }

    public String marcaProduto() {
        return marcaProduto;
    }

    public Produto setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
        return this;
    }

    public String categoriaProduto() {
        return categoriaProduto;
    }

    public Produto setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
        return this;
    }

    public int CodProduto() {
        return codProduto;
    }

    public Produto setCodProduto(int codProduto) {
        this.codProduto = codProduto;
        return this;
    }

    public float precoProduto() {
        return precoProduto;
    }

    public Produto setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
        return this;
    }

    public void Visualizar(){
        out.printf("\n");
        out.printf("*".repeat(40));
        out.printf("\nProduto : %s", nomeProduto);
        out.printf("\nPreço : %.2f", precoProduto);
        out.printf("\nMarca : %s", marcaProduto);
        out.printf("\nCategoria : %s", categoriaProduto);
        out.printf("\nCódigo do produto : %d", codProduto);
    }
}
