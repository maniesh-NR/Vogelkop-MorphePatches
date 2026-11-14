package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class hg implements ThreadFactory {
    public final /* synthetic */ byte a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(new gg(runnable, (byte) 0), "glide-active-resources");
            case 1:
                Thread thread = new Thread(runnable);
                thread.setPriority(10);
                thread.setName("CameraX-camerax_high_priority");
                return thread;
            case 2:
                return Executors.defaultThreadFactory().newThread(new gg(runnable, (byte) 1));
            case 3:
                return new gwh(runnable);
            default:
                return new Thread(runnable, "SplitCompatBackgroundThread");
        }
    }
}
