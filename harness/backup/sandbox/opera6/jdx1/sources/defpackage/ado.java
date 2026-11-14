package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class ado implements Function2 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ pqh b;
    public final /* synthetic */ tlh c;
    public final /* synthetic */ pqh d;
    public final /* synthetic */ pqh e;

    public /* synthetic */ ado(pqh pqhVar, tlh tlhVar, pqh pqhVar2, pqh pqhVar3) {
        this.b = pqhVar;
        this.c = tlhVar;
        this.d = pqhVar2;
        this.e = pqhVar3;
    }

    public /* synthetic */ ado(tlh tlhVar, pqh pqhVar, pqh pqhVar2, pqh pqhVar3) {
        this.c = tlhVar;
        this.b = pqhVar;
        this.d = pqhVar2;
        this.e = pqhVar3;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        pqh pqhVar = this.e;
        pqh pqhVar2 = this.d;
        tlh tlhVar = this.c;
        pqh pqhVar3 = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue == 21589) {
                    if (jLongValue < 1) {
                        s49.m("bad zip: extended timestamp extra too short");
                        break;
                    } else {
                        byte b2 = tlhVar.readByte();
                        boolean z = (b2 & 1) == 1;
                        boolean z2 = (b2 & 2) == 2;
                        boolean z3 = (b2 & 4) == 4;
                        long j = z ? 5L : 1L;
                        if (z2) {
                            j += 4;
                        }
                        if (z3) {
                            j += 4;
                        }
                        if (jLongValue < j) {
                            s49.m("bad zip: extended timestamp extra too short");
                            break;
                        } else {
                            if (z) {
                                pqhVar3.a = Integer.valueOf(tlhVar.m());
                            }
                            if (z2) {
                                pqhVar2.a = Integer.valueOf(tlhVar.m());
                            }
                            if (z3) {
                                pqhVar.a = Integer.valueOf(tlhVar.m());
                            }
                        }
                    }
                }
                break;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                long jLongValue2 = ((Long) obj2).longValue();
                if (iIntValue2 == 1) {
                    if (pqhVar3.a != null) {
                        s49.m("bad zip: NTFS extra attribute tag 0x0001 repeated");
                        break;
                    } else if (jLongValue2 != 24) {
                        s49.m("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                        break;
                    } else {
                        pqhVar3.a = Long.valueOf(tlhVar.n());
                        pqhVar2.a = Long.valueOf(tlhVar.n());
                        pqhVar.a = Long.valueOf(tlhVar.n());
                    }
                }
                break;
        }
        return Unit.a;
    }
}
