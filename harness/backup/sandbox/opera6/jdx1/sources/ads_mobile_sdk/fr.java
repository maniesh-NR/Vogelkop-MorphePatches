package ads_mobile_sdk;

import defpackage.hyo;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class fr extends hyo {
    public final byte[] d;

    public fr(byte[] bArr) {
        bArr.getClass();
        this.d = bArr;
    }

    @Override // ads_mobile_sdk.hr
    public final hr a(int i, int i2) {
        byte[] bArr = this.d;
        int iA = hr.a(i, i2, bArr.length);
        return iA == 0 ? hr.b : new br(bArr, i, iA);
    }

    @Override // ads_mobile_sdk.hr
    /* renamed from: a */
    public final String mo2a() {
        return new String(this.d, StandardCharsets.ISO_8859_1);
    }

    @Override // ads_mobile_sdk.hr
    public final void a(int i, int i2, int i3, byte[] bArr) {
        System.arraycopy(this.d, i, bArr, i2, i3);
    }

    @Override // ads_mobile_sdk.hr
    public final void a(ov ovVar) {
        byte[] bArr = this.d;
        ovVar.a$1(0, bArr.length, bArr);
    }

    @Override // defpackage.hyo
    public final boolean a(hr hrVar, int i, int i2) {
        int size = hrVar.size();
        byte[] bArr = this.d;
        if (i2 > size) {
            h9o.f(i2, bArr.length);
            return false;
        }
        int i3 = i + i2;
        if (i3 > hrVar.size()) {
            h9o.q(hrVar.size(), sko.o(i, i2, "Ran off end of other: ", ", ", ", "));
            return false;
        }
        if (hrVar instanceof fr) {
            return hr.a(bArr, 0, ((fr) hrVar).d, i, i2);
        }
        if (!(hrVar instanceof br)) {
            return hrVar.b(i, i3).equals(b(0, i2));
        }
        br brVar = (br) hrVar;
        return hr.a(bArr, 0, brVar.d, brVar.e + i, i2);
    }

    @Override // ads_mobile_sdk.hr
    public final byte b(int i) {
        return this.d[i];
    }

    @Override // ads_mobile_sdk.hr
    public final int b(int i, int i2, int i3) {
        byte[] bArr = yb1.a;
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.d[i4];
        }
        return i;
    }

    @Override // ads_mobile_sdk.hr
    public final hr b(int i, int i2) {
        byte[] bArr = this.d;
        int iA = hr.a(i, i2, bArr.length);
        return iA == 0 ? hr.b : new br(bArr, i, iA);
    }

    @Override // ads_mobile_sdk.hr
    public final boolean b(hr hrVar) {
        boolean z = hrVar instanceof fr;
        byte[] bArr = this.d;
        return z ? Arrays.equals(bArr, ((fr) hrVar).d) : hrVar instanceof br ? a(hrVar, 0, bArr.length) : hrVar.b(this);
    }

    @Override // ads_mobile_sdk.hr
    public final int size() {
        return this.d.length;
    }
}
