package defpackage;

import java.util.List;
import org.chromium.base.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class fb implements Callback {
    public final /* synthetic */ byte a;

    @Override // org.chromium.base.Callback
    /* renamed from: onResult */
    public final void c(Object obj) {
        switch (this.a) {
            case 0:
                ioh.y(((List) obj).size(), 50, "Signin.AndroidNumberOfDeviceAccounts");
                break;
            default:
                break;
        }
    }
}
