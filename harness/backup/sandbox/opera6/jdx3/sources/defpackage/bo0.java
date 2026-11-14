package defpackage;

/* loaded from: classes.dex */
public final class bo0 implements yc0 {
    public static final bo0 b = new bo0(0);
    public static final bo0 c = new bo0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public bo0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
