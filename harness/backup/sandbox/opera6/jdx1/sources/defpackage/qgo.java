package defpackage;

import ads_mobile_sdk.h1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qgo extends ozb implements Function1 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qgo(String str, byte b) {
        super(1);
        this.i = b;
        this.j = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.i;
        String str = this.j;
        switch (b) {
            case 0:
                return Boolean.valueOf(Intrinsics.a(((txo) obj).a, str));
            default:
                hzo hzoVar = (hzo) ((h1) obj).n();
                hzoVar.e();
                hzoVar.b$1();
                ((h1) hzoVar.b).s().clear();
                hzoVar.b$1();
                ((h1) hzoVar.b).b(str);
                return (h1) hzoVar.a();
        }
    }
}
