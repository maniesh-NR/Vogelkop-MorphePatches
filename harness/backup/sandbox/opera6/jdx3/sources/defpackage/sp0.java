package defpackage;

/* loaded from: classes.dex */
public final class sp0 implements yc0 {
    public static final sp0 b = new sp0(0);
    public static final sp0 c = new sp0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public sp0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
