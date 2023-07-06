
def discount (prise: Double ) : Double = {
    prise*0.6;
}

def shipping (amount:Int ) : Double = {
    if(amount <= 50){
        amount*3
    }
    else{
        (50*3)+((amount-50)*0.75)
    }
}


def total(pris:Double , allBook:Int  ): Double = {
    (allBook*discount(pris))+shipping(allBook)
}