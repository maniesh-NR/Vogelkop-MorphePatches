package defpackage;

/* loaded from: classes.dex */
public final class aa0 implements yc0 {
    public static final aa0 b = new aa0(0);
    public static final aa0 c = new aa0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public aa0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
