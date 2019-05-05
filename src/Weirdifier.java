import java.util.Random;

public class Weirdifier {

    int weirdnessLevel;
    Random random = new Random();

    public void setRandomSprite(Feature feature) {
        int listLength = feature.getSpriteList().size();
        feature.randomizeSpriteRange(listLength * (weirdnessLevel/5), listLength/2 * (weirdnessLevel/10));
    }

    public void setRandomSize(Feature feature) {
        feature.randomizeSizeRange(50 - (weirdnessLevel * 5), 50 + (weirdnessLevel * 5));
    }
}
