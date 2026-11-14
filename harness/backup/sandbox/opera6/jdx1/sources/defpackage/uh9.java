package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class uh9 implements wx7 {
    public final Context a;
    public final th9 b;
    public final Object c = new Object();
    public Handler d;
    public ThreadPoolExecutor e;
    public ThreadPoolExecutor f;
    public o0g g;

    public uh9(Context context, th9 th9Var) {
        jpo.m(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = th9Var;
    }

    @Override // defpackage.wx7
    public final void a(o0g o0gVar) {
        synchronized (this.c) {
            this.g = o0gVar;
        }
        synchronized (this.c) {
            if (this.g == null) {
                return;
            }
            ThreadPoolExecutor threadPoolExecutor = this.e;
            if (threadPoolExecutor == null) {
                final String str = "emojiCompat";
                final byte b = 0;
                ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: kj5
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        byte b2 = b;
                        String str2 = str;
                        switch (b2) {
                            case 0:
                                Thread thread = new Thread(runnable, str2);
                                thread.setPriority(10);
                                return thread;
                            default:
                                return new Thread(runnable, str2);
                        }
                    }
                });
                threadPoolExecutor2.allowCoreThreadTimeOut(true);
                this.f = threadPoolExecutor2;
                this.e = threadPoolExecutor2;
                threadPoolExecutor = threadPoolExecutor2;
            }
            threadPoolExecutor.execute(new ld9(this, (byte) 2));
        }
    }

    public final void b() {
        synchronized (this.c) {
            this.g = null;
            Handler handler = this.d;
            if (handler != null) {
                handler.removeCallbacks(null);
            }
            this.d = null;
            ThreadPoolExecutor threadPoolExecutor = this.f;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            this.e = null;
            this.f = null;
        }
    }

    public final ni9 c() {
        try {
            Context context = this.a;
            Object[] objArr = {this.b};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            mi9 mi9VarA = sh9.a(context, Collections.unmodifiableList(arrayList));
            boolean z = mi9VarA.c;
            if (z) {
                h9o.r(p3p.i(z ? 1 : 0, "fetchFonts failed (", ")"));
                return null;
            }
            ni9[] ni9VarArr = (ni9[]) mi9VarA.b.get(0);
            if (ni9VarArr != null && ni9VarArr.length != 0) {
                return ni9VarArr[0];
            }
            h9o.r("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            h9o.s("provider not found", e);
            return null;
        }
    }
}
