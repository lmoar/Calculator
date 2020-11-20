public enum Roman {

    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7),
    VIII(8), IX(9), X(10), XX(20), XXX(30), XL(40), L(50), LX(60),
    LXX(70), LXXX(80), CX(90), C(100);

    private int toArabic;

    Roman(int toArabic) {

        this.toArabic = toArabic;

    }

    public int getToArabic() {

        return toArabic;

    }

    public static int getNum(String x) {

        Roman roman = Roman.valueOf(x);
        return roman.getToArabic();

    }

    public static boolean check (String x) {

        for (Roman c : Roman.values()) {
            if (c.name().equals(x)) {
                return true;
            }

        }

        return false;

    }

     public static Roman checkRom(int x) {
        for (Roman b : Roman.values()) {
            if (b.toArabic == x) {

                return b;

            }

        }

        return null;

    }

}