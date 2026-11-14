package defpackage;

import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.os.OutcomeReceiver;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class y06 implements OutcomeReceiver {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ek2 b;
    public final /* synthetic */ a16 c;

    public y06(a16 a16Var, boolean z, ek2 ek2Var) {
        this.a = z;
        this.b = ek2Var;
        this.c = a16Var;
    }

    @Override // android.os.OutcomeReceiver
    public final void onError(Throwable th) {
        String type = ((CreateCredentialException) th).getType();
        boolean zEquals = "android.credentials.CreateCredentialException.TYPE_USER_CANCELED".equals(type);
        ek2 ek2Var = this.b;
        if (zEquals) {
            ek2Var.s(2);
        } else if (type.contains("INVALID_STATE_ERROR")) {
            ek2Var.s(4);
        } else {
            ek2Var.s(32);
        }
    }

    @Override // android.os.OutcomeReceiver
    public final void onResult(Object obj) {
        a16 a16Var = this.c;
        boolean z = this.a;
        String string = ((CreateCredentialResponse) obj).getData().getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
        ek2 ek2Var = this.b;
        if (string == null) {
            ek2Var.s(32);
            return;
        }
        try {
            z7d z7dVarD = a16Var.d(string, z);
            if (ek2Var.f) {
                ek2Var.h.b(0, z7dVarD, (zsn) null);
                ek2Var.f = false;
                ek2Var.h = null;
                ek2Var.i = null;
                ek2Var.e = null;
            }
        } catch (JSONException unused) {
            ek2Var.s(32);
        }
    }
}
