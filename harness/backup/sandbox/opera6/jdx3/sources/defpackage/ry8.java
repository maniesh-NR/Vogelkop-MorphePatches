package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ry8 extends zx8 {
    public final long m;
    public final long n;
    public final float o;

    public ry8(msh mshVar, long j, long j2, float f) {
        super(mshVar, "stay", null);
        this.m = j;
        this.n = j2;
        this.o = f;
    }

    public ry8(orb orbVar) {
        super(orbVar, "stay");
        JSONObject jSONObject = orbVar.a;
        this.m = jSONObject.getLong("start_ts");
        this.n = jSONObject.getLong("duration");
        this.o = (float) jSONObject.getDouble("percent");
    }

    @Override // defpackage.zx8, defpackage.dy8
    public final void a(orb orbVar) throws JSONException {
        super.a(orbVar);
        orbVar.o(this.m, "start_ts");
        orbVar.o(this.n, "duration");
        orbVar.q("percent", this.o);
    }
}
