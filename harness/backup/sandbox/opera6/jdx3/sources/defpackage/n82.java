package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class n82 extends r22 {
    public final ywh e;
    public final uy8 f;
    public final l45 g;
    public final boolean h;
    public final boolean i;
    public final qre j;

    public n82(Context context, ywh ywhVar, qre qreVar, qtm qtmVar, uy8 uy8Var, boolean z, boolean z2) {
        super(context, qtmVar, qtmVar);
        this.e = ywhVar;
        this.f = uy8Var;
        l45 l45Var = new l45();
        l45Var.a = context.getApplicationContext();
        l45Var.b = qtmVar;
        l45Var.c = qreVar;
        this.g = l45Var;
        this.j = qreVar;
        this.h = z;
        this.i = z2;
    }

    public abstract void Q(Uri.Builder builder);

    public d5o R(orb orbVar) throws JSONException {
        Map mapUnmodifiableMap;
        String strE = orbVar.e("request_id");
        orb orbVarI = orbVar.i("experiments");
        if (orbVarI == null) {
            mapUnmodifiableMap = null;
        } else {
            JSONObject jSONObject = orbVarI.a;
            HashMap map = new HashMap(jSONObject.length());
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strM = orbVarI.m(next, "");
                if (strM != null) {
                    map.put(next, strM);
                }
            }
            mapUnmodifiableMap = Collections.unmodifiableMap(map);
        }
        zjh[] zjhVarArrB = zjh.b(orbVar, strE);
        orbVar.m("title", "").isEmpty();
        orbVar.m("more_id", "").isEmpty();
        orbVar.m("more_title", "").isEmpty();
        orbVar.m("preview_page_title", "").isEmpty();
        return new d5o(strE, mapUnmodifiableMap, zjhVarArrB);
    }

    public void S(fvh fvhVar) {
    }

    public abstract List T(d5o d5oVar, String str);

    public final void U(m82 m82Var) {
        Uri.Builder builderC = c();
        Q(builderC);
        String string = builderC.build().toString();
        g92 g92Var = null;
        uy8 uy8Var = this.f;
        if (uy8Var != null) {
            k5o k5oVar = uy8Var.H;
            if (this.h) {
                k5oVar.getClass();
                g92Var = new g92(k5oVar, null, new HashMap((HashMap) k5oVar.b), new HashMap((HashMap) k5oVar.c));
            } else {
                k5oVar.getClass();
                g92Var = new g92(k5oVar, this.j, new HashMap((HashMap) k5oVar.b), new HashMap((HashMap) k5oVar.c));
            }
        }
        l82 l82Var = new l82(this, string, g92Var);
        l82Var.f = true;
        if (this.i) {
            l82Var.g = true;
        }
        this.e.a(l82Var, new k82(this, m82Var, (byte) 0));
    }
}
