package defpackage;

/* loaded from: classes.dex */
public abstract class n5i {
    public static final hp7 a = new hp7(new gzh((byte) 2), (byte) 0);
    public static final p5i b;
    public static final p5i c;

    static {
        long j = u95.g;
        b = new p5i(j, Float.NaN, true);
        c = new p5i(j, Float.NaN, false);
    }

    public static p5i a(int i, float f, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        long j = u95.g;
        return (gh7.b(f, Float.NaN) && jgm.a(j, j)) ? z ? b : c : new p5i(j, f, z);
    }
}
