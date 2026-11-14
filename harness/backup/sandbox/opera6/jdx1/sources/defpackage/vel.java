package defpackage;

import android.os.Trace;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vel extends b8e implements e3c, lk7, i0j {
    public ace A;
    public tel B;
    public uel C;
    public sf1 o;
    public ikl p;
    public mh9 q;
    public Function1 r;
    public int s;
    public boolean t;
    public int u;
    public int v;
    public List w;
    public Function1 x;
    public Function1 y;
    public LinkedHashMap z;

    @Override // defpackage.e3c
    public final int E(o1d o1dVar, pfd pfdVar, int i) {
        return U0(o1dVar).a(i, o1dVar.getLayoutDirection());
    }

    @Override // defpackage.b8e
    public final boolean I0() {
        return false;
    }

    @Override // defpackage.e3c
    public final int N(o1d o1dVar, pfd pfdVar, int i) {
        return y7h.d(U0(o1dVar).e(o1dVar.getLayoutDirection()).E());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [tel] */
    @Override // defpackage.i0j
    public final void R(q0j q0jVar) {
        tel telVar = this.B;
        tel telVar2 = telVar;
        if (telVar == null) {
            final byte b = 0;
            ?? r0 = new Function1(this) { // from class: tel
                public final /* synthetic */ vel b;

                {
                    this.b = this;
                }

                public final Object invoke(Object obj) {
                    byte b2 = b;
                    njl njlVar = null;
                    vel velVar = this.b;
                    switch (b2) {
                        case 0:
                            List list = (List) obj;
                            njl njlVar2 = velVar.T0().n;
                            if (njlVar2 != null) {
                                mjl mjlVar = njlVar2.a;
                                njl njlVar3 = new njl(new mjl(mjlVar.a, ikl.e(velVar.p, u95.g, 0L, null, 0L, null, 0, 0L, 16777214), mjlVar.c, mjlVar.d, mjlVar.e, mjlVar.f, mjlVar.g, mjlVar.h, mjlVar.i, mjlVar.j), njlVar2.b, njlVar2.c);
                                list.add(njlVar3);
                                njlVar = njlVar3;
                            }
                            boolean z = njlVar != null;
                            return Boolean.valueOf(z);
                        case 1:
                            sf1 sf1Var = (sf1) obj;
                            uel uelVar = velVar.C;
                            if (uelVar == null) {
                                uel uelVar2 = new uel(velVar.o, sf1Var);
                                ace aceVar = new ace(sf1Var, velVar.p, velVar.q, velVar.s, velVar.t, velVar.u, velVar.v, l08.a);
                                aceVar.d(velVar.T0().j);
                                uelVar2.d = aceVar;
                                velVar.C = uelVar2;
                            } else if (!Intrinsics.a(sf1Var, uelVar.b)) {
                                uelVar.b = sf1Var;
                                ace aceVar2 = uelVar.d;
                                if (aceVar2 != null) {
                                    ikl iklVar = velVar.p;
                                    mh9 mh9Var = velVar.q;
                                    int i = velVar.s;
                                    boolean z2 = velVar.t;
                                    int i2 = velVar.u;
                                    int i3 = velVar.v;
                                    l08 l08Var = l08.a;
                                    aceVar2.a = sf1Var;
                                    boolean zC = iklVar.c(aceVar2.k);
                                    aceVar2.k = iklVar;
                                    if (!zC) {
                                        aceVar2.q <<= 2;
                                        aceVar2.l = null;
                                        aceVar2.n = null;
                                        aceVar2.p = -1;
                                        aceVar2.o = -1;
                                    }
                                    aceVar2.b = mh9Var;
                                    aceVar2.c = i;
                                    aceVar2.d = z2;
                                    aceVar2.e = i2;
                                    aceVar2.f = i3;
                                    aceVar2.g = l08Var;
                                    aceVar2.q = (aceVar2.q << 2) | 2;
                                    aceVar2.l = null;
                                    aceVar2.n = null;
                                    aceVar2.p = -1;
                                    aceVar2.o = -1;
                                }
                            }
                            aoh.j(velVar);
                            nb6.F(velVar);
                            c26.y(velVar);
                            return Boolean.TRUE;
                        default:
                            boolean zBooleanValue = ((Boolean) obj).booleanValue();
                            uel uelVar3 = velVar.C;
                            if (uelVar3 != null) {
                                Function1 function1 = velVar.y;
                                if (function1 != null) {
                                    function1.invoke(uelVar3);
                                }
                                uel uelVar4 = velVar.C;
                                if (uelVar4 != null) {
                                    uelVar4.c = zBooleanValue;
                                }
                                aoh.j(velVar);
                                nb6.F(velVar);
                                c26.y(velVar);
                                return Boolean.valueOf(z);
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.B = r0;
            telVar2 = r0;
        }
        sf1 sf1Var = this.o;
        xtb[] xtbVarArr = o0j.a;
        q0jVar.b(n0j.C, Collections.singletonList(sf1Var));
        uel uelVar = this.C;
        if (uelVar != null) {
            sf1 sf1Var2 = uelVar.b;
            p0j p0jVar = n0j.D;
            xtb[] xtbVarArr2 = o0j.a;
            xtb xtbVar = xtbVarArr2[16];
            p0jVar.getClass();
            q0jVar.b(p0jVar, sf1Var2);
            boolean z = uelVar.c;
            p0j p0jVar2 = n0j.E;
            xtb xtbVar2 = xtbVarArr2[17];
            Boolean boolValueOf = Boolean.valueOf(z);
            p0jVar2.getClass();
            q0jVar.b(p0jVar2, boolValueOf);
        }
        final byte b2 = 1;
        q0jVar.b(e0j.l, new c8(null, new Function1(this) { // from class: tel
            public final /* synthetic */ vel b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b22 = b2;
                njl njlVar = null;
                vel velVar = this.b;
                switch (b22) {
                    case 0:
                        List list = (List) obj;
                        njl njlVar2 = velVar.T0().n;
                        if (njlVar2 != null) {
                            mjl mjlVar = njlVar2.a;
                            njl njlVar3 = new njl(new mjl(mjlVar.a, ikl.e(velVar.p, u95.g, 0L, null, 0L, null, 0, 0L, 16777214), mjlVar.c, mjlVar.d, mjlVar.e, mjlVar.f, mjlVar.g, mjlVar.h, mjlVar.i, mjlVar.j), njlVar2.b, njlVar2.c);
                            list.add(njlVar3);
                            njlVar = njlVar3;
                        }
                        boolean z2 = njlVar != null;
                        return Boolean.valueOf(z2);
                    case 1:
                        sf1 sf1Var3 = (sf1) obj;
                        uel uelVar2 = velVar.C;
                        if (uelVar2 == null) {
                            uel uelVar22 = new uel(velVar.o, sf1Var3);
                            ace aceVar = new ace(sf1Var3, velVar.p, velVar.q, velVar.s, velVar.t, velVar.u, velVar.v, l08.a);
                            aceVar.d(velVar.T0().j);
                            uelVar22.d = aceVar;
                            velVar.C = uelVar22;
                        } else if (!Intrinsics.a(sf1Var3, uelVar2.b)) {
                            uelVar2.b = sf1Var3;
                            ace aceVar2 = uelVar2.d;
                            if (aceVar2 != null) {
                                ikl iklVar = velVar.p;
                                mh9 mh9Var = velVar.q;
                                int i = velVar.s;
                                boolean z22 = velVar.t;
                                int i2 = velVar.u;
                                int i3 = velVar.v;
                                l08 l08Var = l08.a;
                                aceVar2.a = sf1Var3;
                                boolean zC = iklVar.c(aceVar2.k);
                                aceVar2.k = iklVar;
                                if (!zC) {
                                    aceVar2.q <<= 2;
                                    aceVar2.l = null;
                                    aceVar2.n = null;
                                    aceVar2.p = -1;
                                    aceVar2.o = -1;
                                }
                                aceVar2.b = mh9Var;
                                aceVar2.c = i;
                                aceVar2.d = z22;
                                aceVar2.e = i2;
                                aceVar2.f = i3;
                                aceVar2.g = l08Var;
                                aceVar2.q = (aceVar2.q << 2) | 2;
                                aceVar2.l = null;
                                aceVar2.n = null;
                                aceVar2.p = -1;
                                aceVar2.o = -1;
                            }
                        }
                        aoh.j(velVar);
                        nb6.F(velVar);
                        c26.y(velVar);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        uel uelVar3 = velVar.C;
                        if (uelVar3 != null) {
                            Function1 function1 = velVar.y;
                            if (function1 != null) {
                                function1.invoke(uelVar3);
                            }
                            uel uelVar4 = velVar.C;
                            if (uelVar4 != null) {
                                uelVar4.c = zBooleanValue;
                            }
                            aoh.j(velVar);
                            nb6.F(velVar);
                            c26.y(velVar);
                            return Boolean.valueOf(z2);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        final byte b3 = 2;
        q0jVar.b(e0j.m, new c8(null, new Function1(this) { // from class: tel
            public final /* synthetic */ vel b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b22 = b3;
                njl njlVar = null;
                vel velVar = this.b;
                switch (b22) {
                    case 0:
                        List list = (List) obj;
                        njl njlVar2 = velVar.T0().n;
                        if (njlVar2 != null) {
                            mjl mjlVar = njlVar2.a;
                            njl njlVar3 = new njl(new mjl(mjlVar.a, ikl.e(velVar.p, u95.g, 0L, null, 0L, null, 0, 0L, 16777214), mjlVar.c, mjlVar.d, mjlVar.e, mjlVar.f, mjlVar.g, mjlVar.h, mjlVar.i, mjlVar.j), njlVar2.b, njlVar2.c);
                            list.add(njlVar3);
                            njlVar = njlVar3;
                        }
                        boolean z2 = njlVar != null;
                        return Boolean.valueOf(z2);
                    case 1:
                        sf1 sf1Var3 = (sf1) obj;
                        uel uelVar2 = velVar.C;
                        if (uelVar2 == null) {
                            uel uelVar22 = new uel(velVar.o, sf1Var3);
                            ace aceVar = new ace(sf1Var3, velVar.p, velVar.q, velVar.s, velVar.t, velVar.u, velVar.v, l08.a);
                            aceVar.d(velVar.T0().j);
                            uelVar22.d = aceVar;
                            velVar.C = uelVar22;
                        } else if (!Intrinsics.a(sf1Var3, uelVar2.b)) {
                            uelVar2.b = sf1Var3;
                            ace aceVar2 = uelVar2.d;
                            if (aceVar2 != null) {
                                ikl iklVar = velVar.p;
                                mh9 mh9Var = velVar.q;
                                int i = velVar.s;
                                boolean z22 = velVar.t;
                                int i2 = velVar.u;
                                int i3 = velVar.v;
                                l08 l08Var = l08.a;
                                aceVar2.a = sf1Var3;
                                boolean zC = iklVar.c(aceVar2.k);
                                aceVar2.k = iklVar;
                                if (!zC) {
                                    aceVar2.q <<= 2;
                                    aceVar2.l = null;
                                    aceVar2.n = null;
                                    aceVar2.p = -1;
                                    aceVar2.o = -1;
                                }
                                aceVar2.b = mh9Var;
                                aceVar2.c = i;
                                aceVar2.d = z22;
                                aceVar2.e = i2;
                                aceVar2.f = i3;
                                aceVar2.g = l08Var;
                                aceVar2.q = (aceVar2.q << 2) | 2;
                                aceVar2.l = null;
                                aceVar2.n = null;
                                aceVar2.p = -1;
                                aceVar2.o = -1;
                            }
                        }
                        aoh.j(velVar);
                        nb6.F(velVar);
                        c26.y(velVar);
                        return Boolean.TRUE;
                    default:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        uel uelVar3 = velVar.C;
                        if (uelVar3 != null) {
                            Function1 function1 = velVar.y;
                            if (function1 != null) {
                                function1.invoke(uelVar3);
                            }
                            uel uelVar4 = velVar.C;
                            if (uelVar4 != null) {
                                uelVar4.c = zBooleanValue;
                            }
                            aoh.j(velVar);
                            nb6.F(velVar);
                            c26.y(velVar);
                            return Boolean.valueOf(z2);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        }));
        q0jVar.b(e0j.n, new c8(null, new p7l(this, (byte) 2)));
        o0j.a(q0jVar, telVar2);
    }

    public final ace T0() {
        ace aceVar = this.A;
        if (aceVar != null) {
            return aceVar;
        }
        ace aceVar2 = new ace(this.o, this.p, this.q, this.s, this.t, this.u, this.v, this.w);
        this.A = aceVar2;
        return aceVar2;
    }

    public final ace U0(n27 n27Var) {
        ace aceVar;
        uel uelVar = this.C;
        if (uelVar != null && uelVar.c && (aceVar = uelVar.d) != null) {
            aceVar.d(n27Var);
            return aceVar;
        }
        ace aceVarT0 = T0();
        aceVarT0.d(n27Var);
        return aceVarT0;
    }

    @Override // defpackage.e3c
    public final ufd c(vfd vfdVar, pfd pfdVar, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            ace aceVarU0 = U0(vfdVar);
            boolean zC = aceVarU0.c(j, vfdVar.getLayoutDirection());
            njl njlVar = aceVarU0.n;
            if (njlVar == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + aceVarU0);
            }
            long j2 = njlVar.c;
            njlVar.b.a.B();
            if (zC) {
                ui6.c0(this, 2).h1();
                Function1 function1 = this.r;
                if (function1 != null) {
                    function1.invoke(njlVar);
                }
                LinkedHashMap linkedHashMap = this.z;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap(2);
                }
                linkedHashMap.put(vz0.a, Integer.valueOf(Math.round(njlVar.d)));
                linkedHashMap.put(vz0.b, Integer.valueOf(Math.round(njlVar.e)));
                this.z = linkedHashMap;
            }
            Function1 function12 = this.x;
            if (function12 != null) {
                function12.invoke(njlVar.f);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            return vfdVar.b0(i, i2, this.z, new f4(pfdVar.N(vtp.F(i, i, i2, i2)), (byte) 14));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.e3c
    public final int f(o1d o1dVar, pfd pfdVar, int i) {
        return y7h.d(U0(o1dVar).e(o1dVar.getLayoutDirection()).D());
    }

    @Override // defpackage.e3c
    public final int r0(o1d o1dVar, pfd pfdVar, int i) {
        return U0(o1dVar).a(i, o1dVar.getLayoutDirection());
    }

    @Override // defpackage.lk7
    public final void v0(o3c o3cVar) {
        List list;
        if (!this.n) {
            return;
        }
        sh4 sh4VarA = o3cVar.a.b.A();
        ace aceVarU0 = U0(o3cVar);
        njl njlVar = aceVarU0.n;
        if (njlVar == null) {
            pza.i(aceVarU0, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
            return;
        }
        xbe xbeVar = njlVar.b;
        long j = njlVar.c;
        boolean z = (((float) ((int) (j >> 32))) < xbeVar.d || xbeVar.c || ((float) ((int) (j & 4294967295L))) < xbeVar.e) && this.s != 3;
        if (z) {
            voh vohVarA = bwg.a(0L, (Float.floatToRawIntBits((int) (j >> 32)) << 32) | (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L));
            sh4VarA.j();
            sh4.r(sh4VarA, vohVarA);
        }
        try {
            rwj rwjVar = this.p.a;
            bgl bglVar = rwjVar.m;
            if (bglVar == null) {
                bglVar = bgl.b;
            }
            bgl bglVar2 = bglVar;
            jaj jajVar = rwjVar.n;
            if (jajVar == null) {
                jajVar = jaj.d;
            }
            jaj jajVar2 = jajVar;
            nk7 nk7Var = rwjVar.p;
            if (nk7Var == null) {
                nk7Var = a39.a;
            }
            nk7 nk7Var2 = nk7Var;
            dz3 dz3VarC = rwjVar.a.c();
            if (dz3VarC != null) {
                xbe.j(xbeVar, sh4VarA, dz3VarC, this.p.a.a.b(), jajVar2, bglVar2, nk7Var2);
            } else {
                long jB = u95.g;
                if (jB == 16) {
                    jB = this.p.b() != 16 ? this.p.b() : u95.b;
                }
                xbe.i(xbeVar, sh4VarA, jB, jajVar2, bglVar2, nk7Var2);
            }
            if (z) {
                sh4VarA.f();
            }
            uel uelVar = this.C;
            if (((uelVar == null || !uelVar.c) ? m5h.o(this.o) : false) || !((list = this.w) == null || list.isEmpty())) {
                o3cVar.a();
            }
        } finally {
        }
    }
}
