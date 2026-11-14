package defpackage;

import android.net.Uri;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class tfe implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fge b;

    public /* synthetic */ tfe(fge fgeVar, byte b) {
        this.a = b;
        this.b = fgeVar;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        fge fgeVar = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                if (!bool.booleanValue()) {
                    fgeVar.I0(new glj(new rxh(2132019203), 5000));
                    break;
                }
                break;
            default:
                if (bool.booleanValue()) {
                    Uri uri = fgeVar.L;
                    if (uri != null) {
                        String str = fgeVar.M;
                        fgeVar.L = null;
                        fgeVar.M = null;
                        fgeVar.H0(uri, str);
                    }
                    Long l = fgeVar.N;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        fgeVar.N = null;
                        fgeVar.J0(jLongValue);
                        break;
                    }
                }
                break;
        }
    }
}
