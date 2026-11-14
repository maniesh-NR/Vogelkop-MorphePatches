package defpackage;

/* loaded from: classes.dex */
public final class x80 implements yc0 {
    public static final x80 b = new x80(0);
    public static final x80 c = new x80(1);
    public static final x80 d = new x80(2);
    public static final x80 e = new x80(3);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public x80(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a;
    }
}
