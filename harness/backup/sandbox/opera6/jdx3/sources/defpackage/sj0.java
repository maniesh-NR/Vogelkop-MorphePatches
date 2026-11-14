package defpackage;

/* loaded from: classes.dex */
public final class sj0 implements yc0 {
    public static final sj0 b = new sj0(0);
    public static final sj0 c = new sj0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public sj0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
