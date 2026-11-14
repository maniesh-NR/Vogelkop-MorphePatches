package defpackage;

/* loaded from: classes.dex */
public final class xk0 implements yc0 {
    public static final xk0 b = new xk0(0);
    public static final xk0 c = new xk0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public xk0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
