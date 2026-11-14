package defpackage;

/* loaded from: classes.dex */
public final class et0 implements yc0 {
    public static final et0 b = new et0(0);
    public static final et0 c = new et0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public et0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
