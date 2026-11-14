package ads_mobile_sdk;

import defpackage.hyo;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class br extends hyo {
    public final byte[] d;
    public final int e;
    public final int f;

    public br(byte[] bArr, int i, int i2) {
        hr.a(i, i + i2, bArr.length);
        this.d = bArr;
        this.e = i;
        this.f = i2;
    }

    @Override // ads_mobile_sdk.hr
    public final hr a(int i, int i2) {
        int iA = hr.a(i, i2, this.f);
        if (iA == 0) {
            return hr.b;
        }
        return new br(this.d, this.e + i, iA);
    }

    @Override // ads_mobile_sdk.hr
    /* renamed from: a */
    public final String mo2a() {
        Charset charset = StandardCharsets.ISO_8859_1;
        return new String(this.d, this.e, this.f, charset);
    }

    @Override // ads_mobile_sdk.hr
    public final void a(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.d, this.e + i, bArr, i2, i3);
    }

    @Override // ads_mobile_sdk.hr
    public final void a(ov ovVar) {
        ovVar.a$1(this.e, this.f, this.d);
    }

    @Override // defpackage.hyo
    public final boolean a(hr hrVar, int i, int i2) {
        if (i2 > hrVar.size()) {
            h9o.f(i2, this.f);
            return false;
        }
        int i3 = i + i2;
        if (i3 > hrVar.size()) {
            h9o.q(hrVar.size(), sko.o(i, i2, "Ran off end of other: ", ", ", ", "));
            return false;
        }
        boolean z = hrVar instanceof fr;
        byte[] bArr = this.d;
        int i4 = this.e;
        if (z) {
            return hr.a(bArr, i4, ((fr) hrVar).d, i, i2);
        }
        if (!(hrVar instanceof br)) {
            return hrVar.b(i, i3).equals(b(i4, i2 + i4));
        }
        br brVar = (br) hrVar;
        return hr.a(bArr, i4, brVar.d, brVar.e + i, i2);
    }

    @Override // ads_mobile_sdk.hr
    public final byte b(int i) {
        return this.d[this.e + i];
    }

    @Override // ads_mobile_sdk.hr
    public final int b(int i, int i2, int i3) {
        int i4 = this.e + i2;
        byte[] bArr = yb1.a;
        for (int i5 = i4; i5 < i4 + i3; i5++) {
            i = (i * 31) + this.d[i5];
        }
        return i;
    }

    @Override // ads_mobile_sdk.hr
    public final hr b(int i, int i2) {
        int iA = hr.a(i, i2, this.f);
        if (iA == 0) {
            return hr.b;
        }
        return new br(this.d, this.e + i, iA);
    }

    @Override // ads_mobile_sdk.hr
    public final boolean b(hr hrVar) {
        return ((hrVar instanceof fr) || (hrVar instanceof br)) ? a(hrVar, 0, this.f) : hrVar.b(this);
    }

    @Override // ads_mobile_sdk.hr
    public final int size() {
        return this.f;
    }
}
