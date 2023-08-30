package POOAula;

// Cria uma classe POOAula.Carro
// Criar atributos
// Crias métodos  -  Construtor e Destrutor / Get/ Set
class Carro {

    String cor;
    String modelo;
    int capacidadeTanque;

    // Contrutor objeto Carro padrão sem atributos

    Carro(){

    }

    // Contrutor objeto Carro ja com atributos
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }



    // Get / Set  (Atributos Cor, modelo)
    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    // Get/ Set (Atributo capacidadeTanque)

    void  setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque(){
        return capacidadeTanque;
    }

    // Método de negócios, calcular o valor total para encher o tanque
    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }

}