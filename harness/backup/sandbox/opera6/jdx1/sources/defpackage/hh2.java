package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.e;

/* loaded from: classes.dex */
public final class hh2 {
    public final a64 a;
    public final ole b = new ole((byte) 24);
    public final Object c = new Object();
    public final LinkedHashMap d = new LinkedHashMap();
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();

    public hh2(hnl hnlVar, ve4 ve4Var, unb unbVar) {
        this.a = sgb.b(e.a(new csk(unbVar), e.a(hnlVar.h, new jx5("CXCP-AudioRestrictionControllerImpl"))));
        ve4Var.a(te4.b, new q02(this, (byte) 15));
    }

    public final ih2 a() {
        LinkedHashMap linkedHashMap = this.d;
        if (linkedHashMap.containsValue(new ih2(3))) {
            return new ih2(3);
        }
        synchronized (this.c) {
        }
        if (linkedHashMap.containsValue(new ih2(1))) {
            return new ih2(1);
        }
        synchronized (this.c) {
        }
        if (linkedHashMap.containsValue(new ih2(0))) {
            return new ih2(0);
        }
        synchronized (this.c) {
        }
        return null;
    }
}
