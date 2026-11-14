package defpackage;

/* loaded from: classes.dex */
public final class cp0 implements yc0 {
    public static final cp0 b = new cp0(0);
    public static final cp0 c = new cp0(1);
    public static final cp0 d = new cp0(2);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public cp0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a;
    }
}
