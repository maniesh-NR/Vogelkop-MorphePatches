package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class xsn {
    public static final Pattern g = Pattern.compile("webapk:\\d+:([a-fA-F0-9]+)");
    public final MappedByteBuffer a;
    public char b;
    public int c;
    public int d;
    public String e;
    public ArrayList f;

    public xsn(MappedByteBuffer mappedByteBuffer) {
        this.a = mappedByteBuffer;
        mappedByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }

    public static byte[] b(String str) {
        Matcher matcher = g.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String strGroup = matcher.group(1);
        int length = strGroup.length();
        if (length % 2 != 0) {
            return null;
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (Character.digit(strGroup.charAt(i + 1), 16) + (Character.digit(strGroup.charAt(i), 16) << 4));
        }
        return bArr;
    }

    public final int a(Signature signature) throws SignatureException {
        Collections.sort(this.f);
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            wsn wsnVar = (wsn) obj;
            String str = wsnVar.a;
            int i3 = wsnVar.d;
            if (str.indexOf("META-INF/") == 0) {
                i++;
                if (i > 5) {
                    return 6;
                }
            } else {
                byte[] bytes = wsnVar.a.getBytes();
                int length = bytes.length;
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                byteBufferAllocate.putInt(length);
                signature.update(byteBufferAllocate.array());
                signature.update(bytes);
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                byteBufferAllocate2.order(byteOrder);
                byteBufferAllocate2.putInt(i3);
                signature.update(byteBufferAllocate2.array());
                h(wsnVar.b + wsnVar.c);
                ByteBuffer byteBufferSlice = this.a.slice();
                byteBufferSlice.limit(i3);
                signature.update(byteBufferSlice);
            }
        }
        return 0;
    }

    public final int c() {
        return this.a.getShort() & 65535;
    }

    public final int d() {
        int i = this.a.getInt();
        if (i >= 0) {
            return i;
        }
        h9o.u(p3p.l(i & 4294967295L, "32-bit value too large: "));
        return 0;
    }

    public final int e() {
        this.f = new ArrayList(this.b);
        h(this.c);
        int i = 0;
        while (true) {
            char c = this.b;
            MappedByteBuffer mappedByteBuffer = this.a;
            if (i >= c) {
                if (mappedByteBuffer.position() != this.d) {
                    return 7;
                }
                Collections.sort(this.f, wsn.e);
                ArrayList arrayList = this.f;
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    wsn wsnVar = (wsn) obj;
                    int i4 = wsnVar.b;
                    if (i4 != i2) {
                        return 7;
                    }
                    h(i4);
                    if (mappedByteBuffer.getInt() != 67324752) {
                        wxe.t("LFH Signature missing", new Object[0]);
                        return 1;
                    }
                    i(2);
                    int iC = c();
                    i(18);
                    int iC2 = c();
                    int iC3 = c();
                    int iPosition = mappedByteBuffer.position();
                    int i5 = wsnVar.b;
                    int i6 = (iPosition - i5) + iC2 + iC3;
                    wsnVar.c = i6;
                    int i7 = i5 + i6 + wsnVar.d;
                    if ((iC & 8) != 0) {
                        h(i7);
                        i7 = mappedByteBuffer.getInt() == 134695760 ? i7 + 16 : i7 + 12;
                    }
                    i2 = i7;
                }
                int i8 = this.c;
                if (i2 != i8) {
                    h(i8 - 16);
                    if (!"APK Sig Block 42".equals(g(16))) {
                        return 7;
                    }
                    if (this.c - i2 > 24576) {
                        return 8;
                    }
                }
                return 0;
            }
            if (mappedByteBuffer.getInt() != 33639248) {
                wxe.t("Missing Central Directory Signature", new Object[0]);
                return 1;
            }
            i(16);
            int iD = d();
            i(4);
            int iC4 = c();
            int iC5 = c();
            int iC6 = c();
            i(8);
            int iD2 = d();
            String strG = g(iC4);
            i(iC5 + iC6);
            if (iC6 > 0) {
                return 3;
            }
            this.f.add(new wsn(strG, iD2, iD));
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [char, int] */
    public final int f() {
        MappedByteBuffer mappedByteBuffer = this.a;
        int iLimit = mappedByteBuffer.limit();
        int i = iLimit - 22;
        int iMax = Math.max(0, iLimit - 65558);
        while (true) {
            if (i < iMax) {
                i = -1;
                break;
            }
            h(i);
            if (mappedByteBuffer.getInt() == 101010256) {
                break;
            }
            i--;
        }
        if (i < 0) {
            return 1;
        }
        this.d = i;
        h(i + 10);
        this.b = c();
        i(4);
        this.c = d();
        this.e = g(c());
        return mappedByteBuffer.position() < mappedByteBuffer.limit() ? 7 : 0;
    }

    public final String g(int i) {
        if (i <= 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        this.a.get(bArr);
        return new String(bArr);
    }

    public final void h(int i) {
        this.a.position(i);
    }

    public final void i(int i) {
        MappedByteBuffer mappedByteBuffer = this.a;
        mappedByteBuffer.position(mappedByteBuffer.position() + i);
    }

    public final int j(PublicKey publicKey) throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArrB = b(this.e);
        if (bArrB == null || bArrB.length == 0) {
            return 5;
        }
        try {
            Signature signature = Signature.getInstance("SHA256withECDSA");
            signature.initVerify(publicKey);
            int iA = a(signature);
            return iA != 0 ? iA : signature.verify(bArrB) ? 0 : 4;
        } catch (Exception unused) {
            return 4;
        }
    }
}
