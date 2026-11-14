package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.opera.android.browser.chromium.ChromiumContainerView;
import com.opera.android.browser.chromium.ChromiumContent;

/* loaded from: classes.dex */
public final class nz4 extends FrameLayout {
    public final ty3 a;
    public final ChromiumContainerView b;
    public final ysl c;
    public cy3 d;
    public View e;
    public ChromiumContent f;
    public boolean g;
    public boolean h;
    public uz4 i;
    public b7f j;
    public final wa k;

    public nz4(ChromiumContainerView chromiumContainerView, ysl yslVar) {
        super(chromiumContainerView.getContext());
        this.a = new ty3(this, (byte) 1);
        this.h = true;
        this.k = new wa(this, (byte) 8);
        this.b = chromiumContainerView;
        this.c = yslVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f.J.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        uz4 uz4Var = this.i;
        if (uz4Var != null && i != 0) {
            uz4Var.f = 0;
            uz4Var.a.d(false, false);
        }
        if (view != this.b) {
            if (i == 0) {
                if (this.h) {
                    this.h = false;
                    this.f.J.setVisibility(0);
                    this.f.e().y1(2);
                    return;
                }
                return;
            }
            if ((i == 4 || i == 8) && !this.h) {
                this.h = true;
                this.f.J.setVisibility(8);
                this.f.e().y1(0);
            }
        }
    }
}
