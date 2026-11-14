package defpackage;

import android.util.Size;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ruf {
    public final Size a;
    public final int b;
    public final String c;
    public final tuf d;
    public final suf e;
    public final uuf f;
    public final vuf g;
    public final List h;

    public ruf(Size size, int i, String str, tuf tufVar, suf sufVar, uuf uufVar, vuf vufVar, List list) {
        this.a = size;
        this.b = i;
        this.c = str;
        this.d = tufVar;
        this.e = sufVar;
        this.f = uufVar;
        this.g = vufVar;
        this.h = list;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(size=");
        sb.append(this.a);
        sb.append(", format=");
        sb.append((Object) rfk.b(this.b));
        sb.append(", camera=");
        String str = this.c;
        sb.append((Object) (str == null ? "null" : sd4.b(str)));
        sb.append(", mirrorMode=");
        sb.append(this.d);
        sb.append(", timestampBase=null, dynamicRangeProfile=");
        sb.append(this.e);
        sb.append(", streamUseCase=");
        sb.append(this.f);
        sb.append(", streamUseHint=");
        sb.append(this.g);
        sb.append(", sensorPixelModes=");
        sb.append(this.h);
        sb.append(')');
        return sb.toString();
    }
}
