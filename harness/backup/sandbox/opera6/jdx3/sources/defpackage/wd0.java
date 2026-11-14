package defpackage;

/* loaded from: classes.dex */
public final class wd0 implements yc0 {
    public static final wd0 b = new wd0(0);
    public static final wd0 c = new wd0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public wd0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
