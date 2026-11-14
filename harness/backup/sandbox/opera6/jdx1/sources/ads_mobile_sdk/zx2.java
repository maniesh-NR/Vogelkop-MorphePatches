package ads_mobile_sdk;

import defpackage.hyo;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zx2 extends hr {
    public static final int[] i = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int d;
    public final hr e;
    public final hr f;
    public final int g;
    public final int h;

    public zx2(hr hrVar, hr hrVar2) {
        this.e = hrVar;
        this.f = hrVar2;
        int size = hrVar.size();
        this.g = size;
        this.d = hrVar2.size() + size;
        this.h = Math.max(hrVar.a(), hrVar2.a()) + 1;
    }

    public static int c(int i2) {
        if (i2 >= 47) {
            return Integer.MAX_VALUE;
        }
        return i[i2];
    }

    @Override // ads_mobile_sdk.hr
    public final int a() {
        return this.h;
    }

    @Override // ads_mobile_sdk.hr
    public final hr a(int i2, int i3) {
        return b(i2, i3);
    }

    @Override // ads_mobile_sdk.hr
    public final void a(int i2, int i3, int i4, byte[] bArr) {
        int i5 = i2 + i4;
        hr hrVar = this.e;
        int i6 = this.g;
        if (i5 <= i6) {
            hrVar.a(i2, i3, i4, bArr);
            return;
        }
        hr hrVar2 = this.f;
        if (i2 >= i6) {
            hrVar2.a(i2 - i6, i3, i4, bArr);
            return;
        }
        int i7 = i6 - i2;
        hrVar.a(i2, i3, i7, bArr);
        hrVar2.a(0, i3 + i7, i4 - i7, bArr);
    }

    @Override // ads_mobile_sdk.hr
    public final void a(ov ovVar) {
        this.e.a(ovVar);
        this.f.a(ovVar);
    }

    @Override // ads_mobile_sdk.hr
    public final byte b(int i2) {
        int i3 = this.g;
        return i2 < i3 ? this.e.b(i2) : this.f.b(i2 - i3);
    }

    @Override // ads_mobile_sdk.hr
    public final int b(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        hr hrVar = this.e;
        int i6 = this.g;
        if (i5 <= i6) {
            return hrVar.b(i2, i3, i4);
        }
        hr hrVar2 = this.f;
        if (i3 >= i6) {
            return hrVar2.b(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return hrVar2.b(hrVar.b(i2, i3, i7), 0, i4 - i7);
    }

    @Override // ads_mobile_sdk.hr
    public final hr b(int i2, int i3) {
        int i4 = this.d;
        int iA = hr.a(i2, i3, i4);
        if (iA == 0) {
            return hr.b;
        }
        if (iA == i4) {
            return this;
        }
        hr hrVar = this.e;
        int i5 = this.g;
        if (i3 <= i5) {
            return hrVar.a(i2, i3);
        }
        hr hrVar2 = this.f;
        return i2 >= i5 ? hrVar2.a(i2 - i5, i3 - i5) : new zx2(hrVar.a(i2, hrVar.size()), hrVar2.a(0, i3 - i5));
    }

    @Override // ads_mobile_sdk.hr
    public final boolean b() {
        return this.d >= c(this.h);
    }

    @Override // ads_mobile_sdk.hr
    public final boolean b(hr hrVar) {
        yx2 yx2Var = new yx2(this);
        hyo hyoVarB = yx2Var.next();
        yx2 yx2Var2 = new yx2(hrVar);
        hyo hyoVarB2 = yx2Var2.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int size = hyoVarB.size() - i2;
            int size2 = hyoVarB2.size() - i3;
            int iMin = Math.min(size, size2);
            if (!(i2 == 0 ? hyoVarB.a(hyoVarB2, i3, iMin) : hyoVarB2.a(hyoVarB, i2, iMin))) {
                return false;
            }
            i4 += iMin;
            int i5 = this.d;
            if (i4 >= i5) {
                if (i4 == i5) {
                    return true;
                }
                h9o.e();
                return false;
            }
            if (iMin == size) {
                i2 = 0;
                hyoVarB = yx2Var.next();
            } else {
                i2 += iMin;
                hyoVarB = hyoVarB;
            }
            if (iMin == size2) {
                hyoVarB2 = yx2Var2.next();
                i3 = 0;
            } else {
                i3 += iMin;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new wx2(this);
    }

    @Override // ads_mobile_sdk.hr
    public final int size() {
        return this.d;
    }
}
