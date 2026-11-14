package defpackage;

import android.graphics.RectF;
import android.view.View;
import com.opera.android.feed.SoftwareClipMaskableFrameLayout;

/* loaded from: classes.dex */
public final class wbj extends n1f {
    public boolean e;
    public float f;

    public wbj(SoftwareClipMaskableFrameLayout softwareClipMaskableFrameLayout) {
        super((byte) 2);
        this.e = false;
        this.f = 0.0f;
        q(softwareClipMaskableFrameLayout);
    }

    private void q(View view) {
        view.setOutlineProvider(new tk4(this, (byte) 3));
    }

    @Override // defpackage.n1f
    public final void e(SoftwareClipMaskableFrameLayout softwareClipMaskableFrameLayout) {
        saj sajVar;
        RectF rectF;
        saj sajVar2 = (saj) this.b;
        this.f = (sajVar2 == null || (rectF = (RectF) this.c) == null) ? 0.0f : sajVar2.f.a(rectF);
        boolean z = false;
        if ((((RectF) this.c).isEmpty() || (sajVar = (saj) this.b) == null) ? false : sajVar.l((RectF) this.c)) {
            z = true;
        } else {
            ((RectF) this.c).isEmpty();
        }
        this.e = z;
        softwareClipMaskableFrameLayout.setClipToOutline(!m());
        if (m()) {
            softwareClipMaskableFrameLayout.invalidate();
        } else {
            softwareClipMaskableFrameLayout.invalidateOutline();
        }
    }

    @Override // defpackage.n1f
    public final boolean m() {
        return !this.e || this.a;
    }
}
