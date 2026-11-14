package defpackage;

/* loaded from: classes.dex */
public final class jo0 implements yc0 {
    public static final jo0 b = new jo0(0);
    public static final jo0 c = new jo0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public jo0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
