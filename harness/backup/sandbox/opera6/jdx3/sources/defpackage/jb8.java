package defpackage;

import com.appsflyer.internal.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@h2j
/* loaded from: classes.dex */
public final class jb8 {

    @NotNull
    public static final ib8 Companion = new ib8();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public /* synthetic */ jb8(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        if (2047 != (i & 2047)) {
            x7d.I(i, 2047, hb8.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
    }

    public jb8(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
    }

    public static final jb8 a(orb orbVar) throws JSONException {
        Companion.getClass();
        String strE = orbVar.e("title");
        String strE2 = orbVar.e("card_content");
        String strE3 = orbVar.e("card_content_color");
        String strE4 = orbVar.e("card_content_color_dark");
        String strE5 = orbVar.e("bg_image");
        String strE6 = orbVar.e("bg_image_dark");
        String strE7 = orbVar.e("bg_color");
        String strE8 = orbVar.e("bg_color_dark");
        String strE9 = orbVar.e("more_link_text");
        String strE10 = orbVar.e("more_link_url");
        Object objU = orb.u(new JSONObject(orbVar.e("infra_feedback")).get("theme_id"));
        if (objU != null) {
            return new jb8(strE, strE5, strE6, strE2, strE3, strE4, strE7, strE8, strE9, strE10, String.valueOf(objU));
        }
        o.a("theme_id is null");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb8)) {
            return false;
        }
        jb8 jb8Var = (jb8) obj;
        return Intrinsics.a(this.a, jb8Var.a) && Intrinsics.a(this.b, jb8Var.b) && Intrinsics.a(this.c, jb8Var.c) && Intrinsics.a(this.d, jb8Var.d) && Intrinsics.a(this.e, jb8Var.e) && Intrinsics.a(this.f, jb8Var.f) && Intrinsics.a(this.g, jb8Var.g) && Intrinsics.a(this.h, jb8Var.h) && Intrinsics.a(this.i, jb8Var.i) && Intrinsics.a(this.j, jb8Var.j) && Intrinsics.a(this.k, jb8Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + z1m.f(z1m.f(z1m.f(z1m.f(z1m.f(z1m.f(z1m.f(z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        return "";
    }
}
