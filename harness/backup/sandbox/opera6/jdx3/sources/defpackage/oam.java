package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.ads.interactivemedia.v3.internal.zztc;
import com.opera.android.settings.SettingsManager;
import com.opera.android.settings.UserSettingsContentProvider;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class oam implements ovm, bag, ann, lnk, ylo, htp {
    public final Object a;
    public final Object b;
    public final Object c;

    public oam() {
        this.a = new WeakHashMap();
        this.b = new WeakHashMap();
        this.c = new WeakHashMap();
    }

    public oam(Context context) {
        this.a = context;
        this.b = z4c.b(new thk((byte) 27));
        this.c = new y3d(16);
    }

    public oam(SettingsManager settingsManager, eq6 eq6Var) {
        this.a = eq6Var;
        this.b = uyg.d(settingsManager, "ga_usage_statistics", new sul((byte) 16));
        this.c = ipe.c(1, 0, (h04) null, 6);
    }

    public /* synthetic */ oam(Object obj, Object obj2, Object obj3) {
        this.a = obj2;
        this.b = obj3;
        this.c = obj;
    }

    public oam(ArrayList arrayList) {
        this.a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.b = new long[arrayList.size() << 1];
        for (int i = 0; i < arrayList.size(); i++) {
            gzn gznVar = (gzn) arrayList.get(i);
            int i2 = i << 1;
            long[] jArr = (long[]) this.b;
            jArr[i2] = gznVar.b;
            jArr[i2 + 1] = gznVar.c;
        }
        long[] jArr2 = (long[]) this.b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public oam(List list) {
        this.a = list;
        this.b = new hyl[list.size()];
        pr prVar = new pr(new crk(this, (byte) 29));
        this.c = prVar;
        prVar.D(3);
    }

    public oam(rwo rwoVar) {
        this.b = new ArrayList(1);
        this.a = new Handler(Looper.getMainLooper());
        this.c = rwoVar;
    }

    public oam(wpp wppVar, ExecutorService executorService, oqp oqpVar) {
        this.c = zztc.a(executorService);
        this.a = oqpVar;
        this.b = wppVar;
    }

    public /* synthetic */ oam(boolean z, Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final Object a() {
        Context context = ((h61) this.a).a;
        igp igpVar = (igp) ((vlo) this.b).a();
        rgh rghVar = (rgh) this.c;
        return new ypo(context, igpVar, new mgh((h61) rghVar.a, (ylo) rghVar.b, (byte) 13), new yfp((byte) 1));
    }

    @Override // defpackage.htp
    public final void b(ZipFile zipFile, HashSet hashSet) {
        HashSet hashSet2 = (HashSet) this.a;
        utp utpVar = (utp) this.c;
        eqp eqpVar = (eqp) this.b;
        HashSet hashSet3 = new HashSet();
        utpVar.c(eqpVar, hashSet, new wtm(hashSet3, eqpVar, zipFile));
        hashSet2.addAll(hashSet3);
    }

    public final void c(long j, g1g g1gVar) {
        if (g1gVar.a() >= 9) {
            int iM = g1gVar.m();
            int iM2 = g1gVar.m();
            int iA = g1gVar.A();
            if (iM == 434 && iM2 == 1195456820 && iA == 3) {
                ((pr) this.c).b(j, g1gVar);
            }
        }
    }

    @Override // defpackage.ann
    public final void d() {
        m();
    }

    @Override // defpackage.ann
    public final void e() {
        m();
    }

    @Override // defpackage.ovm
    public final int f(String str) {
        synchronized (((UserSettingsContentProvider) this.c).b) {
            String strB = UserSettingsContentProvider.b(str);
            SharedPreferences sharedPreferences = (SharedPreferences) ((UserSettingsContentProvider) this.c).a.get();
            String asString = ((ContentValues) this.a).getAsString(str);
            String string = sharedPreferences.contains(strB) ? sharedPreferences.getString(strB, null) : ((ContentValues) this.a).getAsString("__uscp_predefined_default");
            sharedPreferences.edit().putString(strB, asString).apply();
            if (sharedPreferences.contains(str) || TextUtils.equals(asString, string)) {
                return 0;
            }
            ((UserSettingsContentProvider) this.c).i((Uri) this.b);
            return 1;
        }
    }

    public final List getCues(long j) {
        List list = (List) this.a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            long[] jArr = (long[]) this.b;
            int i2 = i << 1;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                gzn gznVar = (gzn) list.get(i);
                x36 x36Var = gznVar.a;
                if (x36Var.e == -3.4028235E38f) {
                    arrayList2.add(gznVar);
                } else {
                    arrayList.add(x36Var);
                }
            }
        }
        Collections.sort(arrayList2, new omj((byte) 22));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            w36 w36VarA = ((gzn) arrayList2.get(i3)).a.a();
            w36VarA.e = (-1) - i3;
            w36VarA.f = 1;
            arrayList.add(w36VarA.a());
        }
        return arrayList;
    }

    public final long getEventTime(int i) {
        long[] jArr = (long[]) this.c;
        z4o.w(i >= 0);
        z4o.w(i < jArr.length);
        return jArr[i];
    }

    public final int getEventTimeCount() {
        return ((long[]) this.c).length;
    }

    public final int getNextEventTimeIndex(long j) {
        long[] jArr = (long[]) this.c;
        int iB = tym.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    @Override // defpackage.ovm
    public final int h(String str) {
        long jLongValue;
        synchronized (((UserSettingsContentProvider) this.c).b) {
            String strB = UserSettingsContentProvider.b(str);
            SharedPreferences sharedPreferences = (SharedPreferences) ((UserSettingsContentProvider) this.c).a.get();
            long j = sharedPreferences.contains(strB) ? sharedPreferences.getLong(strB, 0L) : ((ContentValues) this.a).getAsLong("__uscp_predefined_default").longValue();
            boolean zContainsKey = ((ContentValues) this.a).containsKey(str);
            ContentValues contentValues = (ContentValues) this.a;
            if (zContainsKey) {
                jLongValue = contentValues.getAsLong(str).longValue();
                sharedPreferences.edit().putLong(strB, jLongValue).apply();
            } else {
                jLongValue = contentValues.getAsLong("__uscp_predefined_default").longValue();
                sharedPreferences.edit().remove(strB).apply();
            }
            if (sharedPreferences.contains(str) || j == jLongValue) {
                return 0;
            }
            ((UserSettingsContentProvider) this.c).i((Uri) this.b);
            return 1;
        }
    }

    @Override // defpackage.ovm
    public final int i(String str) {
        int iIntValue;
        synchronized (((UserSettingsContentProvider) this.c).b) {
            if ("previous_version_code".equals(str) || "version_code".equals(str)) {
                return 0;
            }
            String strB = UserSettingsContentProvider.b(str);
            SharedPreferences sharedPreferences = (SharedPreferences) ((UserSettingsContentProvider) this.c).a.get();
            int i = sharedPreferences.contains(strB) ? sharedPreferences.getInt(strB, 0) : ((ContentValues) this.a).getAsInteger("__uscp_predefined_default").intValue();
            boolean zContainsKey = ((ContentValues) this.a).containsKey(str);
            ContentValues contentValues = (ContentValues) this.a;
            if (zContainsKey) {
                iIntValue = contentValues.getAsInteger(str).intValue();
                sharedPreferences.edit().putInt(strB, iIntValue).apply();
            } else {
                iIntValue = contentValues.getAsInteger("__uscp_predefined_default").intValue();
                sharedPreferences.edit().remove(strB).apply();
            }
            if (sharedPreferences.contains(str) || i == iIntValue) {
                return 0;
            }
            ((UserSettingsContentProvider) this.c).i((Uri) this.b);
            return 1;
        }
    }

    public final void j(en8 en8Var, s7m s7mVar) {
        hyl[] hylVarArr = (hyl[]) this.b;
        for (int i = 0; i < hylVarArr.length; i++) {
            s7mVar.a();
            s7mVar.b();
            hyl hylVarTrack = en8Var.track(s7mVar.d, 3);
            oj9 oj9Var = (oj9) ((List) this.a).get(i);
            String str = oj9Var.n;
            z4o.y("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: %s", str);
            nj9 nj9Var = new nj9();
            s7mVar.b();
            nj9Var.a = s7mVar.e;
            nj9Var.l = dzd.p("video/mp2t");
            nj9Var.m = dzd.p(str);
            nj9Var.e = oj9Var.e;
            nj9Var.d = oj9Var.d;
            nj9Var.J = oj9Var.K;
            nj9Var.p = oj9Var.q;
            z1m.q(nj9Var, hylVarTrack);
            hylVarArr[i] = hylVarTrack;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.s3f r9, nt5 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.ufo
            if (r0 == 0) goto L14
            r0 = r10
            ufo r0 = (defpackage.ufo) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.v = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ufo r0 = new ufo
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.t
            px5 r0 = px5.a
            int r1 = r6.v
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            ybh.y(r10)
            goto L72
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r8)
            return r3
        L30:
            ybh.y(r10)
            r10 = r3
            ceo r3 = new ceo
            r1 = 9
            r3.<init>(r9, r8, r1)
            java.lang.Object r9 = r8.c
            r1 = r9
            qe6 r1 = (defpackage.qe6) r1
            java.lang.Object r8 = r8.b
            pna r8 = (pna) r8
            java.lang.Class<t0i> r9 = t0i.class
            s15 r4 = uqh.a(r9)
            java.lang.Class<v3f> r5 = defpackage.v3f.class
            cam r5 = uqh.d(r5)     // Catch: java.lang.Throwable -> L5f
            ztb r7 = kotlin.reflect.KTypeProjection.c     // Catch: java.lang.Throwable -> L5f
            r7.getClass()     // Catch: java.lang.Throwable -> L5f
            kotlin.reflect.KTypeProjection r5 = ztb.a(r5)     // Catch: java.lang.Throwable -> L5f
            cam r9 = uqh.e(r9, r5)     // Catch: java.lang.Throwable -> L5f
        L5d:
            r10 = r4
            goto L61
        L5f:
            r9 = r10
            goto L5d
        L61:
            x9m r4 = new x9m
            r4.<init>(r10, r9)
            r6.v = r2
            java.lang.String r5 = ""
            r2 = r8
            java.lang.Object r10 = r1.U(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L72
            return r0
        L72:
            t0i r10 = (t0i) r10
            java.lang.Object r8 = r10.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oam.k(s3f, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r12, nt5 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.nam
            if (r0 == 0) goto L13
            r0 = r13
            nam r0 = (defpackage.nam) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            nam r0 = new nam
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L2b
            java.lang.String r12 = r0.t
            ybh.y(r13)
            goto La5
        L2b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r11)
            return r3
        L31:
            ybh.y(r13)
            r0.t = r12
            r0.w = r4
            bhi r13 = new bhi
            mt5 r0 = hib.b(r0)
            r13.<init>(r0)
            java.lang.Object r0 = r11.a
            android.content.Context r0 = (android.content.Context) r0
            th9 r2 = new th9
            r5 = 2130903048(0x7f030008, float:1.7412903E38)
            r2.<init>(r12, r5)
            mam r5 = new mam
            r5.<init>(r13, r12)
            java.lang.Object r6 = r11.b
            zyk r6 = (zyk) r6
            java.lang.Object r6 = r6.getValue()
            android.os.Handler r6 = (android.os.Handler) r6
            s6h r7 = new s6h
            android.os.Looper r8 = android.os.Looper.myLooper()
            if (r8 != 0) goto L6e
            android.os.Handler r8 = new android.os.Handler
            android.os.Looper r9 = android.os.Looper.getMainLooper()
            r8.<init>(r9)
            goto L73
        L6e:
            android.os.Handler r8 = new android.os.Handler
            r8.<init>()
        L73:
            wd2 r9 = new wd2
            r10 = 2
            r9.<init>(r8, r10)
            r8 = 0
            r7.<init>(r5, r9, r8)
            wd2 r5 = new wd2
            r5.<init>(r6, r10)
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            r2 = r2[r8]
            java.util.Objects.requireNonNull(r2)
            r6.add(r2)
            java.util.List r2 = java.util.Collections.unmodifiableList(r6)
            yh9.c(r0, r2, r8, r5, r7)
            java.lang.Object r13 = r13.a()
            if (r13 != r1) goto La5
            return r1
        La5:
            android.graphics.Typeface r13 = (android.graphics.Typeface) r13
            if (r13 != 0) goto Laa
            return r3
        Laa:
            java.lang.Object r11 = r11.c
            y3d r11 = (y3d) r11
            r11.put(r12, r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oam.l(java.lang.String, nt5):java.lang.Object");
    }

    public final void m() {
        String str = (String) this.b;
        bmn bmnVar = (bmn) this.c;
        if (str.equals(bmnVar.e)) {
            String str2 = bmnVar.e;
            vkn vknVar = bmnVar.f;
            if (vknVar != null) {
                vknVar.f.r(str2);
            }
            vkn vknVar2 = bmnVar.f;
            if (vknVar2 != null) {
                bmnVar.e = null;
                vknVar2.e.r(null);
            }
        }
    }

    @Override // defpackage.bag
    public final b87 o(Activity activity, vdf vdfVar, vdf vdfVar2, o8f o8fVar) {
        return p(activity, vdfVar, vdfVar2, o8fVar);
    }

    @Override // defpackage.bag
    public final b87 p(Context context, Runnable runnable, Runnable runnable2, Callback callback) {
        mw0 mw0Var = (mw0) this.c;
        if (mw0Var == null) {
            return null;
        }
        String string = context.getString(2132017446, context.getString(2132017424));
        String string2 = context.getString(2132017445, context.getString(2132017424));
        qxh qxhVar = string2 != null ? new qxh(string2) : null;
        qj qjVar = new qj(runnable, (byte) 1);
        xj xjVar = new xj(mw0Var.a, runnable2, (byte) 7);
        lw0 lw0Var = new lw0(callback, (byte) 0);
        gkj gkjVar = new gkj(false, false);
        gkjVar.a = null;
        gkjVar.b = null;
        gkjVar.c = null;
        gkjVar.d = string;
        gkjVar.e = lw0Var;
        gkjVar.f = null;
        gkjVar.g = null;
        gkjVar.h = xjVar;
        gkjVar.i = qjVar;
        gkjVar.j = null;
        gkjVar.k = 2132019218;
        gkjVar.l = 2132020202;
        gkjVar.m = 0;
        gkjVar.n = false;
        gkjVar.o = qxhVar;
        return gkjVar;
    }

    public final void q(String str) {
        d93 d93Var = (d93) this.b;
        rtm rtmVar = (rtm) this.c;
        if (rtmVar.e == ((wtm) this.a)) {
            rtmVar.e = null;
            boolean z = rtmVar.d;
            if (z) {
                return;
            }
            if (str != null) {
                rtmVar.e(d93Var, str, true);
                rtmVar.d(d93Var, str);
            } else {
                qtm qtmVar = new qtm(d93Var.a, d93Var.b, d93Var.c, null);
                if (z) {
                    return;
                }
                rtmVar.a.E(qtmVar, false);
            }
        }
    }

    public final void r() {
        ArrayList arrayList = (ArrayList) this.b;
        ((rwo) this.c).getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((epp) obj).getClass();
        }
        ((Handler) this.a).postDelayed(new uqp(this, (byte) 0), 200L);
    }

    @Override // defpackage.bag
    public final void s() {
        ((y47) this.b).invoke();
    }

    @Override // defpackage.bag
    public final void t() {
        ((uef) this.a).invoke();
    }

    @Override // defpackage.ann
    public final void u(bnn bnnVar) {
        m();
    }

    @Override // defpackage.ann
    public final void z(cnn cnnVar) {
        String str = (String) this.a;
        bmn bmnVar = (bmn) this.c;
        vkn vknVar = bmnVar.f;
        if (vknVar != null) {
            ujn ujnVar = vknVar.a;
            ujnVar.notifyItemChanged(ujnVar.P(str));
        }
        String str2 = (String) this.b;
        vkn vknVar2 = bmnVar.f;
        if (vknVar2 != null) {
            ujn ujnVar2 = vknVar2.a;
            ujnVar2.notifyItemChanged(ujnVar2.P(str2));
        }
        if (str2.equals(bmnVar.e)) {
            qln qlnVar = bmnVar.b;
            byte b = bmnVar.a;
            qlnVar.p(b != 0 ? b != 1 ? b != 2 ? b != 3 ? 2 : 6 : 5 : 4 : 3, str2);
            vkn vknVar3 = bmnVar.f;
            if (vknVar3 != null) {
                bmnVar.e = null;
                vknVar3.e.r(null);
            }
        }
    }
}
