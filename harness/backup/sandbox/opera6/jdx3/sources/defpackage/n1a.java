package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class n1a extends AsyncTask {
    public final Account a;
    public final /* synthetic */ p1a b;

    public n1a(p1a p1aVar, Account account) {
        this.b = p1aVar;
        this.a = account;
    }

    public final o1a a() {
        return new o1a(GoogleAuthUtil.getToken(this.b.b.getApplicationContext(), this.a, "oauth2:profile email"), null);
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            return a();
        } catch (GoogleAuthException | IOException e) {
            return new o1a(null, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        o1a o1aVar = (o1a) obj;
        UserRecoverableAuthException userRecoverableAuthException = o1aVar.b;
        boolean z = userRecoverableAuthException instanceof UserRecoverableAuthException;
        p1a p1aVar = this.b;
        if (z) {
            Intent intent = userRecoverableAuthException.getIntent();
            Activity activity = p1aVar.b;
            if (!(activity instanceof hjf)) {
                p1aVar.a(1001, Integer.MIN_VALUE, null);
                return;
            }
            ((hjf) activity).c.put(1001, new m1a(p1aVar, 1001));
            activity.startActivityForResult(intent, 1001);
            return;
        }
        String str = o1aVar.a;
        if (str == null) {
            ((wjh) ((q0a) p1aVar.a.b).b).t(null);
            return;
        }
        vzk vzkVar = new vzk(new i4d((q0a) p1aVar.a.b, (byte) 27));
        tvh tvhVar = new tvh();
        tvhVar.a = dgh.h().buildUpon().appendEncodedPath(vep.h(8)).appendQueryParameter("get_opera_access_token", "1").appendQueryParameter("create_user_if_not_exists", "1").appendQueryParameter("provider", "google").build().toString();
        tvhVar.b.add(new lyf("X-Mobile-Client-AuthAPI", "2"));
        tvhVar.c.add(new lyf("token", str));
        vzkVar.a0(tvhVar, "google");
    }
}
