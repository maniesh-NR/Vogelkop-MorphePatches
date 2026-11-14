package defpackage;

import com.opera.android.import_data.ImportChromeBookmarksActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class i2b implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ImportChromeBookmarksActivity b;

    public /* synthetic */ i2b(ImportChromeBookmarksActivity importChromeBookmarksActivity, byte b) {
        this.a = b;
        this.b = importChromeBookmarksActivity;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, com.opera.android.import_data.ImportChromeBookmarksActivity, l2b] */
    public final Object invoke() {
        byte b = this.a;
        ?? r1 = this.b;
        switch (b) {
            case 0:
                int i = ImportChromeBookmarksActivity.b0;
                r1.B0();
                r1.finish();
                break;
            default:
                int i2 = ImportChromeBookmarksActivity.b0;
                r1.B0();
                r1.finish();
                break;
        }
        return Unit.a;
    }
}
