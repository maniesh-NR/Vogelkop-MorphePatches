package defpackage;

/* loaded from: classes.dex */
public final class km0 implements yc0 {
    public static final km0 b = new km0(0);
    public static final km0 c = new km0(1);
    public final boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    public km0(int i) {
        this.a = i;
    }

    @Override // defpackage.yc0
    public final int getValue() {
        return this.a ? 1 : 0;
    }
}
