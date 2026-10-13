public class Lasagna {

    
    
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int time){
        return expectedMinutesInOven() - time;
    }
    
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int camadas){
        int tempo = camadas * 2;
        return tempo;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int camadas, int time){
        int tempototal = preparationTimeInMinutes(camadas) + time;
        return tempototal;
    }
}
