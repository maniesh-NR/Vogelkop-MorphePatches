package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.leanplum.internal.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class oc9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s14 b;
    public final /* synthetic */ String c;

    public /* synthetic */ oc9(s14 s14Var, String str, byte b) {
        this.a = b;
        this.b = s14Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        mc9 mc9Var;
        switch (this.a) {
            case 0:
                s14 s14Var = this.b;
                String str = this.c;
                if (s14Var.b) {
                    return;
                }
                ((pe9) s14Var.e).run(str);
                return;
            default:
                s14 s14Var2 = this.b;
                String str2 = this.c;
                if (s14Var2.b) {
                    return;
                }
                nc9 nc9Var = (nc9) s14Var2.c;
                synchronized (nc9Var.d) {
                    mc9Var = nc9Var.e;
                    if (mc9Var == null) {
                        mc9Var = new mc9(new byte[0], 0L);
                    }
                }
                xe9 xe9Var = (xe9) s14Var2.d;
                Uri uri = Uri.parse(str2);
                long j = mc9Var.a;
                String strEncodeToString = Base64.encodeToString(mc9Var.b, 2);
                bf9 bf9Var = (bf9) xe9Var.c;
                k5o k5oVar = (k5o) xe9Var.d;
                String str3 = xe9Var.a;
                String str4 = xe9Var.b;
                ie9 ie9Var = (ie9) xe9Var.e;
                Uri uri2 = (Uri) xe9Var.f;
                Uri uri3 = (Uri) xe9Var.g;
                bf9Var.getClass();
                long j2 = ie9Var.c;
                orb orbVar = new orb();
                JSONObject jSONObject = new JSONObject();
                orbVar.p("file2", Constants.Params.TYPE);
                orbVar.p(str3, Constants.Params.NAME);
                orbVar.p(str4, "mimetype");
                orbVar.o(j, Constants.Keys.SIZE);
                orbVar.o(j2, "expires");
                orbVar.p(strEncodeToString, "iv");
                if (uri2 != null) {
                    orbVar.p(uri2, "preview");
                }
                try {
                    jSONObject.put(Constants.Params.TYPE, orb.t("text"));
                    try {
                        jSONObject.put("text", orb.t("Update your client to support file messages"));
                        k5oVar.b = bf9Var.E(new w59(orbVar.a.toString(), jSONObject.toString(), uri.toString(), uri3 != null ? uri3.toString() : null), new pe9(k5oVar, (byte) 0));
                        return;
                    } catch (JSONException e) {
                        t3p.n(e);
                        return;
                    }
                } catch (JSONException e2) {
                    t3p.n(e2);
                    return;
                }
        }
    }
}
