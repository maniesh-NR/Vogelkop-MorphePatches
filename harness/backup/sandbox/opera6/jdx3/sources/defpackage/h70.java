package defpackage;

/* loaded from: classes.dex */
public final class h70 implements yc0 {
    public static final h70 b = new h70(0);
    public static final h70 c = new h70(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public h70(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
