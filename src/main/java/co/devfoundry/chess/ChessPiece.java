package co.devfoundry.chess;

public abstract class ChessPiece {
    String name;
    String numberPosition;
    String letterPosition;
    Color color;

    public ChessPiece(String name, String numberPosition, String letterPosition, String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        if ("black".equals(color.toLowerCase())) {
            this.color = ColorRepository.getBlack();
        } else {
            this.color = ColorRepository.getWhite();
        }
    }

    public Color getColor() {
        return color;
    }
}
