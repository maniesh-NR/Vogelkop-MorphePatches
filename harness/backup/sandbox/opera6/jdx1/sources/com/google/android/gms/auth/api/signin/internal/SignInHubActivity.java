package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.r;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import defpackage.atc;
import defpackage.btc;
import defpackage.ctc;
import defpackage.fxj;
import defpackage.j14;
import defpackage.ndc;
import defpackage.wsc;
import defpackage.y9m;
import defpackage.zsc;
import java.lang.reflect.Modifier;

@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends r {
    private static boolean zba = false;
    private boolean zbb = false;
    private SignInConfiguration zbc;
    private boolean zbd;
    private int zbe;
    private Intent zbf;

    private final void zbc(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", (Parcelable) this.zbc);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.zbb = true;
            zbe(17);
        }
    }

    private final void zbd() {
        zsc supportLoaderManager = getSupportLoaderManager();
        zbs zbsVar = new zbs(this, (byte[]) null);
        ctc ctcVar = (ctc) supportLoaderManager;
        ndc ndcVar = ctcVar.a;
        btc btcVar = ctcVar.b;
        boolean z = btcVar.c;
        fxj fxjVar = btcVar.b;
        if (z) {
            qp2.n("Called while creating a loader");
            return;
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            qp2.n("initLoader must be called on the main thread");
            return;
        }
        fxjVar.getClass();
        atc atcVar = (atc) y9m.u(fxjVar, 0);
        if (ctc.c(2)) {
            ctcVar.toString();
        }
        if (atcVar == null) {
            try {
                btcVar.c = true;
                wsc wscVarOnCreateLoader = zbsVar.onCreateLoader(0, (Bundle) null);
                if (wscVarOnCreateLoader == null) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
                }
                if (wscVarOnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(wscVarOnCreateLoader.getClass().getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + wscVarOnCreateLoader);
                }
                atc atcVar2 = new atc(wscVarOnCreateLoader);
                if (ctc.c(3)) {
                    atcVar2.toString();
                }
                fxjVar.e(0, atcVar2);
                btcVar.c = false;
                q59 q59Var = new q59(atcVar2.l, zbsVar);
                atcVar2.j(ndcVar, q59Var);
                q59 q59Var2 = atcVar2.n;
                if (q59Var2 != null) {
                    atcVar2.p(q59Var2);
                }
                atcVar2.m = ndcVar;
                atcVar2.n = q59Var;
            } catch (Throwable th) {
                btcVar.c = false;
                throw th;
            }
        } else {
            if (ctc.c(3)) {
                atcVar.toString();
            }
            q59 q59Var3 = new q59(atcVar.l, zbsVar);
            atcVar.j(ndcVar, q59Var3);
            q59 q59Var4 = atcVar.n;
            if (q59Var4 != null) {
                atcVar.p(q59Var4);
            }
            atcVar.m = ndcVar;
            atcVar.n = q59Var3;
        }
        zba = false;
    }

    private final void zbe(int i) {
        Status status = new Status(i);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", (Parcelable) status);
        setResult(0, intent);
        finish();
        zba = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.r, defpackage.xd5, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (this.zbb) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) yi4.x(intent, "signInAccount", SignInAccount.class);
            if (signInAccount != null && signInAccount.zba() != null) {
                GoogleSignInAccount googleSignInAccountZba = signInAccount.zba();
                if (googleSignInAccountZba == null) {
                    zbe(12500);
                    return;
                }
                zbk.zba(this).zbc(this.zbc.zba(), googleSignInAccountZba);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", (Parcelable) googleSignInAccountZba);
                this.zbd = true;
                this.zbe = i2;
                this.zbf = intent;
                zbd();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                zbe(intExtra);
                return;
            }
        }
        zbe(8);
    }

    @Override // androidx.fragment.app.r, defpackage.xd5, defpackage.wd5, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            zbe(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            zbe(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            "Unknown action: ".concat(String.valueOf(intent.getAction()));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) j14.T(bundleExtra, "config", SignInConfiguration.class);
        if (signInConfiguration == null) {
            setResult(0);
            finish();
            return;
        }
        this.zbc = signInConfiguration;
        if (bundle == null) {
            if (zba) {
                setResult(0);
                zbe(12502);
                return;
            } else {
                zba = true;
                zbc(action);
                return;
            }
        }
        boolean z = bundle.getBoolean("signingInGoogleApiClients");
        this.zbd = z;
        if (z) {
            this.zbe = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) j14.T(bundle, "signInResultData", Intent.class);
            if (intent2 == null) {
                setResult(0);
                finish();
            } else {
                this.zbf = intent2;
                zbd();
            }
        }
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        zba = false;
    }

    @Override // defpackage.xd5, defpackage.wd5, android.app.Activity
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.zbd);
        if (this.zbd) {
            bundle.putInt("signInResultCode", this.zbe);
            bundle.putParcelable("signInResultData", this.zbf);
        }
    }

    public final /* synthetic */ int zba() {
        return this.zbe;
    }

    public final /* synthetic */ Intent zbb() {
        return this.zbf;
    }
}
