package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class zjh {
    public final String A;
    public final String B;
    public final List C;
    public final List D;
    public final String E;
    public final xlg F;
    public final String a;
    public final String b;
    public final String c;
    public final zjh[] d;
    public final String e;
    public final esg f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final r05 k;
    public final String l;
    public final String m;
    public final String n;
    public final String[] o;
    public final long p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final mw7[] u;
    public final h4n v;
    public final w9h w;
    public final log x;
    public final jb8 y;
    public final nb8 z;

    public zjh(String str, String str2, String str3, zjh[] zjhVarArr, String str4, esg esgVar, String str5, String str6, String str7, String str8, r05 r05Var, String str9, String str10, String[] strArr, long j, String str11, String str12, String str13, String str14, mw7[] mw7VarArr, h4n h4nVar, w9h w9hVar, log logVar, String str15, String str16, List list, List list2, String str17, String str18, xlg xlgVar, jb8 jb8Var, nb8 nb8Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zjhVarArr;
        this.e = str4;
        this.f = esgVar;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = r05Var;
        this.m = str9;
        this.n = str10;
        this.o = strArr;
        this.p = j;
        this.q = str11;
        this.r = str12;
        this.s = str13;
        this.t = str14;
        this.u = mw7VarArr;
        this.v = h4nVar;
        this.w = w9hVar;
        this.x = logVar;
        this.A = str15;
        this.B = str16;
        this.C = list;
        this.D = list2;
        this.l = str17;
        this.E = str18;
        this.F = xlgVar;
        this.y = jb8Var;
        this.z = nb8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.zjh a(defpackage.orb r47, java.lang.String r48) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zjh.a(orb, java.lang.String):zjh");
    }

    public static zjh[] b(orb orbVar, String str) {
        vpb vpbVarB = orbVar.b("articles");
        JSONArray jSONArray = vpbVarB.a;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                orb orbVarE = vpbVarB.e(i);
                if (orbVarE != null) {
                    arrayList.add(a(orbVarE, str));
                }
            } catch (JSONException unused) {
            }
        }
        return (zjh[]) arrayList.toArray(new zjh[arrayList.size()]);
    }

    public static String c(orb orbVar, String str) {
        String strM = orbVar.m(str, "");
        if (strM.isEmpty()) {
            return null;
        }
        return strM;
    }
}
