package com.opera.android.browser.webauth;

import androidx.annotation.NonNull;
import defpackage.rpf;
import java.util.ArrayList;
import org.chromium.content_public.browser.WebContents;

/* loaded from: classes.dex */
public final class OperaWebAuthnCredentialsDelegateBridge {
    public static final ArrayList a = new ArrayList();

    public static class CredentialDetails {
        public final byte[] a;
        public final byte[] b;
        public final String c;
        public final String d;

        public CredentialDetails(byte[] bArr, String str, String str2, byte[] bArr2) {
            this.a = bArr;
            this.b = bArr2;
            this.c = str;
            this.d = str2;
        }
    }

    @NonNull
    public static byte[] getCredentialDetailsCredentialId(@NonNull CredentialDetails credentialDetails) {
        return credentialDetails.a;
    }

    @NonNull
    public static String getCredentialDetailsDisplayName(@NonNull CredentialDetails credentialDetails) {
        return credentialDetails.d;
    }

    @NonNull
    public static byte[] getCredentialDetailsUserId(@NonNull CredentialDetails credentialDetails) {
        return credentialDetails.b;
    }

    @NonNull
    public static String getCredentialDetailsUsername(@NonNull CredentialDetails credentialDetails) {
        return credentialDetails.c;
    }

    public static void onWebAuthnAccountSelected(@NonNull WebContents webContents, @NonNull byte[] bArr) {
        ArrayList arrayList = a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            rpf rpfVar = (rpf) obj;
            if (rpfVar.a == webContents) {
                rpfVar.c.run(bArr);
                return;
            }
        }
    }
}
