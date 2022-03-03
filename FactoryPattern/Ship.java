package FactoryPattern;

public class Ship implements Transportation{
    @Override
    public void deliver(){
        System.out.println("Ship has done the sea deliver mission");
    }
}
