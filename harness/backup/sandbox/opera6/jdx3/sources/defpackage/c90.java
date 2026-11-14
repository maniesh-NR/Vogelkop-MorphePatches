package defpackage;

/* loaded from: classes.dex */
public final class c90 implements yc0 {
    public static final c90 b = new c90(0);
    public static final c90 c = new c90(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public c90(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
