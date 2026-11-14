package defpackage;

import android.content.Context;
import com.opera.android.FullscreenWebActivity;
import com.opera.android.import_data.ImportChromeBookmarksActivity;

/* loaded from: classes.dex */
public final class z2b extends nz0 {
    public final boolean a;

    public z2b(boolean z) {
        super(false, false);
        this.a = z;
    }

    @Override // defpackage.nz0
    public final String getNegativeButtonText(Context context) {
        return this.a ? context.getString(2132018111) : context.getString(2132019218);
    }

    @Override // defpackage.nz0
    public final String getPositiveButtonText(Context context) {
        if (this.a) {
            return context.getString(2132021985);
        }
        return null;
    }

    @Override // defpackage.nz0
    public final void onPositiveButtonClicked(bz0 bz0Var) {
        int i = ImportChromeBookmarksActivity.b0;
        Context context = bz0Var.getContext();
        context.startActivity(FullscreenWebActivity.e0(context, ImportChromeBookmarksActivity.class, "https://takeout.google.com", new qxh("Google Takeout"), true, lqm.d));
    }
}
