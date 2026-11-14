package defpackage;

import J.N;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaFormat;
import android.net.Uri;
import android.text.Html;
import android.text.TextUtils;
import android.util.Range;
import android.view.View;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.opera.android.autofill.Address;
import com.opera.android.autofill.AutofillManager;
import com.opera.api.Callback;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public abstract class qbe {
    public static final byte[] a = new byte[32];
    public static final ue5 b = new ue5(663519293, new gf5((byte) 6), false);
    public static final bli c = new bli(11);
    public static final StackTraceElement[] d = new StackTraceElement[0];
    public static final p0j e = new p0j("TestTagsAsResourceId", false, new ali(22));
    public static final p0j f = new p0j("AccessibilityClassName", true, new ali(14));
    public static final p0j g = new p0j("CredentialRequest", false, new ali(23));
    public static final sjn h = new sjn((byte) 19);
    public static final iip i = new iip(4);

    public static boolean B(int[] iArr, int[] iArr2) {
        for (int i2 = 3; i2 >= 0; i2--) {
            int i3 = iArr[i2] + LinearLayoutManager.INVALID_OFFSET;
            int i4 = iArr2[i2] + LinearLayoutManager.INVALID_OFFSET;
            if (i3 < i4) {
                return false;
            }
            if (i3 > i4) {
                return true;
            }
        }
        return true;
    }

    public static final int C(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        int iHashCode = (serialDescriptor.i().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        int iE = serialDescriptor.e();
        int i2 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iE > 0)) {
                break;
            }
            int i3 = iE - 1;
            int i4 = i2 * 31;
            String strI = serialDescriptor.h(serialDescriptor.e() - iE).i();
            if (strI != null) {
                iHashCode2 = strI.hashCode();
            }
            i2 = i4 + iHashCode2;
            iE = i3;
        }
        int iE2 = serialDescriptor.e();
        int iHashCode3 = 1;
        while (true) {
            if (!(iE2 > 0)) {
                return (((iHashCode * 31) + i2) * 31) + iHashCode3;
            }
            int i5 = iE2 - 1;
            int i6 = iHashCode3 * 31;
            xvg xvgVarD = serialDescriptor.h(serialDescriptor.e() - iE2).d();
            iHashCode3 = i6 + (xvgVarD != null ? xvgVarD.hashCode() : 0);
            iE2 = i5;
        }
    }

    public static boolean D(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < 4; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static final boolean E(ih5 ih5Var) {
        vt9 vt9Var = (vt9) ih5Var;
        n27 n27Var = (n27) vt9Var.j(mi5.h);
        int iA = (int) (((h7c) ((c2o) vt9Var.j(mi5.u))).a() & 4294967295L);
        WeakHashMap weakHashMap = k3o.x;
        zc1 zc1Var = fac.m(vt9Var).g;
        zc1 zc1Var2 = fac.m(vt9Var).c;
        boolean zF = vt9Var.f(n27Var) | vt9Var.d(iA) | vt9Var.f(zc1Var) | vt9Var.f(zc1Var2);
        Object objK = vt9Var.K();
        if (zF || objK == hh5.a) {
            objK = luj.b(new o77(n27Var, iA, zc1Var, zc1Var2, (byte) 0));
            vt9Var.g0(objK);
        }
        return ((Boolean) ((iak) objK).getValue()).booleanValue();
    }

    public static boolean F(int[] iArr) {
        for (int i2 = 0; i2 < 4; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static dwh G(Context context, int i2, String str) {
        dwh dwhVarG = yne.b.g(str.startsWith("/") ? Uri.fromFile(new File(str)) : Uri.parse(str));
        gvh gvhVar = dwhVarG.b;
        gvhVar.c(i2 > 0 ? new qzj(context, Integer.valueOf(i2)) : new qzj(context, (Integer) null));
        dwhVarG.c(Bitmap.Config.RGB_565);
        if (!dwhVarG.e) {
            qp2.n("Already explicitly declared as no placeholder.");
            return null;
        }
        if (dwhVarG.j != null) {
            qp2.n("Placeholder image already set.");
            return null;
        }
        dwhVarG.f = 2131231477;
        if (i2 > 0) {
            gvhVar.b(i2, i2);
            dwhVarG.a();
            dwhVarG.j();
        }
        return dwhVarG;
    }

    public static void H(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public static final ArrayList I(List list, Function0 function0) {
        m9f m9fVar;
        if (!((Boolean) function0.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            pfd pfdVar = (pfd) list.get(i3);
            roj rojVar = ((yjl) pfdVar.p()).b;
            sjl sjlVar = (sjl) rojVar.b;
            rf1 rf1Var = (rf1) rojVar.c;
            njl njlVar = (njl) sjlVar.a.getValue();
            if (njlVar == null) {
                m9fVar = new m9f(i2, i2, new thk((byte) 15));
            } else {
                rf1 rf1VarC = sjl.c(rf1Var, njlVar);
                if (rf1VarC == null) {
                    m9fVar = new m9f(i2, i2, new thk((byte) 16));
                } else {
                    ccb ccbVarF0 = f03.f0(njlVar.i(rf1VarC.b, rf1VarC.c).d());
                    m9fVar = new m9f(ccbVarF0.d(), ccbVarF0.b(), new p7l(ccbVarF0, (byte) 6));
                }
            }
            int i4 = m9fVar.a;
            int i5 = m9fVar.b;
            arrayList.add(new Pair(pfdVar.N(vtp.F(i4, i4, i5, i5)), (Function0) m9fVar.c));
        }
        return arrayList;
    }

    public static void J(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 4294967295L;
        long j2 = iArr2[0] & 4294967295L;
        int i2 = 1;
        long j3 = iArr2[1] & 4294967295L;
        long j4 = iArr2[2] & 4294967295L;
        long j5 = iArr2[3] & 4294967295L;
        long j6 = iArr[0] & 4294967295L;
        long j7 = j6 * j2;
        iArr3[0] = (int) j7;
        long j8 = (j6 * j3) + (j7 >>> 32);
        iArr3[1] = (int) j8;
        long j9 = (j6 * j4) + (j8 >>> 32);
        iArr3[2] = (int) j9;
        long j10 = (j6 * j5) + (j9 >>> 32);
        iArr3[3] = (int) j10;
        iArr3[4] = (int) (j10 >>> 32);
        for (int i3 = 4; i2 < i3; i3 = 4) {
            long j11 = iArr[i2] & j;
            long j12 = (j11 * j2) + (iArr3[i2] & j);
            iArr3[i2] = (int) j12;
            int i4 = i2 + 1;
            long j13 = j;
            long j14 = (j11 * j3) + (iArr3[i4] & j13) + (j12 >>> 32);
            iArr3[i4] = (int) j14;
            long j15 = (j11 * j4) + (iArr3[r11] & j13) + (j14 >>> 32);
            iArr3[i2 + 2] = (int) j15;
            long j16 = (j11 * j5) + (iArr3[r0] & j13) + (j15 >>> 32);
            iArr3[i2 + 3] = (int) j16;
            iArr3[i2 + 4] = (int) (j16 >>> 32);
            i2 = i4;
            j = j13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ay2 K(java.io.DataInputStream r28, fr r29) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbe.K(java.io.DataInputStream, fr):ay2");
    }

    public static boolean L(DataInputStream dataInputStream) throws IOException {
        int unsignedByte = dataInputStream.readUnsignedByte();
        if (unsignedByte <= 1) {
            return unsignedByte == 1;
        }
        s49.m("invalid boolean in BDS state");
        return false;
    }

    public static int M(DataInputStream dataInputStream, int i2, String str) {
        int i3 = dataInputStream.readInt();
        if (i3 >= 0 && i3 <= i2) {
            return i3;
        }
        s49.m(str.concat(" size out of bounds"));
        return 0;
    }

    public static eao N(DataInputStream dataInputStream, int i2, int i3, fr frVar) throws IOException {
        int i4 = frVar.b;
        if (i4 == 0) {
            s49.m("too many XMSS nodes in BDS state");
            return null;
        }
        frVar.b = i4 - 1;
        int i5 = dataInputStream.readInt();
        int i6 = dataInputStream.readInt();
        if (i5 < i2 || i5 > i3) {
            s49.m("XMSS node height out of bounds");
            return null;
        }
        if (i6 < 1 || i6 > 64) {
            s49.m("XMSS node value size out of bounds");
            return null;
        }
        int i7 = frVar.c;
        if (i7 == 0) {
            frVar.c = i6;
        } else if (i7 != i6) {
            s49.m("inconsistent XMSS node value sizes");
            return null;
        }
        byte[] bArr = new byte[i6];
        dataInputStream.readFully(bArr);
        return new eao(i5, bArr);
    }

    public static void O(MediaFormat mediaFormat, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mediaFormat.setByteBuffer(sko.i(i2, "csd-"), ByteBuffer.wrap((byte[]) list.get(i2)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean P(defpackage.lp6 r12, boolean r13) {
        /*
            g1g r0 = new g1g
            r1 = 16
            r0.<init>(r1)
            r2 = 1
            r3 = r2
        L9:
            r4 = 8
            r0.K(r4)
            byte[] r5 = r0.a
            r6 = 0
            boolean r5 = r12.peekFully(r5, r6, r4, r2)
            if (r5 == 0) goto L5f
            long r7 = r0.C()
            int r5 = r0.m()
            r9 = 1
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 != 0) goto L33
            byte[] r7 = r0.a
            boolean r7 = r12.peekFully(r7, r4, r4, r2)
            if (r7 == 0) goto L5f
            long r7 = r0.G()
            r9 = r1
            goto L34
        L33:
            r9 = r4
        L34:
            long r9 = (long) r9
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L5f
            long r7 = r7 - r9
            int r7 = (int) r7
            if (r3 == 0) goto L60
            r3 = 1718909296(0x66747970, float:2.8862439E23)
            if (r5 != r3) goto L5f
            if (r7 < r4) goto L5f
            r3 = 4
            r0.K(r3)
            byte[] r4 = r0.a
            r12.peekFully(r4, r6, r3, r6)
            int r3 = r0.m()
            r4 = 1751476579(0x68656963, float:4.333464E24)
            if (r3 != r4) goto L5f
            if (r13 == 0) goto L65
            int r7 = r7 + (-4)
            r12.a(r7, r6)
            r3 = r6
            goto L9
        L5f:
            return r6
        L60:
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r5 != r4) goto L66
        L65:
            return r2
        L66:
            if (r7 == 0) goto L9
            r12.a(r7, r6)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbe.P(lp6, boolean):boolean");
    }

    public static void Q(int[] iArr, int[] iArr2) {
        long j = iArr[0] & 4294967295L;
        int i2 = 8;
        int i3 = 0;
        int i4 = 3;
        while (true) {
            int i5 = i4 - 1;
            long j2 = iArr[i4] & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i2 - 1] = (i3 << 31) | ((int) (j3 >>> 33));
            i2 -= 2;
            iArr2[i2] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i5 <= 0) {
                long j4 = j * j;
                long j5 = ((i3 << 31) & 4294967295L) | (j4 >>> 33);
                iArr2[0] = (int) j4;
                int i6 = ((int) (j4 >>> 32)) & 1;
                long j6 = iArr[1] & 4294967295L;
                long j7 = (j6 * j) + j5;
                int i7 = (int) j7;
                iArr2[1] = (i7 << 1) | i6;
                long j8 = (iArr2[2] & 4294967295L) + (j7 >>> 32);
                long j9 = iArr[2] & 4294967295L;
                long j10 = (j9 * j) + j8;
                int i8 = (int) j10;
                iArr2[2] = (i8 << 1) | (i7 >>> 31);
                long jD = osp.d(j9, j6, j10 >>> 32, iArr2[3] & 4294967295L);
                long j11 = (iArr2[4] & 4294967295L) + (jD >>> 32);
                long j12 = iArr[3] & 4294967295L;
                long j13 = (iArr2[5] & 4294967295L) + (j11 >>> 32);
                long j14 = j11 & 4294967295L;
                long j15 = (iArr2[6] & 4294967295L) + (j13 >>> 32);
                long j16 = j13 & 4294967295L;
                long j17 = (j12 * j) + (jD & 4294967295L);
                int i9 = (int) j17;
                iArr2[3] = (i9 << 1) | (i8 >>> 31);
                long jD2 = osp.d(j12, j6, j17 >>> 32, j14);
                long jD3 = osp.d(j12, j9, jD2 >>> 32, j16);
                long j18 = j15 + (jD3 >>> 32);
                int i10 = (int) jD2;
                iArr2[4] = (i10 << 1) | (i9 >>> 31);
                int i11 = (int) (jD3 & 4294967295L);
                iArr2[5] = (i11 << 1) | (i10 >>> 31);
                int i12 = (int) j18;
                iArr2[6] = (i12 << 1) | (i11 >>> 31);
                iArr2[7] = ((iArr2[7] + ((int) (j18 >>> 32))) << 1) | (i12 >>> 31);
                return;
            }
            i4 = i5;
        }
    }

    public static int R(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static final c8e S(c8e c8eVar, sf1 sf1Var, ikl iklVar, Function1 function1, int i2, boolean z, int i3, int i4, mh9 mh9Var, List list, Function1 function12, Function1 function13) {
        return c8eVar.d(z7e.b).d(new sel(sf1Var, iklVar, mh9Var, function1, i2, z, i3, i4, list, function12, function13));
    }

    public static final hz5 T(nz5 nz5Var, String str, fi6 fi6Var) {
        ebb ebbVar = nz5Var.d;
        Integer numValueOf = null;
        String strB = ebbVar != null ? fi6Var.b(ebbVar) : null;
        ebb ebbVar2 = nz5Var.d;
        if (ebbVar2 != null) {
            long jG = ebbVar2.g(fbb.a.a());
            pn7 pn7Var = new pn7(jG);
            if (!pn7.k(jG)) {
                pn7Var = null;
            }
            if (pn7Var != null) {
                numValueOf = Integer.valueOf((int) pn7.p(pn7Var.a, un7.h));
            }
        }
        return new hz5(str, nz5Var, strB, numValueOf);
    }

    public static final String U(SerialDescriptor serialDescriptor) {
        return CollectionsKt.P(djh.j(0, serialDescriptor.e()), ", ", serialDescriptor.i() + '(', ")", 0, new o5f(serialDescriptor, (byte) 29), 24);
    }

    public static final long V(long j, long j2) {
        int iD;
        int iF = xjl.f(j);
        int iE = xjl.e(j);
        if ((xjl.f(j2) < xjl.e(j)) && (xjl.f(j) < xjl.e(j2))) {
            if ((xjl.f(j2) <= xjl.f(j)) && (xjl.e(j) <= xjl.e(j2))) {
                iF = xjl.f(j2);
                iE = iF;
            } else {
                if ((xjl.f(j) <= xjl.f(j2)) && (xjl.e(j2) <= xjl.e(j))) {
                    iD = xjl.d(j2);
                } else {
                    int iF2 = xjl.f(j2);
                    if (iF >= xjl.e(j2) || iF2 > iF) {
                        iE = xjl.f(j2);
                    } else {
                        iF = xjl.f(j2);
                        iD = xjl.d(j2);
                    }
                }
                iE -= iD;
            }
        } else if (iE > xjl.f(j2)) {
            iF -= xjl.d(j2);
            iD = xjl.d(j2);
            iE -= iD;
        }
        return upj.c(iF, iE);
    }

    public static int W(AutofillManager autofillManager, Address address) {
        String str;
        String str2 = address.j;
        String str3 = address.b;
        autofillManager.getClass();
        HashSet hashSet = new HashSet();
        N.Mpz0g1yo(str2, hashSet);
        Iterator it = hashSet.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            ew ewVar = (ew) it.next();
            if (ewVar != ew.b && ewVar != ew.j) {
                switch (ewVar.ordinal()) {
                    case 0:
                        str = str2;
                        break;
                    case 1:
                        str = address.e;
                        break;
                    case 2:
                        str = address.f;
                        break;
                    case 3:
                        str = address.g;
                        break;
                    case 4:
                        str = address.i;
                        break;
                    case 5:
                        str = address.h;
                        break;
                    case 6:
                        str = address.d;
                        break;
                    case 7:
                        str = address.c;
                        break;
                    case 8:
                        str = str3;
                        break;
                    default:
                        hai.d();
                        return 0;
                }
                if (TextUtils.getTrimmedLength(str) == 0) {
                    i2 = 2;
                }
            }
        }
        if (TextUtils.getTrimmedLength(str3) == 0) {
            if (i2 != 1) {
                return 6;
            }
            i2 = 3;
        }
        return !N.MQ1o0vJQ(address.k, str2) ? i2 != 1 ? 6 : 4 : i2;
    }

    public static Object X(i54 i54Var, rg rgVar, lfe lfeVar) {
        c04 c04VarA = i54Var.a();
        c04VarA.u();
        cxi cxiVarR = c04VarA.r(1);
        byte[] bArr = cxiVarR.a;
        int i2 = cxiVarR.c;
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i2, bArr.length - i2);
        rgVar.invoke(byteBufferWrap);
        int iPosition = byteBufferWrap.position() - i2;
        if (iPosition == 1) {
            cxiVarR.c += iPosition;
            c04VarA.c += iPosition;
        } else {
            if (iPosition < 0 || iPosition > cxiVarR.a()) {
                StringBuilder sbO = p3p.o(iPosition, "Invalid number of bytes written: ", ". Should be in 0..");
                sbO.append(cxiVarR.a());
                throw new IllegalStateException(sbO.toString().toString());
            }
            if (iPosition != 0) {
                cxiVarR.c += iPosition;
                c04VarA.c += iPosition;
            } else if (cxiVarR.b() == 0) {
                c04VarA.n();
            }
        }
        Object objC = i54Var.c(lfeVar);
        return objC == px5.a ? objC : Unit.a;
    }

    public static void Y(DataOutputStream dataOutputStream, ay2 ay2Var) {
        try {
            ay2Var.h();
            int i2 = ay2Var.b;
            dataOutputStream.writeInt(i2);
            dataOutputStream.writeInt(ay2Var.d);
            dataOutputStream.writeInt(ay2Var.l);
            dataOutputStream.writeInt(ay2Var.j);
            dataOutputStream.writeByte(ay2Var.k ? 1 : 0);
            eao eaoVar = ay2Var.e;
            dataOutputStream.writeByte(eaoVar != null ? 1 : 0);
            if (eaoVar != null) {
                Z(dataOutputStream, eaoVar, i2);
            }
            ArrayList arrayList = ay2Var.f;
            dataOutputStream.writeInt(arrayList.size());
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Z(dataOutputStream, (eao) arrayList.get(i3), i2);
            }
            TreeMap treeMap = ay2Var.g;
            dataOutputStream.writeInt(treeMap.size());
            for (Integer num : treeMap.keySet()) {
                List list = (List) treeMap.get(num);
                dataOutputStream.writeInt(num.intValue());
                dataOutputStream.writeInt(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Z(dataOutputStream, (eao) it.next(), i2);
                }
            }
            Stack stack = ay2Var.h;
            dataOutputStream.writeInt(stack.size());
            Iterator it2 = stack.iterator();
            while (it2.hasNext()) {
                Z(dataOutputStream, (eao) it2.next(), i2);
            }
            ArrayList arrayList2 = ay2Var.c;
            dataOutputStream.writeInt(arrayList2.size());
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                ey2 ey2Var = (ey2) obj;
                dataOutputStream.writeInt(ey2Var.b);
                dataOutputStream.writeInt(ey2Var.c);
                dataOutputStream.writeInt(ey2Var.d);
                dataOutputStream.writeByte(ey2Var.e ? 1 : 0);
                dataOutputStream.writeByte(ey2Var.f ? 1 : 0);
                eao eaoVar2 = ey2Var.a;
                dataOutputStream.writeByte(eaoVar2 != null ? 1 : 0);
                if (eaoVar2 != null) {
                    Z(dataOutputStream, eaoVar2, i2);
                }
            }
            TreeMap treeMap2 = ay2Var.i;
            dataOutputStream.writeInt(treeMap2.size());
            for (Integer num2 : treeMap2.keySet()) {
                dataOutputStream.writeInt(num2.intValue());
                Z(dataOutputStream, (eao) treeMap2.get(num2), i2);
            }
        } catch (IllegalStateException e2) {
            throw c26.z("invalid BDS state", e2);
        }
    }

    public static void Z(DataOutputStream dataOutputStream, eao eaoVar, int i2) throws IOException {
        if (eaoVar == null) {
            s49.m("null XMSS node");
            return;
        }
        byte[] bArr = eaoVar.b;
        int length = bArr.length;
        int i3 = eaoVar.a;
        if (i3 < 0 || i3 > i2 || length < 1 || length > 64) {
            s49.m("XMSS node out of bounds");
            return;
        }
        dataOutputStream.writeInt(i3);
        dataOutputStream.writeInt(length);
        dataOutputStream.write(bArr, 0, bArr.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.sf1 r20, final defpackage.c8e r21, final defpackage.ikl r22, final kotlin.jvm.functions.Function1 r23, final int r24, final boolean r25, final int r26, final int r27, final n08 r28, defpackage.ih5 r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbe.a(sf1, c8e, ikl, kotlin.jvm.functions.Function1, int, boolean, int, int, n08, ih5, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r20, final defpackage.c8e r21, final defpackage.ikl r22, int r23, boolean r24, final int r25, int r26, defpackage.ih5 r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbe.b(java.lang.String, c8e, ikl, int, boolean, int, int, ih5, int, int):void");
    }

    public static j19 c(w6g w6gVar, g29 g29Var, String str, ulh ulhVar, int i2) {
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            ulhVar = null;
        }
        return new j19(w6gVar, g29Var, str, ulhVar);
    }

    public static final void d(final c8e c8eVar, sf1 sf1Var, final Function1 function1, final boolean z, final n08 n08Var, final ikl iklVar, final int i2, final boolean z2, final int i3, final int i4, final mh9 mh9Var, final Function1 function12, ih5 ih5Var, final int i5, final int i6) {
        int i7;
        ikl iklVar2;
        int i8;
        sjl sjlVar;
        Function0 function0;
        Pair pair;
        sjl sjlVar2;
        Function1 function13;
        List list;
        Function1 function14;
        Function1 function15;
        Object wgcVar;
        boolean z3;
        boolean z4;
        Object obj;
        final sf1 sf1Var2 = sf1Var;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-2118572703);
        if ((i5 & 6) == 0) {
            i7 = (vt9Var.f(c8eVar) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= vt9Var.f(sf1Var2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= vt9Var.h(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i5 & 3072) == 0) {
            i7 |= vt9Var.g(z) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= vt9Var.h(n08Var) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            iklVar2 = iklVar;
            i7 |= vt9Var.f(iklVar2) ? 131072 : 65536;
        } else {
            iklVar2 = iklVar;
        }
        if ((i5 & 1572864) == 0) {
            i7 |= vt9Var.d(i2) ? 1048576 : 524288;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= vt9Var.g(z2) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= vt9Var.d(i3) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= vt9Var.d(i4) ? 536870912 : 268435456;
        }
        if ((i6 & 6) == 0) {
            i8 = i6 | (vt9Var.h(mh9Var) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= vt9Var.h(null) ? 32 : 16;
        }
        int i9 = i7;
        if ((i6 & 384) == 0) {
            i8 |= vt9Var.h(null) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i6 & 3072) == 0) {
            i8 |= vt9Var.h(function12) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i8 |= (32768 & i6) == 0 ? vt9Var.f(null) : vt9Var.h(null) ? 16384 : 8192;
        }
        if (vt9Var.N(i9 & 1, ((i9 & 306783379) == 306783378 && (i8 & 9363) == 9362) ? false : true)) {
            boolean zO = m5h.o(sf1Var2);
            Object obj2 = hh5.a;
            if (zO) {
                vt9Var.W(145641571);
                boolean z5 = (i9 & 112) == 32;
                Object objK = vt9Var.K();
                Object obj3 = objK;
                if (z5 || objK == obj2) {
                    Object sjlVar3 = new sjl(sf1Var2);
                    vt9Var.g0(sjlVar3);
                    obj3 = sjlVar3;
                }
                sjlVar = (sjl) obj3;
                vt9Var.p(false);
            } else {
                vt9Var.W(145707228);
                vt9Var.p(false);
                sjlVar = null;
            }
            if (m5h.o(sf1Var2)) {
                vt9Var.W(145905443);
                boolean zF = ((i9 & 112) == 32) | vt9Var.f(sjlVar);
                Object objK2 = vt9Var.K();
                Object obj4 = objK2;
                if (zF || objK2 == obj2) {
                    Object gb3Var = new gb3(sjlVar, sf1Var2, (byte) 1);
                    vt9Var.g0(gb3Var);
                    obj4 = gb3Var;
                }
                function0 = (Function0) obj4;
                vt9Var.p(false);
            } else {
                vt9Var.W(146002721);
                boolean z6 = (i9 & 112) == 32;
                Object objK3 = vt9Var.K();
                Object obj5 = objK3;
                if (z6 || objK3 == obj2) {
                    Object oc2Var = new oc2(sf1Var2, (byte) 9);
                    vt9Var.g0(oc2Var);
                    obj5 = oc2Var;
                }
                function0 = (Function0) obj5;
                vt9Var.p(false);
            }
            if (z) {
                if (n08Var != null) {
                    Pair pair2 = vf1.a;
                }
                pair = vf1.a;
                sjlVar2 = sjlVar;
                function13 = null;
            } else {
                sjlVar2 = sjlVar;
                pair = new Pair((Object) null, (Object) null);
                function13 = null;
            }
            List list2 = (List) pair.a;
            List list3 = (List) pair.b;
            if (z) {
                vt9Var.W(146318828);
                Object objK4 = vt9Var.K();
                Object obj6 = objK4;
                if (objK4 == obj2) {
                    Object objK5 = hyg.k(function13);
                    vt9Var.g0(objK5);
                    obj6 = objK5;
                }
                list = list3;
                vt9Var.p(false);
                function14 = (afe) obj6;
            } else {
                list = list3;
                vt9Var.W(146406588);
                vt9Var.p(false);
                function14 = function13;
            }
            if (z) {
                vt9Var.W(146499837);
                boolean zF2 = vt9Var.f(function14);
                Object objK6 = vt9Var.K();
                Object obj7 = objK6;
                if (zF2 || objK6 == obj2) {
                    Object gb1Var = new gb1(function14, (byte) 3);
                    vt9Var.g0(gb1Var);
                    obj7 = gb1Var;
                }
                vt9Var.p(false);
                function15 = (Function1) obj7;
            } else {
                vt9Var.W(146571260);
                vt9Var.p(false);
                function15 = function13;
            }
            int i10 = (i9 >> 3) & 14;
            Function1 function16 = function14;
            sjl sjlVar4 = sjlVar2;
            List list4 = list;
            pb3.a(sf1Var, iklVar2, mh9Var, list2, z2, vt9Var);
            sf1Var2 = sf1Var;
            sf1 sf1Var3 = (sf1) function0.invoke();
            boolean zH = vt9Var.h(sjlVar4) | ((i9 & 896) == 256);
            Object objK7 = vt9Var.K();
            Object obj8 = objK7;
            if (zH || objK7 == obj2) {
                Object lb3Var = new lb3(sjlVar4, function1, (byte) 0);
                vt9Var.g0(lb3Var);
                obj8 = lb3Var;
            }
            c8e c8eVarS = S(c8eVar, sf1Var3, iklVar, (Function1) obj8, i2, z2, i3, i4, mh9Var, list2, function15, function12);
            if (z) {
                vt9Var.W(147956465);
                boolean zH2 = vt9Var.h(sjlVar4);
                Object objK8 = vt9Var.K();
                Object obj9 = objK8;
                if (zH2 || objK8 == obj2) {
                    Object mb3Var = new mb3(sjlVar4, (byte) 1);
                    vt9Var.g0(mb3Var);
                    obj9 = mb3Var;
                }
                Function0 function02 = (Function0) obj9;
                boolean zF3 = vt9Var.f(function16);
                Object objK9 = vt9Var.K();
                Object obj10 = objK9;
                if (zF3 || objK9 == obj2) {
                    Object ox0Var = new ox0(function16, (byte) 5);
                    vt9Var.g0(ox0Var);
                    obj10 = ox0Var;
                }
                s91 s91Var = new s91(function02, (Function0) obj10, (byte) 1);
                vt9Var.p(false);
                wgcVar = s91Var;
            } else {
                vt9Var.W(147779703);
                boolean zH3 = vt9Var.h(sjlVar4);
                Object objK10 = vt9Var.K();
                if (zH3 || objK10 == obj2) {
                    z4 = false;
                    Object mb3Var2 = new mb3(sjlVar4, false ? 1 : 0);
                    vt9Var.g0(mb3Var2);
                    obj = mb3Var2;
                } else {
                    z4 = false;
                    obj = objK10;
                }
                wgcVar = new wgc((Function0) obj);
                vt9Var.p(z4);
            }
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarS);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, wgcVar, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            if (sjlVar4 == null) {
                vt9Var.W(-433557001);
                z3 = false;
            } else {
                z3 = false;
                vt9Var.W(-291080374);
                sjlVar4.a(vt9Var, 0);
            }
            vt9Var.p(z3);
            if (list4 == null) {
                vt9Var.W(-433506223);
            } else {
                vt9Var.W(-433506222);
                vf1.a(sf1Var2, list4, vt9Var, i10);
            }
            vt9Var.p(z3);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: jb3
                public final Object invoke(Object obj11, Object obj12) {
                    ((Integer) obj12).getClass();
                    int iM = aoh.m(i5 | 1);
                    int iM2 = aoh.m(i6);
                    c8e c8eVar2 = c8eVar;
                    sf1 sf1Var4 = sf1Var2;
                    Function1 function17 = function1;
                    boolean z7 = z;
                    n08 n08Var2 = n08Var;
                    ikl iklVar3 = iklVar;
                    byte b2 = i2;
                    boolean z8 = z2;
                    int i11 = i3;
                    boolean z9 = i4;
                    mh9 mh9Var2 = mh9Var;
                    Function1 function18 = function12;
                    qbe.d(c8eVar2, sf1Var4, function17, z7, n08Var2, iklVar3, b2, z8, i11, z9 ? 1 : 0, mh9Var2, function18, (ih5) obj11, iM, iM2);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f8  */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(u5d r48, defpackage.c8e r49, defpackage.ih5 r50, int r51) {
        /*
            Method dump skipped, instructions count: 1032
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbe.e(u5d, c8e, ih5, int):void");
    }

    public static final void f(final boolean z, final Function0 function0, final Function0 function02, final Function0 function03, final Function1 function1, final String str, final g1b g1bVar, final Function0 function04, final Function0 function05, final utm utmVar, final Integer num, final Function0 function06, final Integer num2, final fum fumVar, final Function1 function12, final Function0 function07, final boolean z2, final Function0 function08, final boolean z3, final ue5 ue5Var, final Function1 function13, c8e c8eVar, ih5 ih5Var, final int i2, final int i3, final int i4, final int i5) {
        boolean z4;
        int i6;
        Function0 function09;
        Function0 function010;
        Function0 function011;
        Function1 function14;
        int i7;
        int i8;
        vt9 vt9Var;
        final c8e c8eVar2;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(-2010691637);
        if ((i2 & 6) == 0) {
            z4 = z;
            i6 = (vt9Var2.g(z4) ? 4 : 2) | i2;
        } else {
            z4 = z;
            i6 = i2;
        }
        if ((i2 & 48) == 0) {
            function09 = function0;
            i6 |= vt9Var2.h(function09) ? 32 : 16;
        } else {
            function09 = function0;
        }
        if ((i2 & 384) == 0) {
            function010 = function02;
            i6 |= vt9Var2.h(function010) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        } else {
            function010 = function02;
        }
        if ((i2 & 3072) == 0) {
            function011 = function03;
            i6 |= vt9Var2.h(function011) ? 2048 : 1024;
        } else {
            function011 = function03;
        }
        if ((i2 & 24576) == 0) {
            function14 = function1;
            i6 |= vt9Var2.h(function14) ? 16384 : 8192;
        } else {
            function14 = function1;
        }
        if ((i2 & 196608) == 0) {
            i6 |= vt9Var2.f(str) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i6 |= vt9Var2.f(g1bVar) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i6 |= vt9Var2.h(function04) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i6 |= vt9Var2.h(function05) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i6 |= vt9Var2.f(utmVar) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i7 = i3 | (vt9Var2.f(num) ? 4 : 2);
        } else {
            i7 = i3;
        }
        if ((i3 & 48) == 0) {
            i7 |= vt9Var2.h(function06) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i7 |= vt9Var2.f(num2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if ((i3 & 3072) == 0) {
            i7 |= vt9Var2.f(fumVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i7 |= vt9Var2.h(function12) ? 16384 : 8192;
        }
        if ((i3 & 196608) == 0) {
            i7 |= vt9Var2.h(function07) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i7 |= vt9Var2.g(z2) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i7 |= vt9Var2.h(function08) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i7 |= vt9Var2.g(z3) ? 67108864 : 33554432;
        }
        if ((i4 & 6) == 0) {
            i8 = i4 | (vt9Var2.h(function13) ? 4 : 2);
        } else {
            i8 = i4;
        }
        int i9 = i5 & 2097152;
        if (i9 != 0) {
            i8 |= 48;
        } else if ((i4 & 48) == 0) {
            i8 |= vt9Var2.f(c8eVar) ? 32 : 16;
        }
        int i10 = i8;
        if (vt9Var2.N(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 306783379) == 306783378 && (i10 & 19) == 18) ? false : true)) {
            c8e c8eVar3 = i9 != 0 ? z7e.b : c8eVar;
            vt9Var = vt9Var2;
            w1h.a(c8eVar3, gyg.P(716419471, new sa(num2, function011, num, function06, str, function14, function07, function010, z4, function09), vt9Var2), null, gyg.P(-1293852655, new z47(coh.g(fumVar, function12, vt9Var2, (i7 >> 9) & 126), (byte) 3), vt9Var2), null, 0, 0L, 0L, null, gyg.P(442820122, new cr9() { // from class: z6d
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    xvf xvfVar = (xvf) obj;
                    ih5 ih5Var2 = (ih5) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((vt9) ih5Var2).f(xvfVar) ? 4 : 2;
                    }
                    vt9 vt9Var3 = (vt9) ih5Var2;
                    if (vt9Var3.N(iIntValue & 1, (iIntValue & 19) != 18)) {
                        lah.b(z2, function08, a26.W(z7e.b, xvfVar).d(mpj.c), null, null, null, gyg.P(-1522663168, new b7d(ue5Var, g1bVar, utmVar, function04, function05, function03, function13, z3), vt9Var3), vt9Var3, 1572864, 56);
                    } else {
                        vt9Var3.Q();
                    }
                    return Unit.a;
                }
            }, vt9Var2), vt9Var, ((i10 >> 3) & 14) | 805309488, 500);
            c8eVar2 = c8eVar3;
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
            c8eVar2 = c8eVar;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2() { // from class: a7d
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = aoh.m(i2 | 1);
                    int iM2 = aoh.m(i3);
                    int iM3 = aoh.m(i4);
                    qbe.f(z, function0, function02, function03, function1, str, g1bVar, function04, function05, utmVar, num, function06, num2, fumVar, function12, function07, z2, function08, z3, ue5Var, function13, c8eVar2, (ih5) obj, iM, iM2, iM3, i5);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: oye */
    public static final void g(g1b g1bVar, Function0 function0, Function0 function02, Function0 function03, ih5 ih5Var, int i2) throws oye {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(2108717637);
        Function0 function04 = function0;
        Function0 function05 = function02;
        Function0 function06 = function03;
        int i3 = i2 | (vt9Var.f(g1bVar) ? 4 : 2) | (vt9Var.h(function04) ? 32 : 16) | (vt9Var.h(function05) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.h(function06) ? 2048 : 1024);
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            c8e c8eVarZ = a26.Z(mpj.a, 16.0f, 0.0f, 2);
            o9i o9iVarA = m9i.a(new x62(8.0f, true, new t40((byte) 19)), rbe.k, vt9Var, 6);
            int iHashCode = Long.hashCode(vt9Var.T);
            oag oagVarL = vt9Var.l();
            c8e c8eVarP = qyn.P(vt9Var, c8eVarZ);
            bh5.To.getClass();
            vt9Var.a0();
            if (vt9Var.S) {
                vt9Var.k(m3c.S);
            } else {
                vt9Var.j0();
            }
            y4h.o(vt9Var, o9iVarA, ujp.f);
            y4h.o(vt9Var, oagVarL, ujp.e);
            y4h.o(vt9Var, Integer.valueOf(iHashCode), ujp.g);
            y4h.m(vt9Var);
            y4h.o(vt9Var, c8eVarP, ujp.d);
            vt9Var.W(1652922296);
            Iterator it = g1bVar.iterator();
            while (it.hasNext()) {
                int iOrdinal = ((mje) it.next()).ordinal();
                q9i q9iVar = q9i.a;
                if (iOrdinal == 0) {
                    vt9Var.W(-1966017267);
                    h(iza.a((dl7) tk7.s.getValue(), vt9Var), uyg.q((shk) dhk.g.getValue(), vt9Var), function04, q9iVar.a(1.0f, true), vt9Var, 8 | ((i3 << 3) & 896));
                    vt9Var.p(false);
                } else if (iOrdinal == 1) {
                    vt9Var.W(-1966007639);
                    h(iza.a((dl7) tk7.t.getValue(), vt9Var), uyg.q((shk) ahk.i.getValue(), vt9Var), function05, q9iVar.a(1.0f, true), vt9Var, 8 | (i3 & 896));
                    vt9Var.p(false);
                } else {
                    if (iOrdinal != 2) {
                        throw fki.m(vt9Var, -1966018260, false);
                    }
                    vt9Var.W(-1965998000);
                    h(iza.a((dl7) tk7.p.getValue(), vt9Var), uyg.q((shk) ahk.r0.getValue(), vt9Var), function06, q9iVar.a(1.0f, true), vt9Var, 8 | ((i3 >> 3) & 896));
                    vt9Var.p(false);
                }
                function04 = function0;
                function05 = function02;
                function06 = function03;
            }
            vt9Var.p(false);
            vt9Var.p(true);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new px0(g1bVar, function0, function02, function03, i2, (byte) 7);
        }
    }

    public static final void h(hyf hyfVar, String str, Function0 function0, c8e c8eVar, ih5 ih5Var, int i2) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-1913533496);
        int i3 = i2 | (vt9Var.h(hyfVar) ? 4 : 2) | (vt9Var.f(str) ? 32 : 16) | (vt9Var.h(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.f(c8eVar) ? 2048 : 1024);
        byte b2 = 0;
        if (vt9Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            utk.b(function0, c8eVar, false, ((acj) vt9Var.j(ccj.a)).c, ((sa5) vt9Var.j(ua5.a)).F, 0L, 0.0f, null, null, gyg.P(99000349, new y6d(hyfVar, str, b2), vt9Var), vt9Var, (i3 >> 6) & 126, 996);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new px0(hyfVar, str, function0, c8eVar, i2, (byte) 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final java.lang.String r46, final kotlin.jvm.functions.Function1 r47, final defpackage.c8e r48, boolean r49, boolean r50, defpackage.ikl r51, final defpackage.ue5 r52, defpackage.ue5 r53, defpackage.ue5 r54, defpackage.ue5 r55, defpackage.ue5 r56, defpackage.ue5 r57, defpackage.ue5 r58, boolean r59, uac r60, defpackage.rvb r61, defpackage.ovb r62, final boolean r63, int r64, int r65, defpackage.lde r66, defpackage.paj r67, defpackage.sgl r68, defpackage.ih5 r69, final int r70, final int r71, final int r72, final int r73) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbe.i(java.lang.String, kotlin.jvm.functions.Function1, c8e, boolean, boolean, ikl, ue5, ue5, ue5, ue5, ue5, ue5, ue5, boolean, uac, rvb, ovb, boolean, int, int, lde, paj, sgl, ih5, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0658  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(final kotlin.jvm.functions.Function2 r40, defpackage.ue5 r41, defpackage.ue5 r42, final defpackage.ue5 r43, final defpackage.ue5 r44, final defpackage.ue5 r45, defpackage.ue5 r46, final boolean r47, final defpackage.mhl r48, final defpackage.fhl r49, final kotlin.jvm.functions.Function1 r50, final defpackage.ue5 r51, defpackage.ue5 r52, final defpackage.zvf r53, defpackage.ih5 r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbe.j(kotlin.jvm.functions.Function2, ue5, ue5, ue5, ue5, ue5, ue5, boolean, mhl, fhl, kotlin.jvm.functions.Function1, ue5, ue5, zvf, ih5, int, int):void");
    }

    public static final void k(int i2, int i3, ih5 ih5Var, Function0 function0) {
        Function0 function02;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-705879944);
        int i4 = (vt9Var.d(i2) ? 4 : 2) | i3 | (vt9Var.h(function0) ? 32 : 16);
        byte b2 = 1;
        if (vt9Var.N(i4 & 1, (i4 & 19) != 18)) {
            boolean z = (i4 & 14) == 4;
            Object objK = vt9Var.K();
            if (z || objK == hh5.a) {
                objK = new r95((byte) 4, i2);
                vt9Var.g0(objK);
            }
            function02 = function0;
            ddh.a(function02, h0j.a(z7e.b, true, (Function1) objK), gyg.P(466163747, new gda(b2, i2), vt9Var), vt9Var, ((i4 >> 3) & 14) | 384, 0);
        } else {
            function02 = function0;
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new w6d(i2, function02, i3);
        }
    }

    public static int l(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static void m(byte[] bArr) {
        if (bArr == null || bArr.length < 8 || bArr.length > 4194304) {
            s49.m("BDS state encoding size out of bounds");
        }
    }

    public static int n(byte[] bArr, byte[] bArr2) {
        String str;
        if (bArr.length >= 40) {
            int length = bArr.length - 32;
            byte[] bArr3 = new byte[32];
            qci qciVar = new qci();
            if (bArr2 != null) {
                qciVar.g(0, bArr2.length, bArr2);
            }
            qciVar.g(0, length, bArr);
            qciVar.e(0, bArr3);
            if (alo.h(bArr3, 32, length, bArr, bArr.length)) {
                return length;
            }
            str = "BDS state checksum does not match";
        } else {
            str = "BDS state encoding size out of bounds";
        }
        s49.m(str);
        return 0;
    }

    public static int o(Range range, Range range2) {
        Integer num;
        Integer num2;
        int iIntValue = Integer.MAX_VALUE;
        int iIntValue2 = (range == null || (num2 = (Integer) range.getLower()) == null) ? Integer.MAX_VALUE : num2.intValue();
        if (range2 != null && (num = (Integer) range2.getLower()) != null) {
            iIntValue = num.intValue();
        }
        return Intrinsics.b(iIntValue2, iIntValue);
    }

    public static int p(sc5 sc5Var, sc5 sc5Var2) {
        long jD = sc5Var.D(sc5Var2);
        pn7.b.getClass();
        return pn7.c(jD, 0L);
    }

    public static void q(int[] iArr, int[] iArr2, int i2) {
        iArr2[i2] = iArr[0];
        iArr2[i2 + 1] = iArr[1];
        iArr2[i2 + 2] = iArr[2];
        iArr2[i2 + 3] = iArr[3];
    }

    public static void r(long[] jArr, long[] jArr2, int i2) {
        jArr2[i2] = jArr[0];
        jArr2[i2 + 1] = jArr[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    public static String s(String str, ArrayList arrayList, LinkedHashMap linkedHashMap) {
        int i2;
        boolean z = false;
        String strK = str;
        int length = 0;
        int i3 = 0;
        while (true) {
            int iL = StringsKt.L(strK, "<link", length, z, 4);
            if (iL == -1) {
                break;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            int i4 = iL + 5;
            int length2 = strK.length();
            boolean z2 = z ? 1 : 0;
            int i5 = i4;
            int i6 = i5;
            String strSubstring = null;
            String strSubstring2 = null;
            ?? r1 = z;
            while (true) {
                if (i5 >= length2) {
                    i2 = -1;
                    break;
                }
                if (!z2) {
                    char cCharAt = strK.charAt(i5);
                    if (cCharAt == ' ') {
                        int i7 = i6 + 1;
                        if (i5 > i7) {
                            if (strSubstring2 != null) {
                                linkedHashMap2.put(strSubstring2.toLowerCase(Locale.ROOT), strSubstring2);
                            }
                            strSubstring2 = strK.substring(i7, i5);
                        }
                    } else if (cCharAt == '\"') {
                        z2 = true;
                    } else if (cCharAt == '=') {
                        int i8 = i6 + 1;
                        strSubstring = i5 > i8 ? strK.substring(i8, i5) : strSubstring2;
                        i6 = i5;
                        strSubstring2 = null;
                    } else if (cCharAt == '>') {
                        i2 = i5 + 1;
                        break;
                    }
                    i6 = i5;
                } else if (strK.charAt(i5) == '\"') {
                    String string = Html.fromHtml(strK.substring(i6 + 1, i5), r1).toString();
                    if (strSubstring != null) {
                        linkedHashMap2.put(strSubstring.toLowerCase(Locale.ROOT), string);
                        strSubstring = null;
                        strSubstring2 = null;
                    } else {
                        strSubstring2 = string;
                    }
                    z2 = r1;
                    i6 = i5;
                }
                i5++;
                r1 = 0;
            }
            if (i2 == -1) {
                length = i4;
            } else {
                int iL2 = StringsKt.L(strK, "</link>", i2, false, 4);
                if (iL2 == -1) {
                    break;
                }
                String strSubstring3 = strK.substring(i2, iL2);
                if (i3 < arrayList.size()) {
                    int i9 = i3 + 1;
                    String strL = sko.l("[", strSubstring3, "](", c.o(c.o(c.o((String) arrayList.get(i3), " ", "%20"), "(", "%28"), ")", "%29"), ")");
                    strK = sko.k(strK.substring(0, iL), strL, strK.substring(iL2 + 7));
                    length = iL + strL.length();
                    i3 = i9;
                } else {
                    String str2 = (String) linkedHashMap2.get("category");
                    if (str2 == null) {
                        str2 = "";
                    }
                    String upperCase = str2.toUpperCase(Locale.ROOT);
                    Object obj = linkedHashMap.get(upperCase);
                    Object obj2 = obj;
                    if (obj == null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        linkedHashMap.put(upperCase, linkedHashSet);
                        obj2 = linkedHashSet;
                    }
                    ((Set) obj2).add(strSubstring3);
                    strK = sko.k(strK.substring(0, iL), strSubstring3, strK.substring(iL2 + 7));
                    length = iL + strSubstring3.length();
                    z = false;
                }
            }
            z = false;
        }
        return strK;
    }

    public static final f99 t(f99 f99Var) {
        return f99Var instanceof lak ? f99Var : u(f99Var, c);
    }

    public static final cc7 u(f99 f99Var, Function1 function1) {
        if (f99Var instanceof cc7) {
            cc7 cc7Var = (cc7) f99Var;
            if (cc7Var.b == function1) {
                return cc7Var;
            }
        }
        return new cc7(f99Var, function1);
    }

    public static void v(Context context, int i2, String str, String str2, Callback callback) {
        hk6 hk6VarS;
        if (!TextUtils.isEmpty(str2)) {
            G(context, i2, str2).f(new phi(new ir8(context, i2, str, callback)));
            return;
        }
        hk6.e.getClass();
        if (!a36.p(str) || (hk6VarS = a36.s(str)) == null) {
            int i3 = vmj.g;
            callback.run(tmj.j(context, str, i2, i2, 48));
        } else {
            int i4 = hk6VarS.b;
            Integer num = hk6VarS.c;
            int i5 = gk6.j;
            callback.run(s16.t(context, i4, num, i2, 0, 48));
        }
    }

    public static final int w(int i2, k5c k5cVar, Object obj) {
        int iC;
        return (obj == null || k5cVar.getItemCount() == 0 || (i2 < k5cVar.getItemCount() && obj.equals(k5cVar.d(i2))) || (iC = k5cVar.c(obj)) == -1) ? i2 : iC;
    }

    public static Range x(ate ateVar) {
        Range range = ateVar.d;
        if (range == null && ateVar.e == null) {
            return null;
        }
        Range range2 = ateVar.e;
        return range == null ? range2 : (range2 == null || ((Number) range2.getLower()).intValue() >= ((Number) range.getLower()).intValue()) ? range : range2;
    }

    public static final View y(b8e b8eVar) {
        c6n c6nVar = ui6.e0(b8eVar.a).o;
        View view = c6nVar != null ? c6nVar.b : null;
        if (view != null) {
            return view;
        }
        qp2.n("Could not fetch interop view");
        return null;
    }

    public static final int z(g7j g7jVar, boolean z, boolean z2, boolean z3) {
        eu1 eu1Var;
        switch (g7jVar.ordinal()) {
            case 0:
                eu1Var = eu1.f;
                break;
            case 1:
                eu1Var = eu1.g;
                break;
            case 2:
                eu1Var = eu1.h;
                break;
            case 3:
                eu1Var = eu1.i;
                break;
            case 4:
                eu1Var = eu1.j;
                break;
            case 5:
                eu1Var = eu1.k;
                break;
            case 6:
                eu1Var = eu1.l;
                break;
            case 7:
                eu1Var = eu1.m;
                break;
            case 8:
                eu1Var = eu1.n;
                break;
            default:
                h9o.p();
                return 0;
        }
        return z3 ? eu1Var.a : z2 ? z ? eu1Var.b : eu1Var.c : z ? eu1Var.d : eu1Var.e;
    }
}
