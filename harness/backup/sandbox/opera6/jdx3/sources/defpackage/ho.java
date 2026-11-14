package defpackage;

import ads_mobile_sdk.xo;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final class ho implements jhb {
    public final /* synthetic */ byte a;

    public /* synthetic */ ho(byte b) {
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jhb
    public final boolean a(BrowserActivity browserActivity, yz yzVar) {
        switch (this.a) {
            case 0:
                if (yzVar instanceof go) {
                    rzo rzoVar = ((go) yzVar).w.b;
                    ((xo) rzoVar).n = false;
                    ((xo) rzoVar).o = true;
                    ((xo) rzoVar).m.a(browserActivity, false, true);
                    break;
                }
                break;
            default:
                alf alfVar = yzVar instanceof alf ? (alf) yzVar : null;
                if (alfVar != null) {
                    alfVar.u.K(browserActivity, new blf(alfVar));
                    break;
                }
                break;
        }
        return true;
    }
}
