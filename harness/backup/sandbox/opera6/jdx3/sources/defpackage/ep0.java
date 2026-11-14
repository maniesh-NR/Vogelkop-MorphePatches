package defpackage;

/* loaded from: classes.dex */
public final class ep0 implements yc0 {
    public static final ep0 b = new ep0(0);
    public static final ep0 c = new ep0(1);
    public static final ep0 d = new ep0(2);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public ep0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a;
    }
}
