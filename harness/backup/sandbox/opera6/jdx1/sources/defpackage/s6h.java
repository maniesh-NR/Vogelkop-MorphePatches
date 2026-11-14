package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.autofill.AutofillManager;
import androidx.collection.ArrayMap;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.i;
import com.opera.android.BrowserActivity;
import com.opera.android.FullscreenWebActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s6h implements l2j, roo, rba, rj2, bcf, kkk, jvk, uya, yf3, v18 {
    public static final String[] c = {"reason_group", "reason_map"};
    public Object a;
    public Object b;

    public s6h(byte b) {
        switch (b) {
            case 26:
                this.a = new dfe(new m3c[16]);
                break;
            default:
                tpl tplVar = tpl.a;
                this.a = tplVar;
                this.b = tplVar.a();
                break;
        }
    }

    public /* synthetic */ s6h(Object obj) {
        this.a = obj;
    }

    public /* synthetic */ s6h(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ s6h(Object obj, Object obj2, boolean z) {
        this.a = obj;
        this.b = obj2;
    }

    public static s6h D(kvb kvbVar) {
        return new s6h(kvbVar, sym.c(kvbVar.x()));
    }

    public static void H(m3c m3cVar) {
        if (m3cVar.P > 0) {
            if (m3cVar.G.d == i3c.e && !m3cVar.p() && !m3cVar.q() && !m3cVar.Q && m3cVar.I()) {
                b8e b8eVar = (b8e) m3cVar.F.g;
                if ((b8eVar.d & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                    while (b8eVar != null) {
                        if ((b8eVar.c & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                            b8e b8eVarU = b8eVar;
                            dfe dfeVar = null;
                            while (b8eVarU != null) {
                                if (b8eVarU instanceof gz9) {
                                    gz9 gz9Var = (gz9) b8eVarU;
                                    gz9Var.G(ui6.c0(gz9Var, NotificationCompat.FLAG_LOCAL_ONLY));
                                } else if ((b8eVarU.c & NotificationCompat.FLAG_LOCAL_ONLY) != 0 && (b8eVarU instanceof i17)) {
                                    int i = 0;
                                    for (b8e b8eVar2 = ((i17) b8eVarU).p; b8eVar2 != null; b8eVar2 = b8eVar2.f) {
                                        if ((b8eVar2.c & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                                            i++;
                                            if (i == 1) {
                                                b8eVarU = b8eVar2;
                                            } else {
                                                if (dfeVar == null) {
                                                    dfeVar = new dfe(new b8e[16]);
                                                }
                                                if (b8eVarU != null) {
                                                    dfeVar.c(b8eVarU);
                                                    b8eVarU = null;
                                                }
                                                dfeVar.c(b8eVar2);
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                b8eVarU = ui6.U(dfeVar);
                            }
                        }
                        if ((b8eVar.d & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
                            break;
                        } else {
                            b8eVar = b8eVar.f;
                        }
                    }
                }
            }
            m3cVar.O = false;
            dfe dfeVarZ = m3cVar.z();
            Object[] objArr = dfeVarZ.a;
            int i2 = dfeVarZ.c;
            for (int i3 = 0; i3 < i2; i3++) {
                H((m3c) objArr[i3]);
            }
        }
    }

    public static ArrayMap K(Context context, String str) throws JSONException {
        Cursor cursorQuery = context.getContentResolver().query(are.f(context), c, sko.k("reason_group=\"", str, "\""), null, null);
        ArrayMap arrayMap = null;
        if (cursorQuery == null) {
            return null;
        }
        if (cursorQuery.moveToFirst()) {
            try {
                JSONObject jSONObject = new JSONObject(cursorQuery.getString(1));
                ArrayMap arrayMap2 = new ArrayMap(0);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    try {
                        String next = itKeys.next();
                        JSONArray jSONArray = jSONObject.getJSONArray(next);
                        ArrayList arrayList = new ArrayList(jSONArray.length());
                        for (int i = 0; i < jSONArray.length(); i++) {
                            try {
                                arrayList.add(tx8.a(new orb(jSONArray.getJSONObject(i))));
                            } catch (JSONException unused) {
                            }
                        }
                        if (arrayList.isEmpty()) {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            arrayMap2.put(next, arrayList);
                        }
                    } catch (JSONException unused2) {
                    }
                }
                if (!arrayMap2.isEmpty()) {
                    arrayMap = arrayMap2;
                }
            } catch (JSONException unused3) {
            }
        }
        xvg.l(cursorQuery);
        return arrayMap;
    }

    public static ContentValues R(String str, Map map) throws JSONException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("reason_group", str);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            vpb vpbVarM0 = o0g.M0((List) entry.getValue());
            try {
                jSONObject.put((String) entry.getKey(), orb.t(vpbVarM0));
            } catch (JSONException e) {
                t3p.n(e);
                return null;
            }
        }
        contentValues.put("reason_map", jSONObject.toString());
        return contentValues;
    }

    public final void A(Enum r2, Object obj) {
        ((HashMap) this.a).put(r2, obj);
        ((HashMap) this.b).put(obj, r2);
    }

    public final c5o B() {
        return new c5o(Collections.unmodifiableMap((HashMap) this.a), Collections.unmodifiableMap((HashMap) this.b));
    }

    public final d5j E(qya qyaVar) {
        hbl hblVar;
        if (qyaVar == null) {
            return null;
        }
        if (((s1h) this.b) == null) {
            hblVar = hbl.b;
        } else {
            s1h s1hVar = (s1h) this.b;
            Pair pair = new Pair(s1hVar.g, s1hVar.h.get(0));
            hbl hblVar2 = hbl.b;
            android.util.ArrayMap arrayMap = new android.util.ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            hblVar = new hbl(arrayMap);
        }
        this.b = null;
        return new d5j(qyaVar, new Size(qyaVar.getWidth(), qyaVar.getHeight()), new zb4(new qq8(qyaVar.h1().e(), (Object) null, hblVar)));
    }

    public final void F(i iVar, i iVar2) {
        zld zldVar = (zld) ((i4d) this.b).b;
        qjd qjdVar = ((cmd) iVar).e;
        qjd qjdVar2 = ((cmd) iVar2).e;
        xbf xbfVar = zldVar.b;
        ode odeVar = (ode) xbfVar.c;
        tjg tjgVar = (tjg) xbfVar.b;
        boolean shuffleModeEnabled = ((gig) odeVar.g()).getShuffleModeEnabled();
        boolean z = zldVar.i;
        if (!shuffleModeEnabled) {
            if (z) {
                return;
            }
            int iIndexOf = zldVar.g.indexOf(qjdVar);
            int iIndexOf2 = zldVar.g.indexOf(qjdVar2);
            if (iIndexOf == -1 || iIndexOf2 == -1) {
                return;
            }
            zldVar.i = true;
            okg okgVar = tjgVar.k;
            okgVar.c.c(iIndexOf, iIndexOf2);
            okgVar.b.b();
            return;
        }
        if (z || !((gig) odeVar.g()).getShuffleModeEnabled() || sfe.N(zldVar.g, zldVar.h)) {
            return;
        }
        zldVar.i = true;
        gig gigVar = (gig) odeVar.g();
        List list = zldVar.g;
        List list2 = zldVar.h;
        if (gigVar.getShuffleModeEnabled()) {
            uup.k(new evc(list, list2), true).a(new qie(tjgVar, (byte) 8));
            gigVar.setShuffleModeEnabled(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.a
            dfe r0 = (defpackage.dfe) r0
            yg9 r1 = defpackage.yg9.g
            java.lang.Object[] r2 = r0.a
            int r3 = r0.c
            r4 = 0
            java.util.Arrays.sort(r2, r4, r3, r1)
            int r1 = r0.c
            java.lang.Object r2 = r6.b
            m3c[] r2 = (defpackage.m3c[]) r2
            if (r2 == 0) goto L19
            int r3 = r2.length
            if (r3 >= r1) goto L21
        L19:
            r2 = 16
            int r2 = java.lang.Math.max(r2, r1)
            m3c[] r2 = new defpackage.m3c[r2]
        L21:
            r3 = 0
            r6.b = r3
        L24:
            if (r4 >= r1) goto L2f
            java.lang.Object[] r5 = r0.a
            r5 = r5[r4]
            r2[r4] = r5
            int r4 = r4 + 1
            goto L24
        L2f:
            r0.h()
            int r1 = r1 + (-1)
        L34:
            r0 = -1
            if (r0 >= r1) goto L45
            r0 = r2[r1]
            boolean r4 = r0.O
            if (r4 == 0) goto L40
            H(r0)
        L40:
            r2[r1] = r3
            int r1 = r1 + (-1)
            goto L34
        L45:
            r6.b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6h.G():void");
    }

    public final boolean I() {
        long jD = ((upl) this.a).m16a().D((sc5) this.b);
        on7 on7Var = pn7.b;
        return pn7.c(jD, cs5.x0(ViewConfiguration.getDoubleTapTimeout(), un7.d)) > 0;
    }

    public final AutofillManager J() {
        AutofillManager autofillManager = (AutofillManager) this.b;
        if (autofillManager != null) {
            return autofillManager;
        }
        AutofillManager autofillManager2 = (AutofillManager) ((Context) this.a).getSystemService(AutofillManager.class);
        if (autofillManager2 != null) {
            this.b = autofillManager2;
            return autofillManager2;
        }
        qp2.n("Could not locate AutofillManager from context");
        return null;
    }

    public final void L(View view, int i, boolean z) {
        J().notifyViewVisibilityChanged(view, i, z);
    }

    public final void M(xh9 xh9Var) {
        wd2 wd2Var = (wd2) this.b;
        qyn qynVar = (qyn) this.a;
        int i = xh9Var.b;
        if (i == 0) {
            wd2Var.execute(new vr9(qynVar, xh9Var.a, (byte) 4));
        } else {
            wd2Var.execute(new p94((Object) qynVar, i, (byte) 0));
        }
    }

    public final void N(j8f j8fVar, boolean z) {
        x5f x5fVar = (x5f) this.b;
        if (x5fVar.h) {
            x5fVar.k(3);
        }
        x5fVar.S(7);
        BrowserActivity browserActivity = (BrowserActivity) this.a;
        Uri url = j8fVar.getUrl();
        lqm lqmVar = lqm.d;
        if (z) {
            vx3 vx3VarA = ay3.a(wqm.E(url, "label", "cob_mdot").toString(), lqmVar, false);
            vx3VarA.o = (byte) 2;
            vx3VarA.c(true);
            ac8.a(new ay3(vx3VarA));
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", wqm.E(url, "label", "cob_app"));
        intent.setPackage("com.booking");
        intent.putExtra("com.opera.android.extra.DO_NOT_INTERCEPT", true);
        try {
            browserActivity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            vx3 vx3VarA2 = ay3.a(wqm.E(url, "label", "cob_mdot").toString(), lqmVar, false);
            vx3VarA2.o = (byte) 2;
            am2.v(vx3VarA2);
        }
    }

    public final void O(String str, String str2) {
        ((SharedPreferences) ((k32) this.a).get()).edit().putString(((String) this.b).concat(str), str2).apply();
    }

    public final void P() {
        ((SharedPreferences) ((k32) this.a).get()).edit().remove(((String) this.b).concat("today")).apply();
    }

    public final void Q() {
        Runnable runnable = (hpd) this.a;
        f0e f0eVar = (f0e) this.b;
        boolean zContains = ((Set) f0eVar.e.g()).contains(f0eVar);
        sf2 sf2Var = f0eVar.b;
        if (zContains) {
            sf2Var.b.postOnAnimation(runnable);
        } else {
            sf2Var.b.removeCallbacks(runnable);
        }
    }

    public final void Y() {
    }

    public final void a() {
        z4k z4kVar;
        ro9 ro9Var = (ro9) this.b;
        guo guoVar = (guo) this.a;
        ((z13) ro9Var.d).e = true;
        z13 z13Var = (z13) ro9Var.d;
        int i = ro9Var.b;
        ro9Var.b = i + 1;
        if (i == 0) {
            z13Var.c();
            z13Var.e();
        }
        ylp ylpVar = ((pxo) guoVar).d;
        if (ylpVar != null && (z4kVar = ((voo) ylpVar).y) != null) {
            String str = ((voo) z4kVar.b).a.a;
        }
        u13 u13Var = (u13) ro9Var.c;
        if (u13Var != null) {
            z13 z13Var2 = (z13) ro9Var.d;
            int i2 = z13Var2.k;
            System.identityHashCode(z13Var2);
            System.currentTimeMillis();
            u13Var.onAdLoaded(new q13(i2));
        }
        ((z13) ro9Var.d).d();
    }

    @Override // defpackage.v18
    public final void b(lv0 lv0Var) {
        ((l94) this.a).d(lv0Var);
    }

    public final void c() {
        u13 u13Var = (u13) ((ro9) this.b).c;
        if (u13Var != null) {
            u13Var.c();
        }
    }

    public final void c0() {
        if (((cd9) this.b).u == null) {
            return;
        }
        ((hu5) this.a).run(ad9.c);
    }

    public final void close() {
        ((rn9) this.a).close();
    }

    public final void d() {
        nv6 nv6VarB = ((ru9) ((igi) this.b).e).b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("browser_actions_unused_button_hint_shown", true);
        nv6VarB.w();
    }

    public final qya e() {
        return E(((rn9) this.a).e());
    }

    public final void g(cm cmVar) {
        ((ro9) this.b).a(cmVar);
    }

    public final int getHeight() {
        return ((rn9) this.a).getHeight();
    }

    public final Surface getSurface() {
        return ((rn9) this.a).getSurface();
    }

    public final int getWidth() {
        return ((rn9) this.a).getWidth();
    }

    public final void h(i iVar, hvk[] hvkVarArr) {
        kvk kvkVar = (kvk) this.a;
        hvkVarArr[1] = kvkVar;
        hvkVarArr[0] = kvkVar;
    }

    public final int i() {
        return ((rn9) this.a).i();
    }

    public final m54 j() {
        return (m54) this.a;
    }

    public final void k(i iVar, hvk hvkVar) {
        int iIndexOf;
        zld zldVar = (zld) ((i4d) this.b).b;
        qjd qjdVar = ((cmd) iVar).e;
        if (zldVar.i || (iIndexOf = zldVar.g.indexOf(qjdVar)) == -1) {
            return;
        }
        zldVar.i = true;
        okg okgVar = ((tjg) zldVar.b.b).k;
        okgVar.c.remove(iIndexOf);
        okgVar.b.b();
    }

    public final void l() {
        ((rn9) this.a).l();
    }

    @Override // defpackage.bcf
    public final g3o l0(View view, g3o g3oVar) {
        d3o d3oVar = g3oVar.a;
        r9b r9bVarA = r9b.a(d3oVar.i(NotificationCompat.FLAG_HIGH_PRIORITY), d3oVar.i(519));
        int i = d3oVar.n().d;
        int iMax = i > r9bVarA.d ? Math.max(0, i - ((ViewGroup) this.a).getPaddingBottom()) : 0;
        FullscreenWebActivity fullscreenWebActivity = (FullscreenWebActivity) this.b;
        if (iMax != fullscreenWebActivity.G) {
            fullscreenWebActivity.G = iMax;
            fullscreenWebActivity.d0(iMax);
        }
        return g3oVar;
    }

    @Override // defpackage.v18
    public final void m() {
        ((l94) this.a).b(null);
    }

    public final boolean n(i iVar) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117 A[EDGE_INSN: B:65:0x0117->B:50:0x0117 BREAK  A[LOOP:1: B:38:0x00e0->B:49:0x0106], SYNTHETIC] */
    @Override // defpackage.yf3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.xf3 o(defpackage.lp6 r19, long r20) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6h.o(lp6, long):xf3");
    }

    public final void onAdClicked() {
        u13 u13Var = (u13) ((ro9) this.b).c;
        if (u13Var != null) {
            u13Var.onAdClicked();
        }
    }

    @Override // defpackage.v18
    public final void p(yt7 yt7Var) {
    }

    public final int q() {
        return ((rn9) this.a).q();
    }

    @Override // defpackage.kkk
    public final void r(jkk jkkVar) {
        zde zdeVar = (zde) this.b;
        zdeVar.a();
        gee geeVar = (gee) jkkVar.b;
        Object[] objArr = geeVar.b;
        long[] jArr = geeVar.c;
        int i = geeVar.e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objB = ((j5c) this.a).b(obj);
            int iD = zdeVar.d(objB);
            int i3 = iD >= 0 ? zdeVar.c[iD] : 0;
            if (i3 == 7) {
                jkkVar.remove(obj);
            } else {
                zdeVar.g(i3 + 1, objB);
            }
            i = i2;
        }
    }

    public final void s() {
        ((rn9) this.a).J(kf0.b);
    }

    public final void t() {
        ((rn9) this.a).J(kf0.e);
    }

    @Override // defpackage.kkk
    public final boolean u(Object obj, Object obj2) {
        j5c j5cVar = (j5c) this.a;
        return Intrinsics.a(j5cVar.b(obj), j5cVar.b(obj2));
    }

    @Override // defpackage.v18
    public final void v(q18 q18Var) throws Exception {
        moh mohVar = (moh) this.b;
        r72 r72Var = mohVar.u;
        if (mohVar.k) {
            q18Var.close();
            return;
        }
        q18 q18Var2 = mohVar.t;
        if (q18Var2 != null) {
            q18Var2.close();
            mohVar.t = null;
        }
        byte b = 1;
        if ((q18Var.b.flags & 1) == 0) {
            f28 f28Var = mohVar.s;
            f28Var.g.execute(new y18(f28Var, b));
            q18Var.close();
            return;
        }
        mohVar.t = q18Var;
        if (mohVar.A == 4 && r72Var.d()) {
            return;
        }
        if (mohVar.A == 4 && r72Var.d()) {
            qp2.g("Audio is enabled but no audio sample is ready. Cannot start muxer.");
            return;
        }
        q18 q18Var3 = mohVar.t;
        if (q18Var3 == null) {
            qp2.g("Muxer cannot be started without an encoded video frame.");
            return;
        }
        try {
            mohVar.t = null;
            long j = q18Var3.b.presentationTimeUs;
            ArrayList arrayList = new ArrayList();
            while (!r72Var.d()) {
                q18 q18Var4 = (q18) r72Var.a();
                if (q18Var4.b.presentationTimeUs >= j) {
                    arrayList.add(q18Var4);
                }
            }
            q18Var3.size();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((q18) obj).size();
            }
            try {
                ((zrd) moh.l(mohVar.r)).getClass();
                moh.G.getClass();
                throw null;
            } catch (IOException e) {
                if (!rih.r(e)) {
                    throw null;
                }
                mohVar.n(3, e);
                q18Var3.close();
            }
        } catch (Throwable th) {
            try {
                q18Var3.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void w(tya tyaVar, Executor executor) {
        ((rn9) this.a).w(new z0c(this, tyaVar, (byte) 26), executor);
    }

    @Override // defpackage.yf3
    public final void x() {
        g1g g1gVar = (g1g) this.b;
        byte[] bArr = tym.b;
        g1gVar.L(bArr, bArr.length);
    }

    public final qya y() {
        return E(((rn9) this.a).y());
    }

    public final void z() {
        ((rn9) this.a).J(kf0.d);
    }
}
