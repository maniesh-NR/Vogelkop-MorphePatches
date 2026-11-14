package defpackage;

/* loaded from: classes.dex */
public final class ub0 implements yc0 {
    public static final ub0 b = new ub0(0);
    public static final ub0 c = new ub0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public ub0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
