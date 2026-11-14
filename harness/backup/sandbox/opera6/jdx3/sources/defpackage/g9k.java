package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.opera.android.IntentDispatcherActivity;
import com.opera.android.OperaApplication;
import java.util.ArrayList;
import org.chromium.base.CommandLine;

/* loaded from: classes.dex */
public abstract class g9k extends hjf {
    public final ArrayList j = new ArrayList();
    public boolean k;
    public boolean l;

    /* JADX WARN: Multi-variable type inference failed */
    public final void F() {
        if (this.l) {
            return;
        }
        this.l = true;
        kfo.d0(this, 5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(Intent intent) {
        intent.setClass(getApplicationContext(), IntentDispatcherActivity.class);
        intent.setFlags(16777216);
        startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean H() {
        return ((OperaApplication) getApplication()).U() || this.k || this.l;
    }

    public void I(int i) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void J() {
        if (isFinishing()) {
            return;
        }
        ArrayList arrayList = this.j;
        if (arrayList.isEmpty()) {
            G(new Intent());
        } else {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                G((Intent) obj);
            }
            arrayList.clear();
        }
        finish();
    }

    public void b(boolean z) {
        J();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hjf
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (isFinishing()) {
            G(intent);
        } else {
            this.j.add(new Intent(intent));
        }
        f03.f(this);
        OperaApplication operaApplication = (OperaApplication) getApplication();
        if (operaApplication.U()) {
            Integer num = operaApplication.h;
            kfo.d0(this, num == null ? 0 : num.intValue());
            return;
        }
        CommandLine commandLine = operaApplication.n;
        if (commandLine == null) {
            commandLine = null;
        }
        xi5 xi5VarA = xi5.a(this);
        fsp.g(getApplicationContext(), commandLine);
        e7d.a(getApplicationContext(), new djf(this, commandLine, xi5VarA));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hjf
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (isFinishing()) {
            G(intent);
        } else {
            this.j.add(new Intent(intent));
        }
    }

    public final void onPostCreate(Bundle bundle) {
        try {
            super.onPostCreate(bundle);
        } catch (IllegalStateException unused) {
            F();
        }
    }

    public final void onPostResume() {
        try {
            super.onPostResume();
        } catch (IllegalStateException unused) {
            F();
        }
    }

    public void onStop() {
        try {
            super.onStop();
        } catch (IllegalStateException unused) {
            F();
        }
    }

    public final void setContentView(int i) {
        try {
            super.setContentView(i);
        } catch (IllegalStateException unused) {
            F();
        }
    }
}
