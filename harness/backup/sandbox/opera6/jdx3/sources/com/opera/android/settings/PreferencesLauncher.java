package com.opera.android.settings;

import android.content.Context;
import defpackage.mdb;

/* loaded from: classes.dex */
public final class PreferencesLauncher {
    public static void showAddressSettings() {
        Context context = t8.a;
        context.startActivity(mdb.b(context).setAction("com.opera.android.settings.AUTOFILL_ADDRESS_SETTING"));
    }

    public static void showCardSettings() {
        Context context = t8.a;
        context.startActivity(mdb.b(context).setAction("com.opera.android.settings.AUTOFILL_CARD_SETTING"));
    }

    public static void showPasswordSettings() {
        Context context = t8.a;
        context.startActivity(mdb.b(context).setAction("com.opera.android.settings.PASSWORD_SETTING"));
    }
}
