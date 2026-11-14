package defpackage;

/* loaded from: classes.dex */
public final class ne0 implements yc0 {
    public static final ne0 b = new ne0(0);
    public static final ne0 c = new ne0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public ne0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
