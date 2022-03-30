package core.basesyntax;

public class Lottery {
    public Ball getRandomBall() {
        Ball randomBall = new Ball();
        ColorSupplier colorSupplier = new ColorSupplier();
        randomBall.setColor(colorSupplier.getRandomColor());
        randomBall.setNumber(Application.getRandom().nextInt(Application.MAX_NUMBER_OF_BALL));
        return randomBall;
    }
}
