package defpackage;

/* loaded from: classes.dex */
public final class kh2 extends Exception {
    public final boolean a;

    /* JADX WARN: Illegal instructions before constructor call */
    public kh2(int i, int i2, int i3, int i4, oj9 oj9Var, boolean z, wg2 wg2Var) {
        StringBuilder sbO = sko.o(i, i2, "AudioTrack init failed 0 Config(", ", ", ", ");
        sko.r(i3, i4, ", ", ") ", sbO);
        sbO.append(oj9Var);
        sbO.append(z ? " (recoverable)" : "");
        super(sbO.toString(), wg2Var);
        this.a = z;
    }
}
