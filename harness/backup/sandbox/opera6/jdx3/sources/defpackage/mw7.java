package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import com.leanplum.internal.Constants;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class mw7 {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Serializable f;
    public Serializable g;

    public static mw7 a(orb orbVar) {
        String strM = orbVar.m(Constants.Params.TYPE, "");
        if (strM.isEmpty()) {
            strM = null;
        }
        String strM2 = orbVar.m(ImagesContract.URL, "");
        if (strM2.isEmpty()) {
            strM2 = null;
        }
        String strM3 = orbVar.m("mp4_url", "");
        if (strM3.isEmpty()) {
            strM3 = null;
        }
        int iG = orbVar.g("width");
        int iG2 = orbVar.g("height");
        String strM4 = orbVar.m("description", "");
        if (strM4.isEmpty()) {
            strM4 = null;
        }
        String strM5 = orbVar.m("thumbnail", "");
        String str = strM5.isEmpty() ? null : strM5;
        mw7 mw7Var = new mw7();
        mw7Var.c = strM;
        mw7Var.d = strM2;
        mw7Var.e = strM3;
        mw7Var.a = iG;
        mw7Var.b = iG2;
        mw7Var.f = strM4;
        mw7Var.g = str;
        return mw7Var;
    }
}
