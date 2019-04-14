package sda.MetodaSzablonowa;

public class ProgrammersComputer extends ComputerMaker {

    @Override
    public String setComputerName() {
        return "COMPUTER FOR PROGRAMMERS. ";
    }

    @Override
    public String chooseProcessor() {
        return "i7";
    }

    @Override
    public Integer chooseRam() {
        return 8;
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
        return "With DisplayPort/HDMI or DVI support";
    }

    @Override
    public String chooseOperationSystem() {
        return "Windows 10 Proffessional";
    }
}
