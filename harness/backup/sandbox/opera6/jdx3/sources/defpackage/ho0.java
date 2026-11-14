package defpackage;

/* loaded from: classes.dex */
public final class ho0 implements yc0 {
    public static final ho0 b = new ho0(0);
    public static final ho0 c = new ho0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public ho0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
