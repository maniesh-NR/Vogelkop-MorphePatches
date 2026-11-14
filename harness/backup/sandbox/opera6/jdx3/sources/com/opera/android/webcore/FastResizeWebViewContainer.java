package com.opera.android.webcore;

import J.N;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.opera.android.browser.WebContentsWrapper;
import defpackage.aq8;
import defpackage.bn7;
import defpackage.bq8;
import defpackage.cq8;
import defpackage.d58;
import defpackage.dll;
import defpackage.hjf;
import defpackage.jkc;
import defpackage.jze;
import defpackage.ks6;
import defpackage.kze;
import defpackage.pc5;
import defpackage.q9n;
import defpackage.qwe;
import defpackage.u8n;
import defpackage.ug;
import defpackage.z61;
import kotlin.Metadata;
import org.chromium.content_public.browser.WebContents;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/opera/android/webcore/FastResizeWebViewContainer;", "Landroid/widget/FrameLayout;", "bq8", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FastResizeWebViewContainer extends FrameLayout {
    public static final /* synthetic */ int i = 0;
    public final kze a;
    public WebContentsWrapper b;
    public zll c;
    public qwe d;
    public jze e;
    public final ks6 f;
    public final aq8 g;
    public int h;

    public FastResizeWebViewContainer(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.a = (kze) new z61(this).b;
        this.f = new ks6(this, (byte) 6);
        this.g = new aq8(this, (byte) 0);
    }

    public final void a(zll zllVar, WebContentsWrapper webContentsWrapper, qwe qweVar) {
        this.b = webContentsWrapper;
        this.c = zllVar;
        this.d = qweVar;
        pc5 pc5Var = new pc5((Object) webContentsWrapper, (byte) 13);
        l5b l5bVar = q9n.c;
        dll dllVarV = hjf.v(zllVar.getContext());
        if (dllVarV != null) {
            u8n.b(dllVarV, zllVar, pc5Var);
        }
        int i2 = qweVar.a.a;
        long j = zllVar.a.d;
        if (j != 0) {
            N.MwkfWGl7(j, i2);
        }
        qweVar.b.b(this.g);
        addView(zllVar);
    }

    public final void b() {
        WebContents webContentsF;
        WebContents webContentsF2;
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        jze jzeVar = this.e;
        bq8 bq8Var = jzeVar != null ? (bq8) jzeVar.g() : null;
        int i2 = bq8Var == null ? -1 : cq8.a[bq8Var.ordinal()];
        if (i2 == -1 || i2 == 1) {
            return;
        }
        if (i2 == 2) {
            WebContentsWrapper webContentsWrapper = this.b;
            if (webContentsWrapper == null || (webContentsF = webContentsWrapper.f()) == null) {
                return;
            }
            webContentsF.y0(getWidth(), getHeight());
            return;
        }
        if (i2 != 3) {
            h9o.p();
            return;
        }
        WebContentsWrapper webContentsWrapper2 = this.b;
        if (webContentsWrapper2 == null || (webContentsF2 = webContentsWrapper2.f()) == null) {
            return;
        }
        webContentsF2.y0(getWidth(), Math.max(getHeight(), this.h));
    }

    public final void c(kze kzeVar) {
        d58 d58Var = new d58((byte) 6);
        jze jzeVar = new jze(d58Var.invoke(kzeVar.g()));
        jzeVar.l.s(kzeVar, new ug(new jkc(jzeVar, d58Var, (byte) 0), (byte) 25));
        jze jzeVar2 = this.e;
        ks6 ks6Var = this.f;
        if (jzeVar2 != null) {
            jzeVar2.p(ks6Var);
        }
        this.e = jzeVar;
        a26.T(jzeVar, this.a, ks6Var);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        post(new bn7(this, i3, (byte) 18));
    }
}
