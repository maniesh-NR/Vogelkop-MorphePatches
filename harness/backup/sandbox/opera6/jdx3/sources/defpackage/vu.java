package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vu implements w5g {
    public w3g a;
    public z3 b;
    public final /* synthetic */ xu c;

    public vu(xu xuVar) {
        this.c = xuVar;
    }

    @Override // defpackage.w5g
    public final void a() {
        Object next;
        w3g w3gVar = this.a;
        if (w3gVar != null) {
            a4g a4gVar = this.c.b.e;
            List listUnmodifiableList = a4gVar != null ? Collections.unmodifiableList(a4gVar.a) : null;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = l08.a;
            }
            Iterator it = listUnmodifiableList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                w3g w3gVar2 = (w3g) next;
                if (Intrinsics.a(w3gVar2.g, w3gVar.g) && Intrinsics.a(w3gVar2.f, w3gVar.f)) {
                    break;
                }
            }
            w3g w3gVar3 = (w3g) next;
            if (w3gVar3 != null) {
                z3 z3Var = this.b;
                if (z3Var != null) {
                    z3Var.invoke(w3gVar3);
                }
                this.a = null;
                this.b = null;
            }
        }
    }
}
