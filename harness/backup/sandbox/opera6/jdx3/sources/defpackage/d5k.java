package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d5k implements lnf {
    public boolean a;
    public final m4k b;
    public final m4k c;

    public d5k(m4k m4kVar, m4k m4kVar2) {
        this.b = m4kVar;
        this.c = m4kVar2;
    }

    public static String b(cue cueVar, String str) {
        return wqm.d("startpage") + "?newsBackend=" + (cueVar.ordinal() != 1 ? "" : "newsfeed") + "&newsCategory=" + str;
    }

    public static String c(Context context) {
        return context.getResources().getString(2132021418);
    }

    @Override // defpackage.lnf
    public final knf a(Uri uri, boolean z, Parcelable parcelable) {
        return z ? this.c.U(uri, parcelable) : this.b.U(uri, parcelable);
    }
}
