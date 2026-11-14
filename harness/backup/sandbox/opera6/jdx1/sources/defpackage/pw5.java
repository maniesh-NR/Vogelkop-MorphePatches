package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class pw5 implements Function1 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ pw5(g1b g1bVar, ad2 ad2Var, boolean z, zca zcaVar, Function1 function1, Function1 function12) {
        this.c = g1bVar;
        this.d = ad2Var;
        this.b = z;
        this.e = zcaVar;
        this.f = function1;
        this.g = function12;
    }

    public /* synthetic */ pw5(gbc gbcVar, boolean z, c2o c2oVar, dil dilVar, mil milVar, i9f i9fVar) {
        this.c = gbcVar;
        this.b = z;
        this.d = c2oVar;
        this.e = dilVar;
        this.f = milVar;
        this.g = i9fVar;
    }

    public final Object invoke(Object obj) {
        djl djlVar;
        b2c b2cVar;
        b2c b2cVar2;
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        boolean z = this.b;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                gbc gbcVar = (gbc) obj6;
                t0g t0gVar = gbcVar.o;
                c2o c2oVar = (c2o) obj5;
                dil dilVar = (dil) obj4;
                mil milVar = (mil) obj3;
                i9f i9fVar = (i9f) obj2;
                b2c b2cVar3 = (b2c) obj;
                gbcVar.h = b2cVar3;
                ojl ojlVarD = gbcVar.d();
                if (ojlVarD != null) {
                    ojlVarD.b = b2cVar3;
                }
                if (z) {
                    if (gbcVar.a() == b7a.b) {
                        if (((Boolean) gbcVar.l.getValue()).booleanValue() && ((h7c) c2oVar).b()) {
                            dilVar.s();
                        } else {
                            dilVar.m();
                        }
                        gbcVar.m.setValue(Boolean.valueOf(dbh.A(dilVar, true)));
                        gbcVar.n.setValue(Boolean.valueOf(dbh.A(dilVar, false)));
                        t0gVar.setValue(Boolean.valueOf(xjl.c(milVar.b)));
                    } else if (gbcVar.a() == b7a.c) {
                        t0gVar.setValue(Boolean.valueOf(dbh.A(dilVar, true)));
                    }
                    cs5.j0(gbcVar, milVar, i9fVar);
                    ojl ojlVarD2 = gbcVar.d();
                    if (ojlVarD2 != null && (djlVar = gbcVar.e) != null && gbcVar.b() && (b2cVar = ojlVarD2.b) != null && b2cVar.f() && (b2cVar2 = ojlVarD2.c) != null) {
                        njl njlVar = ojlVarD2.a;
                        v91 v91Var = new v91(b2cVar, (byte) 20);
                        voh vohVarU = rih.u(b2cVar);
                        voh vohVarY = b2cVar.y(b2cVar2, false);
                        if (Intrinsics.a((djl) djlVar.a.b.get(), djlVar)) {
                            djlVar.b.c(milVar, i9fVar, njlVar, v91Var, vohVarU, vohVarY);
                        }
                    }
                }
                break;
            default:
                g1b g1bVar = (g1b) obj6;
                h6c h6cVar = (h6c) obj;
                h6c.O(h6cVar, "filters", new ue5(-1894169230, new b57((byte) 8, obj4, (Function1) obj3), true), 2);
                h6cVar.P(g1bVar.size(), new oda(new q9a((byte) 6), g1bVar, (byte) 0), new oda(g1bVar, (byte) 1), new ue5(802480018, new pda(g1bVar, (Function1) obj2), true));
                if ((((ad2) obj5) instanceof yc2) && g1bVar.isEmpty()) {
                    h6c.O(h6cVar, null, zi4.d, 3);
                }
                if (z) {
                    h6c.O(h6cVar, null, zi4.e, 3);
                }
                break;
        }
        return Unit.a;
    }
}
