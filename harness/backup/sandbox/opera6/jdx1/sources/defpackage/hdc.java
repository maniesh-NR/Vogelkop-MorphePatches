package defpackage;

/* loaded from: classes.dex */
public abstract /* synthetic */ class hdc {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[occ.values().length];
        try {
            iArr[occ.ON_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[occ.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[occ.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[occ.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
