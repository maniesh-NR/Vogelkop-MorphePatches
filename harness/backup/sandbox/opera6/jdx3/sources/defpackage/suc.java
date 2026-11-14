package defpackage;

/* loaded from: classes.dex */
public enum suc implements xeb {
    LOCAL_FREE_ESIM_ELIGIBILITY_UNSPECIFIED(0),
    LOCAL_FREE_ESIM_ELIGIBILITY_NOT_COVERED(1),
    LOCAL_FREE_ESIM_ELIGIBILITY_ELIGIBLE(2),
    LOCAL_FREE_ESIM_ELIGIBILITY_ALREADY_CLAIMED(3),
    UNRECOGNIZED(-1);

    public final int a;

    suc(int i) {
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
