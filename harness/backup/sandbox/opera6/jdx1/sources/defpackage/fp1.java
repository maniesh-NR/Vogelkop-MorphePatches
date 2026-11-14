package defpackage;

import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.r;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class fp1 extends r implements kp1 {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private pp1 mDelegate;
    private Resources mResources;

    public fp1() {
        getSavedStateRegistry().c(DELEGATE_TAG, new dp1(this));
        addOnContextAvailableListener(new ep1(this));
    }

    @Override // defpackage.xd5, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        xp1 xp1Var = (xp1) getDelegate();
        xp1Var.w();
        ((ViewGroup) xp1Var.A.findViewById(R.id.content)).addView(view, layoutParams);
        xp1Var.m.a(xp1Var.l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        xp1 xp1Var = (xp1) getDelegate();
        xp1Var.N = true;
        int i = xp1Var.R;
        if (i == -100) {
            i = pp1.b;
        }
        int iD = xp1Var.D(i, context);
        if (pp1.c(context) && pp1.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (pp1.i) {
                    bwc bwcVar = pp1.c;
                    bwc bwcVarA = pp1.d;
                    if (bwcVar == null) {
                        if (bwcVarA == null) {
                            bwcVarA = bwc.a(c09.A(context));
                            pp1.d = bwcVarA;
                        }
                        if (!bwcVarA.a.a.isEmpty()) {
                            pp1.c = pp1.d;
                        }
                    } else if (!bwcVar.equals(bwcVarA)) {
                        bwc bwcVar2 = pp1.c;
                        pp1.d = bwcVar2;
                        c09.y(context, bwcVar2.a.a.toLanguageTags());
                    }
                }
            } else if (!pp1.f) {
                pp1.a.execute(new pn(context, (byte) 2));
            }
        }
        bwc bwcVarO = xp1.o(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(xp1.t(context, iD, bwcVarO, null, false));
            } catch (IllegalStateException unused) {
            }
        } else if (context instanceof ft5) {
            try {
                ((ft5) context).a(xp1.t(context, iD, bwcVarO, null, false));
            } catch (IllegalStateException unused2) {
            }
        } else if (xp1.i0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i2 = configuration3.mcc;
                    int i3 = configuration4.mcc;
                    if (i2 != i3) {
                        configuration.mcc = i3;
                    }
                    int i4 = configuration3.mnc;
                    int i5 = configuration4.mnc;
                    if (i4 != i5) {
                        configuration.mnc = i5;
                    }
                    LocaleList locales = configuration3.getLocales();
                    LocaleList locales2 = configuration4.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration.setLocales(locales2);
                        configuration.locale = configuration4.locale;
                    }
                    int i6 = configuration3.touchscreen;
                    int i7 = configuration4.touchscreen;
                    if (i6 != i7) {
                        configuration.touchscreen = i7;
                    }
                    int i8 = configuration3.keyboard;
                    int i9 = configuration4.keyboard;
                    if (i8 != i9) {
                        configuration.keyboard = i9;
                    }
                    int i10 = configuration3.keyboardHidden;
                    int i11 = configuration4.keyboardHidden;
                    if (i10 != i11) {
                        configuration.keyboardHidden = i11;
                    }
                    int i12 = configuration3.navigation;
                    int i13 = configuration4.navigation;
                    if (i12 != i13) {
                        configuration.navigation = i13;
                    }
                    int i14 = configuration3.navigationHidden;
                    int i15 = configuration4.navigationHidden;
                    if (i14 != i15) {
                        configuration.navigationHidden = i15;
                    }
                    int i16 = configuration3.orientation;
                    int i17 = configuration4.orientation;
                    if (i16 != i17) {
                        configuration.orientation = i17;
                    }
                    int i18 = configuration3.screenLayout & 15;
                    int i19 = configuration4.screenLayout & 15;
                    if (i18 != i19) {
                        configuration.screenLayout |= i19;
                    }
                    int i20 = configuration3.screenLayout & 192;
                    int i21 = configuration4.screenLayout & 192;
                    if (i20 != i21) {
                        configuration.screenLayout |= i21;
                    }
                    int i22 = configuration3.screenLayout & 48;
                    int i23 = configuration4.screenLayout & 48;
                    if (i22 != i23) {
                        configuration.screenLayout |= i23;
                    }
                    int i24 = configuration3.screenLayout & 768;
                    int i25 = configuration4.screenLayout & 768;
                    if (i24 != i25) {
                        configuration.screenLayout |= i25;
                    }
                    int i26 = configuration3.colorMode & 3;
                    int i27 = configuration4.colorMode & 3;
                    if (i26 != i27) {
                        configuration.colorMode |= i27;
                    }
                    int i28 = configuration3.colorMode & 12;
                    int i29 = configuration4.colorMode & 12;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configuration3.uiMode & 15;
                    int i31 = configuration4.uiMode & 15;
                    if (i30 != i31) {
                        configuration.uiMode |= i31;
                    }
                    int i32 = configuration3.uiMode & 48;
                    int i33 = configuration4.uiMode & 48;
                    if (i32 != i33) {
                        configuration.uiMode |= i33;
                    }
                    int i34 = configuration3.screenWidthDp;
                    int i35 = configuration4.screenWidthDp;
                    if (i34 != i35) {
                        configuration.screenWidthDp = i35;
                    }
                    int i36 = configuration3.screenHeightDp;
                    int i37 = configuration4.screenHeightDp;
                    if (i36 != i37) {
                        configuration.screenHeightDp = i37;
                    }
                    int i38 = configuration3.smallestScreenWidthDp;
                    int i39 = configuration4.smallestScreenWidthDp;
                    if (i38 != i39) {
                        configuration.smallestScreenWidthDp = i39;
                    }
                    int i40 = configuration3.densityDpi;
                    int i41 = configuration4.densityDpi;
                    if (i40 != i41) {
                        configuration.densityDpi = i41;
                    }
                }
            }
            Configuration configurationT = xp1.t(context, iD, bwcVarO, configuration, true);
            ft5 ft5Var = new ft5(context, 2132083946);
            ft5Var.a(configurationT);
            try {
                if (context.getTheme() != null) {
                    ft5Var.getTheme().rebase();
                }
            } catch (NullPointerException unused3) {
            }
            context = ft5Var;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        gc supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.a()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.wd5, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        gc supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.k(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        xp1 xp1Var = (xp1) getDelegate();
        xp1Var.w();
        return (T) xp1Var.l.findViewById(i);
    }

    public pp1 getDelegate() {
        pp1 pp1Var = this.mDelegate;
        if (pp1Var != null) {
            return pp1Var;
        }
        op1 op1Var = pp1.a;
        xp1 xp1Var = new xp1(this, null, this, this);
        this.mDelegate = xp1Var;
        return xp1Var;
    }

    public jc getDrawerToggleDelegate() {
        ((xp1) getDelegate()).getClass();
        return new rbe((byte) 21);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        xp1 xp1Var = (xp1) getDelegate();
        lsk lskVar = xp1Var.p;
        if (lskVar == null) {
            xp1Var.B();
            gc gcVar = xp1Var.o;
            lskVar = new lsk(gcVar != null ? gcVar.e() : xp1Var.k);
            xp1Var.p = lskVar;
        }
        return lskVar;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public gc getSupportActionBar() {
        xp1 xp1Var = (xp1) getDelegate();
        xp1Var.B();
        return xp1Var.o;
    }

    public Intent getSupportParentActivityIntent() {
        return kfo.J(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().b();
    }

    @Override // defpackage.xd5, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) throws PackageManager.NameNotFoundException {
        super.onConfigurationChanged(configuration);
        xp1 xp1Var = (xp1) getDelegate();
        Context context = xp1Var.k;
        if (xp1Var.E && xp1Var.z) {
            xp1Var.B();
            gc gcVar = xp1Var.o;
            if (gcVar != null) {
                gcVar.h();
            }
        }
        AppCompatDrawableManager.a().f(context);
        xp1Var.Q = new Configuration(context.getResources().getConfiguration());
        xp1Var.m(false, false);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(ddl ddlVar) {
        ddlVar.getClass();
        ArrayList arrayList = ddlVar.a;
        fp1 fp1Var = ddlVar.b;
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = kfo.J(this);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(fp1Var.getPackageManager());
            }
            int size = arrayList.size();
            try {
                for (Intent intentK = kfo.K(fp1Var, component); intentK != null; intentK = kfo.K(fp1Var, intentK.getComponent())) {
                    arrayList.add(size, intentK);
                }
                arrayList.add(supportParentActivityIntent);
            } catch (PackageManager.NameNotFoundException e) {
                t3p.n(e);
            }
        }
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public void onLocalesChanged(bwc bwcVar) {
    }

    @Override // androidx.fragment.app.r, defpackage.xd5, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        gc supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.d() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    public void onNightModeChanged(int i) {
    }

    @Override // defpackage.xd5, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((xp1) getDelegate()).w();
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        xp1 xp1Var = (xp1) getDelegate();
        xp1Var.B();
        gc gcVar = xp1Var.o;
        if (gcVar != null) {
            gcVar.q(true);
        }
    }

    public void onPrepareSupportNavigateUpTaskStack(ddl ddlVar) {
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onStart() throws PackageManager.NameNotFoundException {
        super.onStart();
        ((xp1) getDelegate()).m(true, false);
    }

    @Override // androidx.fragment.app.r, android.app.Activity
    public void onStop() {
        super.onStop();
        xp1 xp1Var = (xp1) getDelegate();
        xp1Var.B();
        gc gcVar = xp1Var.o;
        if (gcVar != null) {
            gcVar.q(false);
        }
    }

    @Override // defpackage.kp1
    public void onSupportActionModeFinished(se seVar) {
    }

    @Override // defpackage.kp1
    public void onSupportActionModeStarted(se seVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        ddl ddlVar = new ddl(this);
        onCreateSupportNavigateUpTaskStack(ddlVar);
        onPrepareSupportNavigateUpTaskStack(ddlVar);
        ArrayList arrayList = ddlVar.a;
        if (arrayList.isEmpty()) {
            qp2.n("No intents added to TaskStackBuilder; cannot startActivities");
            return false;
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        ddlVar.b.startActivities(intentArr, null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().k(charSequence);
    }

    @Override // defpackage.kp1
    public se onWindowStartingSupportActionMode(re reVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        gc supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.l()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // defpackage.xd5, android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        getDelegate().h(i);
    }

    @Override // defpackage.xd5, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().i(view);
    }

    @Override // defpackage.xd5, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().j(view, layoutParams);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        xp1 xp1Var = (xp1) getDelegate();
        if (xp1Var.j instanceof Activity) {
            xp1Var.B();
            gc gcVar = xp1Var.o;
            if (gcVar instanceof y1o) {
                qp2.n("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            xp1Var.p = null;
            if (gcVar != null) {
                gcVar.i();
            }
            xp1Var.o = null;
            if (toolbar != null) {
                Object obj = xp1Var.j;
                usl uslVar = new usl(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : xp1Var.q, xp1Var.m);
                xp1Var.o = uslVar;
                xp1Var.m.b = uslVar.c;
                if (!toolbar.Q) {
                    toolbar.Q = true;
                    toolbar.G();
                }
            } else {
                xp1Var.m.b = null;
            }
            xp1Var.b();
        }
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((xp1) getDelegate()).S = i;
    }

    public se startSupportActionMode(re reVar) {
        return getDelegate().l(reVar);
    }

    @Override // androidx.fragment.app.r
    public void supportInvalidateOptionsMenu() {
        getDelegate().b();
    }

    public void supportNavigateUpTo(Intent intent) {
        navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().g(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return shouldUpRecreateTask(intent);
    }
}
