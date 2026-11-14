package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class pi3 {
    public final tcl a;
    public final u55 b;
    public final wnm c;
    public final mi3 d;
    public final oi3 e;
    public final qie f;

    public pi3(tcl tclVar, u55 u55Var, wnm wnmVar, mi3 mi3Var) {
        this.a = tclVar;
        this.b = u55Var;
        this.c = wnmVar;
        this.d = mi3Var;
        pjb pjbVar = mi3Var.a.f;
        ekc ekcVarD = b8h.d(b8h.j((pjbVar == null ? null : pjbVar).a(new String[]{"active_block_lists"}, false, new f32(mi3Var, (byte) 20)), new f32((byte) 21)));
        oi3 oi3Var = new oi3();
        oi3Var.s(ekcVarD, new ug(new t02(oi3Var, (byte) 26), (byte) 10));
        oi3Var.s(wnmVar, new ug(new t02(this, (byte) 27), (byte) 10));
        this.e = oi3Var;
        pjb pjbVar2 = mi3Var.a.f;
        (pjbVar2 != null ? pjbVar2 : null).a(new String[]{"active_block_lists"}, false, new f32((byte) 19));
        this.f = new qie((byte) 19);
    }

    public final void a(final boolean z, final long j, final Set set) {
        new rml(Unit.a, this.a).b(new Function1() { // from class: ni3
            /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r24) {
                /*
                    Method dump skipped, instructions count: 284
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ni3.invoke(java.lang.Object):java.lang.Object");
            }
        }).t(new f32((byte) 23)).m(this.f);
    }
}
