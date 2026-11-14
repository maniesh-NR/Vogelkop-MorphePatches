package defpackage;

import android.util.Base64;
import com.opera.api.Callback;
import java.io.Serializable;
import java.security.PublicKey;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class ae9 implements qwl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ le9 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Callback h;

    public /* synthetic */ ae9(le9 le9Var, String str, String str2, String str3, String str4, se9 se9Var, se9 se9Var2) {
        this.a = (byte) 1;
        this.b = le9Var;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = se9Var;
        this.h = se9Var2;
    }

    public /* synthetic */ ae9(le9 le9Var, String str, String str2, String str3, String str4, x1b x1bVar, qn qnVar, axl axlVar) {
        this.a = (byte) 2;
        this.b = le9Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = x1bVar;
        this.g = qnVar;
        this.h = axlVar;
    }

    public /* synthetic */ ae9(le9 le9Var, String str, PublicKey publicKey, String str2, Object obj, Callback callback, Callback callback2, byte b) {
        this.a = b;
        this.b = le9Var;
        this.c = str;
        this.f = publicKey;
        this.d = str2;
        this.e = obj;
        this.g = callback;
        this.h = callback2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ae9(le9 le9Var, String str, pwl pwlVar, String str2, byte[] bArr, Runnable runnable, Callback callback) {
        this.a = (byte) 3;
        this.b = le9Var;
        this.c = str;
        this.e = pwlVar;
        this.d = str2;
        this.f = bArr;
        this.g = runnable;
        this.h = callback;
    }

    @Override // defpackage.qwl
    public final ih4 run() throws JSONException {
        byte b = this.a;
        Callback callback = this.h;
        Object obj = this.g;
        Object obj2 = this.e;
        String str = this.d;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                ve9 ve9Var = (ve9) callback;
                le9 le9Var = this.b;
                le9Var.getClass();
                String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
                orb orbVar = new orb();
                orbVar.r("fallback", false);
                orbVar.p(le9.d(str, (String) obj2, (PublicKey) obj3, strValueOf), "authentication_string");
                return new xf1(le9Var, ve9Var, this.c, orbVar, (su) obj);
            case 1:
                se9 se9Var = (se9) callback;
                le9 le9Var2 = this.b;
                le9Var2.getClass();
                orb orbVar2 = new orb();
                orbVar2.p(str, "payload");
                orbVar2.p((String) obj2, "payload_iv");
                return new de9(le9Var2, se9Var, (String) obj3, this.c, orbVar2, (se9) obj);
            case 2:
                qn qnVar = (qn) obj;
                axl axlVar = (axl) callback;
                orb orbVarJ = o18.j("client_version", str, "notification_token", (String) obj2);
                vpb vpbVar = new vpb();
                gmb gmbVarN = ((x1b) obj3).n();
                while (true) {
                    gmb gmbVar = gmbVarN;
                    if (gmbVar.f) {
                        orbVarJ.p(vpbVar, "client_capabilities");
                        return new nwl(this.b, axlVar, this.c, orbVarJ, qnVar, (byte) 0);
                    }
                    vpbVar.a((String) gmbVar.next());
                }
            case 3:
                String str2 = ((pwl) obj2).a;
                String strEncodeToString = Base64.encodeToString((byte[]) obj3, 2);
                orb orbVarJ2 = o18.j("device_id", str2, "content", str);
                orbVarJ2.p(strEncodeToString, "signature");
                return new nwl(this.b, this.h, this.c, orbVarJ2, (Runnable) obj, (byte) 2);
            default:
                vz vzVar = (vz) obj2;
                ve9 ve9Var2 = (ve9) callback;
                le9 le9Var3 = this.b;
                le9Var3.getClass();
                String strValueOf2 = String.valueOf(System.currentTimeMillis() / 1000);
                orb orbVar3 = new orb();
                orbVar3.p(vzVar.a, "token");
                orbVar3.p(le9.d(str, vzVar.b, (PublicKey) obj3, strValueOf2), "authentication_string");
                orbVar3.r("allow_reconnect", true);
                return new de9(le9Var3, ve9Var2, this.c, orbVar3, vzVar, (cxl) obj);
        }
    }
}
