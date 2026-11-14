package defpackage;

/* loaded from: classes.dex */
public final class ul0 implements yc0 {
    public static final ul0 b = new ul0(0);
    public static final ul0 c = new ul0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public ul0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
