package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Handler;
import android.util.Size;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.playcore_hsdp.zzg;
import com.google.android.gms.internal.playcore_hsdp.zzj;
import com.opera.android.BrowserActivity;
import com.opera.android.bar.TopToolbarContainer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g7m implements bvl {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public boolean a;
    public Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public g7m(Context context, String str, Intent intent, hqp hqpVar) {
        this.f = new ArrayList();
        this.b = new CopyOnWriteArrayList();
        this.d = context;
        this.e = str;
        this.g = intent;
        this.h = hqpVar;
        this.c = zzj.zza(new c30((byte) 11, str, false));
        this.i = new xip(this, (byte) 1);
    }

    public g7m(BrowserActivity browserActivity, gbf gbfVar, k6l k6lVar, mt3 mt3Var, TopToolbarContainer topToolbarContainer) {
        this.c = gbfVar;
        this.d = k6lVar;
        this.e = topToolbarContainer;
        pde pdeVar = new pde(new avl(yul.e, false, 0, 0, 1));
        this.f = pdeVar;
        this.b = new pde(new zul(0, 0));
        this.g = new kze(Float.valueOf(((avl) pdeVar.g()).a.a));
        this.h = new kze(Float.valueOf(0.0f));
        this.i = z4c.b(new p7l(mt3Var, (byte) 20));
        this.k = new yvl(this);
        oup.l0(browserActivity.getLifecycle(), new gil(this, browserActivity, (byte) 6), (Function1) null, (Function1) null, (Function1) null, 14);
    }

    public g7m(Executor executor, CameraCharacteristics cameraCharacteristics) {
        ygh yghVar = a77.a;
        if (a77.a.b(LowMemoryQuirk.class) != null) {
            this.c = new b2j(executor);
        } else {
            this.c = executor;
        }
        this.k = yghVar;
        this.a = yghVar.a(IncorrectJpegMetadataQuirk.class);
    }

    public g7m(y5i y5iVar, HashMap map, HashMap map2, String[] strArr, boolean z, ci7 ci7Var) {
        this.c = y5iVar;
        this.d = map;
        this.e = map2;
        this.a = z;
        this.f = ci7Var;
        this.j = new AtomicBoolean(false);
        this.k = new nd3((byte) 11);
        this.b = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str.toLowerCase(locale);
            ((LinkedHashMap) this.b).put(lowerCase, Integer.valueOf(i));
            String str2 = (String) ((HashMap) this.d).get(strArr[i]);
            String lowerCase2 = str2 != null ? str2.toLowerCase(locale) : null;
            if (lowerCase2 != null) {
                lowerCase = lowerCase2;
            }
            strArr2[i] = lowerCase;
        }
        this.g = strArr2;
        for (Map.Entry entry : ((HashMap) this.d).entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            if (((LinkedHashMap) this.b).containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
                linkedHashMap.put(lowerCase4, rbd.b(linkedHashMap, lowerCase3));
            }
        }
        this.h = new d7f(((String[]) this.g).length);
        this.i = new je6(((String[]) this.g).length);
    }

    public g7m(yv3 yv3Var, ji jiVar, ji jiVar2, zv3 zv3Var, d5o d5oVar) {
        this.c = yv3Var;
        this.d = jiVar;
        this.e = jiVar2;
        this.f = zv3Var;
        this.g = d5oVar;
        this.h = nv0.b;
        this.b = new LinkedHashMap();
    }

    public final void D(zul zulVar) {
        xf8.F0((pde) this.b, zulVar);
        TopToolbarContainer topToolbarContainer = (TopToolbarContainer) this.e;
        int i = zulVar.a;
        int i2 = zulVar.b;
        topToolbarContainer.e = i;
        topToolbarContainer.f = i2;
        topToolbarContainer.b();
        topToolbarContainer.setVisibility(i != 0 ? 4 : 0);
        xf8.G0((kze) this.h, Float.valueOf(topToolbarContainer.getTranslationY()));
    }

    public final kze E() {
        return (kze) this.h;
    }

    public final kze F() {
        return (kze) this.g;
    }

    public final void G() {
        o();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.tng r5, nt5 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.a7m
            if (r0 == 0) goto L13
            r0 = r6
            a7m r0 = (defpackage.a7m) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            a7m r0 = new a7m
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.u
            px5 r6 = px5.a
            int r1 = r0.w
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            java.lang.Object r5 = r0.t
            java.util.Set r5 = (java.util.Set) r5
            defpackage.ybh.y(r4)
            return r5
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L35:
            java.lang.Object r5 = r0.t
            tng r5 = (defpackage.tng) r5
            defpackage.ybh.y(r4)
            goto L53
        L3d:
            defpackage.ybh.y(r4)
            qjl r4 = new qjl
            r1 = 11
            r4.<init>(r1)
            r0.t = r5
            r0.w = r3
            java.lang.String r1 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.a(r1, r4, r0)
            if (r4 == r6) goto L6a
        L53:
            java.util.Set r4 = (java.util.Set) r4
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L6b
            r0.t = r4
            r0.w = r2
            java.lang.String r1 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = defpackage.y7h.f(r5, r1, r0)
            if (r5 != r6) goto L6b
        L6a:
            return r6
        L6b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g7m.a(tng, nt5):java.lang.Object");
    }

    public final void b(d80 d80Var) {
        x5f x5fVar = (skm) ((ji) this.e).get();
        String str = ((nv0) this.h).a;
        x5f x5fVar2 = x5fVar;
        zpa zpaVar = x5fVar2.d;
        x56 x56VarF = zpa.F();
        new ck0(zpaVar, x56VarF);
        i60 i60VarM = zpa.m();
        x56VarF.T().put(str, i60VarM);
        i60VarM.q(8, 1, d80Var);
        x5fVar2.U0(x56VarF);
    }

    public final void c(l60 l60Var) {
        hf0 hf0Var;
        x5f x5fVar = (orm) ((ji) this.d).get();
        String str = ((nv0) this.h).a;
        x5f x5fVar2 = x5fVar;
        if (x5fVar2.h) {
            x56 x56VarF = zpa.F();
            i60 i60VarM = zpa.m();
            k60 k60Var = new k60(2443, -1, 1);
            k60Var.q(0, 1, l60Var);
            List list = (List) i60VarM.n(2);
            if (list == null || list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                i60VarM.q(2, 1, arrayList);
                hf0Var = new hf0(i60VarM, 2, arrayList);
            } else {
                hf0Var = new hf0(i60VarM, 2, list);
            }
            hf0Var.add(k60Var);
            x56VarF.T().put(str, i60VarM);
            x5fVar2.U0(x56VarF);
        }
    }

    public final void d() {
        this.a = true;
        nv6 nv6VarB = ((ru9) ((yv3) this.c).get()).b();
        ((SharedPreferences.Editor) nv6VarB.a).putBoolean("ai.used_chat", true);
        nv6VarB.w();
        ((skm) ((ji) this.e).get()).x(b70.f);
        d5o d5oVar = (d5o) this.g;
        gw0 gw0Var = (gw0) d5oVar.c;
        if (gw0Var != null) {
            gw0Var.c.add(x70.j);
        }
        d5oVar.w(u70.b);
    }

    public final void e(String str, p60 p60Var) {
        hf0 hf0Var;
        x5f x5fVar = (orm) ((ji) this.d).get();
        String str2 = ((nv0) this.h).a;
        x5f x5fVar2 = x5fVar;
        if (x5fVar2.h) {
            zpa zpaVar = x5fVar2.d;
            x56 x56VarF = zpa.F();
            new ck0(zpaVar, x56VarF);
            i60 i60VarM = zpa.m();
            x56VarF.T().put(str2, i60VarM);
            u60 u60Var = new u60(2443, -1, 2);
            i60VarM.x().put(str, u60Var);
            o60 o60Var = new o60(2443, -1, 1);
            List list = (List) u60Var.n(1);
            if (list == null || list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                u60Var.q(1, 1, arrayList);
                hf0Var = new hf0(u60Var, 1, arrayList);
            } else {
                hf0Var = new hf0(u60Var, 1, list);
            }
            hf0Var.add(o60Var);
            o60Var.q(0, 1, p60Var);
            x5fVar2.U0(x56VarF);
        }
    }

    public final void f(x70 x70Var) {
        this.k = x70Var;
        gw0 gw0Var = (gw0) ((d5o) this.g).c;
        if (gw0Var == null) {
            return;
        }
        gw0Var.c.add(x70Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(boolean r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.i
            c02 r0 = (c02) r0
            r1 = 0
            if (r0 == 0) goto L61
            b02 r2 = r0.b
            int r2 = r2.ordinal()
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1c
            if (r2 == r3) goto L1f
            r5 = 3
            if (r2 == r5) goto L1f
            h9o.p()
            return
        L1c:
            b80 r2 = b80.e
            goto L20
        L1f:
            r2 = r1
        L20:
            if (r2 == 0) goto L61
            a02 r0 = r0.a
            int r0 = r0.ordinal()
            if (r0 == 0) goto L37
            if (r0 == r4) goto L34
            if (r0 != r3) goto L30
            r0 = r1
            goto L39
        L30:
            h9o.p()
            return
        L34:
            a80 r0 = a80.c
            goto L39
        L37:
            a80 r0 = a80.b
        L39:
            if (r0 == 0) goto L61
            java.lang.Object r4 = r8.d
            ji r4 = (ji) r4
            java.lang.Object r4 = r4.get()
            orm r4 = (orm) r4
            x5f r4 = (x5f) r4
            boolean r5 = r4.h
            if (r5 == 0) goto L61
            zpa r5 = r4.d
            x56 r6 = zpa.F()
            ck0 r7 = new ck0
            r7.<init>(r5, r6)
            v2e r5 = new v2e
            r5.<init>(r3, r2, r0, r9)
            r7.b(r5)
            r4.U0(r6)
        L61:
            r8.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g7m.g(boolean):void");
    }

    public final pde getOffset() {
        return (pde) this.b;
    }

    public final pde getState() {
        return (pde) this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(nt5 r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g7m.h(nt5):java.lang.Object");
    }

    public final qya i(jo2 jo2Var) throws Exception {
        eo2 eo2VarS;
        s1h s1hVar = jo2Var.a;
        int i = s1hVar.a;
        eo2 eo2Var = (eo2) ((j06) this.e).g(jo2Var);
        Object obj = eo2Var.a;
        ArrayList arrayList = ((io2) this.d).d;
        jpo.j(!arrayList.isEmpty());
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        int i2 = eo2Var.c;
        if ((i2 == 35 || this.a) && iIntValue == 256) {
            qe6 qe6Var = (qe6) this.f;
            sn2 sn2Var = new sn2(eo2Var, s1hVar.d);
            qe6Var.getClass();
            try {
                if (i2 == 35) {
                    eo2VarS = qe6.S(sn2Var);
                } else {
                    if (i2 != 256 && i2 != 4101) {
                        throw new IllegalArgumentException("Unexpected format: " + i2);
                    }
                    eo2VarS = qe6Var.R(sn2Var, i2);
                }
                ((qya) obj).close();
                Size size = eo2VarS.d;
                ((a36) this.i).getClass();
                bl9 bl9Var = new bl9(aib.u(size.getWidth(), size.getHeight(), NotificationCompat.FLAG_LOCAL_ONLY, 2));
                qya qyaVarB = ImageProcessingUtil.b(bl9Var, (byte[]) eo2VarS.a);
                bl9Var.d();
                Objects.requireNonNull(qyaVarB);
                rg8 rg8Var = eo2VarS.b;
                Objects.requireNonNull(rg8Var);
                Rect rect = eo2VarS.e;
                int i3 = eo2VarS.f;
                Matrix matrix = eo2VarS.g;
                yb4 yb4Var = eo2VarS.h;
                ck9 ck9Var = (ck9) qyaVarB;
                Size size2 = new Size(ck9Var.getWidth(), ck9Var.getHeight());
                ck9Var.getFormat();
                eo2Var = new eo2(qyaVarB, rg8Var, ck9Var.getFormat(), size2, rect, i3, matrix, yb4Var);
            } catch (Throwable th) {
                ((qya) obj).close();
                throw th;
            }
        }
        ((hr5) this.h).getClass();
        qya qyaVar = (qya) eo2Var.a;
        d5j d5jVar = new d5j(qyaVar, eo2Var.d, new tn2(qyaVar.h1().d(), qyaVar.h1().e(), eo2Var.f, eo2Var.g, qyaVar.h1().c()));
        d5jVar.k(eo2Var.e);
        if (arrayList.size() <= 1) {
            return d5jVar;
        }
        d5jVar.getFormat();
        throw null;
    }

    public final void j(fza fzaVar, fza fzaVar2) {
        if (((AtomicBoolean) this.j).compareAndSet(false, true)) {
            fzaVar.getClass();
            nx5 nx5Var = ((y5i) this.c).a;
            mt5 mt5Var = null;
            if (nx5Var == null) {
                nx5Var = null;
            }
            na2.B(nx5Var, new jx5("Room Invalidation Tracker Refresh"), null, new r8h((Object) this, (Object) fzaVar2, mt5Var, (byte) 29), 2);
        }
    }

    public final void k(String str, List list) {
        ji jiVar = (ji) this.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e02 e02Var = (e02) it.next();
            f02 f02Var = e02Var.c;
            long j = e02Var.d;
            String str2 = e02Var.b;
            int iOrdinal = f02Var.ordinal();
            if (iOrdinal == 0) {
                x5f x5fVar = (orm) jiVar.get();
                if (x5fVar.h) {
                    zpa zpaVar = x5fVar.d;
                    x56 x56VarF = zpa.F();
                    new ck0(zpaVar, x56VarF).c().a(str2, new ivd(str, j, (byte) 3));
                    x5fVar.U0(x56VarF);
                }
            } else if (iOrdinal == 1) {
                continue;
            } else if (iOrdinal == 2) {
                x5f x5fVar2 = (orm) jiVar.get();
                if (x5fVar2.h) {
                    zpa zpaVar2 = x5fVar2.d;
                    x56 x56VarF2 = zpa.F();
                    new ck0(zpaVar2, x56VarF2).c().a(str2, new ivd(str, j, (byte) 1));
                    x5fVar2.U0(x56VarF2);
                }
            } else if (iOrdinal != 3 && iOrdinal != 4) {
                h9o.p();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (defpackage.y7h.f(r1, r3, r4) != r5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d6, code lost:
    
        if (defpackage.y7h.f(r11, r3, r4) == r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00d6 -> B:27:0x00d9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.tng r18, int r19, nt5 r20) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g7m.l(tng, int, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0080 -> B:19:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(defpackage.tng r9, int r10, nt5 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.e7m
            if (r0 == 0) goto L13
            r0 = r11
            e7m r0 = (defpackage.e7m) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            e7m r0 = new e7m
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.y
            px5 r1 = px5.a
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L33
            byte r8 = r0.x
            int r9 = r0.w
            java.lang.String[] r10 = r0.v
            java.lang.String r2 = r0.u
            tng r4 = r0.t
            defpackage.ybh.y(r11)
            r11 = r10
            r10 = r4
            goto L83
        L33:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            r8 = 0
            return r8
        L3a:
            defpackage.ybh.y(r11)
            java.lang.Object r8 = r8.g
            java.lang.String[] r8 = (java.lang.String[]) r8
            r8 = r8[r10]
            java.lang.String[] r10 = defpackage.g7m.l
            r11 = 0
            r2 = 3
            r7 = r2
            r2 = r8
            r8 = r7
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L4e:
            if (r9 >= r8) goto L85
            r4 = r11[r9]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "room_table_modification_trigger_"
            r5.<init>(r6)
            r5.append(r2)
            r6 = 95
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r6 = 96
            java.lang.String r4 = am2.m(r6, r5, r4)
            r0.t = r10
            r0.u = r2
            r0.v = r11
            r0.w = r9
            r0.x = r8
            r0.A = r3
            java.lang.Object r4 = defpackage.y7h.f(r10, r4, r0)
            if (r4 != r1) goto L83
            return r1
        L83:
            int r9 = r9 + r3
            goto L4e
        L85:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g7m.m(tng, int, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(nt5 r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            y5i r0 = (defpackage.y5i) r0
            boolean r1 = r9 instanceof defpackage.f7m
            if (r1 == 0) goto L17
            r1 = r9
            f7m r1 = (defpackage.f7m) r1
            int r2 = r1.w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.w = r2
            goto L1c
        L17:
            f7m r1 = new f7m
            r1.<init>(r8, r9)
        L1c:
            java.lang.Object r9 = r1.u
            px5 r2 = px5.a
            int r3 = r1.w
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L36
            if (r3 != r5) goto L30
            qb7 r8 = r1.t
            defpackage.ybh.y(r9)     // Catch: java.lang.Throwable -> L2e
            goto L54
        L2e:
            r9 = move-exception
            goto L5c
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r4
        L36:
            defpackage.ybh.y(r9)
            qb7 r9 = r0.g
            boolean r3 = r9.e()
            if (r3 == 0) goto L60
            sbl r3 = new sbl     // Catch: java.lang.Throwable -> L58
            r6 = 2
            r3.<init>(r6, r4, r8)     // Catch: java.lang.Throwable -> L58
            r1.t = r9     // Catch: java.lang.Throwable -> L58
            r1.w = r5     // Catch: java.lang.Throwable -> L58
            r8 = 0
            java.lang.Object r8 = r0.w(r8, r3, r1)     // Catch: java.lang.Throwable -> L58
            if (r8 != r2) goto L53
            return r2
        L53:
            r8 = r9
        L54:
            r8.D()
            goto L60
        L58:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L5c:
            r8.D()
            throw r9
        L60:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g7m.n(nt5):java.lang.Object");
    }

    public final void o() {
        ValueAnimator valueAnimator;
        pde pdeVar = (pde) this.f;
        yul yulVar = ((avl) pdeVar.g()).a;
        d7l d7lVar = ((k6l) this.d).o;
        vul vulVar = (vul) ((wul) ((zyk) this.i).getValue()).c.g();
        yul yulVarM0 = (d7lVar == null || this.a || vulVar.a > 0) ? yul.d : d7lVar.m0();
        boolean z = vulVar.c.b;
        int i = vulVar.a;
        xf8.F0(pdeVar, new avl(yulVarM0, z, i, vulVar.b, i > 0 ? 2 : 1));
        yul yulVar2 = ((avl) pdeVar.g()).a;
        if (yulVar2 != yulVar) {
            ValueAnimator valueAnimator2 = (ValueAnimator) this.j;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float fFloatValue = ((Number) ((kze) this.g).g()).floatValue();
            float f = yulVar2.a;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.j = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(150L);
            valueAnimatorOfFloat.addUpdateListener(new up3(this, fFloatValue, f, (byte) 1));
            valueAnimatorOfFloat.addListener(new kc(this, (byte) 28));
            valueAnimatorOfFloat.start();
            this.j = valueAnimatorOfFloat;
            if (yulVar.d(yulVar2) || (valueAnimator = (ValueAnimator) this.j) == null) {
                return;
            }
            valueAnimator.end();
        }
    }

    public final Pair p(String[] strArr) {
        p4j p4jVar = new p4j();
        for (String str : strArr) {
            Set set = (Set) ((HashMap) this.e).get(str.toLowerCase(Locale.ROOT));
            if (set != null) {
                p4jVar.addAll(set);
            } else {
                p4jVar.add(str);
            }
        }
        String[] strArr2 = (String[]) z4j.a(p4jVar).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            Integer num = (Integer) ((LinkedHashMap) this.b).get(str2.toLowerCase(Locale.ROOT));
            if (num == null) {
                qp2.o("There is no table with name ".concat(str2));
                return null;
            }
            iArr[i] = num.intValue();
        }
        return new Pair(strArr2, iArr);
    }

    public final void q(Runnable runnable) {
        s(new ypp(this, runnable, (byte) 1));
    }

    public final void r() {
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
        while (it.hasNext()) {
            gpp gppVar = (gpp) it.next();
            ((Handler) ((zzg) gppVar.b.c).zza()).post(new uqp(gppVar, (byte) 4));
        }
    }

    public final void s(Runnable runnable) {
        ((Handler) ((zzg) this.c).zza()).post(new gg(runnable, (byte) 7));
    }
}
