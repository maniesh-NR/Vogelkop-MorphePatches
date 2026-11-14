package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.opera.android.bar.OmniButtonView;

/* loaded from: classes.dex */
public abstract class lgn extends l53 {
    public final /* synthetic */ mgn c;

    public lgn(mgn mgnVar) {
        this.c = mgnVar;
    }

    public abstract rcn a(ViewGroup viewGroup, View view);

    @Override // defpackage.pz3
    public final lz3 c(ViewGroup viewGroup) {
        mgn mgnVar = this.c;
        OmniButtonView omniButtonViewC = mgnVar.c();
        if (!mgnVar.e() || omniButtonViewC == null) {
            return null;
        }
        rcn rcnVarA = a(viewGroup, omniButtonViewC);
        rcnVarA.a(new kgn(this));
        return rcnVarA;
    }
}
