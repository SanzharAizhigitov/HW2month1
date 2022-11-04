package org.example;

public class Tree extends Plant{
    private TypeOfLeaves typeOfLeaves;

    public TypeOfLeaves getTypeOfLeaves() {
        return typeOfLeaves;
    }

    public Tree(int age, TypeOfLeaves typeOfLeaves) {
        super(age);
        this.typeOfLeaves = typeOfLeaves;
    }
    public final void fallOff(){
        System.out.println("The leaves may have fallen off");
    }
    public void fallOff(TypeOfLeaves typeOfLeaves){
        if (typeOfLeaves == TypeOfLeaves.CONIFEROUS){
            System.out.println("Needles do not fall off");
        }
        else {
            System.out.println("The leaves have fallen");
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Type of leaves: " + getTypeOfLeaves());
    }
}
