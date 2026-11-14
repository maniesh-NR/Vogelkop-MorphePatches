package defpackage;

/* loaded from: classes.dex */
public final class wd9 implements p9i {
    public static final wd9 a = new wd9();

    public final c8e a(float f, boolean z) {
        if (f <= 0.0d) {
            y7b.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return new g4c(f, true);
    }
}
