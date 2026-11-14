package defpackage;

import android.animation.ValueAnimator;
import com.opera.android.BrowserActivity;
import com.opera.android.bar.LimitedSideActionsAppbar;
import com.opera.android.bar.OmniBoxRoot;
import com.opera.android.bar.OmniButtonView;
import com.opera.android.bar.TopToolbarContainer;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class pvl extends uul {
    public final int l;
    public final p12 m;
    public boolean n;
    public final k6l o;
    public final LimitedSideActionsAppbar p;
    public final z8b q;

    public pvl(pt3 pt3Var, k6l k6lVar, tt3 tt3Var, TopToolbarContainer topToolbarContainer, ysl yslVar, BrowserActivity browserActivity, z8b z8bVar, pde pdeVar) {
        super(browserActivity, pt3Var, k6lVar, tt3Var, topToolbarContainer, yslVar, pdeVar);
        this.l = topToolbarContainer.getResources().getDimensionPixelSize(2131167755);
        this.o = k6lVar;
        LimitedSideActionsAppbar limitedSideActionsAppbar = (LimitedSideActionsAppbar) topToolbarContainer.findViewById(2131362058);
        this.p = limitedSideActionsAppbar;
        this.q = z8bVar;
        aib.A(k6lVar, browserActivity.getLifecycle(), new mvl(this), new p7l(this, (byte) 18));
        ((pde) z8bVar.a).j(browserActivity, new f7f(this) { // from class: kvl
            public final /* synthetic */ pvl b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b = b;
                pvl pvlVar = this.b;
                switch (b) {
                    case 0:
                        pvlVar.E();
                        break;
                    default:
                        pvlVar.E();
                        break;
                }
            }
        });
        final byte b = 1;
        ((pde) z8bVar.b).j(browserActivity, new f7f(this) { // from class: kvl
            public final /* synthetic */ pvl b;

            {
                this.b = this;
            }

            public final void d0(Object obj) {
                byte b2 = b;
                pvl pvlVar = this.b;
                switch (b2) {
                    case 0:
                        pvlVar.E();
                        break;
                    default:
                        pvlVar.E();
                        break;
                }
            }
        });
        lvl lvlVar = new lvl(this, b);
        lvl lvlVar2 = new lvl(this, b);
        lvl lvlVar3 = new lvl(this, (byte) 2);
        p12 p12Var = new p12();
        p12Var.e = new x43(yul.d);
        p12Var.a = limitedSideActionsAppbar;
        p12Var.b = lvlVar;
        p12Var.c = lvlVar2;
        p12Var.d = lvlVar3;
        p12Var.h = new esg(limitedSideActionsAppbar.findViewById(2131363731), new dvj((byte) 5));
        limitedSideActionsAppbar.c = p12Var;
        float f = ((x43) p12Var.e).a.a;
        lvlVar.run(Float.valueOf(f));
        limitedSideActionsAppbar.setAlpha(f);
        limitedSideActionsAppbar.setVisibility(f == 0.0f ? (byte) 8 : (byte) 0);
        lvlVar2.run(Float.valueOf(((x43) p12Var.e).a.a));
        this.m = p12Var;
    }

    @Override // defpackage.z43
    public final void A(x43 x43Var) {
        float animatedFraction;
        float animatedFraction2;
        final byte b = 0;
        final byte b2 = 1;
        boolean z = !this.n && this.a;
        final p12 p12Var = this.m;
        if (x43Var.equals((x43) p12Var.e)) {
            return;
        }
        x43 x43Var2 = (x43) p12Var.e;
        p12Var.e = x43Var;
        yul yulVar = x43Var2.a;
        yul yulVar2 = x43Var.a;
        float f = yulVar2.a;
        ValueAnimator valueAnimator = (ValueAnimator) p12Var.f;
        p12Var.f = null;
        if (valueAnimator != null) {
            animatedFraction = valueAnimator.getAnimatedFraction();
            valueAnimator.cancel();
        } else {
            animatedFraction = yulVar.a;
        }
        float fAbs = Math.abs(f - animatedFraction);
        if (fAbs > 0.0f) {
            ValueAnimator valueAnimatorY = p12.y(z && yulVar.d(yulVar2), animatedFraction, f, fAbs, new ValueAnimator.AnimatorUpdateListener() { // from class: nvl
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    byte b3 = b;
                    p12 p12Var2 = p12Var;
                    p12Var2.getClass();
                    switch (b3) {
                        case 0:
                            Float f2 = (Float) valueAnimator2.getAnimatedValue();
                            float fFloatValue = f2.floatValue();
                            ((lvl) p12Var2.b).run(f2);
                            LimitedSideActionsAppbar limitedSideActionsAppbar = (LimitedSideActionsAppbar) p12Var2.a;
                            limitedSideActionsAppbar.setAlpha(fFloatValue);
                            limitedSideActionsAppbar.setVisibility(fFloatValue == 0.0f ? 8 : 0);
                            break;
                        default:
                            Float f3 = (Float) valueAnimator2.getAnimatedValue();
                            f3.getClass();
                            ((lvl) p12Var2.c).run(f3);
                            break;
                    }
                }
            }, new rl((byte) 4), new Runnable() { // from class: ovl
                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b;
                    p12 p12Var2 = p12Var;
                    switch (b3) {
                        case 0:
                            p12Var2.f = null;
                            break;
                        default:
                            p12Var2.g = null;
                            break;
                    }
                }
            });
            if (valueAnimatorY.isRunning()) {
                p12Var.f = valueAnimatorY;
            }
        }
        float f2 = yulVar2.a;
        ValueAnimator valueAnimator2 = (ValueAnimator) p12Var.g;
        p12Var.g = null;
        if (valueAnimator2 != null) {
            animatedFraction2 = valueAnimator2.getAnimatedFraction();
            valueAnimator2.cancel();
        } else {
            animatedFraction2 = yulVar.a;
        }
        float f3 = animatedFraction2;
        float fAbs2 = Math.abs(f2 - f3);
        if (fAbs2 > 0.0f) {
            ValueAnimator valueAnimatorY2 = p12.y(z && yulVar.d(yulVar2), f3, f2, fAbs2, new ValueAnimator.AnimatorUpdateListener() { // from class: nvl
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    byte b3 = b2;
                    p12 p12Var2 = p12Var;
                    p12Var2.getClass();
                    switch (b3) {
                        case 0:
                            Float f22 = (Float) valueAnimator22.getAnimatedValue();
                            float fFloatValue = f22.floatValue();
                            ((lvl) p12Var2.b).run(f22);
                            LimitedSideActionsAppbar limitedSideActionsAppbar = (LimitedSideActionsAppbar) p12Var2.a;
                            limitedSideActionsAppbar.setAlpha(fFloatValue);
                            limitedSideActionsAppbar.setVisibility(fFloatValue == 0.0f ? 8 : 0);
                            break;
                        default:
                            Float f32 = (Float) valueAnimator22.getAnimatedValue();
                            f32.getClass();
                            ((lvl) p12Var2.c).run(f32);
                            break;
                    }
                }
            }, new rl((byte) 4), new Runnable() { // from class: ovl
                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b2;
                    p12 p12Var2 = p12Var;
                    switch (b3) {
                        case 0:
                            p12Var2.f = null;
                            break;
                        default:
                            p12Var2.g = null;
                            break;
                    }
                }
            });
            if (valueAnimatorY2.isRunning()) {
                p12Var.g = valueAnimatorY2;
            }
        }
        ((lvl) p12Var.d).run((x43) p12Var.e);
    }

    @Override // defpackage.z43
    public final void B(boolean z) {
        this.n = z;
    }

    public final void E() {
        pde pdeVar;
        b2l b2lVar = this.o.o;
        p6l p6lVarT = b2lVar != null ? b2lVar.T() : p6l.a;
        z8b z8bVar = this.q;
        z8bVar.getClass();
        int iOrdinal = p6lVarT.ordinal();
        if (iOrdinal == 0) {
            pdeVar = (pde) z8bVar.a;
        } else {
            if (iOrdinal != 1) {
                h9o.p();
                return;
            }
            pdeVar = (pde) z8bVar.b;
        }
        v8k v8kVar = ((f8k) pdeVar.g()).f;
        iec iecVar = this.p.d;
        boolean z = v8kVar == v8k.b;
        if (iecVar.b == z) {
            return;
        }
        iecVar.b = z;
        iecVar.h.invalidate();
    }

    @Override // defpackage.z43
    public final v73 b(OmniBoxRoot omniBoxRoot, ydn ydnVar, BrowserActivity browserActivity, lg lgVar, SettingsManager settingsManager, wth wthVar, in3 in3Var, k5o k5oVar, ikc ikcVar, u0a u0aVar) {
        return new odg(omniBoxRoot, ydnVar, browserActivity, lgVar, settingsManager, wthVar, new crk(this, (byte) 18), in3Var, k5oVar, ikcVar, u0aVar);
    }

    @Override // defpackage.z43
    public final int e() {
        return this.l;
    }

    @Override // defpackage.z43
    public final bp i() {
        OmniButtonView omniButtonViewQ = ((gbf) this.i).q();
        if (omniButtonViewQ == null || omniButtonViewQ.getResources().getConfiguration().smallestScreenWidthDp < 600) {
            return null;
        }
        return new bp(omniButtonViewQ, -fan.a(5.0f, omniButtonViewQ.getResources()));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @Override // defpackage.z43
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j() {
        /*
            r7 = this;
            p12 r7 = r7.m
            java.lang.Object r0 = r7.f
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            java.lang.Object r7 = r7.e
            x43 r7 = (defpackage.x43) r7
            r1 = 0
            if (r0 == 0) goto L28
            yul r7 = r7.a
            int r7 = r7.ordinal()
            if (r7 == 0) goto L1e
            r3 = 1
            if (r7 != r3) goto L28
            long r3 = r0.getCurrentPlayTime()
            goto L29
        L1e:
            long r3 = r0.getDuration()
            long r5 = r0.getCurrentPlayTime()
            long r3 = r3 - r5
            goto L29
        L28:
            r3 = r1
        L29:
            float r7 = (float) r3
            r0 = 0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 <= 0) goto L30
            return r3
        L30:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pvl.j():long");
    }

    @Override // defpackage.z43
    public final x43 k() {
        return (x43) this.m.e;
    }

    @Override // defpackage.z43
    public final boolean n() {
        p12 p12Var = this.m;
        ValueAnimator valueAnimator = (ValueAnimator) p12Var.f;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            return true;
        }
        ValueAnimator valueAnimator2 = (ValueAnimator) p12Var.g;
        return valueAnimator2 != null && valueAnimator2.isRunning();
    }

    @Override // defpackage.z43
    public final boolean o() {
        return true;
    }

    @Override // defpackage.uul, defpackage.z43
    public final void s() {
        super.s();
        TopToolbarContainer topToolbarContainer = this.j;
        if (0.0f != topToolbarContainer.getTranslationY()) {
            topToolbarContainer.setTranslationY(0.0f);
            i7f i7fVar = (i7f) this.h;
            g7f g7fVarC = u35.c(i7fVar, i7fVar);
            while (g7fVarC.hasNext()) {
                ((y43) g7fVarC.next()).p(0.0f);
            }
        }
    }

    @Override // defpackage.z43
    public final void v() {
        p12 p12Var = this.m;
        ValueAnimator valueAnimator = (ValueAnimator) p12Var.f;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimator2 = (ValueAnimator) p12Var.g;
        if (valueAnimator2 != null) {
            valueAnimator2.end();
        }
    }

    @Override // defpackage.z43
    public final void w(boolean z) {
        iec iecVar = ((LimitedSideActionsAppbar) this.m.a).d;
        if (iecVar.c == z) {
            return;
        }
        iecVar.c = z;
        iecVar.h.invalidate();
    }
}
