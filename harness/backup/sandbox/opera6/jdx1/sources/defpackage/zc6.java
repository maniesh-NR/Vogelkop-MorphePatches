package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class zc6 extends a63 {
    public nd6 e;
    public byte[] f;
    public int g;
    public int h;

    @Override // defpackage.ed6
    public final long b(nd6 nd6Var) throws s1g, id6 {
        byte[] bArrDecode;
        e();
        this.e = nd6Var;
        Uri uri = nd6Var.a;
        long j = nd6Var.f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        z4o.y("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = tym.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new s1g(fki.p(uriNormalizeScheme, "Unexpected URI format: "), null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                bArrDecode = Base64.decode(str2, 0);
                this.f = bArrDecode;
            } catch (IllegalArgumentException e) {
                throw new s1g(sko.j("Error while parsing Base64 encoded string: ", str2), e, true, 0);
            }
        } else {
            bArrDecode = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            this.f = bArrDecode;
        }
        long j2 = nd6Var.e;
        if (j2 > bArrDecode.length) {
            this.f = null;
            throw new id6(2008);
        }
        int i = (int) j2;
        this.g = i;
        int length = bArrDecode.length - i;
        this.h = length;
        if (j != -1) {
            this.h = (int) Math.min(length, j);
        }
        f(nd6Var);
        return j != -1 ? j : this.h;
    }

    @Override // defpackage.ed6
    public final void close() {
        if (this.f != null) {
            this.f = null;
            d();
        }
        this.e = null;
    }

    @Override // defpackage.ed6
    public final Uri getUri() {
        nd6 nd6Var = this.e;
        if (nd6Var != null) {
            return nd6Var.a;
        }
        return null;
    }

    @Override // defpackage.oc6
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        String str = tym.a;
        System.arraycopy(bArr2, this.g, bArr, i, iMin);
        this.g += iMin;
        this.h -= iMin;
        a(iMin);
        return iMin;
    }
}
