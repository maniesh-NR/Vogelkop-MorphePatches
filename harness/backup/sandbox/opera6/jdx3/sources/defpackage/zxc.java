package defpackage;

/* loaded from: classes.dex */
public enum zxc implements xeb {
    LOCATION_MODE_UNSPECIFIED(0),
    LOCATION_MODE_AUTO(1),
    LOCATION_MODE_MANUAL(2),
    UNRECOGNIZED(-1);

    public final int a;

    zxc(int i) {
        this.a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        qp2.o("Can't get the number of an unknown enum value.");
        return 0;
    }
}
