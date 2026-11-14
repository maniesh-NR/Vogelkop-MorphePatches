package defpackage;

/* loaded from: classes.dex */
public final class d80 implements yc0 {
    public static final d80 b = new d80(0);
    public static final d80 c = new d80(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public d80(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
