package defpackage;

/* loaded from: classes.dex */
public final class mcc {
    public static occ a(qcc qccVar) {
        int iOrdinal = qccVar.ordinal();
        if (iOrdinal == 2) {
            return occ.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return occ.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return occ.ON_PAUSE;
    }
}
