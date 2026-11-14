package defpackage;

import androidx.fragment.app.r;
import java.util.Random;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class wd7 {
    public final r a;
    public final umi b;
    public final ox3 c;
    public final qke d;
    public final dj9 e;
    public final Random f;
    public final Function1 g;
    public boolean h;
    public boolean i;
    public long j;
    public final vd7 k;
    public final ud7 l;

    public wd7(r rVar, umi umiVar, ox3 ox3Var, qke qkeVar, plh plhVar, dj9 dj9Var) {
        Random random = new Random();
        sd7 sd7Var = sd7.a;
        a64 a64VarB = sgb.b((d7a) vml.e.b);
        this.a = rVar;
        this.b = umiVar;
        this.c = ox3Var;
        this.d = qkeVar;
        this.e = dj9Var;
        this.f = random;
        this.g = sd7Var;
        this.k = new vd7(this);
        this.l = new ud7(this, (byte) 0);
        na2.B(a64VarB, (CoroutineContext) null, (rx5) null, new fg6(plhVar, this, null, (byte) 11), 3);
    }
}
