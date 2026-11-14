package defpackage;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ism implements zrm {
    public static final cd5 l = sfe.d(new r0i(4, null));
    public static final cd5 m;
    public final n7h a;
    public final n7h b;
    public final vsm c;
    public final n7h d;
    public final ctm e;
    public final yg4 f;
    public volatile boolean g;
    public final zyk h;
    public final zyk i;
    public final zyk j;
    public final LinkedHashMap k = new LinkedHashMap();

    static {
        cd5 cd5Var = new cd5();
        cd5Var.k((CancellationException) null);
        m = cd5Var;
    }

    public ism(n7h n7hVar, n7h n7hVar2, vsm vsmVar, n7h n7hVar3, ctm ctmVar, yg4 yg4Var) {
        this.a = n7hVar;
        this.b = n7hVar2;
        this.c = vsmVar;
        this.d = n7hVar3;
        this.e = ctmVar;
        this.f = yg4Var;
        final byte b = 0;
        this.h = z4c.b(new Function0(this) { // from class: asm
            public final /* synthetic */ ism b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b2 = b;
                ism ismVar = this.b;
                switch (b2) {
                    case 0:
                        return (ni4) ismVar.a.get();
                    case 1:
                        return (btm) ismVar.d.get();
                    default:
                        return (nsm) ismVar.b.get();
                }
            }
        });
        final byte b2 = 1;
        this.i = z4c.b(new Function0(this) { // from class: asm
            public final /* synthetic */ ism b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b2;
                ism ismVar = this.b;
                switch (b22) {
                    case 0:
                        return (ni4) ismVar.a.get();
                    case 1:
                        return (btm) ismVar.d.get();
                    default:
                        return (nsm) ismVar.b.get();
                }
            }
        });
        final byte b3 = 2;
        this.j = z4c.b(new Function0(this) { // from class: asm
            public final /* synthetic */ ism b;

            {
                this.b = this;
            }

            public final Object invoke() {
                byte b22 = b3;
                ism ismVar = this.b;
                switch (b22) {
                    case 0:
                        return (ni4) ismVar.a.get();
                    case 1:
                        return (btm) ismVar.d.get();
                    default:
                        return (nsm) ismVar.b.get();
                }
            }
        });
    }

    public static ArrayList n(int i, String str) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            cd5 cd5Var = new cd5();
            cd5Var.B0(new gwa(2, str, (Throwable) null));
            arrayList.add(cd5Var);
        }
        return arrayList;
    }

    public static bsm o(LinkedHashMap linkedHashMap) {
        bsm bsmVar = new bsm((u59) null, (LinkedHashMap) null, new wwh(1), 7);
        h58 h58Var = yrm.e;
        w4 w4VarE = sko.e(h58Var, h58Var);
        while (w4VarE.hasNext()) {
            bsm bsmVar2 = (bsm) linkedHashMap.get((yrm) w4VarE.next());
            if (bsmVar2 != null) {
                bsmVar.a.K((fee) bsmVar2.a.b);
                bsmVar.b.putAll(bsmVar2.b);
                bsmVar.c.addAll(bsmVar2.c);
                wwh wwhVar = bsmVar2.d;
                if (wwhVar != null) {
                    bsmVar.d = wwhVar;
                }
            }
        }
        return bsmVar;
    }

    @Override // defpackage.zrm
    public final h07 a(List list, List list2, List list3, jyc jycVar, y10 y10Var, long j) {
        cd5 cd5VarP = !this.g ? p(new esm(this, list, list2, list3, jycVar, y10Var, j, null)) : null;
        return cd5VarP == null ? l : cd5VarP;
    }

    @Override // defpackage.zrm
    public final Object b(kuk kukVar) {
        btm btmVar = (btm) this.i.getValue();
        btmVar.getClass();
        return btm.a(btmVar, kukVar);
    }

    @Override // defpackage.zrm
    public final List c(ArrayList arrayList, int i, int i2, int i3) {
        ArrayList arrayList2;
        ArrayList arrayList3 = null;
        if (this.g) {
            arrayList2 = arrayList;
        } else {
            int size = arrayList.size();
            arrayList2 = arrayList;
            csm csmVar = new csm(this, arrayList2, i, i2, i3, null);
            ctm ctmVar = this.e;
            rx5 rx5Var = Intrinsics.a(ctmVar.d.get(), Boolean.TRUE) ? rx5.d : rx5.a;
            ArrayList arrayList4 = new ArrayList(size);
            for (int i4 = 0; i4 < size; i4++) {
                arrayList4.add(new cd5());
            }
            na2.B(ctmVar.f, null, rx5Var, new hkm(csmVar, arrayList4, arrayList3, (byte) 2), 1);
            arrayList3 = arrayList4;
        }
        return arrayList3 == null ? n(arrayList2.size(), "Capture request is cancelled on closed CameraGraph") : arrayList3;
    }

    @Override // defpackage.zrm
    public final void close() {
        this.g = true;
        nsm nsmVar = (nsm) this.j.getValue();
        synchronized (nsmVar.c) {
            if (nsmVar.g) {
                nsmVar.g = false;
                cd5 cd5Var = nsmVar.d;
                if (cd5Var != null) {
                    cd5Var.B0(new CancellationException("UseCaseCameraState closed"));
                }
                nsmVar.d = null;
            }
            while (!nsmVar.f.isEmpty()) {
                ((ksm) nsmVar.f.removeFirst()).b.B0(new CancellationException("UseCaseCameraState closed"));
                nsmVar.q.b();
            }
        }
    }

    @Override // defpackage.zrm
    public final h07 d(LinkedHashSet linkedHashSet, boolean z) {
        cd5 cd5VarP = this.g ? null : p(new hsm(linkedHashSet, z, this, null));
        return cd5VarP == null ? m : cd5VarP;
    }

    @Override // defpackage.zrm
    public final h07 e() {
        cd5 cd5VarP = this.g ? null : p(new s23((byte) 16, (mt5) null, this));
        return cd5VarP == null ? l : cd5VarP;
    }

    @Override // defpackage.zrm
    public final h07 f() {
        cd5 cd5VarP = this.g ? null : p(new pv((byte) 21, null, this));
        return cd5VarP == null ? l : cd5VarP;
    }

    @Override // defpackage.zrm
    public final h07 g(List list, List list2, List list3) {
        cd5 cd5VarP = !this.g ? p(new fsm(this, list, list2, list3, null)) : null;
        return cd5VarP == null ? l : cd5VarP;
    }

    @Override // defpackage.zrm
    public final h07 i(eb4 eb4Var, Map map) {
        cd5 cd5VarP = this.g ? null : p(new k50(this, eb4Var, map, null, (byte) 11));
        return cd5VarP == null ? m : cd5VarP;
    }

    @Override // defpackage.zrm
    public final h07 j(int i) {
        cd5 cd5VarP = this.g ? null : p(new dsm(this, i, null));
        return cd5VarP == null ? l : cd5VarP;
    }

    @Override // defpackage.zrm
    public final h07 k(List list) {
        yrm yrmVar = yrm.a;
        cd5 cd5VarP = this.g ? null : p(new u11(this, list, null));
        return cd5VarP == null ? m : cd5VarP;
    }

    @Override // defpackage.zrm
    public final h07 l(Map map, sj5 sj5Var) {
        yrm yrmVar = yrm.a;
        cd5 cd5VarP = this.g ? null : p(new k50(this, map, sj5Var, null));
        return cd5VarP == null ? m : cd5VarP;
    }

    @Override // defpackage.zrm
    public final h07 m(Map map, sj5 sj5Var) {
        yrm yrmVar = yrm.a;
        if (this.g) {
            return m;
        }
        if (Intrinsics.a(this.e.d.get(), Boolean.TRUE)) {
            return na2.g(this.e.f, null, rx5.d, new sbl(this, map, sj5Var, (mt5) null), 1);
        }
        rqd.e(Thread.currentThread().getName(), "Thread check failed: This method must be called from the UseCaseThreads sequential scope. Current thread: ");
        return null;
    }

    public final cd5 p(Function1 function1) {
        ctm ctmVar = this.e;
        rx5 rx5Var = Intrinsics.a(ctmVar.d.get(), Boolean.TRUE) ? rx5.d : rx5.a;
        cd5 cd5Var = new cd5();
        na2.B(ctmVar.f, null, rx5Var, new hkm(function1, cd5Var, null, (byte) 1), 1);
        return cd5Var;
    }

    public final Object q(Map map, sj5 sj5Var, kuk kukVar) {
        yrm yrmVar = yrm.b;
        if (gyg.G(3, "CXCP")) {
            Objects.toString(yrmVar);
            Objects.toString(map);
            Objects.toString(sj5Var);
        }
        LinkedHashMap linkedHashMap = this.k;
        Object bsmVar = linkedHashMap.get(yrmVar);
        if (bsmVar == null) {
            bsmVar = new bsm((u59) null, (LinkedHashMap) null, (wwh) null, 15);
            linkedHashMap.put(yrmVar, bsmVar);
        }
        bsm bsmVar2 = (bsm) bsmVar;
        u59 u59Var = new u59((byte) 20);
        u59Var.K((fee) bsmVar2.a.b);
        for (Map.Entry entry : map.entrySet()) {
            CaptureRequest.Key key = (CaptureRequest.Key) entry.getKey();
            Object value = entry.getValue();
            ((fee) u59Var.b).q(gyg.q(key), sj5Var, value);
        }
        linkedHashMap.put(yrmVar, new bsm(u59Var, new LinkedHashMap(bsmVar2.b), CollectionsKt.m0(bsmVar2.c), bsmVar2.d));
        return r(o(linkedHashMap), null, kukVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.bsm r10, java.util.LinkedHashSet r11, nt5 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.gsm
            if (r0 == 0) goto L14
            r0 = r12
            gsm r0 = (defpackage.gsm) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.v = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            gsm r0 = new gsm
            r0.<init>(r9, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.t
            px5 r0 = px5.a
            int r1 = r7.v
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 != r3) goto L2b
            defpackage.ybh.y(r12)
            goto Lb1
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r9)
            return r2
        L31:
            defpackage.ybh.y(r12)
            boolean r12 = r9.g
            if (r12 != 0) goto Lb4
            yg4 r12 = r9.f
            if (r12 == 0) goto L4c
            an2 r1 = defpackage.qa4.a
            wrf r12 = r12.a
            an2 r1 = defpackage.qa4.a
            java.lang.Object r12 = r12.b(r1, r2)
            if (r12 == 0) goto L4c
            h9o.t()
            return r2
        L4c:
            zyk r12 = r9.h
            java.lang.Object r12 = r12.getValue()
            ni4 r12 = (defpackage.ni4) r12
            wwh r1 = r10.d
            int r1 = r1.a
            r2 = -1
            if (r1 != r2) goto L5c
            r1 = r3
        L5c:
            r12.c(r1)
            zyk r9 = r9.j
            java.lang.Object r9 = r9.getValue()
            r1 = r9
            nsm r1 = (defpackage.nsm) r1
            u59 r9 = r10.a
            eb4 r9 = r9.b()
            java.util.LinkedHashMap r2 = defpackage.gyg.X(r9)
            kxd r9 = defpackage.kbl.a
            bfe r12 = defpackage.bfe.a()
            java.util.Map r4 = r10.b
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L82:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L9e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            android.util.ArrayMap r8 = r12.a
            r8.put(r6, r5)
            goto L82
        L9e:
            java.util.Map r9 = java.util.Collections.singletonMap(r9, r12)
            wwh r5 = r10.d
            java.util.Set r6 = r10.c
            r7.v = r3
            r3 = r9
            r4 = r11
            java.lang.Object r12 = r1.c(r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto Lb1
            return r0
        Lb1:
            r2 = r12
            h07 r2 = (h07) r2
        Lb4:
            if (r2 != 0) goto Lb9
            cd5 r9 = defpackage.ism.m
            return r9
        Lb9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ism.r(bsm, java.util.LinkedHashSet, nt5):java.lang.Object");
    }
}
