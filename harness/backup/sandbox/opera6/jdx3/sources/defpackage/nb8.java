package defpackage;

import com.appsflyer.internal.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@h2j
/* loaded from: classes.dex */
public final class nb8 {

    @NotNull
    public static final mb8 Companion = new mb8();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public /* synthetic */ nb8(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, String str9) {
        if (511 != (i & 511)) {
            x7d.I(i, 511, lb8.a.getDescriptor());
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
    }

    public nb8(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
    }

    public static final nb8 a(orb orbVar) throws JSONException {
        Companion.getClass();
        String strE = orbVar.e("card_content_color");
        String strE2 = orbVar.e("card_content_color_dark");
        String strE3 = orbVar.e("bg_image");
        String strE4 = orbVar.e("bg_image_dark");
        String strE5 = orbVar.e("bg_color");
        String strE6 = orbVar.e("bg_color_dark");
        String strE7 = orbVar.e("more_link_text");
        String strE8 = orbVar.e("more_link_url");
        Object objU = orb.u(new JSONObject(orbVar.e("infra_feedback")).get("theme_id"));
        if (objU != null) {
            return new nb8(strE3, strE4, strE, strE2, strE5, strE6, strE7, strE8, String.valueOf(objU));
        }
        o.a("theme_id is null");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb8)) {
            return false;
        }
        nb8 nb8Var = (nb8) obj;
        return Intrinsics.a(this.a, nb8Var.a) && Intrinsics.a(this.b, nb8Var.b) && Intrinsics.a(this.c, nb8Var.c) && Intrinsics.a(this.d, nb8Var.d) && Intrinsics.a(this.e, nb8Var.e) && Intrinsics.a(this.f, nb8Var.f) && Intrinsics.a(this.g, nb8Var.g) && Intrinsics.a(this.h, nb8Var.h) && Intrinsics.a(this.i, nb8Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + z1m.f(z1m.f(z1m.f(z1m.f(z1m.f(z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        return "";
    }
}
