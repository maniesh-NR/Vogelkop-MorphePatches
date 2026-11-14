package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.opera.android.readlater.MigrationWorker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pkh extends o5o {
    public final j4c a;
    public final j4c b;

    public pkh(j4c j4cVar, j4c j4cVar2) {
        this.a = j4cVar;
        this.b = j4cVar2;
    }

    public final ajc a(Context context, String str, WorkerParameters workerParameters) {
        if (Intrinsics.a(str, MigrationWorker.class.getName())) {
            return new MigrationWorker(context, workerParameters, this.a, this.b);
        }
        return null;
    }
}
