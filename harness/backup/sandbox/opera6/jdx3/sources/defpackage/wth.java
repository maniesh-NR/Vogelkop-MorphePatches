package defpackage;

import J.N;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.leanplum.internal.ResourceQualifiers;
import com.leanplum.utils.SizeUtil;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;
import com.opera.android.StatusBarDrawingFrameLayout;
import com.opera.android.browser.BrowserUtils;
import com.opera.android.ui.catalog.widget.OperaListItem;
import com.opera.api.Callback;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.process_launcher.IFileDescriptorInfo;
import org.chromium.components.media_router.caf.remoting.CafExpandedControllerActivity;
import org.chromium.content.browser.ChildProcessLauncherHelperImpl;
import org.chromium.google_apis.gaia.GoogleServiceAuthError;

/* loaded from: classes.dex */
public class wth implements im5, qo3, bs, bcf, gy1, vlf, p4g, hti, g1j, SessionManagerListener, te, i35, fog {
    public final /* synthetic */ byte a;
    public Object b;

    public wth(byte b) {
        this.a = b;
        switch (b) {
            case 16:
                break;
            case 17:
            default:
                this.b = new AtomicReference(null);
                break;
            case SizeUtil.textSize0_1 /* 18 */:
                this.b = new dfe(new jq5[16]);
                break;
        }
    }

    public wth(Context context) throws Resources.NotFoundException {
        this.a = (byte) 28;
        Paint paint = new Paint(1);
        this.b = new z9h();
        paint.setFilterBitmap(true);
        Resources resources = context.getResources();
        fan.a(4.0f, resources);
        resources.getDimensionPixelSize(2131167364);
        resources.getDimensionPixelSize(2131167365);
        resources.getDimensionPixelSize(2131167369);
        resources.getDimensionPixelSize(2131167370);
        resources.getDimensionPixelSize(2131167368);
    }

    public wth(BrowserActivity browserActivity) {
        this.a = (byte) 19;
        this.b = browserActivity.y.K;
    }

    public /* synthetic */ wth(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public wth(Set set) {
        this.a = (byte) 0;
        this.b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            vth vthVar = (vth) it.next();
            HashMap map = (HashMap) this.b;
            vthVar.getClass();
            map.put(q66.class, vthVar.a);
        }
    }

    public wth(jb jbVar, String str) {
        this.a = (byte) 3;
        Objects.requireNonNull(jbVar);
        this.b = jbVar;
    }

    public wth(pde pdeVar, a64 a64Var) {
        this.a = (byte) 4;
        this.b = a26.o0(qbe.t(xf8.t(pdeVar)), a64Var, aej.b, pdeVar.g());
    }

