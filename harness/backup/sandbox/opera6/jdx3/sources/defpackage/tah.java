package defpackage;

import J.N;
import android.content.Context;
import android.net.Uri;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.leanplum.core.BuildConfig;
import com.opera.android.BrowserActivity;
import com.opera.android.Lazy;
import com.opera.android.LoadingView;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.settings.SettingsManager;
import com.opera.android.weather.ui.WeatherWidgetActivity;
import com.opera.api.Callback;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class tah implements vga, dmk, hf3, b0i {
    public static final alb l = new alb((byte) 4);
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public tah() {
        this.a = (byte) 9;
        this.i = new f1p((byte) 24);
        this.j = new isc();
        ua7 ua7Var = new ua7(new wng(20), new hr5(), new ir5(), false, (byte) 9);
        this.k = ua7Var;
        this.c = new k5o(ua7Var);
        int i = 0;
        this.d = new o28((byte) 0);
        mgh mghVar = new mgh((byte) 1);
        this.b = mghVar;
        this.e = new s64((byte) 4);
        this.f = new rc6((byte) 0);
        this.g = new vk((byte) 3);
        this.h = new d14((byte) 2);
        List listAsList = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.addAll(listAsList);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        synchronized (mghVar) {
            ArrayList arrayList2 = new ArrayList((ArrayList) mghVar.b);
            ((ArrayList) mghVar.b).clear();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((ArrayList) mghVar.b).add((String) obj);
            }
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                String str = (String) obj2;
                if (!arrayList.contains(str)) {
                    ((ArrayList) mghVar.b).add(str);
                }
            }
        }
    }

    public /* synthetic */ tah(byte b) {
        this.a = b;
    }

    public tah(BrowserActivity browserActivity, x5f x5fVar, fd fdVar, jze jzeVar, SettingsManager settingsManager, fw3 fw3Var, ViewGroup viewGroup, k6l k6lVar, v1f v1fVar, bq3 bq3Var, xj xjVar) {
        this.a = (byte) 2;
        this.c = settingsManager;
        this.d = fw3Var;
        this.b = k6lVar;
        this.e = v1fVar;
        this.f = bq3Var;
        this.g = xjVar;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(2131362056);
        this.h = viewGroup2;
        View viewFindViewById = viewGroup.findViewById(2131362187);
        this.i = viewFindViewById;
        this.j = viewGroup.findViewById(2131363035);
        hd hdVar = new hd(browserActivity.getLifecycle(), fdVar, new va2(this, (byte) 23), new jf(new whf(viewGroup.getContext(), (byte) 11), new whf(fdVar, (byte) 12), false, false, 60));
        this.k = hdVar;
        tcc lifecycle = browserActivity.getLifecycle();
        qb7 qb7Var = new qb7();
        qb7Var.a = settingsManager;
        qb7Var.b = fw3Var;
        qb7Var.c = x5fVar;
        aib.A(settingsManager, lifecycle, new s9(qb7Var, (byte) 5), new oc2(qb7Var, (byte) 13));
        viewGroup2.removeAllViews();
        hdVar.x(vtp.I(settingsManager, fw3Var));
        aib.B(settingsManager, browserActivity, new s9(this, (byte) 7), new vme((byte) 19));
        jzeVar.j(browserActivity, new pb(new bo3(this, (byte) 4), (byte) 25));
        viewFindViewById.setOnClickListener(new gf((Object) this, (byte) 27));
    }

    public tah(WeatherWidgetActivity weatherWidgetActivity, ChromiumContent chromiumContent, WeatherWidgetActivity weatherWidgetActivity2, ipn ipnVar, ipn ipnVar2, esk eskVar, lrk lrkVar, lrk lrkVar2, qq6 qq6Var, nv6 nv6Var, ole oleVar) {
        this.a = (byte) 5;
        this.c = weatherWidgetActivity;
        this.d = chromiumContent;
        this.b = weatherWidgetActivity2;
        this.e = ipnVar;
        this.f = ipnVar2;
        this.g = lrkVar;
        this.h = lrkVar2;
        this.i = qq6Var;
        this.j = nv6Var;
        this.k = oleVar;
    }

    public tah(cvg cvgVar, nvg nvgVar, cvg cvgVar2, db dbVar, xb xbVar, fmk fmkVar, af3 af3Var, slk slkVar, skm skmVar, ebh ebhVar) {
        this.a = (byte) 8;
        this.j = new ode(new evg());
        this.c = nvgVar;
        this.d = cvgVar2;
        this.b = dbVar;
        this.e = xbVar;
        this.f = fmkVar;
        this.g = new c0i(cvgVar, xbVar, slkVar, this);
        this.h = new qb7(af3Var, skmVar);
        this.i = slkVar;
        this.k = ebhVar;
        if (ebhVar == null) {
            fmkVar.c.j(cvgVar, new d8d(this, (byte) 26));
        } else {
            ebhVar.c();
            ebhVar.a.j(cvgVar, new hze(this, cvgVar));
        }
    }

    public tah(cw3 cw3Var, umi umiVar, q32 q32Var, x12 x12Var, ny1 ny1Var, qy1 qy1Var, f0a f0aVar) {
        this.a = (byte) 4;
        this.c = umiVar;
        this.d = q32Var;
        this.b = x12Var;
        this.e = ny1Var;
        this.f = qy1Var;
        this.g = f0aVar;
        this.h = new pde(l08.a);
        this.i = z4c.b(new al7((Object) cw3Var, (byte) 15));
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public tah(i16 i16Var) {
        this.a = (byte) 0;
        this.c = i16Var;
    }

    public tah(m3c m3cVar) {
        this.a = (byte) 7;
        this.c = m3cVar;
        sye syeVar = new sye();
        ((b8e) syeVar).d = -1;
        this.d = syeVar;
        j8b j8bVar = new j8b(m3cVar);
        this.b = j8bVar;
        this.e = j8bVar;
        lbl lblVar = j8bVar.b0;
        this.f = lblVar;
        this.g = lblVar;
        this.h = new dee();
    }

    public tah(nw3 nw3Var, Lazy lazy, nw3 nw3Var2, mw3 mw3Var, nw3 nw3Var3, nw3 nw3Var4, nw3 nw3Var5, kw3 kw3Var, hw3 hw3Var, nw3 nw3Var6) {
        this.a = (byte) 12;
        this.c = nw3Var;
        this.d = lazy;
        this.b = nw3Var2;
        this.e = mw3Var;
        this.f = nw3Var3;
        this.g = nw3Var4;
        this.h = nw3Var5;
        this.i = kw3Var;
        this.j = hw3Var;
        this.k = nw3Var6;
    }

    public tah(qi8 qi8Var, mi8 mi8Var, kzk kzkVar, int i) {
        this.a = (byte) 10;
        this.c = qi8Var;
        this.b = mi8Var;
        this.e = kzkVar;
        this.f = new dql();
        this.g = kzkVar.a(qi8Var.u, new cj5(this, (byte) 4));
        this.h = new ijk(this);
        this.i = new jjk(this, i);
        this.j = new eo7(this);
        this.k = new sea(this);
        fkg fkgVar = new fkg(this, (byte) 1);
        this.d = fkgVar;
        qi8Var.n.a(fkgVar);
    }

    public tah(ydn ydnVar, Lazy lazy, y1n y1nVar, View view, yug yugVar, gmk gmkVar, jjg jjgVar, y1n y1nVar2) {
        this.a = (byte) 11;
        this.c = new i7f();
        this.d = ydnVar;
        this.b = lazy;
        this.e = y1nVar;
        this.g = view;
        this.h = yugVar;
        this.i = gmkVar;
        this.j = jjgVar;
        this.k = y1nVar2;
    }

    public tah(zyk zykVar, Context context, wm2 wm2Var, i16 i16Var, jf4 jf4Var, ivg ivgVar, yg4 yg4Var) throws s7b {
        ArrayList arrayList;
        this.a = (byte) 3;
        this.c = zykVar;
        this.d = jf4Var;
        this.b = ivgVar;
        this.e = yg4Var;
        this.f = new tc4((qe4) zykVar.getValue(), ((qe4) zykVar.getValue()).b());
        zyk zykVarB = z4c.b(new i51(context, wm2Var, this, i16Var, (byte) 4));
        this.h = zykVarB;
        this.i = v08.a;
        this.j = new Object();
        int i = 0;
        this.k = new AtomicBoolean(false);
        ArrayList arrayListA = xc4.a(((da6) zykVarB.getValue()).a());
        if (arrayListA != null) {
            arrayList = new ArrayList(k95.o(arrayListA, 10));
            int size = arrayListA.size();
            while (i < size) {
                Object obj = arrayListA.get(i);
                i++;
                arrayList.add(((sd4) obj).a);
            }
        } else {
            arrayList = l08.a;
        }
        this.g = new xf2(((qe4) ((zyk) this.c).getValue()).b().d().b.l, sgb.b(fr3.I(wm2Var.a)), arrayList, context);
        A(arrayList);
    }

    public static void Q(a8e a8eVar, a8e a8eVar2, b8e b8eVar) {
        if ((a8eVar instanceof h8e) && (a8eVar2 instanceof h8e)) {
            ((h8e) a8eVar2).h(b8eVar);
            if (b8eVar.n) {
                xye.c(b8eVar);
                return;
            } else {
                b8eVar.j = true;
                return;
            }
        }
        if (!(b8eVar instanceof d13)) {
            a8b.b("Unknown Modifier.Node type");
            return;
        }
        d13 d13Var = (d13) b8eVar;
        if (((b8e) d13Var).n) {
            d13Var.U0();
        }
        d13Var.o = a8eVar2;
        ((b8e) d13Var).c = xye.d(a8eVar2);
        if (((b8e) d13Var).n) {
            d13Var.T0(false);
        }
        if (b8eVar.n) {
            xye.c(b8eVar);
        } else {
            b8eVar.j = true;
        }
    }

    public static b8e l(a8e a8eVar, b8e b8eVar) {
        b8e b8eVarF;
        if (a8eVar instanceof h8e) {
            b8eVarF = ((h8e) a8eVar).f();
            b8eVarF.c = xye.f(b8eVarF);
        } else {
            b8e d13Var = new d13();
            d13Var.c = xye.d(a8eVar);
            ((d13) d13Var).o = a8eVar;
            ((d13) d13Var).q = new HashSet();
            b8eVarF = d13Var;
        }
        if (b8eVarF.n) {
            a8b.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        b8eVarF.i = true;
        b8e b8eVar2 = b8eVar.f;
        if (b8eVar2 != null) {
            b8eVar2.e = b8eVarF;
            b8eVarF.f = b8eVar2;
        }
        b8eVar.f = b8eVarF;
        b8eVarF.e = b8eVar;
        return b8eVarF;
    }

    public static b8e n(b8e b8eVar) {
        boolean z = b8eVar.n;
        if (z) {
            zde zdeVar = xye.a;
            if (!z) {
                a8b.b("autoInvalidateRemovedNode called on unattached node");
            }
            xye.a(b8eVar, -1, 2);
            b8eVar.Q0();
            b8eVar.K0();
        }
        b8e b8eVar2 = b8eVar.f;
        b8e b8eVar3 = b8eVar.e;
        if (b8eVar2 != null) {
            b8eVar2.e = b8eVar3;
            b8eVar.f = null;
        }
        if (b8eVar3 != null) {
            b8eVar3.f = b8eVar2;
            b8eVar.e = null;
        }
        return b8eVar3;
    }

    public final void A(List list) throws s7b {
        if (((AtomicBoolean) this.k).get()) {
            return;
        }
        LinkedHashSet linkedHashSetJ = j(list);
        synchronized (this.j) {
            if (!((AtomicBoolean) this.k).get() && !Intrinsics.a((Set) this.i, linkedHashSetJ)) {
                if (gyg.G(3, "CXCP")) {
                    Objects.toString((Set) this.i);
                    linkedHashSetJ.toString();
                }
                this.i = linkedHashSetJ;
            }
        }
    }

    public final void B(o0g o0gVar, Function1 function1) {
        ((LinkedHashSet) this.j).add(o0gVar.V());
        new rml(Unit.a, (umi) this.c).a(new ry7(this, o0gVar, (byte) 14)).t(new yo7((Object) function1, (Object) this, (Object) o0gVar, (byte) 3)).l();
    }

    public final void C(b8e b8eVar, wye wyeVar) {
        for (b8e b8eVar2 = b8eVar.e; b8eVar2 != null; b8eVar2 = b8eVar2.e) {
            if (b8eVar2 == ((sye) this.d)) {
                m3c m3cVarU = ((m3c) this.c).u();
                wyeVar.w = m3cVarU != null ? (j8b) m3cVarU.F.b : null;
                this.e = wyeVar;
                return;
            } else {
                if ((b8eVar2.c & 2) != 0) {
                    return;
                }
                b8eVar2.S0(wyeVar);
            }
        }
    }

    @Override // defpackage.hf3
    public final void D() {
        L(0);
    }

    @Override // defpackage.hf3
    public final void E() {
        ((nvg) this.c).a(0);
    }

    public final void F(pc6 pc6Var) {
        rc6 rc6Var = (rc6) this.f;
        synchronized (rc6Var) {
            rc6Var.a.put(pc6Var.a(), pc6Var);
        }
    }

    public final void G(Class cls, Class cls2, jzh jzhVar) {
        vk vkVar = (vk) this.g;
        synchronized (vkVar) {
            vkVar.a.add(new t1m(cls, cls2, jzhVar));
        }
    }

    public final void H(boolean z) {
        ((lrk) this.g).invoke(new wsl(z));
    }

    public final void I(b0a b0aVar, a0a a0aVar) {
        pde pdeVar = (pde) this.h;
        ArrayList arrayList = new ArrayList((Collection) pdeVar.g());
        int iIndexOf = arrayList.indexOf(b0aVar);
        if (iIndexOf == -1) {
            return;
        }
        arrayList.set(iIndexOf, a0aVar);
        pdeVar.r(arrayList);
    }

    @Override // defpackage.b0i
    public final void J(int i) {
        boolean z = false;
        L(0);
        cvg cvgVar = (cvg) this.d;
        z77 z77Var = cvgVar.r;
        int iA = vep.A(i);
        ijm ijmVar = ijm.b;
        if (iA == 0) {
            a0i a0iVar = new a0i(new pjg(cvgVar, (byte) 5), null);
            z77Var.getClass();
            z77Var.b(a0iVar, ijmVar);
        } else {
            if (iA != 1) {
                return;
            }
            yz5 yz5Var = new yz5(z, z, (byte) 6);
            z77Var.getClass();
            z77Var.b(yz5Var, ijmVar);
        }
    }

    public final void K() {
        for (b8e b8eVar = (b8e) this.g; b8eVar != null; b8eVar = b8eVar.f) {
            b8eVar.P0();
            if (b8eVar.i) {
                zde zdeVar = xye.a;
                if (!b8eVar.n) {
                    a8b.b("autoInvalidateInsertedNode called on unattached node");
                }
                xye.a(b8eVar, -1, 1);
            }
            if (b8eVar.j) {
                xye.c(b8eVar);
            }
            b8eVar.i = false;
            b8eVar.j = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(int i) {
        nvg nvgVar = (nvg) this.c;
        if (i != nvgVar.h) {
            nvgVar.h = i;
            if (i == 0) {
                nvgVar.b((uvg) nvgVar.d.a.g());
            }
        }
    }

    public final void M(fdn fdnVar) {
        String str;
        bnk bnkVar;
        ydn ydnVar = (ydn) this.d;
        if (((Boolean) ((jjg) this.j).get()).booleanValue() && !fdnVar.e) {
            ((y1n) this.k).run();
        }
        ydnVar.getClass();
        if (fdnVar.e) {
            N.M5FruDNy(fdnVar.b);
        } else {
            ydnVar.N = fdnVar;
            ydnVar.G = 4;
            vdn vdnVar = ydnVar.d;
            bnk bnkVar2 = null;
            str = null;
            String str2 = null;
            ydnVar.d = new vdn(vdnVar.a, vdnVar.b(), null, null);
            if (fdnVar.equals(ydnVar.o())) {
                str = null;
            } else {
                fdn fdnVar2 = fdnVar.b() ? fdnVar : fdnVar.f;
                Iterator it = ydnVar.s.a(null).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        bnkVar = null;
                        break;
                    } else {
                        bnkVar = (bnk) it.next();
                        if (bnkVar.a.equals(fdnVar2.b)) {
                            break;
                        }
                    }
                }
                if (bnkVar != null && !fdnVar.b()) {
                    str2 = fdnVar.c;
                }
                str = str2;
                bnkVar2 = bnkVar;
            }
            ydnVar.c.b(bnkVar2, str).d();
            if (ydnVar.d.a) {
                ydnVar.f();
            }
        }
        ydnVar.e.I(ydnVar.m(), ydnVar.d.a);
        h7f h7fVar = ydnVar.t;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((tdn) g7fVarH.next()).t();
        }
        ydnVar.C(true);
        g7f g7fVar = new g7f((i7f) this.c);
        while (g7fVar.hasNext()) {
            ((Callback) g7fVar.next()).run(fdnVar);
        }
        ((y1n) this.e).run();
    }

    public final boolean N() {
        wvg wvgVar = (wvg) ((slk) this.i).i.g();
        int iOrdinal = uvg.d(wvgVar).ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return true;
            }
            if (iOrdinal != 4) {
                return false;
            }
        }
        return wvgVar.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0264, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x026a, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x014d, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0153, code lost:
    
        if ((r19 & 1) != 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0155, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0157, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0159, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015a, code lost:
    
        if (r13 > r3) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015c, code lost:
    
        if (r13 == r12) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015e, code lost:
    
        if (r13 == r3) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0160, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x016e, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0171, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0173, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017c, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017e, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0185, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018b, code lost:
    
        if (r3 == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018d, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0190, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0192, code lost:
    
        if (r14 != r11) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0194, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0197, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0199, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a3, code lost:
    
        if (r14 <= r7) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a5, code lost:
    
        if (r11 <= r15) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a7, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b3, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b5, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01bc, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c0, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c4, code lost:
    
        if (r24 == 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c6, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c8, code lost:
    
        if (r11 < r12) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ca, code lost:
    
        if (r11 > r3) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d0, code lost:
    
        if (r16[r17 + r11] < r14) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d2, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(int r32, dee r33, dee r34, b8e r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tah.O(int, dee, dee, b8e, boolean):void");
    }

    public final void P() {
        g3c g3cVar;
        s3a s3aVar;
        m3c m3cVar = (m3c) this.c;
        g3c g3cVar2 = (j8b) this.b;
        for (e3c e3cVar = ((b8e) ((lbl) this.f)).e; e3cVar != null; e3cVar = ((b8e) e3cVar).e) {
            e3c e3cVarI = ui6.i(e3cVar);
            if (e3cVarI != null) {
                g3c g3cVar3 = ((b8e) e3cVar).h;
                if (g3cVar3 != null) {
                    g3cVar = g3cVar3;
                    e3c e3cVar2 = g3cVar.b0;
                    g3cVar.C1(e3cVarI);
                    if (e3cVar2 != e3cVar && (s3aVar = ((wye) g3cVar).T) != null) {
                        s3aVar.c();
                    }
                } else {
                    g3cVar = new g3c(m3cVar, e3cVarI);
                    e3cVar.S0(g3cVar);
                }
                ((wye) g3cVar2).w = g3cVar;
                ((wye) g3cVar).v = g3cVar2;
                g3cVar2 = g3cVar;
            } else {
                e3cVar.S0(g3cVar2);
            }
        }
        m3c m3cVarU = m3cVar.u();
        ((wye) g3cVar2).w = m3cVarU != null ? (j8b) m3cVarU.F.b : null;
        this.e = g3cVar2;
    }

    public final ggn R() {
        return new ggn(((nw3) this.f).b.R(), (ktg) ((Lazy) this.d).get(), ((nw3) this.b).b.M(), ((nw3) this.c).b.c(), ((nw3) this.g).b.S(), (mw3) this.e, ((nw3) this.h).b.T(), (kw3) this.i, (pfn) ((hw3) this.j).get(), ru9.c(((nw3) this.k).b));
    }

    public final void a(Uri uri, String str) {
        zz9 zz9Var = new zz9(o29.IMAGE, null, str);
        c(zz9Var);
        File fileR = r(str, "webp");
        B(new v12(uri, fileR), new d0a(this, zz9Var, str, fileR, (byte) 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r0.B(r11, r1) == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
    
        if (r0.B(r11, r1) == r2) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.yxc r11, nt5 r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.j
            nv6 r0 = (nv6) r0
            boolean r1 = r12 instanceof defpackage.yga
            if (r1 == 0) goto L17
            r1 = r12
            yga r1 = (defpackage.yga) r1
            int r2 = r1.x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.x = r2
            goto L1c
        L17:
            yga r1 = new yga
            r1.<init>(r10, r12)
        L1c:
            java.lang.Object r12 = r1.v
            px5 r2 = px5.a
            int r3 = r1.x
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 0
            r8 = 1
            if (r3 == 0) goto L4a
            if (r3 == r8) goto L44
            if (r3 == r6) goto L3c
            if (r3 == r5) goto L37
            if (r3 == r4) goto L37
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r10)
            return r7
        L37:
            ybh.y(r12)
            goto Lb6
        L3c:
            boolean r10 = r1.u
            yxc r11 = r1.t
            ybh.y(r12)
            goto La0
        L44:
            yxc r11 = r1.t
            ybh.y(r12)
            goto L7b
        L4a:
            ybh.y(r12)
            int r12 = r11.ordinal()
            if (r12 == 0) goto L64
            if (r12 != r8) goto L60
            r1.t = r7
            r1.x = r4
            java.lang.Object r10 = r0.B(r11, r1)
            if (r10 != r2) goto Lb6
            goto Lb4
        L60:
            h9o.p()
            return r7
        L64:
            r1.t = r11
            r1.x = r8
            cv6 r12 = bb7.a
            d7a r12 = s6d.a
            d7a r12 = r12.e
            yf r3 = new yf
            r4 = 28
            r3.<init>(r4, r7, r10)
            java.lang.Object r12 = na2.Z(r12, r3, r1)
            if (r12 == r2) goto Lb4
        L7b:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lb5
            java.lang.Object r3 = r10.k
            ole r3 = (defpackage.ole) r3
            java.lang.Object r10 = r10.b
            com.opera.android.weather.ui.WeatherWidgetActivity r10 = (com.opera.android.weather.ui.WeatherWidgetActivity) r10
            r1.t = r11
            r1.u = r12
            r1.x = r6
            java.lang.Object r3 = r3.a
            u74 r3 = (defpackage.u74) r3
            wv9 r3 = r3.a
            java.lang.Object r10 = r3.g(r10, r1)
            if (r10 == r2) goto Lb4
            r9 = r12
            r12 = r10
            r10 = r9
        La0:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto Lb5
            r1.t = r7
            r1.u = r10
            r1.x = r5
            java.lang.Object r10 = r0.B(r11, r1)
            if (r10 != r2) goto Lb6
        Lb4:
            return r2
        Lb5:
            r8 = 0
        Lb6:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tah.b(yxc, nt5):java.lang.Object");
    }

    public final void c(zz9 zz9Var) {
        pde pdeVar = (pde) this.h;
        ArrayList arrayList = new ArrayList((Collection) pdeVar.g());
        arrayList.add(zz9Var);
        pdeVar.r(arrayList);
    }

    public final void d(Class cls, u18 u18Var) {
        o28 o28Var = (o28) this.d;
        synchronized (o28Var) {
            o28Var.a.add(new n28(cls, u18Var));
        }
    }

    public final void e(boolean z) {
        ((lrk) this.h).invoke(Boolean.valueOf(z));
    }

    public final void f(Class cls, qyh qyhVar) {
        s64 s64Var = (s64) this.e;
        synchronized (s64Var) {
            s64Var.b.add(new ryh(cls, qyhVar));
        }
    }

    public final void g(Class cls, Class cls2, w7e w7eVar) {
        k5o k5oVar = (k5o) this.c;
        synchronized (k5oVar) {
            d5o d5oVar = (d5o) k5oVar.b;
            synchronized (d5oVar) {
                try {
                    wbe wbeVar = new wbe(cls, cls2, w7eVar);
                    ArrayList arrayList = (ArrayList) d5oVar.a;
                    arrayList.add(arrayList.size(), wbeVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((jc9) k5oVar.c).a.clear();
        }
    }

    public final void h(String str, Class cls, Class cls2, oyh oyhVar) {
        mgh mghVar = (mgh) this.b;
        synchronized (mghVar) {
            mghVar.i(str).add(new pyh(cls, cls2, oyhVar));
        }
    }

    @Override // defpackage.dmk
    public final void handleSubscriptionPlans(bmk bmkVar) {
        ((ode) this.j).r(new dvg(bmkVar));
    }

    @Override // defpackage.dmk
    public final void handleSubscriptionPlans(cmk cmkVar) {
        ((ode) this.j).r(new evg());
    }

    @Override // defpackage.dmk
    public final void handleSubscriptionPlans(zlk zlkVar) {
        cvg cvgVar = (cvg) this.d;
        fmk fmkVar = (fmk) this.f;
        Objects.requireNonNull(fmkVar);
        pjg pjgVar = new pjg(fmkVar, (byte) 6);
        if (cvgVar.w == null) {
            os1 os1Var = new os1(new o8f(cvgVar, (byte) 24), pjgVar, new pjg(cvgVar, (byte) 5));
            cvgVar.w = os1Var;
            z77 z77Var = cvgVar.r;
            z77Var.getClass();
            z77Var.b(os1Var, ijm.b);
        }
    }

    public final ep2 i() {
        String strConcat = ((String) this.b) == null ? " mimeType" : "";
        if (((Integer) this.c) == null) {
            strConcat = strConcat.concat(" profile");
        }
        if (((zpl) this.d) == null) {
            strConcat = strConcat.concat(" inputTimebase");
        }
        if (((Size) this.e) == null) {
            strConcat = strConcat.concat(" resolution");
        }
        if (((Integer) this.f) == null) {
            strConcat = strConcat.concat(" colorFormat");
        }
        if (((fp2) this.g) == null) {
            strConcat = strConcat.concat(" dataSpace");
        }
        if (((Integer) this.h) == null) {
            strConcat = strConcat.concat(" captureFrameRate");
        }
        if (((Integer) this.i) == null) {
            strConcat = strConcat.concat(" encodeFrameRate");
        }
        if (((Integer) this.j) == null) {
            strConcat = strConcat.concat(" IFrameInterval");
        }
        if (((Integer) this.k) == null) {
            strConcat = strConcat.concat(" bitrate");
        }
        if (strConcat.isEmpty()) {
            return new ep2((String) this.b, ((Integer) this.c).intValue(), (zpl) this.d, (Size) this.e, ((Integer) this.f).intValue(), (fp2) this.g, ((Integer) this.h).intValue(), ((Integer) this.i).intValue(), ((Integer) this.j).intValue(), ((Integer) this.k).intValue());
        }
        qp2.n("Missing required properties:".concat(strConcat));
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: s7b */
    public final LinkedHashSet j(List list) throws s7b {
        String strX;
        zyk zykVar = (zyk) this.h;
        da6 da6Var = (da6) zykVar.getValue();
        jf4 jf4Var = (jf4) this.d;
        List<String> listK0 = CollectionsKt.k0(list);
        ivg ivgVar = (ivg) this.b;
        try {
            ArrayList arrayList = new ArrayList();
            xc4 xc4VarA = da6Var.a();
            if (jf4Var != null) {
                try {
                    strX = jpo.x(xc4VarA, jf4Var.b());
                } catch (IllegalStateException unused) {
                    strX = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : listK0) {
                    if (!Intrinsics.a(str, strX)) {
                        da6 da6Var2 = da6Var.b;
                        sd4.a(str);
                        arrayList2.add(((zd4) new fa6(da6Var2, new m20(str, (byte) 4), ivgVar).y.get()).g());
                    }
                }
                ArrayList arrayListA = jf4Var.a(arrayList2);
                int size = arrayListA.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListA.get(i);
                    i++;
                    arrayList.add(((ud4) obj).e());
                }
                listK0 = arrayList;
            }
            xc4 xc4VarA2 = ((da6) zykVar.getValue()).a();
            ArrayList arrayList3 = new ArrayList();
            for (String str2 : listK0) {
                if (Intrinsics.a(str2, BuildConfig.BUILD_NUMBER) || Intrinsics.a(str2, "1")) {
                    arrayList3.add(str2);
                } else if (wyh.F(xc4VarA2, str2)) {
                    arrayList3.add(str2);
                }
            }
            return new LinkedHashSet(arrayList3);
        } catch (IllegalStateException e) {
            throw new s7b(e);
        }
    }

    public final void k() {
        xf8.F0((pde) this.h, l08.a);
        final byte b = 0;
        plk plkVarB = new rml(Unit.a, (umi) this.c).b(new Function1(this) { // from class: c0a
            public final /* synthetic */ tah b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b2 = b;
                tah tahVar = this.b;
                switch (b2) {
                    case 0:
                        return ((File) ((zyk) tahVar.i).getValue()).listFiles();
                    default:
                        Object obj2 = ((t0i) obj).a;
                        if (obj2 instanceof q0i) {
                            obj2 = null;
                        }
                        File[] fileArr = (File[]) obj2;
                        if (fileArr != null) {
                            p4j p4jVar = new p4j();
                            p4jVar.addAll((LinkedHashSet) tahVar.j);
                            p4jVar.addAll((LinkedHashSet) tahVar.k);
                            for (b0a b0aVar : (Iterable) ((pde) tahVar.h).g()) {
                                if (b0aVar != null) {
                                    if (b0aVar instanceof zz9) {
                                        File file = ((zz9) b0aVar).b;
                                        if (file != null) {
                                            p4jVar.add(file);
                                        }
                                    } else if (b0aVar instanceof a0a) {
                                        p4jVar.add(((a0a) b0aVar).b);
                                    }
                                }
                                h9o.p();
                                return null;
                                break;
                            }
                            p4j p4jVarA = z4j.a(p4jVar);
                            ArrayList arrayList = new ArrayList();
                            for (File file2 : fileArr) {
                                if (p4jVarA.a.containsKey(file2)) {
                                    file2 = null;
                                }
                                if (file2 != null) {
                                    arrayList.add(file2);
                                }
                            }
                            new rml(Unit.a, (umi) tahVar.c).b(new l51(arrayList, (byte) 2)).l();
                        }
                        return Unit.a;
                }
            }
        });
        final byte b2 = 1;
        plkVarB.t(new Function1(this) { // from class: c0a
            public final /* synthetic */ tah b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b22 = b2;
                tah tahVar = this.b;
                switch (b22) {
                    case 0:
                        return ((File) ((zyk) tahVar.i).getValue()).listFiles();
                    default:
                        Object obj2 = ((t0i) obj).a;
                        if (obj2 instanceof q0i) {
                            obj2 = null;
                        }
                        File[] fileArr = (File[]) obj2;
                        if (fileArr != null) {
                            p4j p4jVar = new p4j();
                            p4jVar.addAll((LinkedHashSet) tahVar.j);
                            p4jVar.addAll((LinkedHashSet) tahVar.k);
                            for (b0a b0aVar : (Iterable) ((pde) tahVar.h).g()) {
                                if (b0aVar != null) {
                                    if (b0aVar instanceof zz9) {
                                        File file = ((zz9) b0aVar).b;
                                        if (file != null) {
                                            p4jVar.add(file);
                                        }
                                    } else if (b0aVar instanceof a0a) {
                                        p4jVar.add(((a0a) b0aVar).b);
                                    }
                                }
                                h9o.p();
                                return null;
                                break;
                            }
                            p4j p4jVarA = z4j.a(p4jVar);
                            ArrayList arrayList = new ArrayList();
                            for (File file2 : fileArr) {
                                if (p4jVarA.a.containsKey(file2)) {
                                    file2 = null;
                                }
                                if (file2 != null) {
                                    arrayList.add(file2);
                                }
                            }
                            new rml(Unit.a, (umi) tahVar.c).b(new l51(arrayList, (byte) 2)).l();
                        }
                        return Unit.a;
                }
            }
        }).l();
    }

    @Override // defpackage.b0i
    public final void m() {
        ((nvg) this.c).a(3);
    }

    public final Set o() {
        synchronized (this.j) {
            if (((AtomicBoolean) this.k).get()) {
                return v08.a;
            }
            return new LinkedHashSet((Set) this.i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ig4 */
    public final zd4 p(String str) throws ig4 {
        if (((AtomicBoolean) this.k).get()) {
            throw new ig4("CameraFactory has been shut down.");
        }
        da6 da6Var = ((da6) ((zyk) this.h).getValue()).b;
        sd4.a(str);
        return (zd4) new fa6(da6Var, new m20(str, (byte) 4), (ivg) this.b).y.get();
    }

    @Override // defpackage.b0i
    public final void q() throws JSONException {
        p8f p8fVar = ((nvg) this.c).c;
        lvg lvgVar = new lvg(8, 5);
        mvg mvgVarT = p8fVar.t();
        if (mvgVarT != null) {
            mvgVarT.f.add(lvgVar);
            p8fVar.G(mvgVarT);
        }
        ((cvg) this.d).s.I();
    }

    public final File r(String str, String str2) {
        return new File((File) ((zyk) this.i).getValue(), sko.v(str, ".", str2));
    }

    public final Object s(yka ykaVar) {
        cv6 cv6Var = bb7.a;
        Object objZ = na2.Z(s6d.a.e, new rf4((byte) 7, (mt5) null, this), ykaVar);
        return objZ == px5.a ? objZ : Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yrh */
    public final ArrayList t() throws yrh {
        ArrayList arrayList;
        d14 d14Var = (d14) this.h;
        synchronized (d14Var) {
            arrayList = d14Var.a;
        }
        if (arrayList.isEmpty()) {
            throw new yrh("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final String toString() {
        switch (this.a) {
            case 7:
                StringBuilder sb = new StringBuilder("[");
                b8e b8eVar = (b8e) this.g;
                b8e b8eVar2 = (lbl) this.f;
                if (b8eVar == b8eVar2) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (b8eVar != null && b8eVar != b8eVar2) {
                            sb.append(String.valueOf(b8eVar));
                            if (b8eVar.f == b8eVar2) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                b8eVar = b8eVar.f;
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: yrh */
    public final List u(Object obj) throws yrh {
        List listUnmodifiableList;
        k5o k5oVar = (k5o) this.c;
        k5oVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (k5oVar) {
            x7e x7eVar = (x7e) ((jc9) k5oVar.c).a.get(cls);
            listUnmodifiableList = x7eVar == null ? null : x7eVar.a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(((d5o) k5oVar.b).s(cls));
                if (((x7e) ((jc9) k5oVar.c).a.put(cls, new x7e(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new yrh("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            v7e v7eVar = (v7e) listUnmodifiableList.get(i);
            if (v7eVar.b(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                    z = false;
                }
                arrayList.add(v7eVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new yrh("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    @Override // defpackage.hf3
    public final void v() {
        L(0);
    }

    public final boolean w(int i) {
        return (((b8e) this.g).d & i) != 0;
    }

    public final void x() {
        this.j = null;
        ((ImageView) this.h).setImageDrawable(null);
        ((LoadingView) this.d).setVisibility(8);
    }

    public final void y(String str) {
        fp1 fp1Var = (WeatherWidgetActivity) this.c;
        xgf xgfVar = new xgf(str);
        xgfVar.m = lqm.H;
        xgfVar.n = true;
        zi4.u(fp1Var, xgfVar);
        fp1Var.finish();
    }

    public final void z(String str, amk amkVar) {
        h1b h1bVar;
        ebh ebhVar = (ebh) this.k;
        if (ebhVar != null && (h1bVar = (h1b) ebhVar.a.g()) != null) {
            boolean z = false;
            a1b a1bVarU = h1bVar.u(0);
            while (a1bVarU.hasNext()) {
                a1b a1bVarU2 = ((uah) a1bVarU.next()).e.u(0);
                while (a1bVarU2.hasNext()) {
                    if (zsk.f.containsKey((String) a1bVarU2.next())) {
                        z77 z77Var = ((cvg) this.d).r;
                        yz5 yz5Var = new yz5(z, z, (byte) 2);
                        z77Var.getClass();
                        z77Var.b(yz5Var, ijm.b);
                        return;
                    }
                }
            }
        }
        byte b = 1;
        L(1);
        p8f p8fVar = ((nvg) this.c).c;
        lvg lvgVar = new lvg(8, 7);
        mvg mvgVarT = p8fVar.t();
        if (mvgVarT != null) {
            mvgVarT.f.add(lvgVar);
            p8fVar.G(mvgVarT);
        }
        ((qb7) this.h).t(amkVar, str, new bvg(this, b));
    }
}
