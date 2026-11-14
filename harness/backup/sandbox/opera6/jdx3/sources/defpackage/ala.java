package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.LongSparseArray;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.OperaApplication;
import com.opera.android.browser.chromium.ChromiumContainerView;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.esim.ui.EsimActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.chromium.content.browser.GestureListenerManagerImpl;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class ala implements jz4 {
    public static final s16 m = new s16();
    public Object a = new w8i();
    public Object b = new w8i();
    public Object c = new w8i();
    public Object d = new w8i();
    public Object e = new i3(0.0f);
    public Object f = new i3(0.0f);
    public Object g = new i3(0.0f);
    public Object h = new i3(0.0f);
    public Object i = new qs7((byte) 0);
    public Object j = new qs7((byte) 0);
    public Object k = new qs7((byte) 0);
    public Object l = new qs7((byte) 0);

    @Override // defpackage.jz4
    public final void A(ChromiumContent chromiumContent) {
        ChromiumContainerView chromiumContainerView = (ChromiumContainerView) this.d;
        nz4 nz4Var = new nz4(chromiumContainerView, (ysl) this.c);
        g7b g7bVar = new g7b((t5d) this.b, chromiumContent, chromiumContainerView.b.a);
        WebContents webContentsE = chromiumContent.e();
        ktn ktnVar = mkh.d;
        WebContents webContents = g7bVar.m;
        tz4 tz4Var = g7bVar.a;
        if (webContents != null) {
            LongSparseArray longSparseArray = GestureListenerManagerImpl.n;
            webContents.X(GestureListenerManagerImpl.class, ktnVar).h(tz4Var);
        }
        g7bVar.m = webContentsE;
        if (webContentsE != null) {
            LongSparseArray longSparseArray2 = GestureListenerManagerImpl.n;
            ((GestureListenerManagerImpl) webContentsE.X(GestureListenerManagerImpl.class, ktnVar)).b(tz4Var, 2);
        }
        ivn ivnVar = (ivn) this.e;
        g1j g1jVar = (g1j) this.f;
        q6e q6eVar = (q6e) this.g;
        x5f x5fVar = (x5f) this.h;
        b7f b7fVar = (b7f) this.j;
        jv0 jv0Var = (jv0) this.k;
        nz4Var.f = chromiumContent;
        nz4Var.j = b7fVar;
        chromiumContent.k(nz4Var.a);
        nz4Var.setVisibility(8);
        nz4Var.d = new cy3(chromiumContent, nz4Var.getContext());
        chromiumContent.e().v0(nz4Var.d);
        SelectionPopupControllerImpl selectionPopupControllerImplFromWebContents = SelectionPopupControllerImpl.fromWebContents(chromiumContent.e());
        Context context = nz4Var.getContext();
        selectionPopupControllerImplFromWebContents.getClass();
        selectionPopupControllerImplFromWebContents.f = new ue(context, selectionPopupControllerImplFromWebContents, ivnVar, g1jVar, q6eVar, x5fVar, jv0Var, new wth((Object) nz4Var, (byte) 26));
        new GestureDetector(nz4Var.getContext(), new mz4((byte) 0));
        nz4Var.j.b(nz4Var.k);
        Context context2 = nz4Var.getContext();
        String[] strArr = OperaApplication.K;
        ((OperaApplication) context2.getApplicationContext()).B().b(nz4Var.f.J);
        e9e e9eVar = (e9e) this.i;
        ntn ntnVar = new ntn(chromiumContent, e9eVar);
        lz4 lz4Var = new lz4(nz4Var, g7bVar, ntnVar);
        ((HashMap) this.a).put(chromiumContent, lz4Var);
        chromiumContent.k(lz4Var.c);
        chromiumContent.k(ntnVar);
        e9eVar.b(ntnVar);
    }

    @Override // defpackage.jz4
    public final boolean D() {
        return ((e00) this.l).b().b;
    }

    @Override // defpackage.jz4
    public final void E(ChromiumContent chromiumContent) {
        l(chromiumContent).a.f.e().d1().a(SystemClock.uptimeMillis(), false);
    }

    @Override // defpackage.jz4
    public final void G(ChromiumContent chromiumContent) {
        nz4 nz4Var = l(chromiumContent).a;
        nz4Var.f.e().d1().a(SystemClock.uptimeMillis(), false);
        int iCeil = (int) Math.ceil(nz4Var.f.e().g.a);
        WebContents webContentsE = nz4Var.f.e();
        if (webContentsE != null) {
            webContentsE.d1().g(iCeil, 0.0f);
        }
    }

    @Override // defpackage.jz4
    public final int a() {
        return ((ysl) this.c).a();
    }

    public final void b(String str, String str2) {
        HashMap map = (HashMap) this.f;
        if (map != null) {
            map.put(str, str2);
        } else {
            qp2.n("Property \"autoMetadata\" has not been set");
        }
    }

    @Override // defpackage.jz4
    public final int c() {
        return ((ysl) this.c).c();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x038f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.yuh r11, defpackage.cka r12) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ala.d(yuh, cka):void");
    }

    public final void e() {
        pt1 pt1Var = (pt1) this.a;
        ConstraintLayout constraintLayout = pt1Var.b;
        boolean z = ((btl) ((pde) this.l).g()).c;
        ConstraintLayout constraintLayout2 = pt1Var.b;
        constraintLayout.setBackgroundColor(z ? f03.G(constraintLayout2.getContext()).getDefaultColor() : f03.t(2130968804, constraintLayout2.getContext(), 2131101243));
    }

    public final jn2 f() {
        String strConcat = ((String) this.a) == null ? " transportName" : "";
        if (((r18) this.c) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.e) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new jn2((String) this.a, (Integer) this.b, (r18) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f, (Integer) this.g, (String) this.h, (byte[]) this.i, (byte[]) this.j, (ArrayList) this.k, (String) this.l);
        }
        qp2.n("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // defpackage.jz4
    public final int g() {
        return ((ysl) this.c).g();
    }

    @Override // defpackage.jz4
    public final int h() {
        return ((ysl) this.c).h();
    }

    public final saj i() {
        saj sajVar = new saj();
        sajVar.a = (ui6) this.a;
        sajVar.b = (ui6) this.b;
        sajVar.c = (ui6) this.c;
        sajVar.d = (ui6) this.d;
        sajVar.e = (zw5) this.e;
        sajVar.f = (zw5) this.f;
        sajVar.g = (zw5) this.g;
        sajVar.h = (zw5) this.h;
        sajVar.i = (qs7) this.i;
        sajVar.j = (qs7) this.j;
        sajVar.k = (qs7) this.k;
        sajVar.l = (qs7) this.l;
        return sajVar;
    }

    @Override // defpackage.jz4
    public final boolean j() {
        return ((ysl) this.c).j();
    }

    public final void k(int i) {
        y0f y0fVar = (y0f) this.e;
        if (i == 0) {
            y0fVar.c(rs0.h);
        } else if (i != 1) {
            y0fVar.getClass();
        } else {
            y0fVar.c(rs0.i);
        }
        r4m r4mVar = (r4m) this.g;
        szb szbVarW = r4mVar.W();
        if (szbVarW == null) {
            return;
        }
        r4mVar.c0(new bu3(r4mVar, szbVarW, i));
    }

    public final lz4 l(ChromiumContent chromiumContent) {
        lz4 lz4Var = (lz4) ((HashMap) this.a).get(chromiumContent);
        if (lz4Var != null) {
            return lz4Var;
        }
        hai.d();
        return null;
    }

    public final void m(float f) {
        this.e = new i3(f);
        this.f = new i3(f);
        this.g = new i3(f);
        this.h = new i3(f);
    }

    @Override // defpackage.jz4
    public final boolean n(ChromiumContent chromiumContent) {
        nz4 nz4Var = l(chromiumContent).a;
        View view = nz4Var.e;
        return (view == null || nz4Var.f == null || view.getParent() != nz4Var.f.J) ? false : true;
    }

    @Override // defpackage.jz4
    public final void o(ChromiumContent chromiumContent) {
        lz4 lz4Var = (lz4) ((HashMap) this.a).remove(chromiumContent);
        ((ysl) this.c).x(chromiumContent);
        g7b g7bVar = lz4Var.b;
        ntn ntnVar = lz4Var.d;
        if (g7bVar.getParent() != null) {
            if (g7bVar.getParent() != null) {
                ((ViewGroup) g7bVar.getParent()).removeView(g7bVar);
                g7bVar.removeOnLayoutChangeListener(g7bVar.b);
            }
            ktn ktnVar = mkh.d;
            tz4 tz4Var = g7bVar.a;
            WebContents webContents = g7bVar.m;
            if (webContents != null) {
                LongSparseArray longSparseArray = GestureListenerManagerImpl.n;
                webContents.X(GestureListenerManagerImpl.class, ktnVar).h(tz4Var);
            }
            g7bVar.m = null;
        }
        g7bVar.s.removeAllViews();
        g7bVar.r.clear();
        chromiumContent.y(lz4Var.c);
        chromiumContent.y(ntnVar);
        ((e9e) this.i).a(ntnVar);
    }

    public final void p(boolean z) {
        n6h[] n6hVarArr = new n6h[0];
        Bundle bundle = null;
        wzg wzgVar = new wzg(bundle, f1c.class, (byte) 4);
        if (z) {
            ArrayList arrayList = new ArrayList();
            int i = new int[]{2131362120}[0];
            if (i != 0 && i != -1) {
                arrayList.add(Integer.valueOf(i));
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                bundle = new Bundle();
                bundle.putIntArray("highlights", CollectionsKt.j0(arrayList));
                bundle.putInt("highlight_scroll_to_view_behavior", 3);
            }
        }
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        new zhj(wzgVar, bundle, 2, 4099, null, false, Arrays.asList(n6hVarArr)).c(((pt1) this.a).b.getContext());
    }

    public final void q(String str, String str2, cka ckaVar) {
        Unit q0iVar;
        try {
            p0i p0iVar = t0i.b;
            ((EsimActivity) this.a).startActivity(new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("https").authority("esimsetup.android.com").appendPath("esim_qrcode_provisioning").appendQueryParameter("carddata", "LPA:1$" + str + "$" + str2).build()));
            q0iVar = Unit.a;
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        s16.m(q0iVar, ckaVar);
    }

    @Override // defpackage.jz4
    public final boolean r(ChromiumContent chromiumContent, boolean z) {
        SelectionPopupControllerImpl selectionPopupControllerImplFromWebContents = SelectionPopupControllerImpl.fromWebContents(l(chromiumContent).a.f.e());
        if (!selectionPopupControllerImplFromWebContents.D) {
            return false;
        }
        if (z) {
            selectionPopupControllerImplFromWebContents.r();
            return true;
        }
        if (!selectionPopupControllerImplFromWebContents.D()) {
            return false;
        }
        selectionPopupControllerImplFromWebContents.hidePopupsAndPreserveSelection();
        return true;
    }

    @Override // defpackage.jz4
    public final void t(boolean z) {
        ((ChromiumContainerView) this.d).a.d(z);
    }

    @Override // defpackage.jz4
    public final void u(ChromiumContent chromiumContent, boolean z) {
        lz4 lz4VarL = l(chromiumContent);
        g7b g7bVar = lz4VarL.b;
        nz4 nz4Var = lz4VarL.a;
        ChromiumContainerView chromiumContainerView = nz4Var.b;
        int i = 0;
        if (nz4Var.g != z) {
            nz4Var.g = z;
            if (z) {
                chromiumContainerView.addView(nz4Var);
                nz4Var.bringToFront();
                chromiumContainerView.b(nz4Var.f);
                nz4Var.setVisibility(0);
                nz4Var.addView(nz4Var.f.J);
            } else {
                nz4Var.setVisibility(8);
                chromiumContainerView.b(null);
                nz4Var.removeView(nz4Var.f.J);
                chromiumContainerView.removeView(nz4Var);
            }
        }
        if (z) {
            ((ysl) this.c).J(chromiumContent);
        } else {
            i = 4;
        }
        g7bVar.setVisibility(i);
        g7bVar.n = !z;
        if (z) {
            g7bVar.bringToFront();
        }
    }
}
