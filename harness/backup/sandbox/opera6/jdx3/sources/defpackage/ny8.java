package defpackage;

import org.json.JSONException;

/* loaded from: classes.dex */
public final class ny8 extends my8 {
    public final String h;

    public ny8(orb orbVar) {
        super(orbVar, "publisher_impression");
        this.h = orbVar.m("following", null);
    }

    @Override // defpackage.my8, defpackage.dy8
    public final void a(orb orbVar) throws JSONException {
        super.a(orbVar);
        String str = this.h;
        if (str != null) {
            orbVar.p(str, "following");
        }
    }
}
