package defpackage;

/* loaded from: classes.dex */
public final class sl0 implements yc0 {
    public static final sl0 b = new sl0(0);
    public static final sl0 c = new sl0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public sl0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
