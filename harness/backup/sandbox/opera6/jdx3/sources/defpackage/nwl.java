package defpackage;

import com.leanplum.internal.RequestBuilder;
import com.opera.api.Callback;
import java.util.Objects;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public final class nwl extends p43 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ String j;
    public final /* synthetic */ le9 k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Runnable m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwl(le9 le9Var, Callback callback, String str, String str2, Runnable runnable) {
        super(le9Var, callback);
        this.i = (byte) 1;
        this.j = str;
        this.l = str2;
        this.m = runnable;
        Objects.requireNonNull(le9Var);
        this.k = le9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nwl(le9 le9Var, Callback callback, String str, orb orbVar, Runnable runnable, byte b) {
        super(le9Var, callback);
        this.i = b;
        this.j = str;
        this.l = orbVar;
        this.m = runnable;
        this.k = le9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwl(le9 le9Var, vk2 vk2Var, String str, orb orbVar, rl rlVar) {
        super(le9Var, vk2Var);
        this.i = (byte) 3;
        this.j = str;
        this.l = orbVar;
        this.m = rlVar;
        Objects.requireNonNull(le9Var);
        this.k = le9Var;
    }

    @Override // defpackage.p43
    public final RealCall b() {
        byte b = this.i;
        Object obj = this.l;
        String str = this.j;
        le9 le9Var = this.k;
        switch (b) {
            case 0:
                t9f t9fVar = (t9f) le9Var.a.get();
                fvh fvhVarA = le9Var.a("devices/me", str, new String[0]);
                fvhVarA.e("PATCH", rvh.create(((orb) obj).a.toString(), s43.c));
                return t9fVar.c(new kvh(fvhVarA));
            case 1:
                t9f t9fVar2 = (t9f) le9Var.a.get();
                fvh fvhVarA2 = le9Var.a("devices/" + a26.C(str), (String) obj, new String[0]);
                fvhVarA2.e("DELETE", rvh.EMPTY);
                return t9fVar2.c(new kvh(fvhVarA2));
            case 2:
                t9f t9fVar3 = (t9f) le9Var.a.get();
                fvh fvhVarA3 = le9Var.a("encryption-keys", str, new String[0]);
                fvhVarA3.e(RequestBuilder.POST, rvh.create(((orb) obj).a.toString(), s43.c));
                return t9fVar3.c(new kvh(fvhVarA3));
            default:
                t9f t9fVar4 = (t9f) le9Var.a.get();
                fvh fvhVarA4 = le9Var.a("notify-devices", str, new String[0]);
                fvhVarA4.e(RequestBuilder.POST, rvh.create(((orb) obj).a.toString(), s43.c));
                return t9fVar4.c(new kvh(fvhVarA4));
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

    @Override // defpackage.p43
    public final void f(pzh pzhVar) {
        byte b = this.i;
        rl rlVar = this.m;
        switch (b) {
            case 0:
                e((qn) rlVar);
                break;
            case 1:
                e(rlVar);
                break;
            case 2:
                e(rlVar);
                break;
            default:
                e(rlVar);
                break;
        }
    }
}
