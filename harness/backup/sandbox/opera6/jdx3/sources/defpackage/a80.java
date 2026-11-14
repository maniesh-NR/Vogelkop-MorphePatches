package defpackage;

/* loaded from: classes.dex */
public final class a80 implements yc0 {
    public static final a80 b = new a80(0);
    public static final a80 c = new a80(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public a80(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
