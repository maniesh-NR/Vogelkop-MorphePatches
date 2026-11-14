package defpackage;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class j5k {
    public final Set a;
    public final ArrayDeque b;
    public final dl c;
    public final bz d;
    public final /* synthetic */ k5k e;

    public j5k(k5k k5kVar, dl dlVar, bz bzVar) {
        Objects.requireNonNull(k5kVar);
        this.e = k5kVar;
        this.a = Collections.newSetFromMap(new WeakHashMap());
        this.b = new ArrayDeque();
        this.c = dlVar;
        this.d = bzVar;
    }

    public final boolean a(yz yzVar, mq mqVar, txi txiVar) {
        k5k k5kVar = this.e;
        if (!((k5kVar.g == null || yzVar.d(iq.a)) ? k5kVar.d.f.H(this.c, mqVar, yzVar, false) : false)) {
            return false;
        }
        mqVar.j = mqVar.i;
        mqVar.i = lq.d;
        vml.c(new ll4(this, yzVar, mqVar, txiVar, (byte) 2));
        return true;
    }
}
