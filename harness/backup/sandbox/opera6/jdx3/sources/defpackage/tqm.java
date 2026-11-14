package defpackage;

import android.util.LongSparseArray;
import com.opera.api.Callback;
import java.util.ArrayDeque;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class tqm {
    public final LongSparseArray a = new LongSparseArray();
    public final long b;
    public kqm c;

    public tqm(String str, long j) {
        this.c = new kqm(str, -1L, 0L);
        this.b = j;
    }

    public final void a(Callback callback) {
        ArrayDeque arrayDequeB = b();
        while (!arrayDequeB.isEmpty()) {
            callback.run((kqm) arrayDequeB.removeFirst());
        }
    }

    public final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        arrayDeque.push(this.c);
        while (!arrayDeque.isEmpty()) {
            kqm kqmVar = (kqm) arrayDeque.removeLast();
            arrayDeque2.push(kqmVar);
            arrayDeque.addAll(kqmVar.b);
        }
        return arrayDeque2;
    }

    public final void c(kqm kqmVar) {
        kqm kqmVar2 = this.c;
        if (kqmVar2.d.b == -1) {
            ListIterator listIterator = kqmVar2.b.listIterator();
            while (listIterator.hasNext()) {
                kqmVar.b((kqm) listIterator.next());
            }
            kqmVar.f = true;
        }
        this.c = kqmVar;
        this.a.append(kqmVar.d.b, kqmVar);
    }
}
