package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class jqn implements f7f, kr9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ jqn(Function1 function1, byte b) {
        this.a = b;
        this.b = function1;
    }

    public final br9 a() {
        byte b = this.a;
        br9 br9Var = this.b;
        switch (b) {
        }
        return br9Var;
    }

    public final /* synthetic */ void d0(Object obj) {
        byte b = this.a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(obj);
                break;
            default:
                function1.invoke(obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof f7f) && (obj instanceof kr9)) {
                    break;
                }
                break;
        }
        return Intrinsics.a(a(), ((kr9) obj).a());
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return a().hashCode();
    }
}
