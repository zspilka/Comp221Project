public class Weirdifier {

    double weirdnessLevel = 10;
    double weirdnessBonus;

    public void setRandomSprite(Feature feature) {
        int listLength = feature.getSpriteList().size();
        weirdnessBonus = listLength/2 * (weirdnessLevel/10);
//        System.out.println((weirdnessLevel/10));
//        System.out.println("bonus is " + weirdnessBonus);
        int minLimit = 0;
        int maxLimit;
        if ((listLength/2) + weirdnessBonus - 1 > listLength/2) {
            maxLimit = (int)Math.round(listLength/2 + weirdnessBonus);
//            System.out.println("maxLimit is " + maxLimit);
        } else {
            maxLimit = listLength/2;
        }
        feature.randomizeSpriteRange(minLimit, maxLimit);
    }

    public void setRandomSize(Feature feature) {
        feature.randomizeSizeRange(30 - (int)(weirdnessLevel * 3),
                50 + (int)(weirdnessLevel * 3));
    }

    public void setWeirdnessLevel(int weirdnessLevel) {
        if (weirdnessLevel >= 0 && weirdnessLevel <=10) {
            this.weirdnessLevel = weirdnessLevel;
        }
    }

}
