package defpackage;

import android.text.TextUtils;
import org.json.JSONException;

/* loaded from: classes.dex */
public abstract class oy8 extends dy8 {
    public final /* synthetic */ byte c;
    public final String d;
    public final String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oy8(String str, String str2, String str3, byte b) {
        super(str);
        this.c = b;
        this.d = str2;
        this.e = str3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy8(String str, orb orbVar, byte b) {
        super(orbVar, str);
        this.c = b;
        switch (b) {
            case 1:
                super(orbVar, str);
                this.d = orbVar.e("origin");
                this.e = orbVar.m("extra", null);
                break;
            default:
                this.d = orbVar.e("request_id");
                this.e = orbVar.e("access_type");
                break;
        }
    }

    @Override // defpackage.dy8
    public final void a(orb orbVar) throws JSONException {
        byte b = this.c;
        String str = this.e;
        Object obj = this.d;
        switch (b) {
            case 0:
                super.a(orbVar);
                orbVar.p(obj, "request_id");
                orbVar.p(str, "access_type");
                break;
            default:
                super.a(orbVar);
                orbVar.p(obj, "origin");
                if (!TextUtils.isEmpty(str)) {
                    orbVar.p(str, "extra");
                    break;
                }
                break;
        }
    }
}
