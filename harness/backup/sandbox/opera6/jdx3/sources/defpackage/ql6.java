package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class ql6 {
    public final eq6 a;

    public ql6(eq6 eq6Var) {
        this.a = eq6Var;
    }

    public final Uri a() {
        String strK;
        c3j c3jVar = (c3j) ((jv1) this.a.a).get();
        String str = c3jVar != null ? (String) c3jVar.d : null;
        if (str == null || str.length() == 0) {
            u88[] u88VarArr = u88.a;
            strK = "https://esim.operacdn.com/";
        } else {
            strK = sko.k("https://", str, "/");
        }
        return Uri.parse(strK);
    }
}
