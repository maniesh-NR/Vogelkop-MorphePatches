package defpackage;

/* loaded from: classes.dex */
public final class lo0 implements yc0 {
    public static final lo0 b = new lo0(0);
    public static final lo0 c = new lo0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public lo0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
