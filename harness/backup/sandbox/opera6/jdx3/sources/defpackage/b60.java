package defpackage;

/* loaded from: classes.dex */
public final class b60 implements yc0 {
    public static final b60 b = new b60(0);
    public static final b60 c = new b60(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public b60(int i) {
        this.a = i;
    }

    public static final b60 a(int i) {
        if (i == 0) {
            return b;
        }
        if (i == 1) {
            return c;
        }
        hai.d();
        return null;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
