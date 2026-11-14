package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.browser.TabInfo;
import com.opera.android.oauth2.OAuth2Account;
import com.opera.android.settings.UserSettingsContentProvider;
import com.opera.api.Callback;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.connection.RealCall;
import org.chromium.base.task.PostTask;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class s14 implements ih4, f94, ebf, u13, y9j, r6l, bln {
    public static final hp2 g = new hp2((byte) 9, false);
    public static s14 h;
    public final /* synthetic */ byte a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public s14(byte b) {
        this.a = b;
        switch (b) {
            case 4:
                this.c = new t72(0);
                this.d = new Random();
                this.e = new jw4(this, (byte) 2);
                this.f = new jw4(this, (byte) 3);
                break;
            case 17:
                this.b = false;
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.f = new Handler();
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                this.c = new j06((byte) 16);
                this.d = new i72();
                this.e = v08.a;
                break;
        }
    }

    public s14(int i, int i2) {
        this.a = (byte) 7;
        this.c = new q0g(i);
        this.d = new q0g(i2);
        this.f = new o5c(i);
    }

    public s14(Context context, wf2 wf2Var) {
        this.a = (byte) 13;
        this.f = new Object();
        this.c = context.getApplicationContext();
        UriMatcher uriMatcher = UserSettingsContentProvider.f;
        this.d = w1h.l(context, vml.d, "user_settings", new bg1[0]);
        this.e = wf2Var;
    }

    public s14(ViewGroup viewGroup) {
        this.a = (byte) 9;
        this.e = viewGroup;
    }

    public s14(bp bpVar, rhf rhfVar, z13 z13Var, oo8 oo8Var) {
        this.a = (byte) 11;
        this.c = bpVar;
        this.d = rhfVar;
        this.e = z13Var;
        this.f = oo8Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s14(c30 c30Var, List list, List list2) {
        this(c30Var, null, false, list, list2, (byte) 16);
        this.a = (byte) 16;
    }

    public s14(cn8 cn8Var, oj9 oj9Var, pql pqlVar, r16 r16Var, boolean z) {
        this.a = (byte) 0;
        this.c = cn8Var;
        this.d = oj9Var;
        this.e = pqlVar;
        this.f = r16Var;
        this.b = z;
    }

    public s14(BrowserActivity browserActivity, bvl bvlVar, r22 r22Var, pde pdeVar, boolean z) {
        this.a = (byte) 12;
        this.c = bvlVar;
        this.d = r22Var;
        this.e = pdeVar;
        this.b = z;
        final byte b = 0;
        this.f = new pde(new mnf(0, 0, 0, 0));
        Function1 function1 = new Function1(this) { // from class: nnf
            public final /* synthetic */ s14 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b2 = b;
                s14 s14Var = this.b;
                switch (b2) {
                    case 0:
                        s14Var.M();
                        break;
                    case 1:
                        s14Var.M();
                        break;
                    default:
                        s14Var.M();
                        break;
                }
                return Unit.a;
            }
        };
        final byte b2 = 2;
        pdeVar.j(browserActivity, new t7d(function1, (byte) 2));
        final byte b3 = 1;
        bvlVar.getState().j(browserActivity, new t7d(new Function1(this) { // from class: nnf
            public final /* synthetic */ s14 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b22 = b3;
                s14 s14Var = this.b;
                switch (b22) {
                    case 0:
                        s14Var.M();
                        break;
                    case 1:
                        s14Var.M();
                        break;
                    default:
                        s14Var.M();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 2));
        ((pde) r22Var.b).j(browserActivity, new t7d(new Function1(this) { // from class: nnf
            public final /* synthetic */ s14 b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b22 = b2;
                s14 s14Var = this.b;
                switch (b22) {
                    case 0:
                        s14Var.M();
                        break;
                    case 1:
                        s14Var.M();
                        break;
                    default:
                        s14Var.M();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 2));
    }

    public s14(gbf gbfVar, gjm gjmVar, cdn cdnVar, boolean z, hv3 hv3Var) {
        this.a = (byte) 10;
        this.f = gbfVar;
        this.c = gjmVar;
        this.d = cdnVar;
        this.b = z;
        this.e = hv3Var;
    }

    public s14(hi2 hi2Var, String str, mgh mghVar, Callback callback) {
        this.a = (byte) 2;
        this.f = hi2Var;
        this.d = mghVar;
        this.c = callback;
        s(null);
    }

    public s14(File file, umi umiVar, onn onnVar) {
        this.a = (byte) 22;
        this.f = new kze(new ArrayList());
        this.c = file;
        this.d = umiVar;
        this.e = onnVar;
    }

    public /* synthetic */ s14(Object obj, Object obj2, boolean z, List list, List list2, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = list;
        this.f = list2;
    }

    public s14(kze kzeVar, tjg tjgVar, pde pdeVar) {
        this.a = (byte) 14;
        this.c = kzeVar;
        this.d = tjgVar;
        this.e = pdeVar;
        this.f = new sjg(6, null);
        a26.T(pdeVar, kzeVar, new d8d(this, (byte) 23));
        kzeVar.k(new iwa(new o5f((Object) this, (byte) 28), (byte) 17));
    }

    public s14(m3c m3cVar) {
        this.a = (byte) 15;
        this.c = m3cVar;
        this.d = new lea((j8b) m3cVar.F.b);
        this.e = new lld((byte) 13);
        this.f = new oea();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s14(ode odeVar, ikc ikcVar, ode odeVar2, ode odeVar3, ode odeVar4, bml bmlVar, y0a y0aVar) {
        this.a = (byte) 8;
        this.c = new wnm(null, Arrays.asList(odeVar, ikcVar, odeVar2, odeVar3, odeVar4), new n12(odeVar, ikcVar, odeVar2, odeVar3, odeVar4, (byte) 2), new kkc((er9) new df5(this), (ekc) odeVar, ikcVar, (ekc) odeVar2, (ekc) odeVar3, (ekc) odeVar4));
        this.d = bmlVar;
        this.e = new ks6(this, (byte) 27);
        this.f = y0aVar;
    }

    public s14(RealCall realCall, nc9 nc9Var, xe9 xe9Var, pe9 pe9Var) {
        this.a = (byte) 6;
        this.f = realCall;
        this.c = nc9Var;
        this.d = xe9Var;
        this.e = pe9Var;
        realCall.enqueue(this);
    }

    public s14(qln qlnVar, ContentResolver contentResolver, String str, String str2, boolean z) {
        this.a = (byte) 23;
        this.e = new ArrayList();
        this.c = qlnVar;
        boolean z2 = false;
        if (str != null) {
            this.d = new mcj(this, str, z2);
            return;
        }
        if (str2 == null) {
            this.d = new mcj(this, "", z2);
            return;
        }
        Uri uri = Uri.parse(str2);
        h5k h5kVar = new h5k();
        h5kVar.b = uri;
        h5kVar.c = contentResolver;
        h5kVar.d = qlnVar;
        h5kVar.a = z;
        this.d = h5kVar;
    }

    public s14(tpg tpgVar, oqg oqgVar, p8f p8fVar, boolean z, List list) {
        this.a = (byte) 20;
        this.c = tpgVar;
        this.d = oqgVar;
        this.e = p8fVar;
        this.b = z;
        this.f = list;
    }

    public s14(ylh ylhVar) {
        this.a = (byte) 1;
        this.c = new WeakReference(ylhVar);
        this.d = new xa1(this, ylhVar);
        this.e = new ya1(this);
    }

    public s14(ywh ywhVar, g77 g77Var) {
        this.a = (byte) 5;
        this.c = ywhVar;
        URL url = (URL) g77Var.a;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(url.getProtocol()).encodedAuthority(url.getAuthority()).appendEncodedPath("v1/localnews").appendEncodedPath("city/search");
        this.d = builder;
        String str = (String) g77Var.b;
        this.e = str;
        this.f = (String) g77Var.c;
        this.b = "us".equals(str);
    }

    public s14(boolean z, t17 t17Var) {
        this.a = (byte) 19;
        this.b = z;
        this.c = t17Var;
        this.d = ui6.a(0.0f);
        this.e = new ArrayList();
    }

    public static s14 y() {
        if (h == null) {
            s14 s14Var = new s14((byte) 4);
            h = s14Var;
            PostTask.c(7, new jw4(s14Var, (byte) 1));
            x8.b = new sv2();
        }
        return h;
    }

    public final boolean A(int i) {
        return z(i) != null;
    }

    public final File B(String str) {
        return new File((File) this.c, sko.u(str, ".json"));
    }

    public final void C() {
        synchronized (this.f) {
            if (this.b) {
                return;
            }
            this.b = true;
            ((wf2) this.e).getInt("fake_key", 0);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: e22 */
    public final void D(org.chromium.base.Callback callback, Object obj) throws e22 {
        if (callback == null) {
            throw new e22((Throwable) obj);
        }
        ((Handler) this.f).post(callback.a(obj));
    }

    public final void E(String str) {
        vml.c(new oc9(this, str, (byte) 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int F(k5o k5oVar, v31 v31Var, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        lea leaVar = (lea) this.d;
        oea oeaVar = (oea) this.f;
        if (this.b) {
            return 0;
        }
        try {
            this.b = true;
            rn9 rn9VarM0 = ((lld) this.e).m0(k5oVar, v31Var);
            j1d j1dVar = (j1d) rn9VarM0.c;
            int iJ = j1dVar.j();
            for (int i3 = 0; i3 < iJ; i3++) {
                lmg lmgVar = (lmg) j1dVar.k(i3);
                if (lmgVar.d || lmgVar.h) {
                    objArr = false;
                    break;
                }
            }
            objArr = true;
            int iJ2 = j1dVar.j();
            for (int i4 = 0; i4 < iJ2; i4++) {
                lmg lmgVar2 = (lmg) j1dVar.k(i4);
                if (objArr != false || wxe.k(lmgVar2)) {
                    ((m3c) this.c).A(lmgVar2.c, oeaVar, lmgVar2.i, true);
                    if (!oeaVar.a.i()) {
                        leaVar.a(oeaVar, wxe.k(lmgVar2), lmgVar2.a);
                        oeaVar.clear();
                    }
                }
            }
            boolean zB = leaVar.b(rn9VarM0, z);
            if (rn9VarM0.b) {
                i = 0;
            } else {
                int iJ3 = j1dVar.j();
                for (int i5 = 0; i5 < iJ3; i5++) {
                    lmg lmgVar3 = (lmg) j1dVar.k(i5);
                    if (!y8f.b(wxe.T(lmgVar3, true), 0L) && lmgVar3.c()) {
                        i = 1;
                        break;
                    }
                }
                i = 0;
            }
            int iJ4 = j1dVar.j();
            int i6 = 0;
            while (true) {
                if (i6 >= iJ4) {
                    i2 = 0;
                    break;
                }
                if (((lmg) j1dVar.k(i6)).c()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            return (zB ? 1 : 0) | (i << 1) | (i2 << 2);
        } finally {
            this.b = false;
        }
    }

    public final void G(Runnable runnable) {
        umi umiVar = (umi) this.d;
        nml nmlVarE = umiVar.e(new r2n((Object) this, (byte) 13));
        nmlVarE.b(umiVar.f(new roj(this, runnable, (byte) 16)));
        nmlVarE.a(null);
    }

    public final kln H(ContentResolver contentResolver, Uri uri, int i, boolean z) throws IOException {
        String strJ;
        String strJ2;
        sa2 sa2Var;
        File file;
        boolean zB;
        String path;
        String strU;
        sa2 sa2VarD;
        un7 un7Var;
        String string = Long.toString(System.currentTimeMillis());
        if (z) {
            String strA = f8a.e.a(uri.toString());
            strJ = sko.j("FILE_storefront_wallpaper_", strA);
            strJ2 = sko.j("storefront_image_", strA);
        } else {
            strJ = "FILE_user_wallpaper_" + string + "_" + i;
            strJ2 = "user_image_" + string + "_" + i;
        }
        String str = strJ;
        String str2 = string + "_" + i;
        final File file2 = new File((File) this.c, strJ2);
        final byte b = 1;
        final byte b2 = 0;
        if (wqm.D(uri)) {
            t9f t9fVar = (t9f) xne.b.get();
            fvh fvhVar = new fvh();
            fvhVar.h(uri.toString());
            kvh kvhVar = new kvh(fvhVar);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            RealCall realCallC = t9fVar.c(kvhVar);
            Function1 function1 = new Function1() { // from class: iln
                public final Object invoke(Object obj) {
                    byte b3 = b2;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    File file3 = file2;
                    switch (b3) {
                        case 0:
                            pzh pzhVar = (pzh) obj;
                            vzh vzhVar = pzhVar.g;
                            try {
                                if (pzhVar.q) {
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                        try {
                                            s29.a(vzhVar.byteStream(), fileOutputStream);
                                            atomicBoolean2.set(true);
                                            fileOutputStream.close();
                                        } catch (Throwable th) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    } catch (IOException unused) {
                                        file3.delete();
                                        atomicBoolean2.set(false);
                                    }
                                } else {
                                    file3.delete();
                                    atomicBoolean2.set(false);
                                }
                                if (vzhVar != null) {
                                    vzhVar.close();
                                }
                                return Unit.a;
                            } catch (Throwable th3) {
                                if (vzhVar != null) {
                                    try {
                                        vzhVar.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                }
                                throw th3;
                            }
                        default:
                            file3.delete();
                            atomicBoolean2.set(false);
                            return Unit.a;
                    }
                }
            };
            Function1 function12 = new Function1() { // from class: iln
                public final Object invoke(Object obj) {
                    byte b3 = b;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    File file3 = file2;
                    switch (b3) {
                        case 0:
                            pzh pzhVar = (pzh) obj;
                            vzh vzhVar = pzhVar.g;
                            try {
                                if (pzhVar.q) {
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                        try {
                                            s29.a(vzhVar.byteStream(), fileOutputStream);
                                            atomicBoolean2.set(true);
                                            fileOutputStream.close();
                                        } catch (Throwable th) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    } catch (IOException unused) {
                                        file3.delete();
                                        atomicBoolean2.set(false);
                                    }
                                } else {
                                    file3.delete();
                                    atomicBoolean2.set(false);
                                }
                                if (vzhVar != null) {
                                    vzhVar.close();
                                }
                                return Unit.a;
                            } catch (Throwable th3) {
                                if (vzhVar != null) {
                                    try {
                                        vzhVar.close();
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                }
                                throw th3;
                            }
                        default:
                            file3.delete();
                            atomicBoolean2.set(false);
                            return Unit.a;
                    }
                }
            };
            switch (vn7.a[TimeUnit.SECONDS.ordinal()]) {
                case 1:
                    un7Var = un7.b;
                    break;
                case 2:
                    un7Var = un7.c;
                    break;
                case 3:
                    un7Var = un7.d;
                    break;
                case 4:
                    un7Var = un7.e;
                    break;
                case 5:
                    un7Var = un7.f;
                    break;
                case 6:
                    un7Var = un7.g;
                    break;
                case 7:
                    un7Var = un7.h;
                    break;
                default:
                    h9o.p();
                    return null;
            }
            sa2Var = null;
            vtp.Q(realCallC, function1, function12, 4, cs5.y0(30L, un7Var), cs5.y0(1L, un7Var), cs5.y0(10L, un7Var));
            zB = atomicBoolean.get();
        } else {
            sa2Var = null;
            if (!Intrinsics.a(uri.getScheme(), "opera-aria") || !Intrinsics.a(uri.getHost(), "images") || (path = uri.getPath()) == null || path == (strU = StringsKt.U(path, ".webp"))) {
                file = null;
            } else {
                file = new File(new File(snf.c), sko.u(StringsKt.T(strU, "/"), ".webp"));
            }
            if (file != null) {
                zB = s29.b(file, file2);
            } else {
                try {
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            s29.a(inputStreamOpenInputStream, fileOutputStream);
                            fileOutputStream.close();
                            inputStreamOpenInputStream.close();
                            zB = true;
                        } finally {
                        }
                    } finally {
                    }
                } catch (IOException unused) {
                    file2.delete();
                    zB = false;
                }
            }
        }
        if (!zB) {
            return sa2Var;
        }
        sa2 string2 = z ? uri.toString() : sa2Var;
        Bitmap.Config config = jkn.b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = config;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file2.getPath(), options);
        options.inJustDecodeBounds = false;
        int i2 = options.outHeight;
        if (i2 > 61 || options.outWidth > 61) {
            options.inSampleSize = Math.min(Math.round(i2 / 61.0f), Math.round(options.outWidth / 61.0f));
        }
        sa2 sa2VarDecodeFile = BitmapFactory.decodeFile(file2.getPath(), options);
        if (sa2VarDecodeFile == null) {
            sa2VarD = sa2Var;
        } else {
            sa2VarD = jkn.d(sa2VarDecodeFile, config);
            if (sa2VarD != sa2VarDecodeFile) {
                sa2VarDecodeFile.recycle();
            }
        }
        sa2 sa2Var2 = sa2VarD != null ? new sa2((byte) 21, jkn.b(sa2VarD).a, false) : sa2Var;
        sa2 klnVar = sa2Var2 == null ? sa2Var : new kln(sa2Var2.b, str, file2.getName(), str2, string2);
        if (klnVar != null) {
            File fileB = B(str);
            try {
                s29.j(fileB, klnVar.toString().getBytes(StandardCharsets.UTF_8));
                return klnVar;
            } catch (IOException unused2) {
                fileB.delete();
            }
        }
        return sa2Var;
    }

    public final synchronized void I() {
        if (this.b) {
            return;
        }
        this.b = true;
        Context context = (Context) this.f;
        if (context != null) {
            ((xa1) this.d).a(context);
            context.unregisterComponentCallbacks((ya1) this.e);
        }
        ((WeakReference) this.c).clear();
    }

    public final boolean J(int i, int i2) {
        boolean zOnStartNestedScroll;
        View view = (ViewGroup) this.e;
        if (!A(i2)) {
            if (this.b) {
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof lle;
                    if (z) {
                        zOnStartNestedScroll = ((lle) parent).k(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(parent);
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i2 == 0) {
                            this.c = parent;
                        } else if (i2 == 1) {
                            this.d = parent;
                        }
                        if (z) {
                            ((lle) parent).d(view2, view, i, i2);
                        } else if (i2 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError unused2) {
                                Objects.toString(parent);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void K(int i) {
        ViewParent viewParentZ = z(i);
        if (viewParentZ != null) {
            ViewGroup viewGroup = (ViewGroup) this.e;
            if (viewParentZ instanceof lle) {
                ((lle) viewParentZ).b(i, viewGroup);
            } else if (i == 0) {
                try {
                    viewParentZ.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentZ);
                }
            }
            if (i == 0) {
                this.c = null;
            } else if (i == 1) {
                this.d = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(org.chromium.base.Callback callback) throws e22 {
        ArrayList arrayList = (ArrayList) this.e;
        boolean z = this.b;
        if (z) {
            D(callback, this.c);
        } else if (!z) {
            ((ArrayList) this.d).add(callback);
        }
        if (arrayList.isEmpty() || arrayList.get(0) != null) {
            boolean z2 = this.b;
            if (z2 == 2) {
                D(null, null);
            } else if (z2 == 0) {
                arrayList.add(null);
            }
        }
    }

    public final void M() {
        boolean z = false;
        switch (this.a) {
            case 12:
                pde pdeVar = (pde) this.f;
                pde pdeVar2 = (pde) this.e;
                int i = ((jzk) pdeVar2.g()).a;
                int i2 = ((jzk) pdeVar2.g()).b;
                avl avlVar = (avl) ((bvl) this.c).getState().g();
                np3 np3Var = (np3) ((pde) ((r22) this.d).b).g();
                if (this.b && avlVar.e == 1) {
                    z = true;
                }
                xf8.F0(pdeVar, new mnf(z ? i : avlVar.c + i, np3Var.b + i2, i, i2));
                break;
            default:
                sjg sjgVar = (sjg) this.f;
                tjg tjgVar = (tjg) this.d;
                pg pgVar = (pg) ((kze) this.c).g();
                if (!Intrinsics.a(pgVar, ng.a)) {
                    if (!Intrinsics.a(pgVar, og.a)) {
                        h9o.p();
                        break;
                    } else if (this.b) {
                        this.b = false;
                        tjgVar.j(sjgVar);
                        break;
                    }
                } else {
                    int i3 = ((Boolean) ((pde) this.e).g()).booleanValue() ? 7 : 6;
                    tjgVar.getClass();
                    if (i3 != sjgVar.a) {
                        sjgVar.a = i3;
                        if (sjgVar == tjgVar.w) {
                            i7f i7fVar = tjgVar.q;
                            g7f g7fVarC = u35.c(i7fVar, i7fVar);
                            while (g7fVarC.hasNext()) {
                                ((rjg) g7fVarC.next()).e();
                            }
                        }
                    }
                    if (!this.b) {
                        this.b = true;
                        tjgVar.b(sjgVar, true);
                        break;
                    }
                }
                break;
        }
    }

    public final void N(int i, int i2) {
        if (i < 0.0f) {
            d8b.a("Index should be non-negative (" + i + ")");
        }
        ((q0g) this.c).i(i);
        ((o5c) this.f).b(i);
        ((q0g) this.d).i(i2);
    }

    @Override // defpackage.y9j
    public final void a(ezg ezgVar) {
        ((wf2) this.e).a(ezgVar);
    }

    @Override // defpackage.bln
    public final aln b(String str) {
        try {
            return kln.h(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void c() {
        ((bp) this.c).W();
    }

    @Override // defpackage.ih4
    public final void cancel() {
        this.b = true;
        ((RealCall) this.f).cancel();
    }

    @Override // defpackage.y9j
    public final boolean contains(String str) {
        UriMatcher uriMatcher = UserSettingsContentProvider.f;
        if ("previous_version_code".equals(str)) {
            return ((wf2) this.e).contains(str);
        }
        C();
        return ((SharedPreferences) ((b59) this.d).get()).contains(str);
    }

    @Override // defpackage.y9j
    public final boolean d(String str) {
        return ((wf2) this.e).d(str);
    }

    @Override // defpackage.y9j
    public final void e(String str, String str2) {
        ((wf2) this.e).e(str, str2);
    }

    @Override // defpackage.bln
    public final aln f(String str) {
        return null;
    }

    public final void g(cm cmVar) {
        if (this.b) {
            return;
        }
        this.b = true;
        ((z13) this.e).f();
        ((rhf) this.d).h(cmVar, v50.n);
    }

    @Override // defpackage.y9j
    public final int getInt(String str, int i) {
        UriMatcher uriMatcher = UserSettingsContentProvider.f;
        if ("previous_version_code".equals(str)) {
            return ((wf2) this.e).getInt(str, i);
        }
        C();
        SharedPreferences sharedPreferences = (SharedPreferences) ((b59) this.d).get();
        String strJ = UserSettingsContentProvider.j(sharedPreferences, str);
        return strJ != null ? sharedPreferences.getInt(strJ, i) : i;
    }

    @Override // defpackage.y9j
    public final long getLong(String str, long j) {
        UriMatcher uriMatcher = UserSettingsContentProvider.f;
        if ("previous_version_code".equals(str)) {
            return ((wf2) this.e).getLong(str, j);
        }
        C();
        SharedPreferences sharedPreferences = (SharedPreferences) ((b59) this.d).get();
        String strJ = UserSettingsContentProvider.j(sharedPreferences, str);
        return strJ != null ? sharedPreferences.getLong(strJ, j) : j;
    }

    @Override // defpackage.y9j
    public final String getString(String str, String str2) {
        UriMatcher uriMatcher = UserSettingsContentProvider.f;
        if ("previous_version_code".equals(str)) {
            return ((wf2) this.e).getString(str, str2);
        }
        C();
        SharedPreferences sharedPreferences = (SharedPreferences) ((b59) this.d).get();
        String strJ = UserSettingsContentProvider.j(sharedPreferences, str);
        return strJ != null ? sharedPreferences.getString(strJ, str2) : str2;
    }

    @Override // defpackage.r6l
    public final pxh h() {
        AbstractList abstractList = (AbstractList) this.f;
        m4l m4lVar = (m4l) this.d;
        if (this.b) {
            return new rxh(2132021844);
        }
        return new txh(new Object[]{Integer.valueOf(abstractList.size()), m4lVar.c()}, m4lVar.a == 0 ? 2131886152 : 2131886151, abstractList.size());
    }

    @Override // defpackage.y9j
    public final void i(long j, long j2, String str) {
        ((wf2) this.e).i(j, j2, str);
    }

    @Override // defpackage.ebf
    public final void j(ViewStub viewStub, abf abfVar) {
        gbf gbfVar = (gbf) this.f;
        tbf tbfVar = gbfVar.j.t;
        new bdn(viewStub, new z0c(this, abfVar, (byte) 29), gbfVar.f, tbfVar.b.j, tbfVar.b(128L), BrowserUtils.getRendererUrl(tbfVar.b.c), (cdn) this.d, (hv3) this.e, this.b, gbfVar.e);
    }

    @Override // defpackage.bln
    public final void k(String str, lt2 lt2Var) {
        umi umiVar = (umi) this.d;
        nml nmlVarE = umiVar.e(new roj(this, str, (byte) 14));
        nmlVarE.b(umiVar.f(new r2n((Object) lt2Var, (byte) 12)));
        nmlVarE.a(null);
    }

    @Override // defpackage.r6l
    public final void l() {
        List list = (List) this.e;
        k6l k6lVar = (k6l) this.c;
        h6l h6lVar = h6l.d;
        k6lVar.h(h6lVar);
        ArrayList arrayList = k6lVar.b;
        try {
            for (s6l s6lVar : (AbstractList) this.f) {
                b2l b2lVar = s6lVar.a;
                ((d7l) b2lVar).s(TabInfo.a(((d7l) b2lVar).j.a(), 0L, 0, s6lVar.b, 7));
            }
            k6lVar.n(h6lVar);
            if (arrayList.size() == list.size() && list.containsAll(Collections.unmodifiableList(arrayList))) {
                exg.c(k6lVar, list);
            }
        } catch (Throwable th) {
            k6lVar.n(h6lVar);
            throw th;
        }
    }

    @Override // defpackage.y9j
    public final void m(String str, String str2, String str3) {
        ((wf2) this.e).m(str, str2, str3);
    }

    @Override // defpackage.y9j
    public final void n(int i, String str) {
        ((wf2) this.e).n(i, str);
    }

    @Override // defpackage.y9j
    public final void o(int i, int i2, String str) {
        ((wf2) this.e).o(i, i2, str);
    }

    public final void onAdClicked() {
        ((bp) this.c).V();
    }

    public final void onAdLoaded(Object obj) {
        if (this.b) {
            return;
        }
        this.b = true;
        rhf rhfVar = (rhf) this.d;
        z13 z13Var = (z13) this.e;
        oo8 oo8Var = (oo8) this.f;
        rm rmVar = oo8Var.f;
        String str = rhfVar.c;
        dl dlVar = rhfVar.d;
        int i = oo8.s + 1;
        oo8.s = i;
        rhfVar.d(new ejf(z13Var, rmVar, str, dlVar, i, (bp) this.c, oo8Var.h, oo8Var.i));
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
        E(iOException.getMessage());
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) {
        if (pzhVar.q) {
            String strK = pzh.k(pzhVar, "Location");
            if (strK != null) {
                try {
                    vml.c(new oc9(this, a26.B(strK), (byte) 1));
                } catch (IllegalArgumentException e) {
                    E(e.getMessage());
                }
            } else {
                E("No location in response");
            }
        } else {
            E(pzhVar.c);
        }
        pzhVar.close();
    }

    @Override // defpackage.ebf
    public final Context p(Context context) {
        return ((gbf) this.f).f.c.isEnabled() ? new s8n(context, 2130971262) : context;
    }

    @Override // defpackage.y9j
    public final void q(int i, int i2, String str) {
        ((wf2) this.e).q(i, i2, str);
    }

    public final void r(Object obj) {
        Object objRemoveFirst;
        Set set;
        synchronized (((j06) this.c)) {
            Throwable th = (Throwable) this.f;
            if (th != null) {
                throw new IllegalStateException("Can't process the event due to a previous failure", th);
            }
            ((i72) this.d).addLast(obj);
            if (this.b) {
                return;
            }
            this.b = true;
            while (true) {
                synchronized (((j06) this.c)) {
                    if (((i72) this.d).isEmpty()) {
                        this.b = false;
                        return;
                    } else {
                        objRemoveFirst = ((i72) this.d).removeFirst();
                        set = (Set) this.e;
                    }
                }
                try {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((Function1) it.next()).invoke(objRemoveFirst);
                    }
                } catch (Throwable th2) {
                    synchronized (((j06) this.c)) {
                        ((i72) this.d).clear();
                        this.b = false;
                        this.f = th2;
                        throw th2;
                    }
                }
            }
        }
    }

    @Override // defpackage.y9j
    public final void remove(String str) {
        ((wf2) this.e).remove(str);
    }

    public final void s(orb orbVar) {
        bxl bxlVar;
        mgh mghVar = (mgh) this.d;
        if (((Callback) mghVar.c) == null) {
            return;
        }
        myk mykVar = ((hi2) this.f).a;
        fi2 fi2Var = new fi2(this, (byte) 0);
        fi2 fi2Var2 = new fi2(this, (byte) 1);
        ab abVar = new ab(mghVar, (byte) 21);
        db dbVar = mykVar.b;
        if (dbVar.f()) {
            bxl mghVar2 = new mgh((Object) null, abVar, (byte) 8);
            eme emeVar = new eme(dbVar, new qe9(mykVar, mghVar2, abVar, orbVar, fi2Var, fi2Var2, (byte) 6));
            OAuth2Account oAuth2Account = dbVar.c;
            if (oAuth2Account == null) {
                emeVar.b();
            } else {
                oAuth2Account.a(0, emeVar);
            }
            bxlVar = mghVar2;
        } else {
            abVar.run("Not signed in");
            bxlVar = bf9.A;
        }
        mghVar.b = bxlVar;
    }

    public final boolean t(float f, float f2, boolean z) {
        ViewParent viewParentZ;
        if (this.b && (viewParentZ = z(0)) != null) {
            try {
                return viewParentZ.onNestedFling((ViewGroup) this.e, f, f2, z);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentZ);
            }
        }
        return false;
    }

    public final boolean u(float f, float f2) {
        ViewParent viewParentZ;
        if (this.b && (viewParentZ = z(0)) != null) {
            try {
                return viewParentZ.onNestedPreFling((ViewGroup) this.e, f, f2);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentZ);
            }
        }
        return false;
    }

    public final boolean v(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent viewParentZ;
        int i4;
        int i5;
        int[] iArr3;
        ViewGroup viewGroup = (ViewGroup) this.e;
        if (!this.b || (viewParentZ = z(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            int[] iArr4 = (int[]) this.f;
            if (iArr4 == null) {
                iArr4 = new int[2];
                this.f = iArr4;
            }
            iArr3 = iArr4;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentZ instanceof lle) {
            ((lle) viewParentZ).e(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                viewParentZ.onNestedPreScroll(viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentZ);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean w(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentZ;
        int i6;
        int i7;
        int[] iArr3;
        ViewGroup viewGroup = (ViewGroup) this.e;
        if (this.b && (viewParentZ = z(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    int[] iArr4 = (int[]) this.f;
                    if (iArr4 == null) {
                        iArr4 = new int[2];
                        this.f = iArr4;
                    }
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentZ instanceof mle) {
                    ((mle) viewParentZ).g(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentZ instanceof lle) {
                        ((lle) viewParentZ).i(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            viewParentZ.onNestedScroll(viewGroup, i, i2, i3, i4);
                            viewGroup = viewGroup;
                        } catch (AbstractMethodError unused) {
                            viewGroup = viewGroup;
                            Objects.toString(viewParentZ);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final void x(Object obj) throws e22 {
        this.b = true;
        this.c = obj;
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            D((org.chromium.base.Callback) obj2, obj);
        }
        arrayList.clear();
        arrayList.trimToSize();
    }

    public final ViewParent z(int i) {
        if (i == 0) {
            return (ViewParent) this.c;
        }
        if (i != 1) {
            return null;
        }
        return (ViewParent) this.d;
    }
}
