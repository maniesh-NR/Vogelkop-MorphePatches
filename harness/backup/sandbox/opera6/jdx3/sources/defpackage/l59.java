package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.appsflyer.internal.j;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Random;

/* loaded from: classes.dex */
public final class l59 implements Runnable {
    public final int a;
    public final b59 b;
    public final ga6 c;
    public int d;
    public final Random e = new Random();

    public l59(int i, b59 b59Var, ga6 ga6Var) {
        this.a = i;
        this.b = b59Var;
        this.c = ga6Var;
    }

    public final void a(cm cmVar) {
        int i = cmVar.b;
        if (i == 2) {
            int i2 = this.d;
            this.d = i2 + 1;
            if (i2 < 20) {
                vml.d(this, Math.min(300000L, this.e.nextInt(1 << r3) * 123));
                return;
            }
        }
        m59 m59Var = (m59) this.c.b;
        SharedPreferences sharedPreferences = (SharedPreferences) m59Var.f;
        String str = cmVar.c;
        boolean z = i == 1;
        if (z) {
            String string = sharedPreferences.getString("last_fcm_token", null);
            j.c(sharedPreferences, "last_fcm_token", str);
            ((c59) m59Var.g).e((String) m59Var.d, str, !TextUtils.equals(string, str));
        }
        m59Var.c = false;
        int i3 = m59Var.b;
        if (this.a != i3) {
            m59Var.c = true;
            new l59(i3, (b59) m59Var.e, new ga6((Object) m59Var, (byte) 12)).run();
        } else if (z) {
            m59Var.b = 1;
            sharedPreferences.edit().putInt("unfinished_task", vep.A(1)).apply();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) r49.f((String) this.b.get()).b(FirebaseMessaging.class);
        int i = this.a;
        Task taskB = (i == 5 || i == 3) ? firebaseMessaging.b() : null;
        int iA = vep.A(i);
        if (iA == 0 || iA == 2) {
            taskB.addOnSuccessListener(new k59(this, (byte) 2)).addOnFailureListener(new k59(this, (byte) 1));
        } else {
            (taskB == null ? firebaseMessaging.f() : taskB.onSuccessTask(new i59(firebaseMessaging, (byte) 2))).addOnSuccessListener(new k59(this, (byte) 0)).addOnFailureListener(new k59(this, (byte) 1));
        }
    }
}
