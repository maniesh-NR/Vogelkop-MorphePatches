package defpackage;

import J.N;
import com.opera.android.account.AuthExtension;
import com.opera.android.autofill.Address;
import com.opera.android.oauth2.OperaAccessToken;
import com.opera.api.Callback;

/* loaded from: classes.dex */
public final /* synthetic */ class yh2 implements Callback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;

    public /* synthetic */ yh2(long j, byte b) {
        this.a = b;
        this.b = j;
    }

    @Override // com.opera.api.Callback
    public final void run(Object obj) {
        byte b = this.a;
        long j = this.b;
        switch (b) {
            case 0:
                OperaAccessToken operaAccessToken = (OperaAccessToken) obj;
                i7f i7fVar = AuthExtension.a;
                N.MG9GgC1E(j, operaAccessToken != null ? operaAccessToken.a : null);
                break;
            default:
                Address address = (Address) obj;
                N.Mf9jHO_s(j, address != null ? 1 : 2, address);
                break;
        }
    }
}
