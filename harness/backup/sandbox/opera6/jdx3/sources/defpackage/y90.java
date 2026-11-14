package defpackage;

/* loaded from: classes.dex */
public final class y90 implements yc0 {
    public static final y90 b = new y90(0);
    public static final y90 c = new y90(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public y90(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
