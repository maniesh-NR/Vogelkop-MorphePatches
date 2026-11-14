package defpackage;

import J.N;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import com.leanplum.utils.SizeUtil;
import com.opera.android.browser.obml.Platform;
import com.opera.api.Callback;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.b;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class z3 implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ z3(u02 u02Var, fka fkaVar) {
        this.a = (byte) 27;
        this.b = fkaVar;
    }

    public final Object invoke(Object obj) {
        Object qjaVar;
        byte b = this.a;
        boolean zBooleanValue = false;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return obj == ((a4) obj2) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                bsb bsbVar = (bsb) obj2;
                bsbVar.N((String) CollectionsKt.Q(bsbVar.a), (b) obj);
                return Unit.a;
            case 2:
                f5 f5Var = (f5) obj2;
                Map.Entry entry = (Map.Entry) obj;
                b5 b5Var = f5.c;
                Object key = entry.getKey();
                StringBuilder sb = new StringBuilder(key == f5Var ? "(this Map)" : String.valueOf(key));
                sb.append('=');
                Object value = entry.getValue();
                sb.append(value != f5Var ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 3:
                qb qbVar = (qb) obj2;
                ipf ipfVar = (ipf) obj;
                ipf ipfVar2 = qbVar.e;
                gpf gpfVar = gpf.a;
                if (Intrinsics.a(ipfVar2, gpfVar)) {
                    if (ipfVar instanceof fpf) {
                        qbVar.b(((fpf) ipfVar).a);
                    } else if (ipfVar instanceof cpf) {
                        qbVar.b(((cpf) ipfVar).a);
                    } else if (!Intrinsics.a(ipfVar, epf.a) && !Intrinsics.a(ipfVar, gpfVar)) {
                        h9o.p();
                        return null;
                    }
                }
                qbVar.e = ipfVar;
                return Unit.a;
            case 4:
                hd hdVar = (hd) obj2;
                hdVar.x(l08.a);
                vml.a((c4) hdVar.g);
                return Unit.a;
            case 5:
                ie ieVar = (ie) obj2;
                Integer num = (Integer) obj;
                num.getClass();
                ieVar.e.P(num, ieVar.f, vr0.g);
                return Unit.a;
            case 6:
                xk xkVar = (xk) obj2;
                n6j n6jVar = (n6j) obj;
                n6j.c(n6jVar, 1, 2132018012, 2131362139, 0, null, 56);
                n6jVar.a(xkVar.h.a);
                n6jVar.a(xkVar.g.a);
                return Unit.a;
            case 7:
                as asVar = (as) obj2;
                String str = (String) obj;
                asVar.E = str;
                asVar.R0(str);
                return Unit.a;
            case 8:
                ((xs) obj2).f();
                return Unit.a;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                ((nt) obj2).l();
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((q3) obj2).invoke(new sw7((w3g) obj));
                return Unit.a;
            case 11:
                ev evVar = (ev) obj2;
                evVar.q.invoke((ifl) obj, z4o.N(evVar, j41.b));
                return Unit.a;
            case 12:
                hd hdVar2 = (hd) obj2;
                hdVar2.f = (Bitmap) obj;
                hv hvVar = (hv) hdVar2.g;
                hdVar2.g = null;
                if (hdVar2.b && hvVar != null) {
                    hvVar.invoke();
                }
                return Unit.a;
            case 13:
                v00 v00Var = (v00) obj2;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue2 = bool.booleanValue();
                if (!bool.equals(v00Var.c)) {
                    v00Var.c = bool;
                    if (zBooleanValue2) {
                        String strC = Platform.c();
                        try {
                            phf.a.getClass();
                            v00Var.a(new orb(sjo.d(strC)));
                        } catch (IllegalArgumentException | JSONException unused) {
                        }
                    } else {
                        String string = v00Var.b.a.getString("ad.adx.last_cookie", null);
                        if (string != null) {
                            orb orbVar = new orb(string);
                            String strE = orbVar.e("Domain");
                            String strE2 = orbVar.e("Name");
                            if (!rm5.c0(strE2)) {
                                bxl.d("Invalid name: ".concat(strE2));
                                return null;
                            }
                            String strConcat = strE2.concat("=; Max-Age=0");
                            if (!rm5.b0(strE)) {
                                bxl.d("Invalid domain: ".concat(strE));
                                return null;
                            }
                            N.MtwtLBqE(false, new Uri.Builder().scheme("https").authority(strE).path("/").build().toString(), sko.k(strConcat, "; Domain=", strE.toLowerCase(Locale.ROOT)), new c4(v00Var, (byte) 15));
                        }
                    }
                }
                return Unit.a;
            case 14:
                hv0 hv0Var = (hv0) obj2;
                hv0Var.i = (Boolean) obj;
                hv0Var.c.c();
                return Unit.a;
            case 15:
                n3c n3cVar = (n3c) obj2;
                xz0 xz0Var = (xz0) obj;
                if (xz0Var.G() == Integer.MAX_VALUE) {
                    return Unit.a;
                }
                if (xz0Var.a().b) {
                    xz0Var.t();
                }
                for (Map.Entry entry2 : xz0Var.a().i.entrySet()) {
                    n3cVar.a((sz0) entry2.getKey(), ((Number) entry2.getValue()).intValue(), xz0Var.C());
                }
                for (wye wyeVar = ((wye) xz0Var.C()).w; !Intrinsics.a(wyeVar, n3cVar.a.C()); wyeVar = wyeVar.w) {
                    for (sz0 sz0Var : n3cVar.b(wyeVar).keySet()) {
                        n3cVar.a(sz0Var, n3cVar.c(wyeVar, sz0Var), wyeVar);
                    }
                }
                return Unit.a;
            case 16:
                return Boolean.valueOf(((vg9) obj).a1(((lf9) obj2).a));
            case 17:
                m1d m1dVar = (m1d) obj;
                v31 v31Var = ((p31) obj2).p;
                if (v31Var.q.h.h() > 0) {
                    jde jdeVar = o3o.a;
                    m1dVar.a = true;
                    o1d o1dVar = m1dVar.d;
                    b2c b2cVarA0 = o1dVar.A0();
                    if (ybb.a(m1dVar.b, 9223372034707292159L)) {
                        m1dVar.b = scd.f0(b2cVarA0.K(0L));
                        m1dVar.c = b2cVarA0.h();
                    }
                    o1dVar.D0().G.b();
                    long jH = b2cVarA0.h();
                    v9b v9bVar = v31Var.q;
                    see seeVar = v9bVar.g;
                    int i = (int) (jH >> 32);
                    int i2 = (int) (jH & 4294967295L);
                    for (n3o n3oVar : o3o.b) {
                        d4o d4oVar = (d4o) seeVar.g(n3oVar);
                        o3o.a(m1dVar, n3oVar.c, d4oVar.h, i, i2);
                        if (((Boolean) d4oVar.b.getValue()).booleanValue()) {
                            o3o.a(m1dVar, d4oVar.f, d4oVar.j, i, i2);
                            o3o.a(m1dVar, d4oVar.g, d4oVar.k, i, i2);
                        }
                        o3o.a(m1dVar, n3oVar.d, d4oVar.i, i, i2);
                    }
                    dee deeVar = v9bVar.i;
                    if (deeVar.j()) {
                        puj pujVar = v9bVar.j;
                        Object[] objArr = deeVar.a;
                        int i3 = deeVar.b;
                        for (int i4 = 0; i4 < i3; i4++) {
                            afe afeVar = (afe) objArr[i4];
                            k8b k8bVar = (k8b) pujVar.get(i4);
                            Rect rect = (Rect) afeVar.getValue();
                            m1dVar.a(k8bVar.b(), rect.left);
                            m1dVar.a(k8bVar.d(), rect.top);
                            m1dVar.a(k8bVar.c(), rect.right);
                            m1dVar.a(k8bVar.a(), rect.bottom);
                        }
                    }
                }
                return Unit.a;
            case SizeUtil.textSize0_1 /* 18 */:
                return Boolean.valueOf(((jde) obj2).b(((k0j) obj).f));
            case 19:
                return Boolean.valueOf(cqp.k0((k0j) obj, (Resources) obj2));
            case SizeUtil.textSize0 /* 20 */:
                ((q0j) obj).b(hzi.a, new gzi(x6a.a, ((k9f) obj2).a(), fzi.b, true));
                return Unit.a;
            case 21:
                ve5 ve5Var = (ve5) obj2;
                ucd ucdVarI = f51.f.i((String) obj);
                if (ucdVarI != null) {
                    e5 e5Var = ucdVarI.c;
                    zBooleanValue = ((Boolean) ve5Var.invoke(e5Var.g(1).a, e5Var.g(2).a)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case SizeUtil.textSize1 /* 22 */:
                ((m3c) obj2).a0((n27) obj);
                return Unit.a;
            case 23:
                ru1 ru1Var = (ru1) obj2;
                n6j n6jVar2 = (n6j) obj;
                qu1[] qu1VarArr = qu1.a;
                n6j.d(n6jVar2, 7, 2132021447, new int[]{2131364372, 2131364371, 2131364320, 2131364370}, null, 56);
                n6j.c(n6jVar2, 1, 2132022364, 2131364379, 2131232305, null, 48);
                n6jVar2.a(ru1Var.f.a);
                n6j.c(n6jVar2, 3, 2132021215, 2131364294, 2131232057, null, 48);
                n6j.c(n6jVar2, 4, 2132021406, 2131364343, 2131232272, null, 48);
                n6j.c(n6jVar2, 5, 2132021075, 2131364255, 2131231978, null, 48);
                n6j.c(n6jVar2, 6, 2132021227, 2131364373, 2131232228, null, 48);
                n6jVar2.a(ru1Var.g.a);
                n6jVar2.a(ru1Var.h.a);
                n6j.c(n6jVar2, 8, 2132017582, 2131364261, 2131231982, null, 48);
                n6j.c(n6jVar2, 9, 2132018448, 2131364260, 2131232092, null, 48);
                return Unit.a;
            case SizeUtil.textSize2 /* 24 */:
                qn qnVar = (qn) obj2;
                t0i t0iVar = (t0i) obj;
                Object obj3 = t0iVar.a;
                if (!(obj3 instanceof q0i) && ((Boolean) obj3).booleanValue()) {
                    qnVar.run();
                }
                return t0iVar;
            case 25:
                vy1 vy1Var = (vy1) obj2;
                vx1 vx1Var = (vx1) obj;
                if (Intrinsics.a(vy1Var, sy1.e) || (vy1Var instanceof uy1)) {
                    return new sx1(vx1Var);
                }
                if (vy1Var instanceof ty1) {
                    return new rx1(vx1Var.a, vx1Var.b, vx1Var.c);
                }
                if (Intrinsics.a(vy1Var, sy1.a)) {
                    return new px1(vx1Var, ey1.b);
                }
                if (Intrinsics.a(vy1Var, sy1.c)) {
                    return new px1(vx1Var, ey1.c);
                }
                if (Intrinsics.a(vy1Var, sy1.d)) {
                    return new px1(vx1Var, ey1.d);
                }
                if (Intrinsics.a(vy1Var, sy1.b)) {
                    return new px1(vx1Var, ey1.e);
                }
                h9o.p();
                return null;
            case 26:
                Callback callback = (Callback) obj2;
                Object obj4 = ((t0i) obj).a;
                if (t0i.d(obj4) == null) {
                    callback.run((ly1) obj4);
                } else {
                    callback.run(null);
                }
                return Unit.a;
            case 27:
                u02.I((tw7) obj, (fka) obj2);
                return Unit.a;
            case 28:
                String str2 = (String) obj;
                ((fka) obj2).n(new sw7(str2 != null ? new tka(str2) : null));
                return Unit.a;
            default:
                gka gkaVar = (gka) obj2;
                yz1 yz1Var = (yz1) obj;
                if (Intrinsics.a(yz1Var, wz1.b)) {
                    qjaVar = new uja();
                } else if (Intrinsics.a(yz1Var, wz1.a)) {
                    qjaVar = new qja(new sja(rja.ACCESS_DENIED));
                } else {
                    if (!(yz1Var instanceof xz1)) {
                        h9o.p();
                        return null;
                    }
                    qjaVar = new qja(new sja(rja.UNKNOWN));
                }
                gkaVar.n(new sw7(qjaVar));
                return Unit.a;
        }
    }
}
