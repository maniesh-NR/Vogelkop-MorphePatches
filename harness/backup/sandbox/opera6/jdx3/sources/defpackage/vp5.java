package defpackage;

import com.opera.android.browser.chromium.ChromiumContainerView;

/* loaded from: classes.dex */
public final class vp5 {
    public final k6l a;
    public final ysl b;
    public int c;
    public boolean d;
    public boolean e;
    public ChromiumContainerView f;

    public vp5(k6l k6lVar, ysl yslVar) {
        this.a = k6lVar;
        this.b = yslVar;
    }

    public final void a(boolean z) {
        if (z == this.d) {
            return;
        }
        this.d = z;
        ysl yslVar = this.b;
        if (z) {
            yslVar.Z();
        } else {
            yslVar.M();
        }
    }
}
