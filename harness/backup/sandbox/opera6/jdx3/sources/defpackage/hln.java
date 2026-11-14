package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.leanplum.internal.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class hln implements aln {
    public final orb a;

    public hln(orb orbVar) {
        this.a = orbVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static hln h(orb orbVar) throws JSONException {
        String strE = orbVar.e(Constants.Params.TYPE);
        JSONObject jSONObject = orbVar.a;
        char c = 65535;
        switch (strE.hashCode()) {
            case 89650992:
                if (strE.equals("gradient")) {
                    c = 0;
                    break;
                }
                break;
            case 94842723:
                if (strE.equals(Constants.Kinds.COLOR)) {
                    c = 1;
                    break;
                }
                break;
            case 100313435:
                if (strE.equals("image")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                h06 h06VarI = i(orbVar, null);
                orb orbVarI = orbVar.i("dark");
                String strM = vq8.m(orbVar.e("id"));
                int iA = am2.a(orbVar.e("category_code"));
                g7j g7jVarD = jSONObject.has("theme") ? g7j.d(orbVar.e("theme")) : null;
                orb orbVarC = orbVar.c("light");
                return new eln(orbVar, strM, iA, g7jVarD, new m9f(k(orbVarC.e("top_gradient_color")), k(orbVarC.e("bottom_gradient_color")), i(orbVarC, h06VarI)), orbVarI != null ? new m9f(k(orbVarI.e("top_gradient_color")), k(orbVarI.e("bottom_gradient_color")), i(orbVarI, h06VarI)) : null, (byte) 0);
            case 1:
                h06 h06VarI2 = i(orbVar, null);
                orb orbVarI2 = orbVar.i("dark");
                String strM2 = vq8.m(orbVar.e("id"));
                int iA2 = am2.a(orbVar.e("category_code"));
                g7j g7jVarD2 = jSONObject.has("theme") ? g7j.d(orbVar.e("theme")) : null;
                orb orbVarC2 = orbVar.c("light");
                int iK = k(orbVarC2.e("solid_color"));
                m9f m9fVar = new m9f(iK, iK, i(orbVarC2, h06VarI2));
                if (orbVarI2 != null) {
                    int iK2 = k(orbVarI2.e("solid_color"));
                    m9fVar = new m9f(iK2, iK2, i(orbVarI2, h06VarI2));
                }
                return new eln(orbVar, strM2, iA2, g7jVarD2, m9fVar, m9fVar, (byte) 1);
            case 2:
                h06 h06VarI3 = i(orbVar, null);
                orb orbVarI3 = orbVar.i("dark");
                return new fln(orbVar, vq8.m(orbVar.e("id")), am2.a(orbVar.e("category_code")), jSONObject.has("theme") ? g7j.d(orbVar.e("theme")) : null, fln.l(orbVar.c("light"), h06VarI3), orbVarI3 != null ? fln.l(orbVarI3, h06VarI3) : null, orbVar.f("hidden"));
            default:
                hai.d();
                return null;
        }
    }

    public static h06 i(orb orbVar, h06 h06Var) {
        return new h06(orbVar.m("title", h06Var != null ? h06Var.a : null), orbVar.m("title_url", h06Var != null ? h06Var.b : null), orbVar.m("source_text", h06Var != null ? h06Var.c : null), orbVar.m("source_url", h06Var != null ? h06Var.d : null), orbVar.m("author_text", h06Var != null ? h06Var.e : null), orbVar.m("author_url", h06Var != null ? h06Var.f : null));
    }

    public static int k(String str) {
        int color = Color.parseColor(str);
        if (Color.alpha(color) >= 255) {
            return color;
        }
        hai.d();
        return 0;
    }

    public final boolean j(Context context, o2c o2cVar) {
        if (!a()) {
            return false;
        }
        boolean zH = f03.H(context);
        boolean z = o2cVar.d;
        return zH ? !z : z;
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
