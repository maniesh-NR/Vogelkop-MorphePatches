package defpackage;

import androidx.core.app.NotificationCompat;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public abstract class rpb {
    public static final qpb d = new qpb(new gqb(false, false, false, false, false, true, "    ", false, "type", false, true, o15.c, true, 400), y2j.a);
    public final gqb a;
    public final x79 b;
    public final d06 c = new d06((byte) 9);

    public rpb(gqb gqbVar, x79 x79Var) {
        this.a = gqbVar;
        this.b = x79Var;
    }

    public final Object a(String str, KSerializer kSerializer) {
        lhk lhkVar = new lhk(str, this.a);
        Object objQ = new lgk(this, ubc.c, lhkVar, kSerializer.getDescriptor(), (c30) null).q(kSerializer);
        lhkVar.q();
        return objQ;
    }

    public final String b(Object obj, KSerializer kSerializer) {
        mhk mhkVar = new mhk((byte) 0);
        dt4 dt4Var = dt4.c;
        mhkVar.c = dt4Var.d(NotificationCompat.FLAG_HIGH_PRIORITY);
        try {
            alo.E(this, mhkVar, kSerializer, obj);
            String string = mhkVar.toString();
            dt4Var.b((char[]) mhkVar.c);
            return string;
        } catch (Throwable th) {
            dt4.c.b((char[]) mhkVar.c);
            throw th;
        }
    }
}
