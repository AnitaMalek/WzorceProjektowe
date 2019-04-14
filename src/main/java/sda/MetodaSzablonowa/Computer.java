package sda.MetodaSzablonowa;

public class Computer {

    private String name;
    private String processor;
    private Integer RAM;
    private String typeOfDisc;
    private Integer discSpace;
    private String graphicCard;
    private String operationSystem;



    public void setName(String name) {
        this.name = name;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public void setTypeOfDisc(String typeOfDisc) {
        this.typeOfDisc = typeOfDisc;
    }

    public void setDiscSpace(Integer discSpace) {
        this.discSpace = discSpace;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", processor='" + processor + '\'' +
                ", RAM=" + RAM +
                ", typeOfDisc='" + typeOfDisc + '\'' +
                ", discSpace=" + discSpace +
                ", graphicCard='" + graphicCard + '\'' +
                ", operationSystem='" + operationSystem + '\'' +
                '}';
    }
}
