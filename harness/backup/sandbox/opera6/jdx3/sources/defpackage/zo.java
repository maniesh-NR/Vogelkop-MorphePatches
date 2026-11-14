package defpackage;

import android.os.SystemClock;
import com.leanplum.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zo {
    public final boolean a;
    public final List b;
    public final long c;
    public final String d;

    public zo(String str, boolean z, ArrayList arrayList, long j, String str2) {
        this.a = z;
        this.b = Collections.unmodifiableList(arrayList);
        this.c = j;
        this.d = str2;
    }

    public static zo a(String str, String str2, gm gmVar, boolean z) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if ("ok".equals(orb.u(jSONObject.get("ret")))) {
                orb orbVar = new orb(jSONObject.getJSONObject("dat"));
                String strE = orbVar.e("accessID");
                vpb vpbVarB = orbVar.b("deliveries");
                String strM = orbVar.m("ipAddress", null);
                ArrayList arrayList = new ArrayList(vpbVarB.a.length());
                HashSet hashSet = new HashSet(0);
                int i = 0;
                while (true) {
                    str3 = strE;
                    if (i >= vpbVarB.a.length()) {
                        break;
                    }
                    orb orbVarC = vpbVarB.c(i);
                    try {
                        arrayList.add(vo.a(new r9i((Object) orbVarC, (Object) str2, (Object) str3, (Object) orbVarC.e(Constants.Params.TYPE), (byte) 27)));
                    } catch (IllegalArgumentException | JSONException unused) {
                        hashSet.add(orbVarC.m("id", "N/A"));
                    }
                    i++;
                    strE = str3;
                }
                if (!hashSet.isEmpty()) {
                    gmVar.h(hashSet);
                }
                if (!arrayList.isEmpty()) {
                    Collections.sort(arrayList, new c9((byte) 1));
                    long millis = 0;
                    if (!z) {
                        long jG = orbVar.g("fetchIntervalSeconds");
                        millis = (jG > 0 ? TimeUnit.SECONDS.toMillis(jG) : 3600000L) + SystemClock.elapsedRealtime();
                    }
                    long j = millis;
                    if (orbVar.a.optBoolean("concurrent", false)) {
                        gmVar.b("concurrent", "true");
                    }
                    return new zo(str3, orbVar.f("disableFallback"), arrayList, j, strM);
                }
                if (hashSet.isEmpty()) {
                    throw new JSONException("not any valid ad provider");
                }
            }
            return null;
        } catch (IllegalArgumentException | JSONException e) {
            gmVar.n(e.getMessage());
            return null;
        }
    }
}
