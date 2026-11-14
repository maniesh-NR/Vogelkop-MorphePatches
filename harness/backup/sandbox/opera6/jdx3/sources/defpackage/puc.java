package defpackage;

/* loaded from: classes.dex */
public enum puc implements xeb {
    LOCAL_ESIM_USER_PLAN_STATE_UNSPECIFIED(0),
    LOCAL_ESIM_USER_PLAN_STATE_HAS_PLANS(1),
    LOCAL_ESIM_USER_PLAN_STATE_NO_PLANS(2),
    UNRECOGNIZED(-1);

    public final int a;

    puc(int i) {
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
