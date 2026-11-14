package defpackage;

import J.N;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.custom_views.LayoutDirectionLinearLayout;
import com.opera.android.custom_views.StylingImageView;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.favorites.FavoritesBridge;
import com.opera.android.favorites.e;
import com.opera.android.settings.SettingsManager;
import com.opera.api.Callback;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class qb7 implements ob7, xsc, wm, bnj {
    public static final String[] d = {"city_index", "city_id", Constants.Params.NAME, Constants.Params.STATE, "zip_code", "origin", "selected_state"};
    public static final psc e = new psc(0, -9223372036854775807L);
    public static final psc f = new psc(2, -9223372036854775807L);
    public static final psc g = new psc(3, -9223372036854775807L);
    public static final tmj h = new tmj((byte) 13);
    public static volatile qb7 i;
    public Object a;
    public Object b;
    public Object c;

    public qb7(byte b) {
        switch (b) {
            case 13:
                this.b = new ms2(this);
                break;
            default:
                this.a = sgb.b(zch.a());
                this.b = new pfe();
                this.c = new LinkedHashMap();
                nyh.a.add(this);
                break;
        }
    }

    public qb7(af3 af3Var, skm skmVar) {
        this.c = lh4.c;
        this.a = af3Var;
        this.b = skmVar;
    }

    public qb7(Context context, byte b) throws Resources.NotFoundException {
        byte b2 = 4;
        switch (b) {
            case SizeUtil.textSize0 /* 20 */:
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f03.e0(context, 2130970262, ldd.class.getCanonicalName()).data, ihh.z);
                this.a = pjn.c(typedArrayObtainStyledAttributes.getResourceId(4, 0), context);
                pjn.c(typedArrayObtainStyledAttributes.getResourceId(2, 0), context);
                pjn.c(typedArrayObtainStyledAttributes.getResourceId(3, 0), context);
                pjn.c(typedArrayObtainStyledAttributes.getResourceId(5, 0), context);
                ColorStateList colorStateListL = j14.L(context, typedArrayObtainStyledAttributes, 7);
                this.b = pjn.c(typedArrayObtainStyledAttributes.getResourceId(9, 0), context);
                pjn.c(typedArrayObtainStyledAttributes.getResourceId(8, 0), context);
                this.c = pjn.c(typedArrayObtainStyledAttributes.getResourceId(10, 0), context);
                new Paint().setColor(colorStateListL.getDefaultColor());
                typedArrayObtainStyledAttributes.recycle();
                break;
            case 27:
                vy vyVar = new vy(this, b2);
                this.a = new ArrayList();
                xnh xnhVarT = xnh.t(context);
                this.b = xnhVarT;
                xnhVarT.F(vyVar);
                break;
            default:
                cpj cpjVar = wjh.i;
                this.a = new yjo((File) cpjVar.b(context).d, "omsdk.js", "https://res.adx.opera.com/om/omjs/Service/omsdk-v3.js");
                this.b = new yjo((File) cpjVar.b(context).d, "omsdk-session-client.js", "https://res.adx.opera.com/om/omjs/Service/omid-session-client-v3.js");
                break;
        }
    }

    public qb7(asa asaVar, t66 t66Var, ComponentName componentName) {
        this.a = new Object();
        this.b = t66Var;
        this.c = componentName;
    }

    public qb7(c37 c37Var, zy9 zy9Var, qii qiiVar) {
        this.a = c37Var;
        this.b = zy9Var;
        this.c = new LinkedHashSet();
    }

    public qb7(enb enbVar) {
        this.a = enbVar;
    }

    public qb7(ikc ikcVar, ImageView imageView, ImageView imageView2, fd fdVar) {
        this.a = imageView;
        this.b = imageView2;
        this.c = fdVar;
        a26.U(fdVar, ikcVar, new yc(this, (byte) 2), new oc2(this, (byte) 29));
    }

    public /* synthetic */ qb7(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qb7(String str) {
        String strConcat = "ExoPlayer:Loader:".concat(str);
        String str2 = tym.a;
        this(new enb(Executors.newSingleThreadExecutor(new kj5(strConcat, (byte) 1)), new uac((byte) 9)));
    }

    public qb7(nr8 nr8Var, u59 u59Var) {
        this.a = nr8Var;
        this.b = u59Var;
        this.c = new HashMap();
    }

    public qb7(nx5 nx5Var, t3e t3eVar) {
        this.a = new ArrayList();
        nak nakVarF = z4o.f((Object) null);
        this.b = nakVarF;
        this.c = a26.j(nakVarF);
        j14.Y(new z99(((h5e) t3eVar).r, new fg6((byte) 10, (mt5) null, (Object) this), (byte) 2), nx5Var);
    }

    public qb7(vk6 vk6Var, wth wthVar) {
        this.a = vk6Var;
        this.b = wthVar;
        this.c = new kze(Boolean.FALSE);
        pjb pjbVar = vk6Var.a.a.f;
        new r62((pjbVar == null ? null : pjbVar).a(new String[]{"chat"}, false, new y2((byte) 16)), new iu2(this, (byte) 10), (byte) 1);
    }

    public final void A(ImageView imageView, pc pcVar) {
        fd fdVar = (fd) this.c;
        if (fdVar.e(pcVar) == null) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        jf jfVarE = fdVar.e(pcVar);
        if (jfVarE == null) {
            jfVarE = fd.e;
        }
        xc xcVar = jfVarE.c;
        if (xcVar == null) {
            xcVar = pcVar.a;
        }
        imageView.setImageResource(xcVar.a);
        CharSequence charSequenceA = xcVar.b.a(imageView.getResources());
        int i2 = xcVar.e;
        imageView.setContentDescription(charSequenceA);
        n1h.o(imageView, charSequenceA, i2);
        imageView.setOnClickListener(new a24(jfVarE, (byte) 0));
        imageView.setEnabled(jfVarE.d);
    }

    public final void B() throws JSONException {
        SharedPreferences.Editor editorEdit = ((SharedPreferences) ((zyk) this.c).getValue()).edit();
        Map map = (Map) ((zyk) this.b).getValue();
        ArrayList arrayList = new ArrayList();
        for (ot3 ot3Var : map.values()) {
            orb orbVar = new orb();
            nt3 nt3Var = ot3Var.a;
            orb orbVar2 = new orb();
            orbVar2.n(nt3Var.a, "y");
            orbVar2.n(nt3Var.b, "m");
            orbVar2.n(nt3Var.c, "d");
            orbVar.p(orbVar2, "day");
            LinkedHashSet linkedHashSet = ot3Var.b;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((pc) it.next()).ordinal()));
            }
            orbVar.p(new vpb((Collection) arrayList2), "a");
            arrayList.add(orbVar);
        }
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            jSONArray.put(orb.t(obj));
        }
        editorEdit.putString("active_interactions", jSONArray.toString());
        editorEdit.apply();
    }

    public final void C(rsc rscVar, osc oscVar, int i2) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        this.c = null;
        qsc qscVar = new qsc(this, looperMyLooper, rscVar, oscVar, i2, SystemClock.elapsedRealtime());
        z4o.H(((qsc) this.b) == null);
        this.b = qscVar;
        qscVar.b();
    }

    public final void D() {
        synchronized (this) {
            ((AtomicInteger) this.a).decrementAndGet();
            if (((AtomicInteger) this.a).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public final st[] E(st[] stVarArr) {
        if (stVarArr == null) {
            return new st[0];
        }
        int length = stVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            st stVar = stVarArr[i2];
            Long l = (Long) ((HashMap) this.c).get(stVar.j);
            if (!Intrinsics.a(l, stVar.i)) {
                stVarArr[i2] = st.a(stVar, l);
            }
        }
        return stVarArr;
    }

    @Override // defpackage.bnj
    public final void F(Bitmap bitmap) {
        ((ct1) this.a).b.d.setImageDrawable(new gcd(bitmap, gjf.a((Context) ((dt1) this.b).b)));
    }

    public final void a(n1p n1pVar) {
        yjo yjoVar = (yjo) this.a;
        if (((String) this.c) == null || !yjoVar.a().exists()) {
            sa7 sa7Var = l1p.a;
            l1p.a(yjoVar.b, yjoVar.a(), new l5b((byte) 14, false), null, new eto(this, n1pVar));
        } else {
            p0i p0iVar = t0i.b;
            n1pVar.invoke(new t0i(yjoVar.a()));
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public final void b(int i2, int i3, View.OnClickListener onClickListener) {
        LayoutInflater layoutInflater = (LayoutInflater) this.b;
        LinearLayout linearLayout = (LinearLayout) this.a;
        View viewInflate = layoutInflater.inflate(2131558501, (ViewGroup) linearLayout, false);
        linearLayout.addView(viewInflate);
        int i4 = 2131362594;
        ?? r2 = (StylingImageView) w1h.j(2131362594, viewInflate);
        if (r2 != 0) {
            LayoutDirectionLinearLayout layoutDirectionLinearLayout = (LayoutDirectionLinearLayout) viewInflate;
            yq1 yq1Var = (StylingTextView) w1h.j(2131363525, viewInflate);
            if (yq1Var != null) {
                r2.setVisibility(0);
                r2.setImageDrawable(sgb.F(i2, layoutDirectionLinearLayout.getContext()));
                yq1Var.setText(layoutDirectionLinearLayout.getContext().getResources().getString(i3));
                layoutDirectionLinearLayout.setOnClickListener(new ks8(new nf(onClickListener, this, (byte) 7), (byte) 2));
                return;
            }
            i4 = 2131363525;
        }
        t3p.q("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i4)));
    }

    public final void c(n1p n1pVar) {
        yjo yjoVar = (yjo) this.b;
        if (yjoVar.a().exists()) {
            p0i p0iVar = t0i.b;
            n1pVar.invoke(new t0i(yjoVar.a()));
        } else {
            sa7 sa7Var = l1p.a;
            l1p.a(yjoVar.b, yjoVar.a(), new l5b((byte) 14, false), null, new eto(n1pVar, this));
        }
    }

    @Override // defpackage.wm
    public final void d(bm bmVar) {
    }

    public final boolean e() {
        synchronized (this) {
            if (((AtomicBoolean) this.b).get()) {
                return false;
            }
            ((AtomicInteger) this.a).incrementAndGet();
            return true;
        }
    }

    @Override // defpackage.bnj
    public final void f(boolean z) {
        StylingImageView stylingImageView = ((ct1) this.a).b.d;
        Context context = (Context) ((dt1) this.b).b;
        String str = (String) this.c;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        int i2 = vmj.g;
        stylingImageView.setImageDrawable(tmj.l(context, str2, umj.d, tmj.i(context), fan.a(40.0f, context.getResources()), na5.b, true));
    }

    @Override // defpackage.wm
    public final void g() {
        ((h10) this.a).w.W();
    }

    public final q30 h() {
        i4d i4dVar;
        m54 m54VarB;
        v30 v30Var = (v30) this.a;
        if (v30Var == null || (i4dVar = (i4d) this.b) == null) {
            t3p.w("Cannot build without parameters and/or key material");
            return null;
        }
        if (v30Var.a != ((m54) i4dVar.b).a.length) {
            t3p.w("Key size mismatch");
            return null;
        }
        if (v30Var.a() && ((Integer) this.c) == null) {
            t3p.w("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((v30) this.a).a() && ((Integer) this.c) != null) {
            t3p.w("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        u30 u30Var = ((v30) this.a).d;
        if (u30Var == u30.e) {
            m54VarB = juf.a;
        } else if (u30Var == u30.d) {
            m54VarB = juf.a(((Integer) this.c).intValue());
        } else {
            if (u30Var != u30.c) {
                j9h.u(((v30) this.a).d, "Unknown AesEaxParameters.Variant: ");
                return null;
            }
            m54VarB = juf.b(((Integer) this.c).intValue());
        }
        return new q30((v30) this.a, (i4d) this.b, m54VarB, (Integer) this.c);
    }

    public final void i() {
        qsc qscVar = (qsc) this.b;
        qscVar.getClass();
        qscVar.a(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, com.opera.android.custom_views.StylingImageView] */
    public final View j(Drawable drawable, boolean z, String str, View.OnClickListener onClickListener, int i2, boolean z2) {
        LayoutInflater layoutInflater = (LayoutInflater) this.b;
        LinearLayout linearLayout = (LinearLayout) this.a;
        View viewInflate = layoutInflater.inflate(i2, (ViewGroup) linearLayout, false);
        linearLayout.addView(viewInflate);
        ?? r0 = (StylingImageView) viewInflate.findViewById(2131362594);
        if (drawable != null) {
            r0.setVisibility(0);
            r0.setImageDrawable(drawable);
            if (!z) {
                p73 p73Var = new p73(r0, (byte) 0);
                dll dllVarS = q9n.s(r0);
                if (dllVarS != null) {
                    u8n.b(dllVarS, r0, p73Var);
                }
                p73Var.a(r0);
            }
        } else {
            r0.setVisibility(8);
        }
        ((TextView) viewInflate.findViewById(2131363525)).setText(str);
        viewInflate.setOnClickListener(new ks8(new nf(onClickListener, (q73) this.c, (byte) 13), (byte) 2));
        View viewFindViewById = viewInflate.findViewById(2131362121);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z2 ? 0 : 8);
        }
        return viewInflate;
    }

    public final void k(int i2, int i3, View.OnClickListener onClickListener) {
        mej mejVar = ((q73) this.c).b;
        j(sgb.F(i2, mejVar.getContext()), true, mejVar.getContext().getResources().getString(i3), onClickListener, 2131559325, false);
    }

    public final void l(int i2, View.OnClickListener onClickListener) {
        j(null, true, ((q73) this.c).b.getContext().getResources().getString(i2), onClickListener, 2131559325, false);
    }

    public final View m(int i2, View.OnClickListener onClickListener) {
        mej mejVar = ((q73) this.c).b;
        return j(sgb.F(2131232244, mejVar.getContext()), true, mejVar.getContext().getResources().getString(i2), onClickListener, 2131559327, false);
    }

    public final void maybeThrowError() throws IOException {
        IOException iOException = (IOException) this.c;
        if (iOException != null) {
            throw iOException;
        }
        qsc qscVar = (qsc) this.b;
        if (qscVar != null) {
            int i2 = qscVar.a;
            IOException iOException2 = qscVar.e;
            if (iOException2 != null && qscVar.f > i2) {
                throw iOException2;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(1:(1:(1:(1:(5:14|52|(1:56)|57|58)(2:15|16))(5:17|40|(1:44)|45|46))(6:18|65|19|37|(5:39|40|(2:42|44)|45|46)|51))(1:23))(3:24|(1:26)|51)|70|27|(1:31)|32|33|68|34|(3:36|37|(0))|51) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fc, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010d, code lost:
    
        if (r3.i(r4) == r5) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r17, kotlin.jvm.functions.Function1 r18, nt5 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb7.n(java.lang.Object, kotlin.jvm.functions.Function1, nt5):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: hwm */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.String r14, java.util.List r15, java.util.Map r16, nt5 r17) throws hwm {
        /*
            r13 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.i50
            if (r1 == 0) goto L15
            r1 = r0
            i50 r1 = (defpackage.i50) r1
            int r2 = r1.w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.w = r2
            goto L1a
        L15:
            i50 r1 = new i50
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.u
            px5 r2 = px5.a
            int r3 = r1.w
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L32
            if (r3 != r5) goto L2c
            qb7 r13 = r1.t
            ybh.y(r0)     // Catch: java.lang.Exception -> L95
            return r0
        L2c:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r13)
            return r4
        L32:
            ybh.y(r0)
            r6 = r15
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            h50 r11 = h50.j
            r12 = 30
            java.lang.String r7 = ","
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r0 = kotlin.collections.CollectionsKt.P(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object r3 = r13.b
            u7d r3 = (u7d) r3
            com.usercentrics.sdk.UsercentricsDomains r6 = r3.b
            boolean r7 = r6.a()
            if (r7 == 0) goto L54
            java.lang.String r3 = r6.a
            goto L67
        L54:
            eoe r3 = r3.a
            int r3 = r3.ordinal()
            if (r3 == 0) goto L65
            if (r3 != r5) goto L61
            java.lang.String r3 = "https://aggregator.eu.usercentrics.eu"
            goto L67
        L61:
            h9o.p()
            return r4
        L65:
            java.lang.String r3 = "https://aggregator.service.usercentrics.eu"
        L67:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "/aggregate/"
            r4.append(r3)
            r4.append(r14)
            java.lang.String r14 = "?templates="
            r4.append(r14)
            r4.append(r0)
            java.lang.String r14 = r4.toString()
            java.lang.Object r0 = r13.c     // Catch: java.lang.Exception -> L95
            eqa r0 = (eqa) r0     // Catch: java.lang.Exception -> L95
            r1.t = r13     // Catch: java.lang.Exception -> L95
            r1.w = r5     // Catch: java.lang.Exception -> L95
            r3 = r16
            java.lang.Object r13 = r0.b(r14, r3, r1)     // Catch: java.lang.Exception -> L95
            if (r13 != r2) goto L94
            return r2
        L94:
            return r13
        L95:
            r0 = move-exception
            r14 = r0
            java.lang.Object r13 = r13.a
            owm r13 = (owm) r13
            java.lang.String r0 = "Failed while fetching services"
            r13.a(r0, r14)
            hwm r13 = new hwm
            java.lang.String r0 = "Unable to initialise due to poor or no network connection while fetching the processing services."
            r13.<init>(r0, r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb7.o(java.lang.String, java.util.List, java.util.Map, nt5):java.lang.Object");
    }

    @Override // defpackage.wm
    public final void onAdClicked() {
        ((h10) this.a).w.V();
    }

    public final List p() {
        return (List) ((zyk) this.a).getValue();
    }

    public final boolean q() {
        return ((IOException) this.c) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.util.LinkedHashMap r6, nt5 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof lt6
            if (r0 == 0) goto L13
            r0 = r7
            lt6 r0 = (lt6) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            lt6 r0 = new lt6
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            ybh.y(r7)
            t0i r7 = (t0i) r7
            java.lang.Object r5 = r7.a
            return r5
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r5)
            return r3
        L32:
            ybh.y(r7)
            s23 r7 = new s23
            r2 = 4
            r7.<init>(r6, r5, r3, r2)
            r0.v = r4
            java.lang.Object r5 = zch.A(r7, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb7.r(java.util.LinkedHashMap, nt5):java.lang.Object");
    }

    public final boolean s() {
        return ((qsc) this.b) != null;
    }

    public final void t(amk amkVar, String str, Callback callback) {
        if (((lh4) this.c).b != null) {
            callback.run(new ff3(new ef3(), jf3.b));
            return;
        }
        lh4 lh4Var = new lh4(new xx1((Object) this, (Object) str, (Object) amkVar, (Object) callback, (byte) 1), (byte) 0);
        this.c = lh4Var;
        af3 af3Var = (af3) this.a;
        nsh nshVar = amkVar.b;
        xlk xlkVar = amkVar.c;
        String str2 = xlkVar.d;
        boolean z = xlkVar.f;
        if (!af3Var.h) {
            lh4Var.run(new ff3(new gf3(), jf3.c));
            return;
        }
        tn tnVar = new tn();
        ei2 ei2Var = new ei2();
        ei2Var.b = true;
        tnVar.d = ei2Var;
        wyh.V(tnVar, nshVar, str2, z, (String) null);
        if (str != null) {
            tnVar.b = str;
        }
        af3Var.e(new ue3(af3Var, lh4Var, nshVar, tnVar, (byte) 1));
    }

    public final st u(Resources resources, st stVar) {
        u59 u59Var = (u59) this.b;
        nr8 nr8Var = (nr8) this.a;
        rt rtVar = stVar.j;
        HashMap map = (HashMap) this.c;
        Long l = (Long) map.remove(rtVar);
        if (l != null) {
            long jLongValue = l.longValue();
            nr8Var.getClass();
            long jE = nr8.g(new hp2(nr8Var, jLongValue), ((e) nr8Var).g).e();
            i7f i7fVar = FavoritesBridge.a;
            N.Mw8yLl_M(jE);
            u59Var.N(2132021618);
            return st.a(stVar, null);
        }
        String string = stVar.h;
        if (string == null) {
            string = stVar.a.a(resources).toString();
        }
        long jA = nr8Var.a(new mzj(string, stVar.g, stVar.l, false));
        u59Var.N(2132021602);
        map.put(rtVar, Long.valueOf(jA));
        return st.a(stVar, Long.valueOf(jA));
    }

    public final boolean v(st[] stVarArr) {
        HashMap map = (HashMap) this.c;
        boolean z = false;
        for (st stVar : stVarArr) {
            rt rtVar = stVar.j;
            Long l = stVar.i;
            if (map.containsKey(rtVar)) {
                if (l == null) {
                    map.remove(rtVar);
                } else {
                    map.put(rtVar, l);
                }
            } else if (!map.containsKey(rtVar) && l != null) {
                map.put(rtVar, l);
            }
            z = true;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(nt5 r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r11.b
            nak r1 = (nak) r1
            boolean r2 = r12 instanceof defpackage.pb7
            if (r2 == 0) goto L1b
            r2 = r12
            pb7 r2 = (defpackage.pb7) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.x = r3
            goto L20
        L1b:
            pb7 r2 = new pb7
            r2.<init>(r11, r12)
        L20:
            java.lang.Object r12 = r2.v
            px5 r3 = px5.a
            int r4 = r2.x
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L4f
            if (r4 == r8) goto L47
            if (r4 == r7) goto L43
            if (r4 == r6) goto L3f
            if (r4 != r5) goto L39
            ybh.y(r12)
            return r12
        L39:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r11)
            return r9
        L3f:
            ybh.y(r12)
            goto La3
        L43:
            ybh.y(r12)
            goto L94
        L47:
            nak r0 = r2.u
            lrl r4 = r2.t
            ybh.y(r12)
            goto L75
        L4f:
            ybh.y(r12)
            java.lang.Object r12 = r1.getValue()
            if (r12 != 0) goto Laf
            boolean r12 = r0.isEmpty()
            if (r12 != 0) goto Laf
            r12 = 0
            java.lang.Object r12 = r0.remove(r12)
            r4 = r12
            lrl r4 = (lrl) r4
            sdk r12 = r4.a
            r2.t = r4
            r2.u = r1
            r2.x = r8
            java.lang.Object r12 = r12.a(r2)
            if (r12 == r3) goto Lad
            r0 = r1
        L75:
            java.lang.String r12 = (java.lang.String) r12
            erl r8 = r4.b
            kotlin.jvm.functions.Function0 r4 = r4.c
            nb7 r10 = new nb7
            r10.<init>(r12, r8, r4)
            r0.getClass()
            r0.k(r9, r10)
            r2.t = r9
            r2.u = r9
            r2.x = r7
            r7 = 4000(0xfa0, double:1.9763E-320)
            java.lang.Object r12 = nb6.p(r7, r2)
            if (r12 == r3) goto Lad
        L94:
            r1.j(r9)
            r2.t = r9
            r2.x = r6
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r12 = nb6.p(r0, r2)
            if (r12 == r3) goto Lad
        La3:
            r2.t = r9
            r2.x = r5
            java.lang.Object r11 = r11.w(r2)
            if (r11 != r3) goto Lae
        Lad:
            return r3
        Lae:
            return r11
        Laf:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb7.w(nt5):java.lang.Object");
    }

    public final void x(nt3 nt3Var) {
        if (p().contains(nt3Var)) {
            return;
        }
        p().add(nt3Var);
        n95.q(p());
        int i2 = 0;
        if (p().size() > 30) {
            if (((Map) ((zyk) this.b).getValue()).remove((nt3) p().remove(0)) != null) {
                B();
            }
        }
        SharedPreferences.Editor editorEdit = ((SharedPreferences) ((zyk) this.c).getValue()).edit();
        List<nt3> listP = p();
        ArrayList arrayList = new ArrayList();
        for (nt3 nt3Var2 : listP) {
            orb orbVar = new orb();
            orbVar.n(nt3Var2.a, "y");
            orbVar.n(nt3Var2.b, "m");
            orbVar.n(nt3Var2.c, "d");
            arrayList.add(orbVar);
        }
        JSONArray jSONArray = new JSONArray();
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            jSONArray.put(orb.t(obj));
        }
        editorEdit.putString("active_days", jSONArray.toString());
        editorEdit.apply();
    }

    public final void y(usc uscVar) {
        enb enbVar = (enb) this.a;
        qsc qscVar = (qsc) this.b;
        if (qscVar != null) {
            qscVar.a(true);
        }
        if (uscVar != null) {
            enbVar.execute(new vl9(uscVar, (byte) 11));
        }
        Object obj = enbVar.c;
        ((ExecutorService) enbVar.b).shutdown();
    }

    public final void z() {
        if0 if0Var;
        SettingsManager settingsManager = (SettingsManager) this.a;
        op0 op0Var = settingsManager.a.contains("toolbar_bottom_actions") ? op0.d : op0.b;
        SparseArray sparseArray = new SparseArray();
        int i2 = 0;
        for (Object obj : vtp.I(settingsManager, (fw3) this.b)) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                j95.n();
                throw null;
            }
            sparseArray.append(i2, ((pc) obj).c);
            i2 = i3;
        }
        x5f x5fVar = (x5f) this.c;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            b66 b66VarF = x56VarF.F(zpaVar);
            is0 is0Var = (is0) b66VarF.n(80);
            if (is0Var == null) {
                b66VarF.q(80, 1, new is0(2443, 1, 2));
                is0Var = (is0) b66VarF.n(80);
            }
            is0Var.getClass();
            is0Var.q(0, 1, op0Var);
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                hs0 hs0Var = (hs0) sparseArray.valueAt(i4);
                gs0 gs0Var = new gs0(2443, -1, 1);
                gs0Var.q(0, hs0Var == null ? 0 : 1, hs0Var);
                Map map = (Map) is0Var.n(1);
                if (map == null || map.isEmpty()) {
                    HashMap map2 = new HashMap();
                    is0Var.q(1, 1, map2);
                    if0Var = new if0(is0Var, 1, map2);
                } else {
                    if0Var = new if0(is0Var, 1, map);
                }
                if0Var.put(String.valueOf(sparseArray.keyAt(i4) + 1), gs0Var);
            }
            x5fVar.U0(x56VarF);
        }
    }
}
