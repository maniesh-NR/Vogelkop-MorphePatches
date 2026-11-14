package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public abstract class o5o {
    public /* bridge */ /* synthetic */ ajc a(Context context, String str, WorkerParameters workerParameters) {
        return null;
    }

    public final ajc b(Context context, String str, WorkerParameters workerParameters) {
        ajc ajcVarA = a(context, str, workerParameters);
        if (ajcVarA == null) {
            try {
                try {
                    ajcVarA = (ajc) Class.forName(str).asSubclass(ajc.class).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } finally {
                }
            } finally {
            }
        }
        if (!ajcVarA.d) {
            return ajcVarA;
        }
        sjn.k("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
        return null;
    }
}
