package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class il {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final o1 f;

    public il(int i, int i2, int i3, int i4, boolean z, o1 o1Var) {
        this.a = i < 1 ? Integer.MAX_VALUE : i;
        this.b = i2;
        this.c = Math.max(i3, 0);
        this.d = Math.max(i4, 0);
        this.e = z;
        this.f = o1Var;
    }

    public static il a(orb orbVar) {
        JSONObject jSONObject = orbVar.a;
        return new il(jSONObject.optInt("requestWindowSize", Integer.MAX_VALUE), jSONObject.optInt("maxBlockCost", Integer.MAX_VALUE), jSONObject.optInt("initialMinCacheSize", 0), jSONObject.optInt("newsConsumerMinCacheSize", 0), jSONObject.optBoolean("fbOnlyCtaClickable", false), jSONObject.has("premiumBackfillPid") ? new o1(orbVar.m("premiumBackfillPid", ""), jSONObject.optInt("maxCountPerDayForPremiumBackfill", Integer.MAX_VALUE), jSONObject.optInt("minIntervalInMinutesForPremiumBackfill", 0), (byte) 1) : null);
    }
}
