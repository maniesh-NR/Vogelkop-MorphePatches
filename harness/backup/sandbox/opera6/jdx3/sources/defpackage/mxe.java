package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.os.Build;
import android.provider.Settings;
import android.view.WindowManager;
import com.opera.android.BrowserActivity;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class mxe extends lim implements p5j, nwe {
    public final qwe a;
    public final svb b;
    public final SettingsManager c;
    public ValueAnimator d;
    public boolean e;
    public boolean f;

    public mxe(BrowserActivity browserActivity, qwe qweVar, SettingsManager settingsManager, pde pdeVar) {
        this.a = qweVar;
        this.b = new svb(browserActivity, pdeVar);
        this.c = settingsManager;
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("night_mode_dimming".equals(str) || "night_mode_temperature".equals(str) || "night_mode_overlay_keyboard".equals(str) || "night_mode_switch_theme".equals(str)) {
            R(false);
        }
    }

    public final void R(boolean z) {
        int iArgb;
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.d = null;
        }
        SettingsManager settingsManager = this.c;
        this.f = settingsManager.i("night_mode_overlay_keyboard") && settingsManager.i("night_mode_switch_theme");
        int i = this.a.a.a;
        if (owe.c.a.get()) {
            float fN = settingsManager.n("night_mode_temperature") / 1000.0f;
            float fN2 = settingsManager.n("night_mode_dimming") / 1000.0f;
            int i2 = 255 - (fN2 > 0.0f ? ((int) (fN2 * 114.0f)) + 58 : 0);
            float f = 1.0f - (0.5f * fN);
            float f2 = 1.0f - fN;
            float f3 = i2;
            iArgb = Color.argb(255, i2, Math.round(f * f3), Math.round(f3 * f2));
        } else {
            iArgb = -1;
        }
        if (iArgb == i) {
            T();
            return;
        }
        if (!z) {
            S(iArgb);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(300L);
        this.d.addUpdateListener(new lxe(this, i, iArgb));
        this.d.start();
    }

    public final void S(int i) {
        qwe qweVar = this.a;
        if (i != qweVar.a.a) {
            qweVar.a = new bp(i);
            g7f g7fVar = new g7f(qweVar.b);
            while (g7fVar.hasNext()) {
                ((pwe) g7fVar.next()).a(qweVar.a);
            }
        }
        T();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.Context, com.opera.android.BrowserActivity] */
    public final void T() {
        svb svbVar = this.b;
        if (svbVar != null) {
            if (this.f && this.e) {
                bp bpVar = this.a.a;
                if (((LightingColorFilter) bpVar.b) != null) {
                    int iArgb = Color.argb(255 - Math.round(p37.t(bpVar.a) * 255.0f), 0, 0, 0);
                    ?? r4 = (BrowserActivity) svbVar.b;
                    float fAlpha = Color.alpha(iArgb) / 255.0f;
                    int iRgb = Color.rgb(Color.red(iArgb), Color.green(iArgb), Color.blue(iArgb));
                    if (Build.VERSION.SDK_INT >= 31) {
                        fAlpha = Math.min(0.8f, fAlpha);
                    }
                    d21 d21Var = (d21) svbVar.e;
                    if (d21Var != null) {
                        Paint paint = (Paint) d21Var.b;
                        if (iRgb != paint.getColor()) {
                            paint.setColor(iRgb);
                            d21Var.invalidate();
                        }
                        if (fAlpha != svbVar.a) {
                            svbVar.a = fAlpha;
                            svbVar.a();
                            return;
                        }
                        return;
                    }
                    if (!Settings.canDrawOverlays(r4)) {
                        this.c.V(0, "night_mode_overlay_keyboard");
                        return;
                    }
                    svbVar.a = fAlpha;
                    d21 d21Var2 = new d21(r4);
                    svbVar.e = d21Var2;
                    Paint paint2 = (Paint) d21Var2.b;
                    if (iRgb != paint2.getColor()) {
                        paint2.setColor(iRgb);
                        d21Var2.invalidate();
                    }
                    svbVar.a();
                    return;
                }
            }
            WindowManager windowManager = (WindowManager) svbVar.f;
            if (windowManager != null) {
                windowManager.removeView((d21) svbVar.e);
                svbVar.f = null;
            }
            svbVar.e = null;
        }
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        this.c.F(this);
        owe.c.F(this);
        R(false);
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.c.H(this);
        owe.c.H(this);
    }

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        this.e = false;
        T();
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        this.e = true;
        T();
    }

    @Override // defpackage.nwe
    public final void y(boolean z) {
        R(true);
    }
}
