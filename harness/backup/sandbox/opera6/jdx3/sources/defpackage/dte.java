package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class dte extends twc {
    public final fqe b;
    public final ru9 c;
    public final x5f d;
    public final bte e;
    public final z8b f;
    public l0c g;
    public boolean h;
    public final cte i;

    public dte(fqe fqeVar, ru9 ru9Var, x5f x5fVar, Context context) {
        this.b = fqeVar;
        this.c = ru9Var;
        this.d = x5fVar;
        kze kzeVar = new kze(l08.a);
        kze kzeVar2 = new kze("");
        kze kzeVar3 = new kze(Boolean.FALSE);
        String string = ru9Var.a.getString("settings.news.language_region.recently_used", "");
        int i = 0;
        List listY = StringsKt.Y(string != null ? string : "", new String[]{";"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it = listY.iterator();
        while (it.hasNext()) {
            l0c l0cVarA = l0c.a((String) it.next());
            if (l0cVarA != null) {
                arrayList.add(l0cVarA);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            l0c l0cVar = (l0c) obj;
            q0c q0cVarA = r0c.a(l0cVar);
            ate ateVar = q0cVarA == null ? null : new ate(l0cVar, context.getString(q0cVarA.a), context.getString(q0cVarA.b));
            if (ateVar != null) {
                arrayList2.add(ateVar);
            }
        }
        this.e = new bte(kzeVar, kzeVar2, kzeVar3, arrayList2);
        this.f = new z8b((byte) 22);
        this.i = new cte(this, context);
    }

    public final bte f() {
        return this.e;
    }

    public final void g(ij0 ij0Var, l0c l0cVar) {
        if (this.h) {
            return;
        }
        this.h = true;
        if (this.g != null) {
            boolean z = l0cVar != null ? !l0cVar.equals(r1) : false;
            vb0 vb0Var = z ? vb0.b : vb0.c;
            String strValueOf = String.valueOf(this.g);
            String string = z ? l0cVar.toString() : null;
            x5f x5fVar = this.d;
            if (x5fVar.h) {
                zpa zpaVar = x5fVar.d;
                x56 x56VarF = zpa.F();
                jj0 jj0Var = new jj0(2443, -1, 4);
                jj0Var.q(0, 1, vb0Var);
                jj0Var.q(1, 1, ij0Var);
                jj0Var.q(2, 1, strValueOf);
                jj0Var.q(3, string != null ? 1 : 0, string);
                xb0 xb0VarX = x56VarF.B(zpaVar).x(zpaVar);
                List list = (List) xb0VarX.n(45);
                ((list == null || list.isEmpty()) ? new hf0(xb0VarX, 45, am2.q(xb0VarX, 45, 1)) : new hf0(xb0VarX, 45, list)).add(jj0Var);
                x5fVar.U0(x56VarF);
            }
        }
    }
}
