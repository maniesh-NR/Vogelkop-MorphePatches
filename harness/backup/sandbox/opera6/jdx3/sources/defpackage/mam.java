package defpackage;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class mam extends qyn {
    public final bhi j;
    public final String k;

    public mam(bhi bhiVar, String str) {
        this.j = bhiVar;
        this.k = str;
    }

    public final void S(int i) {
        p0i p0iVar = t0i.b;
        this.j.resumeWith(new q0i(new lv0("Loading of '" + this.k + "' font failed with " + i + " error code")));
    }

    public final void T(Typeface typeface) {
        p0i p0iVar = t0i.b;
        this.j.resumeWith(typeface);
    }
}
