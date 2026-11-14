package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class oda implements Function1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    public /* synthetic */ oda(br9 br9Var, List list, byte b) {
        this.a = b;
        this.b = list;
    }

    public /* synthetic */ oda(List list, byte b) {
        this.a = b;
        this.b = list;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                return ((hea) list.get(((Number) obj).intValue())).a;
            case 1:
                list.get(((Number) obj).intValue());
                return null;
            case 2:
                list.get(((Number) obj).intValue());
                return null;
            case 3:
                return ((g2e) list.get(((Number) obj).intValue())).a().a;
            case 4:
                list.get(((Number) obj).intValue());
                return null;
            case 5:
                return ((g2e) list.get(((Number) obj).intValue())).a().a;
            default:
                list.get(((Number) obj).intValue());
                return null;
        }
    }
}
