package ads_mobile_sdk;

import defpackage.ocp;
import defpackage.p3p;
import defpackage.t3p;
import defpackage.v9g;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class iv extends v9g {
    public final InputStream d;
    public final byte[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k = Integer.MAX_VALUE;

    public iv(InputStream inputStream) {
        byte[] bArr = yb1.a;
        if (inputStream == null) {
            t3p.q("input");
            throw null;
        }
        this.d = inputStream;
        this.e = new byte[4096];
        this.f = 0;
        this.h = 0;
        this.j = 0;
    }

    public static boolean a(int i, int i2, int i3) {
        return i3 < i || i2 > i3 - i;
    }

    @Override // defpackage.v9g
    public final int a() {
        return this.j + this.h;
    }

    @Override // defpackage.v9g
    public final void a(int i) throws bj1 {
        if (this.i == i) {
            return;
        }
        t3p.j("Protocol message end-group tag did not match expected tag.");
    }

    @Override // defpackage.v9g
    public final boolean b() {
        return this.h == this.f && !l(1);
    }

    @Override // defpackage.v9g
    public final void c(int i) {
        this.k = i;
        z();
    }

    @Override // defpackage.v9g
    public final boolean c() {
        return y() != 0;
    }

    @Override // defpackage.v9g
    public final int d(int i) throws bj1 {
        if (i < 0) {
            t3p.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.j + this.h;
        if (i > Integer.MAX_VALUE - i2) {
            t3p.j("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        if (a(i2, i, this.k)) {
            t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i3 = this.k;
        this.k = i2 + i;
        z();
        return i3;
    }

    @Override // defpackage.v9g
    public final fr d() throws IOException {
        int iX = x();
        int i = this.f;
        int i2 = this.h;
        int i3 = i - i2;
        byte[] bArr = this.e;
        if (iX <= i3 && iX > 0) {
            fr frVarB = hr.b(i2, iX, bArr);
            this.h += iX;
            return frVarB;
        }
        if (iX == 0) {
            return hr.b;
        }
        if (iX < 0) {
            t3p.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        byte[] bArrG = g(iX);
        if (bArrG != null) {
            return hr.b(0, bArrG.length, bArrG);
        }
        int i4 = this.h;
        int i5 = this.f;
        int length = i5 - i4;
        this.j += i5;
        this.h = 0;
        this.f = 0;
        ArrayList arrayListH = h(iX - length);
        byte[] bArr2 = new byte[iX];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        int size = arrayListH.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayListH.get(i6);
            i6++;
            byte[] bArr3 = (byte[]) obj;
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        fr frVar = hr.b;
        try {
            return iX == 0 ? hr.b : new fr(bArr2);
        } catch (bj1 e) {
            h9o.v("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
            return null;
        }
    }

    @Override // defpackage.v9g
    public final double e() {
        return Double.longBitsToDouble(w());
    }

    @Override // defpackage.v9g
    public final boolean e(int i) throws bj1 {
        int i2 = i & 7;
        if (i2 != 0) {
            if (i2 == 1) {
                j(8);
                return true;
            }
            if (i2 == 2) {
                j(x());
                return true;
            }
            if (i2 == 3) {
                u();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.b == 0) {
                    a(0);
                }
                return false;
            }
            if (i2 == 5) {
                j(4);
                return true;
            }
            t3p.c();
            return false;
        }
        int i3 = this.f - this.h;
        byte[] bArr = this.e;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.h;
                this.h = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            t3p.j("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            if (this.h == this.f) {
                i(1);
            }
            int i7 = this.h;
            this.h = i7 + 1;
            if (bArr[i7] < 0) {
            }
        }
        t3p.j("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    @Override // defpackage.v9g
    public final int f() {
        return x();
    }

    public final byte[] f(int i) throws IOException {
        byte[] bArrG = g(i);
        if (bArrG != null) {
            return bArrG;
        }
        int i2 = this.h;
        int i3 = this.f;
        int length = i3 - i2;
        this.j += i3;
        this.h = 0;
        this.f = 0;
        ArrayList arrayListH = h(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, i2, bArr, 0, length);
        int size = arrayListH.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListH.get(i4);
            i4++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    @Override // defpackage.v9g
    public final int g() {
        return v();
    }

    public final byte[] g(int i) throws IOException {
        if (i == 0) {
            return yb1.a;
        }
        if (i < 0) {
            t3p.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        int i2 = this.j + this.h;
        if (a(i2, i, Integer.MAX_VALUE)) {
            t3p.j("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return null;
        }
        if (a(i2, i, this.k)) {
            int i3 = this.k;
            if (i3 >= i2) {
                j(i3 - i2);
            }
            t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        int i4 = this.f - this.h;
        int i5 = i - i4;
        InputStream inputStream = this.d;
        if (i5 >= 4096) {
            try {
                if (i5 > inputStream.available()) {
                    return null;
                }
            } catch (bj1 e) {
                e.a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.e, this.h, bArr, 0, i4);
        this.j += this.f;
        this.h = 0;
        this.f = 0;
        while (i4 < i) {
            try {
                int i6 = inputStream.read(bArr, i4, i - i4);
                if (i6 == -1) {
                    t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
                this.j += i6;
                i4 += i6;
            } catch (bj1 e2) {
                e2.a = true;
                throw e2;
            }
        }
        return bArr;
    }

    @Override // defpackage.v9g
    public final long h() {
        return w();
    }

    public final ArrayList h(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                try {
                    int i3 = this.d.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return null;
                    }
                    this.j += i3;
                    i2 += i3;
                } catch (bj1 e) {
                    e.a = true;
                    throw e;
                }
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // defpackage.v9g
    public final float i() {
        return Float.intBitsToFloat(v());
    }

    public final void i(int i) throws bj1 {
        if (l(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.j) - this.h) {
            t3p.j("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        } else {
            t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // defpackage.v9g
    public final int j() {
        return x();
    }

    public final void j(int i) throws bj1 {
        int i2 = this.f;
        int i3 = this.h;
        if (i <= i2 - i3 && i >= 0) {
            this.h = i3 + i;
            return;
        }
        InputStream inputStream = this.d;
        if (i < 0) {
            t3p.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return;
        }
        int i4 = this.j + i3;
        if (a(i4, i, Integer.MAX_VALUE)) {
            t3p.j("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return;
        }
        if (a(i4, i, this.k)) {
            int i5 = this.k;
            if (i5 >= i4) {
                j(i5 - i4);
            }
            t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return;
        }
        int i6 = this.j;
        int i7 = this.h;
        this.j = i6 + i7;
        int i8 = this.f - i7;
        this.f = 0;
        this.h = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip >= 0 && jSkip <= j) {
                        if (jSkip == 0) {
                            break;
                        } else {
                            i8 += (int) jSkip;
                        }
                    } else {
                        throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                } catch (bj1 e) {
                    e.a = true;
                    throw e;
                }
            } finally {
                this.j += i8;
                z();
            }
        }
        if (i8 >= i) {
            return;
        }
        int i9 = this.f;
        int i10 = i9 - this.h;
        this.h = i9;
        i(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f;
            if (i11 <= i12) {
                this.h = i11;
                return;
            } else {
                i10 += i12;
                this.h = i12;
                i(1);
            }
        }
    }

    @Override // defpackage.v9g
    public final long k() {
        return y();
    }

    @Override // defpackage.v9g
    public final int l() {
        return v();
    }

    public final boolean l(int i) throws IOException {
        InputStream inputStream = this.d;
        int i2 = this.h;
        if (i2 + i <= this.f) {
            qp2.n(p3p.i(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i3 = this.j + i2;
        if (!a(i3, i, Integer.MAX_VALUE) && !a(i3, i, this.k)) {
            int i4 = this.h;
            byte[] bArr = this.e;
            if (i4 > 0) {
                int i5 = this.f;
                if (i5 > i4) {
                    System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                }
                this.j += i4;
                this.f -= i4;
                this.h = 0;
            }
            int i6 = this.f;
            try {
                int i7 = inputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.j) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.f += i7;
                    z();
                    if (this.f >= i || l(i)) {
                        return true;
                    }
                }
            } catch (bj1 e) {
                e.a = true;
                throw e;
            }
        }
        return false;
    }

    @Override // defpackage.v9g
    public final long m() {
        return w();
    }

    @Override // defpackage.v9g
    public final int n() {
        return v9g.b(x());
    }

    @Override // defpackage.v9g
    public final long o() {
        return v9g.a(y());
    }

    @Override // defpackage.v9g
    public final String p() throws bj1 {
        int iX = x();
        byte[] bArr = this.e;
        if (iX > 0) {
            int i = this.f;
            int i2 = this.h;
            if (iX <= i - i2) {
                String str = new String(bArr, i2, iX, StandardCharsets.UTF_8);
                this.h += iX;
                return str;
            }
        }
        if (iX == 0) {
            return "";
        }
        if (iX < 0) {
            t3p.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        if (iX > this.f) {
            return new String(f(iX), StandardCharsets.UTF_8);
        }
        i(iX);
        String str2 = new String(bArr, this.h, iX, StandardCharsets.UTF_8);
        this.h += iX;
        return str2;
    }

    @Override // defpackage.v9g
    public final String q() throws IOException {
        int iX = x();
        int i = this.h;
        int i2 = this.f;
        int i3 = i2 - i;
        byte[] bArrF = this.e;
        if (iX <= i3 && iX > 0) {
            this.h = i + iX;
        } else {
            if (iX == 0) {
                return "";
            }
            if (iX < 0) {
                t3p.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
            i = 0;
            if (iX <= i2) {
                i(iX);
                this.h = iX;
            } else {
                bArrF = f(iX);
            }
        }
        if (iX != 0) {
            return sm3.a.a(bArrF, i, iX);
        }
        ocp ocpVar = sm3.a;
        return "";
    }

    @Override // defpackage.v9g
    public final int r() throws bj1 {
        if (b()) {
            this.i = 0;
            return 0;
        }
        int iX = x();
        this.i = iX;
        if ((iX >>> 3) != 0) {
            return iX;
        }
        t3p.j("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // defpackage.v9g
    public final int s() {
        return x();
    }

    @Override // defpackage.v9g
    public final long t() {
        return y();
    }

    public final int v() throws bj1 {
        int i = this.h;
        if (this.f - i < 4) {
            i(4);
            i = this.h;
        }
        this.h = i + 4;
        byte[] bArr = this.e;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public final long w() throws bj1 {
        int i = this.h;
        if (this.f - i < 8) {
            i(8);
            i = this.h;
        }
        this.h = i + 8;
        byte[] bArr = this.e;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public final int x() throws bj1 {
        int i;
        int i2 = this.h;
        int i3 = this.f;
        byte[] bArr = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        i5 = i2 + 4;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i5];
                            i = (i9 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i5 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i5] < 0) {
                                        i5 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i5] < 0) {
                                                int i10 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i10;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i5 = i7;
                }
                this.h = i5;
                return i;
            }
        }
        long j = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            if (this.h == this.f) {
                i(1);
            }
            int i12 = this.h;
            this.h = i12 + 1;
            j |= (r5 & Byte.MAX_VALUE) << i11;
            if ((bArr[i12] & 128) == 0) {
                return (int) j;
            }
        }
        t3p.j("CodedInputStream encountered a malformed varint.");
        return 0;
    }

    public final long y() throws bj1 {
        long j;
        long j2;
        long j3;
        int i;
        int i2 = this.h;
        int i3 = this.f;
        byte[] bArr = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.h = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i2 + 3;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        j3 = i8 ^ 16256;
                        i5 = i7;
                    } else {
                        i5 = i2 + 4;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            int i10 = i2 + 5;
                            long j4 = i9 ^ (bArr[i5] << 28);
                            if (j4 >= 0) {
                                j2 = 266354560;
                            } else {
                                i5 = i2 + 6;
                                long j5 = j4 ^ (bArr[i10] << 35);
                                if (j5 < 0) {
                                    j = -34093383808L;
                                } else {
                                    i10 = i2 + 7;
                                    j4 = j5 ^ (bArr[i5] << 42);
                                    if (j4 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i5 = i2 + 8;
                                        j5 = j4 ^ (bArr[i10] << 49);
                                        if (j5 < 0) {
                                            j = -558586000294016L;
                                        } else {
                                            i10 = i2 + 9;
                                            j4 = j5 ^ (bArr[i5] << 56);
                                            if (j4 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                i5 = i2 + 10;
                                                j5 = j4 ^ (bArr[i10] << 63);
                                                if (j5 >= 0) {
                                                    j = -9151873028817141888L;
                                                }
                                            }
                                        }
                                    }
                                }
                                j3 = j ^ j5;
                            }
                            j3 = j4 ^ j2;
                            i5 = i10;
                        }
                    }
                    this.h = i5;
                    return j3;
                }
                i = i6 ^ (-128);
                j3 = i;
                this.h = i5;
                return j3;
            }
        }
        long j6 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            if (this.h == this.f) {
                i(1);
            }
            int i12 = this.h;
            this.h = i12 + 1;
            j6 |= (r1 & Byte.MAX_VALUE) << i11;
            if ((bArr[i12] & 128) == 0) {
                return j6;
            }
        }
        t3p.j("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    public final void z() {
        int i = this.f + this.g;
        this.f = i;
        int i2 = this.j + i;
        int i3 = this.k;
        if (i2 <= i3) {
            this.g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.g = i4;
        this.f = i - i4;
    }
}
