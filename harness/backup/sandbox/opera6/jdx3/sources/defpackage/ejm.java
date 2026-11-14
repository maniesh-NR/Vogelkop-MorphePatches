package defpackage;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ejm extends x1p implements Runnable, Iterable, w6f, ptb {
    public final Function1 p;
    public final ArrayDeque q;
    public final LinkedHashMap r;
    public final Handler s;
    public final i7f t;
    public evl u;

    public ejm(tcc tccVar, Function1 function1) {
        this.p = function1;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.q = arrayDeque;
        this.r = new LinkedHashMap();
        this.s = new Handler(Looper.getMainLooper());
        this.t = new i7f();
        this.u = new evl(false);
        oje ojeVar = new oje(6, gjm.g, false);
        fjm fjmVar = new fjm(ojeVar, new djm(tccVar, ojeVar));
        fjm fjmVar2 = (fjm) arrayDeque.peek();
        if (fjmVar2 != null) {
            djm djmVar = fjmVar2.b;
            djmVar.c = false;
            djmVar.a();
        }
        arrayDeque.push(fjmVar);
        run();
    }

    @Override // defpackage.w6f
    public final void F(Object obj) {
        nim nimVar = (nim) obj;
        this.t.b(nimVar);
        evl evlVar = this.u;
        qim qimVar = nimVar.a;
        boolean z = evlVar.a;
        qimVar.q = z;
        if (z) {
            qimVar.e(qimVar.d());
        } else {
            qimVar.a();
        }
    }

    @Override // defpackage.w6f
    public final void H(Object obj) {
        this.t.c((nim) obj);
    }

    public final void K(Fragment fragment) {
        String tag = fragment.getTag();
        if (tag == null) {
            tag = sko.j("unknown-", fragment.getClass().getCanonicalName());
        }
        Iterator it = this.q.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (Intrinsics.a(((fjm) it.next()).a.a, tag)) {
                it.remove();
                break;
            }
        }
        Handler handler = this.s;
        handler.removeCallbacks(this);
        handler.post(this);
    }

    public final void N(Fragment fragment) {
        if (fragment.isInBackStack()) {
            String tag = fragment.getTag();
            if (tag == null) {
                tag = sko.j("unknown-", fragment.getClass().getCanonicalName());
            }
            oje ojeVar = (oje) this.r.remove(tag);
            if (ojeVar == null) {
                cjm cjmVar = (cjm) this.p.invoke(fragment.getClass());
                ojeVar = new oje(2, tag, cjmVar != null ? cjmVar.b : false);
            }
            fjm fjmVar = new fjm(ojeVar, new djm(fragment.getLifecycle(), ojeVar));
            ArrayDeque arrayDeque = this.q;
            fjm fjmVar2 = (fjm) arrayDeque.peek();
            if (fjmVar2 != null) {
                djm djmVar = fjmVar2.b;
                djmVar.c = false;
                djmVar.a();
            }
            arrayDeque.push(fjmVar);
            Handler handler = this.s;
            handler.removeCallbacks(this);
            handler.post(this);
        }
    }

    public final evl Z() {
        boolean z;
        if (((fjm) this.q.peek()).a.c) {
            z = true;
            break;
        }
        Collection collectionValues = this.r.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((oje) it.next()).c) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return new evl(z);
    }

    public final void a0(evl evlVar) {
        if (Intrinsics.a(this.u, evlVar)) {
            return;
        }
        this.u = evlVar;
        i7f i7fVar = this.t;
        g7f g7fVarC = u35.c(i7fVar, i7fVar);
        while (g7fVarC.hasNext()) {
            qim qimVar = ((nim) g7fVarC.next()).a;
            boolean z = evlVar.a;
            qimVar.q = z;
            if (z) {
                qimVar.e(qimVar.d());
            } else {
                qimVar.a();
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        LinkedHashMap linkedHashMap = this.r;
        int size = linkedHashMap.size();
        ArrayDeque arrayDeque = this.q;
        ArrayList arrayList = new ArrayList(arrayDeque.size() + size);
        arrayList.addAll(linkedHashMap.values());
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            arrayList.add(((fjm) it.next()).a);
        }
        return arrayList.iterator();
    }

    @Override // java.lang.Runnable
    public final void run() {
        djm djmVar = ((fjm) this.q.peek()).b;
        djmVar.c = true;
        djmVar.a();
        a0(Z());
    }
}
