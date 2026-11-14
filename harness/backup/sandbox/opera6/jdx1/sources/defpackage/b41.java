package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b41 extends f8 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final ide N;
    public final kde A;
    public final hde B;
    public final hde C;
    public final String D;
    public final String E;
    public final oam F;
    public final jde G;
    public l0j H;
    public boolean I;
    public final hde J;
    public final c4 K;
    public final ArrayList L;
    public final w31 M;
    public final v31 d;
    public final w31 f;
    public final AccessibilityManager g;
    public List i;
    public final x31 j;
    public int k;
    public int l;
    public AccessibilityNodeInfoCompat m;
    public AccessibilityNodeInfoCompat n;
    public boolean o;
    public final jde p;
    public final jde q;
    public final fxj r;
    public final fxj s;
    public int t;
    public Integer u;
    public final t72 v;
    public final p04 w;
    public boolean x;
    public y31 y;
    public jde z;
    public int e = LinearLayoutManager.INVALID_OFFSET;
    public final byte h = 100;

    static {
        int[] iArr = {2131361813, 2131361814, 2131361825, 2131361836, 2131361839, 2131361840, 2131361841, 2131361842, 2131361843, 2131361844, 2131361815, 2131361816, 2131361817, 2131361818, 2131361819, 2131361820, 2131361821, 2131361822, 2131361823, 2131361824, 2131361826, 2131361827, 2131361828, 2131361829, 2131361830, 2131361831, 2131361832, 2131361833, 2131361834, 2131361835, 2131361837, 2131361838};
        ide ideVar = vbb.a;
        ide ideVar2 = new ide(32);
        int i = ideVar2.b;
        if (i < 0) {
            zwg.u("");
            throw null;
        }
        int i2 = i + 32;
        ideVar2.b(i2);
        int[] iArr2 = ideVar2.a;
        int i3 = ideVar2.b;
        if (i != i3) {
            b82.c(i2, i, i3, iArr2, iArr2);
        }
        b82.e(i, 0, 12, iArr, iArr2);
        ideVar2.b += 32;
        N = ideVar2;
    }

    public b41(v31 v31Var) {
        this.d = v31Var;
        byte b = 0;
        this.f = new w31(this, b);
        this.g = (AccessibilityManager) v31Var.getContext().getSystemService("accessibility");
        new Handler(Looper.getMainLooper());
        this.j = new x31(this, b);
        this.k = LinearLayoutManager.INVALID_OFFSET;
        this.l = LinearLayoutManager.INVALID_OFFSET;
        this.p = new jde();
        this.q = new jde();
        this.r = new fxj(0);
        this.s = new fxj(0);
        this.t = -1;
        this.v = new t72(0);
        this.w = xf8.h(1, null, null, 6);
        this.x = true;
        jde jdeVar = xbb.a;
        this.z = jdeVar;
        this.A = new kde();
        this.B = new hde();
        this.C = new hde();
        this.D = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.E = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.F = new oam();
        this.G = new jde();
        this.H = new l0j(v31Var.u.A(), jdeVar);
        int i = sbb.a;
        this.J = new hde();
        v31Var.addOnAttachStateChangeListener(this);
        this.K = new c4(this, (byte) 20);
        this.L = new ArrayList();
        this.M = new w31(this, (byte) 1);
    }

    public static /* synthetic */ void E(b41 b41Var, int i, int i2, Integer num, int i3) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        b41Var.D(i, i2, num, null);
    }

    public static Rect L(w7d w7dVar, float f, float f2) {
        if (!(w7dVar instanceof mtf) && !(w7dVar instanceof ntf)) {
            return null;
        }
        voh vohVarW = w7dVar.w();
        return new Rect((int) (vohVarW.a + f), (int) (vohVarW.b + f2), (int) (vohVarW.c + f), (int) (vohVarW.d + f2));
    }

    public static float[] N(w7d w7dVar) {
        if (!(w7dVar instanceof ntf)) {
            return null;
        }
        h8i h8iVar = ((ntf) w7dVar).k;
        long j = h8iVar.h;
        long j2 = h8iVar.g;
        long j3 = h8iVar.f;
        long j4 = h8iVar.e;
        return new float[]{Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))};
    }

    public static Region O(w7d w7dVar, float f, float f2) {
        if (w7dVar instanceof ltf) {
            d91 d91Var = ((ltf) w7dVar).k;
            voh vohVarH = d91Var.d().h(f, f2);
            Region region = new Region(new Rect((int) (vohVarH.a + 0.0f), (int) (vohVarH.b + 0.0f), (int) (vohVarH.c + 0.0f), (int) (vohVarH.d + 0.0f)));
            Region region2 = new Region();
            if (d91Var != null) {
                Path path = d91Var.a;
                path.offset(f, f2);
                region2.setPath(path, region);
                return region2;
            }
            yt7.k("Unable to obtain android.graphics.Path");
        }
        return null;
    }

    public static CharSequence P(CharSequence charSequence) {
        if (charSequence.length() != 0) {
            int i = 100000;
            if (charSequence.length() > 100000) {
                if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
                    i = 99999;
                }
                return charSequence.subSequence(0, i);
            }
        }
        return charSequence;
    }

    public static String t(k0j k0jVar) {
        sf1 sf1Var;
        if (k0jVar != null) {
            f0j f0jVar = k0jVar.d;
            see seeVar = f0jVar.a;
            p0j p0jVar = n0j.a;
            if (seeVar.c(p0jVar)) {
                return tic.a((List) f0jVar.d(p0jVar), ",", null, 62);
            }
            p0j p0jVar2 = n0j.G;
            if (seeVar.c(p0jVar2)) {
                Object objG = seeVar.g(p0jVar2);
                if (objG == null) {
                    objG = null;
                }
                sf1 sf1Var2 = (sf1) objG;
                if (sf1Var2 != null) {
                    return sf1Var2.b;
                }
            } else {
                Object objG2 = seeVar.g(n0j.C);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                if (list != null && (sf1Var = (sf1) CollectionsKt.firstOrNull(list)) != null) {
                    return sf1Var.b;
                }
            }
        }
        return null;
    }

    public static final boolean x(eoi eoiVar, float f) {
        Function0 function0 = eoiVar.a;
        if (f >= 0.0f || ((Number) function0.invoke()).floatValue() <= 0.0f) {
            return f > 0.0f && ((Number) function0.invoke()).floatValue() < ((Number) eoiVar.b.invoke()).floatValue();
        }
        return true;
    }

    public static final boolean y(eoi eoiVar) {
        Function0 function0 = eoiVar.a;
        if (((Number) function0.invoke()).floatValue() > 0.0f) {
            return true;
        }
        ((Number) function0.invoke()).floatValue();
        ((Number) eoiVar.b.invoke()).floatValue();
        return false;
    }

    public static final boolean z(eoi eoiVar) {
        Function0 function0 = eoiVar.a;
        if (((Number) function0.invoke()).floatValue() < ((Number) eoiVar.b.invoke()).floatValue()) {
            return true;
        }
        ((Number) function0.invoke()).floatValue();
        return false;
    }

    public final int A(int i) {
        if (i == this.d.u.A().f) {
            return -1;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.k0j r20, defpackage.l0j r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = defpackage.fcb.a
            kde r3 = new kde
            r3.<init>()
            r4 = 4
            java.util.List r5 = defpackage.k0j.j(r4, r1)
            m3c r6 = r1.c
            r7 = r5
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            r8 = 0
            r9 = r8
        L1d:
            if (r9 >= r7) goto L43
            java.lang.Object r10 = r5.get(r9)
            k0j r10 = (defpackage.k0j) r10
            jde r11 = r0.s()
            int r10 = r10.f
            boolean r11 = r11.b(r10)
            if (r11 == 0) goto L40
            kde r11 = r2.b
            boolean r11 = r11.c(r10)
            if (r11 != 0) goto L3d
            r0.w(r6)
            return
        L3d:
            r3.a(r10)
        L40:
            int r9 = r9 + 1
            goto L1d
        L43:
            kde r2 = r2.b
            int[] r5 = r2.b
            long[] r2 = r2.a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8e
            r9 = r8
        L4f:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L89
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L69:
            if (r14 >= r12) goto L87
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L83
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.c(r15)
            if (r15 != 0) goto L83
            r0.w(r6)
            return
        L83:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L69
        L87:
            if (r12 != r13) goto L8e
        L89:
            if (r9 == r7) goto L8e
            int r9 = r9 + 1
            goto L4f
        L8e:
            java.util.List r1 = defpackage.k0j.j(r4, r1)
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L99:
            if (r8 >= r2) goto Lbf
            java.lang.Object r3 = r1.get(r8)
            k0j r3 = (defpackage.k0j) r3
            jde r4 = r0.G
            int r5 = r3.f
            java.lang.Object r4 = r4.e(r5)
            l0j r4 = (defpackage.l0j) r4
            if (r4 == 0) goto Lbc
            jde r5 = r0.s()
            int r6 = r3.f
            boolean r5 = r5.b(r6)
            if (r5 == 0) goto Lbc
            r0.B(r3, r4)
        Lbc:
            int r8 = r8 + 1
            goto L99
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b41.B(k0j, l0j):void");
    }

    public final boolean C(AccessibilityEvent accessibilityEvent) {
        if (!v()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.o = true;
        }
        try {
            return ((Boolean) this.f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.o = false;
        }
    }

    public final boolean D(int i, int i2, Integer num, List list) {
        if (i == Integer.MIN_VALUE || !v()) {
            return false;
        }
        AccessibilityEvent accessibilityEventO = o(i, i2);
        if (num != null) {
            accessibilityEventO.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventO.setContentDescription(tic.a(list, ",", null, 62));
        }
        return C(accessibilityEventO);
    }

    public final void F(int i, int i2, String str) {
        AccessibilityEvent accessibilityEventO = o(A(i), 32);
        accessibilityEventO.setContentChangeTypes(i2);
        if (str != null) {
            accessibilityEventO.getText().add(str);
        }
        C(accessibilityEventO);
    }

    public final void G(int i) {
        y31 y31Var = this.y;
        if (y31Var != null) {
            k0j k0jVar = y31Var.a;
            if (i != k0jVar.f) {
                return;
            }
            if (SystemClock.uptimeMillis() - y31Var.f <= 1000) {
                AccessibilityEvent accessibilityEventO = o(A(k0jVar.f), 131072);
                accessibilityEventO.setFromIndex(y31Var.d);
                accessibilityEventO.setToIndex(y31Var.e);
                accessibilityEventO.setAction(y31Var.b);
                accessibilityEventO.setMovementGranularity(y31Var.c);
                accessibilityEventO.getText().add(t(k0jVar));
                C(accessibilityEventO);
            }
        }
        this.y = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(defpackage.jde r59) throws pxb {
        /*
            Method dump skipped, instructions count: 1623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b41.H(jde):void");
    }

    public final void I(m3c m3cVar, kde kdeVar) {
        f0j f0jVarW;
        if (!m3cVar.H() || ((HashMap) this.d.g().c).containsKey(m3cVar)) {
            return;
        }
        m3c m3cVar2 = null;
        if (!m3cVar.F.w(8)) {
            m3cVar = m3cVar.u();
            while (true) {
                if (m3cVar == null) {
                    m3cVar = null;
                    break;
                } else if (m3cVar.F.w(8)) {
                    break;
                } else {
                    m3cVar = m3cVar.u();
                }
            }
        }
        if (m3cVar == null || (f0jVarW = m3cVar.w()) == null) {
            return;
        }
        if (!f0jVarW.c) {
            m3c m3cVarU = m3cVar.u();
            while (true) {
                if (m3cVarU != null) {
                    f0j f0jVarW2 = m3cVarU.w();
                    if (f0jVarW2 != null && f0jVarW2.c) {
                        m3cVar2 = m3cVarU;
                        break;
                    }
                    m3cVarU = m3cVarU.u();
                } else {
                    break;
                }
            }
            if (m3cVar2 != null) {
                m3cVar = m3cVar2;
            }
        }
        int i = m3cVar.b;
        if (kdeVar.a(i)) {
            E(this, A(i), 2048, 1, 8);
        }
    }

    public final void J(m3c m3cVar) {
        if (!m3cVar.H() || ((HashMap) this.d.g().c).containsKey(m3cVar)) {
            return;
        }
        int i = m3cVar.b;
        eoi eoiVar = (eoi) this.p.e(i);
        eoi eoiVar2 = (eoi) this.q.e(i);
        if (eoiVar == null && eoiVar2 == null) {
            return;
        }
        AccessibilityEvent accessibilityEventO = o(i, 4096);
        if (eoiVar != null) {
            accessibilityEventO.setScrollX((int) ((Number) eoiVar.a.invoke()).floatValue());
            accessibilityEventO.setMaxScrollX((int) ((Number) eoiVar.b.invoke()).floatValue());
        }
        if (eoiVar2 != null) {
            accessibilityEventO.setScrollY((int) ((Number) eoiVar2.a.invoke()).floatValue());
            accessibilityEventO.setMaxScrollY((int) ((Number) eoiVar2.b.invoke()).floatValue());
        }
        C(accessibilityEventO);
    }

    public final boolean K(k0j k0jVar, int i, int i2, boolean z) {
        String strT;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        f0j f0jVar = k0jVar.d;
        int i3 = k0jVar.f;
        p0j p0jVar = e0j.j;
        if (f0jVar.a.c(p0jVar) && cqp.N(k0jVar)) {
            cr9 cr9Var = ((c8) k0jVar.d.d(p0jVar)).b;
            if (cr9Var != null) {
                return ((Boolean) cr9Var.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
            }
        } else if ((i != i2 || i2 != this.t) && (strT = t(k0jVar)) != null) {
            if (i < 0 || i != i2 || i2 > strT.length()) {
                i = -1;
            }
            this.t = i;
            boolean z2 = strT.length() > 0;
            int iA = A(i3);
            if (z2) {
                numValueOf = Integer.valueOf(this.t);
                numValueOf2 = Integer.valueOf(this.t);
                numValueOf3 = Integer.valueOf(strT.length());
            } else {
                numValueOf = null;
                numValueOf2 = null;
                numValueOf3 = null;
            }
            C(p(iA, numValueOf, numValueOf2, numValueOf3, strT));
            G(i3);
            return true;
        }
        return false;
    }

    public final Rect M(float f, float f2, float f3, float f4) {
        v31 v31Var = this.d;
        long jX = v31Var.x((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        long jX2 = v31Var.x((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        int i = (int) (jX >> 32);
        int i2 = (int) (jX2 >> 32);
        int i3 = (int) (jX & 4294967295L);
        int i4 = (int) (jX2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0140, code lost:
    
        if (((r7 & ((~r7) << 6)) & r20) == 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0142, code lost:
    
        r14 = -1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q() {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b41.Q():void");
    }

    @Override // defpackage.f8
    public final ole b(View view) {
        return this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r22, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r23, java.lang.String r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 764
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b41.j(int, androidx.core.view.accessibility.AccessibilityNodeInfoCompat, java.lang.String, android.os.Bundle):void");
    }

    public final Rect k(m0j m0jVar) {
        ccb ccbVar = m0jVar.b;
        return M(ccbVar.a, ccbVar.b, ccbVar.c, ccbVar.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c5, code lost:
    
        if (defpackage.nb6.p(r7, r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a A[Catch: all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:13:0x002c, B:22:0x0052, B:25:0x0062, B:27:0x006a, B:29:0x0073, B:34:0x008f, B:37:0x009e, B:39:0x00a7, B:40:0x00aa, B:41:0x00ab, B:18:0x003c, B:21:0x0043, B:30:0x0078, B:32:0x007d, B:33:0x008c), top: B:50:0x0022, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c5 -> B:44:0x00c8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(nt5 r11) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b41.l(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r22, long r23, boolean r25) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b41.m(int, long, boolean):boolean");
    }

    public final void n() {
        Trace.beginSection("Compose:semantics:sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (v()) {
                B(this.d.u.A(), this.H);
            }
            Trace.endSection();
            Trace.beginSection("Compose:semantics:sendSemanticsPropertyChangeEvents");
            try {
                H(s());
                Trace.endSection();
                Trace.beginSection("Compose:semantics:updateSemanticsNodesCopyAndPanes");
                try {
                    Q();
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public final AccessibilityEvent o(int i, int i2) {
        m0j m0jVar;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        v31 v31Var = this.d;
        accessibilityEventObtain.setPackageName(v31Var.getContext().getPackageName());
        accessibilityEventObtain.setSource(v31Var, i);
        if (v() && (m0jVar = (m0j) s().e(i)) != null) {
            k0j k0jVar = m0jVar.a;
            accessibilityEventObtain.setPassword(k0jVar.d.a.c(n0j.N));
            Object objG = k0jVar.d.a.g(n0j.o);
            if (objG == null) {
                objG = null;
            }
            boolean zA = Intrinsics.a(objG, Boolean.TRUE);
            if (Build.VERSION.SDK_INT >= 34) {
                g8.L(accessibilityEventObtain, zA);
            }
        }
        return accessibilityEventObtain;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.i = null;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.i = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager = this.g;
        if (accessibilityManager.isEnabled()) {
            this.i = null;
        }
        accessibilityManager.addAccessibilityStateChangeListener(this);
        accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.d.getHandler().removeCallbacks(this.K);
        AccessibilityManager accessibilityManager = this.g;
        accessibilityManager.removeAccessibilityStateChangeListener(this);
        accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final AccessibilityEvent p(int i, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventO = o(i, 8192);
        if (num != null) {
            accessibilityEventO.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventO.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventO.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventO.getText().add(charSequence);
        }
        return accessibilityEventO;
    }

    public final int q(k0j k0jVar) {
        f0j f0jVar = k0jVar.d;
        if (!f0jVar.a.c(n0j.a)) {
            p0j p0jVar = n0j.H;
            if (f0jVar.a.c(p0jVar)) {
                return (int) (((xjl) f0jVar.d(p0jVar)).a & 4294967295L);
            }
        }
        return this.t;
    }

    public final int r(k0j k0jVar) {
        f0j f0jVar = k0jVar.d;
        if (!f0jVar.a.c(n0j.a)) {
            p0j p0jVar = n0j.H;
            if (f0jVar.a.c(p0jVar)) {
                return (int) (((xjl) f0jVar.d(p0jVar)).a >> 32);
            }
        }
        return this.t;
    }

    public final jde s() {
        if (this.x) {
            this.x = false;
            v31 v31Var = this.d;
            this.z = x7d.h(v31Var.u, new y2((byte) 26));
            if (v()) {
                jde jdeVar = this.z;
                Resources resources = v31Var.getContext().getResources();
                hde hdeVar = this.B;
                hdeVar.a();
                hde hdeVar2 = this.C;
                hdeVar2.a();
                m0j m0jVar = (m0j) jdeVar.e(-1);
                k0j k0jVar = m0jVar != null ? m0jVar.a : null;
                ArrayList arrayListB = r0j.b(k0jVar, new z3(jdeVar, (byte) 18), new z3(resources, (byte) 19), Collections.singletonList(k0jVar));
                int i = 1;
                int size = arrayListB.size() - 1;
                if (1 <= size) {
                    while (true) {
                        int i2 = ((k0j) arrayListB.get(i - 1)).f;
                        int i3 = ((k0j) arrayListB.get(i)).f;
                        hdeVar.f(i2, i3);
                        hdeVar2.f(i3, i2);
                        if (i == size) {
                            break;
                        }
                        i++;
                    }
                }
            }
        }
        return this.z;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074 A[LOOP:0: B:4:0x0016->B:35:0x0074, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0077 A[EDGE_INSN: B:46:0x0077->B:36:0x0077 BREAK  A[LOOP:0: B:4:0x0016->B:35:0x0074], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.voh u(defpackage.k0j r10, android.graphics.Rect r11, defpackage.paj r12) {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b41.u(k0j, android.graphics.Rect, paj):voh");
    }

    public final boolean v() {
        AccessibilityManager accessibilityManager = this.g;
        if (!accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.i;
        if (enabledAccessibilityServiceList == null) {
            enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
            this.i = enabledAccessibilityServiceList;
        }
        return !enabledAccessibilityServiceList.isEmpty();
    }

    public final void w(m3c m3cVar) {
        if (this.v.add(m3cVar)) {
            this.w.b(Unit.a);
        }
    }
}
