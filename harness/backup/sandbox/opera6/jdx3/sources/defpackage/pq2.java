package defpackage;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.i;
import com.opera.android.browser.chromium.ChromiumContent;

/* loaded from: classes.dex */
public final class pq2 extends i {
    public final vs b;
    public final ChromiumContent c;
    public final oq2 d;
    public final int e;
    public ru2 f;

    /* JADX WARN: Illegal instructions before constructor call */
    public pq2(vs vsVar, ChromiumContent chromiumContent, oq2 oq2Var, int i) {
        FrameLayout frameLayout = (FrameLayout) vsVar.b;
        super(frameLayout);
        this.b = vsVar;
        this.c = chromiumContent;
        this.d = oq2Var;
        this.e = i;
        frameLayout.setOnClickListener(new gf((Object) this, (byte) 16));
    }
}
