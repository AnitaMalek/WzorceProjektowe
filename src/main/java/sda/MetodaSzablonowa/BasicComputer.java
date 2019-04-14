package sda.MetodaSzablonowa;

public class BasicComputer extends ComputerMaker{


    @Override
    public String setComputerName() {
        return "BASIC COMPUTER. ";
    }

    @Override
    public String chooseProcessor() {
        return "Dual core 2.4 GHz+ (i5)";
    }

    @Override
    public Integer chooseRam() {
        return 2;
    }

    @Override
    public String chooseTypeOfDisc() {
        return "SSD Disc";
    }

    @Override
    public Integer chooseDiskSpace() {
        return 256;
    }

    @Override
    public String chooseGraphicCard() {
       return "With DisplayPort/HDMI or DVI support";
    }

    @Override
    public String chooseOperationSystem() {
        return "Windows 10 Home";
    }


}
