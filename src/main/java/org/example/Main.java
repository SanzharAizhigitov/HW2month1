package org.example;

public class Main {
    public static void main(String[] args) {
        Tree objectA = new Tree(50, TypeOfLeaves.CONIFEROUS);
        FruitTree objectB = new FruitTree(60,  13);
        FruitTree objectC = new FruitTree(67,  13);
        objectA.fallOff();
        objectA.fallOff(TypeOfLeaves.CONIFEROUS);
        objectA.fallOff(TypeOfLeaves.DECIDUOUS);
        objectB.fallOff();
        objectB.fallOff(TypeOfLeaves.CONIFEROUS);
        objectB.fallOff(TypeOfLeaves.DECIDUOUS);
        objectC.fallOff();
        objectC.fallOff(TypeOfLeaves.CONIFEROUS);
        objectC.fallOff(TypeOfLeaves.DECIDUOUS);
    }
}