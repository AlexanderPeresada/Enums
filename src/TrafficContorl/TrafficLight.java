package TrafficContorl;

public class TrafficLight {
    public enum Color {
        RED("стояти"),
        YELLOW("приготуватися"),
        GREEN("рухатися");

        private final String description;

        Color(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    protected Color currentColor;

    public TrafficLight() {
        this.currentColor = Color.RED;
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public void switchToNextColor() {
        switch (currentColor) {
            case RED:
                currentColor = Color.YELLOW;
                break;
            case YELLOW:
                currentColor = Color.GREEN;
                break;
            case GREEN:
                currentColor = Color.RED;
                break;
        }
    }
}
