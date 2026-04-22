public abstract class hoagie {

    boolean afterFirstCondiment = false;

    // Con final, se indica que no se debe sobreescribir
    final void makeSandwich(){
        // Cortar pan
        cutBun();
        // ¿El cliente quiere carne?
        if(customerWantsMeat()){
            addMeat();
            afterFirstCondiment = true;
        }
        // ¿El cliente quiere queso?
        if(customerWantsCheese()){
            if(afterFirstCondiment) { System.out.print("\n");}
            addCheese();
            afterFirstCondiment = true;
        }
        // ¿El cliente quiere vegetables?
        if(customerWantsVegetables()){
            if(afterFirstCondiment) { System.out.print("\n");}
            addVegetables();
            afterFirstCondiment = true;
        }
        // ¿El cliente quiere condimentos?
        if(customerWantsCondiments()){
            if(afterFirstCondiment) { System.out.print("\n");}
            addCondiments();
            afterFirstCondiment = true;
        }
        //Envolver el Hoagie, sandwich
        wrapTheHoagie();
    }

    public void cutBun(){
        System.out.println("The Hoagie is cut");
    }
    // Es obligatorio implementar este método
    abstract void addMeat();
    abstract void addCheese();
    abstract void addVegetables();
    abstract void addCondiments();
    // Se considera verdadero debido a que es
    // lo que más sucede. Sin embargo, se permite
    // que otras subclases la sobreescriban
    // Este es un ejemplo de Hook, o gancho.
    boolean customerWantsMeat(){ return true;}
    boolean customerWantsCheese(){ return true;}
    boolean customerWantsVegetables(){ return true;}
    boolean customerWantsCondiments(){ return true;}

    public void wrapTheHoagie(){
        System.out.println("\nWrap the Hoagie");
    }
}
