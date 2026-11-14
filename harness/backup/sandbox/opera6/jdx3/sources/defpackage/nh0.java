package defpackage;

/* loaded from: classes.dex */
public final class nh0 implements yc0 {
    public static final nh0 b = new nh0(0);
    public static final nh0 c = new nh0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public nh0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
