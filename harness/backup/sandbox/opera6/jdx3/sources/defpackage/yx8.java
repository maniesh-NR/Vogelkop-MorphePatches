package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class yx8 extends dy8 {
    public final long c;
    public final long d;

    public yx8(long j, long j2) {
        super("app_stay");
        this.c = j;
        this.d = j2;
    }

    public yx8(orb orbVar) {
        super(orbVar, "app_stay");
        JSONObject jSONObject = orbVar.a;
        this.c = jSONObject.getLong("start_ts");
        this.d = jSONObject.getLong("duration");
    }

    @Override // defpackage.dy8
    public final void a(orb orbVar) throws JSONException {
        super.a(orbVar);
        orbVar.o(this.c, "start_ts");
        orbVar.o(this.d, "duration");
    }
}
