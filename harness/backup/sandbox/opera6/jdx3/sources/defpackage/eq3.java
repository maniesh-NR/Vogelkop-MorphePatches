package defpackage;

import android.view.ViewGroup;
import com.opera.android.BrowserActivity;
import com.opera.android.bar.BottomBar;
import com.opera.android.bar.OmniBoxRoot;
import com.opera.android.settings.SettingsManager;
import java.util.Set;

/* loaded from: classes.dex */
public final class eq3 extends pp3 {
    public final /* synthetic */ byte u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eq3(pt3 pt3Var, k6l k6lVar, esk eskVar, ViewGroup viewGroup, BottomBar bottomBar, nwf nwfVar, ysl yslVar, v1f v1fVar, esk eskVar2, BrowserActivity browserActivity, pde pdeVar, Set set, byte b) {
        super(pt3Var, k6lVar, eskVar, viewGroup, bottomBar, nwfVar, yslVar, v1fVar, eskVar2, browserActivity, pdeVar, set);
        this.u = b;
    }

    @Override // defpackage.z43
    public final v73 b(OmniBoxRoot omniBoxRoot, ydn ydnVar, BrowserActivity browserActivity, lg lgVar, SettingsManager settingsManager, wth wthVar, in3 in3Var, k5o k5oVar, ikc ikcVar, u0a u0aVar) {
        switch (this.u) {
            case 0:
                return new fq3(omniBoxRoot, ydnVar, browserActivity, lgVar, settingsManager, wthVar, in3Var, k5oVar, ikcVar, u0aVar, (byte) 0);
            default:
                return new fq3(omniBoxRoot, ydnVar, browserActivity, lgVar, settingsManager, wthVar, in3Var, k5oVar, ikcVar, u0aVar, (byte) 1);
        }
    }

    @Override // defpackage.z43
    public final boolean o() {
        switch (this.u) {
            case 0:
                return true;
            default:
                return super.o();
        }
    }
}
