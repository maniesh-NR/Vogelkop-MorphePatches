package defpackage;

/* loaded from: classes.dex */
public enum uvg {
    NONE(0),
    PENDING(1),
    ACTIVE(2),
    EXPIRED(3),
    PAUSED(4),
    LOADING(5);

    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    uvg(int i) {
        this.a = i;
    }

    public static uvg d(wvg wvgVar) {
        int i = wvgVar.e;
        return i != 0 ? i != 2 ? (i == 3 || i == 4) ? ACTIVE : i != 5 ? i != 6 ? NONE : EXPIRED : PAUSED : PENDING : LOADING;
    }
}
