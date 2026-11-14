package defpackage;

import ads_mobile_sdk.dt2;
import ads_mobile_sdk.eq2;
import ads_mobile_sdk.ih1;
import ads_mobile_sdk.kh3;
import ads_mobile_sdk.s8;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.usercentrics.sdk.PurposeListStyle;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class coh {
    public static final void a(j7i j7iVar, c8e c8eVar, ih5 ih5Var, int i) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1344868165);
        int i2 = (vt9Var.f(j7iVar) ? 4 : 2) | i | 48;
        byte b = 1;
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            hp7 hp7Var = mi5.s;
            k7h k7hVarA = hp7Var.a(new tb1((tb1) vt9Var.j(hp7Var), (byte) 1));
            z7e z7eVar = z7e.b;
            kfo.c(k7hVarA, gyg.P(447456635, new v7i(z7eVar, j7iVar, b), vt9Var), vt9Var, 48);
            c8eVar = z7eVar;
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new v7i(j7iVar, c8eVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062 A[LOOP:0: B:4:0x000d->B:34:0x0062, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0065 A[EDGE_INSN: B:42:0x0065->B:35:0x0065 BREAK  A[LOOP:0: B:4:0x000d->B:34:0x0062], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.k0j b(defpackage.m3c r8, boolean r9) {
        /*
            tah r0 = r8.F
            java.lang.Object r0 = r0.g
            b8e r0 = (defpackage.b8e) r0
            int r1 = r0.d
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L65
        Ld:
            if (r0 == 0) goto L65
            int r1 = r0.c
            r1 = r1 & 8
            if (r1 == 0) goto L5c
            r1 = r0
            r3 = r2
        L17:
            if (r1 == 0) goto L5c
            boolean r4 = r1 instanceof defpackage.i0j
            if (r4 == 0) goto L1f
            r2 = r1
            goto L65
        L1f:
            int r4 = r1.c
            r4 = r4 & 8
            if (r4 == 0) goto L57
            boolean r4 = r1 instanceof defpackage.i17
            if (r4 == 0) goto L57
            r4 = r1
            i17 r4 = (defpackage.i17) r4
            b8e r4 = r4.p
            r5 = 0
        L2f:
            r6 = 1
            if (r4 == 0) goto L55
            int r7 = r4.c
            r7 = r7 & 8
            if (r7 == 0) goto L52
            int r5 = r5 + 1
            if (r5 != r6) goto L3e
            r1 = r4
            goto L52
        L3e:
            if (r3 != 0) goto L49
            dfe r3 = new dfe
            r6 = 16
            b8e[] r6 = new defpackage.b8e[r6]
            r3.<init>(r6)
        L49:
            if (r1 == 0) goto L4f
            r3.c(r1)
            r1 = r2
        L4f:
            r3.c(r4)
        L52:
            b8e r4 = r4.f
            goto L2f
        L55:
            if (r5 == r6) goto L17
        L57:
            b8e r1 = defpackage.ui6.U(r3)
            goto L17
        L5c:
            int r1 = r0.d
            r1 = r1 & 8
            if (r1 == 0) goto L65
            b8e r0 = r0.f
            goto Ld
        L65:
            i0j r2 = (defpackage.i0j) r2
            b8e r2 = (defpackage.b8e) r2
            b8e r0 = r2.a
            f0j r1 = r8.w()
            if (r1 != 0) goto L76
            f0j r1 = new f0j
            r1.<init>()
        L76:
            k0j r2 = new k0j
            r2.<init>(r0, r9, r8, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coh.b(m3c, boolean):k0j");
    }

    public static final void c(hfk hfkVar, String str, Function0 function0, c8e c8eVar, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var;
        boolean z;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-1291512322);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? vt9Var2.f(hfkVar) : vt9Var2.h(hfkVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vt9Var2.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vt9Var2.h(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i & 3072) == 0) {
            i2 |= vt9Var2.f(c8eVar) ? 2048 : 1024;
        }
        if (vt9Var2.N(i2 & 1, (i2 & 1171) != 1170)) {
            Unit unit = Unit.a;
            int i3 = i2 & 14;
            boolean z2 = i3 == 4 || ((i2 & 8) != 0 && vt9Var2.h(hfkVar));
            Object objK = vt9Var2.K();
            zpa zpaVar = hh5.a;
            if (z2 || objK == zpaVar) {
                objK = new u6k((byte) 3, null, hfkVar);
                vt9Var2.g0(objK);
            }
            rm5.e(vt9Var2, unit, (Function2) objK);
            vt9Var = vt9Var2;
            afe afeVarG = dyg.g(hfkVar.getState(), (Object) null, (CoroutineContext) null, vt9Var, 48, 2);
            mfk mfkVar = (mfk) afeVarG.getValue();
            if (mfkVar == null) {
                vt9Var.W(-1126228825);
                vt9Var.p(false);
            } else {
                vt9Var.W(-1126228824);
                lfk lfkVar = mfkVar.a;
                nfk nfkVar = new nfk(ioh.n(lfkVar.a, lfkVar.b, lfkVar.c, false), mfkVar.b);
                boolean zF = (i3 == 4 || ((i2 & 8) != 0 && vt9Var.h(hfkVar))) | vt9Var.f(afeVarG);
                Object objK2 = vt9Var.K();
                if (zF || objK2 == zpaVar) {
                    z = true;
                    objK2 = new eek(hfkVar, afeVarG, (byte) 1);
                    vt9Var.g0(objK2);
                } else {
                    z = true;
                }
                Function0 function02 = (Function0) objK2;
                boolean z3 = ((i3 == 4 || ((i2 & 8) != 0 && vt9Var.h(hfkVar))) ? z : false) | ((i2 & 896) == 256 ? z : false);
                Object objK3 = vt9Var.K();
                if (z3 || objK3 == zpaVar) {
                    objK3 = new eek(hfkVar, function0, (byte) 2);
                    vt9Var.g0(objK3);
                }
                Function0 function03 = (Function0) objK3;
                if (i3 != 4 && ((i2 & 8) == 0 || !vt9Var.h(hfkVar))) {
                    z = false;
                }
                Object objK4 = vt9Var.K();
                if (z || objK4 == zpaVar) {
                    objK4 = new dnj(hfkVar, (byte) 17);
                    vt9Var.g0(objK4);
                }
                alo.f(nfkVar, str, function02, function03, (Function0) objK4, c8eVar, vt9Var, (i2 & 112) | ((i2 << 6) & 458752), 0);
                vt9Var = vt9Var;
                vt9Var.p(false);
            }
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new fz0((Object) hfkVar, str, function0, c8eVar, i, (byte) 9);
        }
    }

    public static uio d(u06 u06Var, String str, oam oamVar) {
        List listSingletonList;
        w3b w3bVar = u06Var == u06.AUDIO ? w3b.AUDIBLE : w3b.BEGIN_TO_RENDER;
        u06 u06Var2 = u06.HTML_DISPLAY;
        gvf gvfVar = gvf.NATIVE;
        s9i s9iVarE = s9i.E(u06Var, w3bVar, gvfVar, u06Var == u06Var2 ? gvf.NONE : gvfVar);
        gd7 gd7VarA = gd7.a("1.13.7");
        String str2 = (String) ezo.b.a();
        if (!TextUtils.isEmpty(str2)) {
            try {
                String str3 = (String) oamVar.a;
                URL url = new URL((String) oamVar.c);
                String str4 = (String) oamVar.b;
                zch.e(str3, "VendorKey is null or empty");
                zch.e(str4, "VerificationParameters is null or empty");
                listSingletonList = Collections.singletonList(new t1n(str3, url, str4));
            } catch (MalformedURLException unused) {
                Object obj = oamVar.c;
                listSingletonList = null;
            }
            if (listSingletonList != null) {
                return uio.b(s9iVarE, ne5.w(gd7VarA, str2, listSingletonList, str));
            }
        }
        return null;
    }

    public static kh3 e() {
        return new kh3(new eq2(), new ih1(), new dt2(), new s8());
    }

    public static jl6 f(rr rrVar, String str, int i) {
        if ((i & 1) != 0) {
            rrVar = rr.a;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        return new jl6(rrVar, str, 0);
    }

    public static final qsj g(fum fumVar, Function1 function1, ih5 ih5Var, int i) {
        jsj jsjVar;
        Throwable th;
        vt9 vt9Var = (vt9) ih5Var;
        boolean zF = vt9Var.f(fumVar != null ? fumVar.getText() : null);
        Object objK = vt9Var.K();
        Object obj = hh5.a;
        if (zF || objK == obj) {
            objK = hyg.k((Object) null);
            vt9Var.g0(objK);
        }
        afe afeVar = (afe) objK;
        sdk text = fumVar != null ? fumVar.getText() : null;
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean zF2 = vt9Var.f(afeVar) | ((i2 > 4 && vt9Var.h(fumVar)) || (i & 6) == 4);
        Object objK2 = vt9Var.K();
        if (zF2 || objK2 == obj) {
            objK2 = new mz9(fumVar, afeVar, str, (byte) 26);
            vt9Var.g0(objK2);
        }
        rm5.e(vt9Var, text, (Function2) objK2);
        if (((String) afeVar.getValue()) == null || !(fumVar instanceof dum)) {
            vt9Var.W(355795268);
            vt9Var.p(false);
        } else {
            vt9Var.W(355584809);
            String str = (String) afeVar.getValue();
            boolean zF3 = vt9Var.f(afeVar) | ((i2 > 4 && vt9Var.h(fumVar)) || (i & 6) == 4);
            Object objK3 = vt9Var.K();
            if (zF3 || objK3 == obj) {
                objK3 = new udj((Object) fumVar, (Object) afeVar, (mt5) str, (byte) 3);
                vt9Var.g0(objK3);
            }
            rm5.e(vt9Var, str, (Function2) objK3);
            vt9Var.p(false);
        }
        if ((fumVar instanceof dum) && (th = ((dum) fumVar).b) != null && exg.v(th)) {
            vt9Var.W(355897567);
            vt9Var.p(false);
        } else {
            vt9Var.W(356109855);
            vt9Var.p(false);
        }
        if (fumVar != null) {
            vt9Var.W(356172507);
            String str2 = (String) afeVar.getValue();
            boolean z2 = (((i & 112) ^ 48) > 32 && vt9Var.f(function1)) || (i & 48) == 32;
            if ((i2 <= 4 || !vt9Var.h(fumVar)) && (i & 6) != 4) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objK4 = vt9Var.K();
            if (z3 || objK4 == obj) {
                objK4 = new s4f(function1, fumVar, (byte) 25);
                vt9Var.g0(objK4);
            }
            jsj jsjVar2 = new jsj(str2, null, (Function0) objK4);
            vt9Var.p(false);
            jsjVar = jsjVar2;
        } else {
            vt9Var.W(356316688);
            vt9Var.p(false);
            jsjVar = null;
        }
        Object objK5 = vt9Var.K();
        if (objK5 == obj) {
            objK5 = new qsj();
            vt9Var.g0(objK5);
        }
        qsj qsjVar = (qsj) objK5;
        String str3 = jsjVar != null ? jsjVar.a : null;
        if (str3 == null) {
            vt9Var.W(-1278926203);
            vt9Var.p(false);
            return qsjVar;
        }
        vt9Var.W(-1280179347);
        jsjVar.getClass();
        Object objK6 = vt9Var.K();
        if (objK6 == obj) {
            objK6 = hyg.k(jsjVar);
            vt9Var.g0(objK6);
        }
        afe afeVar2 = (afe) objK6;
        if (!Intrinsics.a(((jsj) afeVar2.getValue()).a, str3)) {
            ((jsj) afeVar2.getValue()).b.invoke();
            afeVar2.setValue(jsjVar);
        }
        boolean zF4 = vt9Var.f(str3) | vt9Var.h(null) | vt9Var.f(jsjVar);
        Object objK7 = vt9Var.K();
        if (zF4 || objK7 == obj) {
            Object mz9Var = new mz9(qsjVar, str3, (ynh) null, jsjVar, (mt5) null);
            vt9Var.g0(mz9Var);
            objK7 = mz9Var;
        }
        rm5.e(vt9Var, str3, (Function2) objK7);
        vt9Var.p(false);
        return qsjVar;
    }

    public static final GradientDrawable h(rcm rcmVar, Context context, PurposeListStyle purposeListStyle) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((int) rm5.r(context, 4.0f));
        if (purposeListStyle == PurposeListStyle.b) {
            gradientDrawable.setStroke((int) rm5.r(context, 1.0f), rcmVar.j);
        }
        Integer num = rcmVar.e;
        gradientDrawable.setColor(num != null ? num.intValue() : -1);
        return gradientDrawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(iyb r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ezm
            if (r0 == 0) goto L13
            r0 = r6
            ezm r0 = (defpackage.ezm) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            ezm r0 = new ezm
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.v
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            d04 r5 = r0.u
            iyb r0 = r0.t
            defpackage.ybh.y(r6)     // Catch: java.lang.Throwable -> L2c
            goto L4d
        L2c:
            r5 = move-exception
            goto L56
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L34:
            defpackage.ybh.y(r6)
            d04 r6 = new d04     // Catch: java.lang.Throwable -> L54
            r6.<init>()     // Catch: java.lang.Throwable -> L54
            r0.t = r5     // Catch: java.lang.Throwable -> L54
            r0.u = r6     // Catch: java.lang.Throwable -> L54
            r0.w = r3     // Catch: java.lang.Throwable -> L54
            d44 r2 = r5.a     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = dyg.s(r2, r6, r0)     // Catch: java.lang.Throwable -> L54
            if (r0 != r1) goto L4b
            return r1
        L4b:
            r0 = r5
            r5 = r6
        L4d:
            defpackage.fr3.t(r0, r4)
            return r5
        L51:
            r0 = r5
            r5 = r6
            goto L56
        L54:
            r6 = move-exception
            goto L51
        L56:
            throw r5     // Catch: java.lang.Throwable -> L57
        L57:
            r6 = move-exception
            defpackage.fr3.t(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coh.i(iyb, nt5):java.lang.Object");
    }

    public static void j(hr5 hr5Var) {
        nak nakVar;
        sbg sbgVar;
        sbg sbgVar2;
        do {
            nakVar = hoh.z;
            sbgVar = (sbg) nakVar.getValue();
            tag tagVarH = sbgVar.d;
            vgc vgcVar = (vgc) tagVarH.get(hr5Var);
            if (vgcVar == null) {
                sbgVar2 = sbgVar;
            } else {
                Object obj = vgcVar.a;
                Object obj2 = vgcVar.b;
                u6m u6mVar = tagVarH.d;
                u6m u6mVarV = u6mVar.v(hr5Var != null ? hr5Var.hashCode() : 0, hr5Var, 0);
                if (u6mVar != u6mVarV) {
                    tagVarH = u6mVarV == null ? tag.f : new tag(u6mVarV, tagVarH.e - 1);
                }
                ulp ulpVar = ulp.f;
                if (obj != ulpVar) {
                    tagVarH = tagVarH.h(obj, new vgc(((vgc) tagVarH.get(obj)).a, obj2));
                }
                if (obj2 != ulpVar) {
                    tagVarH = tagVarH.h(obj2, new vgc(obj, ((vgc) tagVarH.get(obj2)).b));
                }
                Object obj3 = obj != ulpVar ? sbgVar.b : obj2;
                if (obj2 != ulpVar) {
                    obj = sbgVar.c;
                }
                sbgVar2 = new sbg(obj3, obj, tagVarH);
            }
            if (sbgVar == sbgVar2) {
                return;
            }
        } while (!nakVar.h(sbgVar, sbgVar2));
    }

    public static final void k(oml omlVar, Object obj, long j) {
        omlVar.b(obj, pn7.f(j), TimeUnit.MILLISECONDS, (jri) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean l(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coh.l(android.content.Context):boolean");
    }

    public static boolean m(Context context) {
        ApplicationInfo applicationInfo;
        Intent intentPutExtra = new Intent().addFlags(268435456).setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName());
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intentPutExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                intentPutExtra.setPackage(applicationInfo.packageName);
                context.startActivity(intentPutExtra);
                return true;
            }
        }
        return false;
    }
}
