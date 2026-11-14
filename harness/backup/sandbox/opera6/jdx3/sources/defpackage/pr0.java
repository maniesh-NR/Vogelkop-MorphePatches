package defpackage;

/* loaded from: classes.dex */
public final class pr0 implements yc0 {
    public static final pr0 b = new pr0(0);
    public static final pr0 c = new pr0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public pr0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
