package ads_mobile_sdk;

import defpackage.bg3;
import defpackage.t3p;
import defpackage.x7p;

/* loaded from: classes.dex */
public final class ms3 implements x7p {
    public int a = u0h.a(1639930109, -1705198021, 164110942, 67728125) ^ 161650728;
    public final byte[] b = new byte[8];
    public final bg3 c;

    public ms3(bg3 bg3Var) {
        this.c = bg3Var;
    }

    @Override // defpackage.x7p
    public final byte a(ws3 ws3Var, int i) {
        int iA = i >>> (u0h.a(993115750, 1213092095, -122082883, 1967905751) ^ 1229180);
        int i2 = this.a;
        byte[] bArr = this.b;
        if (iA != i2) {
            this.c.a(iA, bArr);
            this.a = iA;
        }
        return (byte) (((ws3Var.a(i) ^ bArr[i % 8]) << 24) >> 24);
    }

    @Override // defpackage.x7p
    public final ws3 a(ws3 ws3Var, int i, int i2) {
        byte[] bArr;
        if (i < 0 || i > i2 || i2 > ws3Var.a.length) {
            t3p.t();
            return null;
        }
        int i3 = i2 - i;
        byte[] bArr2 = new byte[i3];
        int i4 = 0;
        while (i < i2) {
            bArr2[i4] = a(ws3Var, i);
            i++;
            i4++;
        }
        if (i3 == 0) {
            bArr = new byte[0];
        } else {
            bArr = new byte[i3];
            System.arraycopy(bArr2, 0, bArr, 0, i3);
        }
        return new ws3(bArr);
    }

    @Override // defpackage.x7p
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ x7p mo12a() {
        return new ms3(this.c);
    }
}
