package defpackage;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class yv9 {
    public static final yv9 d = new yv9(0.0d, 0.0d, 0);
    public final double a;
    public final double b;
    public final long c;

    public yv9(double d2, double d3, long j) {
        this.a = d2;
        this.b = d3;
        this.c = j;
    }

    public yv9(orb orbVar) {
        JSONObject jSONObject = orbVar.a;
        this.a = jSONObject.getDouble("la");
        this.b = jSONObject.getDouble("lo");
        this.c = jSONObject.getLong("ts");
    }

    public final String toString() {
        return "";
    }
}
