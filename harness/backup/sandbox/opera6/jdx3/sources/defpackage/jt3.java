package defpackage;

import android.content.SharedPreferences;
import android.view.View;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class jt3 {
    public final x5f a;
    public final x5f b;
    public final tni c;
    public final hw3 d;
    public final qb7 e;
    public final fd f;
    public final kze g;
    public b2l h;
    public boolean i;

    /* JADX WARN: Multi-variable type inference failed */
    public jt3(BrowserActivity browserActivity, SettingsManager settingsManager, x5f x5fVar, x5f x5fVar2, xnh xnhVar, k6l k6lVar, tni tniVar, bq3 bq3Var, kze kzeVar, nue nueVar, hw3 hw3Var, kze kzeVar2, et3 et3Var, ikc ikcVar, ew3 ew3Var, dw3 dw3Var, j4c j4cVar, qim qimVar, View view, zu3 zu3Var, pt3 pt3Var, dw3 dw3Var2, Lazy lazy) {
        this.a = x5fVar;
        this.b = x5fVar2;
        this.c = tniVar;
        this.d = hw3Var;
        tcc lifecycle = browserActivity.getLifecycle();
        final qb7 qb7Var = new qb7();
        final byte b = 0;
        qb7Var.a = z4c.b(new Function0() { // from class: lt3
            public final Object invoke() throws JSONException {
                byte b2 = b;
                qb7 qb7Var2 = qb7Var;
                switch (b2) {
                    case 0:
                        String string = ((SharedPreferences) ((zyk) qb7Var2.c).getValue()).getString("active_days", null);
                        if (string == null) {
                            return new ArrayList();
                        }
                        JSONArray jSONArray = new JSONArray(string);
                        ArrayList arrayList = new ArrayList();
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            arrayList.add(new nt3(jSONObject.getInt("y"), jSONObject.getInt("m"), jSONObject.getInt("d")));
                        }
                        return arrayList;
                    default:
                        String string2 = ((SharedPreferences) ((zyk) qb7Var2.c).getValue()).getString("active_interactions", null);
                        if (string2 == null) {
                            return new LinkedHashMap();
                        }
                        JSONArray jSONArray2 = new JSONArray(string2);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("day");
                            nt3 nt3Var = new nt3(jSONObject3.getInt("y"), jSONObject3.getInt("m"), jSONObject3.getInt("d"));
                            JSONArray jSONArray3 = jSONObject2.getJSONArray("a");
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            int length3 = jSONArray3.length();
                            for (int i3 = 0; i3 < length3; i3++) {
                                linkedHashSet.add(pc.C.get(jSONArray3.getInt(i3)));
                            }
                            linkedHashMap.put(nt3Var, new ot3(nt3Var, linkedHashSet));
                        }
                        return linkedHashMap;
                }
            }
        });
        final byte b2 = 1;
        qb7Var.b = z4c.b(new Function0() { // from class: lt3
            public final Object invoke() throws JSONException {
                byte b22 = b2;
                qb7 qb7Var2 = qb7Var;
                switch (b22) {
                    case 0:
                        String string = ((SharedPreferences) ((zyk) qb7Var2.c).getValue()).getString("active_days", null);
                        if (string == null) {
                            return new ArrayList();
                        }
                        JSONArray jSONArray = new JSONArray(string);
                        ArrayList arrayList = new ArrayList();
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            arrayList.add(new nt3(jSONObject.getInt("y"), jSONObject.getInt("m"), jSONObject.getInt("d")));
                        }
                        return arrayList;
                    default:
                        String string2 = ((SharedPreferences) ((zyk) qb7Var2.c).getValue()).getString("active_interactions", null);
                        if (string2 == null) {
                            return new LinkedHashMap();
                        }
                        JSONArray jSONArray2 = new JSONArray(string2);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int length2 = jSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                            JSONObject jSONObject3 = jSONObject2.getJSONObject("day");
                            nt3 nt3Var = new nt3(jSONObject3.getInt("y"), jSONObject3.getInt("m"), jSONObject3.getInt("d"));
                            JSONArray jSONArray3 = jSONObject2.getJSONArray("a");
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            int length3 = jSONArray3.length();
                            for (int i3 = 0; i3 < length3; i3++) {
                                linkedHashSet.add(pc.C.get(jSONArray3.getInt(i3)));
                            }
                            linkedHashMap.put(nt3Var, new ot3(nt3Var, linkedHashSet));
                        }
                        return linkedHashMap;
                }
            }
        });
        qb7Var.c = z4c.b(new mt3(browserActivity, b));
        oup.l0(lifecycle, (Function1) null, (Function1) null, (Function1) null, new bo3(qb7Var, (byte) 7), 7);
        this.e = qb7Var;
        fd fdVar = new fd(new whf(this, (byte) 13));
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) browserActivity.getApplication();
        fdVar.a(new wj9(browserActivity, new dt3(this, (byte) 0), bq3Var, fdVar, zu3Var));
        fdVar.a(new wj9(browserActivity, browserActivity, fdVar, j4cVar, zu3Var));
        fdVar.a(new k99(browserActivity, new et3(operaApplication, b), fdVar, zu3Var));
        fdVar.a(new l35(browserActivity, fdVar, zu3Var));
        fdVar.a(new wj9(browserActivity, new dt3(this, (byte) 1), nueVar, settingsManager, xnhVar, fdVar));
        fdVar.a(new l35(browserActivity, new dt3(this, (byte) 2), kzeVar, fdVar));
        fdVar.a(new hv0(browserActivity, browserActivity, fdVar, operaApplication.e(), settingsManager, (d8j) browserActivity.g0.E(d8j.class), pt3Var, lazy));
        fdVar.a(new my0(browserActivity, fdVar, dw3Var, dw3Var2));
        fdVar.a(new pqc(browserActivity, browserActivity, kzeVar2, et3Var, fdVar));
        fdVar.a(new o2i(browserActivity, ikcVar, ew3Var, fdVar));
        this.f = fdVar;
        this.g = new kze(Boolean.FALSE);
        k6lVar.b(new qz(this, (byte) 3));
        k6lVar.F(new gt3(this));
        k6lVar.a(new ht3(b));
        tniVar.a(new it3(this, (byte) 0));
        a(k6lVar.o);
        new igi(view, qb7Var, fdVar, ru9.c(browserActivity), new ft3(qimVar, b), x5fVar);
    }

    public final void a(b2l b2lVar) {
        if (b2lVar != null) {
            d7l d7lVar = (d7l) b2lVar;
            if (d7lVar.m) {
                return;
            }
            this.h = b2lVar;
            boolean zO0 = d7lVar.o0();
            this.i = !zO0;
            xf8.G0(this.g, Boolean.valueOf((zO0 || this.c.b) ? false : true));
            this.f.c();
        }
    }
}
