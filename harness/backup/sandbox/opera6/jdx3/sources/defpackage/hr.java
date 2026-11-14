package defpackage;

import android.graphics.Rect;
import com.opera.android.BrowserActivity;
import java.util.List;

/* loaded from: classes.dex */
public final class hr implements gr, y63 {
    public float a;
    public final Object b;

    public hr(List list) {
        this.a = -1.0f;
        this.b = (zvb) list.get(0);
    }

    public hr(zni zniVar) {
        this.b = zniVar;
    }

    @Override // defpackage.gr
    public final Rect a(ir irVar, wv3 wv3Var) {
        Rect rectB = wv3Var.b();
        yni yniVar = ((zni) this.b).a;
        int iHeight = wv3Var.b().height();
        BrowserActivity browserActivity = wv3Var.a;
        int i = BrowserActivity.E1;
        int iA = wv3Var.a(browserActivity.w0()) + iHeight;
        float f = iA;
        float fMin = Math.min(yniVar.b, wv3Var.a(browserActivity.w0()) / f);
        this.a = fMin;
        return new Rect(rectB.left, rectB.top - zed.b(fMin * f), rectB.right, rectB.bottom);
    }

    public final boolean f(float f) {
        if (this.a == f) {
            return true;
        }
        this.a = f;
        return false;
    }

    public final zvb h() {
        return (zvb) this.b;
    }

    public final boolean i(float f) {
        return !((zvb) this.b).c();
    }

    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.gr
    public final boolean j() {
        return true;
    }

    public final float k() {
        return ((zvb) this.b).b();
    }

    @Override // defpackage.gr
    public final void l(float f) {
        zni zniVar = (zni) this.b;
        float f2 = this.a * f;
        if (f2 == zniVar.h) {
            return;
        }
        zniVar.h = f2;
        zniVar.invalidateSelf();
    }

    public final float u() {
        return ((zvb) this.b).a();
    }
}
