package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.credentials.CredentialManager;
import com.google.android.gms.fido.fido2.Fido2PrivilegedApiClient;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import org.chromium.base.Callback;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.url.Origin;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class nz8 implements Callback {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ sz8 b;
    public final /* synthetic */ ek2 c;
    public final /* synthetic */ dx3 d;
    public final /* synthetic */ Origin e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ uik g;

    public /* synthetic */ nz8(sz8 sz8Var, ek2 ek2Var, b9h b9hVar, dx3 dx3Var, Origin origin, cx9 cx9Var) {
        this.b = sz8Var;
        this.c = ek2Var;
        this.f = b9hVar;
        this.d = dx3Var;
        this.e = origin;
        this.g = cx9Var;
    }

    public /* synthetic */ nz8(sz8 sz8Var, ek2 ek2Var, Fido2PrivilegedApiClient fido2PrivilegedApiClient, x8h x8hVar, dx3 dx3Var, Origin origin) {
        this.b = sz8Var;
        this.c = ek2Var;
        this.f = fido2PrivilegedApiClient;
        this.g = x8hVar;
        this.d = dx3Var;
        this.e = origin;
    }

    @Override // org.chromium.base.Callback
    /* renamed from: onResult */
    public final void c(Object obj) throws JSONException {
        byte b = this.a;
        cx9 cx9Var = this.g;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                Fido2PrivilegedApiClient fido2PrivilegedApiClient = (Fido2PrivilegedApiClient) obj2;
                x8h x8hVar = (x8h) cx9Var;
                RenderFrameHost.WebAuthSecurityChecksResults webAuthSecurityChecksResults = (RenderFrameHost.WebAuthSecurityChecksResults) obj;
                int i = webAuthSecurityChecksResults.b;
                final ek2 ek2Var = this.c;
                if (i != 0) {
                    ek2Var.s(i);
                    break;
                } else {
                    boolean z = webAuthSecurityChecksResults.a;
                    final boolean z2 = x8hVar.q;
                    Origin origin = this.e;
                    String strF = sz8.f(origin);
                    byte[] bArr = x8hVar.d;
                    String str = x8hVar.b.b;
                    final sz8 sz8Var = this.b;
                    try {
                        Task registerPendingIntent = fido2PrivilegedApiClient.getRegisterPendingIntent(sz8.c(origin, sz8Var.a(0, strF, bArr, z, str, origin), x8hVar));
                        final int iNextInt = mdb.b.nextInt() & 65535;
                        final dx3 dx3Var = this.d;
                        registerPendingIntent.addOnSuccessListener(new OnSuccessListener() { // from class: qz8
                            public final void onSuccess(Object obj3) {
                                PendingIntent pendingIntent = (PendingIntent) obj3;
                                final sz8 sz8Var2 = sz8Var;
                                final ek2 ek2Var2 = ek2Var;
                                final boolean z3 = z2;
                                ni niVar = new ni() { // from class: kz8
                                    @Override // defpackage.ni
                                    public final void a(int i2, Intent intent) {
                                        AuthenticationExtensionsCredPropsOutputs credProps;
                                        ek2 ek2Var3 = ek2Var2;
                                        if (i2 == 0) {
                                            ek2Var3.s(2);
                                            return;
                                        }
                                        if (i2 == -1 && intent != null) {
                                            byte[] byteArrayExtra = intent.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA");
                                            sz8 sz8Var3 = sz8Var2;
                                            boolean z4 = z3;
                                            if (byteArrayExtra != null) {
                                                PublicKeyCredential publicKeyCredentialDeserializeFromBytes = PublicKeyCredential.deserializeFromBytes(byteArrayExtra);
                                                AuthenticatorErrorResponse response = publicKeyCredentialDeserializeFromBytes.getResponse();
                                                if (response instanceof AuthenticatorErrorResponse) {
                                                    sz8.k(response, ek2Var3);
                                                    return;
                                                }
                                                if (response instanceof AuthenticatorAttestationResponse) {
                                                    try {
                                                        z7d z7dVarJ = sz8Var3.j(publicKeyCredentialDeserializeFromBytes.getRawId(), publicKeyCredentialDeserializeFromBytes.getResponse(), z4);
                                                        String authenticatorAttachment = publicKeyCredentialDeserializeFromBytes.getAuthenticatorAttachment();
                                                        authenticatorAttachment.getClass();
                                                        if (authenticatorAttachment.equals("cross-platform")) {
                                                            z7dVarJ.c = 2;
                                                        } else if (authenticatorAttachment.equals("platform")) {
                                                            z7dVarJ.c = 1;
                                                        }
                                                        AuthenticationExtensionsClientOutputs clientExtensionResults = publicKeyCredentialDeserializeFromBytes.getClientExtensionResults();
                                                        if (clientExtensionResults != null && (credProps = clientExtensionResults.getCredProps()) != null) {
                                                            z7dVarJ.i = true;
                                                            z7dVarJ.j = credProps.getIsDiscoverableCredential();
                                                        }
                                                        if (ek2Var3.f) {
                                                            ek2Var3.h.b(0, z7dVarJ, (zsn) null);
                                                            ek2Var3.f = false;
                                                            ek2Var3.h = null;
                                                            ek2Var3.i = null;
                                                            ek2Var3.e = null;
                                                            return;
                                                        }
                                                        return;
                                                    } catch (NoSuchAlgorithmException unused) {
                                                        ek2Var3.s(9);
                                                        return;
                                                    }
                                                }
                                            }
                                            byte[] byteArrayExtra2 = intent.getByteArrayExtra("FIDO2_RESPONSE_EXTRA");
                                            if (byteArrayExtra2 != null) {
                                                AuthenticatorAttestationResponse authenticatorAttestationResponseDeserializeFromBytes = AuthenticatorAttestationResponse.deserializeFromBytes(byteArrayExtra2);
                                                try {
                                                    z7d z7dVarJ2 = sz8Var3.j(authenticatorAttestationResponseDeserializeFromBytes.getKeyHandle(), authenticatorAttestationResponseDeserializeFromBytes, z4);
                                                    if (ek2Var3.f) {
                                                        ek2Var3.h.b(0, z7dVarJ2, (zsn) null);
                                                        ek2Var3.f = false;
                                                        ek2Var3.h = null;
                                                        ek2Var3.i = null;
                                                        ek2Var3.e = null;
                                                        return;
                                                    }
                                                    return;
                                                } catch (NoSuchAlgorithmException unused2) {
                                                    ek2Var3.s(9);
                                                    return;
                                                }
                                            }
                                            byte[] byteArrayExtra3 = intent.getByteArrayExtra("FIDO2_ERROR_EXTRA");
                                            if (byteArrayExtra3 != null) {
                                                sz8.k(AuthenticatorErrorResponse.deserializeFromBytes(byteArrayExtra3), ek2Var3);
                                                return;
                                            }
                                        }
                                        ek2Var3.s(32);
                                    }
                                };
                                dx3 dx3Var2 = dx3Var;
                                HashMap map = dx3Var2.c;
                                char c = iNextInt;
                                map.put(Integer.valueOf(c), niVar);
                                try {
                                    dx3Var2.startIntentSenderForResult(pendingIntent.getIntentSender(), c, (Intent) null, 0, 0, 0);
                                } catch (IntentSender.SendIntentException unused) {
                                    ek2Var2.s(32);
                                }
                            }
                        });
                        registerPendingIntent.addOnFailureListener(new bk2(ek2Var, (byte) 5));
                        break;
                    } catch (IllegalArgumentException unused) {
                        ek2Var.s(32);
                        return;
                    }
                }
            default:
                b9h b9hVar = (b9h) obj2;
                cx9 cx9Var2 = cx9Var;
                RenderFrameHost.WebAuthSecurityChecksResults webAuthSecurityChecksResults2 = (RenderFrameHost.WebAuthSecurityChecksResults) obj;
                int i2 = webAuthSecurityChecksResults2.b;
                ek2 ek2Var2 = this.c;
                if (i2 == 0) {
                    boolean z3 = webAuthSecurityChecksResults2.a;
                    int i3 = cx9Var2.b;
                    dx3 dx3Var2 = this.d;
                    CredentialManager credentialManagerR = dx3Var2.R().R();
                    if (credentialManagerR != null) {
                        Origin origin2 = this.e;
                        String strF2 = sz8.f(origin2);
                        byte[] bArr2 = b9hVar.b;
                        String str2 = b9hVar.d;
                        sz8 sz8Var2 = this.b;
                        new a16(dx3Var2, credentialManagerR).b(b9hVar, sz8.f(origin2), sz8Var2.e, sz8Var2.a(1, strF2, bArr2, z3, str2, origin2), i3, ek2Var2);
                        break;
                    } else {
                        ek2Var2.s(32);
                        break;
                    }
                } else {
                    ek2Var2.s(i2);
                    break;
                }
        }
    }
}
