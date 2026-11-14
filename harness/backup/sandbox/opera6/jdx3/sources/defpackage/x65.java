package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.opera.android.ui.catalog.widget.OperaMaterialButton;
import com.usercentrics.sdk.BannerFont;
import com.usercentrics.sdk.BannerInitCustomization;
import com.usercentrics.sdk.BannerSettings;
import com.usercentrics.sdk.ButtonLayout;
import com.usercentrics.sdk.ButtonSettings;
import com.usercentrics.sdk.ButtonType;
import com.usercentrics.sdk.FirstLayerStyleSettings;
import com.usercentrics.sdk.GeneralStyleSettings;
import com.usercentrics.sdk.HeaderImageSettings;
import com.usercentrics.sdk.LegalLinksSettings;
import com.usercentrics.sdk.SecondLayerStyleSettings;
import com.usercentrics.sdk.SectionAlignment;
import com.usercentrics.sdk.ToggleStyleSettings;
import com.usercentrics.sdk.UsercentricsBanner;
import com.usercentrics.sdk.UsercentricsDialog;
import com.usercentrics.sdk.UsercentricsImage;
import com.usercentrics.sdk.UsercentricsLayout;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class x65 extends ryl implements ViewTreeObserver.OnWindowFocusChangeListener, ValueAnimator.AnimatorUpdateListener, cll {
    public static final long F;
    public Runnable A;
    public boolean B;
    public boolean C;
    public boolean E;
    public final umi c;
    public final r65 d;
    public final dll e;
    public final Function1 f;
    public final Function0 g;
    public final boolean h;
    public p10 i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public FrameLayout t;
    public i3j u;
    public UsercentricsBanner v;
    public View w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final pde o = new pde(null);
    public final z61 p = new z61(this, 4);
    public final ay q = new ay((Object) this, (byte) 3);
    public final q65 r = new q65(this, (byte) 1);
    public final Handler s = new Handler(Looper.getMainLooper());
    public yim D = yim.a;

    static {
        on7 on7Var = pn7.b;
        F = cs5.x0(15, un7.e);
    }

    public x65(umi umiVar, r65 r65Var, dll dllVar, Function1 function1, Function0 function0, boolean z, p10 p10Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        rn9 rn9Var;
        this.c = umiVar;
        this.d = r65Var;
        this.e = dllVar;
        this.f = function1;
        this.g = function0;
        this.h = z;
        this.i = p10Var;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        byte b = 0;
        this.E = this.i != null;
        s65 s65Var = new s65(this, b);
        if (!r65Var.l(z4)) {
            s65Var.run(Boolean.FALSE);
            return;
        }
        rn9 rn9Var2 = r65Var.r;
        if (rn9Var2 != null) {
            rn9Var2.r(false);
        }
        r65Var.r = new rn9(r65Var, z4, s65Var);
        if (!r65Var.c() || (rn9Var = r65Var.r) == null) {
            return;
        }
        rn9Var.r(true);
    }

    @Override // defpackage.cll
    public final void K() {
        UsercentricsBanner usercentricsBanner = this.v;
        if (usercentricsBanner != null) {
            usercentricsBanner.dismiss();
            this.v = null;
            m0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017c A[PHI: r10
      0x017c: PHI (r10v1 int) = (r10v0 int), (r10v2 int) binds: [B:39:0x00cb, B:41:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k0() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x65.k0():void");
    }

    public final void l0() {
        if (this.z && isAdded() && !isRemoving()) {
            Runnable runnable = this.A;
            if (runnable != null && (this.i != null || this.w != null)) {
                this.A = null;
                runnable.run();
                return;
            }
            if (this.i != null && this.B && this.E) {
                FrameLayout frameLayout = this.t;
                View view = this.w;
                i3j i3jVar = this.u;
                ConstraintLayout constraintLayout = i3jVar != null ? (ConstraintLayout) i3jVar.a : null;
                if (frameLayout == null || view == null || constraintLayout == null) {
                    return;
                }
                this.E = false;
                ye1.b(frameLayout, constraintLayout, null, false, false);
                ye1.b(frameLayout, view, null, true, false);
            }
        }
    }

    public final void m0() {
        if (this.x && this.z) {
            if (this.i == null || this.B) {
                Context contextRequireContext = requireContext();
                Context contextRequireContext2 = requireContext();
                h61 h61Var = new h61(contextRequireContext2, false);
                int iB = h61Var.b(2130969300);
                BannerFont bannerFont = new BannerFont(contextRequireContext2, w23.b(2132083308, contextRequireContext2), w23.a(2132083308, contextRequireContext2));
                int iB2 = h61Var.b(2130969325);
                int iB3 = h61Var.b(2130969325);
                int iB4 = h61Var.b(2130969303);
                Drawable drawableX = f03.x(2130970199, contextRequireContext2);
                UsercentricsImage.ImageDrawable imageDrawable = drawableX != null ? new UsercentricsImage.ImageDrawable(drawableX) : null;
                int iB5 = h61Var.b(2130969325);
                int iB6 = h61Var.b(2130969303);
                GeneralStyleSettings generalStyleSettings = new GeneralStyleSettings(Integer.valueOf(h61Var.b(2130969284)), Integer.valueOf(iB2), Integer.valueOf(iB3), Integer.valueOf(iB4), Integer.valueOf(iB6), Integer.valueOf(iB), new ToggleStyleSettings(Integer.valueOf(h61Var.b(2130969315)), Integer.valueOf(h61Var.b(2130969330)), Integer.valueOf(h61Var.b(2130969286)), Integer.valueOf(h61Var.b(2130969303)), Integer.valueOf(h61Var.b(2130969288)), Integer.valueOf(h61Var.b(2130969327))), bannerFont, imageDrawable, (LegalLinksSettings) null, Boolean.valueOf(this.k), Integer.valueOf(iB5), (Boolean) null, 4608, (DefaultConstructorMarker) null);
                int iB7 = h61Var.b(2130969325);
                ButtonSettings buttonSettings = new ButtonSettings(ButtonType.MORE, (Typeface) null, (Float) null, Integer.valueOf(h61Var.b(2130969279)), Integer.valueOf(h61Var.b(2130969315)), (Integer) null, (Boolean) null, 102, (DefaultConstructorMarker) null);
                ButtonType buttonType = ButtonType.ACCEPT_ALL;
                ButtonLayout.Row row = new ButtonLayout.Row(Arrays.asList(buttonSettings, new ButtonSettings(buttonType, (Typeface) null, (Float) null, Integer.valueOf(h61Var.b(2130969273)), Integer.valueOf(h61Var.b(2130969303)), (Integer) null, (Boolean) null, 102, (DefaultConstructorMarker) null)));
                SectionAlignment sectionAlignment = SectionAlignment.START;
                UsercentricsBanner usercentricsBanner = new UsercentricsBanner(contextRequireContext, new BannerSettings(generalStyleSettings, new FirstLayerStyleSettings((UsercentricsLayout) null, (HeaderImageSettings) null, new uql(w23.b(2132083327, contextRequireContext2), Float.valueOf(w23.a(2132083327, contextRequireContext2)), sectionAlignment, Integer.valueOf(h61Var.b(2130969284))), new vwd(w23.b(2132083308, contextRequireContext2), Float.valueOf(w23.a(2132083308, contextRequireContext2)), sectionAlignment, Integer.valueOf(h61Var.b(2130969288)), Integer.valueOf(h61Var.b(2130969303)), Boolean.valueOf(f03.V(2130971218, contextRequireContext2))), row, Integer.valueOf(iB7), (Integer) null, (Integer) null, 195, (DefaultConstructorMarker) null), new SecondLayerStyleSettings(new ButtonLayout.Grid(Arrays.asList(Arrays.asList(new ButtonSettings(ButtonType.DENY_ALL, (Typeface) null, (Float) null, Integer.valueOf(h61Var.b(2130969279)), Integer.valueOf(h61Var.b(2130969315)), (Integer) null, (Boolean) null, 102, (DefaultConstructorMarker) null), new ButtonSettings(buttonType, (Typeface) null, (Float) null, Integer.valueOf(h61Var.b(2130969273)), Integer.valueOf(h61Var.b(2130969303)), (Integer) null, (Boolean) null, 102, (DefaultConstructorMarker) null)), Collections.singletonList(new ButtonSettings(ButtonType.SAVE, (Typeface) null, (Float) null, Integer.valueOf(h61Var.b(2130969279)), Integer.valueOf(h61Var.b(2130969315)), (Integer) null, (Boolean) null, 102, (DefaultConstructorMarker) null)))), Boolean.valueOf(this.j)), (String) null, (BannerInitCustomization) null, 24, (DefaultConstructorMarker) null));
                this.v = usercentricsBanner;
                this.r.B0(this.c, pn7.f(F), TimeUnit.MILLISECONDS);
                if (this.h) {
                    usercentricsBanner.showFirstLayer(new r2(1, this, x65.class, "onUserResponse", "onUserResponse(Lcom/usercentrics/sdk/UsercentricsConsentUserResponse;)V", 0, (byte) 22));
                } else {
                    usercentricsBanner.showSecondLayer(new r2(1, this, x65.class, "onUserResponse", "onUserResponse(Lcom/usercentrics/sdk/UsercentricsConsentUserResponse;)V", 0, (byte) 23));
                }
            }
        }
    }

    public final void n0(yim yimVar) {
        if (this.D == yim.a) {
            this.D = yimVar;
            this.v = null;
            this.e.H(this);
            yim yimVar2 = yim.d;
            ay ayVar = this.q;
            if (yimVar == yimVar2) {
                jh jhVar = ((p65) ayVar.get()).a;
                orm ormVar = (orm) ((wv1) jhVar.c).b.get();
                ((x5f) ormVar).E(vb0.c, jhVar.a);
                jhVar.b = false;
            } else if (yimVar == yim.e) {
                ((x5f) ((orm) ((wv1) ((p65) ayVar.get()).a.c).b.get())).R(5, null);
            }
            r65 r65Var = this.d;
            r65Var.t = yimVar;
            if (yimVar == yimVar2) {
                long j = r65.x;
                nv6 nv6VarB = r65Var.h.b();
                ((SharedPreferences.Editor) nv6VarB.a).putLong("cmp_consent_may_show_after_timestamp", System.currentTimeMillis() + j);
                nv6VarB.w();
                r65Var.f();
            }
            Function0 function0 = this.g;
            if (function0 != null) {
                function0.invoke();
            }
            if (this.n) {
                g0();
            }
        }
    }

    public final void o0(boolean z) {
        Function1 function1 = this.f;
        if (function1 != null) {
            function1.invoke(z ? u65.d : u65.e);
        }
        this.o.r(v65.b);
        this.B = true;
        q0(z);
        if (z) {
            n0(yim.d);
            return;
        }
        jh jhVar = ((p65) this.q.get()).a;
        ((x5f) ((orm) ((wv1) jhVar.c).b.get())).E(vb0.b, jhVar.a);
        jhVar.b = false;
        m0();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = this.w;
        if (view != null) {
            view.setTranslationX(requireView().getTranslationX());
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super/*androidx.fragment.app.Fragment*/.onConfigurationChanged(configuration);
        this.A = null;
        if (this.i == null && this.w == null) {
            this.i = this.m ? new s59(((d75) this.d.b.get()).f) : new b1i();
            this.B = true;
        }
        k0();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.addOnAttachStateChangeListener(this.p);
        this.t = frameLayout;
        yq4 yq4Var = new yq4((byte) 10);
        WeakHashMap weakHashMap = r5n.a;
        h5n.c(frameLayout, yq4Var);
        k0();
        return frameLayout;
    }

    @Override // defpackage.ryl
    public final void onDestroy() {
        super.onDestroy();
        this.C = true;
    }

    public final void onStart() {
        super.onStart();
        if (this.y) {
            this.s.post(new lb4(this, (byte) 19));
        }
    }

    public final void onStop() {
        if (this.i != null && !this.B) {
            jh jhVar = ((p65) this.q.get()).a;
            if (jhVar.b) {
                orm ormVar = (orm) ((wv1) jhVar.c).b.get();
                ((x5f) ormVar).E(vb0.d, jhVar.a);
                jhVar.b = false;
            }
        }
        super.onStop();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        View viewR0;
        if (z || (viewR0 = r0()) == null) {
            return;
        }
        this.r.S();
        this.w = viewR0;
        l0();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p0(com.usercentrics.sdk.UsercentricsConsentUserResponse r20) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x65.p0(com.usercentrics.sdk.UsercentricsConsentUserResponse):void");
    }

    public final void q0(boolean z) {
        i3j i3jVar = this.u;
        if (i3jVar != null) {
            ((OperaMaterialButton) i3jVar.c).setOnClickListener(null);
        }
        i3j i3jVar2 = this.u;
        if (i3jVar2 != null) {
            ((OperaMaterialButton) i3jVar2.c).R(z);
        }
        i3j i3jVar3 = this.u;
        if (i3jVar3 != null) {
            ((OperaMaterialButton) i3jVar3.c).setVisibility(z ? 0 : 8);
        }
        i3j i3jVar4 = this.u;
        if (i3jVar4 != null) {
            ((OperaMaterialButton) i3jVar4.b).setOnClickListener(null);
        }
        i3j i3jVar5 = this.u;
        if (i3jVar5 != null) {
            ((OperaMaterialButton) i3jVar5.b).R(!z);
        }
        i3j i3jVar6 = this.u;
        if (i3jVar6 != null) {
            ((OperaMaterialButton) i3jVar6.b).setEnabled(!z);
        }
    }

    public final View r0() {
        Field declaredField;
        Window window;
        if (this.v != null && (declaredField = UsercentricsBanner.class.getDeclaredField("dialog")) != null) {
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this.v);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = UsercentricsDialog.class.getDeclaredField("alertDialog");
            declaredField2.setAccessible(true);
            bz0 bz0Var = (bz0) declaredField2.get(obj);
            if (bz0Var != null && (window = bz0Var.getWindow()) != null) {
                return (View) window.findViewById(getResources().getIdentifier("ucBannerContainer", "id", requireActivity().getPackageName())).getParent();
            }
        }
        return null;
    }
}
