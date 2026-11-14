package defpackage;

import org.json.JSONException;

/* loaded from: classes.dex */
public final class htg extends h83 {
    public final db A;

    public htg(nvg nvgVar, db dbVar) {
        super(nvgVar, 2132021684, 2132017269);
        this.A = dbVar;
    }

    @Override // defpackage.i83
    public final void I0() throws JSONException {
        p8f p8fVar = this.z.c;
        lvg lvgVar = new lvg(3, 6);
        mvg mvgVarT = p8fVar.t();
        if (mvgVarT != null) {
            mvgVarT.f.add(lvgVar);
            p8fVar.G(mvgVarT);
        }
        xih.w(requireActivity().getSupportFragmentManager(), this.A, null, false);
    }

    @Override // defpackage.jbl
    public final String y() {
        return "base-account-onboarding-fragment";
    }
}
