package defpackage;

import android.content.Context;
import com.opera.android.widget.ThemeableLottieAnimationView;

/* loaded from: classes.dex */
public final /* synthetic */ class tbn implements ykj, rll {
    public final /* synthetic */ xbf a;

    public /* synthetic */ tbn(xbf xbfVar) {
        this.a = xbfVar;
    }

    @Override // defpackage.rll
    public final Object getValue() {
        Context context = ((ThemeableLottieAnimationView) this.a.b).getContext();
        return new Integer[]{Integer.valueOf(f03.t(2130969308, context, 2131101243)), Integer.valueOf(f03.t(2130969315, context, 2131101243))};
    }

    public final Object k(g3d g3dVar) {
        return Float.valueOf(((wbn) this.a.g).b);
    }
}
