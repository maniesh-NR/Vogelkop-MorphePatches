package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class y6h {
    public static final y6h c = new y6h();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final tw2 a = new tw2((byte) 2);

    public final bni a(Class cls) {
        fl8 fl8Var;
        bni bniVarS;
        Class cls2;
        jfb.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        bni bniVar = (bni) concurrentHashMap.get(cls);
        if (bniVar != null) {
            return bniVar;
        }
        Class cls3 = gni.a;
        if (!hv9.class.isAssignableFrom(cls) && (cls2 = gni.a) != null && !cls2.isAssignableFrom(cls)) {
            qp2.o("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            return null;
        }
        ekh ekhVarMessageInfoFor = ((i9d) this.a.b).messageInfoFor(cls);
        if ((ekhVarMessageInfoFor.d & 2) == 2) {
            if (hv9.class.isAssignableFrom(cls)) {
                bniVarS = new uwd(gni.c, il8.a, ekhVarMessageInfoFor.a);
            } else {
                hmm hmmVar = gni.b;
                fl8 fl8Var2 = il8.b;
                if (fl8Var2 == null) {
                    qp2.n("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                bniVarS = new uwd(hmmVar, fl8Var2, ekhVarMessageInfoFor.a);
            }
        } else if (hv9.class.isAssignableFrom(cls)) {
            bniVarS = rwd.s(ekhVarMessageInfoFor, tpe.b, nhc.b, gni.c, vep.A(ekhVarMessageInfoFor.a()) != 1 ? il8.a : null, nad.b);
        } else {
            qpe qpeVar = tpe.a;
            khc khcVar = nhc.a;
            hmm hmmVar2 = gni.b;
            if (vep.A(ekhVarMessageInfoFor.a()) != 1) {
                fl8 fl8Var3 = il8.b;
                if (fl8Var3 == null) {
                    qp2.n("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                fl8Var = fl8Var3;
            } else {
                fl8Var = null;
            }
            bniVarS = rwd.s(ekhVarMessageInfoFor, qpeVar, khcVar, hmmVar2, fl8Var, nad.a);
        }
        bni bniVar2 = (bni) concurrentHashMap.putIfAbsent(cls, bniVarS);
        return bniVar2 != null ? bniVar2 : bniVarS;
    }
}
