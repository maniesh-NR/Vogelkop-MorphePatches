package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class cjg implements Handler.Callback {
    public final l45 a;
    public final ole b;
    public wa6 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final TreeMap e = new TreeMap();
    public final Handler d = tym.p(this);
    public final rt1 c = new rt1((byte) 1);

    public cjg(wa6 wa6Var, ole oleVar, l45 l45Var) {
        this.f = wa6Var;
        this.b = oleVar;
        this.a = l45Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (!this.i) {
            if (message.what != 1) {
                return false;
            }
            ajg ajgVar = (ajg) message.obj;
            long j = ajgVar.a;
            long j2 = ajgVar.b;
            Long lValueOf = Long.valueOf(j2);
            TreeMap treeMap = this.e;
            Long l = (Long) treeMap.get(lValueOf);
            if (l == null) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                return true;
            }
            if (l.longValue() > j) {
                treeMap.put(Long.valueOf(j2), Long.valueOf(j));
            }
        }
        return true;
    }
}
