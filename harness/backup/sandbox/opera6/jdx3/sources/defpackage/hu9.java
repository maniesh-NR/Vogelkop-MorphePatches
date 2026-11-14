package defpackage;

import android.net.Uri;
import com.appsflyer.internal.o;
import com.leanplum.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hu9 extends k43 {
    public final long k;
    public final /* synthetic */ iu9 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu9(iu9 iu9Var, zy zyVar, dl dlVar, long j) {
        super(iu9Var, zyVar, dlVar);
        this.l = iu9Var;
        this.k = j;
    }

    @Override // defpackage.k43
    public final void a() {
        iu9 iu9Var = this.l;
        i5o i5oVar = iu9Var.q;
        String str = iu9Var.r;
        String str2 = iu9Var.s;
        String str3 = iu9Var.t;
        dg7 dg7Var = new dg7(this, (byte) 28);
        ((iy) i5oVar.a).d(new my(i5oVar, ((Uri) ((r9i) ((sy) i5oVar.i).get()).e).buildUpon().appendPath(str).appendPath("ads").appendPath("search"), dg7Var, (t9f) ((jy) i5oVar.b).get(), str2, str3));
    }

    public final void g(String str, boolean z, boolean z2) {
        iu9 iu9Var = this.l;
        iu9Var.x = false;
        iu9Var.w = this.k;
        b(z, str, z2, v50.b, null);
    }

    public final ArrayList h(String str) {
        List<si> list;
        String str2;
        si siVarB;
        JSONObject jSONObject = new JSONObject(str);
        long j = jSONObject.getLong(Constants.Keys.EXPIRATION_TIMESTAMP);
        JSONArray jSONArray = jSONObject.getJSONArray("ads");
        if (j - System.currentTimeMillis() < 30000) {
            list = Collections.EMPTY_LIST;
        } else {
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            int i = 0;
            while (i < length) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                orb orbVar = new orb(jSONObject2);
                String strE = orbVar.e("adType");
                int i2 = 2;
                int[] iArrB = vep.B(2);
                int length2 = iArrB.length;
                int i3 = 0;
                while (i3 < length2) {
                    JSONArray jSONArray2 = jSONArray;
                    int i4 = iArrB[i3];
                    if (i4 == 1) {
                        str2 = "SINGLE";
                    } else {
                        if (i4 != i2) {
                            throw null;
                        }
                        str2 = "GRID";
                    }
                    if (str2.equals(strE)) {
                        int iA = vep.A(i4);
                        if (iA == 0) {
                            siVarB = nlj.b(orbVar, j);
                        } else {
                            if (iA != 1) {
                                o.a("Unknown ad type.");
                                return null;
                            }
                            jSONObject2.getInt("rowCount");
                            jSONObject2.getInt("columnCount");
                            vpb vpbVarB = orbVar.b("ads");
                            int length3 = vpbVarB.a.length();
                            nlj[] nljVarArr = new nlj[length3];
                            for (int i5 = 0; i5 < length3; i5++) {
                                nljVarArr[i5] = nlj.b(vpbVarB.c(i5), j);
                            }
                            siVarB = new c4a();
                        }
                        arrayList.add(siVarB);
                        i++;
                        jSONArray = jSONArray2;
                    } else {
                        i3++;
                        jSONArray = jSONArray2;
                        i2 = 2;
                    }
                }
                qp2.o(strE);
                return null;
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        if (!list.isEmpty()) {
            iu9 iu9Var = this.l;
            ami amiVar = new ami(iu9Var.s, this.d, iu9Var.e, iu9Var.f, iu9Var.r, iu9Var.h, iu9Var.i, (byte) 9);
            for (si siVar : list) {
                ez ezVar = new ez(iu9Var.j, iu9Var.p, (byte) 1);
                int i6 = iu9.y;
                iu9.y = i6 + 1;
                arrayList2.add(siVar.a(ezVar, amiVar, i6));
            }
        }
        return arrayList2;
    }
}
