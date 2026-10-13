public class Lasagna {

    
    public int expectedMinutesInOven(){
        return 40;
    }
    
    public int remainingMinutesInOven(int time){
        return expectedMinutesInOven() - time;
    }
    
    public int preparationTimeInMinutes(int camadas){
        int tempo = camadas * 2;
        return tempo;
    }
    
    public int totalTimeInMinutes(int camadas, int time){
        int tempototal = preparationTimeInMinutes(camadas) + time;
        return tempototal;
    }
}
