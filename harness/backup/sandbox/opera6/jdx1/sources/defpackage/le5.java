package defpackage;

import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class le5 implements l7h {
    public final /* synthetic */ byte a;

    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.EMPTY_SET;
            case 1:
                m4c m4cVar = ExecutorsRegistrar.a;
                StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                builderDetectNetwork.detectResourceMismatches();
                builderDetectNetwork.detectUnbufferedIo();
                return new o17(Executors.newFixedThreadPool(4, new z66("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 2:
                m4c m4cVar2 = ExecutorsRegistrar.a;
                return new o17(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new z66("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 3:
                m4c m4cVar3 = ExecutorsRegistrar.a;
                return new o17(Executors.newCachedThreadPool(new z66("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.d.get());
            case 4:
                m4c m4cVar4 = ExecutorsRegistrar.a;
                return Executors.newSingleThreadScheduledExecutor(new z66("Firebase Scheduler", 0, null));
            case 5:
            default:
                return null;
        }
    }
}
