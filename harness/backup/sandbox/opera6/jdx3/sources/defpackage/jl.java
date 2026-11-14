package defpackage;

import org.json.JSONException;

/* loaded from: classes.dex */
public final class jl extends ll {
    public static jl c(orb orbVar) throws JSONException {
        int iA = vep.a(orbVar.m("style", ""));
        String strE = orbVar.e("pid");
        orbVar.a.optInt("rotateEvery", 0);
        return new jl(iA, q50.g, strE, dl.b(orbVar), dl.a(orbVar), null);
    }
}
