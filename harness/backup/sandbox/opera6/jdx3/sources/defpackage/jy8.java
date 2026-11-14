package defpackage;

import org.json.JSONException;

/* loaded from: classes.dex */
public final class jy8 extends ty8 {
    public final String o;
    public final String p;
    public final int q;

    public jy8(orb orbVar) {
        super(orbVar, "play");
        this.o = orbVar.e("play_mode");
        this.p = orbVar.m("fail_info", null);
        this.q = orbVar.g("duration");
    }

    @Override // defpackage.ty8, defpackage.zx8, defpackage.dy8
    public final void a(orb orbVar) throws JSONException {
        super.a(orbVar);
        orbVar.p(this.o, "play_mode");
        String str = this.p;
        if (str != null) {
            orbVar.p(str, "fail_info");
        }
        orbVar.n(this.q, "duration");
    }
}
