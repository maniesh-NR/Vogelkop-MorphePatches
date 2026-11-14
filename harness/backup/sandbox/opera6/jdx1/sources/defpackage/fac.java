package defpackage;

import ads_mobile_sdk.bj1;
import ads_mobile_sdk.hr;
import ads_mobile_sdk.ku0;
import ads_mobile_sdk.op1;
import ads_mobile_sdk.qb1;
import ads_mobile_sdk.sm3;
import ads_mobile_sdk.yk3;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import kotlin.text.c;

/* loaded from: classes.dex */
public final class fac {
    public final /* synthetic */ byte a;
    public final SideSheetBehavior b;

    public /* synthetic */ fac(SideSheetBehavior sideSheetBehavior, byte b) {
        this.a = b;
        this.b = sideSheetBehavior;
    }

    public static final float A(long j, float f, n27 n27Var) {
        float fC;
        long jB = rkl.b(j);
        if (skl.a(jB, 4294967296L)) {
            if (n27Var.n0() <= 1.05d) {
                return n27Var.Q(j);
            }
            fC = rkl.c(j) / rkl.c(n27Var.u(f));
        } else {
            if (!skl.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = rkl.c(j);
        }
        return fC * f;
    }

    public static final oml B(umi umiVar, long j, Function0 function0) {
        Unit unit = Unit.a;
        oml omlVar = new oml(umiVar.f(new crk(new p01(function0, (byte) 14), (byte) 10)));
        coh.k(omlVar, unit, j);
        return omlVar;
    }

    public static oml C(umi umiVar, Function0 function0) {
        pn7.b.getClass();
        return B(umiVar, 0L, function0);
    }

    public static final void D(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(cs5.u0(j)), i, i2, 33);
        }
    }

    public static final void E(Spannable spannable, long j, n27 n27Var, int i, int i2) {
        long jB = rkl.b(j);
        if (skl.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(zed.b(n27Var.Q(j)), false), i, i2, 33);
        } else if (skl.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(rkl.c(j)), i, i2, 33);
        }
    }

    public static final void F(Spannable spannable, awc awcVar, int i, int i2) {
        if (awcVar != null) {
            ArrayList arrayList = new ArrayList(k95.o(awcVar, 10));
            Iterator it = awcVar.a.iterator();
            while (it.hasNext()) {
                arrayList.add(((yvc) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final long G(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static final nz5 H(tj1 tj1Var) {
        ebb q0iVar;
        ebb ebbVar;
        ec ecVarZ0;
        String str = tj1Var.a;
        oj1 oj1Var = tj1Var.b;
        lz5 lz5Var = new lz5(oj1Var.a, oj1Var.b);
        String str2 = tj1Var.c;
        String str3 = tj1Var.d;
        if (str3 != null) {
            try {
                p0i p0iVar = t0i.b;
                ebb ebbVar2 = ebb.c;
                q0iVar = j06.q(str3);
            } catch (Throwable th) {
                p0i p0iVar2 = t0i.b;
                q0iVar = new q0i(th);
            }
            Throwable thD = t0i.d(q0iVar);
            if (thD != null) {
                gzc gzcVar = hzc.c;
                gzcVar.getClass();
                eaj eajVar = eaj.d;
                if (gzcVar.a.a.compareTo(eajVar) <= 0) {
                    gzcVar.b(eajVar, "", "Failed to parse coupon campaign expiresAt: ".concat(str3), thD);
                }
            }
            if (q0iVar instanceof q0i) {
                q0iVar = null;
            }
            ebbVar = q0iVar;
            ecVarZ0 = null;
        } else {
            ebbVar = null;
            ecVarZ0 = null;
        }
        sj1 sj1Var = tj1Var.e;
        mz5 mz5Var = new mz5(sj1Var.a, sj1Var.b);
        xh1 xh1Var = tj1Var.f;
        if (xh1Var != null) {
            ecVarZ0 = p37.z0(xh1Var);
        }
        return new nz5(str, lz5Var, str2, ebbVar, mz5Var, ecVarZ0, tj1Var.g);
    }

    public static i0n J(int i, String str) {
        return new i0n(new bab(0, 0, 0, 0), str);
    }

    public static X509Certificate[][] K(String str) throws IOException {
        Pair pairT;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() < 22) {
                pairT = null;
            } else {
                pairT = a4h.t(randomAccessFile, 0);
                if (pairT == null) {
                    pairT = a4h.t(randomAccessFile, 65535);
                }
            }
            if (pairT == null) {
                throw new lv0("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairT.first;
            long jLongValue = ((Long) pairT.second).longValue();
            long j = jLongValue - 20;
            if (j >= 0) {
                randomAccessFile.seek(j);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new lv0("ZIP64 APK not supported");
                }
            }
            a4h.u(byteBuffer);
            long j2 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
            if (j2 >= jLongValue) {
                throw new lv0("ZIP Central Directory offset out of range: " + j2 + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            a4h.u(byteBuffer);
            if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j2 != jLongValue) {
                throw new lv0("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j2 < 32) {
                throw new lv0("APK too small for APK Signing Block. ZIP Central Directory offset: " + j2);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(j2 - byteBufferAllocate.capacity());
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new lv0("No APK Signing Block before ZIP Central Directory");
            }
            long j3 = byteBufferAllocate.getLong(0);
            if (j3 < byteBufferAllocate.capacity() || j3 > 2147483639) {
                throw new lv0("APK Signing Block size out of range: " + j3);
            }
            int i = (int) (j3 + 8);
            long j4 = j2 - i;
            if (j4 < 0) {
                throw new lv0("APK Signing Block offset out of range: " + j4);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j4);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j5 = byteBufferAllocate2.getLong(0);
            if (j5 != j3) {
                throw new lv0("APK Signing Block sizes in header and footer do not match: " + j5 + " vs " + j3);
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j4));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                int i2 = 0;
                while (byteBufferSlice.hasRemaining()) {
                    i2++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new lv0("Insufficient data to read size of APK Signing Block entry #" + i2);
                    }
                    long j6 = byteBufferSlice.getLong();
                    if (j6 < 4 || j6 > 2147483647L) {
                        throw new lv0("APK Signing Block entry #" + i2 + " size out of range: " + j6);
                    }
                    int i3 = (int) j6;
                    int iPosition2 = byteBufferSlice.position() + i3;
                    if (i3 > byteBufferSlice.remaining()) {
                        throw new lv0("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrU = U(randomAccessFile.getChannel(), new vi5(O(i3 - 4, byteBufferSlice), jLongValue2, j2, jLongValue, byteBuffer));
                        randomAccessFile.close();
                        return x509CertificateArrU;
                    }
                    ByteBuffer byteBuffer3 = byteBuffer;
                    long j7 = jLongValue2;
                    long j8 = jLongValue;
                    byteBufferSlice.position(iPosition2);
                    jLongValue = j8;
                    jLongValue2 = j7;
                    byteBuffer = byteBuffer3;
                }
                throw new lv0("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th) {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                throw th;
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int L(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        qp2.o(sko.i(i, "Unknown content digest algorthm: "));
        return 0;
    }

    public static int M(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                qp2.o("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                return 0;
        }
    }

    public static String N(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        qp2.o(sko.i(i, "Unknown content digest algorthm: "));
        return null;
    }

    public static ByteBuffer O(int i, ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    public static ByteBuffer P(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            s49.m(sko.i(byteBuffer.remaining(), "Remaining buffer too short to contain length of length-prefixed field. Remaining: "));
            return null;
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            qp2.o("Negative length");
            return null;
        }
        if (i <= byteBuffer.remaining()) {
            return O(i, byteBuffer);
        }
        s49.m(sko.h(i, byteBuffer.remaining(), "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: "));
        return null;
    }

    public static void Q(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    public static byte[] R(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        if (i < 0) {
            s49.m("Negative length");
            return null;
        }
        if (i > byteBuffer.remaining()) {
            s49.m(sko.h(i, byteBuffer.remaining(), "Underflow while reading length-prefixed value. Length: ", ", available: "));
            return null;
        }
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static X509Certificate[] S(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferP = P(byteBuffer);
        ByteBuffer byteBufferP2 = P(byteBuffer);
        byte[] bArrR = R(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrR2 = null;
        int i = -1;
        int i2 = 0;
        while (byteBufferP2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer byteBufferP3 = P(byteBufferP2);
                if (byteBufferP3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = byteBufferP3.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i != -1) {
                    int iM = M(i3);
                    int iM2 = M(i);
                    if (iM == 1 || iM2 != 1) {
                    }
                }
                bArrR2 = R(byteBufferP3);
                i = i3;
            } catch (IOException | BufferUnderflowException e) {
                throw new SecurityException(sko.i(i2, "Failed to parse signature record #"), e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                t3p.u("No signatures found");
                return null;
            }
            t3p.u("No supported signatures found");
            return null;
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    qp2.o("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    return null;
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    qp2.o("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    return null;
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrR));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferP);
            if (!signature.verify(bArrR2)) {
                t3p.u(String.valueOf(str2).concat(" signature did not verify"));
                return null;
            }
            byteBufferP.clear();
            ByteBuffer byteBufferP4 = P(byteBufferP);
            ArrayList arrayList2 = new ArrayList();
            byte[] bArrR3 = null;
            int i4 = 0;
            while (byteBufferP4.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer byteBufferP5 = P(byteBufferP4);
                    if (byteBufferP5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = byteBufferP5.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i) {
                        bArrR3 = R(byteBufferP5);
                    }
                } catch (IOException | BufferUnderflowException e2) {
                    throw new IOException(sko.i(i4, "Failed to parse digest record #"), e2);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                t3p.u("Signature algorithms don't match between digests and signatures records");
                return null;
            }
            int iM3 = M(i);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iM3), bArrR3);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrR3)) {
                t3p.u(N(iM3).concat(" contents digest does not match the digest specified by a preceding signer"));
                return null;
            }
            ByteBuffer byteBufferP6 = P(byteBufferP);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (byteBufferP6.hasRemaining()) {
                i6++;
                byte[] bArrR4 = R(byteBufferP6);
                try {
                    arrayList3.add(new tsp((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrR4)), bArrR4, (byte) 0));
                } catch (CertificateException e3) {
                    throw new SecurityException(sko.i(i6, "Failed to decode certificate #"), e3);
                }
            }
            if (arrayList3.isEmpty()) {
                t3p.u("No certificates listed");
                return null;
            }
            if (Arrays.equals(bArrR, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            t3p.u("Public key mismatch between certificate and signature record");
            return null;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
            throw new SecurityException(sko.k("Failed to verify ", str2, " signature"), e4);
        }
    }

    public static byte[][] T(int[] iArr, fqp[] fqpVarArr) throws DigestException {
        long j;
        int i;
        int length;
        char c;
        byte[][] bArr;
        String str;
        int i2 = 0;
        int i3 = 0;
        long jZza = 0;
        while (true) {
            j = 1048576;
            if (i3 >= 3) {
                break;
            }
            jZza += (fqpVarArr[i3].zza() + 1048575) / 1048576;
            i3++;
        }
        if (jZza >= 2097151) {
            throw new DigestException(p3p.l(jZza, "Too many chunks: "));
        }
        byte[][] bArr2 = new byte[iArr.length][];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            c = 5;
            if (i4 >= length) {
                break;
            }
            int i5 = (int) jZza;
            byte[] bArr3 = new byte[(L(iArr[i4]) * i5) + 5];
            bArr3[0] = 90;
            Q(i5, bArr3);
            bArr2[i4] = bArr3;
            i4++;
        }
        byte[] bArr4 = new byte[5];
        bArr4[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i6 = 0;
        while (true) {
            bArr = null;
            str = " digest not supported";
            if (i6 >= iArr.length) {
                break;
            }
            String strN = N(iArr[i6]);
            try {
                messageDigestArr[i6] = MessageDigest.getInstance(strN);
                i6++;
            } catch (NoSuchAlgorithmException e) {
                h9o.s(strN.concat(" digest not supported"), e);
                return null;
            }
        }
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i7 < i; i = 3) {
            fqp fqpVar = fqpVarArr[i7];
            int i9 = i7;
            long jZza2 = fqpVar.zza();
            byte[][] bArr5 = bArr2;
            long j2 = 0;
            while (jZza2 > 0) {
                byte[][] bArr6 = bArr;
                String str2 = str;
                int iMin = (int) Math.min(jZza2, j);
                Q(iMin, bArr4);
                for (int i10 = 0; i10 < length; i10++) {
                    messageDigestArr[i10].update(bArr4);
                }
                try {
                    fqpVar.b(messageDigestArr, j2, iMin);
                    int i11 = 0;
                    while (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        byte[] bArr7 = bArr5[i11];
                        int iL = L(i12);
                        char c2 = c;
                        MessageDigest messageDigest = messageDigestArr[i11];
                        fqp fqpVar2 = fqpVar;
                        int iDigest = messageDigest.digest(bArr7, (i8 * iL) + 5, iL);
                        if (iDigest != iL) {
                            t3p.g(iDigest, messageDigest.getAlgorithm());
                            return bArr6;
                        }
                        i11++;
                        c = c2;
                        fqpVar = fqpVar2;
                    }
                    long j3 = iMin;
                    j2 += j3;
                    jZza2 -= j3;
                    i8++;
                    bArr = bArr6;
                    str = str2;
                    j = 1048576;
                } catch (IOException e2) {
                    throw new DigestException(sko.h(i8, i2, "Failed to digest chunk #", " of section #"), e2);
                }
            }
            i2++;
            i7 = i9 + 1;
            bArr2 = bArr5;
            j = 1048576;
        }
        byte[][] bArr8 = bArr2;
        byte[][] bArr9 = bArr;
        String str3 = str;
        byte[][] bArr10 = new byte[iArr.length][];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            byte[] bArr11 = bArr8[i13];
            String strN2 = N(i14);
            try {
                bArr10[i13] = MessageDigest.getInstance(strN2).digest(bArr11);
            } catch (NoSuchAlgorithmException e3) {
                h9o.s(strN2.concat(str3), e3);
                return bArr9;
            }
        }
        return bArr10;
    }

    public static X509Certificate[][] U(FileChannel fileChannel, vi5 vi5Var) throws CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferP = P((ByteBuffer) vi5Var.d);
                int i = 0;
                while (byteBufferP.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(S(P(byteBufferP), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(p3p.i(i, "Failed to parse/verify signer #", " block"), e);
                    }
                }
                if (i <= 0) {
                    t3p.u("No signers found");
                    return null;
                }
                if (map.isEmpty()) {
                    t3p.u("No content digests found");
                    return null;
                }
                long j = vi5Var.a;
                long j2 = vi5Var.b;
                long j3 = vi5Var.c;
                ByteBuffer byteBuffer = (ByteBuffer) vi5Var.e;
                if (map.isEmpty()) {
                    t3p.u("No digests provided");
                    return null;
                }
                fqp t59Var = new t59(fileChannel, 0L, j);
                fqp t59Var2 = new t59(fileChannel, j2, j3 - j2);
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                a4h.u(byteBufferDuplicate);
                int iPosition = byteBufferDuplicate.position() + 16;
                if (j < 0 || j > 4294967295L) {
                    qp2.o(p3p.l(j, "uint32 value of out range: "));
                    return null;
                }
                byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j);
                fqp bxkVar = new bxk(byteBufferDuplicate);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it = map.keySet().iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    iArr[i2] = ((Integer) it.next()).intValue();
                    i2++;
                }
                try {
                    byte[][] bArrT = T(iArr, new fqp[]{t59Var, t59Var2, bxkVar});
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = iArr[i3];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i4)), bArrT[i3])) {
                            t3p.u(N(i4).concat(" digest of contents did not verify"));
                            return null;
                        }
                    }
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } catch (DigestException e2) {
                    throw new SecurityException("Failed to compute digest(s) of contents", e2);
                }
            } catch (IOException e3) {
                throw new SecurityException("Failed to read list of signers", e3);
            }
        } catch (CertificateException e4) {
            h9o.s("Failed to obtain X.509 CertificateFactory", e4);
            return null;
        }
    }

    public static int a(int i, byte[] bArr, int i2, int i3, f72 f72Var) throws bj1 {
        if ((i >>> 3) == 0) {
            t3p.j("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return p(bArr, i2, f72Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return n(bArr, i2, f72Var) + f72Var.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            t3p.j("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = f72Var.d + 1;
        f72Var.d = i6;
        if (i6 >= 100) {
            t3p.j("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i7 = 0;
        while (i2 < i3) {
            i2 = n(bArr, i2, f72Var);
            i7 = f72Var.a;
            if (i7 == i5) {
                break;
            }
            i2 = a(i7, bArr, i2, i3, f72Var);
        }
        f72Var.d--;
        if (i2 <= i3 && i7 == i5) {
            return i2;
        }
        t3p.j("Failed to parse the message.");
        return 0;
    }

    public static int b(int i, byte[] bArr, int i2, int i3, yk3 yk3Var, f72 f72Var) throws bj1 {
        if ((i >>> 3) == 0) {
            t3p.j("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iP = p(bArr, i2, f72Var);
            yk3Var.a(i, Long.valueOf(f72Var.b));
            return iP;
        }
        if (i4 == 1) {
            yk3Var.a(i, Long.valueOf(k(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iN = n(bArr, i2, f72Var);
            int i5 = f72Var.a;
            if (i5 < 0) {
                t3p.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i5 > bArr.length - iN) {
                t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i5 == 0) {
                yk3Var.a(i, hr.b);
            } else {
                yk3Var.a(i, hr.a(iN, i5, bArr));
            }
            return iN + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                yk3Var.a(i, Integer.valueOf(h(i2, bArr)));
                return i2 + 4;
            }
            t3p.j("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        yk3 yk3VarB = yk3.b();
        int i6 = (i & (-8)) | 4;
        int i7 = f72Var.d + 1;
        f72Var.d = i7;
        if (i7 >= 100) {
            t3p.j("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iN2 = n(bArr, i2, f72Var);
            int i9 = f72Var.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iN2;
                break;
            }
            i2 = b(i9, bArr, iN2, i3, yk3VarB, f72Var);
            i8 = i9;
        }
        f72Var.d--;
        if (i2 > i3 || i8 != i6) {
            t3p.j("Failed to parse the message.");
            return 0;
        }
        yk3Var.a(i, yk3VarB);
        return i2;
    }

    public static int c(int i, byte[] bArr, int i2, f72 f72Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            f72Var.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            f72Var.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            f72Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            f72Var.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                f72Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int d(Object obj, pio pioVar, byte[] bArr, int i, int i2, int i3, f72 f72Var) throws bj1 {
        op1 op1Var = (op1) pioVar;
        int i4 = f72Var.d + 1;
        f72Var.d = i4;
        if (i4 >= 100) {
            t3p.j("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iA = op1Var.a(obj, bArr, i, i2, i3, f72Var);
        f72Var.d--;
        f72Var.c = obj;
        return iA;
    }

    public static int e(Object obj, pio pioVar, byte[] bArr, int i, int i2, f72 f72Var) throws bj1 {
        int iC = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iC = c(i3, bArr, iC, f72Var);
            i3 = f72Var.a;
        }
        int i4 = iC;
        if (i3 < 0 || i3 > i2 - i4) {
            t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i5 = f72Var.d + 1;
        f72Var.d = i5;
        if (i5 >= 100) {
            t3p.j("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i6 = i4 + i3;
        pioVar.a(obj, bArr, i4, i6, f72Var);
        f72Var.d--;
        f72Var.c = obj;
        return i6;
    }

    public static int f(byte[] bArr, int i, f72 f72Var) throws bj1 {
        int iN = n(bArr, i, f72Var);
        int i2 = f72Var.a;
        if (i2 < 0) {
            t3p.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iN) {
            t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i2 == 0) {
            f72Var.c = hr.b;
            return iN;
        }
        f72Var.c = hr.a(iN, i2, bArr);
        return iN + i2;
    }

    public static final ArrayList g(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            xxo xxoVar = (xxo) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", xxoVar.a);
            bundle.putLong("event_timestamp", xxoVar.b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static int h(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    public static int i(pio pioVar, int i, byte[] bArr, int i2, int i3, flp flpVar, f72 f72Var) throws bj1 {
        ku0 ku0VarA = pioVar.a();
        pio pioVar2 = pioVar;
        byte[] bArr2 = bArr;
        int i4 = i3;
        f72 f72Var2 = f72Var;
        int iE = e(ku0VarA, pioVar2, bArr2, i2, i4, f72Var2);
        pioVar2.c(ku0VarA);
        f72Var2.c = ku0VarA;
        flpVar.add(ku0VarA);
        while (iE < i4) {
            int iC = iE + 1;
            byte b = bArr2[iE];
            if (b >= 0) {
                f72Var2.a = b;
            } else {
                iC = c(b, bArr2, iC, f72Var2);
            }
            if (i != f72Var2.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            pio pioVar3 = pioVar2;
            ku0 ku0VarA2 = pioVar3.a();
            f72 f72Var3 = f72Var2;
            int i5 = i4;
            iE = e(ku0VarA2, pioVar3, bArr3, iC, i5, f72Var3);
            pioVar2 = pioVar3;
            bArr2 = bArr3;
            i4 = i5;
            f72Var2 = f72Var3;
            pioVar2.c(ku0VarA2);
            f72Var2.c = ku0VarA2;
            flpVar.add(ku0VarA2);
        }
        return iE;
    }

    public static int j(byte[] bArr, int i, f72 f72Var) throws bj1 {
        int iN = n(bArr, i, f72Var);
        int i2 = f72Var.a;
        if (i2 < 0) {
            t3p.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        String strA = "";
        if (i2 == 0) {
            f72Var.c = "";
            return iN;
        }
        if (i2 == 0) {
            ocp ocpVar = sm3.a;
        } else {
            strA = sm3.a.a(bArr, iN, i2);
        }
        f72Var.c = strA;
        return iN + i2;
    }

    public static long k(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    public static byte l(long j) {
        z4o.u(j, (j >> 8) == 0, "out of range: %s");
        return (byte) j;
    }

    public static k3o m(ih5 ih5Var) {
        vt9 vt9Var = (vt9) ih5Var;
        View view = (View) vt9Var.j(j41.f);
        k3o k3oVarS = s(view);
        boolean zH = vt9Var.h(k3oVarS) | vt9Var.h(view);
        Object objK = vt9Var.K();
        if (zH || objK == hh5.a) {
            objK = new gil(k3oVarS, view, (byte) 24);
            vt9Var.g0(objK);
        }
        rm5.b(k3oVarS, (Function1) objK, vt9Var);
        return k3oVarS;
    }

    public static int n(byte[] bArr, int i, f72 f72Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return c(b, bArr, i2, f72Var);
        }
        f72Var.a = b;
        return i2;
    }

    public static final void o(wub wubVar, String str) {
        if (!c.q(str, "0x", false)) {
            str = "0x".concat(str);
        }
        wubVar.O("data", str);
    }

    public static int p(byte[] bArr, int i, f72 f72Var) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            f72Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        f72Var.b = j2;
        return i3;
    }

    public static k3o s(View view) {
        k3o k3oVar;
        WeakHashMap weakHashMap = k3o.x;
        synchronized (weakHashMap) {
            Object k3oVar2 = weakHashMap.get(view);
            if (k3oVar2 == null) {
                k3oVar2 = new k3o(view);
                weakHashMap.put(view, k3oVar2);
            }
            k3oVar = (k3o) k3oVar2;
        }
        return k3oVar;
    }

    public static int v(byte[] bArr, int i, flp flpVar, f72 f72Var) throws bj1 {
        qb1 qb1Var = (qb1) flpVar;
        int iN = n(bArr, i, f72Var);
        int i2 = f72Var.a;
        if (i2 < 0) {
            t3p.j("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i2 > bArr.length - iN) {
            t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i3 = i2 + iN;
        while (iN < i3) {
            int i4 = iN + 1;
            byte b = bArr[iN];
            if (b >= 0) {
                f72Var.a = b;
                iN = i4;
            } else {
                iN = c(b, bArr, i4, f72Var);
            }
            qb1Var.b(f72Var.a);
        }
        if (iN == i3) {
            return iN;
        }
        t3p.j("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static final eek w(final d4 d4Var, tcc tccVar) {
        if (((qdc) tccVar).i.compareTo(qcc.a) <= 0) {
            rqd.o("Cannot configure ", d4Var, " to disposeComposition at Lifecycle ON_DESTROY: ", tccVar, "is already destroyed");
            return null;
        }
        final byte b = 2;
        idc idcVar = new idc() { // from class: h9
            @Override // defpackage.idc
            public final void E(ndc ndcVar, occ occVar) {
                byte b2 = b;
                Object obj = d4Var;
                switch (b2) {
                    case 0:
                        ((Function1) obj).invoke(occVar);
                        break;
                    case 1:
                        ijd ijdVar = (ijd) obj;
                        if (occVar != occ.ON_START) {
                            if (occVar == occ.ON_STOP) {
                                ijdVar.c = false;
                                break;
                            }
                        } else {
                            ijdVar.c = true;
                            break;
                        }
                        break;
                    default:
                        d4 d4Var2 = (d4) obj;
                        if (occVar == occ.ON_DESTROY) {
                            d4Var2.e();
                            break;
                        }
                        break;
                }
            }
        };
        tccVar.a(idcVar);
        return new eek(tccVar, idcVar, (byte) 23);
    }

    public static int x(int i, byte[] bArr, int i2, int i3, flp flpVar, f72 f72Var) {
        qb1 qb1Var = (qb1) flpVar;
        int iN = n(bArr, i2, f72Var);
        qb1Var.b(f72Var.a);
        while (iN < i3) {
            int iC = iN + 1;
            byte b = bArr[iN];
            if (b >= 0) {
                f72Var.a = b;
            } else {
                iC = c(b, bArr, iC, f72Var);
            }
            if (i != f72Var.a) {
                break;
            }
            iN = iC + 1;
            byte b2 = bArr[iC];
            if (b2 >= 0) {
                f72Var.a = b2;
            } else {
                iN = c(b2, bArr, iN, f72Var);
            }
            qb1Var.b(f72Var.a);
        }
        return iN;
    }

    public static a4h y(Context context) {
        int i = Build.VERSION.SDK_INT;
        op opVar = op.a;
        if ((i >= 33 ? opVar.a() : 0) >= 11) {
            return new bwl(context, (byte) 2);
        }
        if ((i >= 33 ? opVar.a() : 0) >= 5) {
            return new bwl(context, (byte) 4);
        }
        if ((i >= 33 ? opVar.a() : 0) == 4) {
            return new bwl(context, (byte) 3);
        }
        np npVar = np.a;
        Object objInvoke = null;
        if (((i == 31 || i == 32) ? npVar.a() : 0) >= 11) {
            try {
                objInvoke = new yfd(context, (byte) 1).invoke(context);
            } catch (NoClassDefFoundError unused) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 == 31 || i2 == 32) {
                    npVar.a();
                }
            }
            return (a4h) objInvoke;
        }
        if (((i == 31 || i == 32) ? npVar.a() : 0) < 9) {
            return null;
        }
        try {
            objInvoke = new yfd(context, (byte) 2).invoke(context);
        } catch (NoClassDefFoundError unused2) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 == 31 || i3 == 32) {
                npVar.a();
            }
        }
        return (a4h) objInvoke;
    }

    public static String z(dwj dwjVar, Charset charset, int i) throws EOFException {
        int i2;
        String str;
        if ((i & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        for (long j = 1; dwjVar.request(j); j <<= 1) {
        }
        c04 c04VarU = dwjVar.u();
        long j2 = dwjVar.u().c;
        if (j2 < 0 || j2 > 2147483647L) {
            bxl.d(z1m.j(j2, "byteCount (", ") is not within the range [0..2147483647)"));
            return null;
        }
        if (c04VarU.c < j2) {
            StringBuilder sbQ = p3p.q(j2, "Buffer contains less bytes then required (byteCount: ", ", size: ");
            sbQ.append(c04VarU.c);
            sbQ.append(')');
            throw new EOFException(sbQ.toString());
        }
        if (j2 == 0) {
            return "";
        }
        if (c04VarU.x()) {
            qp2.o("Buffer is empty");
            return null;
        }
        cxi cxiVar = c04VarU.a;
        byte[] bArr = cxiVar.a;
        int i3 = cxiVar.b;
        if (cxiVar.c - i3 >= j2) {
            i2 = (int) j2;
            str = new String(bArr, i3, i2, charset);
        } else {
            i2 = 0;
            str = null;
        }
        if (i2 != 0) {
            if (i2 < 0) {
                qp2.n("Returned negative read bytes count");
                return null;
            }
            if (i2 > cxiVar.b()) {
                qp2.n("Returned too many bytes");
                return null;
            }
            c04VarU.skip(i2);
        }
        return str == null ? new String(w0h.l(c04VarU, (int) j2), charset) : str;
    }

    public final void I(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.a) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }

    public final int q() {
        byte b = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (b) {
            case 0:
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                return Math.max(0, (sideSheetBehavior.m - sideSheetBehavior.l) - sideSheetBehavior.o);
        }
    }

    public final int r() {
        byte b = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (b) {
            case 0:
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    public final int t(View view) {
        byte b = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (b) {
            case 0:
                return view.getRight() + sideSheetBehavior.o;
            default:
                return view.getLeft() - sideSheetBehavior.o;
        }
    }

    public final int u() {
        switch (this.a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }
}
