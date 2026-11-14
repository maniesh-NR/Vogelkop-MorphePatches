package defpackage;

import android.util.LongSparseArray;
import com.opera.api.Callback;
import java.util.List;

/* loaded from: classes.dex */
public abstract class dca {
    public final long a;
    public final Callback b;
    public List c;
    public List d;

    public dca(Callback callback, long j) {
        this.a = j;
        this.b = callback;
    }

    public static boolean a(wan wanVar) {
        int i = wanVar.c;
        int i2 = i & 255;
        return (i2 == 3 || i2 == 4 || i2 == 10 || (i & 536870912) == 0) ? false : true;
    }

    public final void b() {
        if (this.c == null || this.d == null) {
            return;
        }
        LongSparseArray longSparseArray = new LongSparseArray(this.c.size());
        for (rqm rqmVar : this.c) {
            if (rqmVar.g.equals(rqmVar.b)) {
                String str = rqmVar.g;
                String[] strArr = wqm.a;
                String strS = aik.s(aik.f(str), wqm.e);
                long j = rqmVar.a;
                longSparseArray.append(j, new rqm(j, rqmVar.b, rqmVar.c, rqmVar.d, rqmVar.e, rqmVar.f, strS, rqmVar.h));
            } else {
                longSparseArray.append(rqmVar.a, rqmVar);
            }
        }
        this.b.run(c(this.d, longSparseArray, this.a));
    }

    public abstract Object c(List list, LongSparseArray longSparseArray, long j);
}
