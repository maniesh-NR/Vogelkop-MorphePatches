package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class dy5 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ byte e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dy5(hdg hdgVar, int i, Function0 function0, int i2, int i3) {
        this.a = (byte) 3;
        this.b = hdgVar;
        this.d = i;
        this.c = function0;
        this.e = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dy5(String str, c8e c8eVar, int i, int i2, byte b) {
        this.a = b;
        this.b = str;
        this.c = c8eVar;
        this.d = i;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        byte b2 = this.e;
        byte b3 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                x7d.b((String) obj4, (c8e) obj3, (ih5) obj, aoh.m(b3 | 1), b2);
                break;
            case 1:
                ((Integer) obj2).getClass();
                sfe.s((String) obj4, (c8e) obj3, (ih5) obj, aoh.m(b3 | 1), b2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                kfo.j((String) obj4, (c8e) obj3, (ih5) obj, aoh.m(b3 | 1), b2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM = aoh.m(391);
                xf8.k((hdg) obj4, this.d, (Function0) obj3, (ih5) obj, iM, this.e);
                break;
        }
        return Unit.a;
    }
}
