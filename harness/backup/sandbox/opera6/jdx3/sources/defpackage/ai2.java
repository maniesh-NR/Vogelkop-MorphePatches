package defpackage;

import com.leanplum.internal.RequestBuilder;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public final class ai2 extends r43 {
    public final /* synthetic */ byte i = 0;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Callback k;
    public final /* synthetic */ s43 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai2(di2 di2Var, zzh zzhVar, orb orbVar, ay1 ay1Var) {
        super(di2Var, zzhVar);
        this.j = orbVar;
        this.k = ay1Var;
        Objects.requireNonNull(di2Var);
        this.l = di2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai2(le9 le9Var, axl axlVar, orb orbVar, xx1 xx1Var) {
        super(le9Var, axlVar);
        this.j = orbVar;
        this.k = xx1Var;
        Objects.requireNonNull(le9Var);
        this.l = le9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai2(le9 le9Var, Callback callback, String str, Callback callback2) {
        super(le9Var, callback);
        this.j = str;
        this.k = callback2;
        this.l = le9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai2(le9 le9Var, pe9 pe9Var, String str, ue9 ue9Var) {
        super(le9Var, pe9Var);
        this.j = str;
        this.k = ue9Var;
        Objects.requireNonNull(le9Var);
        this.l = le9Var;
    }

    @Override // defpackage.p43
    public final RealCall b() {
        byte b = this.i;
        Object obj = this.j;
        s43 s43Var = this.l;
        switch (b) {
            case 0:
                di2 di2Var = (di2) s43Var;
                t9f t9fVar = (t9f) di2Var.a.get();
                fvh fvhVarA = di2Var.a("flow/signup", null, new String[0]);
                fvhVarA.e(RequestBuilder.POST, rvh.create(((orb) obj).a.toString(), s43.c));
                return t9fVar.c(new kvh(fvhVarA));
            case 1:
                le9 le9Var = (le9) s43Var;
                t9f t9fVar2 = (t9f) le9Var.a.get();
                fvh fvhVarA2 = le9Var.a("file-storage", (String) obj, new String[0]);
                fvhVarA2.e(RequestBuilder.POST, rvh.create(new byte[0]));
                return t9fVar2.c(new kvh(fvhVarA2));
            case 2:
                le9 le9Var2 = (le9) s43Var;
                t9f t9fVar3 = (t9f) le9Var2.a.get();
                fvh fvhVarA3 = le9Var2.a("devices", null, new String[0]);
                fvhVarA3.e(RequestBuilder.POST, rvh.create(((orb) obj).a.toString(), s43.c));
                return t9fVar3.c(new kvh(fvhVarA3));
            default:
                le9 le9Var3 = (le9) s43Var;
                return j7c.q(le9Var3.a("devices", (String) obj, new String[0]), (t9f) le9Var3.a.get());
        }
    }

    @Override // defpackage.p43
    public final boolean d(pzh pzhVar) {
        switch (this.i) {
            case 2:
                return pzhVar.d == 201;
            default:
                return super.d(pzhVar);
        }
    }

    @Override // defpackage.r43
    public final void g(orb orbVar) {
        byte b = this.i;
        Callback callback = this.k;
        switch (b) {
            case 0:
                e(new xa((ay1) callback, orbVar.e("token"), (byte) 29));
                break;
            case 1:
                e(new cn7((ue9) callback, new ie9(orbVar), (byte) 27));
                break;
            case 2:
                e(new npl((xx1) callback, new twl(orbVar), (byte) 1));
                break;
            default:
                ArrayList arrayList = new ArrayList();
                le9.e(orbVar, arrayList);
                e(new npl(callback, arrayList, (byte) 2));
                break;
        }
    }
}
