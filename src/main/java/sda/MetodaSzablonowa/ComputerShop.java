package sda.MetodaSzablonowa;

import java.util.function.Supplier;

public class ComputerShop {

    public static void main(String[] args) {

        Supplier<Computer> makeComputer = () -> {
            ComputerMaker computerMaker = new BasicComputer();
            return computerMaker.buildComputer();
        };
        Computer computer = makeComputer.get();

    }
}
