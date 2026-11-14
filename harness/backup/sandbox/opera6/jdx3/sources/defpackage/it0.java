package defpackage;

/* loaded from: classes.dex */
public final class it0 implements yc0 {
    public static final it0 b = new it0(0);
    public static final it0 c = new it0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public it0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
