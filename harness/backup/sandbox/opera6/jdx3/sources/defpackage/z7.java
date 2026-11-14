package defpackage;

import android.text.TextUtils;
import com.leanplum.internal.RequestBuilder;

/* loaded from: classes.dex */
public class z7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public boolean f;
    public boolean g;

    public z7(String str) {
        this(str, "application/json", RequestBuilder.GET, null, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z7(String str, String str2, byte b) {
        this(str, null, RequestBuilder.POST, "application/json", str2);
        switch (b) {
            case 1:
                this(str, "application/json", RequestBuilder.POST, "application/json", str2);
                break;
            default:
                break;
        }
    }

    public z7(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public String a() {
        return this.e;
    }

    public boolean b() {
        return !TextUtils.isEmpty(this.e);
    }

    public void c(fvh fvhVar) {
        String str = this.b;
        if (str != null) {
            fvhVar.d("accept", str);
        }
        boolean zB = b();
        String str2 = this.c;
        if (zB) {
            fvhVar.e(str2, new mvh(this));
            return;
        }
        if (RequestBuilder.POST.equals(str2) || "PUT".equals(str2)) {
            fvhVar.e(str2, rvh.create(new byte[0]));
        } else {
            if (RequestBuilder.GET.equals(str2)) {
                return;
            }
            fvhVar.e(str2, (rvh) null);
        }
    }
}
