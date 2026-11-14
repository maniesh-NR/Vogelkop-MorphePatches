package defpackage;

import android.content.SharedPreferences;
import android.util.Pair;
import com.appsflyer.internal.o;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class kp4 extends z4o {
    public final /* synthetic */ byte r;
    public final /* synthetic */ Object s;

    public /* synthetic */ kp4(Object obj, Object obj2, byte b) {
        this.r = b;
        this.s = obj2;
    }

    public final void Y(String str, boolean z) {
        byte b = this.r;
        Object obj = this.s;
        switch (b) {
            case 0:
                ((lp4) obj).d(null, false);
                break;
            case 1:
                qu8 qu8Var = (qu8) obj;
                qu8Var.d(((ru8) qu8Var.d).j.p());
                break;
            default:
                ((oam) obj).q(null);
                break;
        }
    }

    public final void c0(pzh pzhVar, orb orbVar) throws JSONException {
        byte b = this.r;
        pu8 pu8Var = null;
        Object obj = this.s;
        switch (b) {
            case 0:
                int i = 0;
                boolean z = pzhVar.j != null && pzhVar.i == null;
                lp4 lp4Var = (lp4) obj;
                try {
                    orbVar.e("version");
                    ArrayList arrayList = np4.d(orbVar.b("categories")).a;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        pp4 pp4Var = (pp4) obj2;
                        arrayList2.add(new yqe(pp4Var.a, pp4Var.b, pp4Var.c));
                    }
                    lp4Var.d(arrayList2, z);
                    break;
                } catch (JSONException unused) {
                    lp4Var.d(null, z);
                    return;
                }
                break;
            case 1:
                qu8 qu8Var = (qu8) obj;
                try {
                    JSONObject jSONObject = orbVar.c("related_articles").a;
                    int iOptInt = jSONObject.optInt("duration_threshold", -1);
                    int iOptInt2 = jSONObject.optInt("percent_threshold", -1);
                    orb orbVarI = orbVar.i("feedback_reason_v2");
                    Pair pairL = orbVarI != null ? o0g.L(orbVarI) : null;
                    boolean zF = orbVar.f("enable_local_push");
                    boolean zF2 = orbVar.f("enable_native_push");
                    boolean zF3 = orbVar.f("enable_video_theater");
                    orbVar.a.optBoolean("enable_clip", true);
                    pu8Var = new pu8(iOptInt == -1 ? null : Integer.valueOf(iOptInt), iOptInt2 == -1 ? null : Integer.valueOf(iOptInt2), pairL != null ? (Map) pairL.first : null, pairL != null ? (Map) pairL.second : null, zF, zF2, zF3);
                } catch (JSONException unused2) {
                }
                ru8 ru8Var = (ru8) qu8Var.d;
                if (pu8Var == null) {
                    qu8Var.d(ru8Var.j.p());
                    break;
                } else {
                    ta7 ta7Var = ru8Var.j;
                    SharedPreferences.Editor editorEdit = ta7Var.s().edit();
                    Integer num = pu8Var.a;
                    if (num != null) {
                        editorEdit.putInt("duration_threshold", num.intValue());
                    }
                    Integer num2 = pu8Var.b;
                    if (num2 != null) {
                        editorEdit.putInt("percent_threshold", num2.intValue());
                    }
                    s6h s6hVar = (s6h) ta7Var.e;
                    s6hVar.getClass();
                    ((i32) s6hVar.a).f(new cn7(s6hVar, new ux8(pu8Var.c, pu8Var.d), (byte) 21));
                    editorEdit.putBoolean("enable_local_push", pu8Var.e);
                    editorEdit.putBoolean("enable_native_push", pu8Var.f);
                    editorEdit.putBoolean("enable_video_theater", pu8Var.g);
                    editorEdit.apply();
                    isd isdVar = qu8Var.b;
                    isdVar.getClass();
                    isdVar.E(pu8Var, true);
                    break;
                }
            default:
                String strE = orbVar.e("device_id");
                if (!strE.isEmpty()) {
                    ((oam) obj).q(strE);
                    break;
                } else {
                    o.a("device id can't be empty");
                    break;
                }
        }
    }
}
