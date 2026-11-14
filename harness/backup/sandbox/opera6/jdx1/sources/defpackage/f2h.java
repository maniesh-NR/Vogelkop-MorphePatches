package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f2h {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;

    public f2h(JSONObject jSONObject) {
        this.d = jSONObject.optString("billingPeriod");
        this.c = jSONObject.optString("priceCurrencyCode");
        this.a = jSONObject.optString("formattedPrice");
        this.b = jSONObject.optLong("priceAmountMicros");
        this.f = jSONObject.optInt("recurrenceMode");
        this.e = jSONObject.optInt("billingCycleCount");
    }
}
