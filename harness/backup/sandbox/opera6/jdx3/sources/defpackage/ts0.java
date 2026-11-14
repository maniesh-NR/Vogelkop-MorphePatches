package defpackage;

/* loaded from: classes.dex */
public final class ts0 implements yc0 {
    public static final ts0 b = new ts0(0);
    public static final ts0 c = new ts0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public ts0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
