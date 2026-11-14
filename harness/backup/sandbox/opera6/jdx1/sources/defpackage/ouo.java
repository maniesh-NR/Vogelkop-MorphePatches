package defpackage;

import ads_mobile_sdk.oi3;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ouo extends ContentObserver {
    public final /* synthetic */ byte a = 1;
    public final Handler b;
    public final Context c;
    public final AudioManager d;
    public final AtomicReference e;
    public final AtomicBoolean f;
    public final ExecutorService g;
    public final Object h;
    public final Object i;

    public ouo(Handler handler, Context context, auj aujVar, w5p w5pVar) {
        super(handler);
        this.e = new AtomicReference(Float.valueOf(-1.0f));
        this.f = new AtomicBoolean(false);
        this.g = Executors.newSingleThreadExecutor();
        this.b = handler;
        this.c = context;
        this.d = (AudioManager) context.getSystemService("audio");
        this.h = aujVar;
        this.i = w5pVar;
    }

    public ouo(Handler handler, Context context, cpj cpjVar, w5p w5pVar) {
        super(handler);
        this.e = new AtomicReference(Float.valueOf(-1.0f));
        this.f = new AtomicBoolean(false);
        this.g = Executors.newSingleThreadExecutor();
        this.b = handler;
        this.c = context;
        this.d = (AudioManager) context.getSystemService("audio");
        this.h = cpjVar;
        this.i = w5pVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        switch (this.a) {
            case 0:
                if (!this.f.getAndSet(true)) {
                    this.g.submit(new ssi(this, (byte) 27));
                    break;
                }
                break;
            default:
                if (!this.f.getAndSet(true)) {
                    this.g.submit(new oi3(this, (byte) 3));
                    break;
                }
                break;
        }
    }
}
