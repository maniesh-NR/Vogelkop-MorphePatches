package defpackage;

/* loaded from: classes.dex */
public final class j70 implements yc0 {
    public static final j70 b = new j70(0);
    public static final j70 c = new j70(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public j70(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
