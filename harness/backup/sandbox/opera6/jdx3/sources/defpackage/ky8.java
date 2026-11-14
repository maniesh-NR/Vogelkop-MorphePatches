package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ky8 extends dy8 {
    public final long c;
    public final long d;
    public final String e;
    public final String f;

    public ky8(long j, long j2, String str, String str2) {
        super("podcast_stay");
        this.c = j;
        this.d = j2;
        this.e = str;
        this.f = str2;
    }

    public ky8(orb orbVar) {
        super(orbVar, "podcast_stay");
        JSONObject jSONObject = orbVar.a;
        this.c = jSONObject.getLong("start_ts");
        this.d = jSONObject.getLong("duration");
        this.e = orbVar.e("id");
        this.f = orbVar.e("request_id");
    }

    @Override // defpackage.dy8
    public final void a(orb orbVar) throws JSONException {
        super.a(orbVar);
        orbVar.o(this.c, "start_ts");
        orbVar.o(this.d, "duration");
        orbVar.p(this.e, "id");
        orbVar.p(this.f, "request_id");
    }
}
