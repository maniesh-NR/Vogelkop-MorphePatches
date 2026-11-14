package defpackage;

/* loaded from: classes.dex */
public final class od0 implements yc0 {
    public static final od0 b = new od0(0);
    public static final od0 c = new od0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public od0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
