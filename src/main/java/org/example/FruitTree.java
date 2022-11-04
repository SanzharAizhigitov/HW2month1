package org.example;

public final class FruitTree extends Tree {
    private int numberOfFruits;

    public int getNumberOfFruits() {
        return numberOfFruits;
    }

    public FruitTree(int age, int numberOfFruits) {
        super(age, TypeOfLeaves.DECIDUOUS );
        this.numberOfFruits = numberOfFruits;
    }

    @Override
    public void fallOff(TypeOfLeaves typeOfLeaves) {
        if (typeOfLeaves == TypeOfLeaves.CONIFEROUS){
            System.out.println("Fruit trees are not coniferous");
        }else {
        System.out.println("The leaves have fallen");}
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Number of fruits: " + getNumberOfFruits());
    }
}

