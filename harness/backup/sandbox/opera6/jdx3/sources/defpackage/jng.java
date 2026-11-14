package defpackage;

import android.content.Context;
import android.view.View;
import com.opera.android.FullscreenWebActivity;

/* loaded from: classes.dex */
public class jng extends agc {
    public final int e;
    public final Runnable f;

    public jng(int i, Context context, Runnable runnable) {
        super(context);
        this.e = i;
        this.f = runnable;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        int iA = vep.A(this.e);
        if (iA == 0) {
            FullscreenWebActivity.z0(view.getContext(), "https://www.opera.com/legal/eula-mobile", new rxh(2132021210));
        } else if (iA == 1) {
            FullscreenWebActivity.z0(view.getContext(), "https://www.opera.com/privacy", new rxh(2132021379));
        } else if (iA == 2) {
            FullscreenWebActivity.z0(view.getContext(), "https://www.opera.com/terms", new rxh(2132021773));
        }
        Runnable runnable = this.f;
        if (runnable != null) {
            runnable.run();
        }
    }
}
