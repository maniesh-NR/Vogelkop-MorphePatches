package defpackage;

import java.util.function.BiConsumer;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class by1 implements BiConsumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function2 b;

    public /* synthetic */ by1(Function2 function2, byte b) {
        this.a = b;
        this.b = function2;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                ((s2) function2).invoke(obj, obj2);
                break;
            case 1:
                ((whf) function2).invoke(obj, obj2);
                break;
            case 2:
                ((whf) function2).invoke(obj, obj2);
                break;
            case 3:
                ((nqi) function2).invoke(obj, obj2);
                break;
            default:
                ((nqi) function2).invoke(obj, obj2);
                break;
        }
    }
}
