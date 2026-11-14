package com.opera.android.account.auth;

import android.net.Uri;

/* loaded from: classes.dex */
public class DeleteProfileAuthActivity extends EditProfileAuthActivity {
    @Override // com.opera.android.account.auth.EditProfileAuthActivity, defpackage.g53
    public final Uri F0() {
        if (this.R) {
            return dgh.h().buildUpon().appendEncodedPath(vep.h(1)).build();
        }
        return null;
    }
}
