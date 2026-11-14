package defpackage;

import com.google.android.gms.common.internal.ImagesContract;
import com.leanplum.internal.Clock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ven {
    public static final ltg j = new ltg("web_page_promo", ImagesContract.LOCAL, null);
    public final wv1 a;
    public final wv1 b;
    public final ji c;
    public final ji d;
    public final nu3 e;
    public final orm f;
    public final ru9 g;
    public final nej h;
    public xq3 i;

    public ven(tcc tccVar, k6l k6lVar, wv1 wv1Var, wv1 wv1Var2, ji jiVar, ji jiVar2, nu3 nu3Var, orm ormVar, ru9 ru9Var, nej nejVar) {
        this.a = wv1Var;
        this.b = wv1Var2;
        this.c = jiVar;
        this.d = jiVar2;
        this.e = nu3Var;
        this.f = ormVar;
        this.g = ru9Var;
        this.h = nejVar;
        final byte b = 0;
        final byte b2 = 1;
        new wjh(tccVar, k6lVar, new Function1(this) { // from class: uen
            public final /* synthetic */ ven b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b3 = b;
                ven venVar = this.b;
                switch (b3) {
                    case 0:
                        ru9 ru9Var2 = venVar.g;
                        boolean z = false;
                        if (((svg) tvg.t(venVar.c.b).i()).a(2048) && ((jtg) venVar.b.b.get()).d() && !((ydn) venVar.a.b.get()).c.isEnabled() && ru9Var2.a.getInt("vpn.pro_adult_page_promo.show_count", 0) < 2 && (System.currentTimeMillis() - ru9Var2.a.getLong("vpn.pro_adult_page_promo.show_timestamp", 0L)) / Clock.DAY_MILLIS >= 7) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        if (venVar.i == null) {
                            xq3 xq3Var = new xq3(venVar);
                            nej nejVar2 = venVar.h;
                            nejVar2.getClass();
                            nejVar2.b(xq3Var, ijm.b);
                            venVar.i = xq3Var;
                        }
                        return Unit.a;
                }
            }
        }, new Function1(this) { // from class: uen
            public final /* synthetic */ ven b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b3 = b2;
                ven venVar = this.b;
                switch (b3) {
                    case 0:
                        ru9 ru9Var2 = venVar.g;
                        boolean z = false;
                        if (((svg) tvg.t(venVar.c.b).i()).a(2048) && ((jtg) venVar.b.b.get()).d() && !((ydn) venVar.a.b.get()).c.isEnabled() && ru9Var2.a.getInt("vpn.pro_adult_page_promo.show_count", 0) < 2 && (System.currentTimeMillis() - ru9Var2.a.getLong("vpn.pro_adult_page_promo.show_timestamp", 0L)) / Clock.DAY_MILLIS >= 7) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        if (venVar.i == null) {
                            xq3 xq3Var = new xq3(venVar);
                            nej nejVar2 = venVar.h;
                            nejVar2.getClass();
                            nejVar2.b(xq3Var, ijm.b);
                            venVar.i = xq3Var;
                        }
                        return Unit.a;
                }
            }
        });
    }
}
