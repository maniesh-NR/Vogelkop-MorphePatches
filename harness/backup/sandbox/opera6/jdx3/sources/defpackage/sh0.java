package defpackage;

/* loaded from: classes.dex */
public final class sh0 implements yc0 {
    public static final sh0 b = new sh0(0);
    public static final sh0 c = new sh0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public sh0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
