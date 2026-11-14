package defpackage;

/* loaded from: classes.dex */
public final class fq0 implements yc0 {
    public static final fq0 b = new fq0(0);
    public static final fq0 c = new fq0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public fq0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
