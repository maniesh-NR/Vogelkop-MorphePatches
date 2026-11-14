package defpackage;

/* loaded from: classes.dex */
public abstract class i7c {
    public static final Object b = new Object();
    public static final Object c = new Object();
    public volatile Object a;

    public i7c(byte b2) {
        switch (b2) {
            case 1:
                this.a = c;
                break;
            default:
                this.a = b;
                break;
        }
    }

    public static void b(i7c i7cVar, Runnable runnable) {
        if (i7cVar.a == c) {
            gxo.c.b(new fmn((Object) i7cVar, (Object) runnable, (byte) 22));
        } else if (runnable != null) {
            gxo.c(runnable);
        }
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.a;
        Object obj3 = c;
        if (obj2 != obj3) {
            return this.a;
        }
        synchronized (this) {
            if (this.a == obj3) {
                this.a = c();
            }
            obj = this.a;
        }
        return obj;
    }

    public abstract Object c();

    public final Object d(Object obj) {
        Object obj2 = this.a;
        Object obj3 = b;
        if (obj2 != obj3) {
            return this.a;
        }
        synchronized (this) {
            if (this.a == obj3) {
                this.a = e(obj);
            }
        }
        return this.a;
    }

    public abstract Object e(Object obj);
}
