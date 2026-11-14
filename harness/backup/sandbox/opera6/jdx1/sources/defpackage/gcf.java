package defpackage;

import android.content.res.TypedArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class gcf {
    private boolean isEnabled;

    @NotNull
    private final ArrayList eventHandlers = new ArrayList();

    @NotNull
    private final CopyOnWriteArrayList<AutoCloseable> closeables = new CopyOnWriteArrayList<>();

    public gcf(boolean z) {
        this.isEnabled = z;
    }

    public final void addCloseable$activity(@NotNull jcf jcfVar) {
        this.closeables.add(jcfVar);
    }

    @NotNull
    public final fcf createNavigationEventHandler$activity(@NotNull hcf hcfVar) {
        fcf fcfVar = new fcf(this, hcfVar);
        this.eventHandlers.add(fcfVar);
        return fcfVar;
    }

    public void handleOnBackCancelled() {
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(@NotNull jz2 jz2Var) {
    }

    public void handleOnBackStarted(@NotNull jz2 jz2Var) {
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() throws Exception {
        boolean zIsTerminated;
        CopyOnWriteArrayList<AutoCloseable> copyOnWriteArrayList = this.closeables;
        Iterator<AutoCloseable> it = copyOnWriteArrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                copyOnWriteArrayList.clear();
                ArrayList arrayList = this.eventHandlers;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((fcf) obj).e();
                }
                arrayList.clear();
                return;
            }
            AutoCloseable next = it.next();
            if (next instanceof AutoCloseable) {
                next.close();
            } else if (next instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) next;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (i == 0) {
                                executorService.shutdownNow();
                                i = 1;
                            }
                        }
                    }
                    if (i != 0) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                if (!(next instanceof TypedArray)) {
                    hai.d();
                    return;
                }
                ((TypedArray) next).recycle();
            }
        }
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        ArrayList arrayList = this.eventHandlers;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            fcf fcfVar = (fcf) obj;
            fcfVar.f(fcfVar.g && z);
        }
    }
}
