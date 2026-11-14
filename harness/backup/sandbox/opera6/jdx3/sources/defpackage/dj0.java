package defpackage;

/* loaded from: classes.dex */
public final class dj0 implements yc0 {
    public static final dj0 b = new dj0(0);
    public static final dj0 c = new dj0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public dj0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
