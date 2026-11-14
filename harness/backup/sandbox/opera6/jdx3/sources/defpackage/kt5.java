package defpackage;

import java.util.Iterator;
import kotlin.collections.a;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.Regex;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class kt5 {
    public final esk a;
    public final j4c b;
    public final ghf c;
    public final long d;
    public final nx5 e;
    public final nak f;
    public final zyk g;
    public final dx5 h;
    public d3k i;

    public kt5(Object obj, esk eskVar, esk eskVar2, j4c j4cVar, ghf ghfVar, long j, nx5 nx5Var, jg8 jg8Var) {
        this.a = eskVar2;
        this.b = j4cVar;
        this.c = ghfVar;
        this.d = j;
        this.e = nx5Var;
        nak nakVarF = z4o.f(obj);
        this.f = nakVarF;
        a26.j(nakVarF);
        this.g = z4c.b(new d8e(eskVar, (byte) 27));
        this.h = jg8Var.K(1, (String) null);
        na2.B(nx5Var, (CoroutineContext) null, (rx5) null, new agb((byte) 17, null, this), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            boolean r2 = r0 instanceof defpackage.nth
            if (r2 == 0) goto L18
            r2 = r0
            nth r2 = (defpackage.nth) r2
            int r3 = r2.x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.x = r3
        L16:
            r6 = r2
            goto L1e
        L18:
            nth r2 = new nth
            r2.<init>(r1, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r6.v
            px5 r7 = px5.a
            int r2 = r6.x
            r4 = 0
            r8 = 1
            if (r2 == 0) goto L39
            if (r2 != r8) goto L32
            pqh r2 = r6.u
            pqh r3 = r6.t
            ybh.y(r0)
            goto L6c
        L32:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r0)
            r0 = 0
            return r0
        L39:
            pqh r2 = defpackage.sko.f(r0)
            jth r9 = new jth
            orb r14 = new orb
            r14.<init>()
            java.lang.String r10 = ""
            r11 = 0
            r13 = 0
            r9.<init>(r10, r11, r13, r14)
            r2.a = r9
            pqh r3 = new pqh
            r3.<init>()
            c71 r0 = new c71
            r5 = 12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.t = r2
            r6.u = r3
            r6.x = r8
            dx5 r5 = r1.h
            java.lang.Object r0 = na2.Z(r5, r0, r6)
            if (r0 != r7) goto L69
            return r7
        L69:
            r15 = r3
            r3 = r2
            r2 = r15
        L6c:
            esk r0 = r1.a
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r5 = r3.a
            jth r5 = (defpackage.jth) r5
            java.lang.String r5 = r5.a
            boolean r5 = kotlin.jvm.internal.Intrinsics.a(r0, r5)
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Object r3 = r3.a
            jth r3 = (defpackage.jth) r3
            long r9 = r3.b
            java.lang.Long r3 = r3.c
            if (r3 == 0) goto L91
            long r11 = r3.longValue()
            goto L97
        L91:
            long r11 = r1.d
            long r11 = pn7.f(r11)
        L97:
            long r9 = r9 + r11
            int r3 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r3 >= 0) goto L9d
            r8 = 0
        L9d:
            if (r5 == 0) goto Lab
            java.lang.Object r2 = r2.a
            if (r2 == 0) goto Lab
            nak r3 = r1.f
            r3.getClass()
            r3.k(r4, r2)
        Lab:
            if (r5 == 0) goto Laf
            if (r8 == 0) goto Lb2
        Laf:
            r1.c(r0)
        Lb2:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kt5.a(nt5):java.lang.Object");
    }

    public final Object b(orb orbVar) {
        u9d u9dVar = new u9d();
        Iterator<String> itKeys = orbVar.a.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            ehc ehcVarB = a.b();
            vpb vpbVarB = orbVar.b(next);
            int length = vpbVarB.a.length();
            for (int i = 0; i < length; i++) {
                orb orbVarC = vpbVarB.c(i);
                ehcVarB.add(new jt5(new Regex(orbVarC.e("path_regex")), orbVarC.e("prompt_name"), orbVarC.e("prompt")));
            }
            u9dVar.put(next, a.a(ehcVarB));
        }
        return u9dVar.g();
    }

    public final void c(String str) {
        d3k d3kVar = this.i;
        if (d3kVar == null || !d3kVar.isActive()) {
            this.i = na2.B(this.e, (CoroutineContext) null, (rx5) null, new gg6(this, str, System.currentTimeMillis(), (mt5) null, (byte) 2), 3);
        }
    }

    public final orb d(jth jthVar) throws JSONException {
        orb orbVar = new orb();
        orbVar.p(jthVar.a, "language");
        orbVar.o(jthVar.b, "timestamp");
        Long l = jthVar.c;
        if (l != null) {
            orbVar.o(l.longValue(), "max-age");
        }
        orbVar.p(jthVar.d, "prompts");
        return orbVar;
    }
}
