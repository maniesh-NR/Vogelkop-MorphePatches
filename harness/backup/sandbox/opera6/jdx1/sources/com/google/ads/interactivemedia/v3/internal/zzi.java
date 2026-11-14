package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;
import defpackage.p3p;
import defpackage.t3p;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
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

/* loaded from: classes.dex */
public final class zzi {
    public static X509Certificate[][] a(String str) throws IOException {
        Pair pairA;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            if (randomAccessFile.length() < 22) {
                pairA = null;
            } else {
                pairA = zzj.a(randomAccessFile, 0);
                if (pairA == null) {
                    pairA = zzj.a(randomAccessFile, 65535);
                }
            }
            if (pairA == null) {
                throw new zzf("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairA.first;
            long jLongValue = ((Long) pairA.second).longValue();
            long j = jLongValue - 20;
            if (j >= 0) {
                randomAccessFile.seek(j);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new zzf("ZIP64 APK not supported");
                }
            }
            zzj.b(byteBuffer);
            long j2 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
            if (j2 >= jLongValue) {
                throw new zzf("ZIP Central Directory offset out of range: " + j2 + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            zzj.b(byteBuffer);
            if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j2 != jLongValue) {
                throw new zzf("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (j2 < 32) {
                throw new zzf("APK too small for APK Signing Block. ZIP Central Directory offset: " + j2);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(j2 - byteBufferAllocate.capacity());
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new zzf("No APK Signing Block before ZIP Central Directory");
            }
            long j3 = byteBufferAllocate.getLong(0);
            if (j3 < byteBufferAllocate.capacity() || j3 > 2147483639) {
                throw new zzf("APK Signing Block size out of range: " + j3);
            }
            int i = (int) (j3 + 8);
            long j4 = j2 - i;
            if (j4 < 0) {
                throw new zzf("APK Signing Block offset out of range: " + j4);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j4);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j5 = byteBufferAllocate2.getLong(0);
            if (j5 != j3) {
                throw new zzf("APK Signing Block sizes in header and footer do not match: " + j5 + " vs " + j3);
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
                        throw new zzf("Insufficient data to read size of APK Signing Block entry #" + i2);
                    }
                    long j6 = byteBufferSlice.getLong();
                    if (j6 < 4 || j6 > 2147483647L) {
                        throw new zzf("APK Signing Block entry #" + i2 + " size out of range: " + j6);
                    }
                    int i3 = (int) j6;
                    int iPosition2 = byteBufferSlice.position() + i3;
                    if (i3 > byteBufferSlice.remaining()) {
                        throw new zzf("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrK = k(randomAccessFile.getChannel(), new zze(e(i3 - 4, byteBufferSlice), jLongValue2, j2, jLongValue, byteBuffer));
                        randomAccessFile.close();
                        return x509CertificateArrK;
                    }
                    ByteBuffer byteBuffer3 = byteBuffer;
                    long j7 = jLongValue2;
                    long j8 = jLongValue;
                    byteBufferSlice.position(iPosition2);
                    jLongValue = j8;
                    jLongValue2 = j7;
                    byteBuffer = byteBuffer3;
                }
                throw new zzf("No APK Signature Scheme v2 block in APK Signing Block");
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

    public static int b(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        qp2.o(sko.i(i, "Unknown content digest algorthm: "));
        return 0;
    }

    public static int c(int i) {
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

    public static String d(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        qp2.o(sko.i(i, "Unknown content digest algorthm: "));
        return null;
    }

    public static ByteBuffer e(int i, ByteBuffer byteBuffer) {
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

    public static ByteBuffer f(ByteBuffer byteBuffer) {
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
            return e(i, byteBuffer);
        }
        s49.m(sko.h(i, byteBuffer.remaining(), "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: "));
        return null;
    }

    public static void g(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    public static byte[] h(ByteBuffer byteBuffer) {
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

    public static X509Certificate[] i(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, IOException, InvalidAlgorithmParameterException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferF = f(byteBuffer);
        ByteBuffer byteBufferF2 = f(byteBuffer);
        byte[] bArrH = h(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrH2 = null;
        int i = -1;
        int i2 = 0;
        while (byteBufferF2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer byteBufferF3 = f(byteBufferF2);
                if (byteBufferF3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = byteBufferF3.getInt();
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
                    int iC = c(i3);
                    int iC2 = c(i);
                    if (iC == 1 || iC2 != 1) {
                    }
                }
                bArrH2 = h(byteBufferF3);
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
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrH));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferF);
            if (!signature.verify(bArrH2)) {
                t3p.u(String.valueOf(str2).concat(" signature did not verify"));
                return null;
            }
            byteBufferF.clear();
            ByteBuffer byteBufferF4 = f(byteBufferF);
            ArrayList arrayList2 = new ArrayList();
            byte[] bArrH3 = null;
            int i4 = 0;
            while (byteBufferF4.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer byteBufferF5 = f(byteBufferF4);
                    if (byteBufferF5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = byteBufferF5.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i) {
                        bArrH3 = h(byteBufferF5);
                    }
                } catch (IOException | BufferUnderflowException e2) {
                    throw new IOException(sko.i(i4, "Failed to parse digest record #"), e2);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                t3p.u("Signature algorithms don't match between digests and signatures records");
                return null;
            }
            int iC3 = c(i);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iC3), bArrH3);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrH3)) {
                t3p.u(d(iC3).concat(" contents digest does not match the digest specified by a preceding signer"));
                return null;
            }
            ByteBuffer byteBufferF6 = f(byteBufferF);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (byteBufferF6.hasRemaining()) {
                i6++;
                byte[] bArrH4 = h(byteBufferF6);
                try {
                    arrayList3.add(new zzg((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrH4)), bArrH4));
                } catch (CertificateException e3) {
                    throw new SecurityException(sko.i(i6, "Failed to decode certificate #"), e3);
                }
            }
            if (arrayList3.isEmpty()) {
                t3p.u("No certificates listed");
                return null;
            }
            if (Arrays.equals(bArrH, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            t3p.u("Public key mismatch between certificate and signature record");
            return null;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
            throw new SecurityException(sko.k("Failed to verify ", str2, " signature"), e4);
        }
    }

    public static byte[][] j(int[] iArr, zzb[] zzbVarArr) throws DigestException {
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
            jZza += (zzbVarArr[i3].zza() + 1048575) / 1048576;
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
            byte[] bArr3 = new byte[(b(iArr[i4]) * i5) + 5];
            bArr3[0] = 90;
            g(i5, bArr3);
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
            String strD = d(iArr[i6]);
            try {
                messageDigestArr[i6] = MessageDigest.getInstance(strD);
                i6++;
            } catch (NoSuchAlgorithmException e) {
                h9o.s(strD.concat(" digest not supported"), e);
                return null;
            }
        }
        int i7 = 0;
        int i8 = 0;
        for (i = 3; i7 < i; i = 3) {
            zzb zzbVar = zzbVarArr[i7];
            int i9 = i7;
            long jZza2 = zzbVar.zza();
            byte[][] bArr5 = bArr2;
            long j2 = 0;
            while (jZza2 > 0) {
                byte[][] bArr6 = bArr;
                String str2 = str;
                int iMin = (int) Math.min(jZza2, j);
                g(iMin, bArr4);
                for (int i10 = 0; i10 < length; i10++) {
                    messageDigestArr[i10].update(bArr4);
                }
                try {
                    zzbVar.b(messageDigestArr, j2, iMin);
                    int i11 = 0;
                    while (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        byte[] bArr7 = bArr5[i11];
                        int iB = b(i12);
                        char c2 = c;
                        MessageDigest messageDigest = messageDigestArr[i11];
                        zzb zzbVar2 = zzbVar;
                        int iDigest = messageDigest.digest(bArr7, (i8 * iB) + 5, iB);
                        if (iDigest != iB) {
                            t3p.g(iDigest, messageDigest.getAlgorithm());
                            return bArr6;
                        }
                        i11++;
                        c = c2;
                        zzbVar = zzbVar2;
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
            String strD2 = d(i14);
            try {
                bArr10[i13] = MessageDigest.getInstance(strD2).digest(bArr11);
            } catch (NoSuchAlgorithmException e3) {
                h9o.s(strD2.concat(str3), e3);
                return bArr9;
            }
        }
        return bArr10;
    }

    public static X509Certificate[][] k(FileChannel fileChannel, zze zzeVar) throws CertificateException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferF = f(zzeVar.a);
                int i = 0;
                while (byteBufferF.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(i(f(byteBufferF), map, certificateFactory));
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
                long j = zzeVar.b;
                long j2 = zzeVar.c;
                long j3 = zzeVar.d;
                ByteBuffer byteBuffer = zzeVar.e;
                if (map.isEmpty()) {
                    t3p.u("No digests provided");
                    return null;
                }
                zzc zzcVar = new zzc(fileChannel, 0L, j);
                zzc zzcVar2 = new zzc(fileChannel, j2, j3 - j2);
                ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                zzj.b(byteBufferDuplicate);
                int iPosition = byteBufferDuplicate.position() + 16;
                if (j < 0 || j > 4294967295L) {
                    qp2.o(p3p.l(j, "uint32 value of out range: "));
                    return null;
                }
                byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition, (int) j);
                zza zzaVar = new zza(byteBufferDuplicate);
                int size = map.size();
                int[] iArr = new int[size];
                Iterator it = map.keySet().iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    iArr[i2] = ((Integer) it.next()).intValue();
                    i2++;
                }
                try {
                    byte[][] bArrJ = j(iArr, new zzb[]{zzcVar, zzcVar2, zzaVar});
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = iArr[i3];
                        if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i4)), bArrJ[i3])) {
                            t3p.u(d(i4).concat(" digest of contents did not verify"));
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
}
