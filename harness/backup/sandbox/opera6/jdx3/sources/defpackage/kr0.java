package defpackage;

/* loaded from: classes.dex */
public final class kr0 implements yc0 {
    public static final kr0 b = new kr0(0);
    public static final kr0 c = new kr0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public kr0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
