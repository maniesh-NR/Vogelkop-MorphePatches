package defpackage;

import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class r43 extends p43 {
    @Override // defpackage.p43
    public final void f(pzh pzhVar) {
        try {
            g(new orb(pzhVar.g.string()));
        } catch (JSONException unused) {
            a(new q43(-1, "JSON exception"));
        }
    }

    public abstract void g(orb orbVar);
}
