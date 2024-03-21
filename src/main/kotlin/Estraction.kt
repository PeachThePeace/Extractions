class Estraction(lowerBoundV:Int, upperBoundV:Int) {
    //Creare una fun di
    // generazione del numero casuale che estrae un numero casuale compreso nell'intervallo
    // e memorizza nell'array delle estrazioni l'informazione che il numero è stato estratto;
    // se il numero generato è già stato estratto la funzione genera un nuovo numero finché non genera un numero non ancora estratto
    //(mettere un check per verificare che sia ancora possibile estrarre numeri)
    init{
        require(lowerBoundV<upperBoundV)
    }
    private val lowerBound=lowerBoundV
    private val upperBound=upperBoundV
    private val arraySize=upperBoundV-lowerBoundV
    private var extractions=Array<Boolean>(arraySize+1){false}
    fun extraction():Array<Boolean>{
        var randomNum=(lowerBound..upperBound).random()
        for(i in extractions.indices){
            randomNum=(lowerBound..upperBound).random()
            if(!extractions[randomNum]){
                extractions[randomNum]=true
            }
        }
        return extractions
    }
}