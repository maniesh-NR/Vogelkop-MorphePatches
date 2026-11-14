package defpackage;

import com.leanplum.internal.Constants;

/* loaded from: classes.dex */
public final class tx8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public tx8(String str, String str2, String str3) {
        this(str, str2, str3, null, null);
    }

    public tx8(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public static tx8 a(orb orbVar) {
        return new tx8(orbVar.e("id"), orbVar.m(Constants.Params.VALUE, null), orbVar.m("content", null), orbVar.m("text", null), orbVar.m("description", null));
    }
}
