package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class ajc {
    public final Context a;
    public final WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public ajc(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            qp2.o("Application Context is null");
            throw null;
        }
        if (workerParameters == null) {
            qp2.o("WorkerParameters is null");
            throw null;
        }
        this.a = context;
        this.b = workerParameters;
    }

    public abstract ListenableFuture a();

    public o94 b() {
        return k1g.z(new roj(this.b.d, new qm(this, (byte) 20), (byte) 19));
    }
}
