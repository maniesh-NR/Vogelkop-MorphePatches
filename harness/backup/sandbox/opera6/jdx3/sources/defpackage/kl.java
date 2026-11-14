package defpackage;

import java.util.TreeSet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class kl extends ll {
    public final long g;
    public final boolean h;
    public final boolean i;

    public kl(int i, String str, long j, boolean z, boolean z2, TreeSet treeSet, TreeSet treeSet2) {
        super(i, q50.i, str, treeSet, treeSet2, iq.c);
        this.g = j;
        this.h = z;
        this.i = z2;
    }

    public static kl c(orb orbVar) throws JSONException {
        int iA = vep.a(orbVar.m("style", ""));
        String strE = orbVar.e("pid");
        JSONObject jSONObject = orbVar.a;
        return new kl(iA, strE, jSONObject.optLong("refreshThresholdMs", 20000L), jSONObject.optBoolean("replaceAfterClick", true), jSONObject.optBoolean("replaceOnRefresh", true), dl.b(orbVar), dl.a(orbVar));
    }
}
