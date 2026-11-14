package defpackage;

import com.leanplum.internal.Constants;
import com.opera.android.Lazy;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g92 extends Lazy {
    public final /* synthetic */ byte e;
    public final HashMap f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public g92(Lazy lazy, Function1 function1) {
        this.e = (byte) 1;
        this.g = lazy;
        this.h = function1;
        this.f = new HashMap();
    }

    public g92(k5o k5oVar, qre qreVar, HashMap map, HashMap map2) {
        this.e = (byte) 0;
        this.g = qreVar;
        this.f = map;
        this.h = map2;
    }

    @Override // com.opera.android.Lazy
    public final void a(bg1 bg1Var) {
        switch (this.e) {
            case 1:
                b94 b94Var = new b94(this, bg1Var, (byte) 1);
                synchronized (this.f) {
                    this.f.put(bg1Var, b94Var);
                }
                ((Lazy) this.g).a(b94Var);
                return;
            default:
                super.a(bg1Var);
                return;
        }
    }

    @Override // com.opera.android.Lazy
    public final void b(bg1 bg1Var) {
        bg1 bg1Var2;
        switch (this.e) {
            case 1:
                synchronized (this.f) {
                    bg1Var2 = (bg1) this.f.remove(bg1Var);
                }
                if (bg1Var2 != null) {
                    ((Lazy) this.g).b(bg1Var2);
                    return;
                }
                return;
            default:
                super.b(bg1Var);
                return;
        }
    }

    @Override // com.opera.android.Lazy
    public final boolean c() {
        switch (this.e) {
            case 1:
                return ((Lazy) this.g).c() || super.c();
            default:
                return super.c();
        }
    }

    @Override // com.opera.android.Lazy
    public final Object d() throws JSONException {
        qre qreVar;
        byte b = this.e;
        Object obj = this.g;
        Object obj2 = this.h;
        switch (b) {
            case 0:
                qre qreVar2 = (qre) obj;
                HashMap map = this.f;
                HashMap map2 = (HashMap) obj2;
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject.put("version", 3);
                    jSONObject.put("news_id_list", jSONObject2);
                    jSONObject.put("video_id_list", jSONObject3);
                    jSONObject.put("group_card_list", jSONArray);
                    jSONObject.put("instaclip_id_list", jSONObject4);
                    for (Map.Entry entry : map.entrySet()) {
                        h92 h92Var = (h92) entry.getValue();
                        if (((h92) entry.getValue()).d.get() || (qreVar = h92Var.c) == null || qreVar.equals(qreVar2)) {
                            String str = ((h92) entry.getValue()).a;
                            if ("insta_clip".equals(str)) {
                                k5o.e(jSONObject4, (String) entry.getKey(), str, ((h92) entry.getValue()).b);
                            } else if ("video".equals(str)) {
                                k5o.e(jSONObject3, (String) entry.getKey(), str, ((h92) entry.getValue()).b);
                            } else {
                                k5o.e(jSONObject2, (String) entry.getKey(), str, ((h92) entry.getValue()).b);
                            }
                        }
                    }
                    for (Map.Entry entry2 : map2.entrySet()) {
                        if (((i92) entry2.getValue()).c.get() || ((i92) entry2.getValue()).b.equals(qreVar2)) {
                            String str2 = (String) entry2.getKey();
                            i92 i92Var = (i92) entry2.getValue();
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("id", str2);
                            jSONObject5.put(Constants.Params.TYPE, i92Var.a);
                            jSONArray.put(jSONObject5);
                        }
                    }
                } catch (JSONException unused) {
                }
                return jSONObject.toString();
            default:
                return ((Function1) obj2).invoke(((Lazy) obj).get());
        }
    }
}
