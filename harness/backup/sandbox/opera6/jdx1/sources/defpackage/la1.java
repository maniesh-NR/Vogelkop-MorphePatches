package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class la1 implements Function2 {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ c8e c;
    public final /* synthetic */ k9f d;

    public /* synthetic */ la1(long j, boolean z, c8e c8eVar, k9f k9fVar) {
        this.a = j;
        this.b = z;
        this.c = c8eVar;
        this.d = k9fVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        ih5 ih5Var = (ih5) obj;
        int iIntValue = ((Integer) obj2).intValue();
        final byte b = 1;
        final byte b2 = 0;
        vt9 vt9Var = (vt9) ih5Var;
        if (vt9Var.N(iIntValue & 1, (iIntValue & 3) != 2)) {
            long j = this.a;
            boolean z = this.b;
            c8e c8eVar = this.c;
            final k9f k9fVar = this.d;
            zpa zpaVar = hh5.a;
            if (j != 9205357640488583168L) {
                vt9Var.W(3458246);
                u62 u62Var = z ? aib.b : aib.a;
                c8e c8eVarG = mpj.g(c8eVar, kh7.b(j), kh7.a(j), 0.0f, 0.0f, 12);
                o9i o9iVarA = m9i.a(u62Var, rbe.k, vt9Var, 0);
                int iHashCode = Long.hashCode(vt9Var.T);
                oag oagVarL = vt9Var.l();
                c8e c8eVarP = qyn.P(vt9Var, c8eVarG);
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
                boolean zH = vt9Var.h(k9fVar);
                Object objK = vt9Var.K();
                if (zH || objK == zpaVar) {
                    objK = new Function0() { // from class: ma1
                        /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke() {
                            /*
                                r9 = this;
                                byte r0 = r2
                                r1 = 0
                                r2 = 1
                                r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
                                r5 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
                                k9f r9 = r1
                                switch(r0) {
                                    case 0: goto L1d;
                                    default: goto L13;
                                }
                            L13:
                                long r7 = r9.a()
                                long r7 = r7 & r5
                                int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                                if (r9 == 0) goto L27
                                goto L26
                            L1d:
                                long r7 = r9.a()
                                long r7 = r7 & r5
                                int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                                if (r9 == 0) goto L27
                            L26:
                                r1 = r2
                            L27:
                                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
                                return r9
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.ma1.invoke():java.lang.Object");
                        }
                    };
                    vt9Var.g0(objK);
                }
                scd.i(6, vt9Var, z7e.b, (Function0) objK, z);
                vt9Var.p(true);
                vt9Var.p(false);
            } else {
                vt9Var.W(4389176);
                boolean zH2 = vt9Var.h(k9fVar);
                Object objK2 = vt9Var.K();
                if (zH2 || objK2 == zpaVar) {
                    objK2 = new Function0() { // from class: ma1
                        public final Object invoke() {
                            /*
                                this = this;
                                byte r0 = r2
                                r1 = 0
                                r2 = 1
                                r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
                                r5 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
                                k9f r9 = r1
                                switch(r0) {
                                    case 0: goto L1d;
                                    default: goto L13;
                                }
                            L13:
                                long r7 = r9.a()
                                long r7 = r7 & r5
                                int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                                if (r9 == 0) goto L27
                                goto L26
                            L1d:
                                long r7 = r9.a()
                                long r7 = r7 & r5
                                int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                                if (r9 == 0) goto L27
                            L26:
                                r1 = r2
                            L27:
                                java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
                                return r9
                            */
                            throw new UnsupportedOperationException("Method not decompiled: defpackage.ma1.invoke():java.lang.Object");
                        }
                    };
                    vt9Var.g0(objK2);
                }
                scd.i(0, vt9Var, c8eVar, (Function0) objK2, z);
                vt9Var.p(false);
            }
        } else {
            vt9Var.Q();
        }
        return Unit.a;
    }
}
