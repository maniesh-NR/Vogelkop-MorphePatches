package defpackage;

/* loaded from: classes.dex */
public final class bh7 {
    public static final bh7 b = new bh7(1);
    public static final bh7 c;
    public static final bh7 d;
    public static final mrf e;
    public static final boolean f;
    public final /* synthetic */ byte a;

    static {
        bh7 bh7Var = new bh7((byte) 0);
        c = new bh7((byte) 2);
        d = bh7Var;
        e = mrf.a(bh7Var, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        f = true;
    }

    public /* synthetic */ bh7(byte b2) {
        this.a = b2;
    }

    public final float a(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                return Math.max(i3 / i, i4 / i2);
            case 1:
                if (f) {
                    return Math.min(i3 / i, i4 / i2);
                }
                if (Math.max(i2 / i4, i / i3) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r0);
            default:
                return 1.0f;
        }
    }
}
