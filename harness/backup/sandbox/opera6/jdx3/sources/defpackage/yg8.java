package defpackage;

import android.widget.FrameLayout;
import androidx.fragment.app.r;

/* loaded from: classes.dex */
public final class yg8 {
    public static final yg8 c = new yg8(false, 0);
    public int a;
    public boolean b;

    public yg8(boolean z, int i) {
        this.b = z;
        this.a = i;
    }

    public final void a(r rVar) {
        if (this.b) {
            FrameLayout frameLayout = (FrameLayout) rVar.getWindow().getDecorView();
            if ((frameLayout.getSystemUiVisibility() & 1024) == 0) {
                frameLayout.setSystemUiVisibility(this.a);
            }
        }
    }
}
