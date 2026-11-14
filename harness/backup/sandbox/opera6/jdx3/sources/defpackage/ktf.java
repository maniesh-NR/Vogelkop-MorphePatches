package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.text.Regex;

/* loaded from: classes.dex */
public final class ktf {
    public static final hra g;
    public static final Regex h;
    public final umi a;
    public final zyk b = z4c.b(new kof((byte) 7));
    public efn c;
    public efn d;
    public String e;
    public oml f;

    static {
        rma rmaVar = new rma((byte) 4);
        rmaVar.o("http://echo.opera.com/", null);
        g = rmaVar.d();
        h = new Regex("<h2>Remote: +(\\S+)");
    }

    public ktf(umi umiVar) {
        this.a = umiVar;
    }

    public final void a(efn efnVar, Runnable runnable) {
        oml omlVar = this.f;
        byte b = 1;
        if (omlVar != null) {
            omlVar.cancel(true);
        }
        this.c = efnVar;
        if (efnVar != null) {
            oml omlVarC = this.a.g(new kqd((Object) this, (byte) 21)).c(new mgf(this, runnable, b));
            omlVarC.b(null, 600L, TimeUnit.MILLISECONDS, null);
            this.f = omlVarC;
            return;
        }
        this.d = null;
        this.e = null;
        this.c = null;
        this.f = null;
        runnable.run();
    }
}
