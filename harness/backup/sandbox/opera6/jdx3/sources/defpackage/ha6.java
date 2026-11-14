package defpackage;

import ads_mobile_sdk.sb0;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ads.interactivemedia.v3.impl.ImaSdkSettingsImpl;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import com.google.ads.interactivemedia.v3.internal.zzeg;
import com.google.ads.interactivemedia.v3.internal.zzem;
import com.google.ads.interactivemedia.v3.internal.zzfa;
import com.google.ads.interactivemedia.v3.internal.zzsx;
import com.google.ads.interactivemedia.v3.internal.zztc;
import com.google.ads.interactivemedia.v3.internal.zztd;
import com.google.android.material.chip.ChipGroup;
import com.opera.android.custom_views.StylingImageButton;
import com.opera.android.custom_views.StylingImageCheckableWithText;
import com.opera.android.widget.ThemeableLottieAnimationView;
import com.opera.android.widget.UrlFieldEditText;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class ha6 implements r3b {
    public final Object a;
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
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;

    public ha6(sb0 sb0Var) {
        this.a = sb0Var;
    }

    public ha6(FrameLayout frameLayout, ConstraintLayout constraintLayout, ImageView imageView, UrlFieldEditText urlFieldEditText, StylingImageButton stylingImageButton, StylingImageButton stylingImageButton2, StylingImageButton stylingImageButton3, StylingImageButton stylingImageButton4, StylingImageButton stylingImageButton5, ThemeableLottieAnimationView themeableLottieAnimationView, StylingImageButton stylingImageButton6, StylingImageButton stylingImageButton7, StylingImageCheckableWithText stylingImageCheckableWithText, StylingImageButton stylingImageButton8, RecyclerView recyclerView, View view, ImageView imageView2, StylingImageButton stylingImageButton9, ChipGroup chipGroup) {
        this.a = frameLayout;
        this.b = constraintLayout;
        this.c = imageView;
        this.d = urlFieldEditText;
        this.e = stylingImageButton;
        this.f = stylingImageButton2;
        this.g = stylingImageButton3;
        this.h = stylingImageButton4;
        this.i = stylingImageButton5;
        this.j = themeableLottieAnimationView;
        this.k = stylingImageButton6;
        this.l = stylingImageButton7;
        this.m = stylingImageCheckableWithText;
        this.n = stylingImageButton8;
        this.o = recyclerView;
        this.p = view;
        this.q = imageView2;
        this.r = stylingImageButton9;
        this.s = chipGroup;
    }

    public ha6(ia6 ia6Var, k5o k5oVar) {
        this.a = k5oVar;
        this.b = ie7.a(new ea6(ia6Var, this, 2, (byte) 2));
        this.c = ie7.a(new ea6(ia6Var, this, 1, (byte) 2));
        this.d = ie7.a(new ea6(ia6Var, this, 4, (byte) 2));
        this.q = new nv6();
        this.r = new nv6();
        this.s = new nv6();
        this.e = ie7.a(new ea6(ia6Var, this, 9, (byte) 2));
        nv6.K((nv6) this.s, ie7.a(new ea6(ia6Var, this, 8, (byte) 2)));
        nv6.K((nv6) this.r, ie7.a(new ea6(ia6Var, this, 7, (byte) 2)));
        this.f = ie7.a(new ea6(ia6Var, this, 10, (byte) 2));
        this.g = ie7.a(new ea6(ia6Var, this, 11, (byte) 2));
        this.h = ie7.a(new ea6(ia6Var, this, 6, (byte) 2));
        this.i = ie7.a(new ea6(ia6Var, this, 5, (byte) 2));
        nv6.K((nv6) this.q, ie7.a(new ea6(ia6Var, this, 3, (byte) 2)));
        this.j = ie7.a(new ea6(ia6Var, this, 13, (byte) 2));
        this.k = ie7.a(new ea6(ia6Var, this, 14, (byte) 2));
        this.l = ie7.a(new ea6(ia6Var, this, 12, (byte) 2));
        this.m = ie7.a(new ea6(ia6Var, this, 15, (byte) 2));
        this.n = ie7.a(new ea6(ia6Var, this, 17, (byte) 2));
        this.o = ie7.a(new ea6(ia6Var, this, 16, (byte) 2));
        this.p = ie7.a(new ea6(ia6Var, this, 0, (byte) 2));
    }

    public ha6(mbi mbiVar, Uri uri, ImaSdkSettingsImpl imaSdkSettingsImpl, drp drpVar, ExecutorService executorService) {
        wpp wppVar = new wpp(new plk(new Handler(Looper.getMainLooper()), new WebView(mbiVar), uri), mbiVar, uri, imaSdkSettingsImpl, executorService);
        this.b = zztd.n();
        this.d = new qup(this);
        this.f = new ArrayList(1);
        this.g = new HashMap();
        this.h = new HashMap();
        this.n = new Object();
        this.c = wppVar;
        this.a = mbiVar;
        this.j = imaSdkSettingsImpl;
        this.k = drpVar;
        zzsx zzsxVarA = zztc.a(executorService);
        this.o = zzsxVarA;
        TestingConfiguration testingConfig = imaSdkSettingsImpl.getTestingConfig();
        this.q = testingConfig;
        rqp rqpVar = new rqp(wppVar, mbiVar);
        this.i = rqpVar;
        zzeg zzegVar = new zzeg(wppVar);
        this.p = zzegVar;
        this.e = new n9h(zzegVar);
        wppVar.q = rqpVar;
        if (drpVar.d) {
            qp2.o("A given DisplayContainer may only be used once");
            throw null;
        }
        drpVar.d = true;
        this.l = new zzem(mbiVar, zzsxVarA, zzegVar, testingConfig);
        this.m = new zzfa(mbiVar, zzsxVarA, zzegVar);
    }

    public ha6(w3e w3eVar, t9f t9fVar, il5 il5Var, u3e u3eVar, Context context, v3e v3eVar, v3e v3eVar2, x3e x3eVar, a4e a4eVar, p5e p5eVar, w5e w5eVar, a6e a6eVar, u4i u4iVar, l8e l8eVar, b6e b6eVar, y5e y5eVar, v5e v5eVar, m3i m3iVar) {
        this.a = w3eVar;
        this.b = t9fVar;
        this.c = il5Var;
        this.d = u3eVar;
        this.e = context;
        this.f = v3eVar;
        this.g = v3eVar2;
        this.h = x3eVar;
        this.i = a4eVar;
        this.j = p5eVar;
        this.k = w5eVar;
        this.l = a6eVar;
        this.m = u4iVar;
        this.n = l8eVar;
        this.o = b6eVar;
        this.p = y5eVar;
        this.q = v5eVar;
        this.r = m3iVar;
        this.s = new i5e();
    }

    @Override // defpackage.r3b
    public final v3e A() {
        return (v3e) this.g;
    }

    @Override // defpackage.r3b
    public final mzd D() {
        return (v5e) this.q;
    }

    @Override // defpackage.r3b
    public final i2h G() {
        return (l8e) this.n;
    }

    @Override // defpackage.r3b
    public final u4i H() {
        return (u4i) this.m;
    }

    @Override // defpackage.r3b
    public final i5e I() {
        return (i5e) this.s;
    }

    @Override // defpackage.r3b
    public final v3e J() {
        return (v3e) this.f;
    }

    @Override // defpackage.r3b
    public final ab7 L() {
        return (w3e) this.a;
    }

    @Override // defpackage.r3b
    public final lrh M() {
        return (a6e) this.l;
    }

    @Override // defpackage.r3b
    public final t9f O() {
        return (t9f) this.b;
    }

    @Override // defpackage.r3b
    public final y5e R() {
        return (y5e) this.p;
    }

    @Override // defpackage.r3b
    public final il5 getConfiguration() {
        return (il5) this.c;
    }

    @Override // defpackage.r3b
    public final Context getContext() {
        return (Context) this.e;
    }

    @Override // defpackage.r3b
    public final p5e h() {
        return (p5e) this.j;
    }

    @Override // defpackage.r3b
    public final b6e o() {
        return (b6e) this.o;
    }

    @Override // defpackage.r3b
    public final x3e p() {
        return (x3e) this.h;
    }

    @Override // defpackage.r3b
    public final a4e s() {
        return (a4e) this.i;
    }

    @Override // defpackage.r3b
    public final u3e t() {
        return (u3e) this.d;
    }

    @Override // defpackage.r3b
    public final a2e x() {
        return (w5e) this.k;
    }

    @Override // defpackage.r3b
    public final m3i y() {
        return (m3i) this.r;
    }
}
