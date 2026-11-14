package defpackage;

import androidx.fragment.app.r;
import com.opera.android.BrowserActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class gv3 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ BrowserActivity b;

    public /* synthetic */ gv3(BrowserActivity browserActivity, byte b) {
        this.a = b;
        this.b = browserActivity;
    }

    public final Object get() {
        byte b = this.a;
        r rVar = this.b;
        switch (b) {
            case 0:
                return rVar.J0();
            case 1:
                return cqp.f0(rVar);
            case 2:
                return rVar.getSupportFragmentManager();
            case 3:
                return rVar.J0();
            case 4:
                return rVar.o.f;
            case 5:
                return (hxk) rVar.g0.E(kxk.class);
            case 6:
                rqd rqdVar = z7f.k;
                return ipe.E(rVar);
            default:
                return v1.u(rVar);
        }
    }
}
