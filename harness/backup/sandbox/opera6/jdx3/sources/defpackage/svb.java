package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class svb {
    public float a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public final Object g;

    public svb(BrowserActivity browserActivity, pde pdeVar) {
        this.g = new int[2];
        this.b = browserActivity;
        this.c = pdeVar;
        this.d = browserActivity.findViewById(2131361903);
        pdeVar.k(new ks6(this, (byte) 20));
    }

    public svb(xbf xbfVar) {
        egd egdVar;
        vjd vjdVar;
        gig gigVar = (gig) ((ode) xbfVar.c).g();
        tjg tjgVar = (tjg) xbfVar.b;
        qjd qjdVarG = gigVar.g();
        this.b = qjdVarG;
        String string = null;
        if (qjdVarG != null) {
            egdVar = (egd) tjgVar.k.e.get(qjdVarG.a);
            vjdVar = qjdVarG.e;
        } else {
            egdVar = null;
            vjdVar = null;
        }
        this.c = egdVar != null ? egdVar.a : null;
        this.a = gigVar.getPlaybackParameters().a;
        this.d = egdVar != null ? egdVar.c() : null;
        this.f = egdVar != null ? egdVar.c : null;
        if (vjdVar != null) {
            CharSequence charSequence = vjdVar.a;
            String[] strArr = aik.a;
            if (!TextUtils.isEmpty(charSequence)) {
                string = charSequence.toString();
            }
        }
        this.e = string;
        this.g = ((tjg) ((jjg) xbfVar.e).b).n.c;
    }

    public final void a() {
        int[] iArr = (int[]) this.g;
        BrowserActivity browserActivity = (BrowserActivity) this.b;
        View view = (View) this.d;
        if (((d21) this.e) != null) {
            int iIntValue = ((Integer) ((pde) this.c).g()).intValue();
            boolean z = iIntValue > fan.a(64.0f, browserActivity.getResources());
            view.getLocationOnScreen(iArr);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(2038, 792);
            layoutParams.gravity = 51;
            layoutParams.alpha = this.a;
            layoutParams.y = (view.getHeight() + iArr[1]) - iIntValue;
            layoutParams.width = view.getWidth();
            layoutParams.height = iIntValue;
            if (z && ((WindowManager) this.f) != null) {
                WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) ((d21) this.e).getLayoutParams();
                if (layoutParams.alpha == layoutParams2.alpha && layoutParams.y == layoutParams2.y && layoutParams.width == layoutParams2.width && layoutParams.height == layoutParams2.height) {
                    return;
                }
            }
            WindowManager windowManager = (WindowManager) this.f;
            if (windowManager != null) {
                windowManager.removeView((d21) this.e);
                this.f = null;
            }
            if (z) {
                try {
                    WindowManager windowManager2 = (WindowManager) browserActivity.getSystemService("window");
                    this.f = windowManager2;
                    windowManager2.addView((d21) this.e, layoutParams);
                } catch (Exception unused) {
                    this.f = null;
                }
            }
        }
    }
}
