package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class hkk {
    public final kkk a;
    public z3c b;
    public final ekk c;
    public final ekk d;
    public final ekk e;

    /* JADX WARN: Type inference failed for: r2v1, types: [ekk] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ekk] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ekk] */
    public hkk(kkk kkkVar) {
        this.a = kkkVar;
        final byte b = 0;
        this.c = new Function2(this) { // from class: ekk
            public final /* synthetic */ hkk b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                byte b2 = b;
                hkk hkkVar = this.b;
                switch (b2) {
                    case 0:
                        kkk kkkVar2 = hkkVar.a;
                        m3c m3cVar = (m3c) obj;
                        z3c z3cVar = m3cVar.H;
                        if (z3cVar == null) {
                            z3cVar = new z3c(m3cVar, kkkVar2);
                            m3cVar.H = z3cVar;
                        }
                        hkkVar.b = z3cVar;
                        hkkVar.a().h();
                        z3c z3cVarA = hkkVar.a();
                        if (z3cVarA.c != kkkVar2) {
                            z3cVarA.c = kkkVar2;
                            z3cVarA.i(false);
                            m3c.V(z3cVarA.a, false, 7);
                        }
                        break;
                    case 1:
                        hkkVar.a().b = (zh5) obj2;
                        break;
                    default:
                        z3c z3cVarA2 = hkkVar.a();
                        ((m3c) obj).d0(new w3c(z3cVarA2, (Function2) obj2, z3cVarA2.p));
                        break;
                }
                return Unit.a;
            }
        };
        final byte b2 = 1;
        this.d = new Function2(this) { // from class: ekk
            public final /* synthetic */ hkk b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                byte b22 = b2;
                hkk hkkVar = this.b;
                switch (b22) {
                    case 0:
                        kkk kkkVar2 = hkkVar.a;
                        m3c m3cVar = (m3c) obj;
                        z3c z3cVar = m3cVar.H;
                        if (z3cVar == null) {
                            z3cVar = new z3c(m3cVar, kkkVar2);
                            m3cVar.H = z3cVar;
                        }
                        hkkVar.b = z3cVar;
                        hkkVar.a().h();
                        z3c z3cVarA = hkkVar.a();
                        if (z3cVarA.c != kkkVar2) {
                            z3cVarA.c = kkkVar2;
                            z3cVarA.i(false);
                            m3c.V(z3cVarA.a, false, 7);
                        }
                        break;
                    case 1:
                        hkkVar.a().b = (zh5) obj2;
                        break;
                    default:
                        z3c z3cVarA2 = hkkVar.a();
                        ((m3c) obj).d0(new w3c(z3cVarA2, (Function2) obj2, z3cVarA2.p));
                        break;
                }
                return Unit.a;
            }
        };
        final byte b3 = 2;
        this.e = new Function2(this) { // from class: ekk
            public final /* synthetic */ hkk b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj, Object obj2) {
                byte b22 = b3;
                hkk hkkVar = this.b;
                switch (b22) {
                    case 0:
                        kkk kkkVar2 = hkkVar.a;
                        m3c m3cVar = (m3c) obj;
                        z3c z3cVar = m3cVar.H;
                        if (z3cVar == null) {
                            z3cVar = new z3c(m3cVar, kkkVar2);
                            m3cVar.H = z3cVar;
                        }
                        hkkVar.b = z3cVar;
                        hkkVar.a().h();
                        z3c z3cVarA = hkkVar.a();
                        if (z3cVarA.c != kkkVar2) {
                            z3cVarA.c = kkkVar2;
                            z3cVarA.i(false);
                            m3c.V(z3cVarA.a, false, 7);
                        }
                        break;
                    case 1:
                        hkkVar.a().b = (zh5) obj2;
                        break;
                    default:
                        z3c z3cVarA2 = hkkVar.a();
                        ((m3c) obj).d0(new w3c(z3cVarA2, (Function2) obj2, z3cVarA2.p));
                        break;
                }
                return Unit.a;
            }
        };
    }

    public final z3c a() {
        z3c z3cVar = this.b;
        if (z3cVar != null) {
            return z3cVar;
        }
        qp2.o("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
