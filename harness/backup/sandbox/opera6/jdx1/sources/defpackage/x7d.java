package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Region;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.Range;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import androidx.core.app.NotificationCompat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.c;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class x7d implements s37 {
    public static volatile g7a a;
    public static ExecutorService c;
    public static final char[] e;
    public static final Object f;
    public static final StackTraceElement[] g;
    public static final voh h;
    public static final String[] i;
    public static final iip j;
    public static Boolean k;
    public static Boolean l;
    public static Boolean m;
    public static Boolean n;
    public static Boolean o;
    public static Boolean p;
    public static Boolean q;
    public static final Object b = new Object();
    public static final ue5 d = new ue5(1372970887, new ef5((byte) 21), false);

    static {
        new ue5(-169554406, new gf5((byte) 5), false);
        e = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        f = new Object();
        g = new StackTraceElement[0];
        h = new voh(0.0f, 0.0f, 10.0f, 10.0f);
        i = new String[]{"google"};
        j = new iip((byte) 3);
    }

    public static void A(MediaFormat mediaFormat, byte[][] bArr) {
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (bArr[i2].length != 0) {
                mediaFormat.setByteBuffer(sko.i(i2, "csd-"), ByteBuffer.wrap(bArr[i2]));
            }
        }
    }

    public static void B(ViewGroup viewGroup, View view, Function0 function0) {
        new exd(viewGroup, new l11(3, new ixh(8.0f).k(view.getContext()), 48, view), Collections.singletonList(new gtd(new rxh(2132020895), new lxh(2131232064), new xt(function0, (byte) 0)))).f();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public static final long C(voh vohVar) {
        float f2 = vohVar.c - vohVar.a;
        float f3 = vohVar.d - vohVar.b;
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
    }

    public static int D(int i2) {
        return (int) (Integer.rotateLeft((int) (i2 * (-862048943)), 15) * 461845907);
    }

    public static int E(Object obj) {
        return D(obj == null ? 0 : obj.hashCode());
    }

    public static int F(int i2, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i2] & 255 : obj instanceof short[] ? ((short[]) obj)[i2] & 65535 : ((int[]) obj)[i2];
    }

    public static void G(int i2, int i3, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i2] = (byte) i3;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i2] = (short) i3;
        } else {
            ((int[]) obj)[i2] = i3;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: n1e */
    public static final void H(int[] iArr, int[] iArr2, SerialDescriptor serialDescriptor) throws n1e {
        ArrayList arrayList = new ArrayList();
        int length = iArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr2[i2] & (~iArr[i2]);
            if (i3 != 0) {
                for (int i4 = 0; i4 < 32; i4++) {
                    if ((i3 & 1) != 0) {
                        arrayList.add(serialDescriptor.f((i2 << 5) + i4));
                    }
                    i3 >>>= 1;
                }
            }
        }
        throw new n1e(serialDescriptor.i(), arrayList);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: n1e */
    public static final void I(int i2, int i3, SerialDescriptor serialDescriptor) throws n1e {
        ArrayList arrayList = new ArrayList();
        int i4 = i3 & (~i2);
        for (int i5 = 0; i5 < 32; i5++) {
            if ((i4 & 1) != 0) {
                arrayList.add(serialDescriptor.f(i5));
            }
            i4 >>>= 1;
        }
        throw new n1e(serialDescriptor.i(), arrayList);
    }

    public static final char[] J(String str) {
        int length = str.length();
        char[] cArr = new char[length];
        for (int i2 = 0; i2 < length; i2++) {
            cArr[i2] = str.charAt(i2);
        }
        return cArr;
    }

    public static CharSequence K(String str, Range range) {
        if (range == null) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new StyleSpan(1), ((Number) range.getLower()).intValue(), ((Number) range.getUpper()).intValue(), 33);
        return spannableStringBuilder;
    }

    public static final void a(final String str, final Function1 function1, final c8e c8eVar, final boolean z, final boolean z2, final ikl iklVar, final rvb rvbVar, final ovb ovbVar, final boolean z3, final int i2, final int i3, final uac uacVar, Function1 function12, final lde ldeVar, final nvj nvjVar, final ue5 ue5Var, ih5 ih5Var, final int i4) {
        vt9 vt9Var;
        final Function1 function13;
        Function1 function14;
        int i5;
        int i6;
        vt9 vt9Var2 = (vt9) ih5Var;
        vt9Var2.Y(2026950908);
        int i7 = i4 | (vt9Var2.f(str) ? 4 : 2) | (vt9Var2.h(function1) ? 32 : 16) | (vt9Var2.f(c8eVar) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var2.g(z) ? 2048 : 1024) | (vt9Var2.g(z2) ? 16384 : 8192) | (vt9Var2.f(iklVar) ? 131072 : 65536) | (vt9Var2.f(rvbVar) ? 1048576 : 524288) | (vt9Var2.f(ovbVar) ? 8388608 : 4194304) | (vt9Var2.g(z3) ? 67108864 : 33554432) | (vt9Var2.d(i2) ? 536870912 : 268435456);
        int i8 = 196608 | (vt9Var2.d(i3) ? 4 : 2) | (vt9Var2.f(uacVar) ? 32 : 16) | 384 | (vt9Var2.f(ldeVar) ? 2048 : 1024) | (vt9Var2.f(nvjVar) ? 16384 : 8192);
        if (vt9Var2.N(i7 & 1, ((306783379 & i7) == 306783378 && (i8 & 74899) == 74898) ? false : true)) {
            vt9Var2.S();
            int i9 = i4 & 1;
            Object obj = hh5.a;
            if (i9 == 0 || vt9Var2.x()) {
                Object objK = vt9Var2.K();
                if (objK == obj) {
                    objK = new f32((byte) 17);
                    vt9Var2.g0(objK);
                }
                function14 = (Function1) objK;
            } else {
                vt9Var2.Q();
                function14 = function12;
            }
            vt9Var2.q();
            Object objK2 = vt9Var2.K();
            if (objK2 == obj) {
                objK2 = hyg.k(new mil(6, 0L, str));
                vt9Var2.g0(objK2);
            }
            afe afeVar = (afe) objK2;
            mil milVar = (mil) afeVar.getValue();
            mil milVar2 = new mil(new sf1(str), milVar.b, milVar.c);
            boolean zF = vt9Var2.f(milVar2);
            Object objK3 = vt9Var2.K();
            if (zF || objK3 == obj) {
                objK3 = new gb3(milVar2, afeVar, (byte) 0);
                vt9Var2.g0(objK3);
            }
            rm5.L(vt9Var2, (Function0) objK3);
            boolean z4 = (i7 & 14) == 4;
            Object objK4 = vt9Var2.K();
            if (z4 || objK4 == obj) {
                objK4 = hyg.k(str);
                vt9Var2.g0(objK4);
            }
            afe afeVar2 = (afe) objK4;
            rvbVar.getClass();
            int i10 = rvbVar.a;
            wvb wvbVar = new wvb(i10);
            if (i10 == 0) {
                wvbVar = null;
            }
            int i11 = wvbVar != null ? wvbVar.a : 1;
            int i12 = rvbVar.b;
            h0b h0bVar = new h0b(i12);
            if (i12 == -1) {
                h0bVar = null;
            }
            k0b k0bVar = new k0b(z3, 0, true, i11, h0bVar != null ? h0bVar.a : 1, awc.c);
            boolean z5 = !z3;
            if (z3) {
                i5 = 1;
                function13 = function14;
                i6 = 1;
            } else {
                i5 = i3;
                function13 = function14;
                i6 = i2;
            }
            boolean zF2 = vt9Var2.f(afeVar2) | ((i7 & 112) == 32);
            Object objK5 = vt9Var2.K();
            if (zF2 || objK5 == obj) {
                objK5 = new f9(function1, afeVar, afeVar2);
                vt9Var2.g0(objK5);
            }
            int i13 = i8 << 9;
            vt9Var = vt9Var2;
            cs5.f(milVar2, (Function1) objK5, c8eVar, iklVar, uacVar, function13, ldeVar, nvjVar, z5, i6, i5, k0bVar, ovbVar, z, z2, ue5Var, vt9Var, (i7 & 896) | ((i7 >> 6) & 7168) | (i13 & 57344) | 196608 | (3670016 & i13) | (i13 & 29360128), ((i7 >> 15) & 896) | (i7 & 7168) | (i7 & 57344) | 196608);
        } else {
            vt9Var = vt9Var2;
            vt9Var.Q();
            function13 = function12;
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new Function2(str, function1, c8eVar, z, z2, iklVar, rvbVar, ovbVar, z3, i2, i3, uacVar, function13, ldeVar, nvjVar, ue5Var, i4) { // from class: hb3
                public final /* synthetic */ String a;
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ c8e c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ ikl f;
                public final /* synthetic */ rvb g;
                public final /* synthetic */ ovb h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ int j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ uac l;
                public final /* synthetic */ Function1 m;
                public final /* synthetic */ lde n;
                public final /* synthetic */ nvj o;
                public final /* synthetic */ ue5 p;

                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM = aoh.m(1);
                    String str2 = this.a;
                    Function1 function15 = this.b;
                    c8e c8eVar2 = this.c;
                    boolean z6 = this.d;
                    boolean z7 = this.e;
                    ikl iklVar2 = this.f;
                    rvb rvbVar2 = this.g;
                    ovb ovbVar2 = this.h;
                    boolean z8 = this.i;
                    int i14 = this.j;
                    boolean z9 = this.k;
                    uac uacVar2 = this.l;
                    Function1 function16 = this.m;
                    lde ldeVar2 = this.n;
                    nvj nvjVar2 = this.o;
                    ue5 ue5Var2 = this.p;
                    x7d.a(str2, function15, c8eVar2, z6, z7, iklVar2, rvbVar2, ovbVar2, z8, i14, z9 ? 1 : 0, uacVar2, function16, ldeVar2, nvjVar2, ue5Var2, (ih5) obj2, iM);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(String str, c8e c8eVar, ih5 ih5Var, int i2, int i3) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(-661451178);
        int i4 = (vt9Var.f(str) ? 4 : 2) | i2;
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= vt9Var.f(c8eVar) ? 32 : 16;
        }
        if (vt9Var.N(i4 & 1, (i4 & 19) != 18)) {
            if (i5 != 0) {
                c8eVar = z7e.b;
            }
            c8e c8eVarH = mpj.h(c8eVar, 24.0f);
            u8i u8iVar = v8i.a;
            c8e c8eVarJ = lcp.j(x1p.j(c8eVarH, u8iVar), 1.0f, ((kk8) vt9Var.j(lk8.a)).i, u8iVar);
            yya yyaVar = new yya((Context) vt9Var.j(j41.b));
            yyaVar.c = sko.k("https://mini-static.operacdn.com/", str.toLowerCase(Locale.ROOT), ".png");
            hn9.a(yyaVar.a(), null, c8eVarJ, null, jr5.a, null, vt9Var, 1572912, 1976);
        } else {
            vt9Var.Q();
        }
        c8e c8eVar2 = c8eVar;
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new dy5(str, c8eVar2, i2, i3, (byte) 0);
        }
    }

    public static final void c(k5c k5cVar, Object obj, int i2, Object obj2, ih5 ih5Var, int i3) {
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(1439843069);
        int i4 = (vt9Var.f(k5cVar) ? 4 : 2) | i3 | (vt9Var.f(obj) ? 32 : 16) | (vt9Var.d(i2) ? NotificationCompat.FLAG_LOCAL_ONLY : NotificationCompat.FLAG_HIGH_PRIORITY) | (vt9Var.f(obj2) ? 2048 : 1024);
        if (vt9Var.N(i4 & 1, (i4 & 1171) != 1170)) {
            ((sji) obj).b(obj2, gyg.P(980966366, new uf1(i2, k5cVar, obj2), vt9Var), vt9Var, 48);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new ga1(k5cVar, obj, i2, obj2, i3);
        }
    }

    public static Object d(int i2) {
        if (i2 >= 2 && i2 <= 1073741824 && Integer.highestOneBit(i2) == i2) {
            return i2 <= 256 ? new byte[i2] : i2 <= 65536 ? new short[i2] : new int[i2];
        }
        qp2.o(sko.i(i2, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0299  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.media.MediaFormat e(java.lang.String r17, int r18, int r19, byte[][] r20, int r21, int r22, int r23, org.chromium.media.HdrMetadata r24, boolean r25, int r26) throws java.lang.ClassNotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x7d.e(java.lang.String, int, int, byte[][], int, int, int, org.chromium.media.HdrMetadata, boolean, int):android.media.MediaFormat");
    }

    public static void f(mk7 mk7Var, w7d w7dVar, long j2) {
        if (w7dVar instanceof mtf) {
            voh vohVar = ((mtf) w7dVar).k;
            float f2 = vohVar.a;
            float f3 = vohVar.b;
            mk7Var.C0(j2, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), C(vohVar), 1.0f, 3);
            return;
        }
        boolean z = w7dVar instanceof ntf;
        a39 a39Var = a39.a;
        if (!z) {
            if (w7dVar instanceof ltf) {
                mk7Var.T(((ltf) w7dVar).k, j2, 1.0f, a39Var);
                return;
            } else {
                h9o.p();
                return;
            }
        }
        ntf ntfVar = (ntf) w7dVar;
        d91 d91Var = ntfVar.l;
        if (d91Var != null) {
            mk7Var.T(d91Var, j2, 1.0f, a39Var);
            return;
        }
        h8i h8iVar = ntfVar.k;
        float f4 = h8iVar.b;
        float f5 = h8iVar.a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (h8iVar.h >> 32));
        float f6 = h8iVar.c - f5;
        float f7 = h8iVar.d - f4;
        mk7Var.H(j2, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L), (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), a39Var);
    }

    public static final Object g(i54 i54Var, nt5 nt5Var) throws Throwable {
        Throwable thE = i54Var.e();
        if (thE != null) {
            throw thE;
        }
        if (!i54Var.i()) {
            c04 c04VarA = i54Var.a();
            c04VarA.u();
            if (((int) c04VarA.c) < 1048576) {
                return Unit.a;
            }
        }
        Object objC = i54Var.c(nt5Var);
        return objC == px5.a ? objC : Unit.a;
    }

    public static final jde h(i3j i3jVar, Function1 function1) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            k0j k0jVarA = i3jVar.A();
            m3c m3cVar = k0jVarA.c;
            if (!m3cVar.I() || !m3cVar.H()) {
                return xbb.a;
            }
            voh vohVarG = k0jVarA.g();
            jde jdeVar = new jde(48);
            isd isdVar = new isd((byte) 23);
            isdVar.K(f03.f0(vohVarG));
            k(new isd((byte) 23), isdVar, jdeVar, k0jVarA, k0jVarA, function1);
            return jdeVar;
        } finally {
            Trace.endSection();
        }
    }

    public static final void i(isd isdVar, isd isdVar2, jde jdeVar, k0j k0jVar, k0j k0jVar2, Function1 function1) {
        isd isdVar3 = isdVar;
        Region region = (Region) isdVar3.b;
        isd isdVar4 = isdVar2;
        Region region2 = (Region) isdVar4.b;
        m3c m3cVar = k0jVar2.c;
        m3c m3cVar2 = k0jVar2.c;
        if (!m3cVar.I() || !m3cVar2.H() || region2.isEmpty()) {
            if (k0jVar2.o()) {
                j(jdeVar, k0jVar, k0jVar2);
                return;
            }
            return;
        }
        voh vohVarN = k0jVar2.n();
        if (vohVarN.f()) {
            Object objF = k0jVar2.f();
            if (objF == null) {
                j8b j8bVar = (j8b) m3cVar2.F.b;
                vohVarN = rm5.v(j8bVar).y(j8bVar, false);
            } else {
                b8e b8eVar = ((b8e) objF).a;
                Object objG = k0jVar2.d.a.g(e0j.b);
                if (objG == null) {
                    objG = null;
                }
                boolean z = objG != null;
                if (!b8eVar.a.n) {
                    vohVarN = voh.e;
                } else if (z) {
                    vohVarN = ui6.c0(b8eVar, 8).w1();
                } else {
                    wye wyeVarC0 = ui6.c0(b8eVar, 8);
                    vohVarN = rm5.v(wyeVarC0).y(wyeVarC0, false);
                }
            }
        }
        ccb ccbVarF0 = f03.f0(vohVarN);
        isdVar3.K(ccbVarF0);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i2 = k0jVar2.f;
            k0j k0jVar3 = k0jVar;
            if (i2 == k0jVar3.f) {
                i2 = -1;
            }
            Rect bounds = region.getBounds();
            m0j m0jVar = new m0j(k0jVar2, new ccb(bounds.left, bounds.top, bounds.right, bounds.bottom));
            jde jdeVar2 = jdeVar;
            jdeVar2.i(i2, m0jVar);
            List listJ = k0j.j(4, k0jVar2);
            int size = listJ.size() - 1;
            while (-1 < size) {
                if (!((Boolean) function1.invoke(listJ.get(size))).booleanValue()) {
                    i(isdVar3, isdVar4, jdeVar2, k0jVar3, (k0j) listJ.get(size), function1);
                }
                size--;
                isdVar3 = isdVar;
                isdVar4 = isdVar2;
                jdeVar2 = jdeVar;
                k0jVar3 = k0jVar;
            }
            if (q(k0jVar2)) {
                region2.op(ccbVarF0.a, ccbVarF0.b, ccbVarF0.c, ccbVarF0.d, Region.Op.DIFFERENCE);
            }
        }
    }

    public static final void j(jde jdeVar, k0j k0jVar, k0j k0jVar2) {
        m3c m3cVar;
        k0j k0jVarL = k0jVar2.l();
        voh vohVarG = (k0jVarL == null || (m3cVar = k0jVarL.c) == null || !m3cVar.I()) ? h : k0jVarL.g();
        int i2 = k0jVar2.f;
        if (i2 == k0jVar.f) {
            i2 = -1;
        }
        jdeVar.i(i2, new m0j(k0jVar2, f03.f0(vohVarG)));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(isd r17, isd r18, defpackage.jde r19, defpackage.k0j r20, defpackage.k0j r21, kotlin.jvm.functions.Function1 r22) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x7d.k(isd, isd, jde, k0j, k0j, kotlin.jvm.functions.Function1):void");
    }

    public static ScheduledExecutorService l() {
        if (a != null) {
            return a;
        }
        synchronized (x7d.class) {
            if (a == null) {
                a = new g7a(new Handler(Looper.getMainLooper()));
            }
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m(androidx.recyclerview.widget.RecyclerView r3) {
        /*
            androidx.recyclerview.widget.f r3 = r3.n
            r0 = 0
            if (r3 == 0) goto L1a
            boolean r1 = r3 instanceof androidx.recyclerview.widget.GridLayoutManager
            r2 = 12
            if (r1 != 0) goto L1b
            boolean r1 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r1 == 0) goto L1a
            androidx.recyclerview.widget.LinearLayoutManager r3 = (androidx.recyclerview.widget.LinearLayoutManager) r3
            int r3 = r3.getOrientation()
            r1 = 1
            if (r3 == r1) goto L1b
            r2 = 3
            goto L1b
        L1a:
            r2 = r0
        L1b:
            int r3 = defpackage.clb.j(r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x7d.m(androidx.recyclerview.widget.RecyclerView):int");
    }

    public static boolean n(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static final boolean o(Context context) {
        hs3.a.getClass();
        es3 es3VarN = n9a.n("beta");
        return ((es3VarN != hs3.b && es3VarN != hs3.c) || r9n.F(context) || i0l.g()) ? false : true;
    }

    public static final boolean p(k0j k0jVar) {
        wye wyeVarD = k0jVar.d();
        see seeVar = k0jVar.d.a;
        return (wyeVarD != null ? wyeVarD.i1() : false) || seeVar.c(n0j.q) || seeVar.c(n0j.p);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean q(defpackage.k0j r14) {
        /*
            boolean r0 = p(r14)
            r1 = 0
            if (r0 != 0) goto L5a
            f0j r14 = r14.d
            boolean r0 = r14.c
            if (r0 != 0) goto L4d
            see r14 = r14.a
            java.lang.Object[] r0 = r14.b
            java.lang.Object[] r2 = r14.c
            long[] r14 = r14.a
            int r3 = r14.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5a
            r4 = r1
        L1b:
            r5 = r14[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L55
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L35:
            if (r9 >= r7) goto L53
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4f
            int r10 = r4 << 3
            int r10 = r10 + r9
            r11 = r0[r10]
            r10 = r2[r10]
            p0j r11 = (defpackage.p0j) r11
            boolean r10 = r11.c
            if (r10 == 0) goto L4f
        L4d:
            r14 = 1
            return r14
        L4f:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L53:
            if (r7 != r8) goto L5a
        L55:
            if (r4 == r3) goto L5a
            int r4 = r4 + 1
            goto L1b
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x7d.q(k0j):boolean");
    }

    public static boolean r(Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        Boolean boolValueOf = n;
        if (boolValueOf == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z = true;
            }
            boolValueOf = Boolean.valueOf(z);
            n = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean s(Context context) {
        Resources resources = context.getResources();
        if (resources == null) {
            return false;
        }
        Boolean boolValueOf = l;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || r(resources));
            l = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static boolean t(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = q;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback"));
            q = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList u(vpb r5) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            org.json.JSONArray r1 = r5.a
            int r2 = r1.length()
            r0.<init>(r2)
            int r1 = r1.length()
            r2 = 0
        L10:
            if (r2 >= r1) goto Lcd
            java.lang.String r3 = r5.d(r2)
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toUpperCase(r4)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1853007448: goto Lb9;
                case -1843721363: goto Lae;
                case -1812368614: goto La3;
                case -1799129208: goto L98;
                case -678717592: goto L8d;
                case -135275590: goto L82;
                case 2392787: goto L77;
                case 75532016: goto L6c;
                case 79114068: goto L61;
                case 438165864: goto L55;
                case 501263071: goto L49;
                case 965494257: goto L3d;
                case 2009386219: goto L31;
                case 2095065135: goto L25;
                default: goto L23;
            }
        L23:
            goto Lc1
        L25:
            java.lang.String r4 = "GAMING"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lc1
            kq8 r3 = defpackage.kq8.j
            goto Lc6
        L31:
            java.lang.String r4 = "DATING"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lc1
            kq8 r3 = defpackage.kq8.f
            goto Lc6
        L3d:
            java.lang.String r4 = "GOVERNMENT"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lc1
            kq8 r3 = defpackage.kq8.k
            goto Lc6
        L49:
            java.lang.String r4 = "BETTING"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lc1
            kq8 r3 = defpackage.kq8.e
            goto Lc6
        L55:
            java.lang.String r4 = "SHOPPING"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lc1
            kq8 r3 = defpackage.kq8.o
            goto Lc6
        L61:
            java.lang.String r4 = "SPORT"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lc1
            kq8 r3 = defpackage.kq8.q
            goto Lc6
        L6c:
            java.lang.String r4 = "OTHER"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lc1
            kq8 r3 = defpackage.kq8.m
            goto Lc6
        L77:
            java.lang.String r4 = "NEWS"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lc1
            kq8 r3 = defpackage.kq8.l
            goto Lc6
        L82:
            java.lang.String r4 = "FINANCE"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lc1
            kq8 r3 = defpackage.kq8.i
            goto Lc6
        L8d:
            java.lang.String r4 = "ENTERTAINMENT"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lc1
            kq8 r3 = defpackage.kq8.h
            goto Lc6
        L98:
            java.lang.String r4 = "EDUCATION"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lc1
            kq8 r3 = defpackage.kq8.g
            goto Lc6
        La3:
            java.lang.String r4 = "TRAVEL"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lc1
            kq8 r3 = defpackage.kq8.r
            goto Lc6
        Lae:
            java.lang.String r4 = "SOCIAL"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lc1
            kq8 r3 = defpackage.kq8.p
            goto Lc6
        Lb9:
            java.lang.String r4 = "SEARCH"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Lc4
        Lc1:
            kq8 r3 = defpackage.kq8.m
            goto Lc6
        Lc4:
            kq8 r3 = defpackage.kq8.n
        Lc6:
            r0.add(r3)
            int r2 = r2 + 1
            goto L10
        Lcd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x7d.u(vpb):java.util.ArrayList");
    }

    public static lq8 v(orb orbVar, mq8 mq8Var) throws JSONException {
        String strE = orbVar.e("originalUrl");
        int i2 = orbVar.a.getInt("id");
        String strE2 = orbVar.e("name");
        String strM = orbVar.m("iconURL", (String) null);
        return new lq8(i2, strE2, (strM == null || strM.length() <= 0) ? null : strM, String.valueOf(wqm.a("https://", orbVar.e("originalUrl"))), c.o(c.o(c.o(mq8Var.a, "{originalUrl}", a26.C(strE)), "{country}", mq8Var.b), "{product}", mq8Var.c), CollectionsKt.n0(u(orbVar.b("categories"))));
    }

    public static oq8 w(String str, String str2, String str3) {
        orb orbVar = new orb(str);
        vpb vpbVarB = orbVar.b("tiles");
        JSONArray jSONArray = vpbVarB.a;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        String strE = orbVar.e("redirectUrlTemplate");
        mq8 mq8Var = new mq8(strE, str2, str3);
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            try {
                arrayList.add(v(vpbVarB.c(i2), mq8Var));
            } catch (JSONException unused) {
            }
        }
        return new oq8(orbVar.e("accessId"), arrayList, u(orbVar.b("categories")), strE, orbVar.a.getInt("validityTimeInMillis"));
    }

    public static int x(int i2, int i3, int i4) {
        return (i2 & (~i4)) | (i3 & i4);
    }

    public static final void y(b8e b8eVar, Function0 function0) {
        k7f k7fVar = b8eVar.g;
        if (k7fVar == null) {
            k7fVar = new k7f((j7f) b8eVar);
            b8eVar.g = k7fVar;
        }
        ((tuj) ui6.f0(b8eVar).K.a).e(k7fVar, k7f.b, function0);
    }

    public static int z(Object obj, Object obj2, int i2, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i3;
        int i4;
        int iE = E(obj);
        int i5 = iE & i2;
        int iF = F(i5, obj3);
        if (iF != 0) {
            int i6 = ~i2;
            int i7 = iE & i6;
            int i8 = -1;
            while (true) {
                i3 = iF - 1;
                i4 = iArr[i3];
                if ((i4 & i6) == i7 && Objects.equals(obj, objArr[i3]) && (objArr2 == null || Objects.equals(obj2, objArr2[i3]))) {
                    break;
                }
                int i9 = i4 & i2;
                if (i9 == 0) {
                    break;
                }
                i8 = i3;
                iF = i9;
            }
            int i10 = i4 & i2;
            if (i8 == -1) {
                G(i5, i10, obj3);
                return i3;
            }
            iArr[i8] = x(iArr[i8], i10, i2);
            return i3;
        }
        return -1;
    }
}
