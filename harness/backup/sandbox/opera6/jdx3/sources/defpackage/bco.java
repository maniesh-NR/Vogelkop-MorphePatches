package defpackage;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.appsflyer.internal.j;
import java.util.Objects;

/* loaded from: classes.dex */
public final class bco extends n1 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Resources d;
    public final /* synthetic */ p12 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bco(p12 p12Var, Resources resources, Resources resources2, byte b) {
        super(resources, (byte) 29);
        this.c = b;
        switch (b) {
            case 1:
                this.d = resources2;
                Objects.requireNonNull(p12Var);
                this.e = p12Var;
                super(resources, (byte) 29);
                break;
            default:
                this.d = resources2;
                Objects.requireNonNull(p12Var);
                this.e = p12Var;
                break;
        }
    }

    @Override // defpackage.cco
    public final void d() {
        byte b = this.c;
        p12 p12Var = this.e;
        switch (b) {
            case 0:
                j.d((SharedPreferences) ((b59) p12Var.a).get(), "infobar_shown_before", true);
                break;
            default:
                j.d((SharedPreferences) ((b59) p12Var.a).get(), "allow_ask_again", false);
                break;
        }
    }

    @Override // defpackage.cco
    public final void e(boolean z) {
        byte b = this.c;
        byte b2 = 5;
        p12 p12Var = this.e;
        switch (b) {
            case 0:
                b59 b59Var = (b59) p12Var.a;
                q6e q6eVar = (q6e) p12Var.b;
                j.d((SharedPreferences) b59Var.get(), "infobar_shown_before", true);
                if (z) {
                    q6eVar.o((eri) p12Var.g);
                    ((cz4) p12Var.e).f(new tl3(p12Var, ((t5d) p12Var.c).getResources(), q6eVar.b().getTitle(), b2));
                    break;
                }
                break;
            default:
                if (!z) {
                    j.d((SharedPreferences) ((b59) p12Var.a).get(), "allow_ask_again", false);
                    break;
                } else {
                    ((q6e) p12Var.b).o((eri) p12Var.g);
                    ((cz4) p12Var.e).f(new tl3(p12Var, ((t5d) p12Var.c).getResources(), ((q6e) p12Var.b).b().getTitle(), b2));
                    break;
                }
        }
    }

    @Override // defpackage.cco
    public final String u() {
        switch (this.c) {
            case 0:
                return this.d.getString(2132020043);
            default:
                return this.d.getString(2132020040);
        }
    }
}
