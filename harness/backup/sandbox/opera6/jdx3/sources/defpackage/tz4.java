package defpackage;

import android.animation.AnimatorSet;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.FrameLayout;
import com.opera.android.settings.SettingsManager;
import com.opera.android.widget.ThumbScroller;
import org.chromium.content.browser.GestureListenerManagerImpl;

/* loaded from: classes.dex */
public final class tz4 extends jw9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tz4(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 4:
                ((kdo) this.b).l = null;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r7, int r8) {
        /*
            r6 = this;
            byte r0 = r6.a
            java.lang.Object r1 = r6.b
            r2 = 0
            switch(r0) {
                case 0: goto L75;
                case 1: goto L8;
                case 2: goto Ld;
                case 3: goto L9;
                default: goto L8;
            }
        L8:
            return
        L9:
            r6.h()
            return
        Ld:
            g7b r1 = (defpackage.g7b) r1
            byte r0 = r1.e
            r3 = 2
            if (r0 != r3) goto L74
            r1.e = r2
            int r0 = r7 + r8
            int r3 = r1.i
            int r0 = r0 - r3
            r6.i(r7, r8)
            r6 = 1
            if (r0 <= 0) goto L23
            r7 = r6
            goto L24
        L23:
            r7 = r2
        L24:
            float r8 = r1.h
            int r3 = r1.j
            float r3 = (float) r3
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 >= 0) goto L2f
            r8 = r6
            goto L30
        L2f:
            r8 = r2
        L30:
            float r3 = r1.getTranslationY()
            int r4 = r1.j
            float r4 = (float) r4
            float r3 = r3 / r4
            r5 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 - r3
            if (r8 == 0) goto L41
            r3 = 1063675494(0x3f666666, float:0.9)
            goto L44
        L41:
            r3 = 1045220557(0x3e4ccccd, float:0.2)
        L44:
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L4a
            r3 = r6
            goto L4b
        L4a:
            r3 = r2
        L4b:
            r7 = r7 ^ r6
            if (r8 == 0) goto L60
            float r8 = r1.getTranslationY()
            float r0 = r1.h
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 <= 0) goto L5a
            r8 = r6
            goto L5b
        L5a:
            r8 = r2
        L5b:
            if (r3 != 0) goto L6f
            if (r8 != 0) goto L70
            goto L6f
        L60:
            float r8 = (float) r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r0
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 >= 0) goto L6a
            r8 = r6
            goto L6b
        L6a:
            r8 = r2
        L6b:
            if (r3 != 0) goto L6f
            if (r8 == 0) goto L70
        L6f:
            r2 = r6
        L70:
            r7 = r7 & r2
            r1.a(r7)
        L74:
            return
        L75:
            uz4 r1 = (defpackage.uz4) r1
            r1.f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz4.b(int, int):void");
    }

    public final void c(float f, float f2, int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                uz4 uz4Var = (uz4) obj;
                if (uz4Var.a().c() > (uz4Var.a().b() << 1) && Math.abs(f2) > Math.abs(f)) {
                    if (Math.abs(f2) > uz4Var.k || uz4Var.a.g == 1) {
                        uz4Var.f = f2 > 0.0f ? 1 : 2;
                        break;
                    }
                }
                break;
            case 2:
                g7b g7bVar = (g7b) obj;
                if (!g7bVar.l) {
                    AnimatorSet animatorSet = g7bVar.f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    float translationY = g7bVar.getTranslationY();
                    g7bVar.h = translationY;
                    int i3 = g7bVar.j;
                    if (translationY >= i3) {
                        i = Math.min(i, i3);
                    }
                    g7bVar.i = i + i2;
                    g7bVar.e = (byte) 2;
                    break;
                }
                break;
            case 3:
                h();
                break;
        }
    }

    public final void d() {
        View view;
        switch (this.a) {
            case 4:
                kdo kdoVar = (kdo) this.b;
                SettingsManager settingsManager = kdoVar.b;
                b2l b2lVar = kdoVar.c.o;
                if (b2lVar != null && ((Boolean) kdoVar.d.get()).booleanValue() && !kdoVar.a.a.getBoolean("default_zoom.page_menu_hint.shown", false)) {
                    if (!(settingsManager.h ? true : settingsManager.J()) && !wqm.w(((d7l) b2lVar).j.getUrl())) {
                        kwf kwfVar = kdoVar.f;
                        qwf qwfVar = qwf.z;
                        if (kwfVar.t(qwfVar) && !kdoVar.g.f.contains(qwfVar)) {
                            kdoVar.X();
                            if (settingsManager.i("feature_tips_notification") && (view = (View) kdoVar.h.get()) != null) {
                                oz3 oz3Var = kdoVar.e;
                                ioc iocVar = new ioc((byte) 4, view, kdoVar);
                                oz3Var.getClass();
                                oz3Var.b(iocVar, ijm.b);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    public final void e(int i, int i2) {
        switch (this.a) {
            case 2:
                g7b g7bVar = (g7b) this.b;
                boolean z = true;
                if (g7bVar.e == 1) {
                    g7bVar.e = (byte) 0;
                    int i3 = (i + i2) - g7bVar.i;
                    i(i, i2);
                    boolean z2 = ((float) i3) < ((float) g7bVar.j) * 0.5f;
                    boolean z3 = g7bVar.getTranslationY() < ((float) g7bVar.j) * 0.5f;
                    if (!z2 && !z3) {
                        z = false;
                    }
                    g7bVar.a(z);
                    break;
                }
                break;
            case 3:
                h();
                break;
        }
    }

    public final void f(int i, int i2) {
        int i3;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                uz4 uz4Var = (uz4) obj;
                if (uz4Var.a().c() > (uz4Var.a().b() << 1) && (i3 = uz4Var.f) != 0 && i3 != 0) {
                    ThumbScroller thumbScroller = uz4Var.a;
                    if (thumbScroller.g != 3) {
                        thumbScroller.o = false;
                        if (thumbScroller.h != i3) {
                            thumbScroller.h = i3;
                            thumbScroller.f.setImageResource(i3 == 2 ? 2131232515 : 2131232516);
                            ((Animatable) thumbScroller.f.getDrawable()).start();
                        }
                        FrameLayout frameLayout = thumbScroller.e;
                        int iB = thumbScroller.b();
                        uz4 uz4Var2 = (uz4) thumbScroller.i.a;
                        frameLayout.setTranslationY(iB + ((int) (cs5.s(uz4Var2.i / uz4Var2.j, 0.0f, 1.0f) * (((((thumbScroller.getHeight() - thumbScroller.getPaddingTop()) - thumbScroller.getPaddingBottom()) - iB) - uz4Var2.h) - thumbScroller.e.getHeight()))));
                        thumbScroller.e();
                        break;
                    }
                }
                break;
            case 2:
                g7b g7bVar = (g7b) obj;
                if (g7bVar.e != 0 && !g7bVar.l) {
                    AnimatorSet animatorSet = g7bVar.f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    i(i, i2);
                    break;
                }
                break;
        }
    }

    public final void g(int i, int i2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ((eyi) obj).a(true);
                break;
            case 2:
                g7b g7bVar = (g7b) obj;
                if (!g7bVar.l) {
                    AnimatorSet animatorSet = g7bVar.f;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    float translationY = g7bVar.getTranslationY();
                    g7bVar.h = translationY;
                    int i3 = g7bVar.j;
                    if (translationY >= i3) {
                        i = Math.min(i, i3);
                    }
                    g7bVar.i = i + i2;
                    g7bVar.e = (byte) 1;
                    break;
                }
                break;
            case 3:
                h();
                break;
        }
    }

    public final void h() {
        qt6 qt6Var = (qt6) this.b;
        boolean zK = qt6Var.k();
        qt6Var.a = ((GestureListenerManagerImpl) qt6Var.c).k;
        if (zK != qt6Var.k()) {
            zy4 zy4Var = (zy4) qt6Var.e;
            zy4Var.k = qt6Var.k();
            zy4Var.T();
        }
    }

    public final void i(int i, int i2) {
        g7b g7bVar = (g7b) this.b;
        g7bVar.setTranslationY(Math.max(0.0f, Math.min(g7bVar.j, g7bVar.h + ((i + i2) - g7bVar.i))));
    }
}
