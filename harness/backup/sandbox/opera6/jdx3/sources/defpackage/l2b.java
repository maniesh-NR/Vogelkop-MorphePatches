package defpackage;

import J.N;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.OperaApplication;
import com.opera.android.browser.WebContentsWrapper;
import com.opera.android.browser.chromium.ChromiumContent;
import com.opera.android.browser.external.ExternalAppService;
import com.opera.android.widget.ThemeableLottieAnimationView;
import java.io.File;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.components.embedder_support.view.ContentViewRenderView;
import org.chromium.content.browser.selection.SelectionPopupControllerImpl;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public abstract class l2b extends FullscreenWebActivity {
    public k2b J;
    public yl8 M;
    public j3b N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public ChromiumContent R;
    public View S;
    public View T;
    public x5f U;
    public x5f V;
    public boolean X;
    public String Y;
    public final q65 Z;
    public final cv3 K = new cv3(this, 2);
    public final qe6 L = new qe6(this, 19);
    public final StringBuilder W = new StringBuilder();

    public l2b() {
        hv5 hv5Var = w2b.b;
        this.Y = "deeplink";
        this.Z = new q65(this, (byte) 3);
    }

    public final void B0() {
        this.Z.S();
    }

    public void C0(File file) {
    }

    public void D0() {
        j3b j3bVar = new j3b(this, this.a);
        this.N = j3bVar;
        ((MaterialButton) j3bVar.b.e).setOnClickListener(new sma(this, (byte) 3));
    }

    public void E0(int i) {
        M0();
        B0();
        j3b j3bVar = this.N;
        if (j3bVar != null) {
            ((ThemeableLottieAnimationView) j3bVar.b.d).q();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void F0() {
        setTitle("Google Takeout");
    }

    public void G0() {
        r0(0, "https://takeout.google.com");
    }

    public void H0() {
    }

    public void I0() {
    }

    public void J0() {
    }

    public abstract void K0();

    public final void L0(v2b v2bVar, long j) {
        boolean z;
        x5f x5fVar;
        int iOrdinal = v2bVar.ordinal();
        eb0 eb0Var = eb0.d;
        eb0 eb0Var2 = eb0.b;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                h9o.p();
                return;
            }
            z = j > 0;
            if (z) {
                x5f x5fVar2 = this.U;
                if (x5fVar2 == null) {
                    x5fVar2 = null;
                }
                x5fVar2.S(19);
            }
            x5f x5fVar3 = this.V;
            if (x5fVar3 == null) {
                x5fVar3 = null;
            }
            x5fVar3.m0(z);
            x5f x5fVar4 = this.U;
            if (x5fVar4 == null) {
                x5fVar4 = null;
            }
            x5fVar4.l0(z ? gm0.j : gm0.k);
            x5f x5fVar5 = this.U;
            x5fVar = x5fVar5 != null ? x5fVar5 : null;
            hv5 hv5Var = w2b.b;
            String str = this.Y;
            hv5Var.getClass();
            w2b w2bVarI = hv5.I(str);
            c3b c3bVar = c3b.FROM_CHROME;
            v2b v2bVar2 = v2b.PASSWORDS;
            if (z) {
                eb0Var = eb0Var2;
            }
            x5fVar.I(w2bVarI, c3bVar, v2bVar2, eb0Var);
            return;
        }
        z = j > 0;
        if (z) {
            x5f x5fVar6 = this.U;
            if (x5fVar6 == null) {
                x5fVar6 = null;
            }
            x5fVar6.S(16);
        }
        x5f x5fVar7 = this.V;
        if (x5fVar7 == null) {
            x5fVar7 = null;
        }
        zpa zpaVar = x5fVar7.d;
        x56 x56VarF = zpa.F();
        x56VarF.N(zpaVar).r(5, 1, z);
        x5fVar7.U0(x56VarF);
        x5f x5fVar8 = this.U;
        if (x5fVar8 == null) {
            x5fVar8 = null;
        }
        x5fVar8.X(z ? z80.g : z80.h);
        x5f x5fVar9 = this.U;
        x5fVar = x5fVar9 != null ? x5fVar9 : null;
        hv5 hv5Var2 = w2b.b;
        String str2 = this.Y;
        hv5Var2.getClass();
        w2b w2bVarI2 = hv5.I(str2);
        c3b c3bVar2 = c3b.FROM_CHROME;
        v2b v2bVar3 = v2b.BOOKMARKS;
        if (z) {
            eb0Var = eb0Var2;
        }
        x5fVar.I(w2bVarI2, c3bVar2, v2bVar3, eb0Var);
    }

    public final void M0() {
        this.Q = false;
        this.P = false;
        this.O = false;
        yl8 yl8Var = this.M;
        if (yl8Var != null) {
            yl8Var.b(yl8Var.d);
        }
        this.M = null;
    }

    public void N0(re7 re7Var) {
        new cx3(this, re7Var, (byte) 2);
    }

    public final void O0() {
        int i;
        umi umiVar = vml.d;
        if (this.X) {
            on7 on7Var = pn7.b;
            i = 2;
        } else {
            on7 on7Var2 = pn7.b;
            i = 1;
        }
        this.Z.B0(umiVar, pn7.f(cs5.x0(i, un7.f)), TimeUnit.MILLISECONDS);
    }

    public void P0() {
        Q0();
        this.O = true;
        j3b j3bVar = this.N;
        if (j3bVar != null) {
            j3bVar.setVisibility(0);
            ((ThemeableLottieAnimationView) j3bVar.b.d).h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q0() {
        if (this.M != null) {
            return;
        }
        boolean z = ExternalAppService.b;
        sxh sxhVar = new sxh(2132020070, new Object[]{getString(2132017591)});
        Intent intent = new Intent(getIntent());
        intent.setFlags(268435456);
        yl8 yl8Var = new yl8(this, PendingIntent.getActivity(this, 0, intent, 201326592), getLifecycle(), sxhVar);
        if (getLifecycle().i.d(qcc.e) && !ExternalAppService.b) {
            yl8Var.a(yl8Var.e);
        }
        this.M = yl8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.android.FullscreenWebActivity
    public final WebContentsWrapper f0(qi qiVar, WebContents webContents) {
        ChromiumContent chromiumContent = new ChromiumContent(this.L, qiVar, webContents, false, false, 0);
        vk2 vk2Var = new vk2((byte) 7);
        x5f x5fVar = this.U;
        qy4 qy4Var = new qy4(0, vk2Var, chromiumContent, x5fVar != null ? x5fVar : null, ru9.c(this));
        rbe rbeVar = new rbe((byte) 25);
        qii qiiVar = new qii();
        byte b = 20;
        qp2 qp2Var = new qp2((byte) 20);
        x5f x5fVar2 = this.U;
        chromiumContent.t(qy4Var, rbeVar, qp2Var, null, null, x5fVar2 != null ? x5fVar2 : null, O(), null, null, qiiVar);
        chromiumContent.p = new oz4((byte) 1);
        SelectionPopupControllerImpl selectionPopupControllerImplFromWebContents = SelectionPopupControllerImpl.fromWebContents(chromiumContent.e());
        selectionPopupControllerImplFromWebContents.getClass();
        yw3 yw3Var = new yw3(this);
        String[] strArr = OperaApplication.K;
        q6e q6eVarI = ((OperaApplication) getApplication()).I();
        x5f x5fVar3 = this.U;
        selectionPopupControllerImplFromWebContents.f = new ue(this, selectionPopupControllerImplFromWebContents, yw3Var, rbeVar, q6eVarI, x5fVar3 != null ? x5fVar3 : null, qiiVar, te.Bo);
        chromiumContent.m = new ga6(this, b);
        return chromiumContent;
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final void g0(WebContentsWrapper webContentsWrapper) {
        if (Intrinsics.a(this.R, webContentsWrapper)) {
            this.R = null;
        }
        ChromiumContent chromiumContent = (ChromiumContent) webContentsWrapper;
        chromiumContent.s();
        chromiumContent.l();
    }

    @Override // com.opera.android.FullscreenWebActivity, defpackage.dx3, defpackage.hjf
    public final void onDestroy() {
        k2b k2bVar = this.J;
        if (k2bVar != null) {
            k2bVar.c((WebContents) null);
        }
        b0(this.K);
        N.MDvRMRe9(false);
        M0();
        super.onDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hjf
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if (this.O) {
            this.O = false;
            yl8 yl8Var = this.M;
            if (yl8Var != null) {
                yl8Var.b(yl8Var.d);
            }
            this.M = null;
        }
        j3b j3bVar = this.N;
        if (j3bVar != null) {
            ((ThemeableLottieAnimationView) j3bVar.b.d).q();
            j3bVar.setVisibility(8);
        }
        p0();
    }

    public final void onPause() {
        super/*androidx.fragment.app.r*/.onPause();
        this.W.append('P');
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        qimVar.p = true;
        qimVar.b.h++;
    }

    public final void onResume() {
        super/*androidx.fragment.app.r*/.onResume();
        this.W.append('R');
        qim qimVar = this.o;
        Objects.requireNonNull(qimVar);
        qimVar.i(true);
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final void onStart() {
        super.onStart();
        this.W.append('s');
        ChromiumContent chromiumContent = this.R;
        if (chromiumContent != null) {
            chromiumContent.B();
        }
    }

    @Override // com.opera.android.FullscreenWebActivity, defpackage.dx3
    public final void onStop() {
        super.onStop();
        this.W.append('S');
        ChromiumContent chromiumContent = this.R;
        if (chromiumContent != null) {
            chromiumContent.s();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.android.FullscreenWebActivity
    public void p0() {
        String string;
        if (this.Q) {
            return;
        }
        super.p0();
        this.Q = true;
        Bundle extras = getIntent().getExtras();
        if (extras == null || (string = extras.getString("extra_import_entry_point")) == null) {
            return;
        }
        this.Y = string;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.android.FullscreenWebActivity
    public final void u0(View view) {
        D0();
        WeakHashMap weakHashMap = r5n.a;
        this.S = (View) m5n.f(view, 2131363061);
        this.T = (View) m5n.f(view, 2131364798);
        String[] strArr = OperaApplication.K;
        this.U = ((OperaApplication) getApplication()).L().c;
        this.V = ((OperaApplication) getApplication()).L().d;
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final void v0() {
        super.v0();
        N.MDvRMRe9(true);
        this.J = new k2b(this, this.v.e());
        Y(this.K);
        ContentViewRenderView contentViewRenderView = this.u;
        if (contentViewRenderView != null) {
            contentViewRenderView.addView(this.N);
        } else {
            h9o.e();
        }
    }

    @Override // com.opera.android.FullscreenWebActivity
    public final void x0(WebContentsWrapper webContentsWrapper) {
        ChromiumContent chromiumContent = this.R;
        if (chromiumContent != null) {
            chromiumContent.z(false);
        }
        super.x0(webContentsWrapper);
        ChromiumContent chromiumContent2 = (ChromiumContent) webContentsWrapper;
        this.R = chromiumContent2;
        if (chromiumContent2 != null) {
            chromiumContent2.z(true);
        }
    }
}
