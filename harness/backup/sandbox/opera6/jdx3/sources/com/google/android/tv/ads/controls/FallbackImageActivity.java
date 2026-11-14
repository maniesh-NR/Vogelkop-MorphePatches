package com.google.android.tv.ads.controls;

import android.R;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.w;

/* loaded from: classes.dex */
public final class FallbackImageActivity extends fp1 {
    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        msp parcelable;
        super/*androidx.fragment.app.r*/.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        boolean z = false;
        if (extras != null && extras.getBoolean("render_error_message")) {
            z = true;
        }
        Bundle extras2 = getIntent().getExtras();
        if (extras2 == null || (parcelable = extras2.getParcelable("icon_click_fallback_images")) == null) {
            prpVar = null;
        } else {
            for (prp prpVar : parcelable.a) {
                String queryParameter = Uri.parse(prpVar.e).getQueryParameter("atvatc");
                if (queryParameter == null || !queryParameter.equals("1")) {
                    break;
                }
            }
            prpVar = null;
        }
        if (z || prpVar == null) {
            w supportFragmentManager = getSupportFragmentManager();
            a aVarF = u35.f(supportFragmentManager, supportFragmentManager);
            ((ym9) aVarF).r = true;
            aVarF.e(R.id.content, aVarF.d(ErrorMessageFragment.class, (Bundle) null), (String) null, 2);
            aVarF.h();
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("wta_uri", prpVar.e);
        bundle2.putString("wta_alt_text", prpVar.c);
        w supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        a aVar = new a(supportFragmentManager2);
        ((ym9) aVar).r = true;
        aVar.e(R.id.content, aVar.d(WhyThisAdFragment.class, bundle2), (String) null, 2);
        aVar.h();
    }
}
