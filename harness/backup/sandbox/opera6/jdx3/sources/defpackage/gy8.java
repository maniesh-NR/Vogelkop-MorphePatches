package defpackage;

import android.text.TextUtils;
import com.leanplum.internal.Constants;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class gy8 extends zx8 {
    public final String m;

    public gy8(msh mshVar, String str, String str2) {
        super(mshVar, "like", str2);
        this.m = str;
    }

    public gy8(orb orbVar) {
        super(orbVar, "like");
        this.m = orbVar.m(Constants.Params.VALUE, null);
    }

    @Override // defpackage.zx8, defpackage.dy8
    public final void a(orb orbVar) throws JSONException {
        super.a(orbVar);
        String str = this.m;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        orbVar.p(str, Constants.Params.VALUE);
    }
}
