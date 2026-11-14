package defpackage;

/* loaded from: classes.dex */
public final class i80 implements yc0 {
    public static final i80 b = new i80(0);
    public static final i80 c = new i80(1);
    public static final i80 d = new i80(2);
    public static final i80 e = new i80(3);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public i80(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a;
    }
}
