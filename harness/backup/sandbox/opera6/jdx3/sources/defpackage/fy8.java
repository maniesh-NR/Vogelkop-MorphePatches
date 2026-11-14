package defpackage;

import android.text.TextUtils;
import com.leanplum.internal.Constants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class fy8 extends zx8 {
    public final List m;

    public fy8(String str, msh mshVar, List list, String str2) {
        super(mshVar, str, str2);
        this.m = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fy8(msh mshVar, List list, String str, byte b) {
        this("report", mshVar, list, str);
        switch (b) {
            case 1:
                this("not_interested", mshVar, list, str);
                break;
            default:
                break;
        }
    }

    public fy8(orb orbVar, String str) {
        super(orbVar, str);
        vpb vpbVarH = orbVar.h("feedback_reason");
        if (vpbVarH != null) {
            this.m = new ArrayList();
            for (int i = 0; i < vpbVarH.a.length(); i++) {
                orb orbVarE = vpbVarH.e(i);
                if (orbVarE != null) {
                    this.m.add(tx8.a(orbVarE));
                } else {
                    String strF = vpbVarH.f(i);
                    if (!strF.isEmpty()) {
                        this.m.add(new tx8(strF, null, null));
                    }
                }
            }
        }
    }

    @Override // defpackage.zx8, defpackage.dy8
    public final void a(orb orbVar) throws JSONException {
        super.a(orbVar);
        List<tx8> list = this.m;
        if (list != null) {
            vpb vpbVar = new vpb();
            for (tx8 tx8Var : list) {
                orb orbVar2 = new orb();
                String str = tx8Var.a;
                String str2 = tx8Var.c;
                String str3 = tx8Var.b;
                orbVar2.p(str, "id");
                if (!TextUtils.isEmpty(str3)) {
                    orbVar2.p(str3, Constants.Params.VALUE);
                }
                if (!TextUtils.isEmpty(str2)) {
                    orbVar2.p(str2, "content");
                }
                vpbVar.a(orbVar2);
            }
            orbVar.p(vpbVar, "feedback_reason");
        }
    }
}
