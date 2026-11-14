package defpackage;

import java.util.TreeSet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hl extends ll {
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;

    public hl(int i, String str, int i2, int i3, int i4, boolean z, TreeSet treeSet, TreeSet treeSet2) {
        super(i, q50.h, str, treeSet, treeSet2, iq.b);
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = z;
    }

    public static hl c(orb orbVar) throws JSONException {
        int iA = vep.a(orbVar.m("style", ""));
        String strE = orbVar.e("pid");
        JSONObject jSONObject = orbVar.a;
        return new hl(iA, strE, jSONObject.optInt("minIntervalInMinutes", 60), jSONObject.optInt("maxCountPerDay", 1), jSONObject.optInt("clickCountBeforeShow", 1), jSONObject.optBoolean("onlyAfterNotificationClick", false), dl.b(orbVar), dl.a(orbVar));
    }
}
