package defpackage;

import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class ty8 extends zx8 {
    public final int m;
    public final String n;

    public ty8(orb orbVar, String str) {
        super(orbVar, str);
        this.m = orbVar.a.getInt("player_time");
        this.n = orbVar.m("publisher_id", null);
    }

    @Override // defpackage.zx8, defpackage.dy8
    public void a(orb orbVar) throws JSONException {
        super.a(orbVar);
        orbVar.n(this.m, "player_time");
        String str = this.n;
        if (str != null) {
            orbVar.p(str, "publisher_id");
        }
    }
}
