package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.HashMap;
import java.util.List;
import org.chromium.content_public.browser.RenderFrameHost;

/* loaded from: classes.dex */
public final /* synthetic */ class jz8 implements OnSuccessListener {
    public final /* synthetic */ sz8 a;
    public final /* synthetic */ dx3 b;
    public final /* synthetic */ char c;
    public final /* synthetic */ RenderFrameHost d;
    public final /* synthetic */ ek2 e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ jz8(sz8 sz8Var, dx3 dx3Var, int i, RenderFrameHost renderFrameHost, ek2 ek2Var, boolean z) {
        this.a = sz8Var;
        this.b = dx3Var;
        this.c = i;
        this.d = renderFrameHost;
        this.e = ek2Var;
        this.f = z;
    }

    public final void onSuccess(Object obj) {
        PendingIntent pendingIntent = (PendingIntent) obj;
        final sz8 sz8Var = this.a;
        final RenderFrameHost renderFrameHost = this.d;
        final ek2 ek2Var = this.e;
        final boolean z = this.f;
        ni niVar = new ni() { // from class: mz8
            @Override // defpackage.ni
            public final void a(int i, Intent intent) {
                szm[] szmVarArr;
                sz8 sz8Var2 = sz8Var;
                int i2 = sz8Var2.b;
                RenderFrameHost renderFrameHost2 = renderFrameHost;
                if (i2 != 1) {
                    if (intent == null) {
                        if (i2 != 5) {
                            sz8Var2.b = 3;
                            return;
                        }
                        sz8Var2.b = 1;
                        sz8Var2.b(renderFrameHost2);
                        ek2 ek2Var2 = sz8Var2.c;
                        if (ek2Var2 == null) {
                            return;
                        }
                        ek2Var2.s(13);
                        sz8Var2.c = null;
                        return;
                    }
                    sz8Var2.b = 1;
                    sz8Var2.b(renderFrameHost2);
                }
                ek2 ek2Var3 = ek2Var;
                if (i == 0) {
                    ek2Var3.s(2);
                    return;
                }
                if (i == -1 && intent != null) {
                    byte[] byteArrayExtra = intent.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA");
                    boolean z2 = z;
                    if (byteArrayExtra != null) {
                        PublicKeyCredential publicKeyCredentialDeserializeFromBytes = PublicKeyCredential.deserializeFromBytes(byteArrayExtra);
                        AuthenticatorErrorResponse response = publicKeyCredentialDeserializeFromBytes.getResponse();
                        if (response instanceof AuthenticatorErrorResponse) {
                            sz8.k(response, ek2Var3);
                            return;
                        }
                        if (response instanceof AuthenticatorAssertionResponse) {
                            if (sz8Var2.e != null) {
                                renderFrameHost2.g();
                            }
                            rw9 rw9VarI = sz8Var2.i(publicKeyCredentialDeserializeFromBytes.getRawId(), publicKeyCredentialDeserializeFromBytes.getResponse(), z2);
                            AuthenticationExtensionsClientOutputs clientExtensionResults = publicKeyCredentialDeserializeFromBytes.getClientExtensionResults();
                            if (clientExtensionResults != null) {
                                xj2 xj2Var = rw9VarI.f;
                                xj2Var.c = true;
                                List uvmEntryList = clientExtensionResults.getUvmEntries().getUvmEntryList();
                                if (uvmEntryList == null) {
                                    szmVarArr = new szm[0];
                                } else {
                                    szm[] szmVarArr2 = new szm[uvmEntryList.size()];
                                    for (int i3 = 0; i3 < uvmEntryList.size(); i3++) {
                                        szm szmVar = new szm(16);
                                        szmVar.b = ((UvmEntry) uvmEntryList.get(i3)).getUserVerificationMethod();
                                        szmVar.c = ((UvmEntry) uvmEntryList.get(i3)).getKeyProtectionType();
                                        szmVar.d = ((UvmEntry) uvmEntryList.get(i3)).getMatcherProtectionType();
                                        szmVarArr2[i3] = szmVar;
                                    }
                                    szmVarArr = szmVarArr2;
                                }
                                xj2Var.d = szmVarArr;
                            }
                            String authenticatorAttachment = publicKeyCredentialDeserializeFromBytes.getAuthenticatorAttachment();
                            authenticatorAttachment.getClass();
                            if (authenticatorAttachment.equals("cross-platform")) {
                                rw9VarI.c = 2;
                            } else if (authenticatorAttachment.equals("platform")) {
                                rw9VarI.c = 1;
                            }
                            ek2Var3.t(rw9VarI);
                            return;
                        }
                    }
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("FIDO2_RESPONSE_EXTRA");
                    if (byteArrayExtra2 != null) {
                        AuthenticatorAssertionResponse authenticatorAssertionResponseDeserializeFromBytes = AuthenticatorAssertionResponse.deserializeFromBytes(byteArrayExtra2);
                        if (sz8Var2.e != null) {
                            renderFrameHost2.g();
                        }
                        ek2Var3.t(sz8Var2.i(authenticatorAssertionResponseDeserializeFromBytes.getKeyHandle(), authenticatorAssertionResponseDeserializeFromBytes, z2));
                        return;
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
        dx3 dx3Var = this.b;
        HashMap map = dx3Var.c;
        char c = this.c;
        map.put(Integer.valueOf(c), niVar);
        try {
            dx3Var.startIntentSenderForResult(pendingIntent.getIntentSender(), c, (Intent) null, 0, 0, 0);
        } catch (IntentSender.SendIntentException unused) {
            ek2Var.s(32);
        }
    }
}
