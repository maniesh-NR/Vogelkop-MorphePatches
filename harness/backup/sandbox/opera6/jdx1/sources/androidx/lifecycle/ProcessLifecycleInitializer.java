package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import defpackage.edc;
import defpackage.fdc;
import defpackage.i1h;
import defpackage.j1h;
import defpackage.occ;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lv7b;", "Lndc;", "<init>", "()V", "lifecycle-process"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements v7b {
    public final Object create(Context context) {
        if (!((HashSet) l45.G(context).b).contains(ProcessLifecycleInitializer.class)) {
            qp2.n("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        if (!fdc.a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new edc());
        }
        j1h j1hVar = j1h.h;
        j1hVar.getClass();
        j1hVar.e = new Handler();
        j1hVar.f.e(occ.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new i1h(j1hVar));
        return j1hVar;
    }

    public final List dependencies() {
        return l08.a;
    }
}
