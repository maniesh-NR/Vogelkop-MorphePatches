package ads_mobile_sdk;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.ads.mobile.sdk.internal.util.AndroidBundleTypeAdapterFactory;
import defpackage.flp;
import defpackage.jjj;
import defpackage.prb;
import defpackage.rap;
import defpackage.skp;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Optional;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class au2 {
    public final qr0 a;
    public final ek b;
    public final ah3 c;
    public final wp d;
    public final Optional e;
    public final skp f;
    public final bk1 g;
    public final int h;
    public final Context i;
    public boolean k;
    public boolean l;
    public Map p;
    public final m5a r;
    public jjj s;
    public prb t;
    public final prb u;
    public final LinkedHashMap v;
    public String j = "https://googleads.g.doubleclick.net/mads/gma";
    public final LinkedHashSet m = new LinkedHashSet();
    public final LinkedHashSet n = new LinkedHashSet();
    public final LinkedHashMap o = new LinkedHashMap();
    public final LinkedHashMap q = new LinkedHashMap();

    public au2(qr0 qr0Var, ek ekVar, ah3 ah3Var, wp wpVar, Optional optional, skp skpVar, bk1 bk1Var, int i, Context context) {
        this.a = qr0Var;
        this.b = ekVar;
        this.c = ah3Var;
        this.d = wpVar;
        this.e = optional;
        this.f = skpVar;
        this.g = bk1Var;
        this.h = i;
        this.i = context;
        bg8 bg8Var = bg8.c;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        sj9 sj9Var = m5a.m;
        int i2 = m5a.o;
        int i3 = m5a.p;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayList.add(new AndroidBundleTypeAdapterFactory());
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = g2k.a;
        this.r = new m5a(bg8Var, 1, new HashMap(map), false, sj9Var, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, i2, i3, new ArrayList(arrayDeque));
        this.u = new prb();
        this.v = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c6 A[Catch: all -> 0x02d1, TRY_LEAVE, TryCatch #0 {all -> 0x02d1, blocks: (B:16:0x0040, B:119:0x02c0, B:120:0x02c2, B:122:0x02c6, B:21:0x0055, B:110:0x0281, B:24:0x0064, B:100:0x0255, B:27:0x0073, B:69:0x0193), top: B:153:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02df A[Catch: all -> 0x0306, TryCatch #3 {all -> 0x0306, blocks: (B:131:0x02d8, B:133:0x02df, B:135:0x02e6, B:137:0x02ea, B:139:0x02ee, B:140:0x02ef, B:141:0x02f4, B:142:0x02f5, B:143:0x02fc, B:144:0x02fd, B:145:0x0304, B:146:0x0305), top: B:158:0x02d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0305 A[Catch: all -> 0x0306, TRY_LEAVE, TryCatch #3 {all -> 0x0306, blocks: (B:131:0x02d8, B:133:0x02df, B:135:0x02e6, B:137:0x02ea, B:139:0x02ee, B:140:0x02ef, B:141:0x02f4, B:142:0x02f5, B:143:0x02fc, B:144:0x02fd, B:145:0x0304, B:146:0x0305), top: B:158:0x02d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022e  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, jjj] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v12, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v3, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r3v17, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r3v19, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r3v21, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r3v23, types: [ads_mobile_sdk.rg3] */
    /* JADX WARN: Type inference failed for: r5v42, types: [ads_mobile_sdk.rg3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.au2 r21, defpackage.jjj r22, ads_mobile_sdk.mg2 r23, ads_mobile_sdk.hb2 r24, java.util.Map r25, nt5 r26) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.au2.a(ads_mobile_sdk.au2, jjj, ads_mobile_sdk.mg2, ads_mobile_sdk.hb2, java.util.Map, nt5):java.lang.Object");
    }

    public final Uri a() {
        LinkedHashMap linkedHashMap;
        Uri.Builder builder = new Uri.Builder();
        LinkedHashSet linkedHashSet = this.m;
        Iterator it = linkedHashSet.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = this.o;
            if (!zHasNext) {
                break;
            }
            String str = (String) it.next();
            String str2 = (String) linkedHashMap.get(str);
            if (str2 != null) {
                ddh.f(builder, str, str2);
            }
        }
        String query = builder.build().getQuery();
        if (query == null) {
            query = "";
        }
        rap rapVarA = this.d.a(query);
        hv0 hv0Var = rapVarA instanceof hv0 ? (hv0) rapVarA : null;
        String str3 = hv0Var != null ? (String) hv0Var.b : null;
        Uri.Builder builderBuildUpon = Uri.parse(this.j).buildUpon();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            LinkedHashSet linkedHashSet2 = this.n;
            if (linkedHashSet2.isEmpty() || linkedHashSet2.contains(str4)) {
                if (!linkedHashSet.contains(str4)) {
                    ddh.f(builderBuildUpon, str4, str5);
                } else if (linkedHashSet.contains(str4) && vq.a == wq.c) {
                    ddh.f(builderBuildUpon, sko.u(str4, "l"), String.valueOf(str5.length()));
                }
            }
        }
        if (str3 != null && str3.length() > 0) {
            ddh.f(builderBuildUpon, (String) this.a.a("gads:blob_url_key", "blob", fo.a$23), str3);
        }
        return builderBuildUpon.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r12v32, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v3, types: [jjj] */
    /* JADX WARN: Type inference failed for: r14v6, types: [jjj] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r1v25, types: [jjj] */
    /* JADX WARN: Type inference failed for: r1v30, types: [jjj] */
    /* JADX WARN: Type inference failed for: r1v33, types: [jjj] */
    /* JADX WARN: Type inference failed for: r1v36, types: [jjj] */
    /* JADX WARN: Type inference failed for: r1v39, types: [jjj] */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v8, types: [jjj] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v6, types: [jjj] */
    /* JADX WARN: Type inference failed for: r5v12, types: [jjj] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v3, types: [jjj] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v8, types: [jjj] */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v39, types: [jjj] */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61, types: [jjj] */
    /* JADX WARN: Type inference failed for: r7v64 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.au2.a(nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r11 != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0125 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.rap r10, nt5 r11) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.au2.a(rap, nt5):java.lang.Object");
    }

    public final void a(mg2 mg2Var) {
        for (kg2 kg2Var : mg2Var.q()) {
            if (!kg2Var.q() || a(kg2Var.p())) {
                for (Map.Entry entry : kg2Var.o().entrySet()) {
                    this.v.put((String) entry.getKey(), (n33) entry.getValue());
                }
            }
        }
    }

    public final void a(String str, String str2, String str3) {
        boolean zN = StringsKt.N(str);
        ah3 ah3Var = this.c;
        if (zN) {
            String strK = sko.k("Rule ", str3, " attempted to set a blank URL parameter.");
            ah3Var.a(strK, (Throwable) new Exception(strK));
            return;
        }
        LinkedHashMap linkedHashMap = this.o;
        if (linkedHashMap.containsKey(str)) {
            String strL = sko.l("URL parameter ", str, " was attempted to be overwritten by rule ", str3, ".");
            ah3Var.a(strL, (Throwable) new Exception(strL));
            return;
        }
        Map map = this.p;
        if (map == null) {
            map = null;
        }
        if (!map.containsKey(str)) {
            linkedHashMap.put(str, str2);
            return;
        }
        Map map2 = this.p;
        String str4 = (String) (map2 != null ? map2 : null).get(str);
        LinkedHashMap linkedHashMap2 = this.q;
        StringBuilder sb = (StringBuilder) linkedHashMap2.get(str);
        if (sb == null) {
            sb = new StringBuilder();
        }
        if (sb.length() > 0) {
            sb.append(str4);
        }
        sb.append(str2);
        linkedHashMap2.put(str, sb);
    }

    public final boolean a(vm1 vm1Var) {
        if (vm1Var.o$1().size() > 0) {
            flp flpVarO$1 = vm1Var.o$1();
            if ((flpVarO$1 instanceof Collection) && flpVarO$1.isEmpty()) {
                return true;
            }
            Iterator<E> it = flpVarO$1.iterator();
            while (it.hasNext()) {
                if (!a((vm1) it.next())) {
                    return false;
                }
            }
            return true;
        }
        if (vm1Var.s().size() <= 0) {
            if (vm1Var.u()) {
                return !a(vm1Var.r());
            }
            if (!vm1Var.t()) {
                return true;
            }
            prb prbVar = this.t;
            if (prbVar == null) {
                prbVar = null;
            }
            return ddh.i(prbVar, vm1Var.q());
        }
        flp flpVarS = vm1Var.s();
        if ((flpVarS instanceof Collection) && flpVarS.isEmpty()) {
            return false;
        }
        Iterator<E> it2 = flpVarS.iterator();
        while (it2.hasNext()) {
            if (a((vm1) it2.next())) {
                return true;
            }
        }
        return false;
    }

    public final Uri b() {
        Uri.Builder builderBuildUpon = Uri.parse(this.j).buildUpon();
        for (Map.Entry entry : this.o.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            LinkedHashSet linkedHashSet = this.n;
            if (linkedHashSet.isEmpty() || linkedHashSet.contains(str)) {
                ddh.f(builderBuildUpon, str, str2);
            }
        }
        return builderBuildUpon.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(nt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.xt2
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.xt2 r0 = (ads_mobile_sdk.xt2) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.xt2 r0 = new ads_mobile_sdk.xt2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            java.lang.String r5 = r0.d
            prb r1 = r0.c
            prb r2 = r0.b
            prb r0 = r0.a
            defpackage.ybh.y(r6)
            goto L5e
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            r5 = 0
            return r5
        L36:
            defpackage.ybh.y(r6)
            prb r2 = new prb
            r2.<init>()
            r0.a = r2
            r0.b = r2
            prb r6 = r5.u
            r0.c = r6
            java.lang.String r4 = "sdk_core"
            r0.d = r4
            r0.g = r3
            ads_mobile_sdk.ek r5 = r5.b
            ads_mobile_sdk.xq0 r5 = r5.a
            r5.getClass()
            java.lang.Object r5 = ads_mobile_sdk.xq0.c(r5, r0)
            if (r5 != r1) goto L5a
            return r1
        L5a:
            r1 = r6
            r0 = r2
            r6 = r5
            r5 = r4
        L5e:
            java.util.Map r6 = (java.util.Map) r6
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L68:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L84
            java.lang.Object r3 = r6.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r2.r(r4, r3)
            goto L68
        L84:
            kotlin.Unit r6 = kotlin.Unit.a
            r1.o(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.au2.b(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x011c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.rap b(ads_mobile_sdk.fb2 r12) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.au2.b(ads_mobile_sdk.fb2):rap");
    }

    public final void f() {
        prb prbVarW;
        prb prbVarW2;
        try {
            jjj jjjVar = this.s;
            if (jjjVar == null) {
                jjjVar = null;
            }
            Bundle bundle = jjjVar.googleExtrasBundle;
            if (bundle == null) {
                bundle = new Bundle();
            }
            m5a m5aVar = this.r;
            jjj jjjVar2 = this.s;
            if (jjjVar2 == null) {
                jjjVar2 = null;
            }
            String str = jjjVar2.inspectorExtras;
            if (str == null) {
                str = "{}";
            }
            prb prbVar = (prb) m5aVar.b(prb.class, str);
            if (prbVar != null) {
                try {
                    prbVarW = prbVar.w("global_extras");
                } catch (Exception unused) {
                }
            } else {
                prbVarW = null;
            }
            if (prbVarW != null) {
                egc it = prbVarW.a.entrySet().iterator();
                while (it.hasNext()) {
                    ggc ggcVarA = it.a();
                    bundle.putString((String) ggcVarA.getKey(), ((pqb) ggcVarA.getValue()).toString());
                }
            }
            jjj jjjVar3 = this.s;
            if (jjjVar3 == null) {
                jjjVar3 = null;
            }
            String str2 = jjjVar3.adUnitId;
            if (str2 == null) {
                str2 = "";
            }
            if (prbVar != null) {
                try {
                    prbVarW2 = prbVar.w(str2);
                } catch (Exception unused2) {
                }
            } else {
                prbVarW2 = null;
            }
            if (prbVarW2 != null) {
                egc it2 = prbVarW2.a.entrySet().iterator();
                while (it2.hasNext()) {
                    ggc ggcVarA2 = it2.a();
                    bundle.putString((String) ggcVarA2.getKey(), ((pqb) ggcVarA2.getValue()).toString());
                }
            }
            jjj jjjVar4 = this.s;
            (jjjVar4 != null ? jjjVar4 : null).googleExtrasBundle = bundle;
        } catch (Throwable unused3) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.au2.g():void");
    }
}
