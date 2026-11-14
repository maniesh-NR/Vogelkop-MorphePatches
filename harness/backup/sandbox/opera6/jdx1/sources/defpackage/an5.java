package defpackage;

/* loaded from: classes.dex */
public abstract class an5 {
    public static final jde a;

    static {
        e5i e5iVar = xa5.e;
        int i = e5iVar.c;
        vm5 vm5Var = new vm5(e5iVar, e5iVar, 1);
        int i2 = e5iVar.c;
        naf nafVar = xa5.x;
        int i3 = (nafVar.c << 6) | i2;
        zm5 zm5Var = new zm5(e5iVar, nafVar, 0);
        int i4 = nafVar.c | (i2 << 6);
        zm5 zm5Var2 = new zm5(nafVar, e5iVar, 0);
        jde jdeVar = xbb.a;
        jde jdeVar2 = new jde();
        jdeVar2.i(i | (i << 6), vm5Var);
        jdeVar2.i(i3, zm5Var);
        jdeVar2.i(i4, zm5Var2);
        a = jdeVar2;
    }
}
