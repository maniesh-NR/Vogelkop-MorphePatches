package defpackage;

/* loaded from: classes.dex */
public final class ln0 implements yc0 {
    public static final ln0 b = new ln0(0);
    public static final ln0 c = new ln0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public ln0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
