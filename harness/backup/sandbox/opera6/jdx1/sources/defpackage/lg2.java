package defpackage;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class lg2 implements dsk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    public /* synthetic */ lg2(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    public final Object get() {
        pl6 pl6Var;
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                return scd.E(context);
            case 1:
                return new i16(context, (byte) 13);
            case 2:
                return new ut6(context, new mp6());
            case 3:
                return new jx6(context);
            default:
                csh cshVar = pl6.p;
                synchronized (pl6.class) {
                    pl6Var = pl6.v;
                    if (pl6Var == null) {
                        Context applicationContext = context == null ? null : context.getApplicationContext();
                        HashMap map = new HashMap(8);
                        map.put(0, 1000000L);
                        map.put(2, -9223372036854775807L);
                        map.put(3, -9223372036854775807L);
                        map.put(4, -9223372036854775807L);
                        map.put(5, -9223372036854775807L);
                        map.put(10, -9223372036854775807L);
                        map.put(9, -9223372036854775807L);
                        map.put(7, -9223372036854775807L);
                        pl6Var = new pl6(applicationContext, map);
                        pl6.v = pl6Var;
                    }
                }
                return pl6Var;
        }
    }
}
