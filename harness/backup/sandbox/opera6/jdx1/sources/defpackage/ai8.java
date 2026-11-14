package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;

/* loaded from: classes.dex */
public final class ai8 {
    public final Context a;
    public final lg2 b;
    public final lg2 c;
    public dsk d;
    public final lg2 e;
    public final Looper f;
    public pf2 g;
    public boolean h;
    public final uwi i;
    public final upi j;
    public short k;
    public short l;
    public final ds6 m;
    public final short n;
    public boolean o;

    public ai8(Context context) {
        lg2 lg2Var = new lg2(context, (byte) 1);
        lg2 lg2Var2 = new lg2(context, (byte) 2);
        lg2 lg2Var3 = new lg2(context, (byte) 3);
        lg2 lg2Var4 = new lg2(context, (byte) 4);
        context.getClass();
        this.a = context;
        this.b = lg2Var;
        this.c = lg2Var2;
        this.d = lg2Var3;
        this.e = lg2Var4;
        String str = tym.a;
        Looper looperMyLooper = Looper.myLooper();
        this.f = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.g = pf2.i;
        this.i = uwi.d;
        this.k = (short) 5000;
        this.l = (short) 15000;
        this.j = upi.b;
        this.m = new ds6(tym.N(20L), tym.N(500L));
        this.n = ExoPlayer.a;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    public final qi8 a() {
        z4o.H(!this.o);
        this.o = true;
        return new qi8(this);
    }
}
