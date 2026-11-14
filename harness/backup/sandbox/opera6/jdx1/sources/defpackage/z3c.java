package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z3c implements eg5 {
    public final m3c a;
    public zh5 b;
    public kkk c;
    public int d;
    public int e;
    public final see f;
    public final see g;
    public final u3c h;
    public final r3c i;
    public final see j;
    public final jkk k;
    public final see l;
    public final dfe m;
    public int n;
    public int o;
    public final String p;

    public z3c(m3c m3cVar, kkk kkkVar) {
        this.a = m3cVar;
        this.c = kkkVar;
        long[] jArr = imi.a;
        this.f = new see();
        this.g = new see();
        this.h = new u3c(this);
        this.i = new r3c(this);
        this.j = new see();
        this.k = new jkk();
        this.l = new see();
        this.m = new dfe(new Object[16]);
        this.p = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    public static void d(s3c s3cVar) {
        tee teeVar;
        f8g f8gVar = s3cVar.f;
        if (f8gVar != null) {
            f8gVar.h.set(h8g.b);
            j1c j1cVar = f8gVar.k;
            if (((tee) j1cVar.c).h()) {
                teeVar = (tee) j1cVar.c;
                tee teeVar2 = jmi.a;
                j1cVar.c = new tee();
                ((dfe) j1cVar.b).h();
            } else {
                teeVar = null;
            }
            j1cVar.c();
            fi5 fi5Var = f8gVar.a;
            fi5Var.q = null;
            if (teeVar != null) {
                fi5Var.u.k = teeVar;
                fi5Var.w = (byte) 2;
            }
            s3cVar.f = null;
            fi5 fi5Var2 = s3cVar.c;
            if (fi5Var2 != null) {
                fi5Var2.m();
            }
            s3cVar.c = null;
        }
    }

    public final void a() {
        i(true);
    }

    public final void b(s3c s3cVar, boolean z) {
        f8g f8gVar = s3cVar.f;
        if (f8gVar != null) {
            ttj ttjVarT = bwg.t();
            Function1 function1E = ttjVarT != null ? ttjVarT.e() : null;
            ttj ttjVarX = bwg.x(ttjVarT);
            try {
                m3c m3cVar = this.a;
                m3cVar.q = true;
                if (!z) {
                    f8gVar.a();
                    s3cVar.f = null;
                    m3cVar.q = false;
                    return;
                } else {
                    while (!f8gVar.c()) {
                        f8gVar.e(new pza((byte) 27));
                    }
                    f8gVar.a();
                    s3cVar.f = null;
                    m3cVar.q = false;
                    return;
                }
            } finally {
                bwg.A(ttjVarT, ttjVarX, function1E);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            m3c r2 = r0.a
            r2.q = r1
            see r1 = r0.f
            java.lang.Object[] r3 = r1.c
            long[] r4 = r1.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L52
            r7 = r6
        L14:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4d
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2e:
            if (r12 >= r10) goto L4b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L47
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            s3c r13 = (defpackage.s3c) r13
            fi5 r13 = r13.c
            if (r13 == 0) goto L47
            r13.m()
        L47:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2e
        L4b:
            if (r10 != r11) goto L52
        L4d:
            if (r7 == r5) goto L52
            int r7 = r7 + 1
            goto L14
        L52:
            r2.P()
            r2.q = r6
            r1.a()
            see r1 = r0.g
            r1.a()
            r0.o = r6
            r0.n = r6
            see r1 = r0.j
            r1.a()
            r0.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3c.c():void");
    }

    public final gkk e(Object obj) {
        return !this.a.H() ? new x3c() : new y3c(this, obj);
    }

    public final void f(int i) {
        boolean z;
        boolean z2 = false;
        this.n = 0;
        List listO = this.a.o();
        bee beeVar = (bee) listO;
        int i2 = (((dfe) beeVar.b).c - this.o) - 1;
        if (i <= i2) {
            this.k.clear();
            if (i <= i2) {
                int i3 = i;
                while (true) {
                    ((gee) this.k.b).a(((s3c) this.f.g((m3c) beeVar.get(i3))).a);
                    if (i3 == i2) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            this.c.r(this.k);
            ttj ttjVarT = bwg.t();
            Function1 function1E = ttjVarT != null ? ttjVarT.e() : null;
            ttj ttjVarX = bwg.x(ttjVarT);
            z = false;
            while (i2 >= i) {
                try {
                    m3c m3cVar = (m3c) ((bee) listO).get(i2);
                    s3c s3cVar = (s3c) this.f.g(m3cVar);
                    Object obj = s3cVar.a;
                    if (((gee) this.k.b).c(obj)) {
                        this.n++;
                        if (((Boolean) s3cVar.g.getValue()).booleanValue()) {
                            q3c q3cVar = m3cVar.G;
                            sfd sfdVar = q3cVar.p;
                            k3c k3cVar = k3c.c;
                            sfdVar.l = k3cVar;
                            u1d u1dVar = q3cVar.q;
                            if (u1dVar != null) {
                                u1dVar.j = k3cVar;
                            }
                            l(s3cVar, false);
                            if (s3cVar.h) {
                                z = true;
                            }
                        }
                    } else {
                        m3c m3cVar2 = this.a;
                        m3cVar2.q = true;
                        this.f.k(m3cVar);
                        fi5 fi5Var = s3cVar.c;
                        if (fi5Var != null) {
                            fi5Var.m();
                        }
                        this.a.Q(i2, 1);
                        m3cVar2.q = false;
                    }
                    this.g.k(obj);
                    i2--;
                } finally {
                    bwg.A(ttjVarT, ttjVarX, function1E);
                }
            }
        } else {
            z = false;
        }
        if (z) {
            synchronized (ytj.c) {
                tee teeVar = ytj.j.h;
                if (teeVar != null) {
                    if (teeVar.h()) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                ytj.c();
            }
        }
        h();
    }

    public final void g(Object obj) {
        h();
        m3c m3cVar = (m3c) this.j.k(obj);
        m3c m3cVar2 = this.a;
        if (m3cVar != null) {
            if (this.o <= 0) {
                a8b.b("No pre-composed items to dispose");
            }
            int iJ = ((dfe) ((bee) m3cVar2.o()).b).j(m3cVar);
            if (iJ < ((dfe) ((bee) m3cVar2.o()).b).c - this.o) {
                a8b.b("Item is not in pre-composed item range");
            }
            this.n++;
            this.o--;
            s3c s3cVar = (s3c) this.f.g(m3cVar);
            if (s3cVar != null) {
                d(s3cVar);
            }
            int i = (((dfe) ((bee) m3cVar2.o()).b).c - this.o) - this.n;
            j(iJ, i);
            f(i);
        }
        if (this.m.i(obj)) {
            m3c.V(m3cVar2, true, 6);
        }
    }

    public final void h() {
        int i = ((dfe) ((bee) this.a.o()).b).c;
        int i2 = this.f.e;
        if (i2 != i) {
            a8b.a("Inconsistency between the count of nodes tracked by the state (" + i2 + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        int i3 = this.n;
        int i4 = this.o;
        if ((i - i3) - i4 < 0) {
            StringBuilder sbO = sko.o(i, i3, "Incorrect state. Total children ", ". Reusable children ", ". Precomposed children ");
            sbO.append(i4);
            a8b.a(sbO.toString());
        }
        int i5 = this.j.e;
        int i6 = this.o;
        if (i5 == i6) {
            return;
        }
        a8b.a("Incorrect state. Precomposed children " + i6 + ". Map size " + i5);
    }

    public final void i(boolean z) {
        this.o = 0;
        this.j.a();
        List listO = this.a.o();
        int i = ((dfe) ((bee) listO).b).c;
        if (this.n != i) {
            this.n = i;
            ttj ttjVarT = bwg.t();
            Function1 function1E = ttjVarT != null ? ttjVarT.e() : null;
            ttj ttjVarX = bwg.x(ttjVarT);
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    m3c m3cVar = (m3c) ((bee) listO).get(i2);
                    s3c s3cVar = (s3c) this.f.g(m3cVar);
                    if (s3cVar != null && ((Boolean) s3cVar.g.getValue()).booleanValue()) {
                        q3c q3cVar = m3cVar.G;
                        sfd sfdVar = q3cVar.p;
                        k3c k3cVar = k3c.c;
                        sfdVar.l = k3cVar;
                        u1d u1dVar = q3cVar.q;
                        if (u1dVar != null) {
                            u1dVar.j = k3cVar;
                        }
                        l(s3cVar, z);
                        s3cVar.a = dkk.a;
                    }
                } catch (Throwable th) {
                    bwg.A(ttjVarT, ttjVarX, function1E);
                    throw th;
                }
            }
            bwg.A(ttjVarT, ttjVarX, function1E);
            this.g.a();
        }
        h();
    }

    public final void j(int i, int i2) {
        m3c m3cVar = this.a;
        m3cVar.q = true;
        m3cVar.L(i, i2, 1);
        m3cVar.q = false;
    }

    public final void k(Object obj, Function2 function2, boolean z) {
        m3c m3cVar = this.a;
        if (m3cVar.H()) {
            h();
            if (this.g.c(obj)) {
                return;
            }
            this.l.k(obj);
            see seeVar = this.j;
            Object objG = seeVar.g(obj);
            if (objG == null) {
                objG = n(obj);
                if (objG != null) {
                    j(((dfe) ((bee) m3cVar.o()).b).j(objG), ((dfe) ((bee) m3cVar.o()).b).c);
                    this.o++;
                } else {
                    int i = ((dfe) ((bee) m3cVar.o()).b).c;
                    m3c m3cVar2 = new m3c(2);
                    m3cVar.q = true;
                    m3cVar.B(i, m3cVar2);
                    m3cVar.q = false;
                    this.o++;
                    objG = m3cVar2;
                }
                seeVar.m(obj, objG);
            }
            m((m3c) objG, obj, z, function2);
        }
    }

    public final void l(s3c s3cVar, boolean z) {
        fi5 fi5Var;
        if (z || !s3cVar.h) {
            s3cVar.g = hyg.k(Boolean.FALSE);
        } else {
            s3cVar.g.setValue(Boolean.FALSE);
        }
        if (s3cVar.f != null) {
            d(s3cVar);
            return;
        }
        if (z) {
            fi5 fi5Var2 = s3cVar.c;
            if (fi5Var2 != null) {
                fi5Var2.l();
                return;
            }
            return;
        }
        v31 v31VarL = p3c.a(this.a).l();
        if (v31VarL != null) {
            v31VarL.L(new q4b(s3cVar, (byte) 10));
        } else {
            if (s3cVar.h || (fi5Var = s3cVar.c) == null) {
                return;
            }
            fi5Var.l();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.m3c r10, java.lang.Object r11, boolean r12, kotlin.jvm.functions.Function2 r13) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z3c.m(m3c, java.lang.Object, boolean, kotlin.jvm.functions.Function2):void");
    }

    public final m3c n(Object obj) {
        see seeVar;
        int i;
        if (this.n == 0) {
            return null;
        }
        bee beeVar = (bee) this.a.o();
        int i2 = ((dfe) beeVar.b).c - this.o;
        int i3 = i2 - this.n;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            seeVar = this.f;
            if (i5 < i3) {
                i = -1;
                break;
            }
            if (Intrinsics.a(((s3c) seeVar.g((m3c) beeVar.get(i5))).a, obj)) {
                i = i5;
                break;
            }
            i5--;
        }
        if (i == -1) {
            while (i4 >= i3) {
                s3c s3cVar = (s3c) seeVar.g((m3c) beeVar.get(i4));
                Object obj2 = s3cVar.a;
                if (obj2 == dkk.a || this.c.u(obj, obj2)) {
                    s3cVar.a = obj;
                    i5 = i4;
                    i = i5;
                    break;
                }
                i4--;
            }
            i5 = i4;
        }
        if (i == -1) {
            return null;
        }
        if (i5 != i3) {
            j(i5, i3);
        }
        this.n--;
        m3c m3cVar = (m3c) beeVar.get(i3);
        s3c s3cVar2 = (s3c) seeVar.g(m3cVar);
        s3cVar2.g = hyg.k(Boolean.TRUE);
        s3cVar2.e = true;
        s3cVar2.d = true;
        return m3cVar;
    }
}
