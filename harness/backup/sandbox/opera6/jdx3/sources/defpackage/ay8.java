package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ay8 extends dy8 {
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final String h;
    public final long i;
    public final String j;
    public final String k;
    public final String l;

    public ay8(long j, long j2, String str, long j3, String str2, String str3, String str4) {
        super("post_action");
        this.c = str;
        this.d = "podcast_float";
        this.e = j;
        this.f = j2;
        this.g = "click";
        this.h = "podcast";
        this.i = j3;
        this.j = str2;
        this.k = str3;
        this.l = str4;
    }

    public ay8(orb orbVar, String str) {
        super(orbVar, "post_action");
        this.c = str;
        this.d = orbVar.e("action_source");
        JSONObject jSONObject = orbVar.a;
        this.e = jSONObject.getLong("action_time");
        this.f = jSONObject.getLong("duration");
        this.g = orbVar.e("play_mode");
        this.h = orbVar.e("play_style");
        this.i = jSONObject.getLong("player_time");
        this.j = orbVar.e("news_entry_id");
        this.k = orbVar.e("news_type");
        this.l = orbVar.e("request_id");
    }

    @Override // defpackage.dy8
    public final void a(orb orbVar) throws JSONException {
        super.a(orbVar);
        orbVar.p(this.c, "action");
        orbVar.p(this.d, "action_source");
        orbVar.o(this.e, "action_time");
        orbVar.o(this.f, "duration");
        orbVar.p(this.g, "play_mode");
        orbVar.p(this.h, "play_style");
        orbVar.o(this.i, "player_time");
        orbVar.p(this.j, "news_entry_id");
        orbVar.p(this.k, "news_type");
        orbVar.p(this.l, "request_id");
    }
}
