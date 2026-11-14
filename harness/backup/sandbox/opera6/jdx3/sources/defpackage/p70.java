package defpackage;

/* loaded from: classes.dex */
public final class p70 implements yc0 {
    public static final p70 b = new p70(0);
    public static final p70 c = new p70(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public p70(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
