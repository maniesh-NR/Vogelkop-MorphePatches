package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class jc9 {
    public final HashMap a;

    public jc9(byte b) {
        switch (b) {
            case 1:
                this.a = new HashMap(3);
                break;
            case 2:
                this.a = new HashMap();
                break;
            case 3:
                this.a = new HashMap(3);
                break;
            case 4:
                this.a = new HashMap();
                break;
            default:
                this.a = new HashMap();
                break;
        }
    }

    public final int a(long j) {
        HashMap map = this.a;
        int size = map.size();
        Integer num = (Integer) map.putIfAbsent(Long.valueOf(j), Integer.valueOf(size));
        return num != null ? num.intValue() : size;
    }

    public final void b(o5h o5hVar, Object obj) {
        HashMap map = this.a;
        if (obj == null) {
            map.remove(o5hVar);
        } else {
            map.put(o5hVar, obj);
        }
    }

    public final void c(Class cls, rj3 rj3Var) {
        this.a.put(cls, rj3Var);
    }
}
