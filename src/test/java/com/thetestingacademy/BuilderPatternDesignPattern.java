package com.thetestingacademy;

public class BuilderPatternDesignPattern {

    public BuilderPatternDesignPattern Stag1(){
        System.out.println("Stag 1 is Done");
            return this;

    }

    public BuilderPatternDesignPattern Stag2(String parm) {
        System.out.println("Stag 2 is Done");
            return this;
    }

    public BuilderPatternDesignPattern Stag3() {
        System.out.println("Stag 3 is Done");
        return this;
    }

    public static void main(String [] args ){
        BuilderPatternDesignPattern bp = new BuilderPatternDesignPattern();
            bp.Stag1().Stag2("Shuchi").Stag3();

    }

}
