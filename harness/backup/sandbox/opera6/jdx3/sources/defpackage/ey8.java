package defpackage;

import android.os.SystemClock;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ey8 extends zx8 {
    public final long m;
    public double n;

    public ey8(msh mshVar) {
        super(mshVar, "impression", null);
        this.n = -1.0d;
        this.m = SystemClock.uptimeMillis();
    }

    public ey8(orb orbVar) {
        super(orbVar, "impression");
        this.n = -1.0d;
        JSONObject jSONObject = orbVar.a;
        this.m = jSONObject.optLong("start_uptime", -1L);
        this.n = jSONObject.optDouble("duration", -1.0d);
    }

    @Override // defpackage.zx8, defpackage.dy8
    public final void a(orb orbVar) throws JSONException {
        super.a(orbVar);
        orbVar.o(this.m, "start_uptime");
        double d = this.n;
        if (d >= 0.0d) {
            orbVar.q("duration", d);
        }
    }
}
