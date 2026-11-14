package com.opera.android.settings;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.opera.android.custom_views.StylingTextView;
import com.opera.android.settings.BigSwitchButton;
import com.opera.android.widget.ThemeableLottieAnimationView;
import defpackage.dll;
import defpackage.fan;
import defpackage.fv2;
import defpackage.i3d;
import defpackage.k2d;
import defpackage.pxh;
import defpackage.q9n;
import defpackage.se3;
import defpackage.u7;
import defpackage.u8n;
import defpackage.uf9;
import defpackage.vs;

/* loaded from: classes.dex */
public class BigSwitchButton extends LinearLayout {
    public static final k2d j = new k2d(0, 39, 0);
    public static final k2d k = new k2d(40, 99, 0);
    public static final k2d l = new k2d(70, 99, -1);
    public static final k2d m = new k2d(130, 163, 0);
    public static final k2d n = new k2d(163, 163, 0);
    public static final k2d o = new k2d(164, 180, 0);
    public static final k2d p = new k2d(180, 180, 0);
    public static final k2d q = new k2d(180, 180, 0);
    public final vs a;
    public final se3 b;
    public byte c;
    public int d;
    public int e;
    public byte f;
    public byte g;
    public byte h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BigSwitchButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        final byte b = 0;
        this.b = new se3(this, b);
        this.c = (byte) 0;
        this.d = 2130968791;
        this.e = 2130968793;
        final byte b2 = 1;
        setOrientation(1);
        LayoutInflater.from(context).inflate(2131558546, this);
        int i = 2131363092;
        yq1 yq1Var = (StylingTextView) w1h.j(2131363092, this);
        if (yq1Var != null) {
            i = 2131362594;
            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) w1h.j(2131362594, this);
            if (themeableLottieAnimationView != null) {
                i = 2131363296;
                StylingTextView stylingTextView = (StylingTextView) w1h.j(2131363296, this);
                if (stylingTextView != null) {
                    this.a = new vs((ViewGroup) this, (View) yq1Var, (Object) themeableLottieAnimationView, (Object) stylingTextView, (byte) 6);
                    themeableLottieAnimationView.t(p, null);
                    PointF pointF = k3d.a;
                    final byte b3 = 2;
                    themeableLottieAnimationView.z(new i3d(2130969091, 1, "ThemeColor", false), new i3d(2130969091, 2, "ThemeStroke", false), new i3d(2130968787, 1, "DarkLightElev04Inv", false), new i3d(2130968788, 1, "DarkLightMedium", false), new i3d(2130968788, 2, "DarkLightMediumStroke", false));
                    themeableLottieAnimationView.v(new dvb(new String[]{"**", "ThemeColor", "**"}), 4, new ykj(this) { // from class: re3
                        public final /* synthetic */ BigSwitchButton b;

                        {
                            this.b = this;
                        }

                        public final Object k(g3d g3dVar) {
                            byte b4 = b;
                            BigSwitchButton bigSwitchButton = this.b;
                            switch (b4) {
                                case 0:
                                    k2d k2dVar = BigSwitchButton.j;
                                    return Integer.valueOf(bigSwitchButton.h);
                                case 1:
                                    k2d k2dVar2 = BigSwitchButton.j;
                                    return Integer.valueOf(bigSwitchButton.h);
                                case 2:
                                    k2d k2dVar3 = BigSwitchButton.j;
                                    return Integer.valueOf(bigSwitchButton.f);
                                default:
                                    k2d k2dVar4 = BigSwitchButton.j;
                                    return Integer.valueOf(bigSwitchButton.g);
                            }
                        }
                    });
                    themeableLottieAnimationView.v(new dvb(new String[]{"**", "ThemeStroke", "**"}), 4, new ykj(this) { // from class: re3
                        public final /* synthetic */ BigSwitchButton b;

                        {
                            this.b = this;
                        }

                        public final Object k(g3d g3dVar) {
                            byte b4 = b2;
                            BigSwitchButton bigSwitchButton = this.b;
                            switch (b4) {
                                case 0:
                                    k2d k2dVar = BigSwitchButton.j;
                                    return Integer.valueOf(bigSwitchButton.h);
                                case 1:
                                    k2d k2dVar2 = BigSwitchButton.j;
                                    return Integer.valueOf(bigSwitchButton.h);
                                case 2:
                                    k2d k2dVar3 = BigSwitchButton.j;
                                    return Integer.valueOf(bigSwitchButton.f);
                                default:
                                    k2d k2dVar4 = BigSwitchButton.j;
                                    return Integer.valueOf(bigSwitchButton.g);
                            }
                        }
                    });
                    themeableLottieAnimationView.v(new dvb(new String[]{"**", "GradientLight", "**"}), 4, new ykj(this) { // from class: re3
                        public final /* synthetic */ BigSwitchButton b;

                        {
                            this.b = this;
                        }

                        public final Object k(g3d g3dVar) {
                            byte b4 = b3;
                            BigSwitchButton bigSwitchButton = this.b;
                            switch (b4) {
                                case 0:
                                    k2d k2dVar = BigSwitchButton.j;
                                    return Integer.valueOf(bigSwitchButton.h);
                                case 1:
                                    k2d k2dVar2 = BigSwitchButton.j;
                                    return Integer.valueOf(bigSwitchButton.h);
                                case 2:
                                    k2d k2dVar3 = BigSwitchButton.j;
                                    return Integer.valueOf(bigSwitchButton.f);
                                default:
                                    k2d k2dVar4 = BigSwitchButton.j;
                                    return Integer.valueOf(bigSwitchButton.g);
                            }
                        }
                    });
                    final byte b4 = 3;
                    themeableLottieAnimationView.v(new dvb(new String[]{"**", "GradientDark", "**"}), 4, new ykj(this) { // from class: re3
                        public final /* synthetic */ BigSwitchButton b;

                        {
                            this.b = this;
                        }

                        public final Object k(g3d g3dVar) {
                            byte b42 = b4;
                            BigSwitchButton bigSwitchButton = this.b;
                            switch (b42) {
                                case 0:
                                    k2d k2dVar = BigSwitchButton.j;
                                    return Integer.valueOf(bigSwitchButton.h);
                                case 1:
                                    k2d k2dVar2 = BigSwitchButton.j;
                                    return Integer.valueOf(bigSwitchButton.h);
                                case 2:
                                    k2d k2dVar3 = BigSwitchButton.j;
                                    return Integer.valueOf(bigSwitchButton.f);
                                default:
                                    k2d k2dVar4 = BigSwitchButton.j;
                                    return Integer.valueOf(bigSwitchButton.g);
                            }
                        }
                    });
                    u7 u7Var = new u7(this, (byte) 17);
                    dll dllVarS = q9n.s(this);
                    if (dllVarS != null) {
                        u8n.b(dllVarS, this, u7Var);
                    }
                    u7Var.a(this);
                    setBackground(new uf9(context, null, fan.a(4.0f, context.getResources()), 2130969783));
                    return;
                }
            }
        }
        t3p.q("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    public final void a() {
        boolean zV = f03.V(2130971255, getContext());
        boolean z = this.i;
        this.f = (z && zV) ? (byte) 100 : (byte) 0;
        this.g = (!z || zV) ? (byte) 0 : (byte) 100;
        this.h = z ? (byte) 0 : (byte) 100;
        ((ThemeableLottieAnimationView) this.a.d).invalidate();
    }

    public final void b(pxh pxhVar) {
        CharSequence charSequenceA = pxhVar.a(getResources());
        ((StylingTextView) this.a.c).setText(charSequenceA);
        setContentDescription(charSequenceA);
        n1h.o(this, charSequenceA, 0);
    }

    public final void c(pxh pxhVar) {
        ((StylingTextView) this.a.e).setText(pxhVar.a(getResources()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(int i) {
        if (i == this.c) {
            return;
        }
        this.c = i;
        vs vsVar = this.a;
        se3 se3Var = this.b;
        if (i == 0) {
            se3Var.d();
            ((ThemeableLottieAnimationView) vsVar.d).t(o, null);
        } else {
            se3Var.a();
            byte b = this.c;
            if (b == 1) {
                ((ThemeableLottieAnimationView) vsVar.d).t(k, new fv2(this, (byte) 11));
            } else if (b == 2) {
                ((ThemeableLottieAnimationView) vsVar.d).t(q, null);
            } else if (b == 3) {
                ((ThemeableLottieAnimationView) vsVar.d).t(m, null);
            }
        }
        e();
    }

    public final void e() {
        Context context = getContext();
        vs vsVar = this.a;
        ((StylingTextView) vsVar.c).setTextColor(f03.t(this.c == 3 ? this.d : 2130968792, context, 2131099815));
        ((StylingTextView) vsVar.e).setTextColor(f03.t(this.c == 3 ? this.e : 2130968794, context, 2131099815));
    }

    @Override // android.view.View
    public final int getSuggestedMinimumHeight() {
        return fan.a(160.0f, getResources());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        byte b = this.c;
        vs vsVar = this.a;
        if (b == 0) {
            ((ThemeableLottieAnimationView) vsVar.d).t(p, null);
        } else if (b == 3) {
            ((ThemeableLottieAnimationView) vsVar.d).t(n, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.a();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.b.d();
    }
}
