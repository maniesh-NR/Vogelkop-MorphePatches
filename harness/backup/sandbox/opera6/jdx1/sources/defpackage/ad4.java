package defpackage;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ad4 implements ThreadFactory {
    public final /* synthetic */ byte a;
    public final Object b;

    public ad4(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new AtomicInteger(1);
                break;
            case 2:
                this.b = new AtomicInteger(0);
                break;
            case 3:
                this.b = new AtomicInteger(0);
                break;
            default:
                this.b = new AtomicInteger(0);
                break;
        }
    }

    public /* synthetic */ ad4(ThreadFactory threadFactory) {
        this.a = (byte) 4;
        this.b = threadFactory;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Thread thread = new Thread((Runnable) new o32(runnable, (byte) 1));
                thread.setPriority(7);
                Locale locale = Locale.US;
                thread.setName("CameraX-core_camera_" + ((AtomicInteger) obj).getAndIncrement());
                return thread;
            case 1:
                return new Thread(runnable, sko.i(((AtomicInteger) obj).getAndIncrement(), "CrAsyncTask #"));
            case 2:
                Thread thread2 = new Thread(runnable);
                thread2.setName("arch_disk_io_" + ((AtomicInteger) obj).getAndIncrement());
                return thread2;
            case 3:
                Thread thread3 = new Thread(runnable);
                Locale locale2 = Locale.US;
                thread3.setName("CameraX-camerax_io_" + ((AtomicInteger) obj).getAndIncrement());
                return thread3;
            default:
                return ((ThreadFactory) obj).newThread(new gg(runnable, (byte) 9));
        }
    }
}
