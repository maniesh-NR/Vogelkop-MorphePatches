package defpackage;

import org.json.JSONException;

/* loaded from: classes.dex */
public final class h06 implements k06 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ h06(String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public h06(orb orbVar) throws JSONException {
        String strE = orbVar.e("headlineText");
        String strE2 = orbVar.e("bodyText");
        String strM = orbVar.m("attributionText", null);
        String strE3 = orbVar.e("bigImageUrl");
        String strM2 = orbVar.m("smallImageUrl", null);
        orbVar.a.getBoolean("ctaButtonVisible");
        String strM3 = orbVar.m("ctaButtonText", null);
        this.a = strE;
        this.b = strE2;
        this.c = strM;
        this.d = strE3;
        this.e = strM2;
        this.f = strM3;
    }

    @Override // defpackage.k06
    public final boolean c() {
        return true;
    }

    @Override // defpackage.k06
    public final h06 f() {
        return this;
    }
}
