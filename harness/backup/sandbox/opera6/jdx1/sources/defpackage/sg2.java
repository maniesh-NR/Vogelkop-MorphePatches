package defpackage;

/* loaded from: classes.dex */
public final class sg2 extends Exception {
    public final int a;
    public final boolean b;

    public sg2(int i, boolean z) {
        super(sko.i(i, "AudioOutput write failed: "));
        this.b = z;
        this.a = i;
    }
}
