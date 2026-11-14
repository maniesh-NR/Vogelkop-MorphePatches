package defpackage;

/* loaded from: classes.dex */
public final class q9i implements p9i {
    public static final q9i a = new q9i();

    public final c8e a(float f, boolean z) {
        if (f <= 0.0d) {
            y7b.a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return new g4c(f, z);
    }
}
