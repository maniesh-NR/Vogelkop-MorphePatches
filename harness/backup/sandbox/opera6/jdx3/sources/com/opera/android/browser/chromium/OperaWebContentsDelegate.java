package com.opera.android.browser.chromium;

import J.N;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.browser.SecurityInfo;
import com.opera.android.media.MediaCaptureNotificationService;
import com.opera.android.webapps.WebappActivity;
import defpackage.g7f;
import defpackage.h7f;
import defpackage.hwi;
import defpackage.iz4;
import defpackage.mdb;
import defpackage.qp2;
import defpackage.qtn;
import defpackage.qwi;
import defpackage.ype;
import org.chromium.base.ApplicationStatus;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.EventForwarder;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.url.GURL;

/* loaded from: classes.dex */
public final class OperaWebContentsDelegate extends qtn {
    public final ChromiumContent b;
    public final ype c;
    public String d;
    public boolean e;

    public OperaWebContentsDelegate(ChromiumContent chromiumContent, ype ypeVar, qp2 qp2Var) {
        this.c = ypeVar;
        this.b = chromiumContent;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void activateContents() {
        Intent intent;
        ChromiumContent chromiumContent = this.b;
        chromiumContent.m.d();
        fp1 fp1VarC = chromiumContent.c();
        if (ApplicationStatus.b(fp1VarC) == 5) {
            if (fp1VarC instanceof WebappActivity) {
                intent = fp1VarC.getIntent();
            } else {
                Intent intentB = mdb.b(fp1VarC);
                intentB.setAction("com.opera.android.action.ACTIVATE_TAB");
                intentB.putExtra("tabId", chromiumContent.i);
                intent = intentB;
            }
            fp1VarC.startActivity(intent);
        }
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void closeContents() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.b.m.close();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void contentsZoomChange(boolean z) {
        float f = z ? 1.25f : 0.8f;
        long jUptimeMillis = SystemClock.uptimeMillis();
        EventForwarder eventForwarderD1 = this.b.e().d1();
        long j = eventForwarderD1.h;
        if (j != 0) {
            N.MtyC4Bd2(j, 12, jUptimeMillis, 0.0f);
        }
        long j2 = eventForwarderD1.h;
        if (j2 != 0) {
            N.MtyC4Bd2(j2, 13, jUptimeMillis, f);
        }
        long j3 = eventForwarderD1.h;
        if (j3 == 0) {
            return;
        }
        N.MtyC4Bd2(j3, 14, jUptimeMillis, 0.0f);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final boolean controlsResizeView() {
        return this.b.o.j();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void enterFullscreenModeForTab(RenderFrameHost renderFrameHost, boolean z, boolean z2, long j) {
        ChromiumContent chromiumContent = this.b;
        h7f h7fVar = chromiumContent.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).r(chromiumContent, z);
        }
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void exitFullscreenModeForTab() {
        ChromiumContent chromiumContent = this.b;
        h7f h7fVar = chromiumContent.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).s(chromiumContent);
        }
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final int getBottomControlsHeight() {
        return this.b.o.g();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final int getBottomControlsMinHeight() {
        return this.b.o.c();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final int getTopControlsHeight() {
        return this.b.o.h();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final int getTopControlsMinHeight() {
        return this.b.o.a();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final int getVirtualKeyboardHeight() {
        ChromiumContent chromiumContent = this.b;
        fp1 fp1VarC = chromiumContent.c();
        if (fp1VarC == null) {
            return 0;
        }
        View rootView = fp1VarC.getWindow().getDecorView().getRootView();
        qi qiVar = chromiumContent.b;
        if (qiVar == null) {
            return 0;
        }
        ((WindowAndroid) qiVar).b.getClass();
        return j14.o(rootView);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final boolean isFullscreenForTabOrPending() {
        return this.b.c().S().a.p();
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void loadingStateChanged(boolean z) {
        this.b.H.c = z;
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void navigationStateChanged(int i) {
        int i2 = i & 2;
        ChromiumContent chromiumContent = this.b;
        if (i2 != 0) {
            int i3 = 0;
            boolean z = chromiumContent.u() && N.MCn_w1lD(chromiumContent.e());
            boolean z2 = chromiumContent.u() && N.Ms95kDda(chromiumContent.e());
            boolean z3 = chromiumContent.u() && N.MPTM5WWo(chromiumContent.e());
            int i4 = MediaCaptureNotificationService.e;
            if (z3) {
                i3 = 4;
            } else if (z) {
                i3 = z2 ? 1 : 3;
            } else if (z2) {
                i3 = 2;
            }
            MediaCaptureNotificationService.b(chromiumContent.c(), chromiumContent.i, i3, chromiumContent.r());
        }
        h7f h7fVar = chromiumContent.C;
        if ((i & 8) != 0) {
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((iz4) g7fVarH.next()).C(chromiumContent);
            }
        }
        if ((i & 1) != 0) {
            g7f g7fVarH2 = am2.h(h7fVar, h7fVar);
            while (g7fVarH2.hasNext()) {
                ((iz4) g7fVarH2.next()).getClass();
            }
        }
        String strR = chromiumContent.r();
        if (strR == null || strR.equals(this.d)) {
            return;
        }
        this.d = strR;
        g7f g7fVarH3 = am2.h(h7fVar, h7fVar);
        while (g7fVarH3.hasNext()) {
            ((iz4) g7fVarH3.next()).E();
        }
    }

    public final void onFileSelected(@NonNull String str, @NonNull String str2, long j) {
        if (this.b.h()) {
            N.MB_oX76V(str, str2, j);
        } else {
            N.MB_oX76V((Object) null, (Object) null, j);
        }
    }

    public final void onWebContentsCreated(@Nullable WebContents webContents, long j, @NonNull String str, @NonNull GURL gurl, @Nullable WebContents webContents2) {
        h7f h7fVar = this.b.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).I(webContents, webContents2);
        }
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void rendererResponsive() {
        h7f h7fVar = this.b.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).getClass();
        }
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void rendererUnresponsive() {
        h7f h7fVar = this.b.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).B();
        }
    }

    public final void setOverlayMode(boolean z) {
        this.b.o.t(z);
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final boolean shouldCreateWebContents(GURL gurl) {
        ype ypeVar = this.c;
        return !(ypeVar != null && ypeVar.a(gurl));
    }

    @Override // org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid
    public final void visibleSSLStateChanged() {
        ChromiumContent chromiumContent = this.b;
        h7f h7fVar = chromiumContent.C;
        g7f g7fVarH = am2.h(h7fVar, h7fVar);
        while (g7fVarH.hasNext()) {
            ((iz4) g7fVarH.next()).H(chromiumContent, new qwi(chromiumContent.o(), new hwi((SecurityInfo) N.MCHF1Vfr(chromiumContent.n))));
        }
    }
}
