package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class hdo {
    public final Context a;
    public final int b;
    public final r9g c;
    public final boolean d;
    public final boolean e;
    public float f;
    public float g;
    public boolean h;
    public float i;
    public float j;
    public float k;
    public byte l;
    public final GestureDetector m;
    public boolean n;

    public hdo(Context context, r9g r9gVar) {
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop() << 1;
        this.a = context;
        this.b = scaledTouchSlop;
        this.c = r9gVar;
        this.d = true;
        this.e = true;
        this.m = new GestureDetector(context, (GestureDetector.OnGestureListener) new v35(this, (byte) 7));
    }

    public final boolean a() {
        return this.l != 0;
    }
}
