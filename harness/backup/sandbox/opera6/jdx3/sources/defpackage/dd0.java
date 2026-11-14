package defpackage;

/* loaded from: classes.dex */
public final class dd0 implements yc0 {
    public static final dd0 b = new dd0(0);
    public static final dd0 c = new dd0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public dd0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
