package defpackage;

/* loaded from: classes.dex */
public final class mc0 implements yc0 {
    public static final mc0 b = new mc0(0);
    public static final mc0 c = new mc0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public mc0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
