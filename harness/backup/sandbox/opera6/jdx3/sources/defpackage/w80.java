package defpackage;

/* loaded from: classes.dex */
public final class w80 implements yc0 {
    public static final w80 b = new w80(0);
    public static final w80 c = new w80(1);
    public static final w80 d = new w80(2);
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public w80(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a;
    }
}
