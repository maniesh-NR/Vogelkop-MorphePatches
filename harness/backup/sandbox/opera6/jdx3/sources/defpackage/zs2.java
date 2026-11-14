package defpackage;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.i;
import com.opera.android.browser.chromium.ChromiumContent;

/* loaded from: classes.dex */
public final class zs2 extends i {
    public final ChromiumContent b;
    public final or2 c;
    public ru2 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public zs2(ChromiumContent chromiumContent, or2 or2Var, ole oleVar) {
        FrameLayout frameLayout = (FrameLayout) or2Var.c;
        super(frameLayout);
        this.b = chromiumContent;
        this.c = or2Var;
        frameLayout.setOnClickListener(new nf(this, oleVar, (byte) 9));
        frameLayout.setOnLongClickListener(new ys2(this, oleVar, (byte) 0));
    }
}
