/*Cenário 2: Crie uma classe que represente um Ponto no espaço bidimensional. Na classe
Programa efetue as operações listadas abaixo. Para realização dos cálculos de elevação ao
quadrado utilizar Math.pow(valor, 2) e para extração da raiz quadrada utilizar Math.sqrt(valor).
(Não precisa usar Model-View-Controller MVC) 

1. Crie um objeto ponto1 usando o primeiro construtor;
2. Crie um objeto ponto2 na posição (2,5);
3. Calcule a distância do ponto1 ao ponto2;
4. Calcule a distância do ponto2 às coordenadas (7,2);
5. Altere o valor de x para 10 no ponto1;
6. Altere o valor de y para 3 no ponto1;

Observações:
 O construtor Ponto( ): cria um ponto na origem (0,0);
 O Ponto(x: double, y: double): nas coordenadas x e y;


*/

public class Ponto {
    
    // 1. Crie um objeto ponto1 usando o primeiro construtor;

    double x;
    double y;

    public Ponto(){
        x = 0;
        y = 0;
    }

    // 2. Crie um objeto ponto2 na posição (2,5);

    public Ponto(double x, double y){

        this.x = x;
        this.y = y;
    }

    //3. Calcule a distância do ponto1 ao ponto2;

    public double calcularDistancia(Ponto outroPonto){

        double DiferencaX = outroPonto.x - this.x;
        double DiferencaY = outroPonto.y - this.y;

        double distancia = Math.sqrt(Math.pow(DiferencaX, 2) + Math.pow(DiferencaY, 2));

        return distancia;

    }

    // Getters

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    // Setters

    public void setX(double x) {
        this.x = x;
    }
    
    public void setY(double y){
        this.y = y;
    }
}

