package defpackage;

import android.net.Uri;
import android.os.Build;
import com.leanplum.internal.Constants;
import java.security.PublicKey;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class xe9 implements swl {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ xe9(bf9 bf9Var, k5o k5oVar, pc9 pc9Var, String str, String str2, ie9 ie9Var, Uri uri, Uri uri2) {
        this.c = bf9Var;
        this.d = k5oVar;
        this.a = str;
        this.b = str2;
        this.e = ie9Var;
        this.f = uri;
        this.g = uri2;
    }

    public /* synthetic */ xe9(le9 le9Var, String str, String str2, String str3, x1b x1bVar, xx1 xx1Var, axl axlVar) {
        String str4 = Build.MODEL;
        this.c = le9Var;
        this.a = str;
        this.b = str2;
        this.d = str3;
        this.e = x1bVar;
        this.f = xx1Var;
        this.g = axlVar;
    }

    @Override // defpackage.swl
    public final qwl run() {
        final le9 le9Var = (le9) this.c;
        String str = Build.MODEL;
        final String str2 = (String) this.d;
        final x1b x1bVar = (x1b) this.e;
        final xx1 xx1Var = (xx1) this.f;
        final axl axlVar = (axl) this.g;
        final PublicKey publicKeyA = le9Var.d.A();
        if (publicKeyA == null) {
            return null;
        }
        final String str3 = this.a;
        final String str4 = this.b;
        return new qwl() { // from class: mwl
            {
                String str5 = Build.MODEL;
            }

            @Override // defpackage.qwl
            public final ih4 run() throws JSONException {
                String str5 = Build.MODEL;
                le9 le9Var2 = le9Var;
                le9Var2.getClass();
                orb orbVar = new orb();
                orbVar.p(str5, Constants.Params.NAME);
                orbVar.p(str3, "client_version");
                orbVar.p(str4, "kind");
                orbVar.p(str2, "notification_token");
                orbVar.p(p36.e(publicKeyA), "public_key");
                vpb vpbVar = new vpb();
                gmb gmbVarN = x1bVar.n();
                while (true) {
                    gmb gmbVar = gmbVarN;
                    if (gmbVar.f) {
                        orbVar.p(vpbVar, "client_capabilities");
                        return new ai2(le9Var2, axlVar, orbVar, xx1Var);
                    }
                    vpbVar.a((String) gmbVar.next());
                }
            }
        };
    }
}
