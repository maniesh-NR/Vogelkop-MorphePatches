package com.opera.android.autofill;

import android.app.KeyguardManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.inline.InlinePresentationSpec;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.OperaAutofillIntentDispatcherActivity;
import com.opera.android.autofill.passwords.picker.AutofillPasswordPickerActivity;
import defpackage.as2;
import defpackage.eyi;
import defpackage.hu5;
import defpackage.i2g;
import defpackage.j2g;
import defpackage.k2g;
import defpackage.o8f;
import defpackage.plk;
import defpackage.pml;
import defpackage.q3;
import defpackage.qab;
import defpackage.r3g;
import defpackage.rab;
import defpackage.rml;
import defpackage.s3g;
import defpackage.sv1;
import defpackage.t3g;
import defpackage.tb2;
import defpackage.tcl;
import defpackage.ub2;
import defpackage.umi;
import defpackage.vdf;
import defpackage.vif;
import defpackage.wif;
import defpackage.xu2;
import defpackage.yif;
import defpackage.yo7;
import defpackage.yt7;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/opera/android/autofill/OperaAutofillIntentDispatcherActivity;", "Lxd5;", "<init>", "()V", "yif", "autofill-service"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperaAutofillIntentDispatcherActivity extends xd5 {
    public static final /* synthetic */ int i = 0;
    public final zyk a;
    public final zyk b;
    public final zyk c;
    public t3g d;
    public final zyk e;
    public th f;
    public th g;
    public final ArrayList h = new ArrayList();

    public OperaAutofillIntentDispatcherActivity() {
        final byte b = 0;
        this.a = z4c.b(new Function0(this) { // from class: xif
            public final /* synthetic */ OperaAutofillIntentDispatcherActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, com.opera.android.autofill.OperaAutofillIntentDispatcherActivity] */
            public final Object invoke() {
                byte b2 = b;
                ?? r1 = this.b;
                switch (b2) {
                    case 0:
                        int i2 = OperaAutofillIntentDispatcherActivity.i;
                        return r1.w();
                    case 1:
                        int i3 = OperaAutofillIntentDispatcherActivity.i;
                        return (xu2) r1.getApplicationContext();
                    case 2:
                        int i4 = OperaAutofillIntentDispatcherActivity.i;
                        return (ub2) ((OperaApplication) r1.u()).r.j.get();
                    default:
                        int i5 = OperaAutofillIntentDispatcherActivity.i;
                        return (KeyguardManager) r1.getSystemService("keyguard");
                }
            }
        });
        final byte b2 = 1;
        this.b = z4c.b(new Function0(this) { // from class: xif
            public final /* synthetic */ OperaAutofillIntentDispatcherActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, com.opera.android.autofill.OperaAutofillIntentDispatcherActivity] */
            public final Object invoke() {
                byte b22 = b2;
                ?? r1 = this.b;
                switch (b22) {
                    case 0:
                        int i2 = OperaAutofillIntentDispatcherActivity.i;
                        return r1.w();
                    case 1:
                        int i3 = OperaAutofillIntentDispatcherActivity.i;
                        return (xu2) r1.getApplicationContext();
                    case 2:
                        int i4 = OperaAutofillIntentDispatcherActivity.i;
                        return (ub2) ((OperaApplication) r1.u()).r.j.get();
                    default:
                        int i5 = OperaAutofillIntentDispatcherActivity.i;
                        return (KeyguardManager) r1.getSystemService("keyguard");
                }
            }
        });
        final byte b3 = 2;
        this.c = z4c.b(new Function0(this) { // from class: xif
            public final /* synthetic */ OperaAutofillIntentDispatcherActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, com.opera.android.autofill.OperaAutofillIntentDispatcherActivity] */
            public final Object invoke() {
                byte b22 = b3;
                ?? r1 = this.b;
                switch (b22) {
                    case 0:
                        int i2 = OperaAutofillIntentDispatcherActivity.i;
                        return r1.w();
                    case 1:
                        int i3 = OperaAutofillIntentDispatcherActivity.i;
                        return (xu2) r1.getApplicationContext();
                    case 2:
                        int i4 = OperaAutofillIntentDispatcherActivity.i;
                        return (ub2) ((OperaApplication) r1.u()).r.j.get();
                    default:
                        int i5 = OperaAutofillIntentDispatcherActivity.i;
                        return (KeyguardManager) r1.getSystemService("keyguard");
                }
            }
        });
        final byte b4 = 3;
        this.e = z4c.b(new Function0(this) { // from class: xif
            public final /* synthetic */ OperaAutofillIntentDispatcherActivity b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r1v1, types: [android.content.Context, com.opera.android.autofill.OperaAutofillIntentDispatcherActivity] */
            public final Object invoke() {
                byte b22 = b4;
                ?? r1 = this.b;
                switch (b22) {
                    case 0:
                        int i2 = OperaAutofillIntentDispatcherActivity.i;
                        return r1.w();
                    case 1:
                        int i3 = OperaAutofillIntentDispatcherActivity.i;
                        return (xu2) r1.getApplicationContext();
                    case 2:
                        int i4 = OperaAutofillIntentDispatcherActivity.i;
                        return (ub2) ((OperaApplication) r1.u()).r.j.get();
                    default:
                        int i5 = OperaAutofillIntentDispatcherActivity.i;
                        return (KeyguardManager) r1.getSystemService("keyguard");
                }
            }
        });
    }

    public final void A(boolean z) {
        if (!z) {
            s(new wif(this, (byte) 2));
            return;
        }
        yif yifVarV = v();
        r3g r3gVar = yifVarV != null ? yifVarV.b : null;
        if (r3gVar == null) {
            return;
        }
        Intent intentPutExtra = new Intent(r().a.a, (Class<?>) AutofillPasswordPickerActivity.class).addFlags(1073741824).addFlags(8388608).setAction("AutofillIntent.Action.EDIT").putExtra("AutofillIntent.EXTRA_PASSWORD_ID", r3gVar.getId());
        th thVar = this.f;
        if (thVar == null) {
            thVar = null;
        }
        thVar.a(intentPutExtra, (nh) null);
    }

    public final void B(boolean z) {
        if (!z) {
            s(new wif(this, (byte) 0));
            return;
        }
        Intent action = new Intent(r().a.a, (Class<?>) AutofillPasswordPickerActivity.class).addFlags(1073741824).addFlags(8388608).setAction("AutofillIntent.Action.VIEW_ALL");
        th thVar = this.f;
        if (thVar == null) {
            thVar = null;
        }
        thVar.a(action, (nh) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(String str, Runnable runnable) {
        zyk zykVar = this.e;
        if (!((KeyguardManager) zykVar.getValue()).isKeyguardSecure()) {
            runnable.run();
            return;
        }
        this.h.add(runnable);
        th thVar = this.g;
        if (thVar == null) {
            thVar = null;
        }
        thVar.a(((KeyguardManager) zykVar.getValue()).createConfirmDeviceCredentialIntent(getApplicationInfo().loadLabel(getPackageManager()), str), (nh) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f = registerForActivityResult(new sh((byte) 1), new vif(this, (byte) 0));
        this.g = registerForActivityResult(new sh((byte) 1), new vif(this, (byte) 2));
        ((as2) ((OperaApplication) u()).f.get()).a(this, new o8f(this, (byte) 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final sv1 r() {
        sv1 sv1Var;
        Object applicationContext = getApplicationContext();
        xu2 xu2Var = applicationContext instanceof xu2 ? (xu2) applicationContext : null;
        if (xu2Var != null && (sv1Var = (sv1) ((OperaApplication) xu2Var).r.k.get()) != null) {
            return sv1Var;
        }
        throw new IllegalStateException((getApplicationContext() + " doesn't implement AutofillServiceDependencyProvider").toString());
    }

    public final void s(Function1 function1) throws PackageManager.NameNotFoundException, IOException {
        boolean z;
        yif yifVarV = v();
        k2g k2gVar = yifVarV != null ? yifVarV.a : null;
        if (k2gVar != null) {
            j2g j2gVarA = k2gVar.a();
            if (!(j2gVarA instanceof i2g)) {
                function1.invoke(Boolean.TRUE);
                return;
            }
            ub2 ub2Var = (ub2) this.c.getValue();
            i2g i2gVar = (i2g) j2gVarA;
            String str = i2gVar.d;
            String str2 = i2gVar.c;
            yo7 yo7Var = new yo7((Object) this, (Object) i2gVar, (Object) function1, (byte) 24);
            ub2Var.getClass();
            try {
                try {
                    str2.getClass();
                    new ugb(str2);
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                if (z) {
                    str2.getClass();
                    ugb ugbVar = new ugb(str2);
                    if (!(ugbVar.a() > 0)) {
                        if (e82.u(CollectionsKt.firstOrNull(ugbVar.b().b), x7d.i) >= 0) {
                            yo7Var.invoke(Boolean.TRUE);
                            return;
                        }
                    }
                }
            } catch (IllegalArgumentException | IllegalStateException unused2) {
            }
            qab qabVar = rab.a;
            HashSet hashSetB = rab.b(ub2Var.b, str, "SHA-256", qab.b);
            try {
                String strA = ub2.a(str2);
                plk plkVarB = new rml(Unit.a, ub2Var.a).b(new tb2(ub2Var, str2, (byte) 3));
                tb2 tb2Var = new tb2(ub2Var, strA, (byte) 4);
                eyi eyiVar = (eyi) plkVarB.c;
                if (eyiVar.b) {
                    throw new IllegalStateException("");
                }
                tcl tclVar = (tcl) plkVarB.a;
                new plk(tclVar, ((umi) tclVar).e(new pml(new ra(tb2Var, (byte) 17), (byte) 0)), eyiVar, plkVarB).t(new q3(yo7Var, hashSetB, strA, str)).l();
            } catch (IllegalArgumentException unused3) {
                yo7Var.invoke(Boolean.FALSE);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t(Bundle bundle) {
        yif yifVarV = v();
        r3g r3gVar = null;
        k2g k2gVar = yifVarV != null ? yifVarV.a : null;
        if (k2gVar != null) {
            if (bundle == null || !bundle.containsKey("AutofillIntent.EXTRA_DATA")) {
                yif yifVarV2 = v();
                if (yifVarV2 != null) {
                    r3gVar = yifVarV2.b;
                }
            } else {
                r3gVar = (r3g) ((Parcelable) j14.T(bundle, "AutofillIntent.EXTRA_DATA", r3g.class));
            }
            if (r3gVar == null) {
                return;
            }
            t3g t3gVar = this.d;
            if (t3gVar != null) {
                t3gVar.d(r3gVar, new hu5((Object) this, (Object) k2gVar, (byte) 29));
            } else {
                finish();
            }
        }
    }

    public final xu2 u() {
        return (xu2) this.b.getValue();
    }

    public final yif v() {
        return (yif) this.a.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final yif w() {
        Bundle bundle;
        Bundle extras = getIntent().getExtras();
        if (extras == null || (bundle = extras.getBundle("com.opera.android.autofill.EXTRA_BUNDLE")) == null) {
            return null;
        }
        return new yif((k2g) ((Parcelable) j14.T(bundle, "com.opera.android.autofill.EXTRA_PARTITION", k2g.class)), (r3g) ((Parcelable) j14.T(bundle, "com.opera.android.autofill.EXTRA_DATA", r3g.class)), yt7.a((Parcelable) j14.T(bundle, "com.opera.android.autofill.EXTRA_INLINE_SPEC", InlinePresentationSpec.class)), (s3g) ((Parcelable) j14.T(bundle, "com.opera.android.autofill.EXTRA_SAVE_DATA", s3g.class)));
    }

    public final void y(boolean z) {
        k2g k2gVar;
        if (!z) {
            s(new wif(this, (byte) 3));
            return;
        }
        yif yifVarV = v();
        j2g j2gVarA = (yifVarV == null || (k2gVar = yifVarV.a) == null) ? null : k2gVar.a();
        if (j2gVarA == null) {
            return;
        }
        Intent intentPutExtra = new Intent(r().a.a, (Class<?>) AutofillPasswordPickerActivity.class).addFlags(1073741824).addFlags(8388608).setAction("AutofillIntent.Action.ADD_PASSWORD").putExtra("AutofillIntent.EXTRA_DOMAIN", j2gVarA);
        th thVar = this.f;
        if (thVar == null) {
            thVar = null;
        }
        thVar.a(intentPutExtra, (nh) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.lang.String] */
    public final void z(boolean z) {
        String string;
        k2g k2gVar;
        j2g j2gVarA;
        if (!z) {
            s(new wif(this, (byte) 1));
            return;
        }
        yif yifVarV = v();
        if (yifVarV == null || (k2gVar = yifVarV.a) == null || (j2gVarA = k2gVar.a()) == null) {
            string = getString(2132020340);
        } else {
            boolean z2 = j2gVarA.b;
            Object objLoadLabel = j2gVarA.a;
            if (z2) {
                qab qabVar = rab.a;
                try {
                    PackageManager packageManager = getPackageManager();
                    objLoadLabel = packageManager.getApplicationInfo((String) objLoadLabel, 0).loadLabel(packageManager);
                } catch (PackageManager.NameNotFoundException | Exception unused) {
                }
                string = getString(2132020341, objLoadLabel);
            } else {
                string = getString(2132020341, objLoadLabel);
            }
        }
        C(string, new vdf(this, (byte) 2));
    }
}
