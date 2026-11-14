package defpackage;

import android.content.Context;
import android.credentials.CreateCredentialRequest;
import android.credentials.CredentialManager;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialRequest;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Base64;
import com.leanplum.internal.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a16 {
    public final dx3 a;
    public final CredentialManager b;
    public byte[] c;

    public a16(dx3 dx3Var, CredentialManager credentialManager) {
        this.a = dx3Var;
        this.b = credentialManager;
    }

    public static String a(int i) {
        if (i == 0) {
            return "usb";
        }
        if (i == 1) {
            return "nfc";
        }
        if (i == 2) {
            return "ble";
        }
        if (i == 3) {
            return "hybrid";
        }
        if (i != 4) {
            return null;
        }
        return "internal";
    }

    public final void b(b9h b9hVar, String str, byte[] bArr, byte[] bArr2, int i, ek2 ek2Var) throws JSONException {
        this.c = bArr;
        boolean z = i == 1;
        y8h[] y8hVarArr = b9hVar.e;
        boolean z2 = y8hVarArr != null && y8hVarArr.length > 0;
        wj2 wj2Var = b9hVar.h;
        boolean z3 = (wj2Var == null || wj2Var.b == null) ? false : true;
        orb orbVar = new orb();
        byte[] bArr3 = b9hVar.b;
        int i2 = 11;
        orbVar.p(bArr3 == null ? "" : Base64.encodeToString(bArr3, 11), "challenge");
        dpl dplVar = b9hVar.c;
        if (dplVar != null) {
            orbVar.o(dplVar.b / 1000, "timeout");
        }
        orbVar.p(b9hVar.d, "rpId");
        y8h[] y8hVarArr2 = b9hVar.e;
        if (y8hVarArr2 != null && y8hVarArr2.length > 0) {
            vpb vpbVar = new vpb();
            y8h[] y8hVarArr3 = b9hVar.e;
            int length = y8hVarArr3.length;
            int i3 = 0;
            while (i3 < length) {
                y8h y8hVar = y8hVarArr3[i3];
                orb orbVarP = vep.p(Constants.Params.TYPE, "public-key");
                byte[] bArr4 = y8hVar.c;
                orbVarP.p(bArr4 == null ? "" : Base64.encodeToString(bArr4, i2), "id");
                int[] iArr = y8hVar.d;
                if (iArr != null && iArr.length > 0) {
                    vpb vpbVar2 = new vpb();
                    int[] iArr2 = y8hVar.d;
                    int length2 = iArr2.length;
                    int i4 = 0;
                    while (i4 < length2) {
                        int i5 = i4;
                        String strA = a(iArr2[i4]);
                        if (strA != null) {
                            vpbVar2.a(strA);
                        }
                        i4 = i5 + 1;
                    }
                    orbVarP.p(vpbVar2, "transports");
                }
                vpbVar.a(orbVarP);
                i3++;
                i2 = 11;
            }
            orbVar.p(vpbVar, "allowCredentials");
        }
        int i6 = b9hVar.g;
        if (i6 != 1) {
            orbVar.p(i6 != 0 ? i6 != 2 ? "preferred" : "discouraged" : "required", "userVerification");
        }
        String string = orbVar.a.toString();
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
        bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", string);
        if (bArr2 != null) {
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr2);
        }
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        CredentialOption credentialOptionBuild = new CredentialOption.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bundle).build();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z);
        GetCredentialRequest.Builder builder = new GetCredentialRequest.Builder(bundle2);
        builder.addCredentialOption(credentialOptionBuild);
        builder.setOrigin(str);
        GetCredentialRequest getCredentialRequestBuild = builder.build();
        CredentialManager credentialManager = this.b;
        fp1 fp1Var = this.a;
        credentialManager.getCredential((Context) fp1Var, getCredentialRequestBuild, (CancellationSignal) null, fp1Var.getMainExecutor(), new z06(this, z3, ek2Var, z));
    }

    public final void c(x8h x8hVar, String str, byte[] bArr, byte[] bArr2, boolean z, ek2 ek2Var) throws JSONException {
        y8h[] y8hVarArr;
        this.c = bArr;
        orb orbVar = new orb();
        orb orbVar2 = new orb();
        orbVar2.p(x8hVar.b.b, "id");
        orbVar2.p(x8hVar.b.c, Constants.Params.NAME);
        orbVar.p(orbVar2, "rp");
        orb orbVar3 = new orb();
        byte[] bArr3 = x8hVar.c.b;
        int i = 11;
        orbVar3.p(bArr3 == null ? "" : Base64.encodeToString(bArr3, 11), "id");
        orbVar3.p(x8hVar.c.c, Constants.Params.NAME);
        orbVar3.p(x8hVar.c.d, "displayName");
        orbVar.p(orbVar3, "user");
        byte[] bArr4 = x8hVar.d;
        orbVar.p(bArr4 == null ? "" : Base64.encodeToString(bArr4, 11), "challenge");
        vpb vpbVar = new vpb();
        z8h[] z8hVarArr = x8hVar.e;
        if (z8hVarArr != null) {
            for (z8h z8hVar : z8hVarArr) {
                orb orbVarP = vep.p(Constants.Params.TYPE, "public-key");
                orbVarP.n(z8hVar.c, "alg");
                vpbVar.a(orbVarP);
            }
        }
        orbVar.p(vpbVar, "pubKeyCredParams");
        dpl dplVar = x8hVar.f;
        if (dplVar != null) {
            orbVar.o(dplVar.b / 1000, "timeout");
        }
        y8h[] y8hVarArr2 = x8hVar.g;
        if (y8hVarArr2 != null && y8hVarArr2.length > 0) {
            vpb vpbVar2 = new vpb();
            y8h[] y8hVarArr3 = x8hVar.g;
            int length = y8hVarArr3.length;
            int i2 = 0;
            while (i2 < length) {
                y8h y8hVar = y8hVarArr3[i2];
                orb orbVarP2 = vep.p(Constants.Params.TYPE, "public-key");
                byte[] bArr5 = y8hVar.c;
                orbVarP2.p(bArr5 == null ? "" : Base64.encodeToString(bArr5, i), "id");
                int[] iArr = y8hVar.d;
                if (iArr == null || iArr.length <= 0) {
                    y8hVarArr = y8hVarArr3;
                } else {
                    vpb vpbVar3 = new vpb();
                    int[] iArr2 = y8hVar.d;
                    int length2 = iArr2.length;
                    y8hVarArr = y8hVarArr3;
                    int i3 = 0;
                    while (i3 < length2) {
                        int i4 = i3;
                        String strA = a(iArr2[i3]);
                        if (strA != null) {
                            vpbVar3.a(strA);
                        }
                        i3 = i4 + 1;
                    }
                    orbVarP2.p(vpbVar3, "transports");
                }
                vpbVar2.a(orbVarP2);
                i2++;
                y8hVarArr3 = y8hVarArr;
                i = 11;
            }
            orbVar.p(vpbVar2, "excludeCredentials");
        }
        if (x8hVar.h != null) {
            orb orbVar4 = new orb();
            int i5 = x8hVar.h.b;
            if (i5 != 0) {
                orbVar4.p(i5 == 1 ? "platform" : "cross-platform", "authenticatorAttachment");
            }
            int i6 = x8hVar.h.c;
            String str2 = "preferred";
            orbVar4.p(i6 != 1 ? i6 != 2 ? "discouraged" : "required" : "preferred", "residentKey");
            int i7 = x8hVar.h.d;
            if (i7 == 0) {
                str2 = "required";
            } else if (i7 == 2) {
                str2 = "discouraged";
            }
            orbVar4.p(str2, "userVerification");
            orbVar.p(orbVar4, "authenticatorSelection");
        }
        int i8 = x8hVar.j;
        orbVar.p(i8 != 1 ? i8 != 2 ? i8 != 3 ? "none" : "enterprise" : "direct" : "indirect", "attestation");
        String string = orbVar.a.toString();
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
        bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", string);
        if (bArr2 != null) {
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr2);
        }
        CreateCredentialRequest createCredentialRequestBuild = new CreateCredentialRequest.Builder("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bundle).setAlwaysSendAppInfoToProvider(true).setOrigin(str).build();
        CredentialManager credentialManager = this.b;
        fp1 fp1Var = this.a;
        credentialManager.createCredential(fp1Var, createCredentialRequestBuild, null, fp1Var.getMainExecutor(), new y06(this, z, ek2Var));
    }

    public final z7d d(String str, boolean z) {
        int i;
        orb orbVar = new orb(str);
        orb orbVarC = orbVar.c(Constants.Params.RESPONSE);
        JSONObject jSONObject = orbVarC.a;
        z7d z7dVar = new z7d(0);
        z7dVar.b = new bc5(0);
        String strE = orbVar.e("id");
        bc5 bc5Var = z7dVar.b;
        bc5Var.b = strE;
        bc5Var.c = Base64.decode(orbVar.e("rawId"), 11);
        byte[] bArr = this.c;
        bc5 bc5Var2 = z7dVar.b;
        if (bArr != null) {
            bc5Var2.d = bArr;
        } else {
            bc5Var2.d = Base64.decode(orbVarC.e("clientDataJSON"), 11);
        }
        z7dVar.d = Base64.decode(orbVarC.e("attestationObject"), 11);
        if (jSONObject.has("authenticatorData")) {
            z7dVar.b.e = Base64.decode(orbVarC.e("authenticatorData"), 11);
        }
        if (jSONObject.has("publicKey")) {
            z7dVar.f = Base64.decode(orbVarC.e("publicKey"), 11);
        }
        if (jSONObject.has("publicKeyAlgorithm")) {
            z7dVar.g = jSONObject.getInt("publicKeyAlgorithm");
        }
        if (jSONObject.has("transports")) {
            vpb vpbVarB = orbVarC.b("transports");
            JSONArray jSONArray = vpbVarB.a;
            z7dVar.e = new int[jSONArray.length()];
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                int[] iArr = z7dVar.e;
                i = 4;
                switch (vpbVarB.d(i2)) {
                    case "hybrid":
                    case "cable":
                        i = 3;
                        break;
                    case "ble":
                        i = 2;
                        break;
                    case "nfc":
                        i = 1;
                        break;
                    case "usb":
                        i = 0;
                        break;
                }
                iArr[i2] = i;
            }
        } else {
            z7dVar.e = new int[0];
        }
        JSONObject jSONObject2 = orbVar.a;
        if (jSONObject2.has("authenticatorAttachment")) {
            String strE2 = orbVar.e("authenticatorAttachment");
            if ("platform".equals(strE2)) {
                z7dVar.c = 1;
            } else if ("cross-platform".equals(strE2)) {
                z7dVar.c = 2;
            }
        }
        z7dVar.h = z;
        if (jSONObject2.has("clientExtensionResults")) {
            orb orbVarC2 = orbVar.c("clientExtensionResults");
            if (orbVarC2.a.has("credProps")) {
                JSONObject jSONObject3 = orbVarC2.c("credProps").a;
                if (jSONObject3.has("rk")) {
                    z7dVar.i = true;
                    z7dVar.j = jSONObject3.getBoolean("rk");
                }
            }
        }
        return z7dVar;
    }

    public final rw9 e(String str, boolean z) throws JSONException {
        orb orbVar = new orb(str);
        orb orbVarC = orbVar.c(Constants.Params.RESPONSE);
        JSONObject jSONObject = orbVarC.a;
        rw9 rw9Var = new rw9(0);
        bc5 bc5Var = new bc5(0);
        rw9Var.b = bc5Var;
        bc5Var.b = orbVar.e("id");
        rw9Var.b.c = Base64.decode(orbVar.e("rawId"), 11);
        byte[] bArr = this.c;
        bc5 bc5Var2 = rw9Var.b;
        if (bArr != null) {
            bc5Var2.d = bArr;
        } else {
            bc5Var2.d = Base64.decode(orbVarC.e("clientDataJSON"), 11);
        }
        rw9Var.b.e = Base64.decode(orbVarC.e("authenticatorData"), 11);
        rw9Var.d = Base64.decode(orbVarC.e("signature"), 11);
        if (jSONObject.has("userHandle") && !jSONObject.isNull("userHandle")) {
            rw9Var.e = Base64.decode(orbVarC.e("userHandle"), 11);
        }
        if (orbVar.a.has("authenticatorAttachment")) {
            String strE = orbVar.e("authenticatorAttachment");
            if ("platform".equals(strE)) {
                rw9Var.c = 1;
            } else if ("cross-platform".equals(strE)) {
                rw9Var.c = 2;
            }
        }
        xj2 xj2Var = new xj2(0);
        rw9Var.f = xj2Var;
        xj2Var.b = z;
        return rw9Var;
    }
}
