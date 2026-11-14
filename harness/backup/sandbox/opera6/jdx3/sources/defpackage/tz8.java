package defpackage;

import android.app.Activity;
import android.credentials.CredentialManager;
import com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient;

/* loaded from: classes.dex */
public final class tz8 extends lim {
    public Activity a;
    public Fido2PrivilegedApiClient b;
    public CredentialManager c;

    public final CredentialManager R() {
        Activity activity = this.a;
        if (activity == null) {
            return null;
        }
        CredentialManager credentialManager = this.c;
        if (credentialManager != null) {
            return credentialManager;
        }
        CredentialManager credentialManager2 = (CredentialManager) activity.getSystemService("credential");
        this.c = credentialManager2;
        return credentialManager2;
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        this.b = null;
        this.c = null;
        this.a = null;
    }
}
