package defpackage;

import com.leanplum.internal.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mvg {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final ArrayList f;
    public final ArrayList g;
    public int h;

    public mvg(int i, int i2, String str, String str2, String str3, List list, List list2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = str == null ? "organic" : str;
        this.d = str2 == null ? "organic" : str2;
        this.e = str3 == null ? "organic" : str3;
        this.f = new ArrayList(list);
        this.g = new ArrayList(list2);
        this.h = i3;
    }

    public static mvg a(orb orbVar) {
        vpb vpbVarB = orbVar.b("navigations");
        JSONObject jSONObject = orbVar.a;
        JSONArray jSONArray = vpbVarB.a;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = vpbVarB.c(i).a;
            arrayList.add(new lvg(jSONObject2.getInt("from"), jSONObject2.getInt("to")));
        }
        vpb vpbVarB2 = orbVar.b("carousel_items");
        JSONArray jSONArray2 = vpbVarB2.a;
        ArrayList arrayList2 = new ArrayList(jSONArray2.length());
        int length2 = jSONArray2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            JSONObject jSONObject3 = vpbVarB2.c(i2).a;
            arrayList2.add(new kvg(jSONObject3.getInt(Constants.Params.IAP_ITEM), jSONObject3.getLong("duration")));
        }
        return new mvg(jSONObject.getInt("entry_point"), jSONObject.getInt("first_view"), orbVar.m("campaign", ""), orbVar.m("source", ""), orbVar.m("target", ""), arrayList, arrayList2, jSONObject.getInt("exit_reason"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvg)) {
            return false;
        }
        mvg mvgVar = (mvg) obj;
        return this.a == mvgVar.a && this.b == mvgVar.b && this.c.equals(mvgVar.c) && this.d.equals(mvgVar.d) && this.e.equals(mvgVar.e) && this.f.equals(mvgVar.f) && this.g.equals(mvgVar.g) && this.h == mvgVar.h;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f, this.g, Integer.valueOf(this.h));
    }
}
