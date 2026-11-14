package defpackage;

import android.util.Rational;
import android.util.Size;

/* loaded from: classes.dex */
public abstract class ua2 {
    public static final Rational a = new Rational(4, 3);
    public static final Rational b = new Rational(3, 4);
    public static final Rational c = new Rational(16, 9);
    public static final Rational d = new Rational(9, 16);

    public static boolean a(Size size, Rational rational, Size size2) {
        if (rational == null) {
            return false;
        }
        if (rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            return true;
        }
        Size size3 = qpj.a;
        if (size.getHeight() * size.getWidth() >= qpj.a(size2)) {
            int width = size.getWidth();
            int height = size.getHeight();
            Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
            if (width % 16 == 0) {
                if (height % 16 != 0) {
                    return b(height, width, rational);
                }
                if (b(Math.max(0, height - 16), width, rational) || b(Math.max(0, width - 16), height, rational2)) {
                    return true;
                }
            } else if (height % 16 == 0) {
                return b(width, height, rational2);
            }
        }
        return false;
    }

    public static boolean b(int i, int i2, Rational rational) {
        jpo.j(i2 % 16 == 0);
        double numerator = (rational.getNumerator() * i) / rational.getDenominator();
        return numerator > ((double) Math.max(0, i2 + (-16))) && numerator < ((double) (i2 + 16));
    }
}
