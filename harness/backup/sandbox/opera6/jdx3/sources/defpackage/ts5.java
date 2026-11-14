package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.view.View;
import com.leanplum.internal.Constants;
import com.opera.android.browser.chromium.ChromiumContent;

/* loaded from: classes.dex */
public final /* synthetic */ class ts5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ at5 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ts5(at5 at5Var, String str, byte b) {
        this.a = b;
        this.b = at5Var;
        this.c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        String str = this.c;
        at5 at5Var = this.b;
        switch (b) {
            case 0:
                Intent intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
                if (str != null) {
                    intent.putExtra(Constants.Params.EMAIL, str);
                }
                at5Var.m(intent);
                break;
            case 1:
                phj.t0(at5Var.b.getContext(), str);
                break;
            case 2:
                at5Var.m(new Intent("android.intent.action.SENDTO", Uri.parse(sko.j("sms:", str))));
                break;
            case 3:
                at5Var.m(new Intent("android.intent.action.DIAL", Uri.parse(sko.j("tel:", str))));
                break;
            case 4:
                Intent intent2 = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
                if (str != null) {
                    intent2.putExtra("phone", str);
                }
                at5Var.m(intent2);
                break;
            case 5:
                phj.t0(at5Var.b.getContext(), str);
                break;
            default:
                ChromiumContent chromiumContent = at5Var.c;
                sqh sqhVar = at5Var.d.k;
                chromiumContent.getClass();
                lsc lscVarF = wqm.f(str, sqhVar, lqm.d);
                if (lscVarF != null) {
                    chromiumContent.v(lscVarF);
                }
                at5Var.b();
                break;
        }
    }
}
