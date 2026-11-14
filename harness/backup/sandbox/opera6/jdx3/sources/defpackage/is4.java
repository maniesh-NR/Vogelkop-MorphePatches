package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class is4 {
    public final hs4 a;
    public final Map b;
    public final /* synthetic */ ls4 c;

    public is4(ls4 ls4Var, hs4 hs4Var, Map map) {
        this.c = ls4Var;
        this.a = hs4Var;
        this.b = map;
    }

    public final Object a(u9d u9dVar, Set set, qa6 qa6Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z;
        Object objZ;
        ebb ebbVarA = fbb.a.a();
        EnumSet enumSetNoneOf = EnumSet.noneOf(cs4.class);
        synchronized (this.c.f) {
            this.a.c = ebbVarA;
            Iterator it = u9dVar.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                cs4 cs4Var = (cs4) entry.getKey();
                zy8 zy8Var = (zy8) entry.getValue();
                this.a.a.put(cs4Var, new fs4(zy8Var.a, ebbVarA, zy8Var.b));
                enumSetNoneOf.add(cs4Var);
            }
            if (Intrinsics.a(this.a.b, set)) {
                z = false;
            } else {
                this.a.b = set;
                z = true;
            }
        }
        this.c.d.l(this.a);
        return ((!enumSetNoneOf.isEmpty() || z) && (objZ = na2.Z(dze.b, new r3(this.c, enumSetNoneOf, (mt5) null, (byte) 18), qa6Var)) == px5.a) ? objZ : Unit.a;
    }
}
