package defpackage;

import android.content.Context;
import android.net.Uri;
import com.appsflyer.internal.o;
import com.leanplum.internal.Constants;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class fab extends ash {
    public final l0c n;

    public fab(Context context, ywh ywhVar, qre qreVar, int i, z05 z05Var, uy8 uy8Var, boolean z) {
        super(context, ywhVar, qreVar, i, z05Var, uy8Var, z);
        this.n = z05Var.a.e;
    }

    @Override // defpackage.ash, defpackage.n82
    public final void Q(Uri.Builder builder) {
        super.Q(builder);
        builder.appendQueryParameter("request_id", UUID.randomUUID().toString());
    }

    @Override // defpackage.n82
    public final d5o R(orb orbVar) throws JSONException {
        if (!orbVar.c("result").e(Constants.Params.MESSAGE).equals("success")) {
            o.a("message != success");
            return null;
        }
        String strE = orbVar.e("request_id");
        vpb vpbVarB = orbVar.b("content");
        JSONArray jSONArray = vpbVarB.a;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                log logVar = (log) log.h.d(vpbVarB.c(i));
                String str = logVar.b;
                arrayList.add(new zjh(str, str, null, null, null, null, null, null, null, null, null, null, null, null, logVar.f, null, "insta_clip", null, null, null, null, null, logVar, null, null, null, null, null, null, null, null, null));
            } catch (JSONException unused) {
            }
        }
        return new d5o(strE, (Object) null, (zjh[]) arrayList.toArray(new zjh[arrayList.size()]));
    }

    @Override // defpackage.n82
    public final void S(fvh fvhVar) {
        l0c l0cVar = this.n;
        if (l0cVar != null) {
            String str = l0cVar.a;
            Locale locale = Locale.ROOT;
            fvhVar.d(Constants.Keys.COUNTRY, str.toUpperCase(locale));
            fvhVar.d("language", l0cVar.b.toLowerCase(locale));
        }
    }

    @Override // defpackage.ash
    public final void V(Uri.Builder builder) {
        builder.appendEncodedPath("clip/v1/video/channel").appendEncodedPath(this.j.b.a);
    }
}
