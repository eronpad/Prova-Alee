public class Main {
    
    public static class Celular {
        public String marca;
        public String modelo;
        public double preco;
        public String estado;
        public String defeito;

        public Celular(String marca, String modelo, double preco, String estado, String defeito) {
            this.marca = marca;
            this.modelo = modelo;
            this.preco = preco;
            this.estado = estado;
            this.defeito = defeito;
        }
    }

    public static void main(String[] args) {
        Celular celular = new Celular("Samsung", "S24 Ultra", 4999.00, "Usado", "Bateria Oxidada");
        
        System.out.println("Relatorio: " + "\nMarca do celular: " + celular.marca
            + " \nCelular Modelo: "+ celular.modelo + "\n Preco: " + celular.preco 
            + "\n Estado do celular: " + celular.estado + "\n Defeito do celular: " + celular.defeito
        );
        
    }
}