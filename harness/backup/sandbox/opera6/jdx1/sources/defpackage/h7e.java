package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h7e implements Function2 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ue5 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public h7e(ikl iklVar, ikl iklVar2, w2m w2mVar, w2m w2mVar2, boolean z, w2m w2mVar3, ue5 ue5Var, dhl dhlVar) {
        this.g = iklVar;
        this.h = iklVar2;
        this.b = w2mVar;
        this.i = w2mVar2;
        this.e = z;
        this.c = w2mVar3;
        this.f = ue5Var;
        this.d = dhlVar;
    }

    public h7e(Function2 function2, cd1 cd1Var, pej pejVar, ue5 ue5Var, ue5 ue5Var2, Function0 function0, nx5 nx5Var, boolean z) {
        this.g = function2;
        this.h = cd1Var;
        this.b = pejVar;
        this.f = ue5Var;
        this.i = ue5Var2;
        this.c = function0;
        this.d = nx5Var;
        this.e = z;
    }

    public h7e(pej pejVar, Function0 function0, nx5 nx5Var, boolean z, String str, String str2, String str3, ue5 ue5Var) {
        this.b = pejVar;
        this.c = function0;
        this.d = nx5Var;
        this.e = z;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.f = ue5Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v2 ikl, still in use, count: 2, list:
          (r14v2 ikl) from 0x007c: MOVE (r46v1 ikl) = (r14v2 ikl)
          (r14v2 ikl) from 0x0062: MOVE (r46v5 ikl) = (r14v2 ikl)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object invoke(java.lang.Object r47, java.lang.Object r48) {
        /*
            Method dump skipped, instructions count: 1416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h7e.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
