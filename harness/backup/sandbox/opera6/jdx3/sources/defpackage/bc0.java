package defpackage;

/* loaded from: classes.dex */
public final class bc0 implements yc0 {
    public static final bc0 b = new bc0(0);
    public static final bc0 c = new bc0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public bc0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
