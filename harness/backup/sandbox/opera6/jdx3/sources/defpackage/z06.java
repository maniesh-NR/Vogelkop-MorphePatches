package defpackage;

import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.OutcomeReceiver;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class z06 implements OutcomeReceiver {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ek2 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ a16 d;

    public z06(a16 a16Var, boolean z, ek2 ek2Var, boolean z2) {
        this.a = z;
        this.b = ek2Var;
        this.c = z2;
        this.d = a16Var;
    }

    @Override // android.os.OutcomeReceiver
    public final void onError(Throwable th) {
        String type = ((GetCredentialException) th).getType();
        if (this.c && "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL".equals(type)) {
            return;
        }
        boolean zEquals = "android.credentials.GetCredentialException.TYPE_USER_CANCELED".equals(type);
        ek2 ek2Var = this.b;
        if (zEquals || "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL".equals(type)) {
            ek2Var.s(2);
        } else {
            ek2Var.s(32);
        }
    }

    @Override // android.os.OutcomeReceiver
    public final void onResult(Object obj) {
        GetCredentialResponse getCredentialResponse = (GetCredentialResponse) obj;
        a16 a16Var = this.d;
        boolean z = this.a;
        boolean zEquals = "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL".equals(getCredentialResponse.getCredential().getType());
        ek2 ek2Var = this.b;
        if (!zEquals) {
            ek2Var.s(32);
            return;
        }
        String string = getCredentialResponse.getCredential().getData().getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
        if (string == null) {
            ek2Var.s(32);
            return;
        }
        try {
            ek2Var.t(a16Var.e(string, z));
        } catch (JSONException unused) {
            ek2Var.s(32);
        }
    }
}
