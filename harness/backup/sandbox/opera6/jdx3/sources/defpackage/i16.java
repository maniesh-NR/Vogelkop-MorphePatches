package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import com.appsflyer.internal.j;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.leanplum.internal.Clock;
import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import com.leanplum.utils.SizeUtil;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class i16 implements qyh, bd6, rr9, xl2, rcc, fx8, rxd, ox8 {
    public static i16 d;
    public static final String[] e = {"code", Constants.Params.NAME, "subscribed", "supported", "selected", "user_position"};
    public static final jxh f = new jxh(2131165906);
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public i16(byte b) {
        this.a = b;
        switch (b) {
            case SizeUtil.textSize0_1 /* 18 */:
                break;
            default:
                ee4 ee4Var = new ee4();
                ee4Var.b = c26.k(l08.a);
                this.b = ee4Var;
                this.c = new f1p((byte) 7);
                break;
        }
    }

    public /* synthetic */ i16(byte b, Object obj, Object obj2, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public i16(Context context, byte b) {
        this.a = b;
        switch (b) {
            case SizeUtil.textSize2 /* 24 */:
                this.c = null;
                this.b = context;
                break;
            default:
                this.b = context;
                this.c = new h61(context, false);
                break;
        }
    }

    public i16(Context context, String str) {
        this.a = (byte) 12;
        esg esgVar = new esg((byte) 12);
        esgVar.c = str;
        this.b = context.getApplicationContext();
        this.c = esgVar;
    }

    public i16(Context context, String str, ssf ssfVar) {
        this.a = (byte) 29;
        this.c = ssfVar;
        this.b = context.getSharedPreferences(str, 0);
    }

    public i16(Context context, umi umiVar) {
        this.a = (byte) 1;
        i32 i32Var = new i32(this, context, umiVar);
        this.b = i32Var;
        i32Var.h();
    }

    public i16(Context context, umi umiVar, g16 g16Var) {
        this.a = (byte) 0;
        xl xlVar = new xl(this, context, umiVar, g16Var);
        this.b = xlVar;
        xlVar.h();
    }

    public i16(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = (byte) 11;
        this.b = cryptoInfo;
        this.c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public i16(ii iiVar) {
        this.a = (byte) 5;
        crb crbVarO = phj.o(rpb.d, new f32((byte) 6));
        this.b = iiVar;
        this.c = crbVarO;
    }

    public /* synthetic */ i16(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ i16(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ i16(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj2;
        this.c = obj3;
    }

    public i16(p9d p9dVar) {
        this.a = (byte) 23;
        this.b = new ConcurrentHashMap();
        this.c = p9dVar;
    }

    public i16(tcc tccVar) {
        this.a = (byte) 16;
        this.b = tccVar;
        this.c = new HashMap();
    }

    public i16(xvc xvcVar) {
        this.a = (byte) 25;
        this.b = xvcVar;
        this.c = new LinkedHashMap();
    }

    public i16(zba zbaVar, nak nakVar, f65 f65Var) {
        this.a = (byte) 20;
        jea[] jeaVarArr = jea.a;
        this.b = zbaVar;
        this.c = z4o.f(new iea(false, false, true));
        j14.Y(new z99(nakVar, new yf((byte) 27, (mt5) null, this), (byte) 2), f65Var);
    }

    public static kvh i(String str) {
        fvh fvhVar = new fvh();
        fvhVar.h("https://" + str + "/.well-known/assetlinks.json");
        return new kvh(fvhVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x024f, code lost:
    
        defpackage.qp2.o(p3p.i(r2, "Category #", " is not defined."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x025a, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.qj9 o(defpackage.i16 r23, defpackage.x8e r24, int r25) {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i16.o(i16, x8e, int):qj9");
    }

    public static i16 r(Context context, umi umiVar, t1 t1Var) {
        i16 i16Var;
        synchronized (i16.class) {
            i16Var = d;
            if (i16Var == null) {
                i16Var = new i16(context.getApplicationContext(), umiVar, new g16(t1Var));
                d = i16Var;
            }
        }
        return i16Var;
    }

    public static void u(ImageView imageView, String str, Function0 function0) {
        imageView.setImageBitmap(null);
        if (StringsKt.N(str)) {
            imageView.setImageResource(2131231949);
            return;
        }
        int iK = f.k(imageView.getContext());
        dwh dwhVarI = yne.b.i(str);
        dwhVarI.g = 2131231949;
        dwhVarI.b.b(iK, iK);
        dwhVarI.b();
        dwhVarI.j();
        dwhVarI.f(new phi(new hu5((Object) function0, (Object) imageView, (byte) 21)));
    }

    public static /* synthetic */ void w(i16 i16Var, vmc vmcVar, xmc xmcVar, xmc xmcVar2, int i) {
        if ((i & 2) != 0) {
            xmcVar = null;
        }
        if ((i & 4) != 0) {
            xmcVar2 = null;
        }
        i16Var.v(vmcVar, xmcVar, xmcVar2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A(int r14, int r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.b
            pza r0 = (defpackage.pza) r0
            java.lang.Object r13 = r13.c
            ni6 r13 = (defpackage.ni6) r13
            b59 r13 = r13.a
            java.lang.Object r1 = r13.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r2 = "start_of_day"
            r3 = -1
            long r1 = r1.getLong(r2, r3)
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r8 = 0
            if (r7 < 0) goto L3b
            long r9 = r0.p()
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            long r11 = r9 % r11
            long r9 = r9 - r11
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L3b
            java.lang.Object r1 = r13.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r2 = "shown_today"
            int r1 = r1.getInt(r2, r8)
            if (r1 >= r14) goto L5f
        L3b:
            java.lang.Object r13 = r13.get()
            android.content.SharedPreferences r13 = (android.content.SharedPreferences) r13
            java.lang.String r14 = "last_shown"
            long r13 = r13.getLong(r14, r3)
            int r1 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r1 < 0) goto L60
            long r0 = r0.p()
            long r0 = r0 - r13
            int r13 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r13 < 0) goto L60
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MINUTES
            long r14 = (long) r15
            long r13 = r13.toMillis(r14)
            int r13 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r13 >= 0) goto L60
        L5f:
            return r8
        L60:
            r13 = 1
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i16.A(int, int):boolean");
    }

    public final void B(boolean z) {
        jea[] jeaVarArr = jea.a;
        zba zbaVar = (zba) this.b;
        int i = zbaVar.c;
        boolean z2 = false;
        boolean z3 = i >= 0;
        boolean z4 = i < zbaVar.a.size() - 1;
        if (!z && (z3 || z4)) {
            z2 = true;
        }
        nak nakVar = (nak) this.c;
        iea ieaVar = new iea(z3, z4, z2);
        nakVar.getClass();
        nakVar.k((Object) null, ieaVar);
    }

    @Override // defpackage.fx8
    public final void a(Float f2) {
        cv8 cv8Var = (cv8) this.c;
        int i = cv8Var.A;
        NestedScrollView nestedScrollView = cv8Var.c;
        if (((Boolean) ((q4k) this.b).invoke()).booleanValue()) {
            int scrollY = nestedScrollView.getScrollY();
            if (f2 != null && scrollY < i) {
                if (f2.floatValue() < 0.0f) {
                    nestedScrollView.B(0 - nestedScrollView.getScrollX(), 0 - nestedScrollView.getScrollY(), MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT, false);
                    return;
                } else {
                    nestedScrollView.B(0 - nestedScrollView.getScrollX(), i - nestedScrollView.getScrollY(), MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT, false);
                    return;
                }
            }
            if (scrollY < i / 2) {
                nestedScrollView.B(0 - nestedScrollView.getScrollX(), 0 - nestedScrollView.getScrollY(), MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT, false);
            } else if (scrollY < i) {
                nestedScrollView.B(0 - nestedScrollView.getScrollX(), i - nestedScrollView.getScrollY(), MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT, false);
            }
        }
    }

    public final void b(vdg vdgVar) {
        ((ConcurrentHashMap) this.b).put(((p9d) this.c).t(vdgVar), vdgVar);
    }

    @Override // defpackage.xl2
    public final void c(Drawable drawable) {
        if (drawable != null) {
            etc etcVar = (etc) this.b;
            etcVar.setDrawable(0, drawable);
            etcVar.invalidateSelf();
            etcVar.a.K();
        }
    }

    public final ed6 createDataSource() {
        return new hn6((Context) this.b, ((esg) this.c).createDataSource());
    }

    @Override // defpackage.xl2
    public final void d() {
        etc etcVar = (etc) this.b;
        Context context = (Context) ((igi) this.c).f;
        Drawable drawableF = sgb.F(2131232197, context);
        if (drawableF != null) {
            j14.n0(drawableF, f03.t(2130969288, context, 2131101243));
        } else {
            drawableF = null;
        }
        if (etcVar.b) {
            return;
        }
        etcVar.setDrawable(0, drawableF);
        etcVar.invalidateSelf();
    }

    public final void e(String str, String str2) {
        xl xlVar = (xl) this.b;
        Set set = (Set) this.c;
        if (set == null) {
            xlVar.i();
            e(str, str2);
            return;
        }
        if (set.add(str + "_" + str2)) {
            xlVar.g(new HashSet((Set) this.c));
        }
    }

    @Override // defpackage.ox8
    public final void f(List list) {
        uqe uqeVar = (uqe) this.b;
        msh mshVar = (msh) this.c;
        uqeVar.k(mshVar, list, false);
        uqeVar.h.k(mshVar, list, true);
    }

    public final void g(lcc lccVar) {
        mdc mdcVar = (mdc) ((HashMap) this.c).remove(lccVar);
        if (mdcVar != null) {
            ((tcc) this.b).b(mdcVar);
        }
    }

    public final pcc getState() {
        int iOrdinal = ((tcc) this.b).i.ordinal();
        if (iOrdinal == 0) {
            return pcc.a;
        }
        if (iOrdinal == 1) {
            return pcc.b;
        }
        if (iOrdinal == 2) {
            return pcc.c;
        }
        if (iOrdinal == 3) {
            return pcc.d;
        }
        if (iOrdinal == 4) {
            return pcc.e;
        }
        h9o.p();
        return null;
    }

    public final void h(lcc lccVar) {
        HashMap map = (HashMap) this.c;
        if (map.containsKey(lccVar)) {
            qp2.n("Already subscribed");
            return;
        }
        w71 w71Var = new w71(lccVar, new gb3(this, lccVar, (byte) 29));
        map.put(lccVar, w71Var);
        ((tcc) this.b).a(w71Var);
    }

    public final int j(trf trfVar) {
        return 2;
    }

    public final void k() {
        switch (this.a) {
            case 0:
                xl xlVar = (xl) this.b;
                Set set = (Set) this.c;
                if (set == null) {
                    xlVar.i();
                    k();
                    break;
                } else if (!set.isEmpty()) {
                    ((Set) this.c).clear();
                    xlVar.g(new HashSet());
                    break;
                }
                break;
            default:
                this.b = null;
                this.c = null;
                break;
        }
    }

    public final boolean l(Object obj, File file, trf trfVar) {
        return ((fg3) this.c).l(new ah3((zg3) this.b, ((BitmapDrawable) ((kyh) obj).get()).getBitmap()), file, trfVar);
    }

    public final boolean m(String str, String str2) {
        Set set = (Set) this.c;
        if (set == null) {
            ((xl) this.b).i();
            return m(str, str2);
        }
        return set.contains(str + "_" + str2);
    }

    public final q83[] n(Handler handler, mi8 mi8Var, mi8 mi8Var2, mi8 mi8Var3, mi8 mi8Var4) {
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.b;
        ahd ahdVar = new ahd(context);
        h61 h61Var = (h61) this.c;
        ahdVar.c = h61Var;
        ahdVar.d = (short) 5000;
        ahdVar.e = handler;
        ahdVar.f = mi8Var;
        ahdVar.g = (byte) 50;
        z4o.H(!ahdVar.b);
        Handler handler2 = ahdVar.e;
        mi8 mi8Var5 = ahdVar.f;
        z4o.H(handler2 != null ? mi8Var5 != null : mi8Var5 == null);
        ahdVar.b = true;
        arrayList.add(new chd(ahdVar));
        i9c i9cVar = new i9c(context);
        z4o.H(!i9cVar.b);
        i9cVar.b = true;
        if (((l45) i9cVar.e) == null) {
            eh2[] eh2VarArr = new eh2[0];
            eh2 vjjVar = new vjj();
            ((vjj) vjjVar).m = 0;
            ((vjj) vjjVar).o = 0;
            ((vjj) vjjVar).p = 0;
            byte[] bArr = tym.b;
            ((vjj) vjjVar).n = bArr;
            ((vjj) vjjVar).q = bArr;
            eh2 tvjVar = new tvj();
            ((tvj) tvjVar).b = 1.0f;
            ((tvj) tvjVar).c = 1.0f;
            bh2 bh2Var = bh2.e;
            ((tvj) tvjVar).d = bh2Var;
            ((tvj) tvjVar).e = bh2Var;
            ((tvj) tvjVar).f = bh2Var;
            ((tvj) tvjVar).g = bh2Var;
            ByteBuffer byteBuffer = eh2.a;
            ((tvj) tvjVar).j = byteBuffer;
            ((tvj) tvjVar).k = byteBuffer;
            l45 l45Var = new l45();
            eh2[] eh2VarArr2 = new eh2[eh2VarArr.length + 2];
            l45Var.a = eh2VarArr2;
            System.arraycopy(eh2VarArr, 0, eh2VarArr2, 0, eh2VarArr.length);
            l45Var.b = vjjVar;
            l45Var.c = tvjVar;
            eh2VarArr2[eh2VarArr.length] = vjjVar;
            eh2VarArr2[eh2VarArr.length + 1] = tvjVar;
            i9cVar.e = l45Var;
        }
        uh2 uh2Var = (uh2) i9cVar.f;
        yqa yqaVar = (yqa) i9cVar.g;
        if (uh2Var == null) {
            if (yqaVar == null) {
                i9cVar.g = new yqa(context, (byte) 11);
            }
            if (((n9a) i9cVar.a) == null) {
                i9cVar.a = n9a.f;
            }
            i3j i3jVar = new i3j(context, (byte) 5);
            uf2 uf2Var = context != null ? null : (uf2) i9cVar.d;
            Context context2 = (Context) i3jVar.a;
            if (context2 == null) {
                i3jVar.d = uf2Var;
            }
            yqa yqaVar2 = (yqa) i9cVar.g;
            i3jVar.b = yqaVar2;
            i3jVar.c = (n9a) i9cVar.a;
            if (yqaVar2 == null) {
                i3jVar.b = new yqa(context2, (byte) 11);
            }
            i9cVar.f = new uh2(i3jVar);
        } else {
            z4o.H(yqaVar == null);
            z4o.H(((n9a) i9cVar.a) == null);
        }
        arrayList.add(new kgd((Context) this.b, h61Var, handler, mi8Var2, new ll6(i9cVar)));
        arrayList.add(new zjl(mi8Var3, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new byd(mi8Var4, looper));
        arrayList.add(new byd(mi8Var4, looper));
        arrayList.add(new ie4());
        arrayList.add(new xya(new c61(context, (byte) 1)));
        return (q83[]) arrayList.toArray(new q83[0]);
    }

    @Override // defpackage.rr9
    public final void onFailure(Throwable th) {
        byte b = ((ntk) this.b).f;
        if (b == 2 && (th instanceof CancellationException)) {
            return;
        }
        n1h.f(b);
    }

    @Override // defpackage.rr9
    public final void onSuccess(Object obj) {
        vtk vtkVar = (vtk) obj;
        vtkVar.getClass();
        ((wtk) ((wjh) this.c).b).b(vtkVar);
    }

    public final CctBackendFactory p(String str) {
        PackageManager packageManager;
        ServiceInfo serviceInfo;
        Map map = (Map) this.c;
        if (map == null) {
            Context context = (Context) this.b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            Bundle bundle = (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL)) == null) ? null : serviceInfo.metaData;
            if (bundle == null) {
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map2 = new HashMap();
                for (String str2 : bundle.keySet()) {
                    Object obj = bundle.get(str2);
                    if ((obj instanceof String) && str2.startsWith("backend:")) {
                        for (String str3 : ((String) obj).split(",", -1)) {
                            String strTrim = str3.trim();
                            if (!strTrim.isEmpty()) {
                                map2.put(strTrim, str2.substring(8));
                            }
                        }
                    }
                }
                map = map2;
            }
            this.c = map;
        }
        String str4 = (String) map.get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused2) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append(str4);
            sb.append(" is not found.");
            return null;
        } catch (IllegalAccessException unused3) {
            StringBuilder sb2 = new StringBuilder("Could not instantiate ");
            sb2.append(str4);
            sb2.append(".");
            return null;
        } catch (InstantiationException unused4) {
            StringBuilder sb3 = new StringBuilder("Could not instantiate ");
            sb3.append(str4);
            sb3.append(".");
            return null;
        } catch (NoSuchMethodException unused5) {
            "Could not instantiate ".concat(str4);
            return null;
        } catch (InvocationTargetException unused6) {
            "Could not instantiate ".concat(str4);
            return null;
        }
    }

    public final Collection q() {
        if (((Set) this.c) == null) {
            ((xl) this.b).i();
            return q();
        }
        ArrayList arrayList = new ArrayList(((Set) this.c).size());
        for (String str : (Set) this.c) {
            int iIndexOf = str.indexOf(95);
            arrayList.add(iIndexOf == -1 ? new h16(str, "") : new h16(str.substring(0, iIndexOf), str.substring(iIndexOf + 1)));
        }
        return arrayList;
    }

    public final rsf s(String str) {
        byte[] bArrDecode;
        SharedPreferences sharedPreferences = (SharedPreferences) this.b;
        String string = sharedPreferences.getString(str, null);
        if (string != null) {
            try {
                bArrDecode = Base64.decode(string, 0);
            } catch (IllegalArgumentException unused) {
            }
        } else {
            bArrDecode = null;
        }
        if (bArrDecode == null) {
            return null;
        }
        try {
            return ((ssf) this.c).v(new ByteArrayInputStream(bArrDecode));
        } catch (Throwable unused2) {
            j.a(sharedPreferences, str);
            return null;
        }
    }

    public final ArrayList t(boolean z, boolean z2) {
        yqe yqeVar;
        if (((List) this.c) == null) {
            ((i32) this.b).i();
        }
        ArrayList arrayList = new ArrayList(((List) this.c).size());
        Iterator it = ((List) this.c).iterator();
        boolean z3 = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            yqeVar = yqe.d;
            if (!zHasNext) {
                break;
            }
            op4 op4Var = (op4) it.next();
            if (!z3 && op4Var.a.equals(yqeVar)) {
                z3 = true;
            }
            if (!z || op4Var.b) {
                if (!z2 || op4Var.c) {
                    arrayList.add(op4Var.a);
                }
            }
        }
        if (!((List) this.c).isEmpty() && !z3) {
            arrayList.add(0, yqeVar);
        }
        if (z2 && arrayList.isEmpty() && !((List) this.c).isEmpty()) {
            arrayList.add(0, yqeVar);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[PHI: r11
      0x0066: PHI (r11v14 boolean) = (r11v12 boolean), (r11v17 boolean) binds: [B:23:0x0064, B:15:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[PHI: r11
      0x0068: PHI (r11v15 boolean) = (r11v12 boolean), (r11v17 boolean) binds: [B:23:0x0064, B:15:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(final defpackage.vmc r9, defpackage.xmc r10, defpackage.xmc r11, defpackage.mmc r12) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            mlc r0 = (defpackage.mlc) r0
            android.view.View r1 = r0.i
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.Object r2 = r0.j
            com.opera.android.custom_views.StylingTextView r2 = (com.opera.android.custom_views.StylingTextView) r2
            ymc r3 = r9.a
            java.lang.String r3 = r3.b
            opc r4 = new opc
            r5 = 0
            r4.<init>()
            u(r1, r3, r4)
            android.view.View r1 = r0.g
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            ymc r3 = r9.b
            java.lang.String r4 = r3.b
            opc r6 = new opc
            r7 = 1
            r6.<init>()
            u(r1, r4, r6)
            com.opera.android.custom_views.StylingTextView r8 = r0.e
            ymc r9 = r9.a
            java.lang.String r9 = r9.a
            r8.setText(r9)
            com.opera.android.custom_views.StylingTextView r8 = r0.c
            java.lang.String r9 = r3.a
            r8.setText(r9)
            if (r12 == 0) goto L6a
            if (r10 == 0) goto L6a
            int r8 = r12.ordinal()
            if (r8 == 0) goto L5b
            if (r8 == r7) goto L5b
            r9 = 2
            if (r8 != r9) goto L57
            if (r11 == 0) goto L6a
            int r8 = r11.a
            int r9 = r11.b
            if (r8 <= r9) goto L53
            r11 = r7
            goto L54
        L53:
            r11 = r5
        L54:
            if (r9 <= r8) goto L68
            goto L66
        L57:
            h9o.p()
            return
        L5b:
            int r8 = r10.a
            int r9 = r10.b
            if (r8 <= r9) goto L63
            r11 = r7
            goto L64
        L63:
            r11 = r5
        L64:
            if (r9 <= r8) goto L68
        L66:
            r8 = r7
            goto L6c
        L68:
            r8 = r5
            goto L6c
        L6a:
            r8 = r5
            r11 = r8
        L6c:
            java.lang.Object r9 = r0.h
            com.opera.android.custom_views.StylingImageView r9 = (com.opera.android.custom_views.StylingImageView) r9
            r12 = 8
            if (r11 == 0) goto L76
            r11 = r5
            goto L77
        L76:
            r11 = r12
        L77:
            r9.setVisibility(r11)
            android.view.View r9 = r0.f
            com.opera.android.custom_views.StylingImageView r9 = (com.opera.android.custom_views.StylingImageView) r9
            if (r8 == 0) goto L82
            r8 = r5
            goto L83
        L82:
            r8 = r12
        L83:
            r9.setVisibility(r8)
            if (r10 != 0) goto L89
            r7 = r5
        L89:
            com.opera.android.custom_views.StylingTextView r8 = r0.d
            if (r7 == 0) goto L8f
            r9 = r5
            goto L90
        L8f:
            r9 = r12
        L90:
            r2.setVisibility(r9)
            r9 = 0
            if (r10 == 0) goto L9d
            int r11 = r10.a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L9e
        L9d:
            r11 = r9
        L9e:
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r2.setText(r11)
            if (r7 != 0) goto La8
            r5 = r12
        La8:
            r8.setVisibility(r5)
            if (r10 == 0) goto Lb3
            int r9 = r10.b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
        Lb3:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.setText(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i16.v(vmc, xmc, xmc, mmc):void");
    }

    public final void x(boolean z, boolean z2) {
        y00 y00Var = (y00) this.c;
        x10 x10VarK0 = y00Var.e0();
        if (x10VarK0 != null) {
            if (!z) {
                cs5.q0(y00Var.f0().u, z2 ? 2 : 1);
            }
            if (y00Var.H != z) {
                y00Var.H = z;
                if (z) {
                    cs5.q0(y00Var.f0().u, 5);
                    x10VarK0.o();
                    y00Var.t0(y00Var.f0().u);
                }
            }
        }
    }

    public final void y() {
        b59 b59Var = ((ni6) this.c).a;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) b59Var.get()).edit();
        pza pzaVar = (pza) this.b;
        editorEdit.putLong("last_shown", pzaVar.p());
        long j = ((SharedPreferences) b59Var.get()).getLong("start_of_day", -1L);
        long jP = pzaVar.p();
        if (j != jP - (jP % Clock.DAY_MILLIS)) {
            long jP2 = pzaVar.p();
            editorEdit.putLong("start_of_day", jP2 - (jP2 % Clock.DAY_MILLIS));
            editorEdit.putInt("shown_today", 1);
        } else {
            editorEdit.putInt("shown_today", ((SharedPreferences) b59Var.get()).getInt("shown_today", 0) + 1);
        }
        editorEdit.apply();
    }

    public final void z(String str, rsf rsfVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ((ssf) this.c).H(byteArrayOutputStream, rsfVar);
            ((SharedPreferences) this.b).edit().putString(str, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0)).apply();
        } catch (IOException unused) {
        }
    }
}
