public abstract class Hoagie {

    final void makeSandwich(){

        cutBun();
        if(customerWantsMeat()){
            addMeat();
        }

        if(customerWantsChees()){
            addChees();
        }
        if(customerWantsVegetables()){
            addVegetables();
        }
        if(customerWantsCondiments()){
            addVCondiments();
        }
        wrapTheHoogie();
    }


    abstract void addMeat();
    abstract void addChees();
    abstract void addVegetables();
    abstract void addVCondiments();

    boolean customerWantsMeat(){return  true;}
    boolean customerWantsVegetables(){return  true;}
    boolean customerWantsChees(){return  true;}
    boolean customerWantsCondiments(){return  true;}

    public void cutBun(){
        System.out.println("The hoagie is Cut");
    }

    public void wrapTheHoogie(){
        System.out.println("Wrap the Hoagie");
    }

}


