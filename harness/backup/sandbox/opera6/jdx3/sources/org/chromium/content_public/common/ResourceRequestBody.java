package org.chromium.content_public.common;

/* loaded from: classes.dex */
public final class ResourceRequestBody {
    public final byte[] a;

    public ResourceRequestBody(byte[] bArr) {
        this.a = bArr;
    }

    public static ResourceRequestBody createFromEncodedNativeForm(byte[] bArr) {
        return new ResourceRequestBody(bArr);
    }

    public final byte[] getEncodedNativeForm() {
        return this.a;
    }
}
