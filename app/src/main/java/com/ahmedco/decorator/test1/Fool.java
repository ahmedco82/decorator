package com.ahmedco.decorator.test1;

public class Fool extends SandwichDecorator {

    public Fool(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public double getCost(){
        return super.getCost() + 3;
    }
    @Override
    public String getDescription(){
        return super.getDescription() + ", Fool";
    }
}
