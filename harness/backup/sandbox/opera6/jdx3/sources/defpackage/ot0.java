package defpackage;

/* loaded from: classes.dex */
public final class ot0 implements yc0 {
    public static final ot0 b = new ot0(0);
    public static final ot0 c = new ot0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public ot0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