    public static int E(int i) {
        if (i < 128) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 8;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static int F(int i, boolean z) {
        return E(i) + (z ? 1 : 0) + i;
    }

    public static int G(int i) {
        if (i < 31) {
            return 1;
        }
        int i2 = 2;
        while (true) {
            i >>>= 7;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public final void A(Collection collection, Function1 function1) {
        d12 d12Var = (d12) this.b;
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(k95.o(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add("chat/" + ((Number) it.next()).longValue());
        }
        d12Var.f(arrayList, new ra(function1, (byte) 2));
    }

    @Override // defpackage.p4g
    public final void B(w3g w3gVar) {
        d83 d83Var = (d83) this.b;
        if (d83Var == null) {
            return;
        }
        y73 y73Var = ((jh3) d83Var.f).F;
        y73Var.getClass();
        N.MwwLnzkg(new b83(y73Var, (byte) 0), new ArrayList());
    }

    public r86 C() {
        return new r86((OutputStream) this.b, (byte) 2);
    }

    public s96 D() {
        return new s96((OutputStream) this.b, (byte) 2);
    }

    public final long H() {
        CafExpandedControllerActivity cafExpandedControllerActivity = (CafExpandedControllerActivity) this.b;
        if (cafExpandedControllerActivity.c.g()) {
            return cafExpandedControllerActivity.c.f.a();
        }
        return 0L;
    }

    public final void I(float f, float f2, float f3, float f4) {
        d5o d5oVar = (d5o) this.b;
        sh4 sh4VarA = d5oVar.A();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (d5oVar.D() >> 32)) - (f3 + f);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (d5oVar.D() & 4294967295L)) - (f4 + f2);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits)) < 0.0f) {
            z7b.a("Width and height must be greater than or equal to zero");
        }
        d5oVar.K(jFloatToRawIntBits);
        sh4VarA.e(f, f2);
    }

    public final void J() throws IOException {
        lw4 lw4Var = (lw4) this.b;
        iw4 iw4Var = (iw4) lw4Var.f;
        wxe.t("on connect callback, pid=%d", new Object[]{Integer.valueOf(iw4Var.o)});
        pjn pjnVar = (pjn) lw4Var.a;
        pjnVar.getClass();
        int i = iw4Var.o;
        if (i > 0) {
            ChildProcessLauncherHelperImpl.p.put(Integer.valueOf(i), (ChildProcessLauncherHelperImpl) pjnVar.b);
            ChildProcessLauncherHelperImpl childProcessLauncherHelperImpl = (ChildProcessLauncherHelperImpl) pjnVar.b;
            sw4 sw4Var = childProcessLauncherHelperImpl.a;
            if (sw4Var != null) {
                boolean z = childProcessLauncherHelperImpl.k;
                byte b = ((ChildProcessLauncherHelperImpl) pjnVar.b).i;
                ArrayList arrayList = sw4Var.c;
                int i2 = sw4Var.b;
                if (i2 != -1 && arrayList.size() >= i2) {
                    h9o.r(sko.h(arrayList.size(), i2, "mRankings.size:", " mMaxSize:"));
                    return;
                } else {
                    arrayList.add(new pw4(iw4Var, z, b));
                    sw4Var.e(arrayList.size() - 1);
                    childProcessLauncherHelperImpl = (ChildProcessLauncherHelperImpl) pjnVar.b;
                }
            }
            if (childProcessLauncherHelperImpl.b) {
                ((t72) s14.y().c).add(iw4Var);
            }
            if (((ChildProcessLauncherHelperImpl) pjnVar.b).c && !ApplicationStatus.hasVisibleActivities()) {
                ((ChildProcessLauncherHelperImpl) pjnVar.b).a();
            }
        }
        long j = ((ChildProcessLauncherHelperImpl) pjnVar.b).g;
        if (j != 0) {
            N.MXR$KaDS(j, iw4Var.o);
        }
        ((ChildProcessLauncherHelperImpl) pjnVar.b).g = 0L;
        try {
            for (IFileDescriptorInfo iFileDescriptorInfo : (IFileDescriptorInfo[]) lw4Var.c) {
                iFileDescriptorInfo.b.close();
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x020e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.app.Activity, com.opera.android.BrowserActivity, dx3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(java.lang.String r27, int r28, boolean r29, int r30, boolean r31, defpackage.eri r32) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wth.K(java.lang.String, int, boolean, int, boolean, eri):void");
    }

    public final void L() {
        dfe dfeVar = (dfe) this.b;
        IntRange intRangeJ = djh.j(0, dfeVar.c);
        int i = ((a) intRangeJ).a;
        int i2 = ((a) intRangeJ).b;
        if (i <= i2) {
            while (true) {
                nh4 nh4Var = ((jq5) dfeVar.a[i]).b;
                Unit unit = Unit.a;
                p0i p0iVar = t0i.b;
                nh4Var.resumeWith(unit);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        dfeVar.h();
    }

    public final void M(long j, float f) {
        sh4 sh4VarA = ((d5o) this.b).A();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        sh4VarA.e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        sh4VarA.i(f);
        sh4VarA.e(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public final void N(float f, float f2, long j) {
        sh4 sh4VarA = ((d5o) this.b).A();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        sh4VarA.e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        sh4VarA.a(f, f2);
        sh4VarA.e(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public final void O(long j) {
        CafExpandedControllerActivity cafExpandedControllerActivity = (CafExpandedControllerActivity) this.b;
        if (cafExpandedControllerActivity.c.g()) {
            cafExpandedControllerActivity.s().seek(j);
        }
    }

    public final void P(float f, float f2) {
        ((d5o) this.b).A().e(f, f2);
    }

    public final void Q(int i) throws IOException {
        ((OutputStream) this.b).write(i);
    }

    public final void R(byte[] bArr, int i, int i2) throws IOException {
        ((OutputStream) this.b).write(bArr, i, i2);
    }

    public final void S(int i) throws IOException {
        OutputStream outputStream = (OutputStream) this.b;
        if (i < 128) {
            outputStream.write(i);
            return;
        }
        int i2 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i3 = i2 - 1;
            bArr[i3] = (byte) i;
            i >>>= 8;
            if (i == 0) {
                int i4 = i2 - 2;
                bArr[i4] = (byte) ((5 - i3) | ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL);
                outputStream.write(bArr, i4, 6 - i3);
                return;
            }
            i2 = i3;
        }
    }

    public void T(x[] xVarArr) {
        for (x xVar : xVarArr) {
            xVar.e().j(this, true);
        }
    }

    public final void U(byte[] bArr, int i, boolean z) throws IOException {
        X(i, z);
        S(bArr.length);
        R(bArr, 0, bArr.length);
    }

    public final void V(boolean z, int i, x[] xVarArr) throws IOException {
        X(i, z);
        Q(ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL);
        T(xVarArr);
        Q(0);
        Q(0);
    }

    public final void W(int i, int i2) throws IOException {
        OutputStream outputStream = (OutputStream) this.b;
        if (i2 < 31) {
            outputStream.write(i | i2);
            return;
        }
        byte[] bArr = new byte[6];
        int i3 = 5;
        bArr[5] = (byte) (i2 & 127);
        while (i2 > 127) {
            i2 >>>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL);
        }
        int i4 = i3 - 1;
        bArr[i4] = (byte) (i | 31);
        outputStream.write(bArr, i4, 6 - i4);
    }

    public final void X(int i, boolean z) throws IOException {
        if (z) {
            Q(i);
        }
    }

    public void Y(z0 z0Var) {
        z0Var.j(this, true);
    }

    public void Z(z0[] z0VarArr) {
        for (z0 z0Var : z0VarArr) {
            z0Var.j(this, true);
        }
    }

    @Override // defpackage.bs
    public final void a(is isVar) {
        tr8 tr8Var = ((ss) this.b).G0().e;
        st stVar = isVar.c;
        Set setE = e82.E(new String[]{stVar.b, stVar.g});
        new rml(Unit.a, tr8Var.a).a(new ry7(tr8Var, setE, (byte) 7)).l();
    }

    @Override // defpackage.i35
    public final void a0() {
        p35 p35Var = (p35) this.b;
        p35Var.H0();
        p35Var.r.forEach(new qg2((byte) 4));
    }

    public final long b(ccb ccbVar, long j, d2c d2cVar, long j2) {
        long j3 = ((ybb) ((Function0) this.b).invoke()).a;
        return (j14.j(ccbVar.a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), d2cVar == d2c.a) << 32) | (j14.j(ccbVar.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true) & 4294967295L);
    }

    @Override // defpackage.gy1
    public final void c(jy1 jy1Var) {
        zz1 zz1Var = (zz1) ((s62) this.b).v.o;
        if (zz1Var != null) {
            zz1Var.d.b(new rxh(2132017512), 2500, new rxh(2132017278), jy1Var);
        }
    }

    @Override // defpackage.te
    public final int d() {
        return ((nz4) this.b).c.A();
    }

    public final void e(CancellationException cancellationException) {
        dfe dfeVar = (dfe) this.b;
        int i = dfeVar.c;
        mh4[] mh4VarArr = new mh4[i];
        for (int i2 = 0; i2 < i; i2++) {
            mh4VarArr[i2] = ((jq5) dfeVar.a[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            mh4VarArr[i3].d(cancellationException);
        }
        if (dfeVar.c == 0) {
            return;
        }
        d8b.c("uncancelled requests present");
    }

    @Override // defpackage.bs
    public final StatusBarDrawingFrameLayout f() {
        return ((ss) this.b).k;
    }

    public final void g(GoogleServiceAuthError googleServiceAuthError) {
    }

    @Override // defpackage.g1j
    public final boolean h() {
        hw3 hw3Var = (hw3) this.b;
        return ((f1j) hw3Var.get()).b() && ((f1j) hw3Var.get()).a();
    }

    @Override // defpackage.te
    public final int i() {
        return ((nz4) this.b).f.B;
    }

    @Override // defpackage.g1j
    public final boolean isEnabled() {
        return ((f1j) ((hw3) this.b).get()).b();
    }

    public final void j(b8 b8Var) {
    }

    @Override // defpackage.g1j
    public final void k(String str) {
        ((f1j) ((hw3) this.b).get()).f(str);
    }

    @Override // defpackage.i35
    public final void l() {
        ((p35) this.b).r.forEach(new qg2((byte) 5));
    }

    public final g3o l0(View view, g3o g3oVar) {
        boolean z;
        int iD = g3oVar.d();
        xp1 xp1Var = (xp1) this.b;
        int iD2 = g3oVar.d();
        ActionBarContextView actionBarContextView = xp1Var.v;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xp1Var.v.getLayoutParams();
            boolean z2 = false;
            if (xp1Var.v.isShown()) {
                if (xp1Var.b0 == null) {
                    xp1Var.b0 = new Rect();
                    xp1Var.c0 = new Rect();
                }
                Rect rect = xp1Var.b0;
                Rect rect2 = xp1Var.c0;
                rect.set(g3oVar.b(), g3oVar.d(), g3oVar.c(), g3oVar.a());
                r9b r9bVarI = g3oVar.a.i(2);
                Insets systemWindowInsets = xp1Var.A.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
                rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
                r9b r9bVarC = r9b.c(Math.max(0, r9bVarI.a - rect2.left), Math.max(0, r9bVarI.b - rect2.top), Math.max(0, r9bVarI.c - rect2.right), Math.max(0, r9bVarI.d - rect2.bottom));
                int i = r9bVarC.c;
                int i2 = marginLayoutParams.leftMargin;
                int i3 = r9bVarC.a;
                if (i2 == i3 && marginLayoutParams.rightMargin == i) {
                    z = false;
                } else {
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i;
                    z = true;
                }
                ActionBarContextView actionBarContextView2 = xp1Var.v;
                int i4 = rect.left - i3;
                int i5 = rect.top;
                int i6 = rect.right - i;
                actionBarContextView2.u = i4;
                actionBarContextView2.v = i5;
                actionBarContextView2.w = i6;
                actionBarContextView2.k();
                if (!xp1Var.G && rect.top > 0) {
                    iD2 = 0;
                }
                z2 = z;
            }
            if (z2) {
                xp1Var.v.setLayoutParams(marginLayoutParams);
            }
        }
        if (iD != iD2) {
            int iB = g3oVar.b();
            int iC = g3oVar.c();
            int iA = g3oVar.a();
            int i7 = Build.VERSION.SDK_INT;
            t2o t2oVar = i7 >= 36 ? new t2o(g3oVar) : i7 >= 35 ? new s2o(g3oVar) : i7 >= 34 ? new r2o(g3oVar) : i7 >= 31 ? new q2o(g3oVar) : i7 >= 30 ? new p2o(g3oVar) : new o2o(g3oVar);
            t2oVar.h(r9b.c(iB, iD2, iC, iA));
            g3oVar = t2oVar.b();
        }
        return r5n.h(view, g3oVar);
    }

    @Override // defpackage.qo3
    public final lak m() {
        return (rlh) this.b;
    }

    @Override // defpackage.g1j
    public final void n(String str, String str2) {
        f1j f1jVar = (f1j) ((hw3) this.b).get();
        Uri uri = Uri.parse(str);
        String[] strArr = aik.a;
        if (str2 == null) {
            str2 = "";
        }
        if (f1jVar.a()) {
            f1jVar.g(BrowserUtils.getExternalUrlWithFallback(uri.toString()), str2);
        } else {
            f1jVar.h(new jbd(f1jVar, uri, str2, (byte) 16));
        }
    }

    @Override // defpackage.gy1
    public final void o(int i) {
        zz1 zz1Var = (zz1) ((s62) this.b).v.o;
        if (zz1Var != null) {
            zz1Var.d.a(new rxh(i), 2500);
        }
    }

    public final void onSessionEnded(Session session, int i) {
        ((zo4) this.b).G0(null);
    }

    public final void onSessionEnding(Session session) {
        ((zo4) this.b).G0(null);
    }

    public final void onSessionResumeFailed(Session session, int i) {
    }

    public final void onSessionResumed(Session session, boolean z) {
        ((zo4) this.b).G0(((CastSession) session).getRemoteMediaClient());
    }

    public final void onSessionResuming(Session session, String str) {
    }

    public final void onSessionStartFailed(Session session, int i) {
    }

    public final void onSessionStarted(Session session, String str) {
        ((zo4) this.b).G0(((CastSession) session).getRemoteMediaClient());
    }

    public final void onSessionStarting(Session session) {
    }

    public final void onSessionSuspended(Session session, int i) {
        ((zo4) this.b).G0(null);
    }

    public final void p(String str) {
        ((im3) this.b).x.i(str);
    }

    public final void q(float f, float f2, float f3, float f4, int i) {
        ((d5o) this.b).A().d(f, f2, f3, f4, i);
    }

    @Override // defpackage.bs
    public final void r(is isVar) {
        ss ssVar = (ss) this.b;
        xs xsVarG0 = ssVar.G0();
        st stVarU = xsVarG0.b.u(ssVar.getResources(), isVar.c);
        st[] stVarArr = xsVarG0.h;
        stVarArr[e82.u(isVar.c, stVarArr)] = stVarU;
        kq8 kq8Var = xsVarG0.i;
        if (kq8Var != null) {
            tw2 tw2Var = xsVarG0.c;
            tw2Var.getClass();
            boolean z = stVarU.k;
            orm ormVar = (orm) tw2Var.b;
            if (z) {
                String strW = tw2.w(kq8Var);
                x5f x5fVar = (x5f) ormVar;
                if (x5fVar.h) {
                    x5fVar.j(1, strW, true);
                }
            } else {
                String strW2 = tw2.w(kq8Var);
                x5f x5fVar2 = (x5f) ormVar;
                if (x5fVar2.h) {
                    x5fVar2.j(2, strW2, true);
                }
            }
        }
        xsVarG0.f();
    }

    public final b8 run() {
        boolean zB = tjj.c.b();
        a4f a4fVar = (a4f) ((jb) this.b).d;
        if (zB) {
            a4fVar.getClass();
            return null;
        }
        a4fVar.getClass();
        yt7.k("NullAccountManagerDelegate does not implement invalidateAccessToken");
        return null;
    }

    @Override // defpackage.p4g
    public final void s(w3g w3gVar) {
        d83 d83Var = (d83) this.b;
        if (d83Var == null) {
            return;
        }
        List list = d83Var.c;
        if (list != null) {
            int iA = w3g.a(list, w3gVar);
            d83Var.c.remove(w3gVar);
            d83Var.notifyItemRemoved(iA);
            y73 y73Var = ((jh3) d83Var.f).F;
            y73Var.getClass();
            N.MwwLnzkg(new b83(y73Var, (byte) 0), new ArrayList());
        }
        this.b = null;
    }

    @Override // defpackage.g1j
    public final void t(re7 re7Var) {
        ((f1j) ((hw3) this.b).get()).d(re7Var);
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                return "ResolvedFeatureGroup(features=" + ((LinkedHashSet) this.b) + ')';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        ((qc2) this.b).b.V(z ? 1 : 0, "ai_assistant_menu_shortcut");
    }

    public final void v(String str) {
        im3 im3Var = (im3) this.b;
        im3Var.K0();
        im3Var.x.i(str);
    }

    public final void w(Callback callback) {
        e3j e3jVarT = e3j.t((OperaApplication) this.b);
        e3jVarT.F(new p1(e3jVarT, callback, (byte) 3));
    }

    @Override // defpackage.bs
    public final void x(hs hsVar) {
    }

    public final void y(long j, Function1 function1) {
        ((d12) this.b).e(p3p.l(j, "chat/"), new ra(function1, (byte) 5));
    }

    public final void z(long j, long j2, Function1 function1) {
        d12 d12Var = (d12) this.b;
        StringBuilder sbQ = p3p.q(j, "chat/", "/item/");
        sbQ.append(j2);
        d12Var.e(sbQ.toString(), new ra(function1, (byte) 3));
    }
}
