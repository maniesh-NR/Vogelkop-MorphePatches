package defpackage;

import com.leanplum.internal.Constants;
import com.opera.api.Callback;
import java.util.ArrayList;
import java.util.Objects;
import okhttp3.internal.connection.RealCall;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ee9 extends r43 {
    public final /* synthetic */ byte i = 0;
    public boolean j;
    public long k;
    public ArrayList l;
    public final /* synthetic */ String m;
    public final /* synthetic */ le9 n;
    public final /* synthetic */ Callback o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee9(le9 le9Var, hu5 hu5Var, String str, hu5 hu5Var2) {
        super(le9Var, hu5Var);
        this.m = str;
        this.o = hu5Var2;
        Objects.requireNonNull(le9Var);
        this.n = le9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee9(le9 le9Var, j12 j12Var, Long l, String str, hu5 hu5Var) {
        super(le9Var, j12Var);
        this.m = str;
        this.o = hu5Var;
        Objects.requireNonNull(le9Var);
        this.n = le9Var;
        this.j = l != null;
        this.k = l != null ? l.longValue() : 0L;
    }

    @Override // defpackage.p43
    public final RealCall b() {
        t9f t9fVar;
        fvh fvhVarA;
        byte b = this.i;
        String str = this.m;
        le9 le9Var = this.n;
        switch (b) {
            case 0:
                ArrayList arrayList = new ArrayList();
                if (this.j) {
                    arrayList.add("progress_marker");
                    arrayList.add(String.valueOf(this.k));
                }
                t9fVar = (t9f) le9Var.a.get();
                fvhVarA = le9Var.a("devices/me/direct-messages", str, (String[]) arrayList.toArray(new String[0]));
                break;
            default:
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add("order");
                arrayList2.add("asc");
                if (this.j) {
                    arrayList2.add("from_id");
                    arrayList2.add(String.valueOf(this.k));
                }
                t9fVar = (t9f) le9Var.a.get();
                fvhVarA = le9Var.a(Constants.Keys.MESSAGES, str, (String[]) arrayList2.toArray(new String[0]));
                break;
        }
        return j7c.q(fvhVarA, t9fVar);
    }

    @Override // defpackage.r43
    public final void g(orb orbVar) {
        byte b = this.i;
        Callback callback = this.o;
        switch (b) {
            case 0:
                vpb vpbVarB = orbVar.b(Constants.Keys.MESSAGES);
                JSONObject jSONObject = orbVar.a;
                JSONArray jSONArray = vpbVarB.a;
                ArrayList arrayList = new ArrayList(jSONArray.length());
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(new he9(vpbVarB.c(i)));
                }
                ArrayList arrayList2 = this.l;
                if (arrayList2 != null) {
                    arrayList.addAll(0, arrayList2);
                }
                if (jSONObject.optBoolean("more", false)) {
                    this.k = jSONObject.getLong("progress_marker");
                    this.j = true;
                    this.l = arrayList;
                    this.f = 0;
                    this.g = 100L;
                    e(new fv2(this, (byte) 6));
                    break;
                } else {
                    e(new cn7((hu5) callback, arrayList, (byte) 24));
                    break;
                }
            default:
                vpb vpbVarB2 = orbVar.b(Constants.Keys.MESSAGES);
                JSONObject jSONObject2 = orbVar.a;
                JSONArray jSONArray2 = vpbVarB2.a;
                ArrayList arrayList3 = new ArrayList(jSONArray2.length());
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    arrayList3.add(new je9(vpbVarB2.c(i2)));
                }
                ArrayList arrayList4 = this.l;
                if (arrayList4 != null) {
                    arrayList3.addAll(0, arrayList4);
                }
                if (jSONObject2.optBoolean("changes_remaining", false)) {
                    this.k = jSONObject2.getLong("last_id");
                    this.j = true;
                    this.l = arrayList3;
                    this.f = 0;
                    this.g = 100L;
                    e(new fv2(this, (byte) 6));
                    break;
                } else {
                    e(new cn7((hu5) callback, arrayList3, (byte) 26));
                    break;
                }
        }
    }
}
