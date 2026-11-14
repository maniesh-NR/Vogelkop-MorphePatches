package defpackage;

/* loaded from: classes.dex */
public final class b80 implements yc0 {
    public static final b80 b = new b80(0);
    public static final b80 c = new b80(1);
    public static final b80 d = new b80(2);
    public static final b80 e = new b80(3);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public b80(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a;
    }
}
