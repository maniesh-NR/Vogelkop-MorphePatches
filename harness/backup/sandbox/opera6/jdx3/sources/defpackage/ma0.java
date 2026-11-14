package defpackage;

/* loaded from: classes.dex */
public final class ma0 implements yc0 {
    public static final ma0 b = new ma0(0);
    public static final ma0 c = new ma0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public ma0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
