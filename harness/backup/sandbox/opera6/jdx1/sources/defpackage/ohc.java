package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ohc implements ListenableFuture {
    public ArrayList a;
    public ArrayList b;
    public final boolean c;
    public final AtomicInteger d;
    public final o94 e;
    public l94 f;

    public ohc(ArrayList arrayList, boolean z, n97 n97Var) {
        this.a = arrayList;
        this.b = new ArrayList(arrayList.size());
        this.c = z;
        this.d = new AtomicInteger(arrayList.size());
        o94 o94VarZ = k1g.z(new qq6(this, (byte) 25));
        this.e = o94VarZ;
        o94VarZ.addListener(new vl9(this, (byte) 9), n97.a());
        if (this.a.isEmpty()) {
            this.f.b(new ArrayList(this.b));
            return;
        }
        for (int i = 0; i < this.a.size(); i++) {
            this.b.add(null);
        }
        ArrayList arrayList2 = this.a;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ListenableFuture listenableFuture = (ListenableFuture) arrayList2.get(i2);
            listenableFuture.addListener(new sq1(this, i2, listenableFuture), n97Var);
        }
    }

    public final void addListener(Runnable runnable, Executor executor) {
        this.e.addListener(runnable, executor);
    }

    public final boolean cancel(boolean z) {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((ListenableFuture) obj).cancel(z);
            }
        }
        return this.e.cancel(z);
    }

    public final Object get() throws InterruptedException {
        ArrayList arrayList = this.a;
        if (arrayList != null && !isDone()) {
            int size = arrayList.size();
            int i = 0;
            loop0: while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ListenableFuture listenableFuture = (ListenableFuture) obj;
                while (!listenableFuture.isDone()) {
                    try {
                        listenableFuture.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.c) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (List) this.e.b.get();
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return (List) this.e.b.get(j, timeUnit);
    }

    public final boolean isCancelled() {
        return this.e.isCancelled();
    }

    public final boolean isDone() {
        return this.e.b.isDone();
    }
}
