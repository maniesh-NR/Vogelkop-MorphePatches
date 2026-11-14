package defpackage;

import androidx.recyclerview.widget.i;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class u4h implements Function1 {
    public final /* synthetic */ byte a;

    public /* synthetic */ u4h(byte b) {
        this.a = b;
    }

    public final Object invoke(Object obj) throws Exception {
        rwj rwjVar = null;
        rwjVar = null;
        switch (this.a) {
            case 0:
                ewb ewbVar = (ewb) obj;
                ewbVar.a = (short) 6000;
                Float fValueOf = Float.valueOf(90.0f);
                ewbVar.a(300, fValueOf).b = mae.b;
                ewbVar.a(1500, fValueOf);
                Float fValueOf2 = Float.valueOf(180.0f);
                ewbVar.a(1800, fValueOf2);
                ewbVar.a(PathInterpolatorCompat.MAX_NUM_POINTS, fValueOf2);
                Float fValueOf3 = Float.valueOf(270.0f);
                ewbVar.a(3300, fValueOf3);
                ewbVar.a(4500, fValueOf3);
                Float fValueOf4 = Float.valueOf(360.0f);
                ewbVar.a(4800, fValueOf4);
                ewbVar.a(6000, fValueOf4);
                return Unit.a;
            case 1:
                o4h o4hVar = o4h.c;
                xtb[] xtbVarArr = o0j.a;
                p0j p0jVar = n0j.c;
                xtb xtbVar = o0j.a[1];
                p0jVar.getClass();
                ((q0j) obj).b(p0jVar, o4hVar);
                return Unit.a;
            case 2:
                return Unit.a;
            case 3:
                o3c o3cVar = (o3c) obj;
                d5o d5oVar = o3cVar.a.b;
                long jD = d5oVar.D();
                d5oVar.A().j();
                try {
                    ((wth) d5oVar.a).q(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    o3cVar.a();
                    am2.w(d5oVar, jD);
                    return Unit.a;
                } catch (Throwable th) {
                    am2.w(d5oVar, jD);
                    throw th;
                }
            case 4:
                Float f = (Float) obj;
                f.getClass();
                return new sah(new cd1(f, a26.e, null, 12));
            case 5:
                return Unit.a;
            case 6:
                aqb aqbVar = (aqb) obj;
                aqbVar.c = true;
                aqbVar.n = false;
                return Unit.a;
            case 7:
                return ((jdh) obj).b;
            case 8:
                wsk wskVarH = ((osk) obj).h("DELETE FROM recent_searches WHERE settings_id NOT IN (SELECT settings_id FROM recent_searches ORDER BY timestamp DESC LIMIT 5)");
                try {
                    wskVarH.n();
                    wskVarH.close();
                    return Unit.a;
                } finally {
                }
            case 9:
                wsk wskVarH2 = ((osk) obj).h("SELECT * FROM recent_searches ORDER BY timestamp DESC LIMIT 5");
                try {
                    int iF = hyg.f(wskVarH2, "settings_id");
                    int iF2 = hyg.f(wskVarH2, "timestamp");
                    ArrayList arrayList = new ArrayList();
                    while (wskVarH2.n()) {
                        arrayList.add(new omh((int) wskVarH2.getLong(iF), wskVarH2.getLong(iF2)));
                    }
                    return arrayList;
                } finally {
                }
            case 10:
                wsk wskVarH3 = ((osk) obj).h("DELETE FROM recent_searches");
                try {
                    wskVarH3.n();
                    wskVarH3.close();
                    return Unit.a;
                } finally {
                }
            case 11:
                return (i) obj;
            case 12:
                wsk wskVarH4 = ((osk) obj).h("SELECT * FROM redirects");
                try {
                    int iF3 = hyg.f(wskVarH4, "original_url");
                    int iF4 = hyg.f(wskVarH4, "final_url");
                    ArrayList arrayList2 = new ArrayList();
                    while (wskVarH4.n()) {
                        arrayList2.add(new gqh(wskVarH4.l(iF3), wskVarH4.l(iF4)));
                    }
                    return arrayList2;
                } finally {
                }
            case 13:
                wsk wskVarH5 = ((osk) obj).h("SELECT COUNT(original_url) FROM redirects");
                try {
                    return Integer.valueOf(wskVarH5.n() ? (int) wskVarH5.getLong(0) : 0);
                } finally {
                }
            case 14:
                pzh pzhVar = (pzh) obj;
                try {
                    if (!pzhVar.q) {
                        throw new ux5("HTTP status code: " + pzhVar.d);
                    }
                    try {
                        kth kthVar = new kth(new orb(pzhVar.g.string()), pzhVar.h());
                        pzhVar.close();
                        return kthVar;
                    } catch (JSONException e) {
                        throw e;
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        vtp.v(pzhVar, th2);
                        throw th3;
                    }
                }
            case 15:
                return (String) obj;
            case 16:
                return ((azh) obj).b;
            case 17:
                w6g w6gVar = xyh.d;
                return Boolean.valueOf(hn9.o(((yco) obj).a));
            case 18:
                return Boolean.valueOf(((SettingsManager) obj).i("enable_rewards"));
            case 19:
                return ((c2i) obj).j;
            case 20:
                return Boolean.valueOf(((SettingsManager) obj).i("eula_accepted.gdpr"));
            case 21:
                return ((Map) obj).keySet();
            case 22:
                return Unit.a;
            case 23:
                return Unit.a;
            case 24:
                return new uji((Map) obj);
            case 25:
                return obj;
            case 26:
                List list = (List) obj;
                Object obj2 = list.get(0);
                Function1 function1 = zki.h.b;
                Boolean bool = Boolean.FALSE;
                rwj rwjVar2 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (rwj) function1.invoke(obj2);
                Object obj3 = list.get(1);
                rwj rwjVar3 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (rwj) function1.invoke(obj3);
                Object obj4 = list.get(2);
                rwj rwjVar4 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (rwj) function1.invoke(obj4);
                Object obj5 = list.get(3);
                if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                    rwjVar = (rwj) function1.invoke(obj5);
                }
                return new tjl(rwjVar2, rwjVar3, rwjVar4, rwjVar);
            case 27:
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (Intrinsics.a(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) zki.a.b.invoke(obj6);
                Object obj7 = list2.get(0);
                return new sf1(list3, obj7 != null ? (String) obj7 : null);
            case 28:
                return new bgl(((Integer) obj).intValue());
            default:
                List list4 = (List) obj;
                return new vil(((Number) list4.get(0)).floatValue(), ((Number) list4.get(1)).floatValue());
        }
    }
}
