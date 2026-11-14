package defpackage;

/* loaded from: classes.dex */
public final class zol extends tx7 {
    public final xol e;
    public boolean f;

    public zol(xol xolVar) {
        this.e = xolVar;
    }

    public final int f(int i) {
        if (this.f) {
            return 2;
        }
        switch (((wol) this.e.G(i)).ordinal()) {
            case 0:
            case 1:
            case 2:
                return 2;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
            case 11:
                return 1;
            default:
                h9o.p();
                return 0;
        }
    }
}
