package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class pjb {
    public final y5i a;
    public final g7m b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final AtomicInteger e;
    public final fza f;
    public final fza g;
    public final yqa h;
    public final Object i;

    public pjb(y5i y5iVar, HashMap map, HashMap map2, String... strArr) {
        this.a = y5iVar;
        g7m g7mVar = new g7m(y5iVar, map, map2, strArr, y5iVar.k, new ci7(1, this, pjb.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, (byte) 14));
        this.b = g7mVar;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new AtomicInteger(0);
        this.f = new fza(this, (byte) 4);
        this.g = new fza(this, (byte) 5);
        this.h = new yqa(y5iVar);
        this.i = new Object();
        g7mVar.k = new q4b(this, (byte) 6);
    }

    public final b6i a(String[] strArr, boolean z, Function1 function1) {
        this.b.p(strArr);
        yqa yqaVar = this.h;
        return new b6i((y5i) yqaVar.b, yqaVar, z, strArr, function1);
    }

    public final void b() {
        if (((AtomicBoolean) this.a.g.c).get()) {
            return;
        }
        this.b.j(this.f, this.g);
    }

    public final Object c(kuk kukVar) throws Throwable {
        ynh.k(this.a);
        Object objN = this.b.n(kukVar);
        return objN == px5.a ? objN : Unit.a;
    }
}
