package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public abstract class mqk {
    public final kqk a;
    public final String b;
    public final SettingsManager c;
    public final iv7 d;
    public final ikc e;
    public final ndc f;
    public final Function2 g;
    public final boolean h = true;
    public boolean i;

    public mqk(kqk kqkVar, String str, SettingsManager settingsManager, iv7 iv7Var, ikc ikcVar, ndc ndcVar, Function2 function2) {
        this.a = kqkVar;
        this.b = str;
        this.c = settingsManager;
        this.d = iv7Var;
        this.e = ikcVar;
        this.f = ndcVar;
        this.g = function2;
    }

    public boolean a() {
        boolean zD = d();
        iv7 iv7Var = this.d;
        if (zD && ((Boolean) iv7Var.k.g()).booleanValue()) {
            return false;
        }
        if (iv7Var.b()) {
            if (!b()) {
                return false;
            }
            if (!((List) this.e.g()).isEmpty() && !c()) {
                return false;
            }
        }
        String str = this.b;
        return str == null || this.c.i(str);
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return this.h;
    }

    public final void e() {
        boolean zA = a();
        if (zA != this.i) {
            this.g.invoke(this.a, Boolean.valueOf(zA));
            this.i = zA;
        }
    }

    public void f() {
        ndc ndcVar = this.f;
        String str = this.b;
        if (str != null) {
            aib.D(this.c, ndcVar, new t00(str, this, (byte) 3));
        }
        iv7 iv7Var = this.d;
        final byte b = 0;
        iv7Var.f.j(ndcVar, new t7d(new Function1(this) { // from class: lqk
            public final /* synthetic */ mqk b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b2 = b;
                mqk mqkVar = this.b;
                switch (b2) {
                    case 0:
                        mqkVar.e();
                        break;
                    case 1:
                        mqkVar.e();
                        break;
                    default:
                        mqkVar.e();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 22));
        final byte b2 = 1;
        iv7Var.k.j(ndcVar, new t7d(new Function1(this) { // from class: lqk
            public final /* synthetic */ mqk b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b22 = b2;
                mqk mqkVar = this.b;
                switch (b22) {
                    case 0:
                        mqkVar.e();
                        break;
                    case 1:
                        mqkVar.e();
                        break;
                    default:
                        mqkVar.e();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 22));
        final byte b3 = 2;
        this.e.j(ndcVar, new t7d(new Function1(this) { // from class: lqk
            public final /* synthetic */ mqk b;

            {
                this.b = this;
            }

            public final Object invoke(Object obj) {
                byte b22 = b3;
                mqk mqkVar = this.b;
                switch (b22) {
                    case 0:
                        mqkVar.e();
                        break;
                    case 1:
                        mqkVar.e();
                        break;
                    default:
                        mqkVar.e();
                        break;
                }
                return Unit.a;
            }
        }, (byte) 22));
    }
}
