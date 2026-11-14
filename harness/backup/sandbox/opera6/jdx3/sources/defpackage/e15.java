package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class e15 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public e15(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public static List a(vpb vpbVar, boolean z) {
        JSONArray jSONArray = vpbVar.a;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                orb orbVarC = vpbVar.c(i);
                arrayList.add(new e15(orbVarC.e("city_id"), orbVarC.e("display_name"), z ? orbVarC.m("state_name", "") : "", orbVarC.m("zip_code", "")));
            } catch (JSONException unused) {
                return Collections.EMPTY_LIST;
            }
        }
        return arrayList;
    }
}
