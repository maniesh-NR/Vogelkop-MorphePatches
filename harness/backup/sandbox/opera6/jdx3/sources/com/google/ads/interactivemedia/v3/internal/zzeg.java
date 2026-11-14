package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.zzbk;
import defpackage.wmb;
import defpackage.wpp;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public final class zzeg {
    public final ConcurrentLinkedQueue a;
    public final wpp b;
    public byte c;

    public zzeg(wpp wppVar) {
        new zzfc();
        this.a = new ConcurrentLinkedQueue();
        this.c = (byte) 1;
        this.b = wppVar;
    }

    public final void a(zzbk zzbkVar) {
        wmb wmbVar = new wmb(JavaScriptMessage$MsgChannel.adsLoader, JavaScriptMessage$MsgType.nativeInstrumentation, "*", zzbkVar);
        byte b = this.c;
        int i = b - 1;
        if (b == 0) {
            throw null;
        }
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.b.a(wmbVar);
        } else {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.a;
            if (concurrentLinkedQueue.size() > 6) {
                this.c = (byte) 3;
            } else {
                concurrentLinkedQueue.add(wmbVar);
            }
        }
    }
}
