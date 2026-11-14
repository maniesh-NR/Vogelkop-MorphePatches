package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class np4 {
    public final ArrayList a;

    public np4() {
        this.a = new ArrayList(32);
    }

    public np4(ArrayList arrayList) {
        this.a = arrayList;
    }

    public static np4 d(vpb vpbVar) {
        JSONArray jSONArray = vpbVar.a;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                orb orbVarC = vpbVar.c(i);
                String strE = orbVarC.e("id");
                String strE2 = orbVarC.e("name");
                orbVarC.m("thumbnail", (String) null);
                orbVarC.m("location", (String) null);
                arrayList.add(new pp4(strE, strE2, orbVarC.f("subscribed")));
            } catch (JSONException unused) {
            }
        }
        return new np4(arrayList);
    }

    public final void a() {
        this.a.add(d7g.c);
    }

    public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new e7g(f, f2, f3, f4, f5, f6));
    }

    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.add(new m7g(f, f2, f3, f4, f5, f6));
    }

    public final void e(float f) {
        this.a.add(new n7g(f));
    }

    public final void f(float f, float f2) {
        this.a.add(new g7g(f, f2));
    }

    public final void g(float f, float f2) {
        this.a.add(new o7g(f, f2));
    }

    public final void h(float f, float f2) {
        this.a.add(new h7g(f, f2));
    }

    public final void i(float f, float f2, float f3, float f4) {
        this.a.add(new r7g(f, f2, f3, f4));
    }
}
