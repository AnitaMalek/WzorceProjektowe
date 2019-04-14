package sda.MetodaSzablonowa;



public class PlayersComputer extends ComputerMaker {

    @Override
    public String setComputerName() {
        return "COMPUTER FOR PLAYERS. ";
    }

    @Override
    public String chooseProcessor() {
        return "i9";
    }

    @Override
    public Integer chooseRam() {
        return 16;
    }

    @Override
    public String chooseTypeOfDisc() {
        return "SSD Disc";
    }

    @Override
    public Integer chooseDiskSpace() {
        return 500;
    }

    @Override
    public String chooseGraphicCard() {
        return "Super extra graphic card";
    }

    @Override
    public String chooseOperationSystem() {
        return "Linux";
    }
}
