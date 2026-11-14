package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class j1h implements ndc {
    public static final j1h h = new j1h();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final qdc f = new qdc(this, true);
    public final pjg g = new pjg(this, (byte) 11);

    @Override // defpackage.ndc
    public final tcc getLifecycle() {
        return this.f;
    }
}
