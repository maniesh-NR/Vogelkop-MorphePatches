package org.chromium.content_public.browser.media.capture;

import android.content.Context;
import android.hardware.display.VirtualDisplay;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import defpackage.mni;
import defpackage.qxa;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.base.ThreadUtils;

/* loaded from: classes.dex */
public final class ScreenCapture {
    public static final AtomicReference d = new AtomicReference();
    public VirtualDisplay a;
    public final ArrayList b = new ArrayList();
    public volatile Context c;

    static {
        new ConditionVariable(false);
    }

    public ScreenCapture(long j) {
        new Handler(Looper.myLooper());
    }

    public static ScreenCapture create(long j) {
        return new ScreenCapture(j);
    }

    public final void destroy() {
        VirtualDisplay virtualDisplay = this.a;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.a = null;
        }
        ArrayList arrayList = this.b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((qxa) arrayList.get(size)).a();
        }
        arrayList.clear();
        ThreadUtils.d(new mni(this, (byte) 0));
    }

    public final boolean startCapture() {
        d.getAndSet(null).getClass();
        throw new ClassCastException();
    }
}
