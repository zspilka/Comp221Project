public class Weirdifier {

    int weirdnessLevel;

    public void setRandomSprite(Feature feature) {
        int listLength = feature.getSpriteList().size();
        int minLimit;
        int maxLimit;
        if ((listLength/2) * (weirdnessLevel/10) >= 0) {
            minLimit = (listLength / 2) * (weirdnessLevel / 10);
        } else {
            minLimit = 0;
        }
        if ((listLength/2) + (listLength/2 * (weirdnessLevel/10)) - 1 >= listLength/2) {
            maxLimit = listLength/2 + (listLength/2 * (weirdnessLevel/10) - 1);
        } else {
            maxLimit = listLength/2;
        }
        feature.randomizeSpriteRange(minLimit, maxLimit);
    }

    public void setRandomSize(Feature feature) {
        feature.randomizeSizeRange(30 - (weirdnessLevel * 3),
                50 + (weirdnessLevel * 3));
    }

    public void setWeirdnessLevel(int weirdnessLevel) {
        if (weirdnessLevel >= 0 && weirdnessLevel <=10) {
            this.weirdnessLevel = weirdnessLevel;
        }
    }
}
