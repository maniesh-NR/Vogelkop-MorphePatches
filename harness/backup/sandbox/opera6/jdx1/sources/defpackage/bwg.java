package defpackage;

import ads_mobile_sdk.e7;
import ads_mobile_sdk.gg;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
import com.usercentrics.sdk.ui.components.UCTextView;
import com.usercentrics.sdk.v2.settings.data.UsercentricsSettings;
import com.usercentrics.tcf.core.model.gvl.VendorUrl;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.h;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public abstract class bwg {
    public static void A(ttj ttjVar, ttj ttjVar2, Function1 function1) {
        if (ttjVar != ttjVar2) {
            ttjVar2.getClass();
            ttj.q(ttjVar);
            ttjVar2.c();
        } else if (ttjVar instanceof k5m) {
            ((k5m) ttjVar).r = function1;
        } else if (ttjVar instanceof l5m) {
            ((l5m) ttjVar).h = function1;
        } else {
            n57.h(ttjVar, "Non-transparent snapshot was reused: ");
        }
    }

    public static final Object B(Function2 function2) {
        Thread.interrupted();
        return scd.g0(h.a, new fb9((byte) 28, (mt5) null, function2));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: o2j */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlinx.serialization.KSerializer C(x79 r13, x9m r14) throws o2j {
        /*
            cam r0 = r14.b
            itb r1 = r14.a
            r2 = 1
            r3 = 0
            if (r0 == 0) goto Lb8
            java.util.List r4 = r0.b
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L45
            r5 = 0
            kotlinx.serialization.KSerializer r0 = zwg.q(r13, r0, r5)
            if (r0 != 0) goto Lb6
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r4.iterator()
        L22:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L3f
            java.lang.Object r4 = r0.next()
            kotlin.reflect.KTypeProjection r4 = (kotlin.reflect.KTypeProjection) r4
            cam r4 = r4.b     // Catch: java.lang.Exception -> L45
            if (r4 == 0) goto L38
            kotlinx.serialization.KSerializer r7 = zwg.q(r13, r4, r5)     // Catch: java.lang.Exception -> L45
            if (r7 == 0) goto L39
        L38:
            r4 = r3
        L39:
            if (r4 == 0) goto L22
            r6.add(r4)
            goto L22
        L3f:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L47
        L45:
            r0 = r3
            goto Lb6
        L47:
            bli r11 = new bli
            r13 = 14
            r11.<init>(r13)
            r12 = 31
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r13 = kotlin.collections.CollectionsKt.P(r6, r7, r8, r9, r10, r11, r12)
            int r14 = r6.size()
            if (r14 != r2) goto L68
            kotlin.Pair r14 = new kotlin.Pair
            java.lang.String r0 = ""
            java.lang.String r2 = "is"
            r14.<init>(r0, r2)
            goto L71
        L68:
            kotlin.Pair r14 = new kotlin.Pair
            java.lang.String r0 = "s"
            java.lang.String r2 = "are"
            r14.<init>(r0, r2)
        L71:
            java.lang.Object r0 = r14.a
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r14 = r14.b
            java.lang.String r14 = (java.lang.String) r14
            o2j r2 = new o2j
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Serializer for type argument"
            r3.<init>(r4)
            r3.append(r0)
            r4 = 32
            r3.append(r4)
            r3.append(r13)
            r3.append(r4)
            r3.append(r14)
            java.lang.String r13 = " not found for '"
            r3.append(r13)
            s15 r1 = (s15) r1
            java.lang.String r13 = r1.c()
            r3.append(r13)
            java.lang.String r13 = "'. Ensure that the listed type"
            r3.append(r13)
            r3.append(r0)
            r3.append(r4)
            java.lang.String r13 = " marked as '@Serializable'."
            java.lang.String r13 = defpackage.z1m.l(r3, r14, r13)
            r2.<init>(r13)
            throw r2
        Lb6:
            if (r0 != 0) goto Ld0
        Lb8:
            x79.z(r13, r1)
            kotlinx.serialization.KSerializer r13 = zwg.r(r1)
            if (r13 == 0) goto Ld1
            cam r14 = r14.b
            if (r14 == 0) goto Lcf
            boolean r14 = r14.d()
            if (r14 != r2) goto Lcf
            kotlinx.serialization.KSerializer r13 = f03.B(r13)
        Lcf:
            r0 = r13
        Ld0:
            return r0
        Ld1:
            defpackage.wxe.Y(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwg.C(x79, x9m):kotlinx.serialization.KSerializer");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(ozh r4, nt5 r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof defpackage.fzm
            if (r0 == 0) goto L13
            r0 = r5
            fzm r0 = (defpackage.fzm) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            fzm r0 = new fzm
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.t
            px5 r1 = px5.a
            int r2 = r0.u
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 == r3) goto L2a
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L2a:
            defpackage.ybh.y(r5)
            goto L40
        L2e:
            defpackage.ybh.y(r5)
            boolean r5 = r4.a()
            if (r5 != 0) goto L43
            r0.u = r3
            java.io.Serializable r5 = defpackage.cs5.A0(r4, r0)
            if (r5 != r1) goto L40
            return r1
        L40:
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        L43:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwg.D(ozh, nt5):java.lang.Object");
    }

    public static final wm0 E(int i) {
        switch (i) {
            case 0:
                return wm0.b;
            case 1:
                return wm0.c;
            case 2:
                return wm0.d;
            case 3:
                return wm0.e;
            case 4:
                return wm0.f;
            case 5:
                return wm0.g;
            case 6:
                return wm0.h;
            case 7:
                return wm0.i;
            case 8:
                return wm0.j;
            case 9:
                return wm0.k;
            case 10:
                return wm0.l;
            case 11:
                return wm0.m;
            case 12:
                return wm0.n;
            case 13:
                return wm0.o;
            case 14:
                return wm0.p;
            case 15:
                return wm0.q;
            case 16:
            default:
                qp2.o(sko.i(i, "Unknown entry point: "));
                return null;
            case 17:
                return wm0.r;
        }
    }

    public static final xm0 F(int i) {
        if (i == 0) {
            return xm0.b;
        }
        if (i == 1) {
            return xm0.c;
        }
        if (i == 2) {
            return xm0.d;
        }
        if (i == 3) {
            return xm0.e;
        }
        if (i == 4) {
            return xm0.f;
        }
        qp2.o(sko.i(i, "Unknown exit reason: "));
        return null;
    }

    public static final gpm G(String str) {
        tgm tgmVarB;
        try {
            tgmVarB = ugm.b(new tgm(), str);
            if (tgmVarB.a.length() <= 0) {
                tgmVarB = null;
            }
        } catch (Exception unused) {
        }
        gpm gpmVarB = tgmVarB != null ? tgmVarB.b() : null;
        if (gpmVarB != null) {
            return gpmVarB;
        }
        qp2.o("Required value was null.");
        return null;
    }

    public static final gpm H(String str) {
        gpm q0iVar;
        try {
            p0i p0iVar = t0i.b;
            q0iVar = G(str);
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        if (q0iVar instanceof q0i) {
            q0iVar = null;
        }
        return q0iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(ozh r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.izm
            if (r0 == 0) goto L13
            r0 = r6
            izm r0 = (defpackage.izm) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            izm r0 = new izm
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.u
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            ozh r5 = r0.t
            defpackage.ybh.y(r6)
            goto L3e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L30:
            defpackage.ybh.y(r6)
            r0.t = r5
            r0.v = r4
            java.lang.Object r6 = D(r5, r0)
            if (r6 != r1) goto L3e
            return r1
        L3e:
            java.lang.Object r6 = r5.b
            if (r6 == 0) goto L43
            return r6
        L43:
            java.lang.String r6 = "No response body: "
            odf.i(r5, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwg.I(ozh, nt5):java.lang.Object");
    }

    public static final voh a(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new voh(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static int b(int i, int i2) {
        int iN = n(i);
        int iN2 = n(i2);
        if (iN == 1) {
            if (iN2 == 1) {
                return 0;
            }
            if (iN2 == 2) {
                return -1;
            }
            qp2.o(a4h.a("Unknown digestAlgorithm2: ", iN2));
            return 0;
        }
        if (iN != 2) {
            qp2.o(a4h.a("Unknown digestAlgorithm1: ", iN));
            return 0;
        }
        if (iN2 == 1) {
            return 1;
        }
        if (iN2 == 2) {
            return 0;
        }
        qp2.o(a4h.a("Unknown digestAlgorithm2: ", iN2));
        return 0;
    }

    public static String c(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        qp2.o(a4h.a("Unknown content digest algorthm: ", i));
        return null;
    }

    public static ByteBuffer d(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            t3p.h(byteBuffer.remaining(), "Remaining buffer too short to contain length of length-prefixed field. Remaining: ");
            return null;
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            qp2.o("Negative length");
            return null;
        }
        if (i <= byteBuffer.remaining()) {
            return e(byteBuffer, i);
        }
        StringBuilder sbO = p3p.o(i, "Length-prefixed field longer than remaining buffer. Field length: ", ", remaining: ");
        sbO.append(byteBuffer.remaining());
        throw new IOException(sbO.toString());
    }

    public static ByteBuffer e(ByteBuffer byteBuffer, int i) {
        if (i < 0) {
            qp2.o(a4h.a("size: ", i));
            return null;
        }
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

    public static void f(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static boolean g(Context context, fio fioVar, MotionEvent motionEvent, long j, float f, float f2) {
        int i = fioVar.b;
        int i2 = fioVar.c;
        return ((int) ((((float) Math.sqrt(Math.pow((double) Math.abs(motionEvent.getY() - f2), 2.0d) + Math.pow((double) Math.abs(motionEvent.getX() - f), 2.0d))) / context.getResources().getDisplayMetrics().density) + 0.5f)) <= i && SystemClock.elapsedRealtime() - j <= ((long) i2);
    }

    public static X509Certificate[] h(ByteBuffer byteBuffer, HashMap map, CertificateFactory certificateFactory) throws InvalidKeySpecException, NoSuchAlgorithmException, SignatureException, IOException, InvalidKeyException, InvalidAlgorithmParameterException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferD = d(byteBuffer);
        ByteBuffer byteBufferD2 = d(byteBuffer);
        byte[] bArrP = p(byteBuffer);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = -1;
        byte[] bArrP2 = null;
        while (byteBufferD2.hasRemaining()) {
            i++;
            try {
                ByteBuffer byteBufferD3 = d(byteBufferD2);
                if (byteBufferD3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = byteBufferD3.getInt();
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
                if (i2 == -1 || b(i3, i2) > 0) {
                    bArrP2 = p(byteBufferD3);
                    i2 = i3;
                }
            } catch (IOException | BufferUnderflowException e) {
                throw new SecurityException(a4h.a("Failed to parse signature record #", i), e);
            }
        }
        if (i2 == -1) {
            if (i == 0) {
                t3p.u("No signatures found");
                return null;
            }
            t3p.u("No supported signatures found");
            return null;
        }
        if (i2 == 513 || i2 == 514) {
            str = "EC";
        } else if (i2 != 769) {
            switch (i2) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    t3p.i(Long.toHexString(i2), "Unknown signature algorithm: 0x");
                    return null;
            }
        } else {
            str = "DSA";
        }
        if (i2 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i2 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i2 != 769) {
            switch (i2) {
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
                    t3p.i(Long.toHexString(i2), "Unknown signature algorithm: 0x");
                    return null;
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrP));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferD);
            if (!signature.verify(bArrP2)) {
                t3p.u(sko.u(str2, " signature did not verify"));
                return null;
            }
            byteBufferD.clear();
            ByteBuffer byteBufferD4 = d(byteBufferD);
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            byte[] bArrP3 = null;
            while (byteBufferD4.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer byteBufferD5 = d(byteBufferD4);
                    if (byteBufferD5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = byteBufferD5.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i2) {
                        bArrP3 = p(byteBufferD5);
                    }
                } catch (IOException | BufferUnderflowException e2) {
                    throw new IOException(a4h.a("Failed to parse digest record #", i4), e2);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                t3p.u("Signature algorithms don't match between digests and signatures records");
                return null;
            }
            int iN = n(i2);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iN), bArrP3);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrP3)) {
                t3p.u(c(iN).concat(" contents digest does not match the digest specified by a preceding signer"));
                return null;
            }
            ByteBuffer byteBufferD6 = d(byteBufferD);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (byteBufferD6.hasRemaining()) {
                i6++;
                byte[] bArrP4 = p(byteBufferD6);
                try {
                    arrayList3.add(new tsp((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrP4)), bArrP4, (byte) 1));
                } catch (CertificateException e3) {
                    throw new SecurityException(a4h.a("Failed to decode certificate #", i6), e3);
                }
            }
            if (arrayList3.isEmpty()) {
                t3p.u("No certificates listed");
                return null;
            }
            if (Arrays.equals(bArrP, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            t3p.u("Public key mismatch between certificate and signature record");
            return null;
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
            throw new SecurityException(sko.k("Failed to verify ", str2, " signature"), e4);
        }
    }

    public static byte[][] i(int[] iArr, tzo[] tzoVarArr) throws DigestException {
        long j;
        byte[][] bArr;
        String str;
        int i;
        int i2;
        tzo[] tzoVarArr2 = tzoVarArr;
        int length = tzoVarArr2.length;
        int i3 = 0;
        long size = 0;
        while (true) {
            j = 1048576;
            if (i3 >= length) {
                break;
            }
            size += (tzoVarArr2[i3].size() + 1048575) / 1048576;
            i3++;
        }
        if (size >= 2097151) {
            throw new DigestException(p3p.l(size, "Too many chunks: "));
        }
        int i4 = (int) size;
        byte[][] bArr2 = new byte[iArr.length][];
        int i5 = 0;
        while (true) {
            byte[][] bArr3 = null;
            if (i5 >= iArr.length) {
                byte[] bArr4 = new byte[5];
                bArr4[0] = -91;
                int length2 = iArr.length;
                MessageDigest[] messageDigestArr = new MessageDigest[length2];
                int i6 = 0;
                while (true) {
                    bArr = bArr3;
                    str = " digest not supported";
                    if (i6 >= iArr.length) {
                        break;
                    }
                    String strC = c(iArr[i6]);
                    try {
                        messageDigestArr[i6] = MessageDigest.getInstance(strC);
                        i6++;
                        bArr3 = bArr;
                    } catch (NoSuchAlgorithmException e) {
                        h9o.s(strC.concat(" digest not supported"), e);
                        return bArr;
                    }
                }
                int length3 = tzoVarArr2.length;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (i7 < length3) {
                    tzo tzoVar = tzoVarArr2[i7];
                    int i10 = i7;
                    long size2 = tzoVar.size();
                    long j2 = 0;
                    int i11 = i9;
                    while (size2 > 0) {
                        String str2 = str;
                        int i12 = i8;
                        int iMin = (int) Math.min(size2, j);
                        l(iMin, bArr4);
                        for (int i13 = 0; i13 < length2; i13++) {
                            messageDigestArr[i13].update(bArr4);
                        }
                        long j3 = j2;
                        try {
                            tzoVar.a(messageDigestArr, j3, iMin);
                            int i14 = 0;
                            while (i14 < iArr.length) {
                                int i15 = iArr[i14];
                                byte[] bArr5 = bArr2[i14];
                                byte[] bArr6 = bArr4;
                                if (i15 == 1) {
                                    i = 32;
                                } else {
                                    if (i15 != 2) {
                                        qp2.o(a4h.a("Unknown content digest algorthm: ", i15));
                                        return bArr;
                                    }
                                    i = 64;
                                }
                                MessageDigest messageDigest = messageDigestArr[i14];
                                int i16 = length3;
                                int i17 = i11;
                                long j4 = size2;
                                int iDigest = messageDigest.digest(bArr5, (i17 * i) + 5, i);
                                if (iDigest != i) {
                                    t3p.g(iDigest, messageDigest.getAlgorithm());
                                    return bArr;
                                }
                                i14++;
                                i11 = i17;
                                bArr4 = bArr6;
                                length3 = i16;
                                size2 = j4;
                            }
                            long j5 = iMin;
                            i11++;
                            bArr4 = bArr4;
                            j2 = j3 + j5;
                            size2 -= j5;
                            str = str2;
                            i8 = i12;
                            length3 = length3;
                            j = 1048576;
                        } catch (IOException e2) {
                            throw new DigestException(sko.h(i11, i12, "Failed to digest chunk #", " of section #"), e2);
                        }
                    }
                    i8++;
                    i7 = i10 + 1;
                    tzoVarArr2 = tzoVarArr;
                    i9 = i11;
                    length3 = length3;
                    j = 1048576;
                }
                String str3 = str;
                byte[][] bArr7 = new byte[iArr.length][];
                for (int i18 = 0; i18 < iArr.length; i18++) {
                    int i19 = iArr[i18];
                    byte[] bArr8 = bArr2[i18];
                    String strC2 = c(i19);
                    try {
                        bArr7[i18] = MessageDigest.getInstance(strC2).digest(bArr8);
                    } catch (NoSuchAlgorithmException e3) {
                        h9o.s(strC2.concat(str3), e3);
                        return bArr;
                    }
                }
                return bArr7;
            }
            int i20 = iArr[i5];
            if (i20 == 1) {
                i2 = 32;
            } else {
                if (i20 != 2) {
                    qp2.o(a4h.a("Unknown content digest algorthm: ", i20));
                    return null;
                }
                i2 = 64;
            }
            byte[] bArr9 = new byte[(i2 * i4) + 5];
            bArr9[0] = 90;
            l(i4, bArr9);
            bArr2[i5] = bArr9;
            i5++;
        }
    }

    public static X509Certificate[][] j(RandomAccessFile randomAccessFile) throws IOException, m3p, CertificateException {
        Pair pairC;
        if (randomAccessFile.length() < 22) {
            pairC = null;
        } else {
            pairC = lah.c(randomAccessFile, 0);
            if (pairC == null) {
                pairC = lah.c(randomAccessFile, 65535);
            }
        }
        if (pairC == null) {
            throw new m3p("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
        }
        ByteBuffer byteBuffer = (ByteBuffer) pairC.first;
        long jLongValue = ((Long) pairC.second).longValue();
        long j = jLongValue - 20;
        if (j >= 0) {
            randomAccessFile.seek(j);
            if (randomAccessFile.readInt() == 1347094023) {
                throw new m3p("ZIP64 APK not supported");
            }
        }
        ByteOrder byteOrderOrder = byteBuffer.order();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        if (byteOrderOrder != byteOrder) {
            qp2.o("ByteBuffer byte order must be little endian");
            return null;
        }
        long j2 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
        if (j2 >= jLongValue) {
            StringBuilder sbQ = p3p.q(j2, "ZIP Central Directory offset out of range: ", ". ZIP End of Central Directory offset: ");
            sbQ.append(jLongValue);
            throw new m3p(sbQ.toString());
        }
        if (byteBuffer.order() != byteOrder) {
            qp2.o("ByteBuffer byte order must be little endian");
            return null;
        }
        if (j2 + (byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) != jLongValue) {
            throw new m3p("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
        if (j2 < 32) {
            throw new m3p(p3p.l(j2, "APK too small for APK Signing Block. ZIP Central Directory offset: "));
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
        byteBufferAllocate.order(byteOrder);
        randomAccessFile.seek(j2 - byteBufferAllocate.capacity());
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        int i = 8;
        if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
            throw new m3p("No APK Signing Block before ZIP Central Directory");
        }
        long j3 = byteBufferAllocate.getLong(0);
        if (j3 < byteBufferAllocate.capacity() || j3 > 2147483639) {
            throw new m3p(p3p.l(j3, "APK Signing Block size out of range: "));
        }
        int i2 = (int) (8 + j3);
        long j4 = j2 - i2;
        if (j4 < 0) {
            throw new m3p(p3p.l(j4, "APK Signing Block offset out of range: "));
        }
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i2);
        byteBufferAllocate2.order(byteOrder);
        randomAccessFile.seek(j4);
        randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
        long j5 = byteBufferAllocate2.getLong(0);
        if (j5 != j3) {
            StringBuilder sbQ2 = p3p.q(j5, "APK Signing Block sizes in header and footer do not match: ", " vs ");
            sbQ2.append(j3);
            throw new m3p(sbQ2.toString());
        }
        Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j4));
        ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
        long jLongValue2 = ((Long) pairCreate.second).longValue();
        if (byteBuffer2.order() != byteOrder) {
            qp2.o("ByteBuffer byte order must be little endian");
            return null;
        }
        int iCapacity = byteBuffer2.capacity() - 24;
        if (iCapacity < 8) {
            qp2.o(p3p.i(iCapacity, "end < start: ", " < 8"));
            return null;
        }
        int iCapacity2 = byteBuffer2.capacity();
        if (iCapacity > byteBuffer2.capacity()) {
            qp2.o(sko.h(iCapacity, iCapacity2, "end > capacity: ", " > "));
            return null;
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
            int i3 = 0;
            while (byteBufferSlice.hasRemaining()) {
                i3++;
                if (byteBufferSlice.remaining() < i) {
                    throw new m3p(a4h.a("Insufficient data to read size of APK Signing Block entry #", i3));
                }
                long j6 = byteBufferSlice.getLong();
                if (j6 < 4 || j6 > 2147483647L) {
                    throw new m3p("APK Signing Block entry #" + i3 + " size out of range: " + j6);
                }
                int i4 = (int) j6;
                int iPosition2 = byteBufferSlice.position() + i4;
                if (i4 > byteBufferSlice.remaining()) {
                    StringBuilder sbO = sko.o(i3, i4, "APK Signing Block entry #", " size out of range: ", ", available: ");
                    sbO.append(byteBufferSlice.remaining());
                    throw new m3p(sbO.toString());
                }
                if (byteBufferSlice.getInt() == 1896449818) {
                    ByteBuffer byteBufferE = e(byteBufferSlice, i4 - 4);
                    FileChannel channel = randomAccessFile.getChannel();
                    HashMap map = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    try {
                        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                        try {
                            ByteBuffer byteBufferD = d(byteBufferE);
                            int i5 = 0;
                            while (byteBufferD.hasRemaining()) {
                                i5++;
                                try {
                                    arrayList.add(h(d(byteBufferD), map, certificateFactory));
                                } catch (IOException | SecurityException | BufferUnderflowException e) {
                                    throw new SecurityException(p3p.i(i5, "Failed to parse/verify signer #", " block"), e);
                                }
                            }
                            if (i5 < 1) {
                                t3p.u("No signers found");
                                return null;
                            }
                            if (map.isEmpty()) {
                                t3p.u("No content digests found");
                                return null;
                            }
                            if (map.isEmpty()) {
                                t3p.u("No digests provided");
                                return null;
                            }
                            gg ggVar = new gg(channel, 0L, jLongValue2);
                            gg ggVar2 = new gg(channel, j2, jLongValue - j2);
                            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                            byteBufferDuplicate.order(byteOrder2);
                            if (byteBufferDuplicate.order() != byteOrder2) {
                                qp2.o("ByteBuffer byte order must be little endian");
                                return null;
                            }
                            int iPosition3 = byteBufferDuplicate.position() + 16;
                            if (jLongValue2 < 0 || jLongValue2 > 4294967295L) {
                                qp2.o(p3p.l(jLongValue2, "uint32 value of out range: "));
                                return null;
                            }
                            byteBufferDuplicate.putInt(byteBufferDuplicate.position() + iPosition3, (int) jLongValue2);
                            e7 e7Var = new e7(byteBufferDuplicate);
                            int size = map.size();
                            int[] iArr = new int[size];
                            Iterator it = map.keySet().iterator();
                            int i6 = 0;
                            while (it.hasNext()) {
                                iArr[i6] = ((Integer) it.next()).intValue();
                                i6++;
                            }
                            try {
                                byte[][] bArrI = i(iArr, new tzo[]{ggVar, ggVar2, e7Var});
                                for (int i7 = 0; i7 < size; i7++) {
                                    int i8 = iArr[i7];
                                    if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i8)), bArrI[i7])) {
                                        t3p.u(c(i8).concat(" digest of contents did not verify"));
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
                byteBufferSlice.position(iPosition2);
                i = 8;
            }
            throw new m3p("No APK Signature Scheme v2 block in APK Signing Block");
        } catch (Throwable th) {
            byteBuffer2.position(0);
            byteBuffer2.limit(iLimit);
            byteBuffer2.position(iPosition);
            throw th;
        }
    }

    public static X509Certificate[][] k(String str) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            X509Certificate[][] x509CertificateArrJ = j(randomAccessFile);
            randomAccessFile.close();
            return x509CertificateArrJ;
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void l(int i, byte[] bArr) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) ((i >>> 24) & 255);
    }

    public static final void m(afc afcVar, ufm ufmVar, zdm zdmVar) throws Resources.NotFoundException {
        c30 c30Var = (c30) zdmVar.b.c.c;
        String str = c30Var != null ? c30Var.b : null;
        if (str == null || StringsKt.N(str)) {
            return;
        }
        UCTextView uCTextView = new UCTextView(afcVar.getContext(), (AttributeSet) null);
        uCTextView.setText(str);
        uCTextView.setGravity(17);
        uCTextView.v(ufmVar);
        zec zecVar = new zec(-1, -2);
        int dimensionPixelOffset = afcVar.getResources().getDimensionPixelOffset(2131167765);
        zecVar.setMarginStart(dimensionPixelOffset);
        ((LinearLayout.LayoutParams) zecVar).topMargin = 0;
        zecVar.setMarginEnd(dimensionPixelOffset);
        ((LinearLayout.LayoutParams) zecVar).bottomMargin = afcVar.getResources().getDimensionPixelOffset(2131167773);
        afcVar.addView((View) uCTextView, (ViewGroup.LayoutParams) zecVar);
    }

    public static int n(int i) {
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
                t3p.i(Long.toHexString(i), "Unknown signature algorithm: 0x");
                return 0;
        }
    }

    public static void o(Object obj) {
        if (obj != null) {
            return;
        }
        t3p.q("Cannot return null from a non- @Provides method");
    }

    public static byte[] p(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            s49.m("Negative length");
            return null;
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder sbO = p3p.o(i, "Underflow while reading length-prefixed value. Length: ", ", available: ");
        sbO.append(byteBuffer.remaining());
        throw new IOException(sbO.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(slk r6, nt5 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.awg
            if (r0 == 0) goto L13
            r0 = r7
            awg r0 = (defpackage.awg) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            awg r0 = new awg
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.u
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L2f
            if (r2 != r5) goto L29
            defpackage.ybh.y(r7)
            goto L44
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r4
        L2f:
            defpackage.ybh.y(r7)
            r0.u = r5
            kze r6 = r6.i
            xf r7 = new xf
            r2 = 20
            r7.<init>(r3, r4, r2)
            java.lang.Object r7 = defpackage.xf8.w(r6, r7, r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            wvg r7 = (wvg) r7
            boolean r6 = r7.b()
            r0 = 0
            if (r6 != 0) goto L5a
            int r6 = r7.e
            if (r6 == r3) goto L5b
            r7 = 3
            if (r6 == r7) goto L5b
            r7 = 4
            if (r6 == r7) goto L5b
            r7 = 5
            if (r6 == r7) goto L5b
        L5a:
            r5 = r0
        L5b:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwg.q(slk, nt5):java.lang.Object");
    }

    public static final KSerializer r(Collection collection, x79 x79Var) {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList();
        CollectionsKt.I(collection2, arrayList);
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            arrayList2.add(v(obj, x79Var));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            if (hashSet.add(((KSerializer) obj2).getDescriptor().i())) {
                arrayList3.add(obj2);
            }
        }
        if (arrayList3.size() > 1) {
            StringBuilder sb = new StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList4 = new ArrayList(k95.o(arrayList3, 10));
            int size3 = arrayList3.size();
            while (i < size3) {
                Object obj3 = arrayList3.get(i);
                i++;
                arrayList4.add(((KSerializer) obj3).getDescriptor().i());
            }
            sb.append(arrayList4);
            throw new IllegalStateException(sb.toString().toString());
        }
        xhk xhkVar = (KSerializer) (arrayList3.size() == 1 ? arrayList3.get(0) : null);
        if (xhkVar == null) {
            xhkVar = xhk.a;
        }
        if (!xhkVar.getDescriptor().b() && (!(collection2 instanceof Collection) || !collection2.isEmpty())) {
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    return f03.B(xhkVar);
                }
            }
        }
        return xhkVar;
    }

    public static final or4 s(qr4 qr4Var) {
        qr4Var.getClass();
        return xf8.h(Integer.MAX_VALUE, null, null, 6);
    }

    public static ttj t() {
        return (ttj) ytj.b.get();
    }

    public static final VendorUrl u(TCFVendor tCFVendor, UsercentricsSettings usercentricsSettings) {
        Object next;
        Object next2;
        List list = tCFVendor.w;
        List list2 = tCFVendor.w;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.a(((VendorUrl) next).a, usercentricsSettings.d)) {
                break;
            }
        }
        VendorUrl vendorUrl = (VendorUrl) next;
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (Intrinsics.a(((VendorUrl) next2).a, "en")) {
                break;
            }
        }
        VendorUrl vendorUrl2 = (VendorUrl) next2;
        VendorUrl vendorUrl3 = (VendorUrl) CollectionsKt.firstOrNull(list2);
        if (vendorUrl != null) {
            return vendorUrl;
        }
        if (vendorUrl2 != null) {
            return vendorUrl2;
        }
        if (vendorUrl3 == null) {
            return null;
        }
        return vendorUrl3;
    }

    public static final KSerializer v(Object obj, x79 x79Var) throws o2j {
        if (obj == null) {
            return f03.B(xhk.a);
        }
        if (obj instanceof List) {
            return new k72(r((Collection) obj, x79Var), (byte) 0);
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            Object obj2 = objArr.length != 0 ? objArr[0] : null;
            return obj2 != null ? v(obj2, x79Var) : new k72(xhk.a, (byte) 0);
        }
        if (obj instanceof Set) {
            return new k72(r((Collection) obj, x79Var), (byte) 2);
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            return new t7a(r(map.keySet(), x79Var), r(map.values(), x79Var), (byte) 1);
        }
        x79.z(x79Var, uqh.a(obj.getClass()));
        s15 s15VarA = uqh.a(obj.getClass());
        KSerializer kSerializerR = zwg.r(s15VarA);
        if (kSerializerR != null) {
            return kSerializerR;
        }
        wxe.Y(s15VarA);
        throw null;
    }

    public static final boolean w(Throwable th, Function1 function1) {
        while (th != null) {
            if (((Boolean) function1.invoke(th)).booleanValue()) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static ttj x(ttj ttjVar) {
        if (ttjVar instanceof k5m) {
            k5m k5mVar = (k5m) ttjVar;
            if (k5mVar.t == joh.k()) {
                k5mVar.r = null;
                return ttjVar;
            }
        }
        if (ttjVar instanceof l5m) {
            l5m l5mVar = (l5m) ttjVar;
            if (l5mVar.i == joh.k()) {
                l5mVar.h = null;
                return ttjVar;
            }
        }
        ttj ttjVarE = ytj.e(ttjVar, null, false);
        ttjVarE.j();
        return ttjVarE;
    }

    public static Object y(tw0 tw0Var, Function0 function0) {
        ttj k5mVar;
        ttj ttjVar = (ttj) ytj.b.get();
        if (ttjVar instanceof k5m) {
            k5m k5mVar2 = (k5m) ttjVar;
            if (k5mVar2.t == joh.k()) {
                Function1 function1 = k5mVar2.r;
                Function1 function12 = k5mVar2.s;
                try {
                    ((k5m) ttjVar).r = ytj.i(tw0Var, function1, true);
                    ((k5m) ttjVar).s = function12;
                    return function0.invoke();
                } finally {
                    k5mVar2.r = function1;
                    k5mVar2.s = function12;
                }
            }
        }
        if (ttjVar == null || (ttjVar instanceof yee)) {
            k5mVar = new k5m(ttjVar instanceof yee ? (yee) ttjVar : null, tw0Var, null, true, false);
        } else {
            k5mVar = ttjVar.u(tw0Var);
        }
        try {
            ttj ttjVarJ = k5mVar.j();
            try {
                Object objInvoke = function0.invoke();
                ttj.q(ttjVarJ);
                return objInvoke;
            } catch (Throwable th) {
                ttj.q(ttjVarJ);
                throw th;
            }
        } finally {
            k5mVar.c();
        }
    }

    public static byte[] z(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr, 0, 4096);
            if (i < 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }
}
