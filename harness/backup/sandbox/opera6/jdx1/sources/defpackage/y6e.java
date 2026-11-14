package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class y6e implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ pej b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ nx5 d;

    public /* synthetic */ y6e(pej pejVar, Function0 function0, nx5 nx5Var) {
        this.b = pejVar;
        this.c = function0;
        this.d = nx5Var;
    }

    public /* synthetic */ y6e(pej pejVar, nx5 nx5Var, Function0 function0) {
        this.b = pejVar;
        this.d = nx5Var;
        this.c = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        nx5 nx5Var = this.d;
        final Function0 function0 = this.c;
        final pej pejVar = this.b;
        switch (b) {
            case 0:
                if (((Boolean) ((Function1) pejVar.d.d).invoke(qej.a)).booleanValue()) {
                    d3k d3kVarB = na2.B(nx5Var, null, null, new c7e(pejVar, null, (byte) 3), 3);
                    final byte b2 = 0;
                    d3kVarB.s(new Function1() { // from class: x6e
                        public final Object invoke(Object obj) {
                            switch (b2) {
                                case 0:
                                    if (!pejVar.e()) {
                                        function0.invoke();
                                    }
                                    break;
                                default:
                                    if (!pejVar.e()) {
                                        function0.invoke();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    });
                }
                break;
            default:
                int iOrdinal = pejVar.c().ordinal();
                if (iOrdinal == 1) {
                    function0.invoke();
                } else if (iOrdinal != 2) {
                    na2.B(nx5Var, null, null, new c7e(pejVar, null, (byte) 5), 3);
                } else {
                    na2.B(nx5Var, null, null, new c7e(pejVar, null, (byte) 4), 3);
                }
                break;
        }
        return Unit.a;
    }
}
