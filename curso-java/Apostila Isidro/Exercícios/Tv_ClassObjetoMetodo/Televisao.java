/*
canal vai de 1 a 99
volume vai de 0 a 10
aumentarVolume, diminuirVolume, voltarCanal, avancaCanal, mutar
*/
public class Televisao{
    String marca;
    int tamanhoTela;
    int canal;
    int volume,volumeMutado;
    boolean ligada,mutado;



//funções de ligar/desligar
    void ligar(){
        ligada= true;
        System.out.println("A TV "+marca+" esta ligada agora");
    }
    void desligar(){
        ligada= false;
        System.out.println("A TV "+marca+" esta desligada agora");
    }
    void power(){
        ligada = !ligada;
        System.out.println("A TV "+marca+" esta com status de ligada ="+ligada);
    }
     
//funções de canal
    void avancarCanal(){
        if(ligada==true){
            if(canal==99){
                System.out.println("Estava no canal 99. Está no canal 1 agora");
            }
            else{
                canal++;
                System.out.println("Canal:"+canal;);
            }
        }
        else{
            System.out.println("Por favor ligue a tv primeiro");
        }
    }

    void voltarCanal(){
        if(ligada==true){
            if(canal==1){
                System.out.println("Estava no canal 1. Está no canal 99 agora");
            }
            else{
                canal--;
                System.out.println("Canal:"+canal;);
            }
        }
        else{
            System.out.println("Por favor ligue a tv primeiro");
        }
    }

    void setCanal(int canalDigitado){
        if(ligada==true){
            canal=canalDigitado;
            System.out.println("Canal digitado:"+canal);
            //return canal;
        }
        else{
            System.out.println("Por favor ligue a tv primeiro");
            //return 0;
        }
    }

    int getCana(){
        return canal;
    }

//funções de volume: aumentarVolume, diminuirVolume,mutar
void mutar(){
    if(mutado==false){
        volumeMutado=volume;
        volume=0;
        System.out.println("Volume mudo");
    }
    else{
        volume=volumeMutado;
        System.out.println("Volume:"+volume);
    }
}
void aumentarVolume(){
    if(volume==10){
        System.out.println("Volume máximo atingido (10)");
    }
    else{
        volume++;
    }
}
void diminuirVolume(){
    if(volume==0){
        System.out.println("Volume mínimo atingido (0)");
    }
    else{
        volume--;
        System.out.println("Volume:"+volume);
    }
}

}