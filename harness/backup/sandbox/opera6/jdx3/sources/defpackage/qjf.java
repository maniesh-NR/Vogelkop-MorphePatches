package defpackage;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class qjf extends lz3 {
    public final tjf f;

    public qjf(ViewGroup viewGroup, tjf tjfVar) {
        super(tjfVar.c.u() != null ? 2132084195 : 2132084194, viewGroup, tjfVar.h(), new kqd((Object) tjfVar, (byte) 18), new l11(tjfVar.a, 1, tjfVar.b(), 0, tjfVar.g(), tjfVar.e()), tjfVar.d(), tjfVar instanceof kr2);
        this.f = tjfVar;
        a(new pjf(this));
    }

    @Override // defpackage.lz3
    public final boolean e(boolean z) {
        if (z && this.f.f()) {
            return false;
        }
        return super.e(z);
    }
}
