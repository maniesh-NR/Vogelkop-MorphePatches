package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class a7f {
    public final /* synthetic */ byte a;
    public Object b;

    public a7f() {
        this.a = (byte) 1;
        this.b = new Object();
    }

    public a7f(Object obj) {
        this.a = (byte) 0;
        this.b = obj;
    }

    public abstract void a(Object obj, Object obj2);

    public abstract void b(or4 or4Var);

    public abstract void c();

    public abstract void d();

    public abstract Function1 e(or4 or4Var);

    public abstract void f(or4 or4Var);

    public final void g(xtb xtbVar, Object obj) {
        Object obj2 = this.b;
        this.b = obj;
        a(obj2, obj);
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "ObservableProperty(value=" + this.b + ')';
            default:
                return super.toString();
        }
    }
}
