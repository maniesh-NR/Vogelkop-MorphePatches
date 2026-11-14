package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class b28 implements s18, x6f {
    public final LinkedHashMap a = new LinkedHashMap();
    public i04 b = i04.b;
    public final ArrayList c = new ArrayList();
    public final /* synthetic */ f28 d;

    public b28(f28 f28Var) {
        this.d = f28Var;
    }

    public final void a(boolean z) {
        i04 i04Var = i04.b;
        i04 i04Var2 = z ? i04.a : i04Var;
        if (this.b != i04Var2) {
            this.b = i04Var2;
            if (i04Var2 == i04Var) {
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ListenableFuture) obj).cancel(true);
                }
                arrayList.clear();
            }
            for (Map.Entry entry : this.a.entrySet()) {
                try {
                    ((Executor) entry.getValue()).execute(new cn7(entry, i04Var2, (byte) 9));
                } catch (RejectedExecutionException unused) {
                }
            }
        }
    }

    @Override // defpackage.x6f
    public final ListenableFuture b() {
        return k1g.z(new uk6(this, (byte) 22));
    }

    @Override // defpackage.x6f
    public final void f(v6f v6fVar) {
        this.d.g.execute(new cn7(this, v6fVar, (byte) 10));
    }

    @Override // defpackage.x6f
    public final void g(Executor executor, v6f v6fVar) {
        this.d.g.execute(new gl6(this, v6fVar, executor, (byte) 17));
    }
}
