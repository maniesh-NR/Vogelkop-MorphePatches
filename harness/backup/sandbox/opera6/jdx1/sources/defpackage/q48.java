package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q48 extends ozb implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ s48 j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q48(s48 s48Var, long j, byte b) {
        super(1);
        this.i = b;
        this.j = s48Var;
        this.k = j;
    }

    public final Object invoke(Object obj) {
        Function1 function1;
        Function1 function12;
        Function1 function13;
        Function1 function14;
        int iOrdinal;
        byte b = this.i;
        long j = this.k;
        long jB = 0;
        s48 s48Var = this.j;
        switch (b) {
            case 0:
                int iOrdinal2 = ((e48) obj).ordinal();
                if (iOrdinal2 == 0) {
                    mr4 mr4Var = s48Var.t.a.c;
                    if (mr4Var != null && (function1 = mr4Var.b) != null) {
                        j = ((gcb) function1.invoke(new gcb(j))).a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        h9o.p();
                        return null;
                    }
                    mr4 mr4Var2 = s48Var.u.a.c;
                    if (mr4Var2 != null && (function12 = mr4Var2.b) != null) {
                        j = ((gcb) function12.invoke(new gcb(j))).a;
                    }
                }
                return new gcb(j);
            case 1:
                e48 e48Var = (e48) obj;
                if (e48Var == e48.c && s48Var.u.a.b == null) {
                    jB = s48Var.v.i;
                } else {
                    ypj ypjVar = s48Var.t.a.b;
                    long j2 = (ypjVar == null || (function14 = ypjVar.a) == null) ? 0L : ((ybb) function14.invoke(new gcb(j))).a;
                    ypj ypjVar2 = s48Var.u.a.b;
                    long j3 = (ypjVar2 == null || (function13 = ypjVar2.a) == null) ? 0L : ((ybb) function13.invoke(new gcb(j))).a;
                    int iOrdinal3 = e48Var.ordinal();
                    if (iOrdinal3 == 0) {
                        jB = j2;
                    } else if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            h9o.p();
                            return null;
                        }
                        jB = j3;
                    }
                }
                return new ybb(jB);
            default:
                e48 e48Var2 = (e48) obj;
                if (s48Var.z != null && s48Var.V0() != null && !Intrinsics.a(s48Var.z, s48Var.V0()) && (iOrdinal = e48Var2.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        h9o.p();
                        return null;
                    }
                    mr4 mr4Var3 = s48Var.u.a.c;
                    if (mr4Var3 != null) {
                        Function1 function15 = mr4Var3.b;
                        long j4 = this.k;
                        long j5 = ((gcb) function15.invoke(new gcb(j4))).a;
                        rz0 rz0VarV0 = s48Var.V0();
                        d2c d2cVar = d2c.a;
                        jB = ybb.b(((td3) rz0VarV0).a(j4, j5, d2cVar), s48Var.z.a(j4, j5, d2cVar));
                    }
                }
                return new ybb(jB);
        }
    }
}
