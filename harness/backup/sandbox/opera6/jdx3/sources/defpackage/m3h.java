package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import com.leanplum.internal.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class m3h extends kuk implements Function2 {
    public i07 t;
    public boolean u;
    public final /* synthetic */ n3h v;
    public final /* synthetic */ float w;
    public final /* synthetic */ String x;
    public final /* synthetic */ long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3h(n3h n3hVar, float f, String str, long j, mt5 mt5Var) {
        super(2, mt5Var);
        this.v = n3hVar;
        this.w = f;
        this.x = str;
        this.y = j;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        return new m3h(this.v, this.w, this.x, this.y, mt5Var);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) throws JSONException {
        Object objX;
        i07 i07Var;
        Object next;
        n3h n3hVar = this.v;
        x5f x5fVar = n3hVar.l;
        px5 px5Var = px5.a;
        boolean z = this.u;
        String str = this.x;
        float f = this.w;
        l08 l08VarSingletonList = null;
        if (!z) {
            ybh.y(obj);
            Uri uri = (Uri) n3hVar.e.get();
            String str2 = (String) n3hVar.f.get();
            String str3 = (String) n3hVar.g.get();
            if (str2 != null) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                Locale locale = Locale.ROOT;
                Uri uriBuild = builderBuildUpon.appendPath(str2.toLowerCase(locale)).appendPath(str3.toLowerCase(locale)).appendEncodedPath("v1/search/suggest").appendQueryParameter(Constants.Params.TYPE, "product").appendQueryParameter("limit", "1").appendQueryParameter("score", String.valueOf(f)).appendQueryParameter("query", str).appendQueryParameter("surface", "ptb-ofa-ss").build();
                fvh fvhVar = new fvh();
                fvhVar.h(uriBuild.toString());
                i07 i07VarG = na2.g(n3hVar.j, n3hVar.k, (rx5) null, new qmb((t9f) n3hVar.d.get(), new kvh(fvhVar), (mt5) null, (byte) 27), 2);
                long j = n3hVar.m;
                l3h l3hVar = new l3h(i07VarG, null, (byte) 0);
                this.t = i07VarG;
                this.u = true;
                objX = uyg.x(j, l3hVar, this);
                if (objX == px5Var) {
                    return px5Var;
                }
                i07Var = i07VarG;
            }
            return null;
        }
        if (!z) {
            qp2.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i07Var = this.t;
        ybh.y(obj);
        objX = obj;
        String str4 = (String) objX;
        if (str4 == null) {
            if (i07Var.isActive() && x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                ((nn0) ((vo0) new ck0(zpaVar, x56VarF).p.getValue()).c.getValue()).a.p(2, 1, 1L);
                x5fVar.U0(x56VarF);
            }
            return null;
        }
        int i = n3h.q;
        if (str4.length() == 0) {
            l08VarSingletonList = l08.a;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str4);
                if (jSONObject.getInt("code") == 200) {
                    JSONArray jSONArray = jSONObject.getJSONObject(Constants.Params.DATA).getJSONArray("suggestions");
                    if (jSONArray.length() == 0) {
                        l08VarSingletonList = l08.a;
                    } else {
                        IntRange intRangeJ = djh.j(0, jSONArray.length());
                        ArrayList arrayList = new ArrayList(k95.o(intRangeJ, 10));
                        ubb it = intRangeJ.iterator();
                        while (((acb) it).c) {
                            arrayList.add(new orb(jSONArray.getJSONObject(it.nextInt())));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj2 = arrayList.get(i2);
                            i2++;
                            ArrayList arrayList3 = arrayList;
                            if (((orb) obj2).a.optDouble("final_score", 0.0d) >= f) {
                                arrayList2.add(obj2);
                            }
                            arrayList = arrayList3;
                        }
                        Iterator it2 = CollectionsKt.c0(new au9((byte) 13), arrayList2).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            if (n3hVar.h((orb) next)) {
                                break;
                            }
                        }
                        orb orbVar = (orb) next;
                        l08VarSingletonList = orbVar == null ? l08.a : Collections.singletonList(n3hVar.j(orbVar, str));
                    }
                }
            } catch (NumberFormatException | JSONException unused) {
                l08VarSingletonList = null;
            }
        }
        if (l08VarSingletonList != null) {
            long jUptimeMillis = SystemClock.uptimeMillis() - this.y;
            boolean z2 = x5fVar.h;
            zpa zpaVar2 = x5fVar.d;
            if (z2) {
                x56 x56VarF2 = zpa.F();
                ((nn0) ((vo0) new ck0(zpaVar2, x56VarF2).p.getValue()).c.getValue()).a.p(0, 1, 1L);
                x5fVar.U0(x56VarF2);
            }
            long j2 = jUptimeMillis / 20;
            long j3 = n3h.p;
            if (j2 > j3) {
                j2 = j3;
            }
            Map mapSingletonMap = Collections.singletonMap(String.valueOf(j2), 1L);
            if (x5fVar.h) {
                x56 x56VarF3 = zpa.F();
                new w37(mapSingletonMap, (byte) 1).invoke((vo0) new ck0(zpaVar2, x56VarF3).p.getValue());
                x5fVar.U0(x56VarF3);
            }
            if (!((Collection) l08VarSingletonList).isEmpty() && x5fVar.h) {
                x56 x56VarF4 = zpa.F();
                ((nn0) ((vo0) new ck0(zpaVar2, x56VarF4).p.getValue()).c.getValue()).a.p(1, 1, 1L);
                x5fVar.U0(x56VarF4);
            }
        }
        return l08VarSingletonList;
    }
}
