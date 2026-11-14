package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class d57 implements Function2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ c8e c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ Object f;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ d57(Object obj, Function1 function1, c8e c8eVar, int i, int i2, byte b) {
        this.a = b;
        this.f = obj;
        this.b = function1;
        this.c = c8eVar;
        this.d = i;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                aib.d((e57) this.f, this.b, this.c, (ih5) obj, aoh.m(this.d | 1), this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                p37.f((List) this.f, this.b, this.c, (ih5) obj, aoh.m(this.d | 1), this.e);
                break;
        }
        return Unit.a;
    }
}
