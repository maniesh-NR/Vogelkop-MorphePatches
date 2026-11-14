package defpackage;

import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.internal.zzoo;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class wmb {
    public final JavaScriptMessage$MsgChannel a;
    public final Object b;
    public final String c;
    public final JavaScriptMessage$MsgType d;

    public wmb(JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel, JavaScriptMessage$MsgType javaScriptMessage$MsgType, String str, Object obj) {
        this.a = javaScriptMessage$MsgChannel;
        this.d = javaScriptMessage$MsgType;
        this.c = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof wmb)) {
            return false;
        }
        wmb wmbVar = (wmb) obj;
        return this.a == wmbVar.a && zzoo.a(this.b, wmbVar.b) && zzoo.a(this.c, wmbVar.c) && this.d == wmbVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        return String.format("JavaScriptMessage [command=%s, type=%s, sid=%s, data=%s]", this.a, this.d, this.c, this.b);
    }
}
