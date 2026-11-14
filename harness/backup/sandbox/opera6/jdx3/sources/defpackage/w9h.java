package defpackage;

import com.appsflyer.internal.o;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class w9h {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final int g;
    public final int h;
    public final String i;
    public final sa2 j = new sa2((byte) 10, false);

    public w9h(String str, String str2, String str3, String str4, String str5, long j, int i, int i2, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
        this.g = i;
        this.h = i2;
        this.i = str6;
    }

    public static w9h a(orb orbVar) throws JSONException {
        String strE = orbVar.e("publisher_id");
        if (strE.isEmpty()) {
            o.a("no publisher id");
            return null;
        }
        String strE2 = orbVar.e("publisher_name");
        if (strE2.isEmpty()) {
            o.a("no publisher name");
            return null;
        }
        String strE3 = orbVar.e("publisher_logo");
        if (strE3.isEmpty()) {
            o.a("no logo url");
            return null;
        }
        String strM = orbVar.m("description", "");
        if (strM.isEmpty()) {
            strM = null;
        }
        String strM2 = orbVar.m("reason", "");
        if (strM2.isEmpty()) {
            strM2 = null;
        }
        String strM3 = orbVar.m("infra_feedback", "");
        return new w9h(strE, strE2, strE3, strM, strM2, orbVar.j("lastupdate_time"), orbVar.g("subscribers"), orbVar.g("posts"), strM3.isEmpty() ? null : strM3);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w9h) && ((w9h) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        int i = this.j.b;
        StringBuilder sb = new StringBuilder(this.a);
        sb.append(i != 0 ? o18.g(i) : null);
        return sb.toString();
    }
}
