package defpackage;

import android.app.Activity;
import android.content.Context;
import com.opera.android.Lazy;
import com.opera.android.browser.UrlMangler;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b59 extends Lazy {
    public final /* synthetic */ byte e;
    public final Object f;
    public final Object g;

    public b59(c59 c59Var, Context context) {
        this.e = (byte) 0;
        this.f = context;
        this.g = c59Var;
    }

    public b59(d7l d7lVar) {
        this.e = (byte) 3;
        this.f = d7lVar.j.getUrl();
        this.g = d7lVar.j.t();
    }

    public /* synthetic */ b59(Object obj, Object obj2, byte b) {
        this.e = b;
        this.f = obj;
        this.g = obj2;
    }

    @Override // com.opera.android.Lazy
    public final Object d() {
        r49 r49VarI;
        String strK;
        switch (this.e) {
            case 0:
                Context context = (Context) this.f;
                synchronized (r49.j) {
                    if (r49.k.containsKey("[DEFAULT]")) {
                        r49VarI = r49.e();
                    } else {
                        j59 j59VarA = j59.a(context);
                        r49VarI = j59VarA == null ? null : r49.i(j59VarA, context, "[DEFAULT]");
                    }
                }
                Objects.requireNonNull(r49VarI);
                r49VarI.a();
                if (r49VarI.c.equals(((c59) this.g).c)) {
                    r49VarI.a();
                    return r49VarI.b;
                }
                String str = "ofa-" + ((c59) this.g).c.e;
                c59 c59Var = (c59) this.g;
                r49.i(c59Var.c, c59Var.a, str);
                return str;
            case 1:
                return new it1((Activity) ((x7j) this.f).b, (umi) this.g);
            case 2:
                return ((Context) this.f).getSharedPreferences((String) this.g, 0);
            default:
                String str2 = (String) this.f;
                if (z5i.a0(str2) && (strK = z5i.K(str2)) != null) {
                    return strK;
                }
                String strA = UrlMangler.a(str2, "title");
                return strA == null ? (String) ((esk) this.g).get() : strA;
        }
    }
}
