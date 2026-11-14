package defpackage;

/* loaded from: classes.dex */
public final class rh0 implements yc0 {
    public static final rh0 b = new rh0(0);
    public static final rh0 c = new rh0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public rh0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
