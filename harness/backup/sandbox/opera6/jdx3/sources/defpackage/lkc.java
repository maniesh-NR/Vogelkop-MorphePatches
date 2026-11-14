package defpackage;

import android.content.Context;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class lkc implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ lkc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
    }

    public final Object invoke() {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                return ((qs4) obj7).k(((ekc) obj6).g(), ((tsd) obj5).g(), ((tsd) obj4).g(), ((tsd) obj3).g(), ((tsd) obj2).g(), ((tsd) obj).g());
            default:
                snc sncVar = (snc) obj5;
                return new qs6((Context) obj7, (umi) obj6, sncVar.a(), (dse) ((j4c) obj4).get(), (x0f) ((j4c) obj3).get(), ((fqe) ((j4c) obj2).get()).f, new onc((j4c) obj, (byte) 0), sncVar.b().d, sncVar.E, (up9) sncVar.v.getValue(), (cg1) sncVar.p.getValue());
        }
    }
}
