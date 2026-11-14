package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
public final class ksd extends RelativeLayout {
    public ImageView a;
    public zro b;

    public ksd(Context context) {
        super(context, null, 0, 0);
        ejo ejoVar = fko.a;
        fko.a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ejo ejoVar = fko.a;
        fko.b(this);
    }
}
