package defpackage;

/* loaded from: classes.dex */
public final class i70 implements yc0 {
    public static final i70 b = new i70(0);
    public static final i70 c = new i70(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public i70(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
