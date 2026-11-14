package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class gu6 extends sxf {
    public static final c67 G = rm5.H(new tb6((byte) 23), new ah5((byte) 27));
    public final t0g F;

    public gu6(int i, float f, Function0 function0) {
        super(i, f);
        this.F = hyg.k(function0);
    }

    @Override // defpackage.sxf
    public final int n() {
        return ((Number) ((Function0) this.F.getValue()).invoke()).intValue();
    }
}
