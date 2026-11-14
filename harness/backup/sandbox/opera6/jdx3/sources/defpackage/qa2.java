package defpackage;

import android.widget.FrameLayout;
import androidx.media3.ui.AspectRatioFrameLayout;
import com.opera.android.widget.ThumbScroller;

/* loaded from: classes.dex */
public final class qa2 implements Runnable {
    public final /* synthetic */ byte a;
    public boolean b;
    public boolean c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ qa2(FrameLayout frameLayout, byte b) {
        this.a = b;
        this.d = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        FrameLayout frameLayout = this.d;
        switch (b) {
            case 0:
                this.c = false;
                pa2 pa2Var = ((AspectRatioFrameLayout) frameLayout).b;
                if (pa2Var != null) {
                    pa2Var.d(this.b);
                    break;
                }
                break;
            default:
                this.b = false;
                boolean z = this.c;
                int i = ThumbScroller.q;
                ((ThumbScroller) frameLayout).d(true, z);
                break;
        }
    }
}
