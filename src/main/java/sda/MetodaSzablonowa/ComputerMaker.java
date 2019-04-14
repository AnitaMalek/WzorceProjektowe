package sda.MetodaSzablonowa;

public abstract class ComputerMaker{


    public final Computer buildComputer() {
        Computer computer = new Computer();
        setComputerName();
        chooseProcessor();
        chooseRam();
        chooseTypeOfDisc();
        chooseDiskSpace();
        chooseGraphicCard();
        chooseOperationSystem();
        return computer;
}

    public abstract String setComputerName();

    public abstract String chooseProcessor();

    public abstract Integer chooseRam();

    public abstract String chooseTypeOfDisc();

    public abstract Integer chooseDiskSpace();

    public abstract String chooseGraphicCard();

    public abstract String chooseOperationSystem();

}
