package defpackage;

import com.leanplum.internal.RequestBuilder;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public final class de9 extends r43 {
    public final /* synthetic */ byte i = 0;
    public final /* synthetic */ String j;
    public final /* synthetic */ orb k;
    public final /* synthetic */ le9 l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Callback n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de9(le9 le9Var, se9 se9Var, String str, String str2, orb orbVar, se9 se9Var2) {
        super(le9Var, se9Var);
        this.j = str;
        this.m = str2;
        this.k = orbVar;
        this.n = se9Var2;
        Objects.requireNonNull(le9Var);
        this.l = le9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de9(le9 le9Var, ve9 ve9Var, String str, orb orbVar, vz vzVar, cxl cxlVar) {
        super(le9Var, ve9Var);
        this.j = str;
        this.k = orbVar;
        this.m = vzVar;
        this.n = cxlVar;
        Objects.requireNonNull(le9Var);
        this.l = le9Var;
    }

    @Override // defpackage.p43
    public final RealCall b() {
        byte b = this.i;
        orb orbVar = this.k;
        String str = this.j;
        le9 le9Var = this.l;
        switch (b) {
            case 0:
                t9f t9fVar = (t9f) le9Var.a.get();
                fvh fvhVarA = le9Var.a("devices/" + a26.C(str) + "/direct-messages", (String) this.m, new String[0]);
                fvhVarA.e(RequestBuilder.POST, rvh.create(orbVar.a.toString(), s43.c));
                return t9fVar.c(new kvh(fvhVarA));
            default:
                t9f t9fVar2 = (t9f) le9Var.a.get();
                fvh fvhVarA2 = le9Var.a("connect-devices", str, new String[0]);
                fvhVarA2.e(RequestBuilder.POST, rvh.create(orbVar.a.toString(), s43.c));
                return t9fVar2.c(new kvh(fvhVarA2));
        }
    }

    @Override // defpackage.p43
    public final boolean d(pzh pzhVar) {
        switch (this.i) {
            case 0:
                return pzhVar.d == 201;
            default:
                return super.d(pzhVar);
        }
    }

    @Override // defpackage.r43
    public final void g(orb orbVar) {
        byte b = this.i;
        Callback callback = this.n;
        switch (b) {
            case 0:
                e(new oi2((se9) callback, orbVar.a.getLong("id"), (byte) 3));
                break;
            default:
                ArrayList arrayList = new ArrayList();
                owl owlVarE = le9.e(orbVar, arrayList);
                String str = ((vz) this.m).b;
                if (owlVarE != null) {
                    String str2 = owlVarE.i;
                    String[] strArrSplit = str2.split("\\$");
                    if (strArrSplit.length == 2 && str2.equals(le9.d(owlVarE.a, str, owlVarE.f, strArrSplit[1]))) {
                        e(new npl((cxl) callback, arrayList, (byte) 3));
                        break;
                    }
                }
                a(new q43(-3, owlVarE != null ? owlVarE.a : ""));
                break;
        }
    }
}
