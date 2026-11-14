package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.media.Image;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.textclassifier.TextClassification;
import androidx.recyclerview.widget.d;
import com.google.android.material.appbar.AppBarLayout;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.bookmarks.h;
import com.opera.android.browser.TabInfo;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.oauth2.OperaAccessToken;
import com.opera.android.webaiassistant.WebAiAssistantSheetContentWrapper;
import com.opera.api.Callback;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipInputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class eme implements ahf, grj, sic, pya, bcf, f94, nj8, yxd, rj2, p4g, hti, a0n, gm8, w9l, ysl, i35 {
    public static final int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};
    public final Object a;

    public eme(byte b2) {
        switch (b2) {
            case 12:
                this.a = new AtomicInteger(0);
                return;
            case SizeUtil.textSize1 /* 22 */:
                fee feeVarK = fee.k();
                this.a = feeVarK;
                an2 an2Var = fcl.Dp;
                Class cls = (Class) feeVarK.b(an2Var, (Object) null);
                if (cls != null && !cls.equals(wg4.class)) {
                    kp5.d("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                feeVarK.s(an2Var, wg4.class);
                an2 an2Var2 = fcl.Cp;
                if (feeVarK.b(an2Var2, (Object) null) == null) {
                    feeVarK.s(an2Var2, wg4.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            default:
                this.a = new JSONArray();
                return;
        }
    }

    public eme(cig cigVar) {
        nrl nrlVar = new nrl((byte) 11);
        this.a = nrlVar;
        nrlVar.c(cigVar.a);
    }

    public eme(BrowserActivity browserActivity) {
        this.a = new v6d(browserActivity.u1);
    }

    public eme(h hVar, vnj vnjVar) {
        this.a = vnjVar;
        hVar.a(new dl3(this, (byte) 1));
    }

    public eme(db dbVar, Callback callback) {
        this.a = callback;
    }

    public /* synthetic */ eme(Object obj) {
        this.a = obj;
    }

    public eme(Function1 function1) {
        u9d u9dVar = new u9d();
        for (nle nleVar : nle.values()) {
            u9dVar.put(nleVar, function1.invoke(nleVar));
        }
        this.a = u9dVar.g();
    }

    public eme(ole oleVar, j06 j06Var) {
        this.a = oleVar;
    }

    public eme(SelectionPopupControllerImpl selectionPopupControllerImpl) {
        this.a = selectionPopupControllerImpl instanceof SelectionPopupControllerImpl ? selectionPopupControllerImpl : null;
    }

    public eme(x75 x75Var) {
        Charset charset = jfb.a;
        this.a = x75Var;
        x75Var.a = this;
    }

    public static knj q0(pl3 pl3Var) {
        return new knj(pl3Var.f(), new lnj(mnj.a, pl3Var.getId()));
    }

    @Override // defpackage.ysl
    public final int A() {
        bz3 bz3Var = ((az3) this.a).d;
        return ((dtl) bz3Var.g).c - bz3Var.c;
    }

    @Override // defpackage.p4g
    public final void B(w3g w3gVar) {
        ((x5g) this.a).d.a.m(w4g.a(w3gVar));
    }

    @Override // defpackage.nj8
    public final void F() {
    }

    @Override // defpackage.a0n
    public final void G(int i) {
        Window window = (Window) this.a;
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = nb6.i(i / 100.0f, 0.01f, 1.0f);
        window.setAttributes(attributes);
    }

    @Override // defpackage.ysl
    public final int H() {
        bz3 bz3Var = ((az3) this.a).d;
        return ((dtl) bz3Var.g).a - bz3Var.a;
    }

    public final void I(int i, int i2, Object obj) {
        ((d) this.a).notifyItemRangeChanged(i, i2, obj);
    }

    @Override // defpackage.ysl
    public final void J(ChromiumContent chromiumContent) {
        az3 az3Var = (az3) this.a;
        az3Var.c.b = chromiumContent;
        boolean zN = az3Var.N(4, false);
        bz3 bz3Var = az3Var.d;
        if (zN) {
            if (bz3Var.d) {
                bz3Var.d(true);
            }
        } else if (bz3Var.d) {
            bz3Var.d(false);
        }
    }

    @Override // defpackage.nj8
    public final void K() {
        ((WebAiAssistantSheetContentWrapper) ((t42) this.a).w.d).e();
    }

    @Override // defpackage.w9l
    public final void L(Long l) {
        BrowserActivity browserActivity = (BrowserActivity) this.a;
        int i = BrowserActivity.E1;
        browserActivity.P0().e(new xl3(l), false);
    }

    @Override // defpackage.ysl
    public final void M() {
        bz3 bz3Var = ((az3) this.a).d;
        bz3Var.d = false;
        bz3Var.f();
        bz3Var.d(true);
    }

    @Override // defpackage.yxd
    public final InputStream Q(String str) {
        try {
            return ((AssetManager) this.a).open(str.substring(1));
        } catch (IOException unused) {
            return null;
        }
    }

    public final int R() {
        return ((Image.Plane) this.a).getRowStride();
    }

    public final void S(int i, int i2) {
        ((d) this.a).notifyItemMoved(i, i2);
    }

    @Override // defpackage.ysl
    public final void T(r22 r22Var) {
        bz3 bz3Var = ((az3) this.a).d;
        bz3Var.f = r22Var;
        bz3Var.f();
    }

    @Override // defpackage.nj8
    public final void U(float f) {
    }

    @Override // defpackage.ahf
    public final void V(OperaAccessToken operaAccessToken) {
        ((Callback) this.a).run(operaAccessToken);
    }

    @Override // defpackage.nj8
    public final void W() {
        ((WebAiAssistantSheetContentWrapper) ((t42) this.a).w.d).e();
    }

    @Override // defpackage.rj2
    public final void Y() {
    }

    @Override // defpackage.ysl
    public final void Z() {
        bz3 bz3Var = ((az3) this.a).d;
        bz3Var.d = true;
        bz3Var.f();
    }

    @Override // defpackage.ysl
    public final int a() {
        return ((dtl) ((az3) this.a).d.g).b;
    }

    @Override // defpackage.i35
    public final void a0() {
        e35 e35Var = (e35) this.a;
        e35Var.J0();
        e35Var.r.forEach(new qg2((byte) 3));
    }

    @Override // defpackage.ahf
    public final void b() {
        ((Callback) this.a).run(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    @Override // defpackage.ysl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(java.lang.Runnable r5) {
        /*
            r4 = this;
            java.lang.Object r4 = r4.a
            az3 r4 = (defpackage.az3) r4
            h7f r0 = r4.h
            bz3 r1 = r4.d
            java.lang.Object r2 = r1.e
            bvl r2 = (defpackage.bvl) r2
            if (r2 == 0) goto L18
            java.lang.Object r2 = r1.g
            dtl r2 = (defpackage.dtl) r2
            int r3 = r2.a
            int r2 = r2.b
            if (r3 > r2) goto L28
        L18:
            java.lang.Object r2 = r1.f
            r22 r2 = (defpackage.r22) r2
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.g
            dtl r2 = (defpackage.dtl) r2
            int r3 = r2.e
            int r2 = r2.d
            if (r3 <= r2) goto L44
        L28:
            boolean r1 = r1.c()
            if (r1 != 0) goto L44
            if (r5 == 0) goto L33
            r0.b(r5)
        L33:
            r1 = 4
            r2 = 0
            boolean r4 = r4.N(r1, r2)
            if (r4 != 0) goto L49
            if (r5 == 0) goto L49
            r0.c(r5)
            r5.run()
            return
        L44:
            if (r5 == 0) goto L49
            r5.run()
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eme.b0(java.lang.Runnable):void");
    }

    @Override // defpackage.ysl
    public final int c() {
        return ((dtl) ((az3) this.a).d.g).d;
    }

    @Override // defpackage.rj2
    public final void c0() {
        ArrayDeque arrayDeque = ((vj2) this.a).e;
        while (!arrayDeque.isEmpty()) {
            ((Runnable) ((Pair) arrayDeque.removeFirst()).second).run();
        }
    }

    @Override // defpackage.gm8
    public final void d() {
        ((v6d) this.a).b(t6d.b);
    }

    @Override // defpackage.gm8
    public final void e() {
        ((v6d) this.a).b(t6d.a);
    }

    @Override // defpackage.grj
    public final TextClassification e0() {
        vyi vyiVar;
        TextClassification textClassification;
        SelectionPopupControllerImpl selectionPopupControllerImpl = (SelectionPopupControllerImpl) this.a;
        if (selectionPopupControllerImpl == null || (vyiVar = selectionPopupControllerImpl.L) == null || (textClassification = vyiVar.f) == null || textClassification.getText() == null) {
            return null;
        }
        return textClassification;
    }

    public final void f(int i, int i2) {
        ((d) this.a).notifyItemRangeRemoved(i, i2);
    }

    @Override // defpackage.ysl
    public final void f0(Object obj) {
        az3 az3Var = (az3) this.a;
        HashSet hashSet = az3Var.e;
        if (hashSet.remove(obj) && hashSet.isEmpty()) {
            az3Var.N(3, false);
        }
    }

    @Override // defpackage.ysl
    public final int g() {
        return ((dtl) ((az3) this.a).d.g).c;
    }

    @Override // defpackage.ysl
    public final int h() {
        return ((dtl) ((az3) this.a).d.g).a;
    }

    @Override // defpackage.w9l
    public final b2l h0(b2l b2lVar, TabInfo tabInfo) {
        BrowserActivity browserActivity = (BrowserActivity) this.a;
        boolean zM = ((d7l) b2lVar).j.m();
        int i = BrowserActivity.E1;
        return browserActivity.i0(zM, b2lVar, false, lqm.l, tabInfo);
    }

    @Override // defpackage.a0n
    public final int i() {
        float f;
        float f2;
        Window window = (Window) this.a;
        float f3 = window.getAttributes().screenBrightness;
        if (f3 == -1.0f) {
            ContentResolver contentResolver = window.getContext().getContentResolver();
            int i = Settings.System.getInt(contentResolver, "screen_brightness_mode", 0);
            if (i == 0) {
                f = Settings.System.getInt(contentResolver, "screen_brightness", 127);
                f2 = 255.0f;
            } else if (i != 1) {
                f3 = 0.5f;
            } else {
                f = (Settings.System.getFloat(contentResolver, "screen_auto_brightness_adj", 0.0f) * 0.8f) + 1.0f;
                f2 = 2.0f;
            }
            f3 = f / f2;
        }
        return Math.round(f3 * 100.0f);
    }

    public final int i0() {
        return ((Image.Plane) this.a).getPixelStride();
    }

    @Override // defpackage.ysl
    public final boolean j() {
        return ((dtl) ((az3) this.a).d.g).g;
    }

    @Override // defpackage.w9l
    public final b2l j0(p6l p6lVar, TabInfo tabInfo) {
        BrowserActivity browserActivity = (BrowserActivity) this.a;
        boolean z = p6lVar == p6l.b;
        int i = BrowserActivity.E1;
        return browserActivity.j1(z, false, tabInfo);
    }

    @Override // defpackage.w9l
    public final b2l k(p6l p6lVar) {
        BrowserActivity browserActivity = (BrowserActivity) this.a;
        boolean z = p6lVar == p6l.b;
        int i = BrowserActivity.E1;
        return browserActivity.i0(z, null, false, lqm.l, null);
    }

    @Override // defpackage.i35
    public final void l() {
        ((e35) this.a).r.forEach(new qg2((byte) 2));
    }

    public final g3o l0(View view, g3o g3oVar) {
        AppBarLayout appBarLayout = (AppBarLayout) this.a;
        g3o g3oVar2 = appBarLayout.getFitsSystemWindows() ? g3oVar : null;
        if (!Objects.equals(appBarLayout.g, g3oVar2)) {
            appBarLayout.g = g3oVar2;
            appBarLayout.setWillNotDraw(!(appBarLayout.x != null && appBarLayout.g() > 0));
            appBarLayout.requestLayout();
        }
        return g3oVar;
    }

    @Override // defpackage.ysl
    public final boolean n() {
        return ((az3) this.a).d.c();
    }

    @Override // defpackage.nj8
    public final void n0(float f) {
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
        nh4 nh4Var = (nh4) this.a;
        p0i p0iVar = t0i.b;
        nh4Var.resumeWith(new q0i(iOException));
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) {
        boolean z = pzhVar.q;
        nh4 nh4Var = (nh4) this.a;
        if (z) {
            p0i p0iVar = t0i.b;
            nh4Var.resumeWith(Unit.a);
        } else {
            p0i p0iVar2 = t0i.b;
            nh4Var.resumeWith(new q0i(new IOException(sko.i(pzhVar.d, "Error: "))));
        }
    }

    public final void p(String str) {
        ((jh3) this.a).v.getFilter().filter(str);
    }

    @Override // defpackage.ysl
    public final boolean q() {
        if (((az3) this.a).b.c()) {
            return false;
        }
        return h() > 0 || g() > 0;
    }

    @Override // defpackage.ysl
    public final void r(Object obj) {
        az3 az3Var = (az3) this.a;
        HashSet hashSet = az3Var.e;
        if (hashSet.add(obj) && hashSet.size() == 1) {
            az3Var.N(3, false);
        }
    }

    public final void r0() {
        ((zh5) this.a).getClass();
    }

    @Override // defpackage.p4g
    public final void s(w3g w3gVar) {
        ((x5g) this.a).d.a.j(w4g.a(w3gVar));
    }

    public final l3d s0(Context context, String str, InputStream inputStream, String str2, String str3) {
        l3d l3dVarG;
        f19 f19Var;
        ole oleVar = (ole) this.a;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            izc.a();
            f19 f19Var2 = f19.c;
            l3dVarG = (str3 == null || oleVar == null) ? u2d.g(context, new ZipInputStream(inputStream), (String) null) : u2d.g(context, new ZipInputStream(new FileInputStream(oleVar.K(str, inputStream, f19Var2))), str);
            f19Var = f19Var2;
        } else {
            izc.a();
            f19Var = f19.b;
            l3dVarG = (str3 == null || oleVar == null) ? u2d.c(inputStream, (String) null) : u2d.c(new FileInputStream(oleVar.K(str, inputStream, f19Var).getAbsolutePath()), str);
        }
        if (str3 != null && l3dVarG.a != null && oleVar != null) {
            File file = new File(oleVar.A(), ole.p(str, f19Var, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            izc.a();
            if (!zRenameTo) {
                izc.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return l3dVarG;
    }

    public final void t(int i, int i2) {
        ((d) this.a).notifyItemRangeInserted(i, i2);
    }

    public final wv t0(nle nleVar) {
        Object obj = ((u9d) this.a).get(nleVar);
        if (obj != null) {
            return (wv) obj;
        }
        qp2.n("Required value was null.");
        return null;
    }

    public final ByteBuffer u() {
        return ((Image.Plane) this.a).getBuffer();
    }

    public final wv u0(nle nleVar) {
        wv wvVar = (wv) ((u9d) this.a).get(nleVar);
        if (wvVar == null || wvVar.equals(wv.d)) {
            return null;
        }
        return wvVar;
    }

    public final void v(String str) {
        ((jh3) this.a).v.getFilter().filter(str);
    }

    public final void v0(int i) {
        nrl nrlVar = (nrl) this.a;
        z4o.H(!nrlVar.a);
        ((SparseBooleanArray) nrlVar.b).delete(i);
    }

    public final void w0(int i, Object obj, bni bniVar) {
        x75 x75Var = (x75) this.a;
        x75Var.A(i, 3);
        bniVar.b((x5) obj, x75Var.a);
        x75Var.A(i, 4);
    }

    @Override // defpackage.ysl
    public final void x(ChromiumContent chromiumContent) {
        z4k z4kVar = ((az3) this.a).c;
        if (z4kVar.f(chromiumContent)) {
            z4kVar.b = null;
        }
    }

    @Override // defpackage.w9l
    public final void y() {
        ((g8j) ((d8j) ((BrowserActivity) this.a).g0.E(d8j.class))).d(new int[0]);
    }

    @Override // defpackage.ysl
    public final void z(bvl bvlVar) {
        ((az3) this.a).d.e = bvlVar;
    }
}
